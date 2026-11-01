package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩷ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4IO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20798 extends AbstractC15381 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f67625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67626;

    public C20798(C17684 c17684, int i) {
        this.f67625 = c17684;
        this.f67626 = i;
    }

    @Override // l.InterfaceC18735
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1183() {
        C17684 c17684 = this.f67625;
        return c17684.m41204(c17684.m41166().m42183(c17684.m41190(this.f67626)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46778(Writer writer) {
        C17684 c17684 = this.f67625;
        c17684.m41172(writer, c17684.m41166().m42183(c17684.m41190(this.f67626)));
    }

    @Override // l.InterfaceC18735
    public final String getName() {
        C17684 c17684 = this.f67625;
        return c17684.m41168(c17684.m41166().mo9809(c17684.m41190(this.f67626) + 4));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46780(Writer writer) {
        C17684 c17684 = this.f67625;
        c17684.m41192(c17684.m41166().mo9809(c17684.m41190(this.f67626) + 4), writer, false);
    }

    @Override // l.InterfaceC18735
    public final String getType() {
        C17684 c17684 = this.f67625;
        return c17684.m41204(c17684.m41166().m42183(c17684.m41190(this.f67626) + 2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46779(Writer writer) {
        C17684 c17684 = this.f67625;
        c17684.m41172(writer, c17684.m41166().m42183(c17684.m41190(this.f67626) + 2));
    }

    @Override // l.AbstractC8325, l.InterfaceC7446
    /* JADX INFO: renamed from: ۚ */
    public final void mo1997() throws C10269 {
        int i = this.f67626;
        if (i < 0 || i >= this.f67625.m41163()) {
            throw new C10269("field@" + i);
        }
    }
}
