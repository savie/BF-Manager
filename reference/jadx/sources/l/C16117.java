package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16117 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f52103;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f52104;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f52105;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f52106;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21055 f52107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC10591 f52108;

    public C16117(boolean z, EnumC10591 enumC10591, int i, String str, Object[] objArr, C21055 c21055) {
        this.f52104 = z;
        this.f52108 = enumC10591;
        this.f52105 = i;
        this.f52106 = str;
        this.f52103 = objArr;
        this.f52107 = c21055;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16117 m38157(C21055 c21055) {
        return new C16117(true, EnumC10591.OK, 0, "", new Object[0], c21055);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16117 m38156(EnumC10591 enumC10591, int i, Object... objArr) {
        return new C16117(false, enumC10591, i, "", objArr, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16117 m38155() {
        return new C16117(false, EnumC10591.UNAUTHORIZED, R.string.MT_Protector, "auth_clock_skew", new Object[0], null);
    }
}
