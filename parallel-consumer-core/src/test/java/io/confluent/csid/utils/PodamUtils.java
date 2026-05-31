package io.confluent.csid.utils;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.lang.reflect.Type;

public class PodamUtils {

  public static final PodamFactoryImpl PODAM_FACTORY = new PodamFactoryImpl();

  public static <T> T createInstance(Class<T> clazz, Type... genericTypeArgs) {
    return PODAM_FACTORY.manufacturePojo(clazz, genericTypeArgs);
  }

}
