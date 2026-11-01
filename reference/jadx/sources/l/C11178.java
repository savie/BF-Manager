package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11178 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f37867;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f37868;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f37869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object[] f37870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f37871;

    public C11178(boolean z, String str, int i, String str2, Object[] objArr) {
        this.f37869 = z;
        this.f37868 = str;
        this.f37867 = i;
        this.f37871 = str2;
        this.f37870 = objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11178 m28121(String str) {
        return new C11178(true, str, 0, "", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11178 m28120(int i, Object... objArr) {
        return new C11178(false, "", i, "", objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11178 m28119() {
        return new C11178(false, "", R.string.MT_Protector, "pairing_code_invalid", new Object[0]);
    }
}
