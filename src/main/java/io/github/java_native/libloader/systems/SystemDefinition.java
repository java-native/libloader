/*
 * Copyright (c) 2020 the 'java-native' development team
 *         https://github.com/java-native/
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

package io.github.java_native.libloader.systems;

import java.util.List;

public interface SystemDefinition extends SystemProperties {


    List<String> getMatchingArchitectures();

    /**
     * Returns the library prefix, e.g. {@code lib} on Linux.
     *
     * @return a prefix or an empty String, but never {@code null}.
     */
    String getLibraryPrefix();

    /**
     * Returns the potential library suffix, e.g. {@code .so} on Linux.
     *
     * <p>Usually this values are equal to the file extension.</p>
     *
     * @return a suffix or an empty String, but never {@code null}.
     */
    List<String> getLibrarySuffixes();

    boolean matches(SystemProperties currentSystemProperties);

}
