package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes.dex */
public class C23188 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C23188 f75243 = new C23188();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String[] f75244 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f75245 = "identity";

    /* JADX INFO: renamed from: ۙ */
    public double mo18708(double d) {
        return d;
    }

    /* JADX INFO: renamed from: ܰ */
    public double mo18709(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23188 m51213(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C6959(str);
        }
        switch (str) {
            case "accelerate":
                return new C6959("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C6959("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new C6959("cubic(1, 1, 0, 0)");
            case "standard":
                return new C6959("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f75244);
                return f75243;
        }
    }

    public final String toString() {
        return this.f75245;
    }
}
