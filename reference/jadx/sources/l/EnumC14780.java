package l;

/* JADX INFO: renamed from: l.ܳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14780 {
    BUILD((byte) 0, "build"),
    RUNTIME((byte) 1, "runtime"),
    SYSTEM((byte) 2, "system");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte f48329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f48330;

    EnumC14780(byte b, String str) {
        this.f48329 = b;
        this.f48330 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14780 m35419(byte b) {
        if (b == 0) {
            return BUILD;
        }
        if (b == 1) {
            return RUNTIME;
        }
        if (b == 2) {
            return SYSTEM;
        }
        throw new RuntimeException(C8479.m22141(b, "Invalid annotation visibility value: "));
    }
}
