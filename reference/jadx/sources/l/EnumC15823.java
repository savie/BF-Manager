package l;

/* JADX INFO: renamed from: l.ܶۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6IB */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15823 {
    AUTO,
    RESTRUCTURE,
    SIMPLE,
    FALLBACK;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m37753() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        throw new RuntimeException("Unexpected decompilation mode: " + this);
    }
}
