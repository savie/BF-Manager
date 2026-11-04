package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14995 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f48997;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f48998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC21667 f48999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f49000;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19471 f49001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f49002;

    public C14995(boolean z, EnumC21667 enumC21667, int i, String str, Object[] objArr, C19471 c19471) {
        this.f48997 = z;
        this.f48999 = enumC21667;
        this.f49000 = i;
        this.f48998 = str;
        this.f49002 = objArr;
        this.f49001 = c19471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14995 m36101(C19471 c19471) {
        return new C14995(true, EnumC21667.OK, 0, "", new Object[0], c19471);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14995 m36102(EnumC21667 enumC21667, int i, Object... objArr) {
        return new C14995(false, enumC21667, i, "", objArr, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14995 m36100() {
        return new C14995(false, EnumC21667.UNAUTHORIZED, R.string.MT_Protector, "auth_clock_skew", new Object[0], null);
    }
}
