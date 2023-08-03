package org.entur.protobuf.mapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import uk.org.siri.siri20.EstimatedCall;
import uk.org.siri.siri20.EstimatedTimetableDeliveryStructure;
import uk.org.siri.siri20.EstimatedVehicleJourney;
import uk.org.siri.siri20.EstimatedVersionFrameStructure;
import uk.org.siri.siri20.HalfOpenTimestampOutputRangeStructure;
import uk.org.siri.siri20.PtSituationElement;
import uk.org.siri.siri20.RecordedCall;
import uk.org.siri.siri20.Siri;
import uk.org.siri.siri20.SituationExchangeDeliveryStructure;
import uk.org.siri.siri20.SituationSourceStructure;
import uk.org.siri.siri20.VehicleActivityStructure;
import uk.org.siri.siri20.VehicleMonitoringDeliveryStructure;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.time.ZoneOffset;

public class Helper {

    private static JAXBContext jaxbContext;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(Siri.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    static String formatXml(Siri siri, Boolean format) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);

        StringWriter writer = new StringWriter();
        marshaller.marshal(siri, writer);

        return writer.toString();
    }

    static Siri changeTimezoneOnDates(Siri siri) {

        if (siri.getServiceDelivery().getResponseTimestamp() != null) {
            siri.getServiceDelivery().setResponseTimestamp(siri.getServiceDelivery().getResponseTimestamp().withZoneSameInstant(ZoneOffset.UTC));
        }

        if (siri.getServiceDelivery().getSituationExchangeDeliveries() != null) {
            for (SituationExchangeDeliveryStructure sx : siri.getServiceDelivery().getSituationExchangeDeliveries()) {
                if (sx.getResponseTimestamp() != null) {
                    sx.setResponseTimestamp(sx.getResponseTimestamp().withZoneSameInstant(ZoneOffset.UTC));
                }

                if (sx.getSituations() != null && sx.getSituations().getPtSituationElements() != null) {
                    for (PtSituationElement situation : sx.getSituations().getPtSituationElements()) {
                        if (situation.getCreationTime() != null) {
                            situation.setCreationTime(situation.getCreationTime().withZoneSameInstant(ZoneOffset.UTC));
                        }

                        if (situation.getSource() != null && situation.getSource().getTimeOfCommunication() != null) {
                            SituationSourceStructure source = situation.getSource();
                            source.setTimeOfCommunication(source.getTimeOfCommunication().withZoneSameInstant(ZoneOffset.UTC));
                        }
                        if (situation.getValidityPeriods() != null && !situation.getValidityPeriods().isEmpty()) {
                            for (HalfOpenTimestampOutputRangeStructure period : situation.getValidityPeriods()) {
                                if (period.getStartTime() != null) {
                                    period.setStartTime(period.getStartTime().withZoneSameInstant(ZoneOffset.UTC));
                                }
                                if (period.getEndTime() != null) {
                                    period.setEndTime(period.getEndTime().withZoneSameInstant(ZoneOffset.UTC));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (siri.getServiceDelivery().getEstimatedTimetableDeliveries() != null) {
            for (EstimatedTimetableDeliveryStructure et : siri.getServiceDelivery().getEstimatedTimetableDeliveries()) {
                if (et.getResponseTimestamp() != null) {
                    et.setResponseTimestamp(et.getResponseTimestamp().withZoneSameInstant(ZoneOffset.UTC));
                }
                if (et.getEstimatedJourneyVersionFrames() != null) {
                    for (EstimatedVersionFrameStructure evf : et.getEstimatedJourneyVersionFrames()) {
                        if (evf.getRecordedAtTime() != null) {
                            evf.setRecordedAtTime(evf.getRecordedAtTime().withZoneSameInstant(ZoneOffset.UTC));
                        }
                        if (evf.getEstimatedVehicleJourneies() != null) {
                            for (EstimatedVehicleJourney evj : evf.getEstimatedVehicleJourneies()) {
                                if (evj.getRecordedAtTime() != null) {
                                    evj.setRecordedAtTime(evj.getRecordedAtTime().withZoneSameInstant(ZoneOffset.UTC));
                                }
                                if (evj.getRecordedCalls() != null && evj.getRecordedCalls().getRecordedCalls() != null) {
                                    for (RecordedCall recordedCall : evj.getRecordedCalls().getRecordedCalls()) {
                                        if (recordedCall.getAimedArrivalTime() != null) {
                                            recordedCall.setAimedArrivalTime(recordedCall.getAimedArrivalTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (recordedCall.getActualArrivalTime() != null) {
                                            recordedCall.setActualArrivalTime(recordedCall.getActualArrivalTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (recordedCall.getAimedDepartureTime() != null) {
                                            recordedCall.setAimedDepartureTime(recordedCall.getAimedDepartureTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (recordedCall.getActualDepartureTime() != null) {
                                            recordedCall.setActualDepartureTime(recordedCall.getActualDepartureTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                    }
                                }
                                if (evj.getEstimatedCalls() != null && evj.getEstimatedCalls().getEstimatedCalls() != null) {
                                    for (EstimatedCall estimatedCall : evj.getEstimatedCalls().getEstimatedCalls()) {
                                        if (estimatedCall.getAimedArrivalTime() != null) {
                                            estimatedCall.setAimedArrivalTime(estimatedCall.getAimedArrivalTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (estimatedCall.getExpectedArrivalTime() != null) {
                                            estimatedCall.setExpectedArrivalTime(estimatedCall.getExpectedArrivalTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (estimatedCall.getAimedDepartureTime() != null) {
                                            estimatedCall.setAimedDepartureTime(estimatedCall.getAimedDepartureTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                        if (estimatedCall.getExpectedDepartureTime() != null) {
                                            estimatedCall.setExpectedDepartureTime(estimatedCall.getExpectedDepartureTime().withZoneSameInstant(ZoneOffset.UTC));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (siri.getServiceDelivery().getVehicleMonitoringDeliveries() != null) {
            for (VehicleMonitoringDeliveryStructure vm : siri.getServiceDelivery().getVehicleMonitoringDeliveries()) {
                if (vm.getResponseTimestamp() != null) {
                    vm.setResponseTimestamp(vm.getResponseTimestamp().withZoneSameInstant(ZoneOffset.UTC));
                }
                if (vm.getVehicleActivities() != null) {
                    for (VehicleActivityStructure activity : vm.getVehicleActivities()) {
                        if (activity.getRecordedAtTime() != null) {
                            activity.setRecordedAtTime(activity.getRecordedAtTime().withZoneSameInstant(ZoneOffset.UTC));
                        }
                        if (activity.getValidUntilTime() != null) {
                            activity.setValidUntilTime(activity.getValidUntilTime().withZoneSameInstant(ZoneOffset.UTC));
                        }
                        if (activity.getMonitoredVehicleJourney() != null) {
                            VehicleActivityStructure.MonitoredVehicleJourney mvj = activity.getMonitoredVehicleJourney();
                            if (mvj.getOriginAimedDepartureTime() != null) {
                                mvj.setOriginAimedDepartureTime(mvj.getOriginAimedDepartureTime().withZoneSameInstant(ZoneOffset.UTC));
                            }
                            if (mvj.getDestinationAimedArrivalTime() != null) {
                                mvj.setDestinationAimedArrivalTime(mvj.getDestinationAimedArrivalTime().withZoneSameInstant(ZoneOffset.UTC));
                            }

                        }
                    }
                }
            }
        }
        return siri;
    }

    static String readFile(String path) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        byte[] contents = new byte[(int)raf.length()];
        raf.readFully(contents);
        return new String(contents);
    }
    static void writeFile(String path, String contents) throws IOException {
        final File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile raf = new RandomAccessFile(path, "rw");
        raf.write(contents.getBytes());
        raf.close();
    }


}
