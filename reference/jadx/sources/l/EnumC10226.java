package l;

/* JADX INFO: renamed from: l.ۤۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10226 {
    UNKNOWN,
    UNINIT,
    NORMAL;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10226 m26007(int[] iArr, boolean z) {
        if (z) {
            return UNKNOWN;
        }
        if (iArr != C7403.f24595) {
            return NORMAL;
        }
        return UNINIT;
    }
}
