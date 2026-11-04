package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes4.dex */
public class C12573 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C12573 f40367 = new C12573();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String[] f40368 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f40369 = "identity";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double mo31288(double d) {
        return d;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double mo31289(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12573 m31287(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C20778(str);
        }
        switch (str) {
            case "accelerate":
                return new C20778("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C20778("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new C20778("cubic(1, 1, 0, 0)");
            case "standard":
                return new C20778("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f40368);
                return f40367;
        }
    }

    public final String toString() {
        return this.f40369;
    }
}
