package l;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 11AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13465 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m32959(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32962(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m32964((RuntimeException) nullPointerException, C13465.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32963(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m32964((RuntimeException) nullPointerException, C13465.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32968(String str) {
        C10144 c10144 = new C10144(C16523.m38890("lateinit property ", str, " has not been initialized"));
        m32964((RuntimeException) c10144, C13465.class.getName());
        throw c10144;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32967(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m32964((RuntimeException) nullPointerException, C13465.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32961(View view) {
        if (view != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m32960("view"));
        m32964((RuntimeException) illegalArgumentException, C13465.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m32966(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m32960(str));
        m32964((RuntimeException) nullPointerException, C13465.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32960(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C13465.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM30515 = C12278.m30515("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM30515.append(str);
        return sbM30515.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32965(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32964(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
