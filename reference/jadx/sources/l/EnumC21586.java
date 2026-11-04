package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC21586 {
    SUCCESS(R.string.MT_Protector, new Object[0]),
    FAIL(R.string.MT_Protector, new Object[0]),
    FAIL_DIFFERENT_V1_V2(R.string.MT_Protector, "V1", "V2"),
    FAIL_DIFFERENT_V1_V3(R.string.MT_Protector, "V1", "V3"),
    FAIL_DIFFERENT_V1_V31(R.string.MT_Protector, "V1", "V3.1"),
    FAIL_DIFFERENT_V2_V3(R.string.MT_Protector, "V2", "V3"),
    FAIL_DIFFERENT_V2_V31(R.string.MT_Protector, "V2", "V3.1"),
    FAIL_DIFFERENT_V3_V31(R.string.MT_Protector, "V3", "V3.1"),
    FAIL_V1(R.string.MT_Protector, "V1"),
    FAIL_V2(R.string.MT_Protector, "V2"),
    FAIL_V3(R.string.MT_Protector, "V3"),
    FAIL_V31(R.string.MT_Protector, "V3.1"),
    FAIL_MISSING_V1(R.string.MT_Protector, "V1"),
    FAIL_MISSING_V2(R.string.MT_Protector, "V2"),
    FAIL_MISSING_V3(R.string.MT_Protector, "V3"),
    FAIL_MISSING_V31(R.string.MT_Protector, "V3.1");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f68967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68968;

    EnumC21586(int i, Object... objArr) {
        this.f68968 = i;
        this.f68967 = objArr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m49108() {
        return this == SUCCESS;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m49107() {
        return C21576.m49059(this.f68968, this.f68967);
    }
}
