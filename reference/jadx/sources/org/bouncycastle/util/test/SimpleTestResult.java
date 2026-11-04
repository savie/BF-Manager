package org.bouncycastle.util.test;

import l.C10732;
import l.C22783;
import l.C4794;
import l.C8947;
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
        StringBuilder sbM27333 = C10732.m27333(str);
        String str2 = SEPARATOR;
        sbM27333.append(str2);
        sbM27333.append("Expected: ");
        sbM27333.append(obj);
        sbM27333.append(str2);
        sbM27333.append("Found   : ");
        sbM27333.append(obj2);
        return failed(test, sbM27333.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder sbM51387 = C22783.m51387(str, " failing ", str2);
        String str5 = SEPARATOR;
        C4794.m14774(sbM51387, str5, "    expected: ", str3, str5);
        return C8947.m23910(sbM51387, "    got     : ", str4);
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
