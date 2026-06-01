package io.confluent.parallelconsumer.offsets;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import io.confluent.parallelconsumer.internal.InternalException;
import lombok.experimental.StandardException;

/*-
 * Error decoding offsets
 *
 * TODO should extend java.lang.Error ?
 *
 * @author Antony Stubbs
 */
@StandardException
public class OffsetDecodingError extends InternalException {
}
