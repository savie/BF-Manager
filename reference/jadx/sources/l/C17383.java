package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes5.dex */
public final class C17383 implements InterfaceC9354 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2565 f55327;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f55328;

    public C17383(C6094 c6094, C2565 c2565) {
        this.f55328 = c6094;
        this.f55327 = c2565;
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ܰ */
    public final String mo24004() {
        return this.f55327.f10124;
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۨ */
    public final C8255 mo24003() {
        return this.f55328.m16574(this.f55327.f10122);
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۖ */
    public final String mo23998() {
        try {
            return this.f55328.m16531(this.f55327);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24001(C2093 c2093) {
        try {
            this.f55328.m16541(this.f55327, c2093);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۚ */
    public final C7807 mo24002() {
        try {
            return mo23999();
        } catch (IOException | C22085 unused) {
            return null;
        }
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۙ */
    public final C7807 mo23999() throws IOException {
        C2565 c2565 = this.f55327;
        C13626 c13626 = c2565.f10121;
        C6094 c6094 = this.f55328;
        if (c13626 != null) {
            C13626 c13626M16521 = c6094.m16521(c13626);
            c6094.m16506(c2565.f10122, c13626, c13626M16521);
            C7807 c7807M16503 = C6094.m16503(c13626M16521);
            C6094.m16507(c6094, c2565.f10124, c7807M16503);
            return c7807M16503;
        }
        return new C7807(c6094.m16550(c2565.f10123.getName()), c2565.f10120, c2565.f10119);
    }

    @Override // l.InterfaceC9354
    /* JADX INFO: renamed from: ۙ */
    public final void mo24000(String str) {
        C6094 c6094 = this.f55328;
        try {
            c6094.m16540(this.f55327, str);
        } catch (Exception e) {
            c6094.f20625.mo23641(e);
        }
    }
}
