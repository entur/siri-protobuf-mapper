package org.entur.protobuf.mapper.siri;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommonMapperTest {

    @Test
    public void testDurationMapping() {

        java.time.Duration duration_1m = java.time.Duration.parse("PT60S");
        java.time.Duration duration_60s = java.time.Duration.parse("PT1M");

        assertEquals(duration_1m, duration_60s);

        assertEquals(60, CommonMapper.map(duration_1m).getSeconds());

        assertEquals(60, CommonMapper.map(duration_60s).getSeconds());
    }

    @Test
    public void testNegativeDurationMapping() {

        java.time.Duration duration_neg_1m = java.time.Duration.parse("-PT60S");
        java.time.Duration duration_neg_60s = java.time.Duration.parse("-PT1M");

        assertEquals(duration_neg_1m, duration_neg_60s);

        assertEquals(-60, CommonMapper.map(duration_neg_1m).getSeconds());

        assertEquals(-60, CommonMapper.map(duration_neg_60s).getSeconds());
    }
}
