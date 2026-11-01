package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۗܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3278 implements InterfaceC1411, InterfaceC3009 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f12150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19000 f12152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12153;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6101 f12154;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15690 f12155;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f12158;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri f12159;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2510 f12160;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22176 f12161;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f12162;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0954 f12151 = new C0954();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f12156 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f12149 = C13863.m33700();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12257 f12157 = m9769(0);

    public C3278(C2510 c2510, Uri uri, InterfaceC15785 interfaceC15785, C15005 c15005, InterfaceC15690 interfaceC15690, C22176 c22176) {
        this.f12160 = c2510;
        this.f12159 = uri;
        this.f12152 = new C19000(interfaceC15785);
        this.f12154 = c15005;
        this.f12155 = interfaceC15690;
        this.f12161 = c22176;
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ܰ */
    public final void mo2335() {
        this.f12153 = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012e */
    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2330() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3278.mo2330():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9774(C2460 c2460) {
        long jMax;
        if (!this.f12158) {
            jMax = this.f12162;
        } else {
            jMax = Math.max(this.f12160.m7654(true), this.f12162);
        }
        int iM7503 = c2460.m7503();
        InterfaceC8011 interfaceC8011 = this.f12150;
        interfaceC8011.getClass();
        interfaceC8011.mo8112(iM7503, c2460);
        interfaceC8011.mo8114(jMax, 1, iM7503, 0, null);
        this.f12158 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12257 m9769(long j) {
        C16490 c16490 = new C16490();
        c16490.m38756(this.f12159);
        c16490.m38762(j);
        int i = C2510.f9925;
        c16490.m38757((String) null);
        c16490.m38754(6);
        c16490.m38758(C2510.f9926);
        return c16490.m38753();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9771(C3278 c3278, long j, long j2) {
        c3278.f12151.f3770 = j;
        c3278.f12162 = j2;
        c3278.f12156 = true;
        c3278.f12158 = false;
    }
}
