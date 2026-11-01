package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C19812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63596 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19106 f63597;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Function f63600;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Set f63598 = Collections.newSetFromMap(new ConcurrentMapC13783());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Charset f63595 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63599 = {77, 84, 73, 79};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45046(Throwable th) throws IOException {
        Throwable cause;
        if ((th instanceof ExecutionException) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new IOException(th.getMessage(), th);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19106 m45045() {
        f63597.getClass();
        return f63597;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m45051() {
        return f63597 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45048(InterfaceC19106 interfaceC19106) {
        f63597 = interfaceC19106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45047(Function function) {
        f63600 = function;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m45052(String str) {
        Function function = f63600;
        return function != null ? (String) function.apply(str) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45049(String str) {
        str.getClass();
        switch (str) {
            case "a":
            case "w":
            case "rw":
            case "wa":
            case "wt":
            case "rwt":
                return true;
            case "r":
                return false;
            default:
                throw new IllegalArgumentException("Mode: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte m45054(String str) {
        str.getClass();
        switch (str) {
            case "a":
            case "wa":
                return (byte) 2;
            case "r":
                return (byte) 0;
            case "w":
            case "wt":
                return (byte) 1;
            case "rw":
                return (byte) 3;
            case "rwt":
                return (byte) 4;
            default:
                throw new IllegalArgumentException("Mode: ".concat(str));
        }
    }
}
