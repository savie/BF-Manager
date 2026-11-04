package l;

import java.util.List;

/* JADX INFO: renamed from: l.۠֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8315 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f27287;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f27288;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f27289;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f27290;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f27291;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f27292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f27293;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    public C8315(int i, int i2, String str) {
        this.f27292 = i;
        this.f27288 = i2;
        this.f27293 = str;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        int i = this.f27288;
        int i2 = this.f27292;
        C20782.m47568((i2 == -1 || i == -1) ? false : true);
        C21287 c21287 = new C21287(i);
        ((C9169) interfaceC19502).mo10078(false, 0, i, c21287.m48497());
        return c21287.m48494() == i2;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f27287 = interfaceC12789;
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(1024, 4);
        this.f27289 = interfaceC22024Mo16658;
        C20124 c20124 = new C20124();
        String str = this.f27293;
        c20124.m46327(str);
        c20124.m46315(str);
        interfaceC22024Mo16658.mo14384(c20124.m46295());
        this.f27287.mo16661();
        this.f27287.mo16659(new C6824());
        this.f27290 = 1;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        int i = this.f27290;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC22024 interfaceC22024 = this.f27289;
        interfaceC22024.getClass();
        int iMo14380 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, 1024, true);
        if (iMo14380 == -1) {
            this.f27290 = 2;
            this.f27289.mo14383(0L, 1, this.f27291, 0, null);
            this.f27291 = 0;
            return 0;
        }
        this.f27291 += iMo14380;
        return 0;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        if (j == 0 || this.f27290 == 1) {
            this.f27290 = 1;
            this.f27291 = 0;
        }
    }
}
