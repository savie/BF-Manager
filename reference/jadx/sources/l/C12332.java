package l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12332 extends AbstractC18908 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f41220;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f41221;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f41222 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f41223;

    public C12332(C17684 c17684, int i) {
        this.f41221 = c17684;
        this.f41223 = i;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹ */
    public final String mo9700() {
        C17684 c17684 = this.f41221;
        return c17684.m41204(c17684.m41166().m42183(c17684.m41180(this.f41223)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30642(Writer writer) {
        C17684 c17684 = this.f41221;
        c17684.m41172(writer, c17684.m41166().m42183(c17684.m41180(this.f41223)));
    }

    @Override // l.InterfaceC8858
    public final String getName() {
        C17684 c17684 = this.f41221;
        return c17684.m41168(c17684.m41166().mo9809(c17684.m41180(this.f41223) + 4));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30644(Writer writer) {
        C17684 c17684 = this.f41221;
        c17684.m41192(c17684.m41166().mo9809(c17684.m41180(this.f41223) + 4), writer, false);
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ */
    public final List mo9699() {
        int iM30640 = m30640();
        C17684 c17684 = this.f41221;
        int iMo9809 = c17684.m41166().mo9809(iM30640 + 8);
        if (iMo9809 > 0) {
            return new C16565(this, iMo9809 + 4, c17684.m41166().mo9809(iMo9809));
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30643(Writer writer) {
        int iM30640 = m30640();
        C17684 c17684 = this.f41221;
        int iMo9809 = c17684.m41166().mo9809(iM30640 + 8);
        if (iMo9809 > 0) {
            int iMo98010 = c17684.m41166().mo9809(iMo9809);
            int i = iMo9809 + 4;
            for (int i2 = 0; i2 < iMo98010; i2++) {
                c17684.m41172(writer, c17684.m41166().m42183((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ */
    public final String mo9698() {
        int iM30640 = m30640();
        C17684 c17684 = this.f41221;
        return c17684.m41204(c17684.m41166().mo9809(iM30640 + 4));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30641(Writer writer) {
        int iM30640 = m30640();
        C17684 c17684 = this.f41221;
        c17684.m41172(writer, c17684.m41166().mo9809(iM30640 + 4));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m30640() {
        if (this.f41220 == 0) {
            C17684 c17684 = this.f41221;
            this.f41220 = c17684.m41189(c17684.m41166().m42183(c17684.m41180(this.f41223) + 2));
        }
        return this.f41220;
    }

    @Override // l.AbstractC18908
    public final String toString() {
        if (this.f41222 == null) {
            this.f41222 = C22304.m49465((InterfaceC8858) this, false);
        }
        return this.f41222;
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f41223;
        if (i < 0 || i >= this.f41221.m41167()) {
            throw new C10269("method@" + i);
        }
    }
}
