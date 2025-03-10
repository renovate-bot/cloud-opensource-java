/*
 * Copyright 2020 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tools.opensource.classpath;

/**
 * {@link LinkageCheckerMain} throws this exception when it finds linkage errors.
 *
 * <p>The caller of the tool can tell the existence of linkage errors by checking the exit status of
 * the {@link LinkageCheckerMain}.
 */
public final class LinkageCheckResultException extends Exception {
  LinkageCheckResultException(int linkageErrorCount) {
    super(
        "Found "
            + (linkageErrorCount == 1
                ? "1 linkage error"
                : (linkageErrorCount + " linkage errors")));
  }
}
