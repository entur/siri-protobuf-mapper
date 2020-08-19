package org.entur.protobuf.mapper.siri;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EnumerationMapperTest {

    @Test
    public void testMapperWithReflection() throws Exception {
        final Method[] methods = EnumerationMapper.class.getDeclaredMethods();
        List<String> errors = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().equals("map")) {
                if (method.getParameterCount() == 1) {
                    final Parameter parameter = method.getParameters()[0];

                    final Object[] declaredEnumValues = parameter.getType().getEnumConstants();
                    for (Object enumValue : declaredEnumValues) {
                        if (testValue(enumValue)) {
                            final Object mappedEnum = method.invoke(new EnumerationMapper(), enumValue);
                            if (mappedEnum != null) {
                                final Method reverseMapper = EnumerationMapper.class.getDeclaredMethod("map", mappedEnum.getClass());
                                final Object reverseMapped = reverseMapper.invoke(new EnumerationMapper(), mappedEnum);

                                if (testValue(reverseMapped) && !enumValue.equals(reverseMapped)) {
                                    errors.add("\nEnum " + parameter.getType().getName() + " not correctly mapped. Expected " + enumValue + ", was " + reverseMapped);
                                }
                            }
                        }
                    }

                }
            }
        }
        assertTrue(errors.toString(), errors.isEmpty());
    }

    List<String> ignoredEnumValuePattern = Arrays.asList("UNDEFINED", "UNRECOGNIZED", "PTI_");
    private boolean testValue(Object enumValue) {
        if (enumValue == null) {
            return false;
        }
        for (String s : ignoredEnumValuePattern) {
            if (enumValue.toString().startsWith(s) | enumValue.toString().endsWith(s)) {
                return false;
            }
        }
        return true;
    }
}
