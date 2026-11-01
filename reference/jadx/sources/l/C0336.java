package l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0336 extends AbstractC18202 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f1744;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f1745;

    public C0336(C17684 c17684, int i) {
        this.f1744 = c17684;
        this.f1745 = i;
    }

    @Override // l.InterfaceC19441
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List mo1999() {
        C17684 c17684 = this.f1744;
        int iMo9809 = c17684.m41166().mo9809(c17684.m41189(this.f1745) + 8);
        if (iMo9809 > 0) {
            return new C20093(this, iMo9809 + 4, c17684.m41166().mo9809(iMo9809));
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1996(Writer writer) {
        C17684 c17684 = this.f1744;
        int iMo9809 = c17684.m41166().mo9809(c17684.m41189(this.f1745) + 8);
        if (iMo9809 > 0) {
            int iMo98010 = c17684.m41166().mo9809(iMo9809);
            int i = iMo9809 + 4;
            for (int i2 = 0; i2 < iMo98010; i2++) {
                c17684.m41172(writer, c17684.m41166().m42183((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC19441
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo1995() {
        C17684 c17684 = this.f1744;
        return c17684.m41204(c17684.m41166().mo9809(c17684.m41189(this.f1745) + 4));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1998(Writer writer) {
        C17684 c17684 = this.f1744;
        c17684.m41172(writer, c17684.m41166().mo9809(c17684.m41189(this.f1745) + 4));
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo1997() throws C10269 {
        int i = this.f1745;
        if (i < 0 || i >= this.f1744.m41203()) {
            throw new C10269("proto@" + i);
        }
    }
}
