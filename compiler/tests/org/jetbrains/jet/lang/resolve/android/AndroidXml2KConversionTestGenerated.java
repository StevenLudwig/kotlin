/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.android;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.lang.resolve.android.AbstractAndroidXml2KConversionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({AndroidXml2KConversionTestGenerated.Simple.class, AndroidXml2KConversionTestGenerated.Exceptions.class})
public class AndroidXml2KConversionTestGenerated extends AbstractAndroidXml2KConversionTest {
    @TestMetadata("compiler/testData/android/converter/simple")
    public static class Simple extends AbstractAndroidXml2KConversionTest {
        public void testAllFilesPresentInSimple() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/android/converter/simple"), Pattern.compile("^([^\\.]+)$"), false);
        }
        
        @TestMetadata("fqNameInAttr")
        public void testFqNameInAttr() throws Exception {
            doTest("compiler/testData/android/converter/simple/fqNameInAttr/");
        }
        
        @TestMetadata("fqNameInTag")
        public void testFqNameInTag() throws Exception {
            doTest("compiler/testData/android/converter/simple/fqNameInTag/");
        }
        
        @TestMetadata("multiFile")
        public void testMultiFile() throws Exception {
            doTest("compiler/testData/android/converter/simple/multiFile/");
        }
        
        @TestMetadata("noIds")
        public void testNoIds() throws Exception {
            doTest("compiler/testData/android/converter/simple/noIds/");
        }
        
        @TestMetadata("singleFile")
        public void testSingleFile() throws Exception {
            doTest("compiler/testData/android/converter/simple/singleFile/");
        }
        
    }
    
    @TestMetadata("compiler/testData/android/converter/exceptions")
    public static class Exceptions extends AbstractAndroidXml2KConversionTest {
        public void testAllFilesPresentInExceptions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/android/converter/exceptions"), Pattern.compile("^([^\\.]+)$"), false);
        }
        
        @TestMetadata("noManifest")
        public void testNoManifest() throws Exception {
            doNoManifestTest("compiler/testData/android/converter/exceptions/noManifest/");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("AndroidXml2KConversionTestGenerated");
        suite.addTestSuite(Simple.class);
        suite.addTestSuite(Exceptions.class);
        return suite;
    }
}
