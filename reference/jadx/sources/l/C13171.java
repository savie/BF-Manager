package l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13171 extends AbstractC8459 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f42096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f42097;

    public C13171(C24975 c24975, int i) {
        this.f42096 = c24975;
        this.f42097 = i;
    }

    @Override // l.InterfaceC13524
    /* JADX INFO: renamed from: ܶ */
    public final List mo7393() {
        C24975 c24975 = this.f42096;
        int iMo8719 = c24975.m55818().mo8719(c24975.m55796(this.f42097) + 8);
        if (iMo8719 > 0) {
            return new C15408(this, iMo8719 + 4, c24975.m55818().mo8719(iMo8719));
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32689(Writer writer) {
        C24975 c24975 = this.f42096;
        int iMo8719 = c24975.m55818().mo8719(c24975.m55796(this.f42097) + 8);
        if (iMo8719 > 0) {
            int iMo87110 = c24975.m55818().mo8719(iMo8719);
            int i = iMo8719 + 4;
            for (int i2 = 0; i2 < iMo87110; i2++) {
                c24975.m55787(writer, c24975.m55818().m8721((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC13524
    /* JADX INFO: renamed from: ۤ */
    public final String mo7392() {
        C24975 c24975 = this.f42096;
        return c24975.m55822(c24975.m55818().mo8719(c24975.m55796(this.f42097) + 4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32690(Writer writer) {
        C24975 c24975 = this.f42096;
        c24975.m55787(writer, c24975.m55818().mo8719(c24975.m55796(this.f42097) + 4));
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f42097;
        if (i < 0 || i >= this.f42096.m55821()) {
            throw new C22013("proto@" + i);
        }
    }
}
