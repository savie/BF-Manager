package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes2.dex */
public final class C4013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13710 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Function f13712;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23405 f13713;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Set f13711 = Collections.newSetFromMap(new ConcurrentMapC17249());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Charset f13715 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f13714 = {77, 84, 73, 79};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12976(Throwable th) throws IOException {
        Throwable cause;
        if ((th instanceof ExecutionException) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new IOException(th.getMessage(), th);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC23405 m12986() {
        f13713.getClass();
        return f13713;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m12983() {
        return f13713 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12978(InterfaceC23405 interfaceC23405) {
        f13713 = interfaceC23405;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12977(Function function) {
        f13712 = function;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m12981(String str) {
        Function function = f13712;
        return function != null ? (String) function.apply(str) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12979(String str) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte m12984(String str) {
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
