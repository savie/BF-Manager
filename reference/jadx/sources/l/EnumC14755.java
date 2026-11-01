package l;

/* JADX INFO: renamed from: l.ܳ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I81O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14755 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f48267;

    EnumC14755(long j) {
        this.f48267 = j;
    }

    public long getValue() {
        return this.f48267;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14755 m35374(long j) {
        EnumC14755[] enumC14755ArrValues = values();
        for (int i = 0; i < enumC14755ArrValues.length; i++) {
            if (enumC14755ArrValues[i].getValue() == j) {
                return enumC14755ArrValues[i];
            }
        }
        throw new IllegalArgumentException(C15489.m37074(j, "Unsupported FileSection Type "));
    }
}
