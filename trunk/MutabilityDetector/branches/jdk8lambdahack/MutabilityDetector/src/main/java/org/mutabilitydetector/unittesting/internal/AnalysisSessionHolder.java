/*
 *    Copyright (c) 2008-2011 Graham Allan
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.mutabilitydetector.unittesting.internal;

import org.mutabilitydetector.AnalysisResult;
import org.mutabilitydetector.AnalysisSession;
import org.mutabilitydetector.ThreadUnsafeAnalysisSession;
import org.mutabilitydetector.locations.Dotted;

public final class AnalysisSessionHolder {
//    private static final AnalysisSession assertionAnalysisSession = ThreadUnsafeAnalysisSession.createWithCurrentClassPath();
    private static final AnalysisSession assertionAnalysisSession = ThreadUnsafeAnalysisSession.tempCreateWithVerifier();

    public static AnalysisResult analysisResultFor(Class<?> from) {
        return assertionAnalysisSession.resultFor(Dotted.fromClass(from)).result;
    }
}
