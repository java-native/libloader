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

package io.github.java_native.libloader.provider;

import io.github.java_native.libloader.internal.Nullable;
import io.github.java_native.libloader.systems.AbstractOsNameArchBitnessMatchingSystem;
import io.github.java_native.libloader.systems.Bitness;
import io.github.java_native.libloader.systems.Endianess;
import io.github.java_native.libloader.systems.SystemDefinitionConstants;
import java.util.Collections;
import java.util.List;

/**
 * Test for service loader mechanism.
 */
public class BogoOs extends AbstractOsNameArchBitnessMatchingSystem {

    @Override
    public String getOsName() {
        return "bogo_os";
    }

    @Override
    public String getArchitecture() {
        return "i386";
    }

    @Override
    public Bitness getBitness() {
        return Bitness._16;
    }

    @Override
    public Endianess getEndianess() {
        return Endianess.BIG;
    }

    @Override
    public @Nullable
    String getQualifier() {
        return null;
    }

    @Override
    public List<String> getMatchingArchitectures() {
        return SystemDefinitionConstants.getArchX8632();
    }

    @Override
    public String getLibraryPrefix() {
        return "library_";
    }

    @Override
    public List<String> getLibrarySuffixes() {
        return Collections.singletonList(".dynlib");
    }


}
