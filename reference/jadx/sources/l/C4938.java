package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4938 extends AbstractC0578 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17215;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f17216;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3168 f17217;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f17218;

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1968(C23589 c23589) {
        m15145(c23589.f76594, this.f17215, this.f17216);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        if (c25191.f26659.m51067(EnumC21172.CLASS)) {
            C14769 c14769 = c25191.f81424;
            C14769 c14769Mo15882 = c25191.f26659.f73596.f38067.mo15882();
            AbstractC22664 abstractC22664 = c25191.f26659;
            C22092 c22092 = this.f17218;
            AbstractC22664 abstractC22664M49956 = c22092.m49956(abstractC22664);
            if (abstractC22664M49956 != null) {
                for (AbstractC8036 abstractC8036 : c25191.f81424) {
                    if (abstractC8036.f26659 == abstractC22664M49956) {
                        C7312 c7312 = c22092.f71200;
                        AbstractC22664 abstractC22665 = (AbstractC22664) c14769Mo15882.f48335;
                        C11040 c11040 = C22843.f74058;
                        c7312.m34520(abstractC8036, new C11040("compiler", "not.within.bounds", abstractC22664M49956, abstractC22665));
                    }
                    c14769Mo15882 = c14769Mo15882.f48336;
                }
            }
            boolean z = c25191.f26659.f73596.mo29575() == c22092.f71197.f49767;
            for (C14769 c14769Mo15883 = c25191.f26659.f73596.f38067.mo15882(); c14769.m35550() && c14769Mo15883.m35550(); c14769Mo15883 = c14769Mo15883.f48336) {
                m15145((AbstractC8036) c14769.f48335, (this.f17216 && z) ? false : true, false);
                c14769 = c14769.f48336;
            }
            if (c25191.f26659.mo23449().mo9328()) {
                c22092.f71200.m34520(c25191, C22843.f74137);
            }
            if (c25191.f81425.m21911(EnumC21461.f68485)) {
                m15146((C23041) c25191.f81425);
            }
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        boolean z = this.f17216;
        for (C14769 c14769 = c16239.f52785; c14769.m35550(); c14769 = c14769.f48336) {
            m15145((AbstractC8036) c14769.f48335, true, z);
        }
        AbstractC22664 abstractC22664 = c16239.f26659;
        this.f17218.m49979(c16239, new HashMap(), abstractC22664);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1971(C24445 c24445) {
        AbstractC8036 abstractC8036 = c24445.f79357;
        if (abstractC8036 != null) {
            m15145(abstractC8036, true, this.f17216);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        if (c23041.f26659.m51067(EnumC21172.CLASS)) {
            m15146(c23041);
            if (c23041.f74776.f26659.mo9330() && c23041.f26659.f73596.f38067.mo15882().m35550()) {
                this.f17218.f71200.m34520(c23041, C22843.f74121);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15146(C23041 c23041) {
        if (c23041.f26659.f73596.mo7874() && c23041.f74776.f26659.mo9330()) {
            this.f17218.f71200.m34520(c23041, C22843.f74157);
        } else {
            c23041.f74776.mo2284(this);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        c16875.f55198.mo2284(this);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1958(C14089 c14089) {
        if (c14089.f26659.m51067(EnumC21172.VOID)) {
            this.f17218.f71200.m34520(c14089, C22843.f74142);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15145(AbstractC8036 abstractC8036, boolean z, boolean z2) {
        C22092 c22092 = this.f17218;
        if (abstractC8036 != null) {
            boolean z3 = this.f17215;
            this.f17215 = z;
            this.f17216 = z2;
            try {
                abstractC8036.mo2284(this);
                if (z) {
                    c22092.m49997(abstractC8036, this.f17217);
                }
            } catch (C21566 e) {
                c22092.m49966(abstractC8036, e);
            } finally {
                this.f17215 = z3;
            }
        }
    }

    public C4938(C22092 c22092, C3168 c3168) {
        this.f17218 = c22092;
        this.f17217 = c3168;
    }
}
