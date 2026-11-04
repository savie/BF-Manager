package l;

/* JADX INFO: renamed from: l.ۢ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9747 {
    UNKNOWN,
    UNINIT,
    NORMAL;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9747 m25373(int[] iArr, boolean z) {
        if (z) {
            return UNKNOWN;
        }
        if (iArr != C0799.f2839) {
            return NORMAL;
        }
        return UNINIT;
    }
}
