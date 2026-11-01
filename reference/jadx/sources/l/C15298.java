package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15298 extends AbstractC6913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17684 f49838;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f49839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f49840;

    public C15298(C17684 c17684, int i, int i2) {
        this.f49838 = c17684;
        this.f49839 = i;
        this.f49840 = i2;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۙ */
    public final int mo18941() {
        return this.f49838.m41166().mo9809(this.f49839);
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۨ */
    public final int mo18942() {
        return this.f49838.m41166().m42183(this.f49839 + 4);
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ܰ */
    public final List mo18943() {
        C17684 c17684 = this.f49838;
        C18825 c18825M42184 = c17684.m41166().m42184(c17684.m41166().m42183(this.f49839 + 6) + this.f49840);
        int iM43456 = c18825M42184.m43456();
        int iM43447 = c18825M42184.m43447();
        c18825M42184.m43450();
        if (iM43456 > 0) {
            return new C6830(this, c17684, iM43447, iM43456);
        }
        int i = (iM43456 * (-1)) + 1;
        return new C23059(this, this.f49838, iM43447, i, i);
    }
}
