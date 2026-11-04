package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56156;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object[] f56157;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f56158;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f56159;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f56160;

    public C17233(boolean z, String str, int i, String str2, Object[] objArr) {
        this.f56158 = z;
        this.f56156 = str;
        this.f56160 = i;
        this.f56159 = str2;
        this.f56157 = objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17233 m40474(String str) {
        return new C17233(true, str, 0, "", new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17233 m40473(int i, Object... objArr) {
        return new C17233(false, "", i, "", objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17233 m40472() {
        return new C17233(false, "", R.string.MT_Protector, "pairing_code_invalid", new Object[0]);
    }
}
