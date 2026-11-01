package org.bouncycastle.util.test;

import l.C12441;
import l.C22697;
import l.C9023;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTestResult implements TestResult {
    public static final String SEPARATOR = Strings.lineSeparator();
    public Throwable exception;
    public String message;
    public boolean success;

    public SimpleTestResult(boolean z, String str) {
        this.success = z;
        this.message = str;
    }

    public SimpleTestResult(boolean z, String str, Throwable th) {
        this.success = z;
        this.message = str;
        this.exception = th;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder sbM23356 = C9023.m23356(str);
        String str2 = SEPARATOR;
        sbM23356.append(str2);
        sbM23356.append("Expected: ");
        sbM23356.append(obj);
        sbM23356.append(str2);
        sbM23356.append("Found   : ");
        sbM23356.append(obj2);
        return failed(test, sbM23356.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder sbM30914 = C12441.m30914(str, " failing ", str2);
        String str5 = SEPARATOR;
        ASN1BMPString$$ExternalSyntheticOutline0.m(sbM30914, str5, "    expected: ", str3, str5);
        return C22697.m50267(sbM30914, "    got     : ", str4);
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }
}
