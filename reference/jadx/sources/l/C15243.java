package l;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11AO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15243 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m36593(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36586(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m36588((RuntimeException) nullPointerException, C15243.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36587(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m36588((RuntimeException) nullPointerException, C15243.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m36592(String str) {
        C1777 c1777 = new C1777(C14442.m34865("lateinit property ", str, " has not been initialized"));
        m36588((RuntimeException) c1777, C15243.class.getName());
        throw c1777;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m36591(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m36588((RuntimeException) nullPointerException, C15243.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36585(View view) {
        if (view != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m36584("view"));
        m36588((RuntimeException) illegalArgumentException, C15243.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m36590(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m36584(str));
        m36588((RuntimeException) nullPointerException, C15243.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36584(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C15243.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM10406 = C3188.m10406("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM10406.append(str);
        return sbM10406.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36589(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36588(RuntimeException runtimeException, String str) {
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
