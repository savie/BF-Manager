package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7612 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f25166;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25167;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f25168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4603 f25169;

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3915(C0990 c0990) {
        m20150(c0990.f4638, this.f25167, this.f25168);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        if (c11596.f30190.m39001(EnumC6617.CLASS)) {
            C21825 c21825 = c11596.f38962;
            C21825 c21825Mo1938 = c11596.f30190.f53222.f77449.mo1938();
            AbstractC16579 abstractC16579 = c11596.f30190;
            C21017 c21017 = this.f25166;
            AbstractC16579 abstractC16579M47204 = c21017.m47204(abstractC16579);
            if (abstractC16579M47204 != null) {
                for (AbstractC8774 abstractC8774 : c11596.f38962) {
                    if (abstractC8774.f30190 == abstractC16579M47204) {
                        C20414 c20414 = c21017.f68429;
                        AbstractC16579 abstractC165710 = (AbstractC16579) c21825Mo1938.f70876;
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(abstractC8774, new C5909("compiler", "not.within.bounds", abstractC16579M47204, abstractC165710));
                    }
                    c21825Mo1938 = c21825Mo1938.f70877;
                }
            }
            boolean z = c11596.f30190.f53222.mo50003() == c21017.f68444.f77644;
            for (C21825 c21825Mo1939 = c11596.f30190.f53222.f77449.mo1938(); c21825.m48595() && c21825Mo1939.m48595(); c21825Mo1939 = c21825Mo1939.f70877) {
                m20150((AbstractC8774) c21825.f70876, (this.f25168 && z) ? false : true, false);
                c21825 = c21825.f70877;
            }
            if (c11596.f30190.mo1934().mo1936()) {
                c21017.f68429.m48199(c11596, C23879.f77345);
            }
            if (c11596.f38963.m22847(EnumC18651.f60473)) {
                m20151((C23570) c11596.f38963);
            }
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        boolean z = this.f25168;
        for (C21825 c21825 = c22179.f72547; c21825.m48595(); c21825 = c21825.f70877) {
            m20150((AbstractC8774) c21825.f70876, true, z);
        }
        AbstractC16579 abstractC16579 = c22179.f30190;
        this.f25166.m47292(c22179, new HashMap(), abstractC16579);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3946(C15124 c15124) {
        AbstractC8774 abstractC8774 = c15124.f49398;
        if (abstractC8774 != null) {
            m20150(abstractC8774, true, this.f25168);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        if (c23570.f30190.m39001(EnumC6617.CLASS)) {
            m20151(c23570);
            if (c23570.f76357.f30190.mo1942() && c23570.f30190.f53222.f77449.mo1938().m48595()) {
                this.f25166.f68429.m48199(c23570, C23879.f77181);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20151(C23570 c23570) {
        if (c23570.f30190.f53222.mo22992() && c23570.f76357.f30190.mo1942()) {
            this.f25166.f68429.m48199(c23570, C23879.f77171);
        } else {
            c23570.f76357.mo1802(this);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        c2401.f9659.mo1802(this);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3940(C12611 c12611) {
        if (c12611.f30190.m39001(EnumC6617.VOID)) {
            this.f25166.f68429.m48199(c12611, C23879.f77310);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20150(AbstractC8774 abstractC8774, boolean z, boolean z2) {
        C21017 c21017 = this.f25166;
        if (abstractC8774 != null) {
            boolean z3 = this.f25167;
            this.f25167 = z;
            this.f25168 = z2;
            try {
                abstractC8774.mo1802(this);
                if (z) {
                    c21017.m47285(abstractC8774, this.f25169);
                }
            } catch (C4146 e) {
                c21017.m47261(abstractC8774, e);
            } finally {
                this.f25167 = z3;
            }
        }
    }

    public C7612(C21017 c21017, C4603 c4603) {
        this.f25166 = c21017;
        this.f25169 = c4603;
    }
}
