package l;

/* JADX INFO: renamed from: l.ۗ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I81O */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3663 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f12538;

    EnumC3663(long j) {
        this.f12538 = j;
    }

    public long getValue() {
        return this.f12538;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3663 m11908(long j) {
        EnumC3663[] enumC3663ArrValues = values();
        for (int i = 0; i < enumC3663ArrValues.length; i++) {
            if (enumC3663ArrValues[i].getValue() == j) {
                return enumC3663ArrValues[i];
            }
        }
        throw new IllegalArgumentException(C24770.m55292(j, "Unsupported FileSection Type "));
    }
}
