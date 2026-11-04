package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩸ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4IO */
/* JADX INFO: loaded from: classes2.dex */
public final class C22868 extends AbstractC9204 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f74326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f74327;

    public C22868(C24975 c24975, int i) {
        this.f74326 = c24975;
        this.f74327 = i;
    }

    @Override // l.InterfaceC8304
    /* JADX INFO: renamed from: ܳ */
    public final String mo4500() {
        C24975 c24975 = this.f74326;
        return c24975.m55822(c24975.m55818().m8721(c24975.m55814(this.f74327)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51588(Writer writer) {
        C24975 c24975 = this.f74326;
        c24975.m55787(writer, c24975.m55818().m8721(c24975.m55814(this.f74327)));
    }

    @Override // l.InterfaceC8304
    public final String getName() {
        C24975 c24975 = this.f74326;
        return c24975.m55782(c24975.m55818().mo8719(c24975.m55814(this.f74327) + 4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51590(Writer writer) {
        C24975 c24975 = this.f74326;
        c24975.m55816(c24975.m55818().mo8719(c24975.m55814(this.f74327) + 4), writer, false);
    }

    @Override // l.InterfaceC8304
    public final String getType() {
        C24975 c24975 = this.f74326;
        return c24975.m55822(c24975.m55818().m8721(c24975.m55814(this.f74327) + 2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51589(Writer writer) {
        C24975 c24975 = this.f74326;
        c24975.m55787(writer, c24975.m55818().m8721(c24975.m55814(this.f74327) + 2));
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6806() throws C22013 {
        int i = this.f74327;
        if (i < 0 || i >= this.f74326.m55802()) {
            throw new C22013("field@" + i);
        }
    }
}
