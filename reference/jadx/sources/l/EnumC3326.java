package l;

/* JADX INFO: renamed from: l.ۗۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3326 {
    BUILD((byte) 0, "build"),
    RUNTIME((byte) 1, "runtime"),
    SYSTEM((byte) 2, "system");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte f10881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f10882;

    EnumC3326(byte b, String str) {
        this.f10881 = b;
        this.f10882 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3326 m10958(byte b) {
        if (b == 0) {
            return BUILD;
        }
        if (b == 1) {
            return RUNTIME;
        }
        if (b == 2) {
            return SYSTEM;
        }
        throw new RuntimeException(C13645.m33382(b, "Invalid annotation visibility value: "));
    }
}
