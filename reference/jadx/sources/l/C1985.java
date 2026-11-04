package l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1985 extends AbstractC6968 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f6646 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f6647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f6648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6649;

    public C1985(C24975 c24975, int i) {
        this.f6647 = c24975;
        this.f6649 = i;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo6804() {
        C24975 c24975 = this.f6647;
        return c24975.m55822(c24975.m55818().m8721(c24975.m55812(this.f6649)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6801(Writer writer) {
        C24975 c24975 = this.f6647;
        c24975.m55787(writer, c24975.m55818().m8721(c24975.m55812(this.f6649)));
    }

    @Override // l.InterfaceC4859
    public final String getName() {
        C24975 c24975 = this.f6647;
        return c24975.m55782(c24975.m55818().mo8719(c24975.m55812(this.f6649) + 4));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6807(Writer writer) {
        C24975 c24975 = this.f6647;
        c24975.m55816(c24975.m55818().mo8719(c24975.m55812(this.f6649) + 4), writer, false);
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List mo6805() {
        int iM6800 = m6800();
        C24975 c24975 = this.f6647;
        int iMo8719 = c24975.m55818().mo8719(iM6800 + 8);
        if (iMo8719 > 0) {
            return new C5714(this, iMo8719 + 4, c24975.m55818().mo8719(iMo8719));
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6803(Writer writer) {
        int iM6800 = m6800();
        C24975 c24975 = this.f6647;
        int iMo8719 = c24975.m55818().mo8719(iM6800 + 8);
        if (iMo8719 > 0) {
            int iMo87110 = c24975.m55818().mo8719(iMo8719);
            int i = iMo8719 + 4;
            for (int i2 = 0; i2 < iMo87110; i2++) {
                c24975.m55787(writer, c24975.m55818().m8721((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo6802() {
        int iM6800 = m6800();
        C24975 c24975 = this.f6647;
        return c24975.m55822(c24975.m55818().mo8719(iM6800 + 4));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6808(Writer writer) {
        int iM6800 = m6800();
        C24975 c24975 = this.f6647;
        c24975.m55787(writer, c24975.m55818().mo8719(iM6800 + 4));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m6800() {
        if (this.f6648 == 0) {
            C24975 c24975 = this.f6647;
            this.f6648 = c24975.m55796(c24975.m55818().m8721(c24975.m55812(this.f6649) + 2));
        }
        return this.f6648;
    }

    @Override // l.AbstractC6968
    public final String toString() {
        if (this.f6646 == null) {
            this.f6646 = C14684.m35306((InterfaceC4859) this, false);
        }
        return this.f6646;
    }

    @Override // l.AbstractC13679, l.InterfaceC10824
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo6806() throws C22013 {
        int i = this.f6649;
        if (i < 0 || i >= this.f6647.m55781()) {
            throw new C22013("method@" + i);
        }
    }
}
