package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۨۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W447 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11619 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C16576 f39022 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C20414 f39023;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2714 f39024;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23800 f39025;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17573 f39026;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9399 f39027;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21017 f39028;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3836 f39029;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6761 f39030;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4603 f39031;

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11619 m28951(C12343 c12343) {
        C11619 c11619 = (C11619) c12343.m30656(f39022);
        return c11619 == null ? new C11619(c12343) : c11619;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m28954(C18258 c18258, C21825 c21825, C21825 c21826, AbstractC8774 abstractC8774, C6656 c6656, C21825 c21827, C4603 c4603) {
        AbstractC16579 abstractC16579;
        C21825 c21825M24143 = this.f39027.m24143(c21825, c4603);
        C6761 c6761 = this.f39030;
        c6761.m18318(c21825, c4603, true);
        C19003 c19003 = new C19003();
        for (C21825 c21828 = c21826; c21828.m48595(); c21828 = c21828.f70877) {
            m28956((AbstractC8774) c21828.f70876, c4603);
            c19003.m43723(((C6656) c21828.f70876).f22477.f30190);
        }
        C3836 c3836 = this.f39029;
        AbstractC16579 abstractC16579M18326 = abstractC8774 == null ? c3836.f14293 : c6761.m18326(abstractC8774, c4603, AbstractC16579.f53219);
        if (c6656 != null) {
            m28956((AbstractC8774) c6656, c4603);
            abstractC16579 = c6656.f22477.f30190;
        } else {
            abstractC16579 = null;
        }
        C19003 c19004 = new C19003();
        for (C21825 c21829 = c21827; c21829.m48595(); c21829 = c21829.f70877) {
            AbstractC16579 abstractC16579M18327 = c6761.m18326((AbstractC8774) c21829.f70876, c4603, AbstractC16579.f53219);
            if (!abstractC16579M18327.m39001(EnumC6617.TYPEVAR)) {
                AbstractC5930 abstractC5930 = (AbstractC5930) c21829.f70876;
                abstractC5930.getClass();
                abstractC16579M18327 = this.f39028.m47338(abstractC5930, abstractC16579M18327);
            } else {
                AbstractC0618 abstractC0618 = abstractC16579M18327.f53222;
                if (abstractC0618.f77448 == c18258) {
                    abstractC0618.f77447 |= 140737488355328L;
                }
            }
            c19004.m43723(abstractC16579M18327);
        }
        C13757 c13757 = new C13757(c19003.m43726(), abstractC16579M18326, c19004.m43726(), c3836.f14240);
        c13757.f45369 = abstractC16579;
        return c21825M24143.isEmpty() ? c13757 : new C10894(c13757, c21825M24143);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28956(AbstractC8774 abstractC8774, C4603 c4603) {
        C4603 c4604 = this.f39031;
        try {
            this.f39031 = c4603;
            abstractC8774.mo1802(this);
        } catch (C4146 e) {
            C21017 c21017 = this.f39028;
            abstractC8774.getClass();
            c21017.m47261(abstractC8774, e);
        } finally {
            this.f39031 = c4604;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) throws Throwable {
        InterfaceC12260 interfaceC12260;
        C4603 c4603 = this.f39031;
        this.f39027.getClass();
        AbstractC9462 abstractC9462M24139 = C9399.m24139(c4603);
        C18258 c18258 = new C18258(0L, c23195.f75272, null, abstractC9462M24139.f11719);
        c18258.f77447 = this.f39028.m47257(c23195, c23195.f75267.f70567, c18258, c23195);
        c23195.f75263 = c18258;
        if ((c23195.f75267.f70567 & 8796093022208L) != 0) {
            c18258.f77448.f77447 |= 8796093022208L;
        }
        C4603 c4603M28953 = m28953(c23195, this.f39031);
        C2714 c2714 = this.f39024;
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c23195);
        try {
            interfaceC12260 = interfaceC12260M8270;
            try {
                c18258.f77449 = m28954(c18258, c23195.f75269, c23195.f75270, c23195.f75266, c23195.f75262, c23195.f75264, c4603M28953);
                c2714.m8270(interfaceC12260);
                if (this.f39025.m52395(c18258)) {
                    c18258.f77447 |= 70368744177664L;
                }
                C19003 c19003 = new C19003();
                C6656 c6656 = null;
                for (C21825 c21825 = c23195.f75270; c21825.m48595(); c21825 = c21825.f70877) {
                    c6656 = (C6656) c21825.f70876;
                    C6263 c6263 = c6656.f22475;
                    C6171.m17171(c6263);
                    c19003.m43723(c6263);
                }
                c18258.f58259 = c19003.m43726();
                if (c6656 != null && (c6656.f22476.f70567 & 17179869184L) != 0) {
                    c18258.f77447 |= 17179869184L;
                }
                ((C22990) c4603M28953.f16299).f74722.mo24225();
                if (this.f39028.m47323(c23195, c18258, abstractC9462M24139)) {
                    abstractC9462M24139.mo24224(c18258);
                }
                C21825 c21826 = c23195.f75267.f70566;
                C17573 c17573 = this.f39026;
                c17573.m40871(c21826, c4603M28953, c18258, c23195);
                c17573.m40869(c23195, c4603M28953, c18258, c23195);
                if (c23195.f75265 != null) {
                    c18258.f58258 = c17573.m40863();
                    AbstractC5930 abstractC5930 = c23195.f75265;
                    c17573.m40868(new RunnableC10238(c17573, c4603M28953, c23195, abstractC5930, c18258, 1));
                    c17573.m40876(new RunnableC20430(c17573, c4603M28953, abstractC5930, 2));
                }
            } catch (Throwable th) {
                th = th;
                c2714.m8270(interfaceC12260);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC12260 = interfaceC12260M8270;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4603 m28953(C23195 c23195, C4603 c4603) {
        C22990 c22990 = (C22990) c4603.f16299;
        C4603 c4603M12747 = c4603.m12747(c23195, c22990.m50854(c22990.f74722.mo3801(c23195.f75263)));
        Object obj = c4603M12747.f16299;
        c4603M12747.f16294 = c23195;
        if (c23195.f75263.f77449 != null) {
            C6761 c6761 = this.f39030;
            C13638.requireNonNull(c6761);
            ((C22990) obj).f74725 = new C1116(c6761, C21059.f68595, c23195.f75263.f77449.mo16235());
        }
        if ((c23195.f75267.f70567 & 8) != 0) {
            ((C22990) obj).f74716++;
        }
        ((C22990) obj).f74717 = null;
        return c4603M12747;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(final C6656 c6656) {
        AbstractC16579 abstractC16579;
        C4603 c4603M12747 = this.f39031;
        boolean z = true;
        if ((c6656.f22476.f70567 & 8) != 0 || (((C22990) c4603M12747.f16299).f74722.f11719.mo20276() & 512) != 0) {
            C4603 c4603 = this.f39031;
            C22990 c22990 = (C22990) c4603.f16299;
            c4603M12747 = c4603.m12747(c6656, c22990.m50854(c22990.f74722));
            ((C22990) c4603M12747.f16299).f74716++;
        }
        C4603 c4604 = c4603M12747;
        C2714 c2714 = this.f39024;
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c6656);
        try {
            boolean zM9468 = C3128.m9468(c6656);
            C6761 c6761 = this.f39030;
            if (zM9468) {
                C3107 c3107 = (C3107) c6656.f22477;
                c6761.getClass();
                C6761.m18270(c4604, c3107);
            } else if (!c6656.m18039()) {
                AbstractC5930 abstractC5930 = c6656.f22477;
                c6761.getClass();
                c6761.m18326(abstractC5930, c4604, AbstractC16579.f53219);
                if (!c6656.m22847(EnumC18651.f60554) || c6656.f22482 == null) {
                    z = false;
                }
                if (z) {
                    m28955(c6656, c4604);
                }
            }
            c2714.m8270(interfaceC12260M8270);
            if ((c6656.f22476.f70567 & 17179869184L) != 0) {
                AbstractC5930 abstractC5931 = c6656.f22477;
                abstractC5931.f30190 = ((C8777) abstractC5931.f30190).m22849();
            }
            C4603 c4605 = this.f39031;
            this.f39027.getClass();
            AbstractC9462 abstractC9462M24139 = C9399.m24139(c4605);
            if (c6656.m18039()) {
                abstractC16579 = ((C22990) this.f39031.f16299).f74722.f11719.f77452 == EnumC10477.f35879 ? AbstractC16579.f53219 : this.f39029.f14261;
            } else {
                abstractC16579 = c6656.f22477.f30190;
            }
            final C6263 c6263 = new C6263(0L, c6656.f22478, abstractC16579, abstractC9462M24139.f11719);
            long jM47257 = this.f39028.m47257(c6656, c6656.f22476.f70567, c6263, c6656);
            c6263.f77447 = jM47257;
            c6656.f22475 = c6263;
            AbstractC5930 abstractC5932 = c6656.f22481;
            if (abstractC5932 != null) {
                long j = jM47257 | 262144;
                c6263.f77447 = j;
                if ((j & 16) != 0) {
                    C13736 c13736 = new C13736();
                    abstractC5932.mo1802(c13736);
                    if (c13736.f45291) {
                        C15229 c15229M28952 = m28952(c6656, this.f39031);
                        ((C22990) c15229M28952.f16299).f74718 = c6263;
                        final C15229 c15229M28953 = m28952(c6656, c15229M28952);
                        final C4603 c4606 = this.f39031;
                        final C6761 c6762 = this.f39030;
                        c6263.m17327(new Callable() { // from class: l.۫᩵ۤ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return c6762.m18292(c15229M28953, c4606, c6656, c6263.f77449);
                            }
                        });
                    }
                }
            }
            C21017 c21017 = this.f39028;
            if (c21017.m47323((InterfaceC12260) c6656, (AbstractC23903) c6263, abstractC9462M24139)) {
                c21017.m47293((InterfaceC12260) c6656, c6263, abstractC9462M24139);
                abstractC9462M24139.mo24224(c6263);
            } else if (c6263.f77448.f77452 == EnumC10477.f35879 || (c6263.f77447 & 2305843009230471186L) != 0) {
                abstractC9462M24139.mo24224(c6263);
            }
            C21825 c21825 = c6656.f22476.f70566;
            C17573 c17573 = this.f39026;
            c17573.m40871(c21825, c4604, c6263, c6656);
            if (!c6656.m18039()) {
                c17573.m40869(c6656.f22477, c4604, c6263, c6656);
            }
            c6263.f21226 = c6656.f30189;
        } catch (Throwable th) {
            c2714.m8270(interfaceC12260M8270);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28957(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, C5909 c5909) {
        if (abstractC8774.f30190.mo1926() || this.f39025.m52399(abstractC8774.f30190, abstractC16579)) {
            return;
        }
        this.f39023.m48199(abstractC8774, c5909);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28955(C6656 c6656, C4603 c4603) {
        AbstractC5930 abstractC5930 = c6656.f22482;
        C6761 c6761 = this.f39030;
        c6761.m18299(abstractC5930, c4603, c6761.f22809);
        C18258 c18258 = c4603.f16294.f75263;
        if (c18258.m52713()) {
            AbstractC16579 abstractC16579 = c18258.f77448.f77448.f77449;
            if (abstractC16579.m39001(EnumC6617.METHOD)) {
                abstractC16579 = c18258.f77448.f77448.f77448.f77449;
            }
            if (abstractC16579.m39001(EnumC6617.CLASS)) {
                AbstractC5930 abstractC5931 = c6656.f22477;
                AbstractC16579 abstractC165710 = abstractC5931.f30190;
                C5909 c5909 = C23879.f77204;
                m28957(abstractC5931, abstractC16579, new C5909("compiler", "incorrect.constructor.receiver.type", abstractC16579, abstractC165710));
                AbstractC5930 abstractC5932 = c6656.f22482;
                m28957(abstractC5932, abstractC16579, new C5909("compiler", "incorrect.constructor.receiver.name", abstractC16579, abstractC5932.f30190));
                return;
            }
            this.f39023.m48199(c6656, C23879.f77246);
            return;
        }
        AbstractC5930 abstractC5933 = c6656.f22477;
        AbstractC16579 abstractC165711 = c18258.f77448.f77449;
        AbstractC16579 abstractC165712 = abstractC5933.f30190;
        C5909 c59010 = C23879.f77204;
        m28957(abstractC5933, abstractC165711, new C5909("compiler", "incorrect.receiver.type", abstractC165711, abstractC165712));
        AbstractC5930 abstractC5934 = c6656.f22482;
        AbstractC16579 abstractC165713 = c18258.f77448.f77449;
        m28957(abstractC5934, abstractC165713, new C5909("compiler", "incorrect.receiver.name", abstractC165713, abstractC5934.f30190));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15229 m28952(C6656 c6656, C4603 c4603) {
        C22990 c22990 = (C22990) c4603.f16299;
        C22990 c22990M50854 = c22990.m50854(c22990.f74722);
        C15229 c15229 = new C15229(c6656, c22990M50854);
        c15229.f16297 = c4603;
        c15229.f16300 = c4603.f16300;
        c15229.f16295 = c4603.f16295;
        c15229.f16301 = c4603.f16301;
        c15229.f16294 = c4603.f16294;
        C6263 c6263 = c6656.f22475;
        if (c6263.f77448.f77452 == EnumC10477.f35865) {
            c22990M50854.f74722 = ((C22990) c4603.f16299).f74722.mo3801(c6263);
        }
        if ((c6656.f22476.f70567 & 8) == 0) {
            C22492 c22492 = c4603.f16301.f30086;
            c22492.mo49994();
            if ((c22492.f77447 & 512) == 0 || c4603.f16294 != null) {
                return c15229;
            }
        }
        c22990M50854.f74716++;
        return c15229;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3939(C12281 c12281) {
        C21825 c21825 = c12281.f41061;
        if (c21825 != null) {
            C4603 c4603 = this.f39031;
            while (c21825.m48595()) {
                m28956((AbstractC8774) c21825.f70876, c4603);
                c21825 = c21825.f70877;
            }
        }
    }

    public C11619(C12343 c12343) {
        c12343.m30659(f39022, this);
        this.f39027 = C9399.m24138(c12343);
        this.f39023 = C20414.m46161(c12343);
        this.f39028 = C21017.m47211(c12343);
        this.f39030 = C6761.m18268(c12343);
        this.f39029 = C3836.m11131(c12343);
        this.f39026 = C17573.m40852(c12343);
        this.f39025 = C23800.m52336(c12343);
        this.f39024 = C2714.m8268(c12343);
    }
}
