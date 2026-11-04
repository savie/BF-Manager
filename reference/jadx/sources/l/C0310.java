package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0310 extends AbstractC0578 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final C13477 f1665 = new C13477();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC21172[] f1666 = {EnumC21172.BYTE, EnumC21172.CHAR, EnumC21172.SHORT, EnumC21172.INT, EnumC21172.LONG, EnumC21172.FLOAT, EnumC21172.DOUBLE, EnumC21172.BOOLEAN};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15252 f1668;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11518 f1669;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C24705 f1670;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17638 f1671;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C6147 f1672;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1674;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C14479 f1675;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0838 f1676;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C16437 f1677;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3168 f1678;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C16283 f1680;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C4039 f1681;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C1917 f1682;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12242 f1683;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1684;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f1685;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7044 f1686;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C14479 f1687;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15846 f1688;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f1689;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C12221 f1690;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f1691;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14528 f1692;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f1693;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15378 f1696;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f1697;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22092 f1698;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C14479 f1699;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15714 f1700;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3605 f1701;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f1702;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C14764 f1703;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C19991 f1704;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7312 f1705;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f1706;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C22010 f1707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f1708;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C14479 f1709;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12863 f1710;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C25301 f1711;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4742 f1712;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C14479 f1713;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC15161 f1673 = new C3293(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17775 f1667 = C16283.f52877;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3036 f1679 = new C22685();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C23475 f1694 = new C1802(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public HashMap f1695 = new HashMap();

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1953(C11852 c11852) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0310 m1899(C4747 c4747) {
        C0310 c0310 = (C0310) c4747.m14643(f1665);
        return c0310 == null ? new C0310(c4747) : c0310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1938(final AbstractC8036 abstractC8036, final AbstractC22664 abstractC22664, final C22114 c22114, final C14479 c14479) {
        AbstractC22664 abstractC22664Mo30220;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        EnumC17463 enumC17463 = c14479.f45574;
        C22114 c22115 = c14479.f45572;
        AbstractC22664 abstractC22665 = c14479.f45575;
        final C2596 c2596Mo2276 = interfaceC1013.mo2276();
        boolean z = (abstractC22664.m51067(EnumC21172.ERROR) || abstractC22665.m51067(EnumC21172.METHOD) || abstractC22665.m51067(EnumC21172.FORALL)) ? false : true;
        if (z && !c22114.m50070(c22115)) {
            abstractC8036.getClass();
            EnumSet enumSetM50068 = c22115.m50068();
            EnumSet enumSetM50069 = c22114.m50068();
            C11040 c11040 = C22843.f74058;
            this.f1705.m34520(abstractC8036, new C11040("compiler", "unexpected.type", enumSetM50068, enumSetM50069));
            abstractC22664Mo30220 = this.f1670.m55139(abstractC22664);
        } else if (this.f1684 && abstractC22664.m51073(c2596Mo2276.f8340)) {
            AbstractC22664 abstractC22666 = z ? abstractC22665 : abstractC22664;
            if (enumC17463.mo39485()) {
                c2596Mo2276.m8700(C14769.of((Object) abstractC22664), new InterfaceC10382() { // from class: l.ۙۖ᩺
                    @Override // l.InterfaceC10382
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo2127(C2596 c2596) {
                        C0310 c0310 = this.f16346;
                        c0310.getClass();
                        C14479 c144710 = c14479;
                        AbstractC22664 abstractC22667 = c144710.f45575;
                        C2596 c2597 = c2596Mo2276;
                        C14479 c14479Mo30219 = c144710.mo30219(c2597.m8696(abstractC22667));
                        c0310.m1938(abstractC8036, c2597.m8696(abstractC22664), c22114, c14479Mo30219);
                    }
                });
            }
            abstractC22664Mo30220 = abstractC22666;
        } else {
            abstractC22664Mo30220 = z ? c14479.mo30220(abstractC8036, abstractC22664) : abstractC22664;
        }
        if (enumC17463.mo40962()) {
            abstractC8036.f26659 = abstractC22664Mo30220;
        }
        return abstractC22664Mo30220;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1966(AbstractC22295 abstractC22295, C5816 c5816, AbstractC8036 abstractC8036, C3168 c3168) {
        boolean z;
        AbstractC19728 abstractC19728 = c5816.f38072;
        C15252 c15252 = this.f1668;
        AbstractC19728 abstractC19729 = c15252.f49836;
        C7312 c7312 = this.f1705;
        if (abstractC19728 != abstractC19729) {
            long j = c5816.f38071;
            if ((16 & j) != 0) {
                if ((j & 262144) == 0 && (abstractC8036 == null || C11239.m28360(abstractC8036))) {
                    AbstractC11781 abstractC11781 = ((C7768) c3168.f10272).f25562.f53083;
                    if (c5816.f38069 != abstractC11781) {
                        if ((abstractC11781.f38072 == c15252.f49865 || abstractC11781.f38066 == EnumC13603.f43205 || (abstractC11781.mo29591() & 1048576) != 0) && c5816.f38069 == abstractC11781.f38069) {
                            z = (((c5816.f38071 & 8) > 0L ? 1 : ((c5816.f38071 & 8) == 0L ? 0 : -1)) != 0) == C22010.m49752(c3168);
                        }
                    }
                    C6633 c6633 = c3168.f10277;
                    if (z & (!(c6633 != null && C11239.m28361(c6633)))) {
                        return;
                    }
                }
                if (c5816.m16956()) {
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(abstractC22295, new C11040("compiler", "try.resource.may.not.be.assigned", c5816));
                    return;
                } else {
                    C11040 c11041 = C22843.f74058;
                    c7312.m34520(abstractC22295, new C11040("compiler", "cant.assign.val.to.final.var", c5816));
                    return;
                }
            }
            return;
        }
        c7312.m34520(abstractC22295, C22843.f74053);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 m1926(AbstractC22295 abstractC22295, C19113 c19113) {
        C3168 c3168M37798 = this.f1688.m37798(c19113);
        C15714 c15714 = this.f1700;
        C4395 c4395M37507 = c15714.m37507(0L);
        C14764 c14764 = this.f1703;
        C7926 c7926M37514 = c15714.m37514(c4395M37507, c14764.f48237.f38072, (C14769) null, (AbstractC22295) null, (C14769) null, (C14769) null);
        c3168M37798.f10279 = c7926M37514;
        c7926M37514.f26345 = c14764.f48237;
        return (AbstractC11781) abstractC22295.mo2282(this.f1673, c3168M37798);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1932(AbstractC8036 abstractC8036, C3168 c3168) {
        C0838 c0838 = this.f1676;
        C3168 c3169 = null;
        C14479 c14479 = null;
        c3169 = null;
        c3169 = null;
        c3169 = null;
        c3169 = null;
        c3169 = null;
        c3169 = null;
        if (!c0838.f3156.isEmpty() && !((C7768) c3168.f10272).f25555.f76580 && (abstractC8036 instanceof AbstractC19969) && !abstractC8036.m21911(EnumC21461.f68501) && !abstractC8036.m21911(EnumC21461.f68492) && !abstractC8036.m21911(EnumC21461.f68505) && !abstractC8036.m21911(EnumC21461.f68490)) {
            AbstractC8036 abstractC8037 = c3168.f10273;
            C7768 c7768 = (C7768) c3168.f10272;
            AbstractC17836 abstractC17836 = c7768.f25562;
            C3168 c3168M10350 = c3168.m10350(abstractC8037, c7768.m21146(abstractC17836.mo7486(abstractC17836.f53083)));
            C7768 c7769 = (C7768) c3168M10350.f10272;
            if (c7769.f25564 != null) {
                C0310 c0310 = c0838.f3155;
                C17359.requireNonNull(c0310);
                C14479 c144710 = c7769.f25564;
                c14479 = new C14479(c0310, c144710.f45572, c144710.f45575);
            }
            c7769.f25564 = c14479;
            c3169 = c3168M10350;
        }
        AbstractC22664 abstractC22664M1933 = m1933(abstractC8036, c3168, this.f1709);
        if (c3169 != null) {
            C18737 c18737 = new C18737(c0838, (AbstractC19969) abstractC8036, c3169);
            c18737.mo5474(c18737.f60897);
            if (!c18737.f60896.isEmpty()) {
                Iterator it = c18737.f60896.iterator();
                while (it.hasNext()) {
                    c0838.f3152.mo30216((C0092) it.next());
                }
            }
        }
        this.f1712.m14640();
        return abstractC22664M1933;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        AbstractC11781 abstractC11781M49763;
        AbstractC11781 abstractC11781;
        AbstractC11781 abstractC11781M49774;
        AbstractC19728 abstractC19728;
        boolean zM51067 = this.f1675.f45575.m51067(EnumC21172.METHOD);
        C22010 c22010 = this.f1707;
        if (zM51067 || this.f1675.f45575.m51067(EnumC21172.FORALL)) {
            C3168 c3168 = this.f1678;
            ((C7768) c3168.f10272).f25570 = null;
            AbstractC19728 abstractC19729 = c5887.f20169;
            C14769 c14769Mo50621 = this.f1675.f45575.mo50621();
            C14769 c14769Mo15882 = this.f1675.f45575.mo15882();
            c22010.getClass();
            C24550 c24550 = c3168.f10279.f26345;
            C9373 c9373 = c22010.f71018;
            C3408 c3408 = new C3408(c22010, abstractC19729, c24550.f38067, c14769Mo50621, c14769Mo15882);
            C12775 c12775 = new C12775(c22010);
            c12775.f40881 = c9373;
            abstractC11781M49763 = c22010.m49763(c3168, c5887, c24550, c12775, c3408);
        } else {
            abstractC11781M49763 = c5887.f20170;
            if (abstractC11781M49763 == null || abstractC11781M49763.f38066 == EnumC13603.f43205) {
                C3168 c3169 = this.f1678;
                AbstractC19728 abstractC197210 = c5887.f20169;
                AbstractC11781 abstractC11781M49775 = c22010.m49775(c5887, c3169, abstractC197210, this.f1675.f45572);
                AbstractC22664 abstractC22664 = c3169.f10279.f26345.f38067;
                abstractC11781M49763 = c22010.m49777(abstractC11781M49775, (InterfaceC5075) c5887, (AbstractC11781) abstractC22664.f73596, abstractC22664, abstractC197210, false);
            }
        }
        AbstractC11781 abstractC11782 = abstractC11781M49763;
        c5887.f20170 = abstractC11782;
        C3168 c31610 = this.f1678;
        EnumC13603 enumC13603 = c31610.f10279.f26345.f38069.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43219;
        C15252 c15252 = this.f1668;
        if (enumC13603 != enumC13604 && abstractC11782.f38066.m33349(C22114.f71276) && abstractC11782.f38069.f38066 == EnumC13603.f43213 && (abstractC19728 = c5887.f20169) != c15252.f49836 && abstractC19728 != c15252.f49851) {
            while (c31610.f10278 != null && !abstractC11782.m29567((AbstractC22970) c31610.f10279.f26345, this.f1670)) {
                c31610.f10279.f26345.mo29590();
                c31610 = c31610.f10278;
            }
        }
        EnumC13603 enumC13605 = abstractC11782.f38066;
        EnumC13603 enumC13606 = EnumC13603.f43205;
        if (enumC13605 == enumC13606) {
            C5816 c5816 = (C5816) abstractC11782;
            m1916((AbstractC22295) c5887, this.f1678, c5816, false);
            if (C22114.f71279.m50070(this.f1675.f45572)) {
                m1966(c5887, c5816, (AbstractC8036) null, this.f1678);
            }
        }
        boolean z = ((C7768) c31610.f10272).f25560;
        C22092 c22092 = this.f1698;
        if (z && abstractC11782.f38066.m33349(C22114.f71276) && abstractC11782.f38069.f38066 == EnumC13603.f43213 && (abstractC11782.mo29591() & 8) == 0) {
            if (abstractC11782.f38066 == enumC13606) {
                abstractC11781M49774 = abstractC11782;
            } else {
                C3168 c31611 = this.f1678;
                abstractC11781M49774 = c22010.m49774(c5887, c31611, c31611.f10279.f26345, c15252.f49836);
            }
            c22092.m50047(c5887, abstractC11781M49774);
        }
        C3168 c31612 = this.f1678;
        EnumC13603 enumC13607 = abstractC11782.f38066;
        if (enumC13607 != EnumC13603.f43208 && enumC13607 != EnumC13603.f43213 && (abstractC11781 = abstractC11782.f38069) != null && abstractC11781 != c31612.f10279.f26345) {
            while (c31612.f10278 != null && !c22010.m49789(this.f1678, c31612.f10279.f26345.f38067, abstractC11782)) {
                c31612 = c31612.f10278;
            }
        }
        C7768 c7768 = (C7768) this.f1678.f10272;
        if (c7768.f25556) {
            c22092.m50014(c5887, c7768.f25553);
        }
        this.f1691 = m1936(c5887, c31612.f10279.f26345.f38067, abstractC11782, this.f1678, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(final C13256 c13256) throws Throwable {
        C14479 c14479Mo30218;
        AbstractC22664 abstractC22664;
        EnumC8869 enumC8869 = (!this.f1675.f45575.m51067(EnumC21172.NONE) || (abstractC22664 = this.f1675.f45575) == AbstractC22664.f73591 || abstractC22664 == C14528.f45689) ? EnumC8869.POLY : EnumC8869.STANDALONE;
        c13256.f24265 = enumC8869;
        if (enumC8869 == EnumC8869.POLY && this.f1675.f45575.m51067(EnumC21172.VOID)) {
            this.f1675.f45571.mo3910(c13256, this.f1704.m45975(C19859.f63853));
            C12748 c12748M55139 = this.f1670.m55139(this.f1675.f45575);
            c13256.f26659 = c12748M55139;
            this.f1691 = c12748M55139;
            return;
        }
        EnumC8869 enumC88610 = c13256.f24265;
        EnumC8869 enumC88611 = EnumC8869.STANDALONE;
        if (enumC88610 == enumC88611) {
            c14479Mo30218 = this.f1687;
        } else {
            C14479 c14479 = this.f1675;
            c14479Mo30218 = c14479.mo30218(new C21939(this, c14479.f45571));
        }
        final C14479 c144710 = c14479Mo30218;
        final C18499 c18499 = new C18499();
        final C18499 c184910 = new C18499();
        m1910(c13256, c13256.f42352, c13256.f42355, new BiConsumer() { // from class: l.ۨۖ᩺
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C21351 c21351 = (C21351) obj;
                C3168 c3168 = (C3168) obj2;
                ((C7768) c3168.f10272).f25559 = c144710;
                C14769 c14769 = c21351.f68009;
                C0310 c0310 = this.f38867;
                c0310.m1983(c14769, c3168);
                new C4785(c0310, c13256, c18499, c184910).m52092(c21351.f68009);
            }
        });
        boolean zIsEmpty = c13256.f42355.isEmpty();
        C7312 c7312 = this.f1705;
        if (zIsEmpty) {
            c7312.m34520(c13256, C22843.f74132);
        } else if (c184910.isEmpty()) {
            c7312.m34520(c13256, C22843.f74182);
        }
        AbstractC22664 abstractC22664M1938 = m1938(c13256, c13256.f24265 == enumC88611 ? m1940(c18499.m43093(), c184910.m43093()) : this.f1675.f45575, C22114.f71281, this.f1675);
        c13256.f26659 = abstractC22664M1938;
        this.f1691 = abstractC22664M1938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1933(AbstractC8036 abstractC8036, C3168 c3168, C14479 c14479) {
        AbstractC22664 abstractC22664M49966;
        C3168 c3169 = this.f1678;
        C14479 c144710 = this.f1675;
        try {
            try {
                this.f1678 = c3168;
                this.f1675 = c14479;
                if (c14479.mo30575(abstractC8036)) {
                    this.f1691 = this.f1686.m19383(abstractC8036, c3168);
                } else {
                    abstractC8036.mo2284(this);
                }
                C16283 c16283 = this.f1680;
                C17775 c17775 = this.f1667;
                c16283.getClass();
                switch (C17029.f55652[abstractC8036.mo2285().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        c17775 = C16283.f52877;
                        break;
                }
                this.f1667 = c17775;
                abstractC22664M49966 = this.f1691;
            } catch (C21566 e) {
                abstractC8036.f26659 = this.f1703.f48263;
                abstractC22664M49966 = this.f1698.m49966(abstractC8036, e);
            }
            return abstractC22664M49966;
        } finally {
            this.f1678 = c3169;
            this.f1675 = c144710;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3168 m1922(C3168 c3168) {
        AbstractC8036 abstractC8036 = c3168.f10273;
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        AbstractC17836 abstractC17836M41689 = AbstractC17836.m41689(abstractC17836.f53083);
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = abstractC17836.mo7472((Predicate) null, EnumC13908.RECURSIVE).iterator();
        while (it.hasNext()) {
            c14769M35543 = c14769M35543.m35552((AbstractC11781) it.next());
        }
        Iterator it2 = c14769M35543.iterator();
        while (it2.hasNext()) {
            abstractC17836M41689.mo7481((AbstractC11781) it2.next());
        }
        C3168 c3168M10350 = c3168.m10350(abstractC8036, c7768.m21146(abstractC17836M41689));
        C3168 c3169 = c3168M10350.f10278;
        if (c3169 != null) {
            c3168M10350.f10278 = m1922(c3169);
        }
        return c3168M10350;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1934(AbstractC8036 abstractC8036, C3168 c3168, AbstractC22664 abstractC22664) {
        C22114 c22114 = C22114.f71281;
        if (abstractC22664.m51067(EnumC21172.ERROR)) {
            abstractC22664 = AbstractC22664.f73590;
        }
        return m1933(abstractC8036, c3168, new C14479(this, c22114, abstractC22664));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1981(AbstractC8036 abstractC8036, C3168 c3168, AbstractC22664 abstractC22664) {
        return m1933(abstractC8036, c3168, new C14479(this, C22114.f71269, abstractC22664));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1983(C14769 c14769, C3168 c3168) {
        while (c14769.m35550()) {
            m1932((AbstractC8036) c14769.f48335, c3168);
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22114 m1930(C22114 c22114, C14769 c14769, C3168 c3168, C18499 c18499) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            AbstractC22295 abstractC22295 = (AbstractC22295) it.next();
            AbstractC22664 abstractC22664M50037 = this.f1698.m50037(abstractC22295, m1933(abstractC22295, c3168, this.f1684 ? this.f1683 : this.f1687));
            if (abstractC22664M50037.m51067(EnumC21172.DEFERRED)) {
                c22114 = C22114.m50067(C22114.f71270, c22114);
            }
            c18499.m43089(abstractC22664M50037);
        }
        return c22114;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m1928(C14769 c14769, C3168 c3168) {
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            c18499.m43089(m1981((AbstractC8036) c14769.f48335, c3168, AbstractC22664.f73590));
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1959(C14769 c14769, C3168 c3168, boolean z) {
        C14769 c14769Of;
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C16239 c16239 = (C16239) it.next();
            C17969 c17969 = (C17969) c16239.f26659;
            c17969.f73596.f38071 |= 268435456;
            C11256 c11256 = AbstractC22664.f73590;
            c17969.mo19991(c11256);
            boolean zIsEmpty = c16239.f52785.isEmpty();
            C24705 c24705 = this.f1670;
            if (!zIsEmpty) {
                C14769 c14769Of2 = C14769.of((Object) m1981((AbstractC8036) c16239.f52785.f48335, c3168, c11256));
                Iterator it2 = c16239.f52785.f48336.iterator();
                while (it2.hasNext()) {
                    c14769Of2 = c14769Of2.m35552(m1981((AbstractC22295) it2.next(), c3168, AbstractC22664.f73590));
                }
                c14769Of = c14769Of2.m35554();
                c24705.getClass();
            } else {
                c14769Of = C14769.of((Object) this.f1703.f48286);
                c24705.getClass();
            }
            c24705.m55110(c17969, c14769Of, ((AbstractC22664) c14769Of.f48335).f73596.m29587());
            c17969.f73596.f38071 &= -268435457;
        }
        if (z) {
            Iterator it3 = c14769.iterator();
            while (it3.hasNext()) {
                C16239 c162310 = (C16239) it3.next();
                c162310.getClass();
                this.f1698.m50009(c162310, (C17969) c162310.f26659);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m1924(C18955 c18955, C3168 c3168, C12510 c12510, AbstractC22664 abstractC22664) {
        C6147 c6147 = this.f1672;
        InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c12510);
        InterfaceC15976 interfaceC15976 = c18955.f10275.f61856;
        C7312 c7312 = this.f1705;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(interfaceC15976);
        try {
            m1911(c12510, c3168);
            AbstractC22664 abstractC22664M1934 = m1934((AbstractC8036) c12510.f40171, (C3168) c18955, abstractC22664);
            if (c12510.m31064()) {
                C5816 c5816 = c12510.f40168;
                abstractC22664 = this.f1698.m49968(c12510, abstractC22664M1934, c12510.f40164);
                c5816.f38067 = abstractC22664;
                c12510.f26659 = abstractC22664;
            }
            if (abstractC22664M1934.mo39105() != null) {
                return this.f1696.m36836(abstractC22664M1934, abstractC22664).mo39105();
            }
            return null;
        } finally {
            c7312.m34530(interfaceC15976M34530);
            c6147.m17747(interfaceC5075M17747);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1941(AbstractC22295 abstractC22295, C3168 c3168, boolean z, boolean z2, boolean z3) {
        AbstractC22664 abstractC22664M1981 = abstractC22295.f26659;
        if (abstractC22664M1981 == null) {
            abstractC22664M1981 = m1981(abstractC22295, c3168, AbstractC22664.f73590);
        }
        return m1942(abstractC22664M1981, abstractC22295, z, z2, z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1942(AbstractC22664 abstractC22664, AbstractC8036 abstractC8036, boolean z, boolean z2, boolean z3) {
        if (abstractC8036.m21911(EnumC21461.f68496)) {
            abstractC8036 = ((C25191) abstractC8036).f81425;
            abstractC8036.getClass();
        }
        boolean zIsEmpty = abstractC22664.f73596.f38072.isEmpty();
        C24705 c24705 = this.f1670;
        C7312 c7312 = this.f1705;
        if (zIsEmpty) {
            c7312.m34520(abstractC8036, C22843.f74178);
            return c24705.m55139(abstractC22664);
        }
        if (abstractC22664.mo9329()) {
            return abstractC22664;
        }
        boolean zM51067 = abstractC22664.m51067(EnumC21172.TYPEVAR);
        C22092 c22092 = this.f1698;
        if (zM51067 && !z && !z2) {
            if (abstractC22664.mo19992() == null) {
                c7312.m34520(abstractC8036, C22843.f74032);
                return c24705.m55139(abstractC22664);
            }
        } else {
            abstractC22664 = c22092.m49971(abstractC8036, abstractC22664, z3);
        }
        if (z2 && (abstractC22664.f73596.mo29591() & 512) == 0) {
            c7312.m34520(abstractC8036, C22843.f74155);
            return c24705.m55139(abstractC22664);
        }
        if (z3 && z && (abstractC22664.f73596.mo29591() & 512) != 0) {
            c7312.m34520(abstractC8036, C22843.f74108);
            return c24705.m55139(abstractC22664);
        }
        if (z3 && (abstractC22664.f73596.mo29591() & 16) != 0) {
            AbstractC22970 abstractC22970 = abstractC22664.f73596;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC8036, new C11040("compiler", "cant.inherit.from.final", abstractC22970));
        }
        c22092.m50038(abstractC8036, abstractC22664);
        return abstractC22664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22664 m1904(C3168 c3168, C5887 c5887) {
        C7926 c7926 = c3168.f10279;
        Object obj = c3168.f10272;
        C24550 c24550 = c7926.f26345;
        c24550.mo29590();
        C11972.m30026((c24550.f38071 & 16384) != 0);
        C7768 c7768 = (C7768) obj;
        c5887.f26659 = c7768.f25562.f53083.m29558().f38067;
        c5887.f20170 = c7768.f25562.f53083.m29558();
        return c5887.f26659;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C0332 c0332;
        C7704 c7704M20981;
        if (((C7768) this.f1678.f10272).f25555.f76580) {
            C7044 c7044 = this.f1686;
            c7044.getClass();
            c0332 = new C0332(c7044);
        } else {
            c0332 = null;
        }
        C15867 c15867OfNullable = C15867.ofNullable(c0332);
        try {
            boolean zM33349 = ((C7768) this.f1678.f10272).f25562.f53083.f38066.m33349(C22114.f71276);
            C15846 c15846 = this.f1688;
            if (zM33349) {
                c15846.m37795(c7926, this.f1678);
            } else if (this.f1678.f10273.m21911(EnumC21461.f68518) && (c7704M20981 = C7704.m20981(this.f1678.f10275, c7926)) != null) {
                Iterator it = c7704M20981.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC19637) it.next()).mo2283() == EnumC22621.ANNOTATION) {
                        c15846.m37795(c7926, this.f1678);
                        break;
                    }
                }
            }
            C24550 c24550 = c7926.f26345;
            if (c24550 == null) {
                this.f1691 = null;
            } else {
                c24550.mo29590();
                C3168 c3168 = this.f1678;
                if (((C7768) c3168.f10272).f25560 && c3168.f10273.m21911(EnumC21461.f68518)) {
                    c24550.f38071 |= 4194304;
                }
                try {
                    this.f1669.m29000();
                    m1972(c24550);
                } catch (C21566 e) {
                    this.f1698.m49966(c7926, e);
                }
                AbstractC22664 abstractC22664 = c24550.f38067;
                c7926.f26659 = abstractC22664;
                this.f1691 = abstractC22664;
            }
            c15867OfNullable.ifPresent(new C12814());
        } catch (Throwable th) {
            c15867OfNullable.ifPresent(new C12814());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03a9  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) throws Throwable {
        C15400 c15400;
        C10377 c10377;
        C15400 c15401;
        C10377 c10378;
        AbstractC19728 abstractC19728;
        boolean z;
        C14764 c14764;
        C11040 c11040M51554;
        C12510 c12510;
        C11518 c11518 = this.f1669;
        C3605 c3605 = this.f1701;
        C15714 c15714 = this.f1700;
        C10377 c10379 = c6633.f22152;
        AbstractC19728 abstractC19729 = c6633.f22150;
        boolean z2 = (c10379.f38071 & 8796093022208L) != 0;
        C15400 c15400M36876 = ((C7768) this.f1678.f10272).f25558.m36876(c10379);
        C22092 c22092 = this.f1698;
        C15400 c15400M49962 = c22092.m49962(c15400M36876);
        C10377 c10377M49960 = c22092.m49960(c10379);
        try {
            this.f1672.m17748((AbstractC8036) c6633);
            c22092.m50003(c10379, c6633);
            C3168 c3168M11694 = c3605.m11694(c6633, this.f1678);
            Object obj = c3168M11694.f10272;
            ((C7768) obj).f25558 = c15400M36876;
            m1983(c6633.f22154, c3168M11694);
            if (c10379.mo7874()) {
                c22092.m49990(c6633, this.f1678.f10279.f26659, c10379);
            } else {
                c22092.m50049(c6633, this.f1678.f10279.f26659, c10379);
            }
            c22092.m49977(this.f1678, c6633, c10379);
            C24705 c24705 = this.f1670;
            C7312 c7312 = this.f1705;
            if (z2) {
                c10378 = c10377M49960;
                try {
                    if (c24705.m55118(c10379.m29558(), c10379)) {
                        AbstractC19728 abstractC197210 = c10379.f38072;
                        EnumC4960 enumC4960M27726 = C10925.m27726(c10379.m29579());
                        AbstractC11781 abstractC11781M29579 = c10379.m29579();
                        C11040 c11040 = C22843.f74058;
                        c15401 = c15400M49962;
                        try {
                            c7312.m34520(c6633, new C11040("compiler", "default.overrides.object.member", abstractC197210, enumC4960M27726, abstractC11781M29579));
                        } catch (Throwable th) {
                            th = th;
                            c10377 = c10378;
                            c15400 = c15401;
                            c22092.m49962(c15400);
                            c22092.m49960(c10377);
                            throw th;
                        }
                    } else {
                        c15401 = c15400M49962;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c15401 = c15400M49962;
                    c10377 = c10378;
                    c15400 = c15401;
                    c22092.m49962(c15400);
                    c22092.m49960(c10377);
                    throw th;
                }
            } else {
                c15401 = c15400M49962;
                c10378 = c10377M49960;
            }
            for (C14769 c14769 = c6633.f22154; c14769.m35550(); c14769 = c14769.f48336) {
                ((C7768) obj).f25562.mo7480(((C16239) c14769.f48335).f26659.f73596);
            }
            C24550 c24550 = this.f1678.f10279.f26345;
            c24550.mo29590();
            if ((c24550.f38071 & 8192) != 0 && (c6633.f22145.m35550() || c6633.f22149 != null)) {
                if (c6633.f22145.m35550()) {
                    c12510 = (C12510) c6633.f22145.f48335;
                    c12510.getClass();
                } else {
                    c12510 = c6633.f22149;
                    c12510.getClass();
                }
                c7312.m34520(c12510, C22843.f74210);
            }
            for (C14769 c147610 = c6633.f22145; c147610.m35550(); c147610 = c147610.f48336) {
                m1932((AbstractC8036) c147610.f48335, c3168M11694);
            }
            c22092.m49987(c6633);
            c22092.m50006(c6633.f22154, c3168M11694);
            AbstractC22295 abstractC22295 = c6633.f22147;
            if (abstractC22295 != null && !abstractC22295.f26659.m51067(EnumC21172.VOID)) {
                c22092.m49999((AbstractC8036) c6633.f22147, c3168M11694, true);
            }
            if (c6633.f22149 != null) {
                C3168 c3168M11695 = c3605.m11694(c6633, this.f1678);
                m1981(c6633.f22149, c3168M11695, AbstractC22664.f73590);
                c22092.m49999((AbstractC8036) c6633.f22149, c3168M11695, true);
            }
            boolean zM54827 = this.f1678.f10279.f26345.m54827();
            C15252 c15252 = this.f1668;
            if (zM54827 && c6633.f22152.f38069.f38066 == EnumC13603.f43213) {
                C15867 c15867FindFirst = C1170.stream(this.f1678.f10279.f26345.m54835()).filter(new C22511(0, c6633)).findFirst();
                if (c15867FindFirst.isPresent()) {
                    if (!c6633.f22152.m29601()) {
                        c7312.m34520(c6633, C22843.m51560(this.f1678.f10279.f26345, C19859.f63868));
                    }
                    if (!c24705.m55149(c6633.f22152.f38067.mo31585(), ((C22224) c15867FindFirst.get()).f38067)) {
                        c7312.m34520(c6633, C22843.m51560(this.f1678.f10279.f26345, C19859.m45716(c6633.f22152, (AbstractC11781) c15867FindFirst.get())));
                    }
                    if (c6633.f22152.f38067.mo15883().f75157 != null && !c6633.f22152.f38067.mo15883().f75157.isEmpty()) {
                        c7312.m34520(c6633, C22843.m51560(this.f1678.f10279.f26345, C19859.f63823));
                    }
                    if (!c6633.f22154.isEmpty()) {
                        c7312.m34520(c6633, C22843.m51560(this.f1678.f10279.f26345, C19859.f63876));
                    }
                    if (c6633.f22152.mo7874()) {
                        c7312.m34520(c6633, C22843.m51560(this.f1678.f10279.f26345, C19859.f63841));
                    }
                }
                AbstractC19728 abstractC197211 = c15252.f49865;
                AbstractC19728 abstractC197212 = c15252.f49836;
                if (abstractC19729 == abstractC197211) {
                    long j = c6633.f22152.f38071;
                    if ((j & 2305843009213693952L) == 0) {
                        C24533 c24533M28350 = C11239.m28350(c6633);
                        if (c24533M28350 == null || C11239.m28319(c24533M28350.f79554) != abstractC197212 || !m1977(c24533M28350, c6633, false)) {
                            c7312.m34520(c6633, C22843.m51559(this.f1678.f10279.f26345));
                        }
                    } else {
                        if ((j & 68719476736L) == 0) {
                            if (C22092.m49909(c10379.f38071) > C22092.m49909(this.f1678.f10279.f26345.mo29591())) {
                                if ((this.f1678.f10279.f26345.mo29591() & 7) == 0) {
                                    c11040M51554 = C22843.m51554(C19859.f63856, this.f1678.f10279.f26345.f38072, C19859.m45714());
                                } else {
                                    C15515 c15515 = C19859.f63856;
                                    C24550 c24551 = this.f1678.f10279.f26345;
                                    c11040M51554 = C22843.m51554(c15515, c24551.f38072, C19859.m45715(C2417.m8159(c24551.mo29591() & 7)));
                                }
                                c7312.m34520(c6633, c11040M51554);
                            }
                            C24533 c24533M28351 = C11239.m28350(c6633);
                            if (c24533M28351 != null && ((C11239.m28319(c24533M28351.f79554) == abstractC197212 || C11239.m28319(c24533M28351.f79554) == c15252.f49851) && m1977(c24533M28351, c6633, false))) {
                                c7312.m34520(c6633, C22843.m51554(C19859.f63856, this.f1678.f10279.f26345.f38072, C19859.f63826));
                            }
                        }
                        if (!c6633.f22154.isEmpty()) {
                            c7312.m34520(c6633, C22843.m51554(C19859.f63856, this.f1678.f10279.f26345.f38072, C19859.f63814));
                        }
                        C14769 c14769M54835 = this.f1678.f10279.f26345.m54835();
                        C14769 c14769M35547 = C11239.m28326(this.f1678.f10279).m35547((Function) new C7351(6));
                        Iterator it = c6633.f22145.iterator();
                        while (it.hasNext()) {
                            C12510 c12511 = (C12510) it.next();
                            Iterator it2 = it;
                            AbstractC19728 abstractC197213 = abstractC19729;
                            boolean z3 = z2;
                            boolean z4 = (c12511.f40168.f38071 & 17179869184L) != 0;
                            if (!c24705.m55149(c12511.f26659, (AbstractC22664) c14769M35547.f48335) || ((C22224) c14769M54835.f48335).m50282() != z4) {
                                c7312.m34520(c12511, C22843.m51554(C19859.f63856, this.f1678.f10279.f26345.f38072, C19859.f63825));
                            }
                            c14769M54835 = c14769M54835.f48336;
                            c14769M35547 = c14769M35547.f48336;
                            it = it2;
                            abstractC19729 = abstractC197213;
                            z2 = z3;
                        }
                    }
                    abstractC19728 = abstractC19729;
                    z = z2;
                } else {
                    abstractC19728 = abstractC19729;
                    z = z2;
                }
            } else {
                abstractC19728 = abstractC19729;
                z = z2;
            }
            if ((c24550.mo29591() & 8192) != 0) {
                if (c6633.f22146.m35550()) {
                    AbstractC22295 abstractC22296 = (AbstractC22295) c6633.f22146.f48335;
                    abstractC22296.getClass();
                    c7312.m34520(abstractC22296, C22843.f74084);
                }
                if (c6633.f22154.m35550()) {
                    C16239 c16239 = (C16239) c6633.f22154.f48335;
                    c16239.getClass();
                    c7312.m34520(c16239, C22843.f74149);
                }
                AbstractC22295 abstractC22297 = c6633.f22147;
                c22092.getClass();
                if (abstractC22297 != null) {
                    c22092.m50036(abstractC22297, abstractC22297.f26659);
                }
                c22092.m49988(c6633, c10379);
            }
            C14769 c147611 = c6633.f22146;
            while (true) {
                boolean zM35550 = c147611.m35550();
                c14764 = this.f1703;
                if (!zM35550) {
                    break;
                }
                AbstractC22295 abstractC22298 = (AbstractC22295) c147611.f48335;
                abstractC22298.getClass();
                c22092.m49970(abstractC22298, ((AbstractC22295) c147611.f48335).f26659, c14764.f48325, c22092.f71222);
                c147611 = c147611.f48336;
            }
            if (c6633.f22148 == null) {
                if (c6633.f22151 != null && (c24550.mo29591() & 8192) == 0) {
                    c7312.m34520(c6633, C22843.f74090);
                }
                if (z || (c6633.f22152.mo29591() & 1280) == 0) {
                    c7312.m34520(c6633, C22843.f74060);
                }
            } else {
                if ((c6633.f22152.mo29591() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                    if ((c24550.mo29591() & 512) != 0) {
                        C4197 c4197 = c6633.f22148;
                        c4197.getClass();
                        c7312.m34520(c4197, C22843.f74143);
                    } else {
                        c7312.m34520(c6633, C22843.f74058);
                    }
                } else if ((c6633.f22144.f15825 & 256) != 0) {
                    c7312.m34520(c6633, C22843.f74119);
                }
                if (abstractC19728 == c15252.f49865 && c24550.f38067 != c14764.f48286) {
                    C4197 c4198 = c6633.f22148;
                    if (c4198.f15344.isEmpty() || C11239.m28329(c4198.f15344, c15252) == c15252.f49799) {
                        c15714.m37551(c4198.f26658);
                        c4198.f15344 = c4198.f15344.m35552(c15714.m37567(c15714.m37550(c15714.m37565(c15252.f49851), C14769.m35543(), c15714.m37555(C14769.m35543()))));
                    } else if ((this.f1678.f10279.f26345.mo29591() & 16384) != 0 && (c6633.f22144.f15825 & 68719476736L) == 0 && C11239.m28343((AbstractC8036) c4198.f15344.f48335)) {
                        AbstractC19969 abstractC19969 = (AbstractC19969) c6633.f22148.f15344.f48335;
                        abstractC19969.getClass();
                        c7312.m34520(abstractC19969, C22843.m51551(this.f1678.f10279.f26345));
                    }
                    if (this.f1678.f10279.f26345.m54827() && (c6633.f22152.f38071 & 2305843009213693952L) != 0) {
                        if (!c6633.f22152.f33013.m35547((Function) new C18285(5)).equals(C11239.m28326(this.f1678.f10279).m35547((Function) new C14062(4)))) {
                            c7312.m34520(c6633, C22843.m51554(C19859.f63856, this.f1678.f10279.f26345.f38072, C19859.f63844));
                        }
                        if (c6633.f22152.f38067.mo15883().f75157 != null && !c6633.f22152.f38067.mo15883().f75157.isEmpty()) {
                            c7312.m34520(c6633, C22843.m51554(C11239.m28361(c6633) ? C19859.f63861 : C19859.f63856, this.f1678.f10279.f26345.f38072, new C15515("compiler", "throws.clause.not.allowed.for.canonical.constructor", C11239.m28361(c6633) ? C19859.f63861 : C19859.f63856)));
                        }
                    }
                }
                c11518.m28996(c6633.f22148, c3168M11694, c10379, (InterfaceC5075) null);
                c11518.m29000();
                m1932(c6633.f22148, c3168M11694);
            }
            ((C7768) obj).f25562.mo7484();
            AbstractC22664 abstractC22664 = c10379.f38067;
            c6633.f26659 = abstractC22664;
            this.f1691 = abstractC22664;
            c22092.m49962(c15401);
            c22092.m49960(c10378);
        } catch (Throwable th3) {
            th = th3;
            c15400 = c15400M49962;
            c10377 = c10377M49960;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C15400 c15400;
        boolean z;
        boolean z2;
        AbstractC22295 abstractC22295;
        C23743 c23743;
        AbstractC19728 abstractC19728 = c12510.f40164;
        C11518 c11518 = this.f1669;
        C3168 c3168 = this.f1678;
        AbstractC17836 abstractC17836 = ((C7768) c3168.f10272).f25562;
        EnumC13603 enumC13603 = abstractC17836.f53083.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43218;
        C3605 c3605 = this.f1701;
        C7312 c7312 = this.f1705;
        if (enumC13603 == enumC13604 || enumC13603 == EnumC13603.f43205) {
            C5816 c5816 = c12510.f40168;
            if (c5816 != null) {
                abstractC17836.mo7481(c5816);
            } else {
                if (c12510.m31064() && (c12510.f40170.f15825 & 8589934592L) == 0) {
                    AbstractC22295 abstractC22296 = c12510.f40171;
                    C15714 c15714 = this.f1700;
                    if (abstractC22296 == null) {
                        c7312.m34520(c12510, C22843.m51555(abstractC19728, C19859.f63885));
                        c12510.f40166 = c15714.m37568();
                    } else {
                        C20447 c20447 = new C20447();
                        c20447.f65493 = null;
                        c20447.f65494 = true;
                        c20447.mo5474(abstractC22296);
                        C15515 c15515 = c20447.f65493;
                        if (c15515 != null) {
                            c7312.m34520(c12510, C22843.m51555(abstractC19728, c15515));
                            c12510.f40166 = c15714.m37568();
                        }
                    }
                }
                try {
                    c11518.m29004();
                    c3605.m11696((AbstractC8036) c12510, this.f1678);
                    c11518.m29003();
                } catch (Throwable th) {
                    c11518.m29003();
                    throw th;
                }
            }
        } else {
            m1911(c12510, c3168);
        }
        C5816 c5817 = c12510.f40168;
        C15400 c15400M36876 = ((C7768) this.f1678.f10272).f25558.m36876(c5817);
        C22092 c22092 = this.f1698;
        C15400 c15400M49962 = c22092.m49962(c15400M36876);
        try {
            if (this.f1678.f10273.m21911(EnumC21461.f68453) && ((C16327) this.f1678.f10273).f53000 == EnumC17819.IMPLICIT) {
                c15400 = c15400M49962;
                z = (c12510.f40168.f38071 & 8589934592L) != 0;
                AbstractC22295 abstractC22297 = c12510.f40166;
                C3168 c3169 = this.f1678;
                if (!z || c12510.m31064()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c22092.m49999(abstractC22297, c3169, z2);
                c5817.m16959();
                this.f1672.m17748((AbstractC8036) c12510);
                c22092.m50003(c5817, c12510);
                abstractC22295 = c12510.f40171;
                if (abstractC22295 != null) {
                    if ((c5817.f38071 & 16) != 0) {
                        c3605.getClass();
                        c23743 = new C23743();
                        abstractC22295.mo2284(c23743);
                        if (!c23743.f76953) {
                            C3168 c31610 = this.f1678;
                            c3605.getClass();
                            C18955 c18955M11693 = C3605.m11693(c12510, c31610);
                            Object obj = c18955M11693.f10272;
                            ((C7768) obj).f25558 = c15400M36876;
                            ((C7768) obj).f25557 = c5817;
                            m1934((AbstractC8036) c12510.f40171, (C3168) c18955M11693, c5817.f38067);
                            if (c12510.m31064()) {
                                c5817.f38067 = c22092.m49968(c12510, c12510.f40171.f26659, abstractC19728);
                            }
                        }
                    } else {
                        C3168 c31611 = this.f1678;
                        c3605.getClass();
                        C18955 c18955M11694 = C3605.m11693(c12510, c31611);
                        Object obj2 = c18955M11694.f10272;
                        ((C7768) obj2).f25558 = c15400M36876;
                        ((C7768) obj2).f25557 = c5817;
                        m1934((AbstractC8036) c12510.f40171, (C3168) c18955M11694, c5817.f38067);
                        if (c12510.m31064()) {
                            c5817.f38067 = c22092.m49968(c12510, c12510.f40171.f26659, abstractC19728);
                        }
                    }
                    if (c12510.m31064()) {
                        m1912(c12510, c5817.f38067);
                    }
                }
                AbstractC22664 abstractC22664 = c5817.f38067;
                c12510.f26659 = abstractC22664;
                this.f1691 = abstractC22664;
                if (this.f1678.f10279.f26345.m54827() && c12510.f40168.f38069.f38066 == EnumC13603.f43213 && !c5817.mo7874() && m1921(c5817.f38072)) {
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c12510, new C11040("compiler", "illegal.record.component.name", c5817));
                }
                return;
            }
            c15400 = c15400M49962;
            c5817.m16959();
            this.f1672.m17748((AbstractC8036) c12510);
            c22092.m50003(c5817, c12510);
            abstractC22295 = c12510.f40171;
            if (abstractC22295 != null) {
                if ((c5817.f38071 & 16) != 0) {
                    c3605.getClass();
                    c23743 = new C23743();
                    abstractC22295.mo2284(c23743);
                    if (!c23743.f76953) {
                        C3168 c31612 = this.f1678;
                        c3605.getClass();
                        C18955 c18955M11695 = C3605.m11693(c12510, c31612);
                        Object obj3 = c18955M11695.f10272;
                        ((C7768) obj3).f25558 = c15400M36876;
                        ((C7768) obj3).f25557 = c5817;
                        m1934((AbstractC8036) c12510.f40171, (C3168) c18955M11695, c5817.f38067);
                        if (c12510.m31064()) {
                            c5817.f38067 = c22092.m49968(c12510, c12510.f40171.f26659, abstractC19728);
                        }
                    }
                } else {
                    C3168 c31613 = this.f1678;
                    c3605.getClass();
                    C18955 c18955M11696 = C3605.m11693(c12510, c31613);
                    Object obj4 = c18955M11696.f10272;
                    ((C7768) obj4).f25558 = c15400M36876;
                    ((C7768) obj4).f25557 = c5817;
                    m1934((AbstractC8036) c12510.f40171, (C3168) c18955M11696, c5817.f38067);
                    if (c12510.m31064()) {
                        c5817.f38067 = c22092.m49968(c12510, c12510.f40171.f26659, abstractC19728);
                    }
                }
                if (c12510.m31064()) {
                    m1912(c12510, c5817.f38067);
                }
            }
            AbstractC22664 abstractC22665 = c5817.f38067;
            c12510.f26659 = abstractC22665;
            this.f1691 = abstractC22665;
            if (this.f1678.f10279.f26345.m54827()) {
                C11040 c11041 = C22843.f74058;
                c7312.m34520(c12510, new C11040("compiler", "illegal.record.component.name", c5817));
            }
            return;
        } finally {
            c22092.m49962(c15400);
        }
        AbstractC22295 abstractC22298 = c12510.f40166;
        C3168 c31614 = this.f1678;
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        c22092.m49999(abstractC22298, c31614, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1911(C12510 c12510, C3168 c3168) {
        EnumC13603 enumC13603;
        AbstractC22295 abstractC22295 = c12510.f40171;
        if (abstractC22295 != null) {
            C4395 c4395 = c12510.f40170;
            long j = c4395.f15825;
            if ((j & 9007199254740992L) != 0 || (enumC13603 = ((C7768) c3168.f10272).f25562.f53083.f38066) == EnumC13603.f43218 || enumC13603 == EnumC13603.f43205) {
                return;
            }
            c4395.f15825 = j | 9007199254740992L;
            C5816 c5816 = c12510.f40168;
            C11518 c11518 = this.f1669;
            c11518.m28996(abstractC22295, c3168, c5816, c12510);
            c11518.m29000();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1921(AbstractC19728 abstractC19728) {
        AbstractC17836 abstractC17836Mo29571 = this.f1703.f48286.f73596.mo29571();
        C24003 c24003 = new C24003();
        abstractC17836Mo29571.getClass();
        Iterator it = abstractC17836Mo29571.mo7473(abstractC19728, c24003, EnumC13908.RECURSIVE).iterator();
        while (it.hasNext()) {
            if (((AbstractC11781) it.next()).f38067.mo50621().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1967(C22953 c22953) {
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        C3168 c3168 = this.f1678;
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        AbstractC11781 abstractC11781 = abstractC17836.f53083;
        EnumC13603 enumC13603 = abstractC11781.f38066;
        if (enumC13603 == EnumC13603.f43213 || enumC13603 == EnumC13603.f43208) {
            long j = c4197.f15345;
            C10377 c10377 = new C10377(1048576 | j | (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), this.f1668.f49799, null, ((C7768) this.f1678.f10272).f25562.f53083);
            C3168 c3169 = this.f1678;
            C7768 c7769 = (C7768) c3169.f10272;
            C3168 c3168M10350 = c3169.m10350(c4197, c7769.m21146(c7769.f25562.mo7486(c10377)));
            Object obj = c3168M10350.f10272;
            long j2 = j & 8;
            if (j2 != 0) {
                ((C7768) obj).f25554++;
            }
            C7768 c77610 = (C7768) obj;
            AbstractC11781 abstractC11782 = c77610.f25562.f53083;
            C11518 c11518 = this.f1669;
            c11518.m28996(c4197, c3168M10350, abstractC11782, (InterfaceC5075) null);
            c11518.m29000();
            m1983(c4197.f15344, c3168M10350);
            C24550 c24550 = (C24550) ((C7768) this.f1678.f10272).f25562.f53083;
            C14769 c14769Mo29597 = c77610.f25562.f53083.mo29597();
            if (j2 != 0) {
                c24550.m29595(c14769Mo29597);
            } else {
                c24550.m29578(c14769Mo29597);
            }
        } else {
            C3168 c3168M10351 = c3168.m10350(c4197, c7768.m21146(abstractC17836.mo7478(abstractC11781)));
            Object obj2 = c3168M10351.f10272;
            try {
                m1983(c4197.f15344, c3168M10351);
                ((C7768) obj2).f25562.mo7484();
            } catch (Throwable th) {
                ((C7768) obj2).f25562.mo7484();
                throw th;
            }
        }
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        AbstractC19969 abstractC19969 = c8671.f28313;
        C3168 c3168 = this.f1678;
        m1932(abstractC19969, c3168.m10350(c8671, c3168.f10272));
        m1934((AbstractC8036) c8671.f28314, this.f1678, (AbstractC22664) this.f1703.f48255);
        AbstractC19969 abstractC199610 = c8671.f28313;
        m1978(abstractC199610);
        if (!this.f1711.m56518(this.f1678, abstractC199610, this.f1700)) {
            C17775 c17775 = this.f1667;
            C14769 c14769 = c17775.f58360;
            AbstractC17836 abstractC17836 = ((C7768) this.f1678.f10272).f25562;
            C17359.requireNonNull(abstractC17836);
            C4937.forEach(c14769, new C0882(0, abstractC17836));
            C4937.forEach(c17775.f58360, new C9084());
        }
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        m1934((AbstractC8036) c6545.f21979, this.f1678, (AbstractC22664) this.f1703.f48255);
        C17775 c17775 = this.f1667;
        C3168 c3168 = this.f1678;
        C14769 c14769 = c17775.f58362;
        C14769 c147610 = c17775.f58360;
        C3168 c3168M1900 = m1900(c3168, c3168.f10273, c14769);
        Object obj = c3168M1900.f10272;
        try {
            m1932(c6545.f21978, c3168M1900.m10350(c6545, obj));
            ((C7768) obj).f25562.mo7484();
            AbstractC19969 abstractC19969 = c6545.f21978;
            m1978(abstractC19969);
            if (!this.f1711.m56518(this.f1678, abstractC19969, this.f1700)) {
                AbstractC17836 abstractC17836 = ((C7768) this.f1678.f10272).f25562;
                C17359.requireNonNull(abstractC17836);
                C4937.forEach(c147610, new C0882(0, abstractC17836));
                C4937.forEach(c147610, new C9084());
            }
            this.f1691 = null;
        } catch (Throwable th) {
            ((C7768) obj).f25562.mo7484();
            throw th;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        C3168 c3168 = this.f1678;
        AbstractC8036 abstractC8036 = c3168.f10273;
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        C3168 c3168M10350 = c3168.m10350(abstractC8036, c7768.m21146(abstractC17836.mo7478(abstractC17836.f53083)));
        Object obj = c3168M10350.f10272;
        C17775 c17775 = C16283.f52877;
        try {
            m1983(c20057.f64457, c3168M10350);
            AbstractC22295 abstractC22295 = c20057.f64458;
            if (abstractC22295 != null) {
                m1934((AbstractC8036) abstractC22295, c3168M10350, (AbstractC22664) this.f1703.f48255);
                c17775 = this.f1667;
            }
            C14769 c14769 = c17775.f58362;
            C14769 c147610 = c17775.f58360;
            C3168 c3168M1900 = m1900(c3168M10350, c3168M10350.f10273, c14769);
            try {
                c3168M1900.f10273 = c20057;
                m1983(c20057.f64455, c3168M1900);
                m1932(c20057.f64456, c3168M1900);
                ((C7768) c3168M1900.f10272).f25562.mo7484();
                this.f1691 = null;
                ((C7768) obj).f25562.mo7484();
                AbstractC19969 abstractC19969 = c20057.f64456;
                m1978(abstractC19969);
                if (this.f1711.m56518(this.f1678, abstractC19969, this.f1700)) {
                    return;
                }
                AbstractC17836 abstractC17837 = ((C7768) this.f1678.f10272).f25562;
                C17359.requireNonNull(abstractC17837);
                C4937.forEach(c147610, new C0882(0, abstractC17837));
                C4937.forEach(c147610, new C9084());
            } catch (Throwable th) {
                ((C7768) c3168M1900.f10272).f25562.mo7484();
                throw th;
            }
        } catch (Throwable th2) {
            ((C7768) obj).f25562.mo7484();
            throw th2;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        AbstractC22664 abstractC22664M55123;
        C14764 c14764 = this.f1703;
        C22092 c22092 = this.f1698;
        C24705 c24705 = this.f1670;
        C3168 c3168 = this.f1678;
        AbstractC8036 abstractC8036 = c3168.f10273;
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        C3168 c3168M10350 = c3168.m10350(abstractC8036, c7768.m21146(abstractC17836.mo7478(abstractC17836.f53083)));
        Object obj = c3168M10350.f10272;
        try {
            AbstractC22664 abstractC22664M1933 = m1933(c7180.f23711, c3168M10350, this.f1687);
            c24705.getClass();
            AbstractC22664 abstractC22664M55074 = C24705.m55074(abstractC22664M1933);
            c22092.m50037(c7180, abstractC22664M55074);
            AbstractC22664 abstractC22664M55120 = c24705.m55120(abstractC22664M55074);
            if (abstractC22664M55120 == null) {
                AbstractC22664 abstractC22664M55157 = c24705.m55157(c14764.f48272.f73596, abstractC22664M55074);
                C7312 c7312 = this.f1705;
                if (abstractC22664M55157 == null) {
                    AbstractC22295 abstractC22295 = c7180.f23711;
                    abstractC22295.getClass();
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(abstractC22295, new C11040("compiler", "foreach.not.applicable.to.type", abstractC22664M55074, C19859.f63878));
                    abstractC22664M55120 = c24705.m55139(abstractC22664M55074);
                } else {
                    C14769 c14769Mo9323 = abstractC22664M55157.mo9323();
                    if (c14769Mo9323.isEmpty()) {
                        abstractC22664M55123 = c14764.f48286;
                    } else {
                        abstractC22664M55123 = c24705.m55123((AbstractC22664) c14769Mo9323.f48335);
                    }
                    AbstractC22664 abstractC22664 = abstractC22664M55123;
                    if (c24705.m55157(c14764.f48315.f73596, this.f1707.m49762(c7180, c3168M10350, c24705.m55161(abstractC22664M55074, false), this.f1668.f49763, C14769.m35543(), C14769.m35543()).f38067.mo31585()) == null) {
                        C11040 c11041 = C22843.f74058;
                        c7312.m34520(c7180, new C11040("compiler", "foreach.not.applicable.to.type", abstractC22664M55074, C19859.f63878));
                    }
                    abstractC22664M55120 = abstractC22664;
                }
            }
            if (c7180.f23710.m31064()) {
                C12510 c12510 = c7180.f23710;
                m1912(c7180.f23710, c22092.m49968(c12510, abstractC22664M55120, c12510.f40164));
            }
            m1932((AbstractC8036) c7180.f23710, c3168M10350);
            AbstractC22295 abstractC22296 = c7180.f23711;
            abstractC22296.getClass();
            c22092.m49970(abstractC22296, abstractC22664M55120, c7180.f23710.f40168.f38067, c22092.f71222);
            c3168M10350.f10273 = c7180;
            m1932(c7180.f23709, c3168M10350);
            this.f1691 = null;
        } finally {
            ((C7768) obj).f25562.mo7484();
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1520(C17073 c17073) {
        for (C3168 c3168 = this.f1678; c3168 != null && !c3168.f10273.m21911(EnumC21461.f68501); c3168 = c3168.f10274) {
            if (c3168.f10273.m21911(EnumC21461.f68490)) {
                AbstractC19728 abstractC19728 = ((C17073) c3168.f10273).f55743;
                AbstractC19728 abstractC19729 = c17073.f55743;
                if (abstractC19728 == abstractC19729) {
                    C11040 c11040 = C22843.f74058;
                    this.f1705.m34520(c17073, new C11040("compiler", "label.already.in.use", abstractC19729));
                    break;
                }
            }
        }
        AbstractC19969 abstractC19969 = c17073.f55742;
        C3168 c3169 = this.f1678;
        m1932(abstractC19969, c3169.m10350(c17073, c3169.f10272));
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) throws Throwable {
        m1910(c15493, c15493.f50422, c15493.f50421, new BiConsumer() { // from class: l.ۛۖ᩺
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C0310 c0310 = this.f20829;
                c0310.getClass();
                c0310.m1983(((C21351) obj).f68009, (C3168) obj2);
            }
        });
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(C14637 c14637) {
        c14637.f47896 = m1901(c14637, EnumC21461.f68543, c14637.f47895, this.f1678);
        this.f1691 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1910(AbstractC8036 abstractC8036, AbstractC22295 abstractC22295, C14769 c14769, BiConsumer biConsumer) throws Throwable {
        Object obj;
        boolean zAnyMatch;
        boolean z;
        C22092 c22092;
        C14479 c14479;
        C17223 c17223;
        boolean z2;
        C17638 c17638;
        C21351 c21351;
        C24705 c24705;
        C22092 c22093;
        HashSet hashSet;
        C22010 c22010 = this.f1707;
        C14764 c14764 = this.f1703;
        C24705 c24706 = this.f1670;
        C3168 c3168 = this.f1678;
        C14479 c144710 = this.f1687;
        AbstractC22664 abstractC22664M1933 = m1933(abstractC22295, c3168, c144710);
        C3168 c3169 = this.f1678;
        C7768 c7768 = (C7768) c3169.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        C3168 c3168M10350 = c3169.m10350(abstractC8036, c7768.m21146(abstractC17836.mo7478(abstractC17836.f53083)));
        Object obj2 = c3168M10350.f10272;
        try {
            boolean z3 = (abstractC22664M1933.f73596.mo29591() & 16384) != 0;
            AbstractC22664 abstractC22664 = c14764.f48282;
            C17223 c17224 = c14764.f48253;
            boolean zM55149 = c24706.m55149(abstractC22664M1933, abstractC22664);
            C1083 c1083 = c24706.f79958;
            boolean zM28337 = C11239.m28337(abstractC22295, c14769);
            C17638 c17639 = this.f1671;
            if (!z3 && !zM55149 && !zM28337 && !c24706.m55164(abstractC22664M1933, c17224, c1083)) {
                c17639.m41294(abstractC22295, EnumC3666.f12579);
                zAnyMatch = true;
            } else {
                zAnyMatch = C1170.stream(c14769).flatMap(new C14305(0)).anyMatch(new C21019());
            }
            HashSet hashSet2 = new HashSet();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            C14769 c147610 = c14769;
            C14769 c14769M35543 = C14769.m35543();
            EnumC24528 enumC24528 = null;
            C17775 c17775 = null;
            while (true) {
                boolean zM35550 = c147610.m35550();
                z = zAnyMatch;
                c22092 = this.f1698;
                if (!zM35550) {
                    break;
                }
                obj = obj2;
                C14769 c147611 = c147610;
                C22092 c22094 = c22092;
                try {
                    C21351 c21352 = (C21351) c147611.f48335;
                    C7312 c7312 = this.f1705;
                    if (enumC24528 == null) {
                        enumC24528 = c21352.f68011;
                        c14479 = c144710;
                    } else {
                        c14479 = c144710;
                        if (enumC24528 != c21352.f68011 && !z7) {
                            c7312.m34520(c21352, C22843.f74161);
                            z7 = true;
                        }
                    }
                    Iterator it = c21352.f68007.iterator();
                    C17775 c17775M38638 = c17775;
                    EnumC24528 enumC24529 = enumC24528;
                    C14769 c14769M35552 = c14769M35543;
                    boolean z8 = z6;
                    boolean z9 = z5;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        AbstractC18367 abstractC18367 = (AbstractC18367) it.next();
                        if (abstractC18367.mo9536()) {
                            c21351 = c21352;
                            AbstractC22295 abstractC22296 = (AbstractC22295) abstractC18367;
                            if (C11239.m28351(abstractC22296)) {
                                c17223 = c17224;
                                c17639.m41294(abstractC22296, EnumC3666.f12557);
                                if (z8) {
                                    c7312.m34520(abstractC18367, C22843.f74085);
                                } else if (z5) {
                                    c7312.m34520(abstractC18367, C22843.f74028);
                                }
                                m1934((AbstractC8036) abstractC22296, c3168M10350, abstractC22664M1933);
                                C17775 c17776 = this.f1667;
                                c17638 = c17639;
                                this.f1667 = new C17775(c17776.f58362, c17776.f58360, true);
                                c22010 = c22010;
                                c24705 = c24706;
                                z8 = true;
                            } else {
                                c17223 = c17224;
                                C24705 c24707 = c24706;
                                c17638 = c17639;
                                if (z3) {
                                    AbstractC11781 abstractC11781M1902 = m1902(abstractC22664M1933, abstractC22296);
                                    if (abstractC11781M1902 == null) {
                                        c7312.m34520(abstractC22296, C22843.f74037);
                                    } else if (!hashSet2.add(abstractC11781M1902)) {
                                        c7312.m34520(abstractC18367, C22843.f74085);
                                    } else {
                                        m1914(abstractC18367, c14769M35552, abstractC11781M1902.f38067);
                                    }
                                } else if (zM28337) {
                                    InterfaceC9155 interfaceC9155 = c22010.f70998;
                                    try {
                                        c22010.f70998 = c22010.f71003;
                                        m1934((AbstractC8036) abstractC18367, c3168M10350, abstractC22664M1933);
                                        c22010.f70998 = interfaceC9155;
                                    } catch (Throwable th) {
                                        c22010.f70998 = interfaceC9155;
                                        throw th;
                                    }
                                } else {
                                    C22114 c22114 = C22114.f71277;
                                    EnumC21172 enumC21172 = EnumC21172.ERROR;
                                    AbstractC22664 abstractC22664M1934 = m1933(abstractC22296, c3168M10350, new C14479(this, c22114, !abstractC22664M1933.m51067(enumC21172) ? abstractC22664M1933 : AbstractC22664.f73590));
                                    if (!abstractC22664M1934.m51067(enumC21172)) {
                                        if (abstractC22664M1934.mo39105() == null) {
                                            AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC22296);
                                            if (abstractC11781M28352 != null && abstractC11781M28352.f38066 == EnumC13603.f43213 && this.f1706) {
                                                c7312.m34520(abstractC22296, C22843.f74082);
                                            } else {
                                                c7312.m34520(abstractC22296, zM55149 ? C22843.f74074 : C22843.f74162);
                                            }
                                        } else {
                                            if (zM55149) {
                                                c24705 = c24707;
                                            } else {
                                                c24705 = c24707;
                                                if (c24705.m55164(abstractC22664M1933, c17223, c1083)) {
                                                    c17223 = c17223;
                                                } else {
                                                    C11040 c11040 = C22843.f74058;
                                                    c17223 = c17223;
                                                    z2 = z3;
                                                    c7312.m34520(abstractC18367, new C11040("compiler", "constant.label.not.compatible", abstractC22664M1934, abstractC22664M1933));
                                                    c21351 = c21351;
                                                }
                                            }
                                            z2 = z3;
                                            if (!hashSet2.add(abstractC22664M1934.mo39105())) {
                                                c21351 = c21351;
                                                c7312.m34520(c21351, C22843.f74085);
                                            } else {
                                                c21351 = c21351;
                                                if (abstractC22664M1934.mo40452()) {
                                                    abstractC22664M1934 = c24705.m55108(abstractC22664M1934).f38067;
                                                }
                                                m1914(abstractC18367, c14769M35552, abstractC22664M1934);
                                            }
                                        }
                                    }
                                    c24705 = c24707;
                                }
                                c22010 = c22010;
                                c24705 = c24707;
                            }
                            z2 = z3;
                        } else {
                            c22010 = c22010;
                            c17223 = c17224;
                            z2 = z3;
                            c17638 = c17639;
                            c21351 = c21352;
                            c24705 = c24706;
                            if (!abstractC18367.m21911(EnumC21461.f68552)) {
                                C14479 c144711 = c14479;
                                m1933(abstractC18367, c3168M10350, c144711);
                                C22428 c22428M28354 = C11239.m28354((AbstractC2903) abstractC18367);
                                AbstractC22664 abstractC22664M50572 = c22428M28354.m50572();
                                if (abstractC22664M50572.m51067(EnumC21172.TYPEVAR)) {
                                    c22093 = c22094;
                                } else {
                                    c22093 = c22094;
                                    abstractC22664M50572 = c22093.m49967(abstractC18367, abstractC22664M50572);
                                }
                                m1919(abstractC18367, abstractC22664M1933, abstractC22664M50572);
                                AbstractC22664 abstractC22664M55132 = c24705.m55132(abstractC22664M50572);
                                if (!c22428M28354.m50573() || abstractC22664M55132.mo9329()) {
                                    hashSet = hashSet2;
                                    c14479 = c144711;
                                } else {
                                    hashSet = hashSet2;
                                    c14479 = c144711;
                                    if (c24705.m55131(c24705.m55132(abstractC22664M1933), abstractC22664M55132, true)) {
                                        if (z9) {
                                            c7312.m34520(abstractC18367, C22843.f74123);
                                        } else if (z4) {
                                            c7312.m34520(abstractC18367, C22843.f74099);
                                        }
                                        z9 = true;
                                    }
                                }
                                m1914(abstractC18367, c14769M35552, abstractC22664M55132);
                                if (c22428M28354.m50573() && !abstractC22664M55132.mo9329()) {
                                    c14769M35552 = c14769M35552.m35552(abstractC22664M55132);
                                }
                            } else {
                                if (z4) {
                                    c7312.m34520(abstractC18367, C22843.f74075);
                                } else if (z9) {
                                    c7312.m34520(abstractC18367, C22843.f74099);
                                }
                                this.f1667 = C16283.f52877;
                                z4 = true;
                            }
                            c17775M38638 = this.f1680.m38638(abstractC18367, c17775M38638, this.f1667);
                            hashSet2 = hashSet;
                            c24706 = c24705;
                            c21352 = c21351;
                            c22094 = c22093;
                            it = it2;
                            c17224 = c17223;
                            c17639 = c17638;
                            z3 = z2;
                            c22010 = c22010;
                        }
                        c22093 = c22094;
                        hashSet = hashSet2;
                        c17775M38638 = this.f1680.m38638(abstractC18367, c17775M38638, this.f1667);
                        hashSet2 = hashSet;
                        c24706 = c24705;
                        c21352 = c21351;
                        c22094 = c22093;
                        it = it2;
                        c17224 = c17223;
                        c17639 = c17638;
                        z3 = z2;
                        c22010 = c22010;
                    }
                    HashSet hashSet3 = hashSet2;
                    C22010 c22011 = c22010;
                    C17223 c17225 = c17224;
                    boolean z10 = z3;
                    C17638 c176310 = c17639;
                    C21351 c21353 = c21352;
                    C24705 c24708 = c24706;
                    C17775 c17777 = c17775M38638;
                    C3168 c3168M1900 = m1900(c3168M10350, c21353, c17777.f58362);
                    try {
                        biConsumer.accept(c21353, c3168M1900);
                        ((C7768) c3168M1900.f10272).f25562.mo7484();
                        AbstractC17836 abstractC17837 = ((C7768) obj).f25562;
                        for (C14769 c147612 = c21353.f68009; c147612.m35550(); c147612 = c147612.f48336) {
                            AbstractC8036 abstractC8037 = (AbstractC8036) c147612.f48335;
                            if (abstractC8037.m21911(EnumC21461.f68538)) {
                                abstractC17837.mo7481(((C12510) abstractC8037).f40168);
                            }
                        }
                        m1978(c21353);
                        boolean zM56517 = this.f1711.m56517(c3168M1900, c21353, this.f1700);
                        c21353.f68010 = zM56517;
                        if (c21353.f68011 != EnumC24528.STATEMENT || !zM56517) {
                            c17777 = null;
                        }
                        hashSet2 = hashSet3;
                        c147610 = c147611.f48336;
                        z5 = z9;
                        z6 = z8;
                        obj2 = obj;
                        c144710 = c14479;
                        c17224 = c17225;
                        c17639 = c176310;
                        z3 = z10;
                        c22010 = c22011;
                        c14769M35543 = c14769M35552;
                        enumC24528 = enumC24529;
                        c17775 = c17777;
                        c24706 = c24708;
                        zAnyMatch = z;
                    } catch (Throwable th2) {
                        ((C7768) c3168M1900.f10272).f25562.mo7484();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((C7768) obj).f25562.mo7484();
                    throw th;
                }
            }
            Object obj3 = obj2;
            if (z) {
                c22092.m50005(c14769);
            }
            if (abstractC8036.m21911(EnumC21461.f68544)) {
                ((C15493) abstractC8036).f50423 = z4 || z5;
                ((C15493) abstractC8036).f50420 = z;
            } else if (abstractC8036.m21911(EnumC21461.f68531)) {
                ((C13256) abstractC8036).f42351 = z4 || z5;
                ((C13256) abstractC8036).f42353 = z;
            } else {
                C11972.m30024(abstractC8036.mo2285().name());
                throw null;
            }
            ((C7768) obj3).f25562.mo7484();
        } catch (Throwable th4) {
            th = th4;
            obj = obj2;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1490(C1214 c1214) {
        c1214.f4447 = m1901(c1214, EnumC21461.f68495, c1214.f4446, this.f1678);
        this.f1691 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1914(AbstractC18367 abstractC18367, C14769 c14769, AbstractC22664 abstractC22664) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            if (this.f1670.m55131(abstractC22664, (AbstractC22664) it.next(), true)) {
                this.f1705.m34520(abstractC18367, C22843.f74028);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11781 m1902(AbstractC22664 abstractC22664, AbstractC22295 abstractC22295) {
        if (!abstractC22295.m21911(EnumC21461.f68523)) {
            return null;
        }
        C5887 c5887 = (C5887) abstractC22295;
        for (AbstractC11781 abstractC11781 : abstractC22664.f73596.mo29571().m38842(c5887.f20169)) {
            if (abstractC11781.f38066 == EnumC13603.f43205) {
                c5887.f20170 = abstractC11781;
                ((C5816) abstractC11781).m16959();
                c5887.f26659 = abstractC11781.f38067;
                if ((abstractC11781.f38071 & 16384) == 0) {
                    return null;
                }
                return abstractC11781;
            }
        }
        return null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1948(C5799 c5799) {
        AbstractC22664 abstractC22664;
        AbstractC22970 abstractC22970;
        this.f1698.m49958(c5799, m1933(c5799.f19919, this.f1678, this.f1687));
        C15400 c15400 = ((C7768) this.f1678.f10272).f25558;
        EnumC19876 enumC19876 = EnumC19876.SYNCHRONIZATION;
        if (c15400.m36878(enumC19876) && (abstractC22664 = c5799.f19919.f26659) != null && (abstractC22970 = abstractC22664.f73596) != null && (abstractC22970.mo29591() & 9007199254740992L) != 0) {
            this.f1705.m34532(enumC19876, c5799, C13146.f42062);
        }
        m1932(c5799.f19918, this.f1678);
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        C3168 c3168M10350;
        C14764 c14764;
        C22092 c22092 = this.f1698;
        C3168 c3168 = this.f1678;
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        C3168 c3168M10351 = c3168.m10350(c11764, c7768.m21146(abstractC17836.mo7478(abstractC17836.f53083)));
        Object obj = c3168M10351.f10272;
        try {
            boolean zM35550 = c11764.f38023.m35550();
            if (zM35550) {
                C3168 c3169 = this.f1678;
                AbstractC17836 abstractC17837 = ((C7768) obj).f25562;
                c3168M10350 = c3169.m10350(c11764, ((C7768) obj).m21146(abstractC17837.mo7478(abstractC17837.f53083)));
            } else {
                c3168M10350 = c3168M10351;
            }
            try {
                Iterator it = c11764.f38023.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c14764 = this.f1703;
                    if (!zHasNext) {
                        break;
                    }
                    AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
                    C14479 c14479 = new C14479(this, C22114.f71275, c14764.f48280, new C10750(this, this.f1675.f45571));
                    if (abstractC8036.m21911(EnumC21461.f68538)) {
                        m1932(abstractC8036, c3168M10350);
                        c14479.mo30220(abstractC8036, abstractC8036.f26659);
                        m1947((InterfaceC5075) abstractC8036, c3168M10351, abstractC8036.f26659);
                        ((C12510) abstractC8036).f40168.m16955(EnumC5296.RESOURCE_VARIABLE);
                    } else {
                        m1933(abstractC8036, c3168M10350, c14479);
                    }
                }
                m1932(c11764.f38022, c3168M10350);
                if (zM35550) {
                    ((C7768) c3168M10350.f10272).f25562.mo7484();
                }
                for (C14769 c14769 = c11764.f38025; c14769.m35550(); c14769 = c14769.f48336) {
                    C0468 c0468 = (C0468) c14769.f48335;
                    AbstractC17836 abstractC17838 = ((C7768) obj).f25562;
                    C3168 c3168M10352 = c3168M10351.m10350(c0468, ((C7768) obj).m21146(abstractC17838.mo7478(abstractC17838.f53083)));
                    try {
                        AbstractC22664 abstractC22664M1932 = m1932(c0468.f2080, c3168M10352);
                        if (c0468.f2080.f40166.m21911(EnumC21461.f68499)) {
                            c0468.f2080.f40168.f38071 |= 549755813904L;
                        }
                        C5816 c5816 = c0468.f2080.f40168;
                        if (c5816.f38066 == EnumC13603.f43205) {
                            c5816.m16955(EnumC5296.EXCEPTION_PARAMETER);
                        }
                        AbstractC22295 abstractC22295 = c0468.f2080.f40166;
                        abstractC22295.getClass();
                        AbstractC22295 abstractC22296 = c0468.f2080.f40166;
                        abstractC22296.getClass();
                        c22092.m49970(abstractC22295, c22092.m50044(abstractC22296, abstractC22664M1932), c14764.f48325, c22092.f71222);
                        m1932(c0468.f2079, c3168M10352);
                        ((C7768) c3168M10352.f10272).f25562.mo7484();
                    } catch (Throwable th) {
                        ((C7768) c3168M10352.f10272).f25562.mo7484();
                        throw th;
                    }
                }
                AbstractC8036 abstractC8037 = c11764.f38024;
                if (abstractC8037 != null) {
                    m1932(abstractC8037, c3168M10351);
                }
                this.f1691 = null;
                ((C7768) obj).f25562.mo7484();
            } catch (Throwable th2) {
                if (zM35550) {
                    ((C7768) c3168M10350.f10272).f25562.mo7484();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            ((C7768) obj).f25562.mo7484();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1947(InterfaceC5075 interfaceC5075, C3168 c3168, AbstractC22664 abstractC22664) {
        if (abstractC22664.mo9329()) {
            return;
        }
        C14764 c14764 = this.f1703;
        AbstractC22970 abstractC22970 = c14764.f48280.f73596;
        C24705 c24705 = this.f1670;
        if (c24705.m55157(abstractC22970, abstractC22664) == null || c24705.m55149(abstractC22664, c14764.f48280)) {
            return;
        }
        C7312 c7312 = this.f1705;
        C9548 c9548 = new C9548(c7312);
        try {
            C22010 c22010 = this.f1707;
            AbstractC22664 abstractC22664M55161 = c24705.m55161(abstractC22664, false);
            AbstractC19728 abstractC19728 = this.f1668.f49781;
            C14769 c14769M35543 = C14769.m35543();
            C14769 c14769M35544 = C14769.m35543();
            c22010.getClass();
            AbstractC11781 abstractC11781M49772 = c22010.m49772(interfaceC5075, c3168, abstractC22664M55161.f73596, abstractC22664M55161, abstractC19728, c14769M35543, c14769M35544);
            c7312.m20036(c9548);
            if (abstractC11781M49772.f38066 == EnumC13603.f43218 && abstractC11781M49772.mo26689(c14764.f48287, abstractC22664.f73596, c24705, true)) {
                AbstractC22664 abstractC22665 = c14764.f48312;
                C14769 c14769Mo50622 = c24705.m55126(abstractC11781M49772, abstractC22664).mo50622();
                C22092 c22092 = this.f1698;
                if (c22092.m50054(abstractC22665) || c22092.m50059(abstractC22665, c14769Mo50622)) {
                    C15400 c15400 = ((C7768) c3168.f10272).f25558;
                    EnumC19876 enumC19876 = EnumC19876.TRY;
                    if (c15400.m36878(enumC19876)) {
                        C25213 c25213 = C13146.f42046;
                        c7312.m34532(enumC19876, interfaceC5075, new C25213("compiler", "try.resource.throws.interrupted.exc", abstractC22664));
                    }
                }
            }
        } catch (Throwable th) {
            c7312.m20036(c9548);
            throw th;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        C14479 c14479Mo30218;
        AbstractC22664 abstractC22664M36836;
        AbstractC22664 abstractC22664;
        AbstractC22664 abstractC22664M1934 = m1934((AbstractC8036) c10162.f32546, this.f1678, (AbstractC22664) this.f1703.f48255);
        C17775 c17775 = this.f1667;
        EnumC8869 enumC8869 = (!this.f1684 || !(!this.f1675.f45575.m51067(EnumC21172.NONE) || (abstractC22664 = this.f1675.f45575) == AbstractC22664.f73591 || abstractC22664 == C14528.f45689) || m1918(this.f1678, c10162)) ? EnumC8869.STANDALONE : EnumC8869.POLY;
        c10162.f24265 = enumC8869;
        if (enumC8869 == EnumC8869.POLY && this.f1675.f45575.m51067(EnumC21172.VOID)) {
            this.f1675.f45571.mo3910(c10162, this.f1704.m45975(C19859.f63863));
            C12748 c12748M55139 = this.f1670.m55139(this.f1675.f45575);
            c10162.f26659 = c12748M55139;
            this.f1691 = c12748M55139;
            return;
        }
        EnumC8869 enumC88610 = c10162.f24265;
        EnumC8869 enumC88611 = EnumC8869.STANDALONE;
        if (enumC88610 == enumC88611) {
            c14479Mo30218 = this.f1687;
        } else {
            C14479 c14479 = this.f1675;
            c14479Mo30218 = c14479.mo30218(new C19701(this, c14479.f45571));
        }
        C3168 c3168 = this.f1678;
        C3168 c3168M1900 = m1900(c3168, c3168.f10273, c17775.f58362);
        Object obj = c3168M1900.f10272;
        try {
            AbstractC22664 abstractC22664M1933 = m1933(c10162.f32544, c3168M1900, c14479Mo30218);
            ((C7768) obj).f25562.mo7484();
            C17775 c17776 = this.f1667;
            C3168 c3169 = this.f1678;
            C3168 c3168M1901 = m1900(c3169, c3169.f10273, c17775.f58360);
            Object obj2 = c3168M1901.f10272;
            try {
                AbstractC22664 abstractC22664M1935 = m1933(c10162.f32545, c3168M1901, c14479Mo30218);
                ((C7768) obj2).f25562.mo7484();
                C17775 c17777 = this.f1667;
                if (c10162.f24265 != enumC88611) {
                    abstractC22664M36836 = this.f1675.f45575;
                } else {
                    AbstractC22295 abstractC22295 = c10162.f32544;
                    abstractC22295.getClass();
                    AbstractC22295 abstractC22296 = c10162.f32545;
                    abstractC22296.getClass();
                    abstractC22664M36836 = m1940(C14769.of((Object) abstractC22295, (Object) abstractC22296), C14769.of((Object) abstractC22664M1933, (Object) abstractC22664M1935));
                }
                if (abstractC22664M1934.mo39105() != null && abstractC22664M1933.mo39105() != null && abstractC22664M1935.mo39105() != null && !abstractC22664M36836.m51067(EnumC21172.NONE)) {
                    if (!abstractC22664M1934.mo40453()) {
                        abstractC22664M1933 = abstractC22664M1935;
                    }
                    abstractC22664M36836 = this.f1696.m36836(abstractC22664M1933, abstractC22664M36836);
                }
                this.f1691 = m1938(c10162, abstractC22664M36836, C22114.f71281, this.f1675);
                this.f1667 = this.f1680.m38636(c10162, c17775, c17776, c17777);
            } catch (Throwable th) {
                ((C7768) obj2).f25562.mo7484();
                throw th;
            }
        } catch (Throwable th2) {
            ((C7768) obj).f25562.mo7484();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1918(C3168 c3168, AbstractC22295 abstractC22295) {
        AbstractC22664 abstractC22664;
        int i = C13559.f43052[abstractC22295.mo2285().ordinal()];
        C14479 c14479 = this.f1687;
        C7044 c7044 = this.f1686;
        C12863 c12863 = this.f1710;
        switch (i) {
            case 1:
                EnumC21172 enumC21172 = ((C23787) abstractC22295).f77042;
                return enumC21172.m48309(EnumC21172.DOUBLE) || enumC21172 == EnumC21172.BOOLEAN || enumC21172 == EnumC21172.BOT;
            case 2:
            case 3:
                return false;
            case 4:
                return m1918(c3168, ((C1412) abstractC22295).f4986);
            case 5:
                C10162 c10162 = (C10162) abstractC22295;
                return m1918(c3168, c10162.f32544) && m1918(c3168, c10162.f32545);
            case 6:
                c7044.getClass();
                C24533 c24533 = (C24533) c12863.m31896(abstractC22295, c3168, c14479, c12863.f41185, null, EnumC23584.SPECULATIVE, new C0332(c7044));
                AbstractC11781 abstractC11781M28352 = C11239.m28352(c24533.f79554);
                if (c24533.f79554.m21911(EnumC21461.f68523)) {
                    abstractC22664 = c3168.f10279.f26659;
                } else {
                    abstractC22664 = ((C23041) c24533.f79554).f74776.f26659;
                }
                return m1984(this.f1670.m55126(abstractC11781M28352, abstractC22664).mo31585());
            case 7:
                AbstractC22295 abstractC22296 = (AbstractC22295) this.f1679.mo8479(((C18565) abstractC22295).f60323);
                c7044.getClass();
                return m1984(((AbstractC22295) c12863.m31896(abstractC22296, c3168, this.f1713, c12863.f41185, null, EnumC23584.SPECULATIVE, new C0332(c7044))).f26659);
            default:
                c7044.getClass();
                return m1984(c12863.m31896(abstractC22295, c3168, c14479, c12863.f41185, null, EnumC23584.SPECULATIVE, new C0332(c7044)).f26659);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1984(AbstractC22664 abstractC22664) {
        return (abstractC22664.m51067(EnumC21172.TYPEVAR) || abstractC22664.mo9329() || !this.f1670.m55145(abstractC22664).mo40452()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1940(C14769 c14769, C14769 c147610) {
        boolean zIsEmpty = c147610.isEmpty();
        C14764 c14764 = this.f1703;
        if (zIsEmpty) {
            return c14764.f48286;
        }
        final AbstractC22664 abstractC22664 = (AbstractC22664) c147610.f48335;
        if (C1170.stream(c147610.f48336).allMatch(new Predicate() { // from class: l.ۚۖ᩺
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f18793.f1670.m55149(abstractC22664, (AbstractC22664) obj);
            }
        })) {
            return abstractC22664.mo4935();
        }
        C14769<AbstractC22664> c147611 = (C14769) C1170.stream(c147610).map(new C1628(this, 0)).collect(C14769.m35544());
        if (C1170.stream(c147611).allMatch(new C10754(3))) {
            for (final AbstractC22664 abstractC22665 : c147611) {
                if (abstractC22665.mo9097().m48308(EnumC21172.INT) && C1170.stream(c147611).filter(new C11322(abstractC22665, 0)).allMatch(new Predicate() { // from class: l.᩻ۖ᩺
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        AbstractC22664 abstractC22666 = (AbstractC22664) obj;
                        C0310 c0310 = this.f80130;
                        c0310.getClass();
                        if (!abstractC22666.m51067(EnumC21172.INT)) {
                            return false;
                        }
                        C24705 c24705 = c0310.f1670;
                        return c24705.m55164(abstractC22666, abstractC22665, c24705.f79958);
                    }
                })) {
                    return abstractC22665.mo4935();
                }
            }
            for (EnumC21172 enumC21172 : f1666) {
                final AbstractC22664 abstractC22666 = c14764.f48292[enumC21172.ordinal()];
                if (C1170.stream(c147611).allMatch(new Predicate() { // from class: l.ܺۖ᩺
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return this.f53546.f1670.m55131((AbstractC22664) obj, abstractC22666, true);
                    }
                })) {
                    return abstractC22666;
                }
            }
        }
        C14769<AbstractC22664> c147612 = (C14769) C1170.stream(c147610).map(new Function() { // from class: l.ܶۖ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AbstractC22664 abstractC22667 = (AbstractC22664) obj;
                return abstractC22667.mo40452() ? this.f51398.f1670.m55108(abstractC22667).f38067 : abstractC22667;
            }
        }).collect(C14769.m35544());
        for (final AbstractC22664 abstractC22667 : c147612) {
            if (C1170.stream(c147612).filter(new Predicate() { // from class: l.᩹ۖ᩺
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((AbstractC22664) obj) != abstractC22667;
                }
            }).allMatch(new Predicate() { // from class: l.ۗۖ᩺
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C24705 c24705 = this.f10093.f1670;
                    return c24705.m55164((AbstractC22664) obj, abstractC22667, c24705.f79958);
                }
            })) {
                return abstractC22667.mo4935();
            }
        }
        final Iterator it = c14769.iterator();
        return this.f1670.m55147((C14769) C1170.stream((C14769) C1170.stream(c147612).map(new Function() { // from class: l.᩵ۖ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f65093.f1698.m50037((InterfaceC5075) it.next(), (AbstractC22664) obj);
            }
        }).collect(C14769.m35544())).map(new C3984(10)).filter(new C6563(5)).collect(C14769.m35544()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3168 m1900(C3168 c3168, AbstractC8036 abstractC8036, C14769 c14769) {
        C7768 c7768 = (C7768) c3168.f10272;
        AbstractC17836 abstractC17836 = c7768.f25562;
        C3168 c3168M10350 = c3168.m10350(abstractC8036, c7768.m21146(abstractC17836.mo7478(abstractC17836.f53083)));
        AbstractC17836 abstractC17837 = ((C7768) c3168M10350.f10272).f25562;
        C17359.requireNonNull(abstractC17837);
        C4937.forEach(c14769, new C0882(0, abstractC17837));
        return c3168M10350;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        boolean zM56517;
        m1934((AbstractC8036) c2158.f7114, this.f1678, (AbstractC22664) this.f1703.f48255);
        C17775 c17775 = this.f1667;
        C3168 c3168 = this.f1678;
        C14769 c14769 = c17775.f58362;
        C14769 c147610 = c17775.f58360;
        C3168 c3168M1900 = m1900(c3168, c3168.f10273, c14769);
        Object obj = c3168M1900.f10272;
        try {
            m1932(c2158.f7115, c3168M1900);
            ((C7768) obj).f25562.mo7484();
            m1978(c2158.f7115);
            C3168 c3169 = this.f1678;
            AbstractC19969 abstractC19969 = c2158.f7115;
            C25301 c25301 = this.f1711;
            C15714 c15714 = this.f1700;
            boolean zM56518 = c25301.m56517(c3169, abstractC19969, c15714);
            if (c2158.f7116 != null) {
                C3168 c31610 = this.f1678;
                C3168 c3168M1901 = m1900(c31610, c31610.f10273, c147610);
                Object obj2 = c3168M1901.f10272;
                try {
                    m1932(c2158.f7116, c3168M1901);
                    ((C7768) obj2).f25562.mo7484();
                    m1978(c2158.f7116);
                    zM56517 = c25301.m56517(this.f1678, c2158.f7116, c15714);
                } catch (Throwable th) {
                    ((C7768) obj2).f25562.mo7484();
                    throw th;
                }
            } else {
                zM56517 = true;
            }
            this.f1698.m49976(c2158);
            C14769 c14769M35543 = C14769.m35543();
            if (zM56518 && !zM56517) {
                c147610 = c17775.f58362;
            } else if (!zM56517 || zM56518) {
                c147610 = c14769M35543;
            }
            AbstractC17836 abstractC17836 = ((C7768) this.f1678.f10272).f25562;
            C17359.requireNonNull(abstractC17836);
            C4937.forEach(c147610, new C0882(0, abstractC17836));
            C4937.forEach(c147610, new C9084());
            this.f1691 = null;
        } catch (Throwable th2) {
            ((C7768) obj).f25562.mo7484();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1978(AbstractC8036 abstractC8036) {
        this.f1712.m14640();
        new C15225(this).mo5474(abstractC8036);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1952(C11106 c11106) {
        C3168 c3168 = this.f1678;
        m1933(c11106.f35018, c3168.m10350(c11106, c3168.f10272), this.f1687);
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        C11040 c11040;
        C3168 c3168 = this.f1678;
        C14479 c14479 = ((C7768) c3168.f10272).f25559;
        if (c14479 != null) {
            m1933(c4307.f15611, c3168, c14479);
            c4307.f15610 = m1901(c4307, EnumC21461.f68481, this.f1668.f49799, this.f1678);
        } else {
            if (c4307.f15611.m21911(EnumC21461.f68475)) {
                c11040 = C22843.f74175;
            } else {
                c11040 = C22843.f74049;
            }
            this.f1705.m34520(c4307, c11040);
            m1933(c4307.f15611, this.f1678, this.f1687);
        }
        this.f1691 = null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC8036 m1901(AbstractC19969 abstractC19969, EnumC21461 enumC21461, AbstractC19728 abstractC19728, C3168 c3168) {
        C5558 c5558;
        Object obj;
        int i;
        C11040 c11040 = null;
        while (true) {
            if (c3168 != null && (i = C13559.f43052[c3168.f10273.mo2285().ordinal()]) != 2) {
                switch (i) {
                    case 8:
                        C17073 c17073 = (C17073) c3168.f10273;
                        if (abstractC19728 != c17073.f55743) {
                            c3168 = c3168.f10274;
                        } else if (enumC21461 != EnumC21461.f68495) {
                            c5558 = new C5558(c17073, c11040);
                        } else {
                            if (!c17073.f55742.m21911(EnumC21461.f68513) && !c17073.f55742.m21911(EnumC21461.f68524) && !c17073.f55742.m21911(EnumC21461.f68549) && !c17073.f55742.m21911(EnumC21461.f68473)) {
                                C11040 c11041 = C22843.f74058;
                                c11040 = new C11040("compiler", "not.loop.label", abstractC19728);
                            }
                            c5558 = new C5558(C11239.m28330(c17073), c11040);
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (abstractC19728 != null) {
                            c3168 = c3168.f10274;
                        } else {
                            c5558 = new C5558(c3168.f10273, c11040);
                        }
                        break;
                    case 13:
                        if (abstractC19728 == null && enumC21461 == EnumC21461.f68543) {
                            c5558 = new C5558(c3168.f10273, null);
                        } else {
                            c3168 = c3168.f10274;
                        }
                        break;
                    case 14:
                        if (enumC21461 != EnumC21461.f68481) {
                            c11040 = enumC21461 == EnumC21461.f68543 ? C22843.f74173 : C22843.f74031;
                            c3168 = c3168.f10274;
                        } else {
                            c5558 = new C5558(c3168.f10273, null);
                        }
                        break;
                    case 15:
                    case 16:
                        break;
                    default:
                        c3168 = c3168.f10274;
                        break;
                }
                obj = c5558.f19301;
                if (obj != null) {
                    this.f1705.m34520(abstractC19969, (C11040) obj);
                }
                return (AbstractC8036) c5558.f19300;
            }
            if (abstractC19728 != null) {
                C11040 c11042 = C22843.f74058;
                c5558 = new C5558(null, new C11040("compiler", "undef.label", abstractC19728));
            } else if (c11040 != null) {
                c5558 = new C5558(null, c11040);
            } else {
                c5558 = enumC21461 == EnumC21461.f68495 ? new C5558(null, C22843.f74095) : new C5558(null, C22843.f74112);
            }
            obj = c5558.f19301;
            if (obj != null) {
                this.f1705.m34520(abstractC19969, (C11040) obj);
            }
            return (AbstractC8036) c5558.f19300;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        C6633 c6633;
        C3168 c3168 = this.f1678;
        C7768 c7768 = (C7768) c3168.f10272;
        C14479 c14479 = c7768.f25564;
        C7312 c7312 = this.f1705;
        if (c14479 == null) {
            c7312.m34520(c11018, C22843.f74069);
        } else if (c7768.f25559 != null) {
            c7312.m34520(c11018, C22843.f74041);
        } else if (!c7768.f25565 && !c7768.f25561 && (c6633 = c3168.f10277) != null && C11239.m28361(c6633)) {
            C6633 c6634 = this.f1678.f10277;
            c7312.m34520(c6634, C22843.m51554(C19859.f63861, c6634.f22152.f38072, C19859.f63849));
        } else {
            AbstractC22295 abstractC22295 = c11018.f34795;
            C19991 c19991 = this.f1704;
            if (abstractC22295 != null) {
                if (((C7768) this.f1678.f10272).f25564.f45575.m51067(EnumC21172.VOID)) {
                    InterfaceC1013 interfaceC1013 = ((C7768) this.f1678.f10272).f25564.f45571;
                    AbstractC22295 abstractC22296 = c11018.f34795;
                    abstractC22296.getClass();
                    interfaceC1013.mo3910(abstractC22296, c19991.m45975(C19859.f63828));
                }
                AbstractC22295 abstractC22297 = c11018.f34795;
                C3168 c3169 = this.f1678;
                m1933(abstractC22297, c3169, ((C7768) c3169.f10272).f25564);
            } else if (!((C7768) this.f1678.f10272).f25564.f45575.m51067(EnumC21172.VOID) && !((C7768) this.f1678.f10272).f25564.f45575.m51067(EnumC21172.NONE)) {
                C14479 c144710 = ((C7768) this.f1678.f10272).f25564;
                c144710.f45571.mo3910(c11018, c19991.m45975(C19859.m45717(c144710.f45575)));
            }
        }
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        AbstractC22295 abstractC22295 = c2070.f6892;
        C3168 c3168 = this.f1678;
        C14764 c14764 = this.f1703;
        boolean z = this.f1684;
        AbstractC22664 abstractC22664M1934 = m1934((AbstractC8036) abstractC22295, c3168, z ? AbstractC22664.f73590 : c14764.f48325);
        if (z) {
            AbstractC22664 abstractC22664 = c14764.f48325;
            C22092 c22092 = this.f1698;
            c22092.m49970(c2070, abstractC22664M1934, abstractC22664, c22092.f71222);
        }
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1494(C3451 c3451) {
        m1934((AbstractC8036) c3451.f11254, this.f1678, (AbstractC22664) this.f1703.f48255);
        AbstractC22295 abstractC22295 = c3451.f11255;
        if (abstractC22295 != null) {
            this.f1698.m50037(abstractC22295, m1933(abstractC22295, this.f1678, this.f1687));
        }
        this.f1691 = null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        AbstractC22664 abstractC22664;
        char c;
        AbstractC22664 abstractC22664M55137;
        C14764 c14764;
        C3168 c3168 = this.f1678;
        C7768 c7768 = (C7768) c3168.f10272;
        C3168 c3168M10350 = c3168.m10350(c24533, c7768.m21146(c7768.f25562));
        Object obj = c3168M10350.f10272;
        AbstractC19728 abstractC19728M28319 = C11239.m28319(c24533.f79554);
        C15252 c15252 = this.f1668;
        AbstractC19728 abstractC19728 = c15252.f49836;
        AbstractC19728 abstractC19729 = c15252.f49851;
        boolean z = abstractC19728M28319 == abstractC19728 || abstractC19728M28319 == abstractC19729;
        C18499 c18499 = new C18499();
        C22092 c22092 = this.f1698;
        if (z) {
            m1977(c24533, this.f1678.f10277, true);
            C7768 c7769 = (C7768) obj;
            c7769.f25560 = true;
            C22114 c22114M1930 = m1930(C22114.f71278, c24533.f79555, c3168M10350, c18499);
            C14769 c14769M43093 = c18499.m43093();
            C14769 c14769 = c24533.f79552;
            C14769 c14769M1928 = m1928(c14769, c3168M10350);
            c22092.m50007(c14769, c14769M1928);
            AbstractC22664 abstractC22665 = this.f1678.f10279.f26345.f38067;
            C7312 c7312 = this.f1705;
            C14764 c14765 = this.f1703;
            if (abstractC19728M28319 == abstractC19729) {
                AbstractC22664 abstractC22666 = c14765.f48286;
                C24705 c24705 = this.f1670;
                if (abstractC22665 == abstractC22666) {
                    AbstractC22295 abstractC22295 = c24533.f79554;
                    abstractC22295.getClass();
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(abstractC22295, new C11040("compiler", "no.superclass", abstractC22665));
                    abstractC22664M55137 = c24705.m55139(c14765.f48286);
                } else {
                    abstractC22664M55137 = c24705.m55137(abstractC22665);
                }
                c = 0;
            } else {
                c22114M1930 = c22114M1930;
                c14769M1928 = c14769M1928;
                c = 0;
                abstractC22664M55137 = abstractC22665;
            }
            if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
                AbstractC22664 abstractC22664Mo23449 = abstractC22664M55137.mo23449();
                while (abstractC22664Mo23449 != null && abstractC22664Mo23449.m51067(EnumC21172.TYPEVAR)) {
                    abstractC22664Mo23449 = abstractC22664Mo23449.mo19992();
                }
                if (abstractC22664Mo23449.m51067(EnumC21172.CLASS)) {
                    if (c24533.f79554.m21911(EnumC21461.f68485)) {
                        AbstractC22295 abstractC22296 = ((C23041) c24533.f79554).f74776;
                        abstractC22296.getClass();
                        c22092.m49958(abstractC22296, m1934((AbstractC8036) abstractC22296, c3168M10350, abstractC22664Mo23449));
                    } else if (abstractC19728M28319 == abstractC19729) {
                        AbstractC22295 abstractC22297 = c24533.f79554;
                        abstractC22297.getClass();
                        this.f1707.m49786((InterfaceC5075) abstractC22297, c3168M10350, abstractC22664M55137, true);
                    }
                } else if (c24533.f79554.m21911(EnumC21461.f68485)) {
                    AbstractC22295 abstractC22298 = c24533.f79554;
                    abstractC22298.getClass();
                    AbstractC22970 abstractC22970 = abstractC22664M55137.f73596;
                    C11040 c11041 = C22843.f74058;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC22970;
                    c7312.m34520(abstractC22298, new C11040("compiler", "illegal.qual.not.icls", objArr));
                    m1934((AbstractC8036) ((C23041) c24533.f79554).f74776, c3168M10350, abstractC22664M55137);
                }
                if (abstractC22664M55137.f73596 == c14765.f48309) {
                    c14769M43093 = c14769M43093.m35552(c14765.f48253).m35552(c14765.f48282);
                }
                boolean z2 = c7769.f25569;
                c7769.f25569 = true;
                c7769.f25570 = null;
                AbstractC22295 abstractC22299 = c24533.f79554;
                abstractC22299.getClass();
                C14769 c147610 = c14769M1928;
                AbstractC11781 abstractC11781M49773 = this.f1707.m49773(abstractC22299, c3168M10350, abstractC22664M55137, c14769M43093, c147610);
                c7769.f25569 = z2;
                C11239.m28356(abstractC11781M49773, c24533.f79554);
                c14764 = c14765;
                m1936(c24533.f79554, abstractC22664M55137, abstractC11781M49773, c3168M10350, new C14479(this, c22114M1930, m1944(this.f1675.f45575, c14769M43093, c147610)));
            } else {
                c14764 = c14765;
                if (abstractC22664M55137.m51067(EnumC21172.ERROR) && c24533.f79554.m21911(EnumC21461.f68485)) {
                    m1934((AbstractC8036) ((C23041) c24533.f79554).f74776, c3168M10350, abstractC22664M55137);
                }
            }
            C15731 c15731 = c14764.f48251;
            c24533.f26659 = c15731;
            this.f1691 = c15731;
        } else {
            C22114 c22114 = C22114.f71281;
            C22114 c22114M1931 = m1930(c22114, c24533.f79555, c3168M10350, c18499);
            C14769 c14769M43094 = c18499.m43093();
            C14769 c14769M1929 = m1928(c24533.f79552, c3168M10350);
            AbstractC22664 abstractC22664M1944 = m1944(this.f1675.f45575, c14769M43094, c14769M1929);
            ((C7768) obj).f25570 = null;
            AbstractC22664 abstractC22664M1933 = m1933(c24533.f79554, c3168M10350, new C14479(this, c22114M1931, abstractC22664M1944, this.f1675.f45571));
            AbstractC22664 abstractC22664Mo31585 = abstractC22664M1933.mo31585();
            if (abstractC22664Mo31585.m51067(EnumC21172.WILDCARD)) {
                throw new AssertionError(abstractC22664M1933);
            }
            if (c24533.f79554.m21911(EnumC21461.f68485)) {
                abstractC22664 = ((C23041) c24533.f79554).f74776.f26659;
            } else {
                abstractC22664 = this.f1678.f10279.f26345.f38067;
            }
            AbstractC22664 abstractC22664M1939 = m1939(C11239.m28352(c24533.f79554), abstractC22664, abstractC19728M28319, c14769M43094, abstractC22664Mo31585);
            c22092.m50007(c24533.f79552, c14769M1929);
            this.f1691 = m1938(c24533, this.f1675.f45571.mo2276().m8695((AbstractC8036) c24533, abstractC22664M1939, true), c22114, this.f1675);
        }
        c22092.m50006(c24533.f79552, c3168M10350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1939(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, AbstractC22664 abstractC22665) {
        C24705 c24705 = this.f1670;
        C15252 c15252 = this.f1668;
        C14764 c14764 = this.f1703;
        if (abstractC11781 != null && abstractC11781.f38069 == c14764.f48286.f73596 && abstractC19728 == c15252.f49873 && c14769.isEmpty()) {
            return new C10510(abstractC22665.mo23449(), C14769.of((Object) new C10729(c24705.m55132(abstractC22664.mo4935()), EnumC18670.EXTENDS, c14764.f48274)), abstractC22665.f73596, abstractC22665.m51069());
        }
        return (abstractC11781 != null && abstractC11781.f38069 == c14764.f48271 && abstractC19728 == c15252.f49788 && c24705.m55142(abstractC22664)) ? abstractC22664 : abstractC22665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1977(C24533 c24533, C6633 c6633, boolean z) {
        if (c6633 != null && c6633.f22150 == this.f1668.f49865) {
            C4197 c4197 = c6633.f22148;
            if (((AbstractC19969) c4197.f15344.f48335).m21911(EnumC21461.f68533) && ((C11106) c4197.f15344.f48335).f35018 == c24533) {
                return true;
            }
        }
        if (z) {
            AbstractC19728 abstractC19728M28319 = C11239.m28319(c24533.f79554);
            C11040 c11040 = C22843.f74058;
            this.f1705.m34520(c24533, new C11040("compiler", "call.must.be.first.stmt.in.ctor", abstractC19728M28319));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1944(AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        C23191 c23191 = new C23191(c14769, abstractC22664, C14769.m35543(), this.f1703.f48275);
        return c147610 == null ? c23191 : new C5291(c23191, c147610);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0345  */
    /* JADX WARN: Code duplicated, block: B:104:0x0355  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:109:0x0372  */
    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0408  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a4  */
    /* JADX WARN: Not found block with instruction: 0x01af: MOVE (r6v3 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(final C18565 c18565) {
        AbstractC22295 abstractC22295;
        C16875 c16875;
        AbstractC22295 abstractC22296;
        AbstractC22295 abstractC22297;
        AbstractC22295 abstractC22295M37544;
        C14769 c14769;
        C24705 c24705;
        C14769 c147610;
        boolean z;
        C14769 c147611;
        C14769 c147612;
        boolean zM28349;
        C14764 c14764;
        C3168 c3168;
        C7926 c7926;
        C22092 c22092;
        AbstractC22295 abstractC22298;
        AbstractC22664 abstractC22664M49971;
        C3168 c3168M10350;
        C7768 c7768;
        boolean z2;
        AbstractC11781 abstractC11781M49773;
        EnumC20234 enumC20234;
        boolean z3;
        AbstractC11781 abstractC11781;
        AbstractC22664 abstractC22664;
        boolean z4;
        C24705 c24706;
        AbstractC22664 abstractC22664M1936;
        C2596 c2596Mo2276;
        AbstractC22664 abstractC22665;
        AbstractC22664 abstractC22666 = c18565.f26659;
        C14769 c147613 = c18565.f60320;
        C24705 c24707 = this.f1670;
        C12748 c12748M55139 = c24707.m55139(abstractC22666);
        C3168 c3169 = this.f1678;
        C7768 c7769 = (C7768) c3169.f10272;
        C3168 c3168M10351 = c3169.m10350(c18565, c7769.m21146(c7769.f25562));
        Object obj = c3168M10351.f10272;
        C7926 c7927 = c18565.f60319;
        AbstractC22295 abstractC22299 = c18565.f60323;
        EnumC21461 enumC21461 = EnumC21461.f68496;
        if (abstractC22299.m21911(enumC21461)) {
            abstractC22295 = ((C25191) abstractC22299).f81425;
            if (abstractC22295.m21911(EnumC21461.f68448)) {
                c16875 = (C16875) abstractC22295;
                abstractC22296 = c16875.f55198;
            } else {
                abstractC22296 = abstractC22295;
                c16875 = null;
            }
        } else if (abstractC22299.m21911(EnumC21461.f68448)) {
            c16875 = (C16875) abstractC22299;
            abstractC22296 = c16875.f55198;
        } else {
            abstractC22295 = abstractC22299;
            abstractC22296 = abstractC22295;
            c16875 = null;
        }
        AbstractC8036 abstractC8036 = c18565.f60321;
        C22092 c22093 = this.f1698;
        if (abstractC8036 != null) {
            AbstractC22664 abstractC22664M49958 = c22093.m49958(abstractC8036, m1933(abstractC8036, this.f1678, this.f1687));
            int i = abstractC22299.f26658;
            C15714 c15714 = this.f1700;
            c15714.f51040 = i;
            abstractC22295M37544 = c15714.m37544(c15714.m37557(abstractC22664M49958), ((C5887) abstractC22296).f20169);
            AbstractC11194 abstractC11194 = this.f1678.f10275.f61860;
            abstractC22296.getClass();
            abstractC11194.mo6745(abstractC22295M37544, C11239.m28320(abstractC22296, abstractC11194));
            if (abstractC22299.m21911(EnumC21461.f68448)) {
                C16875 c16876 = (C16875) abstractC22299;
                C14769 c147614 = c16876.f55197;
                if (c16876.f55198.m21911(enumC21461)) {
                    c15714.f51040 = c18565.f26658;
                    abstractC22295M37544 = c15714.m37560(abstractC22295M37544, ((C25191) abstractC22299).f81424);
                }
                c15714.f51040 = c18565.f26658;
                abstractC22295M37544 = c15714.m37532(abstractC22295M37544, c147614);
            } else if (abstractC22299.m21911(enumC21461)) {
                c15714.f51040 = c18565.f26658;
                abstractC22295M37544 = c15714.m37560(abstractC22295M37544, ((C25191) abstractC22299).f81424);
            }
            abstractC22297 = abstractC22295M37544;
        } else {
            abstractC22297 = abstractC22299;
            abstractC22295M37544 = abstractC22296;
        }
        try {
            C3168 c31610 = this.f1678;
            ((C7768) c31610.f10272).f25561 = true;
            AbstractC22664 abstractC22664M1904 = C11239.m28347(c31610.f10273) ? m1904(this.f1678, (C5887) abstractC22297) : m1981(abstractC22297, this.f1678, AbstractC22664.f73590);
            ((C7768) this.f1678.f10272).f25561 = false;
            AbstractC22664 abstractC22664M49972 = c22093.m49972(c18565, abstractC22664M1904);
            c22093.m49999((AbstractC8036) abstractC22297, c3168M10351, true);
            AbstractC22295 abstractC222910 = c18565.f60321;
            C22010 c22010 = this.f1707;
            AbstractC22295 abstractC222911 = abstractC22297;
            C7312 c7312 = this.f1705;
            if (abstractC222910 != null) {
                c18565.f60323.f26659 = abstractC22664M49972;
                C11239.m28356(C11239.m28352(abstractC22295M37544), abstractC22296);
                AbstractC22664 abstractC22667 = ((C5887) abstractC22296).f20170.f38067;
                abstractC22296.f26659 = abstractC22667;
                if (c16875 != null) {
                    c16875.f26659 = abstractC22667;
                }
                if (!abstractC22664M49972.mo9329()) {
                    if (c7927 != null && abstractC22664M49972.f73596.m29587()) {
                        AbstractC22295 abstractC222912 = c18565.f60321;
                        abstractC222912.getClass();
                        c7312.m34520(abstractC222912, C22843.f74106);
                    } else if (abstractC22664M49972.f73596.mo7874()) {
                        AbstractC22295 abstractC222913 = c18565.f60321;
                        abstractC222913.getClass();
                        AbstractC22970 abstractC22970 = abstractC22664M49972.f73596;
                        C11040 c11040 = C22843.f74058;
                        c7312.m34520(abstractC222913, new C11040("compiler", "qualified.new.of.static.class", abstractC22970));
                    }
                }
            } else if (!abstractC22664M49972.f73596.m29587() && abstractC22664M49972.mo23449().m51067(EnumC21172.CLASS)) {
                c22010.m49786((InterfaceC5075) c18565, this.f1678, abstractC22664M49972, false);
            }
            C18499 c18499 = new C18499();
            C22114 c22114 = C22114.f71281;
            C22114 c22114M1930 = m1930(c22114, c18565.f60325, c3168M10351, c18499);
            C14769 c14769M43093 = c18499.m43093();
            C14769 c14769M1928 = m1928(c147613, c3168M10351);
            c22093.m50007(c147613, c14769M1928);
            if (abstractC22664M49972.m51067(EnumC21172.CLASS) || abstractC22664M49972.m51067(EnumC21172.ERROR)) {
                if ((abstractC22664M49972.f73596.f38071 & 16384) != 0) {
                    if (this.f1678.f10273.m21911(EnumC21461.f68538)) {
                        C12510 c12510 = (C12510) this.f1678.f10273;
                        c14769 = c147613;
                        c24705 = c24707;
                        if ((c12510.f40170.f15825 & 16384) == 0 || c12510.f40171 != c18565) {
                        }
                    } else {
                        c14769 = c147613;
                        c24705 = c24707;
                    }
                    c7312.m34520(c18565, C22843.f74134);
                } else {
                    c14769 = c147613;
                    c24705 = c24707;
                }
                boolean z5 = C11239.m28349(c18565) && this.f1675.f45571.mo2277().f15331 == EnumC16124.SPECULATIVE;
                if (c7927 != null || z5 || (abstractC22664M49972.f73596.mo29591() & 1536) == 0) {
                    if (c7927 == null || !abstractC22664M49972.f73596.m29587()) {
                        c147610 = c14769;
                        z = false;
                    } else {
                        if (!c14769M43093.isEmpty()) {
                            AbstractC22295 abstractC222914 = (AbstractC22295) c18565.f60325.f48335;
                            abstractC222914.getClass();
                            c7312.m34520(abstractC222914, C22843.f74036);
                        }
                        c147610 = c14769;
                        if (!c14769M1928.isEmpty()) {
                            AbstractC22295 abstractC222915 = (AbstractC22295) c147610.f48335;
                            abstractC222915.getClass();
                            c7312.m34520(abstractC222915, C22843.f74206);
                        }
                        c14769M43093 = C14769.m35543();
                        c14769M1928 = C14769.m35543();
                    }
                    c147611 = c14769M43093;
                    c147612 = c14769M1928;
                    zM28349 = C11239.m28349(c18565);
                    c14764 = this.f1703;
                    if (zM28349) {
                        C10510 c10510 = new C10510(abstractC22664M49972.mo23449(), abstractC22664M49972.f73596.f38067.mo15882(), abstractC22664M49972.f73596, abstractC22664M49972.m51069());
                        C3168 c3168M10352 = c3168M10351.m10350(c18565, obj);
                        C7768 c77610 = (C7768) c3168M10352.f10272;
                        if (c7927 == null || c18565.m43140()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c77610.f25569 = z4;
                        c77610.f25570 = null;
                        c22010.getClass();
                        AbstractC22970 abstractC22971 = c10510.f73596;
                        C9373 c9373 = c22010.f71018;
                        c7926 = c7927;
                        c3168 = c3168M10351;
                        C24292 c24292 = new C24292(c22010, c22010.f71026.f49865, c10510, c147611, c147612, c18565);
                        C12775 c12775 = new C12775(c22010);
                        c12775.f40881 = c9373;
                        AbstractC11781 abstractC11781M49763 = c22010.m49763(c3168M10352, c18565, abstractC22971, c12775, c24292);
                        c18565.f60318 = abstractC11781M49763.mo10410();
                        C14479 c14479 = new C14479(this, c22114M1930, m1944(this.f1675.f45575, c147611, c147612), new C12988(this, this.f1675.f45571, c18565, abstractC22664M49972.f73596), EnumC17463.f56779);
                        c24706 = c24705;
                        c18565.f60322 = c24706.m55139(abstractC22664M49972);
                        abstractC22664M1936 = m1936(c18565, c10510, abstractC11781M49763, c3168M10352, c14479);
                        c18565.f60323.f26659 = c24706.m55139(abstractC22664M49972);
                        if (abstractC22664M1936.mo9329()) {
                            abstractC22298 = abstractC222911;
                        } else {
                            AbstractC22295 abstractC222916 = c18565.f60323;
                            AbstractC22664 abstractC22664Mo31585 = abstractC22664M1936.mo31585();
                            abstractC22298 = abstractC222911;
                            abstractC22298.f26659 = abstractC22664Mo31585;
                            abstractC222916.f26659 = abstractC22664Mo31585;
                            c18565.f60322 = c24706.m55128(abstractC22664M1936, c14764.f48251);
                        }
                        AbstractC22295 abstractC222917 = c18565.f60323;
                        c22092 = c22093;
                        abstractC22664M49971 = c22092.m49971((InterfaceC5075) abstractC222917, abstractC222917.f26659, true);
                    } else {
                        c3168 = c3168M10351;
                        c7926 = c7927;
                        c22092 = c22093;
                        abstractC22298 = abstractC222911;
                        if (!z) {
                            c3168M10350 = c3168.m10350(c18565, obj);
                            c7768 = (C7768) c3168M10350.f10272;
                            if (c7926 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c7768.f25569 = z2;
                            c7768.f25570 = null;
                            c3168 = c3168;
                            abstractC11781M49773 = this.f1707.m49773(c18565, c3168M10350, abstractC22664M49972, c147611, c147612);
                            c18565.f60318 = abstractC11781M49773;
                            if (c7926 == null) {
                                c18565.f60322 = m1936(c18565, abstractC22664M49972, abstractC11781M49773, c3168M10350, new C14479(this, c22114M1930, m1944(c14764.f48251, c147611, c147612), c22092.f71222, EnumC17463.f56779));
                                enumC20234 = c7768.f25570;
                                if (enumC20234 != null && enumC20234.m46507()) {
                                    if (c18565.f60322.mo9329() && c18565.f60324 == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C11972.m30026(z3);
                                }
                            }
                        }
                        abstractC22664M49971 = abstractC22664M49972;
                    }
                    if (c7926 != null) {
                        m1915(c18565, abstractC22298, abstractC22664M49971, c7926, c3168, c147611, c147612, c22114M1930);
                        return;
                    }
                    abstractC11781 = c18565.f60318;
                    if (abstractC11781 == null && abstractC11781.f38066 == EnumC13603.f43218) {
                        abstractC22664 = abstractC22664M49971;
                    }
                    this.f1691 = m1938(c18565, abstractC22664, c22114, this.f1675);
                    c2596Mo2276 = this.f1675.f45571.mo2276();
                    abstractC22665 = c18565.f60322;
                    if (abstractC22665 != null && abstractC22665.m51073(c2596Mo2276.f8340)) {
                        c2596Mo2276.m8700(C14769.of((Object) c18565.f60322), new InterfaceC10382() { // from class: l.ᩴۖ᩺
                            @Override // l.InterfaceC10382
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo2127(C2596 c2596) {
                                C18565 c18566 = c18565;
                                c18566.f60322 = c2596.m8696(c18566.f60322);
                            }
                        });
                    }
                    c22092.m50006(c147610, c3168);
                }
                AbstractC22970 abstractC22972 = abstractC22664M49972.f73596;
                C11040 c11041 = C22843.f74058;
                c7312.m34520(c18565, new C11040("compiler", "abstract.cant.be.instantiated", abstractC22972));
                c147610 = c14769;
                z = true;
                c147611 = c14769M43093;
                c147612 = c14769M1928;
                zM28349 = C11239.m28349(c18565);
                c14764 = this.f1703;
                if (zM28349) {
                    C10510 c10511 = new C10510(abstractC22664M49972.mo23449(), abstractC22664M49972.f73596.f38067.mo15882(), abstractC22664M49972.f73596, abstractC22664M49972.m51069());
                    C3168 c3168M10353 = c3168M10351.m10350(c18565, obj);
                    C7768 c77611 = (C7768) c3168M10353.f10272;
                    if (c7927 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    c77611.f25569 = z4;
                    c77611.f25570 = null;
                    c22010.getClass();
                    AbstractC22970 abstractC22973 = c10511.f73596;
                    C9373 c9374 = c22010.f71018;
                    c7926 = c7927;
                    c3168 = c3168M10351;
                    C24292 c24293 = new C24292(c22010, c22010.f71026.f49865, c10511, c147611, c147612, c18565);
                    C12775 c12776 = new C12775(c22010);
                    c12776.f40881 = c9374;
                    AbstractC11781 abstractC11781M49764 = c22010.m49763(c3168M10353, c18565, abstractC22973, c12776, c24293);
                    c18565.f60318 = abstractC11781M49764.mo10410();
                    C14479 c144710 = new C14479(this, c22114M1930, m1944(this.f1675.f45575, c147611, c147612), new C12988(this, this.f1675.f45571, c18565, abstractC22664M49972.f73596), EnumC17463.f56779);
                    c24706 = c24705;
                    c18565.f60322 = c24706.m55139(abstractC22664M49972);
                    abstractC22664M1936 = m1936(c18565, c10511, abstractC11781M49764, c3168M10353, c144710);
                    c18565.f60323.f26659 = c24706.m55139(abstractC22664M49972);
                    if (abstractC22664M1936.mo9329()) {
                        AbstractC22295 abstractC222918 = c18565.f60323;
                        AbstractC22664 abstractC22664Mo31586 = abstractC22664M1936.mo31585();
                        abstractC22298 = abstractC222911;
                        abstractC22298.f26659 = abstractC22664Mo31586;
                        abstractC222918.f26659 = abstractC22664Mo31586;
                        c18565.f60322 = c24706.m55128(abstractC22664M1936, c14764.f48251);
                    } else {
                        abstractC22298 = abstractC222911;
                    }
                    AbstractC22295 abstractC222919 = c18565.f60323;
                    c22092 = c22093;
                    abstractC22664M49971 = c22092.m49971((InterfaceC5075) abstractC222919, abstractC222919.f26659, true);
                } else {
                    c3168 = c3168M10351;
                    c7926 = c7927;
                    c22092 = c22093;
                    abstractC22298 = abstractC222911;
                    if (!z) {
                        c3168M10350 = c3168.m10350(c18565, obj);
                        c7768 = (C7768) c3168M10350.f10272;
                        if (c7926 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c7768.f25569 = z2;
                        c7768.f25570 = null;
                        c3168 = c3168;
                        abstractC11781M49773 = this.f1707.m49773(c18565, c3168M10350, abstractC22664M49972, c147611, c147612);
                        c18565.f60318 = abstractC11781M49773;
                        if (c7926 == null) {
                            c18565.f60322 = m1936(c18565, abstractC22664M49972, abstractC11781M49773, c3168M10350, new C14479(this, c22114M1930, m1944(c14764.f48251, c147611, c147612), c22092.f71222, EnumC17463.f56779));
                            enumC20234 = c7768.f25570;
                            if (enumC20234 != null) {
                                if (c18565.f60322.mo9329()) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                C11972.m30026(z3);
                            }
                        }
                    }
                    abstractC22664M49971 = abstractC22664M49972;
                }
                if (c7926 != null) {
                    m1915(c18565, abstractC22298, abstractC22664M49971, c7926, c3168, c147611, c147612, c22114M1930);
                    return;
                }
                abstractC11781 = c18565.f60318;
                if (abstractC11781 == null) {
                }
                this.f1691 = m1938(c18565, abstractC22664, c22114, this.f1675);
                c2596Mo2276 = this.f1675.f45571.mo2276();
                abstractC22665 = c18565.f60322;
                if (abstractC22665 != null) {
                    c2596Mo2276.m8700(C14769.of((Object) c18565.f60322), new InterfaceC10382() { // from class: l.ᩴۖ᩺
                        @Override // l.InterfaceC10382
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo2127(C2596 c2596) {
                            C18565 c18566 = c18565;
                            c18566.f60322 = c2596.m8696(c18566.f60322);
                        }
                    });
                }
                c22092.m50006(c147610, c3168);
            }
            c147610 = c147613;
            c3168 = c3168M10351;
            c22092 = c22093;
            abstractC22664 = c12748M55139;
            this.f1691 = m1938(c18565, abstractC22664, c22114, this.f1675);
            c2596Mo2276 = this.f1675.f45571.mo2276();
            abstractC22665 = c18565.f60322;
            if (abstractC22665 != null) {
                c2596Mo2276.m8700(C14769.of((Object) c18565.f60322), new InterfaceC10382() { // from class: l.ᩴۖ᩺
                    @Override // l.InterfaceC10382
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo2127(C2596 c2596) {
                        C18565 c18566 = c18565;
                        c18566.f60322 = c2596.m8696(c18566.f60322);
                    }
                });
            }
            c22092.m50006(c147610, c3168);
        } catch (Throwable th) {
            ((C7768) this.f1678.f10272).f25561 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1915(final C18565 c18565, final AbstractC22295 abstractC22295, AbstractC22664 abstractC22664, final C7926 c7926, final C3168 c3168, final C14769 c14769, final C14769 c147610, final C22114 c22114) {
        C3168 c3169;
        C24705 c24705;
        AbstractC22664 abstractC22664M55139;
        AbstractC22664 abstractC22664M551310;
        C22092 c22092;
        char c;
        C15515 c15515;
        AbstractC22664 abstractC22665;
        AbstractC22664 abstractC22666;
        C2596 c2596Mo2276 = this.f1675.f45571.mo2276();
        boolean zM28349 = C11239.m28349(c18565);
        C24705 c24706 = this.f1670;
        C22092 c22093 = this.f1698;
        if (zM28349 && (((abstractC22665 = c18565.f60322) != null && abstractC22665.m51073(c2596Mo2276.f8340)) || ((abstractC22666 = c18565.f60323.f26659) != null && abstractC22666.m51073(c2596Mo2276.f8340)))) {
            final C14479 c14479 = this.f1675;
            c2596Mo2276.m8700(C14769.of((Object) c18565.f60322, (Object) c18565.f60323.f26659), new InterfaceC10382() { // from class: l.ۘۖ᩺
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2596) {
                    C0310.m1908(this.f13195, c18565, abstractC22295, c14479, c7926, c3168, c14769, c147610, c22114, c2596);
                }
            });
            c3169 = c3168;
            abstractC22664M551310 = abstractC22664;
            c24705 = c24706;
            c22092 = c22093;
        } else {
            if (zM28349 && abstractC22664.m51067(EnumC21172.CLASS)) {
                c22093.getClass();
                C18499 c18499 = new C18499();
                for (AbstractC22664 abstractC22667 : ((C10510) abstractC22664).mo9323()) {
                    if (!C22092.m49945(abstractC22667)) {
                        c18499.m43089(abstractC22667);
                    }
                }
                C14769 c14769M43093 = c18499.m43093();
                if (!abstractC22664.mo9329() && c14769M43093.m35550()) {
                    AbstractC22970 abstractC22970 = abstractC22664.f73596;
                    C15515 c15516 = C19859.f63823;
                    C15515 c15517 = new C15515("compiler", "diamond", abstractC22970);
                    AbstractC22295 abstractC22296 = c18565.f60323;
                    abstractC22296.getClass();
                    if (c14769M43093.m35551() <= 1) {
                        c = 0;
                        c15515 = new C15515("compiler", "diamond.invalid.arg", c14769M43093, c15517);
                    } else {
                        c = 0;
                        c15515 = new C15515("compiler", "diamond.invalid.args", c14769M43093, c15517);
                    }
                    C11040 c11040 = C22843.f74058;
                    Object[] objArr = new Object[2];
                    objArr[c] = c15517;
                    objArr[1] = c15515;
                    this.f1705.m34520(abstractC22296, new C11040("compiler", "cant.apply.diamond.1", objArr));
                }
                Iterator it = abstractC22664.mo15882().iterator();
                while (it.hasNext()) {
                    this.f1707.f71002.m34207(this.f1678, (AbstractC22664) it.next());
                }
            }
            if (abstractC22664.f73596.m29587() || (abstractC22664.mo9329() && !abstractC22664.mo31584().m51067(EnumC21172.NONE) && abstractC22664.mo31584().f73596.m29587())) {
                c7926.f26347 = C14769.of((Object) abstractC22295);
            } else {
                c7926.f26348 = abstractC22295;
            }
            if (this.f1675.f45571.mo2277().f15331 == EnumC16124.CHECK && m1976(abstractC22664)) {
                c3169 = c3168;
                ((C7768) c3169.f10272).f25556 = true;
            } else {
                c3169 = c3168;
            }
            m1932(c7926, c3169);
            C14769 c14769M35552 = (c18565.f60321 == null || abstractC22664.f73596.m29587()) ? c14769 : c14769.m35552(c18565.f60321.f26659);
            if (zM28349 && c22114.m50069(C22114.f71270)) {
                c14769M35552 = c14769M35552.m35547((Function) this.f1710.f41180);
            }
            C14769 c147611 = c14769M35552;
            if (abstractC22664.m51067(EnumC21172.ERROR)) {
                c24705 = c24706;
                abstractC22664M55139 = c24705.m55139(c7926.f26345.f38067);
            } else {
                c24705 = c24706;
                abstractC22664M55139 = c7926.f26345.f38067;
            }
            abstractC22664M551310 = abstractC22664M55139;
            AbstractC11781 abstractC11781M49773 = this.f1707.m49773(c18565, c3168, abstractC22664M551310, c147611, c147610);
            c18565.f60318 = abstractC11781M49773;
            C11972.m30026(!abstractC11781M49773.f38066.m33353());
            c18565.f60318 = abstractC11781M49773;
            c22092 = c22093;
            c18565.f60322 = m1936(c18565, abstractC22664M551310, abstractC11781M49773, c3168, new C14479(this, c22114, m1944(this.f1703.f48251, c147611, c147610), c22092.f71222, EnumC17463.f56779));
        }
        AbstractC11781 abstractC11781 = c18565.f60318;
        if (abstractC11781 == null || abstractC11781.f38066 != EnumC13603.f43218) {
            abstractC22664M551310 = c24705.m55139(c18565.f26659);
        }
        this.f1691 = m1938(c18565, abstractC22664M551310, C22114.f71281, this.f1675.mo30573(EnumC17463.f56781));
        c22092.m50006(c18565.f60320, c3169);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1908(C0310 c0310, C18565 c18565, AbstractC22295 abstractC22295, C14479 c14479, C7926 c7926, C3168 c3168, C14769 c14769, C14769 c147610, C22114 c22114, C2596 c2596) {
        c18565.f60322 = c2596.m8696(c18565.f60322);
        AbstractC22295 abstractC22296 = c18565.f60323;
        AbstractC22664 abstractC22664M8696 = c2596.m8696(abstractC22295.f26659);
        abstractC22295.f26659 = abstractC22664M8696;
        abstractC22296.f26659 = abstractC22664M8696;
        C14479 c144710 = c0310.f1675;
        try {
            c0310.f1675 = c14479;
            c0310.m1915(c18565, abstractC22295, abstractC22295.f26659, c7926, c3168, c14769, c147610, c22114);
        } finally {
            c0310.f1675 = c144710;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m1931(AbstractC22295 abstractC22295) {
        if (abstractC22295.mo2285() != EnumC21461.f68518) {
            AbstractC19728 abstractC19728M28319 = C11239.m28319(abstractC22295);
            C15252 c15252 = this.f1668;
            if (abstractC19728M28319 != c15252.f49836 && abstractC19728M28319 != c15252.f49851) {
                EnumC21461 enumC21461 = EnumC21461.f68548;
                int i = abstractC22295.f26658;
                C15714 c15714 = this.f1700;
                c15714.f51040 = i;
                C3561 c3561M37505 = c15714.m37505(enumC21461, abstractC22295);
                c3561M37505.f62402 = this.f1682.m6594(abstractC22295, enumC21461, abstractC22295.f26659);
                c3561M37505.f26659 = abstractC22295.f26659;
                return c3561M37505;
            }
        }
        return abstractC22295;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        AbstractC22664 abstractC22664M55139;
        AbstractC11781 abstractC11781;
        AbstractC22664 c2832;
        AbstractC22664 abstractC22664M1981;
        AbstractC22664 abstractC22664 = c21549.f26659;
        C24705 c24705 = this.f1670;
        C12748 c12748M55139 = c24705.m55139(abstractC22664);
        C3168 c3168 = this.f1678;
        C3168 c3168M10350 = c3168.m10350(c21549, c3168.f10272);
        AbstractC22295 abstractC22295 = c21549.f68829;
        C7312 c7312 = this.f1705;
        C14764 c14764 = this.f1703;
        if (abstractC22295 != null) {
            abstractC22664M1981 = m1981(abstractC22295, c3168M10350, AbstractC22664.f73590);
            this.f1698.m49999((AbstractC8036) c21549.f68829, c3168M10350, true);
            C14769 c14769 = c21549.f68830;
            c2832 = abstractC22664M1981;
            while (c14769.m35550()) {
                m1934((AbstractC8036) c14769.f48335, c3168M10350, (AbstractC22664) c14764.f48253);
                C2832 c2833 = new C2832(c2832, c14764.f48271);
                c14769 = c14769.f48336;
                c2832 = c2833;
            }
        } else {
            if (this.f1675.f45575.m51067(EnumC21172.ARRAY)) {
                abstractC22664M55139 = c24705.m55120(this.f1675.f45575);
            } else {
                if (!this.f1675.f45575.m51067(EnumC21172.ERROR) && ((abstractC11781 = ((C7768) this.f1678.f10272).f25557) == null || !abstractC11781.f38067.mo9329())) {
                    AbstractC22664 abstractC22665 = this.f1675.f45575;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c21549, new C11040("compiler", "illegal.initializer.for.type", abstractC22665));
                }
                abstractC22664M55139 = c24705.m55139(this.f1675.f45575);
            }
            AbstractC22664 abstractC22666 = abstractC22664M55139;
            c2832 = c12748M55139;
            abstractC22664M1981 = abstractC22666;
        }
        C14769 c147610 = c21549.f68827;
        if (c147610 != null) {
            C18499 c18499 = new C18499();
            while (c147610.m35550()) {
                c18499.m43089(m1934((AbstractC8036) c147610.f48335, c3168M10350, abstractC22664M1981));
                c147610 = c147610.f48336;
            }
            c18499.m43093();
            c2832 = new C2832(abstractC22664M1981, c14764.f48271);
        }
        if (!c24705.m55151(abstractC22664M1981)) {
            c7312.m34520(c21549, C22843.f74179);
        }
        this.f1691 = m1938(c21549, c2832, C22114.f71281, this.f1675);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c A[Catch: all -> 0x02e4, ᩶᩶᩺ -> 0x02e6, ۧۢ᩺ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0212 A[Catch: all -> 0x02e4, ᩶᩶᩺ -> 0x02e6, ۧۢ᩺ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:126:0x026f A[Catch: all -> 0x02e4, ᩶᩶᩺ -> 0x02e6, ۧۢ᩺ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02e4, ᩶᩶᩺ -> 0x02e6, ۧۢ᩺ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4 A[Catch: all -> 0x02e4, ᩶᩶᩺ -> 0x02e6, ۧۢ᩺ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0303  */
    /* JADX WARN: Code duplicated, block: B:167:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x034c A[DONT_GENERATE, PHI: r1 r15 r16
      0x034c: PHI (r1v33 l.᩸۟᩺) = (r1v32 l.᩸۟᩺), (r1v36 l.᩸۟᩺) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r15v6 l.۟۠᩺) = (r15v12 l.۟۠᩺), (r15v13 l.۟۠᩺) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r16v5 boolean) = (r16v3 boolean), (r16v6 boolean) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: ᩶᩶᩺ -> 0x008c, all -> 0x02e4, ۧۢ᩺ -> 0x02ee, TryCatch #0 {ۧۢ᩺ -> 0x02ee, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[Catch: ᩶᩶᩺ -> 0x008c, all -> 0x02e4, ۧۢ᩺ -> 0x02ee, TRY_LEAVE, TryCatch #0 {ۧۢ᩺ -> 0x02ee, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: ᩶᩶᩺ -> 0x008c, all -> 0x02e4, ۧۢ᩺ -> 0x02ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ۧۢ᩺ -> 0x02ee, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176 A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0186 A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf A[Catch: ᩶᩶᩺ -> 0x008c, ۧۢ᩺ -> 0x015e, all -> 0x02e4, TRY_LEAVE, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) throws Throwable {
        boolean z;
        AbstractC11781 abstractC11781;
        boolean z2;
        Object obj;
        C24705 c24705;
        AbstractC22664 abstractC22664;
        C14769 c14769M28328;
        AbstractC22664 abstractC22665;
        AbstractC22664 abstractC22666;
        boolean z3;
        boolean zM51067;
        C19991 c19991;
        C7312 c7312;
        C14479 c14479M1927;
        C4197 c4197;
        C22114 c22114;
        boolean z4;
        AbstractC22664 abstractC22664M1938;
        C14769 c14769Mo50621;
        C14769 c14769;
        boolean z5;
        AbstractC22664 abstractC22667;
        C11256 c11256;
        AbstractC22664 abstractC22668;
        AbstractC22664 abstractC22669;
        C11256 c11257;
        AbstractC22664 abstractC226610;
        C11256 c11258;
        C15714 c15714 = this.f1700;
        C25301 c25301 = this.f1711;
        boolean zMo9329 = this.f1675.f45575.mo9329();
        C7312 c7313 = this.f1705;
        C4039 c4039 = this.f1681;
        if (zMo9329 || (this.f1675.f45575.m51067(EnumC21172.NONE) && this.f1675.f45575 != AbstractC22664.f73591)) {
            if (this.f1675.f45575.m51067(EnumC21172.NONE) && ((abstractC11781 = ((C7768) this.f1678.f10272).f25557) == null || !abstractC11781.f38067.mo9329())) {
                c7313.m34520(c16327, C22843.f74136);
            }
            this.f1675 = c4039;
            z = true;
        } else {
            z = false;
        }
        C3168 c3168M1925 = m1925(c16327, this.f1678);
        Object obj2 = c3168M1925.f10272;
        boolean z6 = this.f1675.f45571.mo2277().f15331 == EnumC16124.CHECK;
        C24705 c24706 = this.f1670;
        try {
            if (!z6) {
                if (c16327.f53000 == EnumC17819.EXPLICIT) {
                    m1983(c16327.f52999, c3168M1925);
                    c14769M28328 = C11239.m28328(c16327.f52999);
                } else {
                    c14769M28328 = null;
                }
                C21193 c21193M1929 = m1929(c16327, this.f1675, c14769M28328);
                abstractC22665 = c21193M1929.f67668;
                abstractC22666 = c21193M1929.f67667;
                if (abstractC22665.mo9329()) {
                    c16327.f26659 = abstractC22665;
                    this.f1691 = abstractC22665;
                    ((C7768) obj2).f25562.mo7484();
                    if (z6) {
                        AbstractC22664 abstractC226611 = this.f1691;
                        m1933(c16327, this.f1678, c4039);
                        if (abstractC226610 == c11258) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C14479 c14479 = this.f1675;
                z3 = z;
                c24705 = c24706;
                m1909(c3168M1925, c16327, c14479.f45575, abstractC22666, abstractC22665, c14479.f45571);
                zM51067 = abstractC22666.m51067(EnumC21172.FORALL);
                c19991 = this.f1704;
                if (zM51067) {
                    EnumC4960 enumC4960M27726 = C10925.m27726(abstractC22665.f73596);
                    AbstractC22970 abstractC22970 = abstractC22665.f73596;
                    C15515 c15515 = C19859.f63823;
                    this.f1675.f45571.mo3910(c16327, c19991.m45975(new C15515("compiler", "invalid.generic.lambda.target", abstractC22666, enumC4960M27726, abstractC22970)));
                    C12748 c12748M55139 = c24705.m55139(this.f1675.f45575);
                    c16327.f26659 = c12748M55139;
                    this.f1691 = c12748M55139;
                    ((C7768) obj2).f25562.mo7484();
                    if (z6) {
                        AbstractC22664 abstractC226612 = this.f1691;
                        m1933(c16327, this.f1678, c4039);
                        if (abstractC22669 == c11257) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (c16327.f53000 == EnumC17819.IMPLICIT) {
                    c14769Mo50621 = abstractC22666.mo50621();
                    c14769 = c16327.f52999;
                    z5 = false;
                    while (c14769.m35550()) {
                        if (c14769Mo50621.isEmpty()) {
                            z5 = true;
                        }
                        if (z5) {
                            abstractC22668 = this.f1703.f48263;
                        } else {
                            abstractC22668 = (AbstractC22664) c14769Mo50621.f48335;
                        }
                        C7312 c7314 = c7313;
                        if (((C12510) c14769.f48335).m31064()) {
                            m1912((C12510) c14769.f48335, abstractC22668);
                        }
                        ((C12510) c14769.f48335).f40168 = null;
                        if (c14769Mo50621.isEmpty()) {
                            c14769Mo50621 = c14769Mo50621.f48336;
                        }
                        c14769 = c14769.f48336;
                        z5 = z5;
                        c7313 = c7314;
                    }
                    c7312 = c7313;
                    m1983(c16327.f52999, c3168M1925);
                    if (z5) {
                        this.f1675.f45571.mo3910(c16327, c19991.m45975(C19859.f63887));
                        C12748 c12748M551310 = c24705.m55139(abstractC22665);
                        c16327.f26659 = c12748M551310;
                        this.f1691 = c12748M551310;
                        ((C7768) obj2).f25562.mo7484();
                        if (z6) {
                            AbstractC22664 abstractC226613 = this.f1691;
                            m1933(c16327, this.f1678, c4039);
                            if (abstractC22667 == c11256) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    c7312 = c7313;
                }
                c14479M1927 = m1927(c16327, abstractC22666, this.f1675);
                ((C7768) obj2).f25564 = c14479M1927;
                if (c16327.m38748() == EnumC25033.EXPRESSION) {
                    m1933(c16327.f53001, c3168M1925, c14479M1927);
                } else {
                    c4197 = (C4197) c16327.f53001;
                    if (c4197 == null) {
                        m1922(c3168M1925);
                        throw new C11496();
                    }
                    m1983(c4197.f15344, c3168M1925);
                }
                c22114 = C22114.f71281;
                this.f1691 = m1938(c16327, abstractC22665, c22114, this.f1675);
                if (this.f1675.f45571.mo2277().f15331 == EnumC16124.SPECULATIVE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f1712.m14640();
                new C5531(this).mo5474(c16327.f53001);
                c25301.m56516(this.f1678, c16327, c15714, z4);
                c16327.f26659 = abstractC22665;
                m1962(c16327, abstractC22666, this.f1675.f45571);
                if (!z4) {
                    if (this.f1675.f45571.mo2276().m8704(abstractC22666.mo50622())) {
                        C14769 c14769Mo50622 = abstractC22666.mo50622();
                        C11040 c11040 = C22843.f74058;
                        c7312.m34520(c16327, new C11040("compiler", "incompatible.thrown.types.in.mref", c14769Mo50622));
                    }
                    m1913(c16327, c3168M1925, this.f1675.f45571.mo2276(), C14769.m35542((Object[]) new AbstractC22664[]{abstractC22666, abstractC22665}));
                }
                if (z3) {
                    abstractC22664M1938 = c24705.m55139(this.f1675.f45575);
                    c16327.f26659 = abstractC22664M1938;
                } else {
                    abstractC22664M1938 = m1938(c16327, abstractC22665, c22114, this.f1675);
                }
                this.f1691 = abstractC22664M1938;
                ((C7768) obj2).f25562.mo7484();
            }
            try {
                try {
                    try {
                        if (m1976(this.f1675.f45575)) {
                            ((C7768) obj2).f25556 = true;
                            ((C7768) obj2).f25553 = true;
                        }
                        if (c16327.f53000 == EnumC17819.EXPLICIT) {
                            m1983(c16327.f52999, c3168M1925);
                            c14769M28328 = C11239.m28328(c16327.f52999);
                        } else {
                            c14769M28328 = null;
                        }
                        C21193 c21193M19210 = m1929(c16327, this.f1675, c14769M28328);
                        abstractC22665 = c21193M19210.f67668;
                        abstractC22666 = c21193M19210.f67667;
                        if (abstractC22665.mo9329()) {
                            c16327.f26659 = abstractC22665;
                            this.f1691 = abstractC22665;
                            ((C7768) obj2).f25562.mo7484();
                            if (z6) {
                                AbstractC22664 abstractC226614 = this.f1691;
                                try {
                                    m1933(c16327, this.f1678, c4039);
                                    if (abstractC226610 == c11258) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    if (this.f1691 == AbstractC22664.f73591) {
                                        this.f1691 = abstractC226614;
                                    }
                                }
                            }
                            return;
                        }
                        C14479 c144710 = this.f1675;
                        z3 = z;
                        c24705 = c24706;
                        try {
                            m1909(c3168M1925, c16327, c144710.f45575, abstractC22666, abstractC22665, c144710.f45571);
                            zM51067 = abstractC22666.m51067(EnumC21172.FORALL);
                            c19991 = this.f1704;
                            if (zM51067) {
                                EnumC4960 enumC4960M27727 = C10925.m27726(abstractC22665.f73596);
                                AbstractC22970 abstractC22971 = abstractC22665.f73596;
                                C15515 c15516 = C19859.f63823;
                                this.f1675.f45571.mo3910(c16327, c19991.m45975(new C15515("compiler", "invalid.generic.lambda.target", abstractC22666, enumC4960M27727, abstractC22971)));
                                C12748 c12748M551311 = c24705.m55139(this.f1675.f45575);
                                c16327.f26659 = c12748M551311;
                                this.f1691 = c12748M551311;
                                ((C7768) obj2).f25562.mo7484();
                                if (z6) {
                                    AbstractC22664 abstractC226615 = this.f1691;
                                    try {
                                        m1933(c16327, this.f1678, c4039);
                                        if (abstractC22669 == c11257) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    } finally {
                                        if (this.f1691 == AbstractC22664.f73591) {
                                            this.f1691 = abstractC226615;
                                        }
                                    }
                                }
                                return;
                            }
                            if (c16327.f53000 == EnumC17819.IMPLICIT) {
                                c14769Mo50621 = abstractC22666.mo50621();
                                c14769 = c16327.f52999;
                                z5 = false;
                                while (c14769.m35550()) {
                                    if (c14769Mo50621.isEmpty()) {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        abstractC22668 = this.f1703.f48263;
                                    } else {
                                        abstractC22668 = (AbstractC22664) c14769Mo50621.f48335;
                                    }
                                    C7312 c7315 = c7313;
                                    if (((C12510) c14769.f48335).m31064()) {
                                        m1912((C12510) c14769.f48335, abstractC22668);
                                    }
                                    ((C12510) c14769.f48335).f40168 = null;
                                    if (c14769Mo50621.isEmpty()) {
                                        c14769Mo50621 = c14769Mo50621.f48336;
                                    }
                                    c14769 = c14769.f48336;
                                    z5 = z5;
                                    c7313 = c7315;
                                }
                                c7312 = c7313;
                                m1983(c16327.f52999, c3168M1925);
                                if (z5) {
                                    this.f1675.f45571.mo3910(c16327, c19991.m45975(C19859.f63887));
                                    C12748 c12748M551312 = c24705.m55139(abstractC22665);
                                    c16327.f26659 = c12748M551312;
                                    this.f1691 = c12748M551312;
                                    ((C7768) obj2).f25562.mo7484();
                                    if (z6) {
                                        AbstractC22664 abstractC226616 = this.f1691;
                                        try {
                                            m1933(c16327, this.f1678, c4039);
                                            if (abstractC22667 == c11256) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        } finally {
                                            if (this.f1691 == AbstractC22664.f73591) {
                                                this.f1691 = abstractC226616;
                                            }
                                        }
                                    }
                                    return;
                                }
                            } else {
                                c7312 = c7313;
                            }
                            try {
                                c14479M1927 = m1927(c16327, abstractC22666, this.f1675);
                                ((C7768) obj2).f25564 = c14479M1927;
                                if (c16327.m38748() == EnumC25033.EXPRESSION) {
                                    m1933(c16327.f53001, c3168M1925, c14479M1927);
                                } else {
                                    c4197 = (C4197) c16327.f53001;
                                    if (c4197 == null && this.f1675.f45571.mo2277().f15331 == EnumC16124.CHECK) {
                                        m1922(c3168M1925);
                                        throw new C11496();
                                    }
                                    m1983(c4197.f15344, c3168M1925);
                                }
                                c22114 = C22114.f71281;
                                this.f1691 = m1938(c16327, abstractC22665, c22114, this.f1675);
                                if (this.f1675.f45571.mo2277().f15331 == EnumC16124.SPECULATIVE) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f1712.m14640();
                                new C5531(this).mo5474(c16327.f53001);
                                c25301.m56516(this.f1678, c16327, c15714, z4);
                                c16327.f26659 = abstractC22665;
                                m1962(c16327, abstractC22666, this.f1675.f45571);
                                if (!z4) {
                                    if (this.f1675.f45571.mo2276().m8704(abstractC22666.mo50622()) && !m1975(c25301.m56514(this.f1678, c16327, c15714), abstractC22666.mo50622(), this.f1675.f45571.mo2276())) {
                                        C14769 c14769Mo50623 = abstractC22666.mo50622();
                                        C11040 c11041 = C22843.f74058;
                                        c7312.m34520(c16327, new C11040("compiler", "incompatible.thrown.types.in.mref", c14769Mo50623));
                                    }
                                    m1913(c16327, c3168M1925, this.f1675.f45571.mo2276(), C14769.m35542((Object[]) new AbstractC22664[]{abstractC22666, abstractC22665}));
                                }
                                if (z3) {
                                    abstractC22664M1938 = c24705.m55139(this.f1675.f45575);
                                    c16327.f26659 = abstractC22664M1938;
                                } else {
                                    abstractC22664M1938 = m1938(c16327, abstractC22665, c22114, this.f1675);
                                }
                                this.f1691 = abstractC22664M1938;
                                ((C7768) obj2).f25562.mo7484();
                            } catch (C11540 e) {
                                e = e;
                                z6 = false;
                                this.f1675.f45571.mo3910(c16327, e.m29044());
                                C12748 c12748M551313 = c24705.m55139(this.f1675.f45575);
                                c16327.f26659 = c12748M551313;
                                this.f1691 = c12748M551313;
                                C7768 c7768 = (C7768) obj2;
                                c7768.f25562.mo7484();
                                obj2 = c7768;
                                if (z6) {
                                    abstractC22664 = this.f1691;
                                    try {
                                        m1933(c16327, this.f1678, c4039);
                                    } finally {
                                        if (this.f1691 == AbstractC22664.f73591) {
                                            this.f1691 = abstractC22664;
                                        }
                                    }
                                }
                            } catch (C21566 e2) {
                                e = e2;
                                z6 = false;
                                this.f1698.m49966(c16327, e);
                                C7768 c7769 = (C7768) obj2;
                                c7769.f25562.mo7484();
                                obj2 = c7769;
                                if (z6) {
                                    abstractC22664 = this.f1691;
                                    try {
                                        m1933(c16327, this.f1678, c4039);
                                    } finally {
                                        if (this.f1691 == AbstractC22664.f73591) {
                                            this.f1691 = abstractC22664;
                                        }
                                    }
                                }
                            }
                        } catch (C11540 e3) {
                            e = e3;
                        }
                    } catch (C11540 e4) {
                        e = e4;
                        c24705 = c24706;
                        this.f1675.f45571.mo3910(c16327, e.m29044());
                        C12748 c12748M551314 = c24705.m55139(this.f1675.f45575);
                        c16327.f26659 = c12748M551314;
                        this.f1691 = c12748M551314;
                        C7768 c77610 = (C7768) obj2;
                        c77610.f25562.mo7484();
                        obj2 = c77610;
                        if (z6) {
                            abstractC22664 = this.f1691;
                            m1933(c16327, this.f1678, c4039);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                        obj = obj2;
                        ((C7768) obj).f25562.mo7484();
                        if (z2) {
                            AbstractC22664 abstractC226617 = this.f1691;
                            try {
                                m1933(c16327, this.f1678, c4039);
                            } finally {
                                if (this.f1691 == AbstractC22664.f73591) {
                                    this.f1691 = abstractC226617;
                                }
                            }
                        }
                        throw th;
                    }
                }
            } catch (C21566 e5) {
                e = e5;
                this.f1698.m49966(c16327, e);
                C7768 c77611 = (C7768) obj2;
                c77611.f25562.mo7484();
                obj2 = c77611;
                if (z6) {
                    abstractC22664 = this.f1691;
                    m1933(c16327, this.f1678, c4039);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = z6;
            obj = obj2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21193 m1929(AbstractC7378 abstractC7378, C14479 c14479, C14769 c14769) {
        AbstractC22664 c23191;
        AbstractC22664 abstractC22664;
        AbstractC22664 abstractC22665 = c14479.f45575;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        AbstractC22664 abstractC22664M55139 = AbstractC22664.f73591;
        C24705 c24705 = this.f1670;
        if (abstractC22665 != abstractC22664M55139) {
            C23475 c23475 = this.f1694;
            c23475.getClass();
            AbstractC22664 abstractC22664M35060 = (AbstractC22664) abstractC22665.mo9324(c23475, abstractC7378);
            abstractC22664M35060.getClass();
            boolean z = abstractC22664M35060 instanceof C1562;
            C14528 c14528 = this.f1692;
            if (z) {
                C18499 c18499 = new C18499();
                for (AbstractC22664 abstractC22664M35061 : ((C1562) abstractC22664M35060).m5502()) {
                    if (c14769 != null) {
                        try {
                            abstractC22664M35061 = c14528.m35060(abstractC7378, abstractC22664M35061, c14769, interfaceC1013);
                        } catch (C11540 unused) {
                        }
                    }
                    c18499.m43089(c24705.m55088(abstractC22664M35061));
                }
                abstractC22664M55139 = c24705.m55138(c18499.m43093());
                abstractC22664M55139.f73596.f38071 |= 512;
                c23191 = c24705.m55143(abstractC22664M55139);
            } else {
                if (c14769 != null) {
                    abstractC22664M35060 = c14528.m35060(abstractC7378, abstractC22664M35060, c14769, interfaceC1013);
                }
                abstractC22664M55139 = c24705.m55088(abstractC22664M35060);
                c23191 = c24705.m55143(abstractC22664M55139);
            }
        } else {
            int i = C13559.f43052[abstractC7378.mo2285().ordinal()];
            C14764 c14764 = this.f1703;
            if (i == 2) {
                C14769 c14769M35543 = C14769.m35543();
                Iterator it = ((C16327) abstractC7378).f52999.iterator();
                while (it.hasNext()) {
                    AbstractC22295 abstractC22295 = ((C12510) it.next()).f40166;
                    c14769M35543 = (abstractC22295 == null || (abstractC22664 = abstractC22295.f26659) == null) ? c14769M35543.m35546(c14764.f48263) : c14769M35543.m35546(abstractC22664);
                }
                c23191 = new C23191(c14769M35543, AbstractC22664.f73591, C14769.of((Object) c14764.f48325), c14764.f48275);
            } else {
                if (i != 3) {
                    C11972.m30024("Cannot get here!");
                    throw null;
                }
                c23191 = new C23191(C14769.m35543(), abstractC22664M55139, C14769.of((Object) c14764.f48325), c14764.f48275);
            }
        }
        if (abstractC7378.m21911(EnumC21461.f68453) && c23191.m51067(EnumC21172.FORALL)) {
            EnumC4960 enumC4960M27726 = C10925.m27726(abstractC22664M55139.f73596);
            AbstractC22970 abstractC22970 = abstractC22664M55139.f73596;
            C15515 c15515 = C19859.f63823;
            interfaceC1013.mo3910(abstractC7378, this.f1704.m45975(new C15515("compiler", "invalid.generic.lambda.target", c23191, enumC4960M27726, abstractC22970)));
            abstractC22664M55139 = c24705.m55139(this.f1675.f45575);
        }
        C21193 c21193 = new C21193();
        c21193.f67668 = abstractC22664M55139;
        c21193.f67667 = c23191;
        return c21193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1913(final AbstractC15581 abstractC15581, final C3168 c3168, C2596 c2596, final C14769 c14769) {
        if (c2596.m8704(c14769)) {
            c2596.m8700(c14769, new InterfaceC10382() { // from class: l.ܽۖ᩺
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2597) {
                    this.f56316.m1913(abstractC15581, c3168, c2597, c2597.m8693(c14769));
                }
            });
            return;
        }
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            this.f1707.f71002.m34207(c3168, (AbstractC22664) it.next());
        }
    }

    public C0310(C4747 c4747) {
        c4747.m14646(f1665, this);
        this.f1668 = C15252.m36599(c4747);
        this.f1705 = C7312.m20023(c4747);
        this.f1703 = C14764.m35506(c4747);
        this.f1707 = C22010.m49750(c4747);
        this.f1682 = C1917.m6583(c4747);
        C22092 c22092M49912 = C22092.m49912(c4747);
        this.f1698 = c22092M49912;
        this.f1711 = C25301.m56500(c4747);
        this.f1701 = C3605.m11692(c4747);
        if (((C17929) c4747.m14643(C17929.f58717)) == null) {
            new C17929(c4747);
        }
        this.f1700 = C15714.m37502(c4747);
        this.f1688 = C15846.m37791(c4747);
        this.f1692 = C14528.m35047(c4747);
        this.f1676 = C0838.m3338(c4747);
        C12863 c12863M31895 = C12863.m31895(c4747);
        this.f1710 = c12863M31895;
        this.f1696 = C15378.m36833(c4747);
        EnumC16305.m38659(c4747);
        this.f1670 = C24705.m55066(c4747);
        C17638 c17638M41289 = C17638.m41289(c4747);
        this.f1671 = c17638M41289;
        this.f1704 = C19991.m45972(c4747);
        this.f1669 = C11518.m28979(c4747);
        this.f1690 = C12221.m30493(c4747);
        this.f1672 = C6147.m17745(c4747);
        this.f1677 = C16437.m38994(c4747);
        AbstractC17425.m40916(c4747);
        this.f1686 = C7044.m19373(c4747);
        C16283 c16283 = (C16283) c4747.m14643(C16283.f52876);
        this.f1680 = c16283 == null ? new C16283(c4747) : c16283;
        C4742 c4742 = (C4742) c4747.m14643(C4742.f16672);
        this.f1712 = c4742 == null ? new C4742(c4747) : c4742;
        C13015 c13015M32421 = C13015.m32421(c4747);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f1684 = EnumC3666.f12567.m11915(enumC20820M47625);
        this.f1689 = EnumC3666.f12558.m11915(enumC20820M47625);
        EnumC3666.f12572.m11915(enumC20820M47625);
        this.f1674 = EnumC3666.f12542.m11915(enumC20820M47625);
        this.f1693 = EnumC3666.f12547.m11915(enumC20820M47625);
        this.f1702 = EnumC3666.f12561.m11915(enumC20820M47625);
        this.f1708 = EnumC3666.f12546.m11915(enumC20820M47625);
        this.f1706 = (c17638M41289.m41295() || !c17638M41289.m41300(EnumC3666.f12579)) && EnumC3666.f12579.m11915(enumC20820M47625);
        this.f1685 = enumC20820M47625.f66685;
        this.f1697 = c13015M32421.m32432("useBeforeDeclarationWarning");
        C22114 c22114 = C22114.f71274;
        C11256 c11256 = AbstractC22664.f73590;
        this.f1709 = new C14479(this, c22114, c11256);
        this.f1699 = new C14479(this, C22114.f71279, c11256);
        this.f1687 = new C14479(this, C22114.f71281, c11256);
        this.f1683 = new C12242(this, c22092M49912.f71222);
        this.f1713 = new C14479(this, C22114.f71269, c11256);
        EnumC17463 enumC17463 = EnumC17463.f56782;
        this.f1681 = new C4039(this, c12863M31895.f41172, AbstractC22664.f73591);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14479 m1927(C16327 c16327, AbstractC22664 abstractC22664, C14479 c14479) {
        InterfaceC1013 c23431;
        if (c16327.m38748() == EnumC25033.EXPRESSION) {
            c23431 = new C15971(this, (AbstractC22295) c16327.f53001, c14479.f45571);
        } else {
            c23431 = new C23431(this, c14479.f45571);
        }
        if (abstractC22664.mo31585() == AbstractC22664.f73591) {
            return this.f1681;
        }
        return new C14479(this, C22114.f71281, abstractC22664.mo31585(), c23431);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1962(C16327 c16327, AbstractC22664 abstractC22664, InterfaceC1013 interfaceC1013) {
        AbstractC22664 abstractC22664M8710 = interfaceC1013.mo2276().m8710(abstractC22664.mo31585());
        EnumC25033 enumC25033M38748 = c16327.m38748();
        EnumC25033 enumC25033 = EnumC25033.STATEMENT;
        C19991 c19991 = this.f1704;
        if (enumC25033M38748 == enumC25033 && c16327.f52998 && !abstractC22664M8710.m51067(EnumC21172.VOID) && abstractC22664M8710 != AbstractC22664.f73591) {
            interfaceC1013.mo3910(c16327, c19991.m45975(new C15515("compiler", "incompatible.ret.type.in.lambda", C19859.m45717(abstractC22664M8710))));
        }
        if (this.f1670.m55148(interfaceC1013.mo2276().m8709(abstractC22664.mo50621()), C11239.m28328(c16327.f52999))) {
            return;
        }
        interfaceC1013.mo3910(c16327, c19991.m45975(C19859.f63887));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10377 m1979(C24550 c24550) {
        return (C10377) this.f1695.remove(c24550);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3168 m1925(C16327 c16327, C3168 c3168) {
        C3168 c3168M10350;
        Object obj = c3168.f10272;
        C7768 c7768 = (C7768) obj;
        AbstractC17836 abstractC17836 = c7768.f25562;
        AbstractC11781 abstractC11781 = abstractC17836.f53083;
        if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 == EnumC13603.f43213) {
            C24550 c24550M29558 = abstractC11781.m29558();
            C7768 c7769 = (C7768) obj;
            AbstractC11781 abstractC11782 = c7769.f25562.f53083;
            long jMo29591 = abstractC11781.mo29591() & 8;
            C15252 c15252 = this.f1668;
            if (jMo29591 == 0) {
                Iterator it = c24550M29558.f79576.m38842(c15252.f49865).iterator();
                if (it.hasNext()) {
                    abstractC11782 = (AbstractC11781) it.next();
                }
            } else {
                HashMap map = this.f1695;
                C10377 c10377 = (C10377) map.get(c24550M29558);
                if (c10377 == null) {
                    C14769 c14769M35543 = C14769.m35543();
                    C14764 c14764 = this.f1703;
                    c10377 = new C10377(4106L, c15252.f49758, new C23191(c14769M35543, c14764.f48251, C14769.m35543(), c14764.f48275), c24550M29558);
                    c10377.f33013 = C14769.m35543();
                    map.put(c24550M29558, c10377);
                }
                abstractC11782 = c10377;
            }
            c3168M10350 = c3168.m10350(c16327, c7769.m21146(c7769.f25562.mo7486(abstractC11782)));
        } else {
            c3168M10350 = c3168.m10350(c16327, c7768.m21146(abstractC17836.mo7478(abstractC11781)));
        }
        C7768 c77610 = (C7768) c3168M10350.f10272;
        c77610.f25559 = null;
        c77610.f25565 = true;
        return c3168M10350;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x031f A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x035d A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x036a A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0382 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x038e A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:157:0x0424  */
    /* JADX WARN: Code duplicated, block: B:158:0x0426  */
    /* JADX WARN: Code duplicated, block: B:161:0x0439 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[Catch: ۧۢ᩺ -> 0x0472, TryCatch #3 {ۧۢ᩺ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:189:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8 A[Catch: ۧۢ᩺ -> 0x0260, TRY_LEAVE, TryCatch #4 {ۧۢ᩺ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:190:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0 A[Catch: ۧۢ᩺ -> 0x0260, TryCatch #4 {ۧۢ᩺ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:190:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0209 A[Catch: ۧۢ᩺ -> 0x0260, TryCatch #4 {ۧۢ᩺ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:190:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0234 A[Catch: ۧۢ᩺ -> 0x025b, TryCatch #1 {ۧۢ᩺ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:186:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x023a A[Catch: ۧۢ᩺ -> 0x025b, TryCatch #1 {ۧۢ᩺ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:186:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0243 A[Catch: ۧۢ᩺ -> 0x025b, TryCatch #1 {ۧۢ᩺ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:186:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024b A[Catch: ۧۢ᩺ -> 0x025b, TRY_LEAVE, TryCatch #1 {ۧۢ᩺ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:186:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0273 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0284 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0289  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9 A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ae A[Catch: ۧۢ᩺ -> 0x045c, TryCatch #0 {ۧۢ᩺ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:185:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [l.ۙᩳۘ, l.۟ܿۘ] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.᩻֨᩺] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.֨ۜ᩺] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1954(C12598 c12598) throws Throwable {
        AbstractC11781 abstractC11781;
        ?? r14;
        ?? r12;
        AbstractC22664 abstractC22664M55139;
        char c;
        AbstractC11781 abstractC11781M28352;
        boolean z;
        C14769 c14769M35543;
        C14769 c14769;
        EnumC16124 enumC16124;
        EnumC16124 enumC16125;
        boolean z2;
        AbstractC22664 abstractC22664;
        AbstractC22664 abstractC22665;
        AbstractC22664 abstractC22666;
        EnumC16081 enumC16081;
        C14769 c14769Mo50621;
        AbstractC5428 c10537;
        C14769 c14769M8706;
        EnumC16081 enumC16082;
        C12598 c12599;
        AbstractC11781 abstractC11782;
        AbstractC0097 abstractC0097;
        EnumC13603 enumC13603;
        AbstractC11781 abstractC11781Mo10410;
        EnumC16081 enumC16083;
        AbstractC22664 abstractC22664Mo31585;
        C14769 c147610;
        C14479 c14479Mo30574;
        AbstractC0097 abstractC0098;
        AbstractC22664 abstractC22664M1936;
        AbstractC22664 abstractC22664M55128;
        boolean z3;
        C15252 c15252;
        C22092 c22092;
        AbstractC22664 abstractC22664Mo23449;
        boolean z4;
        C17007 c17007Mo3799;
        AbstractC13695 c11040;
        C17007 c17007M45976;
        AbstractC22664 abstractC22667;
        C15252 c15253 = this.f1668;
        C22010 c22010 = this.f1707;
        boolean zMo9329 = this.f1675.f45575.mo9329();
        C7312 c7312 = this.f1705;
        C24705 c24705 = this.f1670;
        if (zMo9329 || (this.f1675.f45575.m51067(EnumC21172.NONE) && this.f1675.f45575 != AbstractC22664.f73591)) {
            if (this.f1675.f45575.m51067(EnumC21172.NONE) && ((abstractC11781 = ((C7768) this.f1678.f10272).f25557) == null || !abstractC11781.f38067.mo9329())) {
                c7312.m34520(c12598, C22843.f74120);
            }
            C12748 c12748M55139 = c24705.m55139(this.f1675.f45575);
            c12598.f26659 = c12748M55139;
            this.f1691 = c12748M55139;
            return;
        }
        C3168 c3168 = this.f1678;
        C3168 c3168M10350 = c3168.m10350(c12598, c3168.f10272);
        try {
            AbstractC22295 abstractC22295 = c12598.f40436;
            C14769 c147611 = c12598.f40437;
            EnumC16081 enumC16084 = c12598.f40435;
            AbstractC22664 abstractC22664M1933 = m1933(abstractC22295, this.f1678, m1980(c12598));
            EnumC16081 enumC16085 = EnumC16081.NEW;
            C22092 c22093 = this.f1698;
            if (enumC16084 == enumC16085) {
                abstractC22664M1933 = c22093.m50057(c12598.f40436, abstractC22664M1933);
                if (!abstractC22664M1933.mo9329() && abstractC22664M1933.mo9328() && c147611 != null) {
                    AbstractC22295 abstractC22296 = c12598.f40436;
                    abstractC22296.getClass();
                    EnumC4960 enumC4960M27727 = C10925.m27727(enumC16084);
                    C11040 c11041 = C22843.f74058;
                    enumC16085 = enumC16085;
                    enumC16084 = enumC16084;
                    c7312.m34520(abstractC22296, new C11040("compiler", "invalid.mref", enumC4960M27727, C19859.f63840));
                    abstractC22664M55139 = c24705.m55139(abstractC22664M1933);
                    c = 1;
                }
                if (abstractC22664M55139.mo9329()) {
                    c12598.f26659 = abstractC22664M55139;
                    this.f1691 = abstractC22664M55139;
                    return;
                }
                if (C11239.m28335(c12598.f40436, c15253)) {
                    c22093.m49999((AbstractC8036) c12598.f40436, this.f1678, false);
                } else {
                    abstractC11781M28352 = C11239.m28352(c12598.f40436);
                    C7768 c7768 = (C7768) c3168M10350.f10272;
                    if (abstractC11781M28352 == null && abstractC11781M28352.f38072 == c15253.f49851) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c7768.f25569 = z;
                }
                c14769M35543 = C14769.m35543();
                if (c147611 != null) {
                    c14769M35543 = m1928(c147611, c3168M10350);
                    c22093.m50007(c147611, c14769M35543);
                }
                c14769 = c14769M35543;
                enumC16124 = this.f1675.f45571.mo2277().f15331;
                enumC16125 = EnumC16124.CHECK;
                if (enumC16124 == enumC16125 || !m1976(this.f1675.f45575)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C21193 c21193M1929 = m1929(c12598, this.f1675, (C14769) null);
                abstractC22664 = c21193M1929.f67668;
                abstractC22665 = c21193M1929.f67667;
                C14479 c14479 = this.f1675;
                abstractC22666 = abstractC22664M55139;
                enumC16081 = enumC16085;
                m1909(c3168M10350, c12598, c14479.f45575, abstractC22665, abstractC22664, c14479.f45571);
                c14769Mo50621 = abstractC22665.mo50621();
                c10537 = c22010.f71018;
                if (this.f1675.f45571.mo2276().m8704(c14769Mo50621)) {
                    c10537 = new C10537(c22010, this.f1675.f45571.mo2276());
                }
                try {
                    AbstractC5428 abstractC5428 = c10537;
                    c14769M8706 = this.f1675.f45571.mo2276().m8706();
                    try {
                        enumC16082 = enumC16084;
                        try {
                            C5558 c5558M49761 = this.f1707.m49761(c3168M10350, c12598, c12598.f40436.f26659, c12598.f40431, c14769Mo50621, c14769, c21193M1929.f67667, abstractC5428, this.f1675.f45571.mo2276(), c22010.f71014);
                            try {
                                this.f1675.f45571.mo2276().m8705(c14769M8706);
                                abstractC11782 = (AbstractC11781) c5558M49761.f19300;
                                abstractC0097 = (AbstractC0097) c5558M49761.f19301;
                                enumC13603 = abstractC11782.f38066;
                                if (enumC13603 == EnumC13603.f43218) {
                                    if (abstractC11782.m29570()) {
                                        abstractC11781Mo10410 = abstractC11782.mo10410();
                                    } else {
                                        abstractC11781Mo10410 = abstractC11782;
                                    }
                                    c12598.f40439 = abstractC11781Mo10410;
                                    c12598.f40430 = abstractC0097.mo1199(abstractC11781Mo10410);
                                    c12598.f40433 = c22010.m49791(c3168M10350, (AbstractC22970) c12598.f40439.m29558(), false);
                                    if (abstractC22665.mo31585() == AbstractC22664.f73591) {
                                        c12598.f26659 = abstractC22664;
                                        this.f1691 = abstractC22664;
                                        return;
                                    }
                                    if (((C7768) this.f1678.f10272).f25555.f76580) {
                                        enumC16083 = enumC16082;
                                    } else {
                                        enumC16083 = enumC16082;
                                        if (enumC16083 == enumC16081 && (abstractC22664Mo23449 = abstractC22666.mo23449()) != null && abstractC22664Mo23449.m51067(EnumC21172.CLASS)) {
                                            c22010.m49786((InterfaceC5075) c12598, this.f1678, abstractC22666, false);
                                        }
                                    }
                                    if (this.f1675.f45571.mo2277().f15331 == enumC16125) {
                                        if (enumC16083 == EnumC16081.INVOKE) {
                                            c15252 = c15253;
                                            if (!C11239.m28335(c12598.f40436, c15252) && c12598.f40430.m47584() && abstractC0097.f27563.mo9328()) {
                                                abstractC0097 = abstractC0097;
                                                c22092 = c22093;
                                                c22092.m49997(c12598.f40436, c3168M10350);
                                            }
                                            if (!c12598.f40439.mo7874() && C11239.m28335(c12598.f40436, c15252) && abstractC22666.mo15882().m35550()) {
                                                AbstractC22295 abstractC22297 = c12598.f40436;
                                                abstractC22297.getClass();
                                                EnumC4960 enumC4960M27728 = C10925.m27727(enumC16083);
                                                C11040 c11042 = C22843.f74058;
                                                Object[] objArr = new Object[2];
                                                objArr[0] = enumC4960M27728;
                                                objArr[c] = C19859.f63832;
                                                c7312.m34520(abstractC22297, new C11040("compiler", "invalid.mref", objArr));
                                                C12748 c12748M551310 = c24705.m55139(abstractC22664);
                                                c12598.f26659 = c12748M551310;
                                                this.f1691 = c12748M551310;
                                                return;
                                            }
                                            if (!abstractC11782.mo7874() && c12598.f40430 == EnumC20803.f66612) {
                                                c22010.m49787(c12598, c12598.f40439);
                                            }
                                            if (z2) {
                                                c22092.m50014((AbstractC22295) c12598, true);
                                            }
                                        } else {
                                            c15252 = c15253;
                                        }
                                        c22092 = c22093;
                                        if (!c12598.f40439.mo7874()) {
                                        }
                                        if (!abstractC11782.mo7874()) {
                                            c22010.m49787(c12598, c12598.f40439);
                                        }
                                        if (z2) {
                                            c22092.m50014((AbstractC22295) c12598, true);
                                        }
                                    } else {
                                        abstractC0097 = abstractC0097;
                                    }
                                    C14479 c144710 = this.f1675;
                                    if (abstractC22665.mo31585().m51067(EnumC21172.VOID)) {
                                        abstractC22664Mo31585 = AbstractC22664.f73590;
                                    } else {
                                        abstractC22664Mo31585 = abstractC22665.mo31585();
                                    }
                                    if (c12598.f40430.m47584()) {
                                        c147610 = c14769Mo50621.f48336;
                                    } else {
                                        c147610 = c14769Mo50621;
                                    }
                                    c14479Mo30574 = c144710.mo30574(m1944(abstractC22664Mo31585, c147610, c14769), new C23431(this, this.f1675.f45571), EnumC17463.f56779);
                                    abstractC0098 = abstractC0097;
                                    abstractC22664M1936 = m1936(c12598, abstractC0098.f27563, abstractC11782, c3168M10350, c14479Mo30574);
                                    if (c12598.f40430.m47584() && ((AbstractC22664) c14769Mo50621.f48335).m51073(this.f1675.f45571.mo2276().f8340) && !c24705.m55131(this.f1675.f45571.mo2276().m8710((AbstractC22664) c14769Mo50621.f48335), abstractC22666, true)) {
                                        C11972.m30024("Can't get here");
                                        throw null;
                                    }
                                    if (abstractC22664M1936.mo9329()) {
                                        abstractC22664M55128 = abstractC22664M1936;
                                    } else {
                                        abstractC22664M55128 = c24705.m55128(abstractC22664M1936, m1939(abstractC11782, abstractC0098.f27563, c12598.f40431, c14479Mo30574.f45575.mo50621(), abstractC22664M1936.mo31585()));
                                    }
                                    if (this.f1675.f45571.mo2277().f15331 == EnumC16124.SPECULATIVE) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c12598.f26659 = abstractC22664;
                                    m1955(c12598, abstractC22665, abstractC22664M55128, this.f1675.f45571, z3);
                                    if (!z3) {
                                        m1913(c12598, c3168M10350, this.f1675.f45571.mo2276(), C14769.m35542((Object[]) new AbstractC22664[]{abstractC22665, abstractC22664}));
                                    }
                                    this.f1691 = m1938(c12598, abstractC22664, C22114.f71281, this.f1675);
                                    return;
                                }
                                switch (C13559.f43051[enumC13603.ordinal()]) {
                                    case 1:
                                    case 2:
                                        z4 = false;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        z4 = true;
                                        break;
                                    default:
                                        C11972.m30024("unexpected result kind " + abstractC11782.f38066);
                                        throw null;
                                }
                                c17007Mo3799 = ((AbstractC2335) abstractC11782.mo10410()).mo3799(EnumC22229.FRAGMENT, c12598, abstractC22666.f73596, abstractC22666, c12598.f40431, c14769Mo50621, c14769);
                                C19991 c19991 = this.f1704;
                                C23393 c23393M34514 = c7312.m34514();
                                if (z4) {
                                    EnumC4960 enumC4960M27729 = C10925.m27727(enumC16082);
                                    C15515 c15515 = C19859.f63823;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = enumC4960M27729;
                                    objArr2[c] = c17007Mo3799;
                                    c11040 = new C15515("compiler", "invalid.mref", objArr2);
                                } else {
                                    EnumC4960 enumC4960M277210 = C10925.m27727(enumC16082);
                                    C11040 c11043 = C22843.f74058;
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = enumC4960M277210;
                                    objArr3[c] = c17007Mo3799;
                                    c11040 = new C11040("compiler", "invalid.mref", objArr3);
                                }
                                c19991.getClass();
                                c12599 = c12598;
                                try {
                                    c17007M45976 = c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393M34514, c12598, c11040);
                                    if (z4) {
                                        abstractC22667 = abstractC22664;
                                        if (abstractC22667 == AbstractC22664.f73591) {
                                            c12599.f26659 = abstractC22667;
                                            this.f1691 = abstractC22667;
                                            return;
                                        }
                                    } else {
                                        abstractC22667 = abstractC22664;
                                    }
                                    if (z4) {
                                        this.f1675.f45571.mo3910(c12599, c17007M45976);
                                    } else {
                                        c7312.mo20039(c17007M45976);
                                    }
                                    C12748 c12748M551311 = c24705.m55139(abstractC22667);
                                    c12599.f26659 = c12748M551311;
                                    this.f1691 = c12748M551311;
                                    return;
                                } catch (C11540 e) {
                                    e = e;
                                }
                            } catch (C11540 e2) {
                                e = e2;
                                c12599 = c12598;
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.f1675.f45571.mo2276().m8705(c14769M8706);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (C11540 e3) {
                    e = e3;
                    r12 = c7312;
                    r14 = c22010;
                }
            }
            abstractC22664M55139 = abstractC22664M1933;
            c = 1;
            if (abstractC22664M55139.mo9329()) {
                c12598.f26659 = abstractC22664M55139;
                this.f1691 = abstractC22664M55139;
                return;
            }
            if (C11239.m28335(c12598.f40436, c15253)) {
                c22093.m49999((AbstractC8036) c12598.f40436, this.f1678, false);
            } else {
                abstractC11781M28352 = C11239.m28352(c12598.f40436);
                C7768 c7769 = (C7768) c3168M10350.f10272;
                if (abstractC11781M28352 == null) {
                    z = false;
                } else {
                    z = false;
                }
                c7769.f25569 = z;
            }
            c14769M35543 = C14769.m35543();
            if (c147611 != null) {
                c14769M35543 = m1928(c147611, c3168M10350);
                c22093.m50007(c147611, c14769M35543);
            }
            c14769 = c14769M35543;
            enumC16124 = this.f1675.f45571.mo2277().f15331;
            enumC16125 = EnumC16124.CHECK;
            if (enumC16124 == enumC16125) {
                z2 = false;
            } else {
                z2 = false;
            }
            C21193 c21193M19210 = m1929(c12598, this.f1675, (C14769) null);
            abstractC22664 = c21193M19210.f67668;
            abstractC22665 = c21193M19210.f67667;
            C14479 c144711 = this.f1675;
            abstractC22666 = abstractC22664M55139;
            enumC16081 = enumC16085;
            m1909(c3168M10350, c12598, c144711.f45575, abstractC22665, abstractC22664, c144711.f45571);
            c14769Mo50621 = abstractC22665.mo50621();
            c10537 = c22010.f71018;
            if (this.f1675.f45571.mo2276().m8704(c14769Mo50621)) {
                c10537 = new C10537(c22010, this.f1675.f45571.mo2276());
            }
            AbstractC5428 abstractC5429 = c10537;
            c14769M8706 = this.f1675.f45571.mo2276().m8706();
            enumC16082 = enumC16084;
            C5558 c5558M49762 = this.f1707.m49761(c3168M10350, c12598, c12598.f40436.f26659, c12598.f40431, c14769Mo50621, c14769, c21193M19210.f67667, abstractC5429, this.f1675.f45571.mo2276(), c22010.f71014);
            this.f1675.f45571.mo2276().m8705(c14769M8706);
            abstractC11782 = (AbstractC11781) c5558M49762.f19300;
            abstractC0097 = (AbstractC0097) c5558M49762.f19301;
            enumC13603 = abstractC11782.f38066;
            if (enumC13603 == EnumC13603.f43218) {
                switch (C13559.f43051[enumC13603.ordinal()]) {
                    case 1:
                    case 2:
                        z4 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z4 = true;
                        break;
                    default:
                        C11972.m30024("unexpected result kind " + abstractC11782.f38066);
                        throw null;
                }
                c17007Mo3799 = ((AbstractC2335) abstractC11782.mo10410()).mo3799(EnumC22229.FRAGMENT, c12598, abstractC22666.f73596, abstractC22666, c12598.f40431, c14769Mo50621, c14769);
                C19991 c19992 = this.f1704;
                C23393 c23393M34515 = c7312.m34514();
                if (z4) {
                    EnumC4960 enumC4960M277211 = C10925.m27727(enumC16082);
                    C15515 c15516 = C19859.f63823;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = enumC4960M277211;
                    objArr4[c] = c17007Mo3799;
                    c11040 = new C15515("compiler", "invalid.mref", objArr4);
                } else {
                    EnumC4960 enumC4960M277212 = C10925.m27727(enumC16082);
                    C11040 c11044 = C22843.f74058;
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = enumC4960M277212;
                    objArr5[c] = c17007Mo3799;
                    c11040 = new C11040("compiler", "invalid.mref", objArr5);
                }
                c19992.getClass();
                c12599 = c12598;
                c17007M45976 = c19992.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393M34515, c12598, c11040);
                if (z4) {
                    abstractC22667 = abstractC22664;
                    if (abstractC22667 == AbstractC22664.f73591) {
                        c12599.f26659 = abstractC22667;
                        this.f1691 = abstractC22667;
                        return;
                    }
                } else {
                    abstractC22667 = abstractC22664;
                }
                if (z4) {
                    this.f1675.f45571.mo3910(c12599, c17007M45976);
                } else {
                    c7312.mo20039(c17007M45976);
                }
                C12748 c12748M551312 = c24705.m55139(abstractC22667);
                c12599.f26659 = c12748M551312;
                this.f1691 = c12748M551312;
                return;
            }
            if (abstractC11782.m29570()) {
                abstractC11781Mo10410 = abstractC11782.mo10410();
            } else {
                abstractC11781Mo10410 = abstractC11782;
            }
            c12598.f40439 = abstractC11781Mo10410;
            c12598.f40430 = abstractC0097.mo1199(abstractC11781Mo10410);
            c12598.f40433 = c22010.m49791(c3168M10350, (AbstractC22970) c12598.f40439.m29558(), false);
            if (abstractC22665.mo31585() == AbstractC22664.f73591) {
                c12598.f26659 = abstractC22664;
                this.f1691 = abstractC22664;
                return;
            }
            if (((C7768) this.f1678.f10272).f25555.f76580) {
                enumC16083 = enumC16082;
                if (enumC16083 == enumC16081) {
                    c22010.m49786((InterfaceC5075) c12598, this.f1678, abstractC22666, false);
                }
            } else {
                enumC16083 = enumC16082;
            }
            if (this.f1675.f45571.mo2277().f15331 == enumC16125) {
                if (enumC16083 == EnumC16081.INVOKE) {
                    c15252 = c15253;
                    if (!C11239.m28335(c12598.f40436, c15252)) {
                    }
                } else {
                    c15252 = c15253;
                }
                c22092 = c22093;
                if (!c12598.f40439.mo7874()) {
                }
                if (!abstractC11782.mo7874()) {
                    c22010.m49787(c12598, c12598.f40439);
                }
                if (z2) {
                    c22092.m50014((AbstractC22295) c12598, true);
                }
            } else {
                abstractC0097 = abstractC0097;
            }
            C14479 c144712 = this.f1675;
            if (abstractC22665.mo31585().m51067(EnumC21172.VOID)) {
                abstractC22664Mo31585 = AbstractC22664.f73590;
            } else {
                abstractC22664Mo31585 = abstractC22665.mo31585();
            }
            if (c12598.f40430.m47584()) {
                c147610 = c14769Mo50621.f48336;
            } else {
                c147610 = c14769Mo50621;
            }
            c14479Mo30574 = c144712.mo30574(m1944(abstractC22664Mo31585, c147610, c14769), new C23431(this, this.f1675.f45571), EnumC17463.f56779);
            abstractC0098 = abstractC0097;
            abstractC22664M1936 = m1936(c12598, abstractC0098.f27563, abstractC11782, c3168M10350, c14479Mo30574);
            if (c12598.f40430.m47584()) {
                C11972.m30024("Can't get here");
                throw null;
            }
            if (abstractC22664M1936.mo9329()) {
                abstractC22664M55128 = c24705.m55128(abstractC22664M1936, m1939(abstractC11782, abstractC0098.f27563, c12598.f40431, c14479Mo30574.f45575.mo50621(), abstractC22664M1936.mo31585()));
            } else {
                abstractC22664M55128 = abstractC22664M1936;
            }
            if (this.f1675.f45571.mo2277().f15331 == EnumC16124.SPECULATIVE) {
                z3 = true;
            } else {
                z3 = false;
            }
            c12598.f26659 = abstractC22664;
            m1955(c12598, abstractC22665, abstractC22664M55128, this.f1675.f45571, z3);
            if (!z3) {
                m1913(c12598, c3168M10350, this.f1675.f45571.mo2276(), C14769.m35542((Object[]) new AbstractC22664[]{abstractC22665, abstractC22664}));
            }
            this.f1691 = m1938(c12598, abstractC22664, C22114.f71281, this.f1675);
            return;
            r14 = c24705;
            r12 = c12599;
            this.f1675.f45571.mo3910(r12, e.m29044());
            C12748 c12748M551313 = r14.m55139(this.f1675.f45575);
            r12.f26659 = c12748M551313;
            this.f1691 = c12748M551313;
        } catch (C11540 e4) {
            e = e4;
            r14 = c24705;
            r12 = c12598;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14479 m1980(C12598 c12598) {
        return new C14479(this, c12598.f40435 == EnumC16081.INVOKE ? C22114.f71277 : C22114.f71269, AbstractC22664.f73590);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1955(final C12598 c12598, AbstractC22664 abstractC22664, final AbstractC22664 abstractC22665, InterfaceC1013 interfaceC1013, boolean z) {
        AbstractC22664 abstractC22664Mo31585;
        C2596 c2596Mo2276 = interfaceC1013.mo2276();
        AbstractC22664 abstractC22664M8710 = c2596Mo2276.m8710(abstractC22664.mo31585());
        if (C13559.f43049[c12598.f40435.ordinal()] == 1 && !c12598.f40436.f26659.mo9328()) {
            abstractC22664Mo31585 = c12598.f40436.f26659;
        } else {
            abstractC22664Mo31585 = abstractC22665.mo31585();
        }
        EnumC21172 enumC21172 = EnumC21172.VOID;
        AbstractC22664 abstractC22666 = null;
        AbstractC22664 abstractC22667 = abstractC22664M8710.m51067(enumC21172) ? null : abstractC22664Mo31585;
        if (abstractC22664M8710.m51067(enumC21172) || abstractC22664Mo31585.m51067(enumC21172)) {
            abstractC22666 = abstractC22667;
        } else if (!abstractC22664Mo31585.mo9329()) {
            if (!((C14436) this.f1698.f71222).mo3911(interfaceC1013.mo2276().m8710(abstractC22664Mo31585), interfaceC1013.mo2276().m8710(abstractC22664M8710), interfaceC1013.mo3909(c12598, abstractC22664Mo31585, abstractC22664M8710))) {
                abstractC22666 = abstractC22667;
            }
        }
        if (abstractC22666 == null) {
            if (abstractC22665.m51073(c2596Mo2276.f8340)) {
                c2596Mo2276.m8700(C14769.of((Object) abstractC22665), new InterfaceC10382() { // from class: l.۬ۡ᩺
                    @Override // l.InterfaceC10382
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo2127(C2596 c2596) {
                        c12598.f40432 = c2596.m8696(abstractC22665);
                    }
                });
            } else {
                c12598.f40432 = abstractC22665;
            }
        } else {
            interfaceC1013.mo3910(c12598, this.f1704.m45975(new C15515("compiler", "incompatible.ret.type.in.mref", C19859.m45718(abstractC22664Mo31585, abstractC22664.mo31585()))));
        }
        if (z || m1975(abstractC22665.mo50622(), abstractC22664.mo50622(), c2596Mo2276)) {
            return;
        }
        C14769 c14769Mo50622 = abstractC22665.mo50622();
        C11040 c11040 = C22843.f74058;
        this.f1705.m34520(c12598, new C11040("compiler", "incompatible.thrown.types.in.mref", c14769Mo50622));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1975(C14769 c14769, C14769 c147610, C2596 c2596) {
        int i = 0;
        C14769 c147611 = (C14769) C1170.stream(c147610).filter(new C18035(i, c2596)).collect(C14769.m35544());
        C14769 c14769M35548 = c147610.m35548(c147611);
        C14769<AbstractC22664> c147612 = (C14769) C1170.stream(c14769).filter(new C7594(i, this)).collect(C14769.m35544());
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22664 : c147612) {
            Iterator it = c14769M35548.iterator();
            do {
                if (!it.hasNext()) {
                    c18499.m43089(abstractC22664);
                    break;
                }
            } while (!this.f1670.m55131(abstractC22664, (AbstractC22664) it.next(), true));
        }
        if (c147611.isEmpty() && !c18499.isEmpty()) {
            return false;
        }
        final C14769 c14769M8709 = c2596.m8709(c147611);
        C4937.forEach(c18499, new Consumer() { // from class: l.ᩳۖ᩺
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C4937.forEach(c14769M8709, new C0136(0, this.f60994, (AbstractC22664) obj));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        C1170.stream(c14769M8709).filter(new C12928(1)).forEach(new C9830(0));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1909(final C3168 c3168, final AbstractC15581 abstractC15581, final AbstractC22664 abstractC22664, final AbstractC22664 abstractC22665, final AbstractC22664 abstractC22666, final InterfaceC1013 interfaceC1013) {
        if (abstractC22665.m51073(interfaceC1013.mo2276().f8340)) {
            interfaceC1013.mo2276().m8700(C14769.of((Object) abstractC22664, (Object) abstractC22665), new InterfaceC10382() { // from class: l.ܳۖ᩺
                @Override // l.InterfaceC10382
                /* JADX INFO: renamed from: ۙ */
                public final void mo2127(C2596 c2596) {
                    AbstractC22664 abstractC22667 = abstractC22666;
                    this.f49113.m1909(c3168, abstractC15581, abstractC22664, c2596.m8696(abstractC22665), c2596.m8696(abstractC22667), interfaceC1013);
                }
            });
            return;
        }
        if (abstractC22664.m51067(EnumC21172.CLASS)) {
            abstractC15581.f50682 = abstractC22666;
        }
        if (interfaceC1013.mo2277().f15331 != EnumC16124.CHECK || abstractC22664 == AbstractC22664.f73591) {
            return;
        }
        try {
            C24550 c24550M55107 = this.f1670.m55107(c3168, this.f1668.f49799, abstractC15581.f50682, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            if (c24550M55107 != null) {
                this.f1698.m50002(c3168.f10273, c24550M55107, c24550M55107);
                try {
                    c24550M55107.f38071 |= 512;
                    this.f1670.m55143(c24550M55107.f38067);
                } catch (C11540 unused) {
                    this.f1675.f45571.mo3910(abstractC15581, this.f1704.m45975(C19859.m45719(abstractC15581.f50682)));
                }
            }
        } catch (C11540 e) {
            this.f1675.f45571.mo3910(c3168.f10273, e.m29044());
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1945(C1412 c1412) {
        AbstractC22664 abstractC22664M1933 = m1933(c1412.f4986, this.f1678, this.f1675);
        C14479 c14479 = this.f1675;
        this.f1691 = m1938(c1412, abstractC22664M1933, c14479.f45572, c14479);
        AbstractC11781 abstractC11781M28352 = C11239.m28352(c1412);
        if (abstractC11781M28352 == null || !abstractC11781M28352.f38066.m33349(C22114.f71272) || abstractC11781M28352.f38066 == EnumC13603.f43208) {
            return;
        }
        this.f1705.m34520(c1412, C22843.f74086);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1523(C20605 c20605) {
        AbstractC22295 abstractC22295 = c20605.f66030;
        C3168 c3168 = this.f1678;
        AbstractC22664 abstractC22664M1933 = m1933(abstractC22295, c3168.m10350(c20605, c3168.f10272), this.f1699);
        AbstractC22664 abstractC22664M55158 = this.f1670.m55158(abstractC22664M1933);
        m1934((AbstractC8036) c20605.f66031, this.f1678, abstractC22664M1933);
        this.f1691 = m1938(c20605, abstractC22664M55158, C22114.f71281, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        AbstractC22664 abstractC22664M1933 = m1933(c12400.f39896, this.f1678, this.f1699);
        AbstractC22664 abstractC22664M1934 = m1933(c12400.f39895, this.f1678, this.f1687);
        EnumC21461 enumC21461M48823 = c12400.mo2285().m48823();
        C1917 c1917 = this.f1682;
        C7395 c7395M6593 = c1917.m6593(c12400, enumC21461M48823, abstractC22664M1933, abstractC22664M1934);
        c12400.f62402 = c7395M6593;
        if (c7395M6593 != c1917.f6450 && !abstractC22664M1933.mo9329() && !abstractC22664M1934.mo9329()) {
            AbstractC22295 abstractC22295 = c12400.f39895;
            abstractC22295.getClass();
            C22092 c22092 = this.f1698;
            c22092.m49982(abstractC22295, c7395M6593, abstractC22664M1934);
            AbstractC22295 abstractC22296 = c12400.f39895;
            abstractC22296.getClass();
            c22092.m49969(abstractC22296, c7395M6593.f38067.mo31585(), abstractC22664M1933);
        }
        this.f1691 = m1938(c12400, abstractC22664M1933, C22114.f71281, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        AbstractC22664 abstractC22664M50037;
        AbstractC22664 abstractC22664Mo31585;
        C15378 c15378;
        AbstractC22664 abstractC22664M36834;
        if (c3561.mo2285().m48825()) {
            abstractC22664M50037 = m1933(c3561.f12203, this.f1678, this.f1699);
        } else {
            AbstractC22295 abstractC22295 = c3561.f12203;
            abstractC22295.getClass();
            abstractC22664M50037 = this.f1698.m50037(abstractC22295, m1933(c3561.f12203, this.f1678, this.f1687));
        }
        EnumC21461 enumC21461Mo2285 = c3561.mo2285();
        C1917 c1917 = this.f1682;
        C7395 c7395M6594 = c1917.m6594(c3561, enumC21461Mo2285, abstractC22664M50037);
        c3561.f62402 = c7395M6594;
        AbstractC22664 abstractC22664M55139 = this.f1670.m55139(c3561.f26659);
        if (c7395M6594 != c1917.f6450 && !abstractC22664M50037.mo9329()) {
            if (c3561.mo2285().m48825()) {
                abstractC22664Mo31585 = c3561.f12203.f26659;
            } else {
                abstractC22664Mo31585 = c7395M6594.f38067.mo31585();
            }
            abstractC22664M55139 = abstractC22664Mo31585;
            int i = c7395M6594.f24375;
            if (abstractC22664M50037.mo39105() != null && (abstractC22664M36834 = (c15378 = this.f1696).m36834(i, abstractC22664M50037)) != null) {
                abstractC22664M55139 = c15378.m36836(abstractC22664M36834, abstractC22664M55139);
            }
        }
        this.f1691 = m1938(c3561, abstractC22664M55139, C22114.f71281, this.f1675);
        C17775 c17775 = this.f1667;
        this.f1680.getClass();
        if (c17775 != C16283.f52877 && c3561.m21911(EnumC21461.f68521)) {
            c17775 = new C17775(c17775.f58360, c17775.f58362, false);
        }
        this.f1667 = c17775;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        C14769 c14769M35543;
        C15378 c15378;
        AbstractC22664 abstractC22664M36835;
        AbstractC22295 abstractC22295 = c6435.f21672;
        abstractC22295.getClass();
        AbstractC22295 abstractC22296 = c6435.f21672;
        C3168 c3168 = this.f1678;
        C14479 c14479 = this.f1687;
        AbstractC22664 abstractC22664M1933 = m1933(abstractC22296, c3168, c14479);
        C22092 c22092 = this.f1698;
        AbstractC22664 abstractC22664M50037 = c22092.m50037(abstractC22295, abstractC22664M1933);
        C17775 c17775 = this.f1667;
        int i = C13559.f43052[c6435.mo2285().ordinal()];
        if (i == 17) {
            c14769M35543 = c17775.f58362;
        } else if (i == 18) {
            c14769M35543 = c17775.f58360;
        } else {
            c14769M35543 = C14769.m35543();
        }
        C3168 c3169 = this.f1678;
        C3168 c3168M1900 = m1900(c3169, c3169.f10273, c14769M35543);
        Object obj = c3168M1900.f10272;
        try {
            AbstractC22295 abstractC22297 = c6435.f21671;
            abstractC22297.getClass();
            AbstractC22664 abstractC22664M50038 = c22092.m50037(abstractC22297, m1933(c6435.f21671, c3168M1900, c14479));
            ((C7768) obj).f25562.mo7484();
            this.f1667 = this.f1680.m38635(c6435, c17775, this.f1667);
            EnumC21461 enumC21461Mo2285 = c6435.mo2285();
            C1917 c1917 = this.f1682;
            C7395 c7395M6593 = c1917.m6593(c6435, enumC21461Mo2285, abstractC22664M50037, abstractC22664M50038);
            c6435.f62402 = c7395M6593;
            AbstractC22664 abstractC22664 = c6435.f26659;
            C24705 c24705 = this.f1670;
            AbstractC22664 abstractC22664M55139 = c24705.m55139(abstractC22664);
            if (c7395M6593 != c1917.f6450 && !abstractC22664M50037.mo9329() && !abstractC22664M50038.mo9329()) {
                AbstractC22664 abstractC22664Mo31585 = c7395M6593.f38067.mo31585();
                int i2 = c7395M6593.f24375;
                if (abstractC22664M50037.mo39105() != null && abstractC22664M50038.mo39105() != null && (abstractC22664M36835 = (c15378 = this.f1696).m36835(i2, abstractC22664M50037, abstractC22664M50038)) != null) {
                    abstractC22664Mo31585 = c15378.m36836(abstractC22664M36835, abstractC22664Mo31585);
                }
                if ((i2 == 165 || i2 == 166) && !c24705.m55130(abstractC22664M50037, abstractC22664M50038, new C1083(c6435))) {
                    C11040 c11040 = C22843.f74058;
                    this.f1705.m34520(c6435, new C11040("compiler", "incomparable.types", abstractC22664M50037, abstractC22664M50038));
                }
                AbstractC22295 abstractC22298 = c6435.f21671;
                abstractC22298.getClass();
                c22092.m49982(abstractC22298, c7395M6593, abstractC22664M50038);
                abstractC22664M55139 = abstractC22664Mo31585;
            }
            this.f1691 = m1938(c6435, abstractC22664M55139, C22114.f71281, this.f1675);
        } catch (Throwable th) {
            ((C7768) obj).f25562.mo7484();
            throw th;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1963(C16985 c16985) {
        C14479 c14479;
        AbstractC22664 abstractC22664M1981 = m1981(c16985.f55514, this.f1678, AbstractC22664.f73590);
        AbstractC8036 abstractC8036 = c16985.f55514;
        C3168 c3168 = this.f1678;
        C22092 c22092 = this.f1698;
        boolean z = false;
        c22092.m49999(abstractC8036, c3168, false);
        C3168 c3169 = this.f1678;
        C3168 c3168M10350 = c3169.m10350(c16985, c3169.f10272);
        AbstractC22295 abstractC22295M28353 = C11239.m28353(c16985.f55515);
        if (this.f1684 && (abstractC22295M28353.m21911(EnumC21461.f68453) || abstractC22295M28353.m21911(EnumC21461.f68454))) {
            z = true;
        }
        if (z) {
            c14479 = new C14479(this, C22114.f71281, abstractC22664M1981, new C2373(this, this.f1675.f45571));
        } else {
            c14479 = this.f1687;
        }
        AbstractC22664 abstractC22664M1933 = m1933(c16985.f55515, c3168M10350, c14479);
        if (!z) {
            AbstractC22295 abstractC22295 = c16985.f55515;
            abstractC22295.getClass();
            abstractC22664M1981 = c22092.m49969(abstractC22295, abstractC22664M1933, abstractC22664M1981);
        }
        if (abstractC22664M1933.mo39105() != null) {
            abstractC22664M1981 = this.f1696.m36836(abstractC22664M1933, abstractC22664M1981);
        }
        this.f1691 = m1938(c16985, this.f1670.m55158(abstractC22664M1981), C22114.f71281, this.f1675);
        if (z) {
            return;
        }
        c22092.m50010(c16985);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1974(C25279 c25279) {
        AbstractC22664 abstractC22664M55139;
        AbstractC8036 abstractC8036;
        InterfaceC5075 interfaceC5075 = c25279.f81646;
        interfaceC5075.getClass();
        AbstractC22295 abstractC22295 = c25279.f81646;
        C3168 c3168 = this.f1678;
        C14479 c14479 = this.f1687;
        AbstractC22664 abstractC22664M1933 = m1933(abstractC22295, c3168, c14479);
        C22092 c22092 = this.f1698;
        AbstractC22664 abstractC22664M50028 = c22092.m50028(interfaceC5075, abstractC22664M1933);
        EnumC21461 enumC21461Mo2285 = c25279.f81647.mo2285();
        EnumC21461 enumC21461 = EnumC21461.f68486;
        C7312 c7312 = this.f1705;
        boolean zM1919 = false;
        C24705 c24705 = this.f1670;
        if (enumC21461Mo2285 != enumC21461 && c25279.f81647.mo2285() != EnumC21461.f68551) {
            abstractC22664M55139 = m1981(c25279.f81647, this.f1678, AbstractC22664.f73590);
            abstractC8036 = c25279.f81647;
            c22092.m49999(abstractC8036, this.f1678, false);
        } else {
            m1933(c25279.f81647, this.f1678, c14479);
            abstractC22664M55139 = c25279.f81647.f26659;
            if (c24705.m55131(abstractC22664M50028, abstractC22664M55139, true) && !abstractC22664M50028.mo9329() && !abstractC22664M55139.mo9329()) {
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c25279, new C11040("compiler", "instanceof.pattern.no.subtype", abstractC22664M50028, abstractC22664M55139));
            }
            abstractC8036 = C11239.m28332((AbstractC2903) c25279.f81647).f78930.f40166;
        }
        if (!abstractC22664M55139.m51067(EnumC21172.TYPEVAR)) {
            abstractC8036.getClass();
            abstractC22664M55139 = c22092.m49967(abstractC8036, abstractC22664M55139);
        }
        if (!abstractC22664M55139.mo9329() && !c24705.m55151(abstractC22664M55139)) {
            if (this.f1702) {
                AbstractC22295 abstractC22296 = c25279.f81646;
                abstractC22296.getClass();
                zM1919 = m1919(abstractC22296, abstractC22664M50028, abstractC22664M55139);
            } else {
                c7312.m34523(EnumC6984.SOURCE_LEVEL, c25279, EnumC3666.f12561.m11913(this.f1685));
                this.f1702 = true;
            }
            if (!zM1919) {
                abstractC22664M55139 = c24705.m55139(abstractC22664M55139);
            }
        }
        InterfaceC5075 interfaceC5076 = c25279.f81646;
        interfaceC5076.getClass();
        c22092.m49969(interfaceC5076, abstractC22664M50028, abstractC22664M55139);
        this.f1691 = m1938(c25279, this.f1703.f48255, C22114.f71281, this.f1675);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1919(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C1083 c1083 = new C1083();
        if (!this.f1670.m55130(abstractC22664, abstractC22665, c1083)) {
            ((C14436) this.f1698.f71222).mo3910(interfaceC5075, this.f1704.m45975(C19859.m45718(abstractC22664, abstractC22665)));
            return false;
        }
        if (!c1083.m4081(EnumC19876.UNCHECKED)) {
            return true;
        }
        C11040 c11040 = C22843.f74058;
        this.f1705.m34520(interfaceC5075, new C11040("compiler", "instanceof.reifiable.not.safe", abstractC22664, abstractC22665));
        return false;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        C22114 c22114 = C22114.f71269;
        C14479 c14479 = this.f1675;
        C14479 c144710 = new C14479(this, c22114, c14479.f45575, c14479.f45571);
        C12510 c12510 = c24335.f78930;
        AbstractC22664 abstractC22664M1933 = m1933(c12510.f40166, this.f1678, c144710);
        c12510.f26659 = abstractC22664M1933;
        c24335.f26659 = abstractC22664M1933;
        C12510 c12511 = c24335.f78930;
        C6650 c6650 = new C6650(c12511.f40170.f15825, c12511.f40164, c12511.f40166.f26659, ((C7768) this.f1678.f10272).f25562.f53083);
        c6650.f19997 = c24335.f26658;
        C12510 c12512 = c24335.f78930;
        c12512.f40168 = c6650;
        AbstractC17836 abstractC17836 = ((C7768) this.f1678.f10272).f25562;
        C22092 c22092 = this.f1698;
        if (c22092.m50020((InterfaceC5075) c12512, (AbstractC11781) c6650, abstractC17836)) {
            C12510 c12513 = c24335.f78930;
            c12513.getClass();
            c22092.m49981((InterfaceC5075) c12513, (C5816) c6650, ((C7768) this.f1678.f10272).f25562);
        }
        C14769 c14769 = c24335.f78930.f40170.f15824;
        C3168 c3168 = this.f1678;
        C11518 c11518 = this.f1669;
        c11518.m28997(c14769, c3168, c6650, c24335);
        C12510 c12514 = c24335.f78930;
        c11518.m28996(c12514.f40166, this.f1678, c6650, c12514);
        c11518.m29000();
        c22092.m49999((AbstractC8036) c24335.f78930.f40166, this.f1678, true);
        this.f1691 = c24335.f26659;
        this.f1667 = new C17775(C14769.of((Object) c6650), C14769.m35543(), false);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1951(C9614 c9614) {
        m1933(c9614.f31095, this.f1678, this.f1687);
        AbstractC22664 abstractC22664 = c9614.f31095.f26659;
        c9614.f26659 = abstractC22664;
        this.f1691 = abstractC22664;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1956(C13344 c13344) {
        m1933(c13344.f42553, this.f1678, this.f1687);
        C17775 c17775 = this.f1667;
        C3168 c3168 = this.f1678;
        C3168 c3168M1900 = m1900(c3168, c3168.f10273, c17775.f58362);
        Object obj = c3168M1900.f10272;
        try {
            m1934((AbstractC8036) c13344.f42552, c3168M1900, (AbstractC22664) this.f1703.f48255);
            ((C7768) obj).f25562.mo7484();
            AbstractC22664 abstractC22664 = c13344.f42553.f26659;
            c13344.f26659 = abstractC22664;
            this.f1691 = abstractC22664;
            C17775 c17776 = this.f1667;
            C16283 c16283 = this.f1680;
            c16283.getClass();
            this.f1667 = c16283.m38637(c13344, c17775, c17776);
        } catch (Throwable th) {
            ((C7768) obj).f25562.mo7484();
            throw th;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1960(C16129 c16129) {
        AbstractC22664 abstractC22664 = c16129.f26659;
        C24705 c24705 = this.f1670;
        AbstractC22664 abstractC22664M55139 = c24705.m55139(abstractC22664);
        AbstractC22664 abstractC22664M1933 = m1933(c16129.f52413, this.f1678, this.f1687);
        m1934((AbstractC8036) c16129.f52412, this.f1678, (AbstractC22664) this.f1703.f48253);
        if (c24705.m55142(abstractC22664M1933)) {
            abstractC22664M55139 = c24705.m55120(abstractC22664M1933);
        } else if (!abstractC22664M1933.m51067(EnumC21172.ERROR)) {
            C11040 c11040 = C22843.f74058;
            this.f1705.m34520(c16129, new C11040("compiler", "array.req.but.found", abstractC22664M1933));
        }
        if (!this.f1675.f45572.m50069(C22114.f71281)) {
            abstractC22664M55139 = c24705.m55158(abstractC22664M55139);
        }
        this.f1691 = m1938(c16129, abstractC22664M55139, C22114.f71275, this.f1675);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x030f  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        AbstractC22664 abstractC22664M55161;
        AbstractC11781 abstractC11781M1903;
        boolean z;
        AbstractC22664 abstractC22664;
        AbstractC22664 abstractC22664M55157;
        EnumC13603 enumC13603;
        C22114 c22114M50067 = C22114.f71274;
        AbstractC19728 abstractC19728 = c23041.f74774;
        C15252 c15252 = this.f1668;
        AbstractC19728 abstractC19729 = c15252.f49836;
        AbstractC19728 abstractC197210 = c15252.f49816;
        AbstractC19728 abstractC197211 = c15252.f49851;
        if (abstractC19728 == abstractC19729 || abstractC19728 == abstractC197211 || abstractC19728 == abstractC197210) {
            c22114M50067 = C22114.f71269;
        } else {
            C22114 c22114 = this.f1675.f45572;
            C22114 c22115 = C22114.f71273;
            if (c22114.m50069(c22115)) {
                c22114M50067 = C22114.m50067(c22114M50067, c22115);
            }
            C22114 c22116 = this.f1675.f45572;
            C22114 c22117 = C22114.f71269;
            if (c22116.m50069(c22117)) {
                c22114M50067 = C22114.m50067(c22114M50067, c22117, c22115);
            }
            if (this.f1675.f45572.m50069(C22114.f71276)) {
                c22114M50067 = C22114.m50067(c22114M50067, C22114.f71281, c22117);
            }
        }
        AbstractC22664 abstractC22664M1933 = m1933(c23041.f74776, this.f1678, new C14479(this, c22114M50067, AbstractC22664.f73590));
        boolean zM50069 = this.f1675.f45572.m50069(C22114.f71272);
        C24705 c24705 = this.f1670;
        if (!zM50069) {
            abstractC22664M1933 = c24705.m55158(abstractC22664M1933);
        }
        AbstractC22664 abstractC22665 = abstractC22664M1933;
        C22114 c22118 = C22114.f71269;
        C7312 c7312 = this.f1705;
        if (c22114M50067 == c22118) {
            AbstractC22664 abstractC22666 = abstractC22665;
            while (abstractC22666.m51067(EnumC21172.ARRAY)) {
                abstractC22666 = ((C2832) abstractC22666).f9333;
            }
            if (abstractC22666.m51067(EnumC21172.TYPEVAR)) {
                c7312.m34520(c23041, C22843.f74089);
                AbstractC19728 abstractC197212 = c23041.f74774;
                AbstractC22970 abstractC22970 = abstractC22665.f73596;
                c24705.getClass();
                C12748 c12748M55061 = C24705.m55061(abstractC197212, abstractC22970, abstractC22665);
                c23041.f26659 = c12748M55061;
                this.f1691 = c12748M55061;
                c23041.f74775 = c12748M55061.f73596;
                return;
            }
        }
        AbstractC11781 abstractC11781M28352 = C11239.m28352(c23041.f74776);
        C3168 c3168 = this.f1678;
        C7768 c7768 = (C7768) c3168.f10272;
        boolean z2 = c7768.f25569;
        c7768.f25569 = abstractC11781M28352 != null && abstractC11781M28352.f38072 == abstractC197211;
        c7768.f25570 = null;
        AbstractC11781 abstractC11781M1904 = m1903(c23041, abstractC11781M28352, abstractC22665, c3168, this.f1675);
        EnumC13603 enumC13604 = abstractC11781M1904.f38066;
        EnumC13603 enumC13605 = EnumC13603.f43205;
        C14764 c14764 = this.f1703;
        if (enumC13604 == enumC13605 && abstractC11781M1904.f38072 != abstractC197211 && ((C7768) this.f1678.f10272).f25567 != null) {
            AbstractC22295 abstractC22295 = c23041.f74776;
            abstractC22295.getClass();
            AbstractC22970 abstractC22971 = abstractC22665.f73596;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "not.encl.class", abstractC22971));
            abstractC11781M1904 = c14764.f48237;
        }
        if (abstractC11781M1904.mo7873() && abstractC11781M1904.f38066 != EnumC13603.f43213 && this.f1675.f45572.m50069(C22114.f71272)) {
            AbstractC22664 abstractC22664M55158 = c24705.m55158(abstractC22665);
            abstractC11781M1903 = m1903(c23041, abstractC11781M28352, abstractC22664M55158, this.f1678, this.f1675);
            abstractC22664M55161 = abstractC22664M55158;
        } else {
            abstractC22664M55161 = abstractC22665;
            abstractC11781M1903 = abstractC11781M1904;
        }
        EnumC20234 enumC20234 = ((C7768) this.f1678.f10272).f25570;
        if (enumC20234 != null) {
            enumC20234.m46507();
        }
        c23041.f74775 = abstractC11781M1903;
        if (!abstractC22664M55161.m51067(EnumC21172.TYPEVAR) || ((abstractC11781M1903 != null && abstractC11781M1903.f38066 == EnumC13603.f43213) || abstractC11781M1903.f38066 == EnumC13603.f43208)) {
            z = true;
        } else {
            z = true;
            abstractC22664M55161 = c24705.m55161(abstractC22664M55161, true);
        }
        if (abstractC11781M1903.f38066 == enumC13605) {
            C5816 c5816 = (C5816) abstractC11781M1903;
            m1916(c23041, this.f1678, c5816, z);
            if (C22114.f71279.m50070(this.f1675.f45572)) {
                m1966(c23041, c5816, c23041.f74776, this.f1678);
            }
        }
        if (abstractC11781M28352 != null && abstractC11781M28352.f38066 == enumC13605 && ((C5816) abstractC11781M28352).m16956() && abstractC11781M1903.f38066 == EnumC13603.f43218 && abstractC11781M1903.f38072.equals(c15252.f49781) && abstractC11781M1903.mo26689(c14764.f48287, abstractC11781M28352.f38067.f73596, c24705, true)) {
            C15400 c15400 = ((C7768) this.f1678.f10272).f25558;
            EnumC19876 enumC19876 = EnumC19876.TRY;
            if (c15400.m36878(enumC19876)) {
                c7312.m34532(enumC19876, c23041, C13146.f42061);
            }
        }
        EnumC13603 enumC13606 = abstractC11781M1903.f38066;
        EnumC13603 enumC13607 = EnumC13603.f43213;
        if (enumC13606 == enumC13607 && (abstractC11781M28352 == null || !abstractC11781M28352.f38066.m33349(C22114.f71272))) {
            c23041.f26659 = m1938(c23041.f74776, this.f1675.f45575, abstractC11781M28352 == null ? C22114.f71281 : abstractC11781M28352.f38066.m33350(), new C14479(this, C22114.f71272, this.f1675.f45575));
        }
        C22010 c22010 = this.f1707;
        C22092 c22092 = this.f1698;
        if (abstractC11781M28352 != null && abstractC11781M28352.f38066 == enumC13607) {
            if (abstractC11781M1903.f38072 == c15252.f49836) {
                C3168 c3169 = this.f1678;
                if (((C7768) c3169.f10272).f25560 && abstractC22664M55161.f73596 == c3169.f10279.f26345) {
                    c22092.m50047(c23041, abstractC11781M1903);
                }
            } else {
                if ((abstractC11781M1903.mo29591() & 8) == 0 && abstractC11781M1903.f38072 != abstractC197211 && ((enumC13603 = abstractC11781M1903.f38066) == enumC13605 || enumC13603 == EnumC13603.f43218)) {
                    C17359.requireNonNull(c22010);
                    c22010.m49777((AbstractC11781) new C8301(abstractC11781M1903, c22010), (InterfaceC5075) c23041, (AbstractC11781) abstractC22664M55161.f73596, abstractC22664M55161, abstractC11781M1903.f38072, true);
                }
                if (!this.f1693 && abstractC11781M28352.m29587() && abstractC11781M1903.mo7874() && abstractC11781M1903.f38066 == EnumC13603.f43218) {
                    c7312.m34523(EnumC6984.SOURCE_LEVEL, c23041, EnumC3666.f12564.m11913(this.f1685));
                }
            }
            if (!this.f1693) {
                c7312.m34523(EnumC6984.SOURCE_LEVEL, c23041, EnumC3666.f12564.m11913(this.f1685));
            }
        } else if (abstractC11781M1903.f38066 != EnumC13603.f43208 && (abstractC11781M1903.mo29591() & 8) != 0 && abstractC11781M1903.f38072 != abstractC197210) {
            EnumC4960 enumC4960M33346 = abstractC11781M1903.f38066.m33346();
            AbstractC11781 abstractC11781 = abstractC11781M1903.f38069;
            C25213 c25213 = C13146.f42046;
            c22092.m50016(c23041, new C25213("compiler", "static.not.qualified.by.type", enumC4960M33346, abstractC11781));
        }
        if (((C7768) this.f1678.f10272).f25569 && (abstractC11781M1903.mo29591() & 8) == 0) {
            c22010.m49787(c23041, abstractC11781M1903);
            if (!abstractC22664M55161.mo9328() || (abstractC22664M55157 = c24705.m55157(abstractC22664M55161.f73596, this.f1678.f10279.f26345.f38067)) == null) {
                abstractC22664 = abstractC22664M55161;
            } else {
                abstractC22664 = abstractC22664M55157;
            }
        } else {
            abstractC22664 = abstractC22664M55161;
        }
        C7768 c7769 = (C7768) this.f1678.f10272;
        if (c7769.f25556) {
            c22092.m50014(c23041, c7769.f25553);
        }
        C3168 c31610 = this.f1678;
        ((C7768) c31610.f10272).f25569 = z2;
        this.f1691 = m1936(c23041, abstractC22664, abstractC11781M1903, c31610, this.f1675);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11781 m1903(C23041 c23041, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, C3168 c3168, C14479 c14479) {
        AbstractC11781 c1699;
        AbstractC19728 abstractC19728 = c23041.f74774;
        int i = C13559.f43050[abstractC22664.mo9097().ordinal()];
        C22010 c22010 = this.f1707;
        C7312 c7312 = this.f1705;
        C15252 c15252 = this.f1668;
        C24705 c24705 = this.f1670;
        C14764 c14764 = this.f1703;
        switch (i) {
            case 1:
                AbstractC22970 abstractC22970 = abstractC22664.f73596;
                C22114 c22114 = c14479.f45572;
                C22010 c22011 = this.f1707;
                return c22011.m49777(c22011.m49782(c23041, c3168, abstractC22970, abstractC19728, c22114), (InterfaceC5075) c23041, abstractC11781, abstractC22664, abstractC19728, true);
            case 2:
            case 3:
                AbstractC22664 abstractC22665 = c14479.f45575;
                if (abstractC22665.m51067(EnumC21172.METHOD) || abstractC22665.m51067(EnumC21172.FORALL)) {
                    return this.f1707.m49772(c23041, c3168, abstractC11781, abstractC22664, abstractC19728, abstractC22665.mo50621(), abstractC22665.mo15882());
                }
                if (abstractC19728 == c15252.f49836 || abstractC19728 == c15252.f49851) {
                    return c22010.m49774(c23041, c3168, abstractC22664.f73596, abstractC19728);
                }
                if (abstractC19728 == c15252.f49816) {
                    return c14764.m35516(abstractC22664, c24705);
                }
                return this.f1707.m49777(this.f1707.m49776(c23041, c3168, abstractC22664, abstractC19728, c14479.f45572), (InterfaceC5075) c23041, abstractC11781, abstractC22664, abstractC19728, true);
            case 4:
                throw new AssertionError(c23041);
            case 5:
                AbstractC11781 abstractC11781M1903 = abstractC22664.mo19992() != null ? m1903(c23041, abstractC11781, c24705.m55158(abstractC22664.mo19992()), c3168, c14479) : null;
                if (abstractC11781M1903 == null) {
                    c7312.m34520(c23041, C22843.f74089);
                    return c14764.f48237;
                }
                if ((abstractC11781M1903.mo29591() & 2) != 0) {
                    C17359.requireNonNull(c22010);
                    c1699 = new C1699(c22010, c3168, abstractC22664, abstractC11781M1903);
                } else {
                    c1699 = abstractC11781M1903;
                }
                this.f1707.m49777(c1699, (InterfaceC5075) c23041, abstractC11781, abstractC22664, abstractC19728, true);
                return abstractC11781M1903;
            case 6:
                AbstractC22970 abstractC22971 = abstractC22664.f73596;
                c24705.getClass();
                return C24705.m55061(abstractC19728, abstractC22971, abstractC22664).f73596;
            default:
                if (abstractC19728 == c15252.f49816) {
                    return c14764.m35516(abstractC22664, c24705);
                }
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c23041, new C11040("compiler", "cant.deref", abstractC22664));
                return c14764.f48237;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1936(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, C3168 c3168, C14479 c14479) {
        if (!c14479.f45575.m51067(EnumC21172.FORALL) && !c14479.f45575.m51067(EnumC21172.METHOD)) {
            return m1937(abstractC8036, abstractC22664, abstractC11781, c14479.f45575, c3168, c14479);
        }
        if (c14479.f45572.m50069(C22114.f71270)) {
            return this.f1712.m14639(abstractC8036, abstractC22664, abstractC11781, c3168, c14479);
        }
        return m1937(abstractC8036, abstractC22664, abstractC11781, c14479.f45575, c3168, c14479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1937(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, AbstractC22664 abstractC22665, C3168 c3168, C14479 c14479) {
        AbstractC22664 c10510;
        AbstractC22664 abstractC22664M55126;
        AbstractC11781 abstractC11781M28352;
        AbstractC19728 abstractC19728;
        AbstractC22664 abstractC22664M55101;
        boolean zMo9329 = abstractC22665.mo9329();
        C24705 c24705 = this.f1670;
        if (zMo9329) {
            return c24705.m55139(abstractC22664);
        }
        int i = C13559.f43051[abstractC11781.f38066.ordinal()];
        C15252 c15252 = this.f1668;
        C22092 c22092 = this.f1698;
        switch (i) {
            case 8:
                c10510 = abstractC11781.f38067;
                EnumC21172 enumC21172 = EnumC21172.CLASS;
                if (c10510.m51067(enumC21172)) {
                    abstractC8036.getClass();
                    c22092.m49998(abstractC8036, c3168, (C24550) abstractC11781);
                    AbstractC22664 abstractC22664Mo23449 = c10510.mo23449();
                    if (c10510.f73596.f38067.mo15882().m35550()) {
                        c10510 = c24705.m55132(c10510);
                    } else if (abstractC22664Mo23449.m51067(enumC21172) && abstractC22664 != abstractC22664Mo23449) {
                        AbstractC22664 abstractC22664M55104 = abstractC22664.m51067(enumC21172) ? c24705.m55104(abstractC22664, abstractC22664Mo23449.f73596) : abstractC22664;
                        if (abstractC22664M55104 == null) {
                            abstractC22664M55104 = c24705.m55132(abstractC22664Mo23449);
                        }
                        if (abstractC22664M55104 != abstractC22664Mo23449) {
                            c10510 = new C10510(abstractC22664M55104, C14769.m35543(), c10510.f73596, c10510.m51069());
                        }
                    }
                }
                break;
            case 9:
                C5816 c5816 = (C5816) abstractC11781;
                if (((C7768) c3168.f10272).f25557 != null && c5816.f38067.m51067(EnumC21172.NONE)) {
                    AbstractC8036 abstractC8037 = c3168.f10279;
                    AbstractC8036 abstractC8036M28324 = C11239.m28324(c5816, abstractC8037);
                    if (abstractC8036M28324 != null) {
                        abstractC8037 = abstractC8036M28324;
                    }
                    this.f1705.m34517(abstractC8037.f26658, C22843.m51555(c5816.f38072, C19859.f63855));
                    C12748 c12748M55139 = c24705.m55139(c5816.f38067);
                    c5816.f38067 = c12748M55139;
                    return c12748M55139;
                }
                if (C22114.f71279.m50070(this.f1675.f45572) && c5816.f38069.f38066 == EnumC13603.f43213 && (c5816.f38071 & 8) == 0 && ((abstractC22664.m51067(EnumC21172.CLASS) || abstractC22664.m51067(EnumC21172.TYPEVAR)) && (abstractC22664M55101 = c24705.m55101(c5816.f38069, abstractC22664)) != null && abstractC22664M55101.mo9328() && !c24705.m55149(c5816.f38067, c5816.mo29576(c24705)))) {
                    abstractC8036.getClass();
                    C25213 c25213 = C13146.f42046;
                    c22092.m50048(abstractC8036, new C25213("compiler", "unchecked.assign.to.var", c5816, abstractC22664M55101));
                }
                EnumC13603 enumC13603 = abstractC11781.f38069.f38066;
                EnumC13603 enumC13604 = EnumC13603.f43213;
                if (enumC13603 == enumC13604 && (abstractC19728 = abstractC11781.f38072) != c15252.f49836 && abstractC19728 != c15252.f49851) {
                    abstractC22664M55126 = c24705.m55126(abstractC11781, abstractC22664);
                } else {
                    abstractC22664M55126 = abstractC11781.f38067;
                }
                c10510 = (c5816.m16959() == null || (abstractC8036.m21911(EnumC21461.f68485) && ((abstractC11781M28352 = C11239.m28352(((C23041) abstractC8036).f74776)) == null || abstractC11781M28352.f38066 != enumC13604))) ? abstractC22664M55126 : abstractC22664M55126.mo23624(c5816.m16959());
                if (c14479.f45572 == C22114.f71281) {
                    c10510 = c24705.m55158(c10510);
                }
                break;
                break;
            case 10:
                C22114 c22114 = c14479.f45572;
                AbstractC22664 abstractC22666 = c14479.f45575;
                c10510 = m1943(abstractC22664, abstractC11781, new C14479(this, c22114, abstractC22666.mo31585(), c14479.f45571, c14479.f45574), c3168, C11239.m28327(c3168.f10273), abstractC22666.mo50621(), abstractC22666.mo15882());
                break;
            case 11:
            case 12:
                c10510 = abstractC11781.f38067;
                break;
            default:
                throw new AssertionError("unexpected kind: " + abstractC11781.f38066 + " in tree " + abstractC8036);
        }
        if (abstractC11781.f38072 != c15252.f49865 || abstractC8036.m21911(EnumC21461.f68454)) {
            abstractC8036.getClass();
            AbstractC11781 abstractC11782 = ((C7768) c3168.f10272).f25562.f53083;
            c22092.getClass();
            c22092.m49975(new C6234(abstractC8036), abstractC11782, abstractC11781);
            c22092.m50033(abstractC11781, abstractC8036);
            c22092.m50050(abstractC11781, abstractC8036);
            c22092.m49984(abstractC8036, ((C7768) c3168.f10272).f25562.f53083, abstractC11781);
        }
        return m1938(abstractC8036, c10510, abstractC11781.f38066.m33350(), c14479);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1916(AbstractC22295 abstractC22295, C3168 c3168, C5816 c5816, boolean z) {
        C24550 c24550M29558;
        C25213 c25213;
        C3168 c3169 = c3168;
        while (true) {
            switch (C13559.f43052[c3169.f10273.mo2285().ordinal()]) {
                case 15:
                case 16:
                case 21:
                    c3169 = null;
                    break;
                case 17:
                case 18:
                default:
                    continue;
                    C11972.m30021(c3169.f10274);
                    c3169 = c3169.f10274;
                    break;
                case 19:
                    if (((C12510) c3169.f10273).f40168.f38069.f38066 != EnumC13603.f43213) {
                        C11972.m30021(c3169.f10274);
                        c3169 = c3169.f10274;
                    }
                    break;
                case 20:
                    if (!c3169.f10274.f10273.m21911(EnumC21461.f68501)) {
                        C11972.m30021(c3169.f10274);
                        c3169 = c3169.f10274;
                    }
                    break;
            }
        }
        C7312 c7312 = this.f1705;
        if (c3169 != null) {
            C7768 c7768 = (C7768) c3169.f10272;
            if (c7768.f25557 == c5816 || c5816.f19997 > abstractC22295.f26658) {
                AbstractC11781 abstractC11781 = c5816.f38069;
                if (abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781 == ((C7768) c3168.f10272).f25562.f53083.m29558()) {
                    if (((c5816.f38071 & 8) != 0) == C22010.m49752(c3168) && (!c3168.f10273.m21911(EnumC21461.f68452) || C11239.m28353(((C20605) c3168.f10273).f66030) != abstractC22295)) {
                        if (!z || m1920(c5816)) {
                            c7312.m34520(abstractC22295, c7768.f25557 == c5816 ? C22843.f74076 : C22843.f74032);
                        } else if (this.f1697) {
                            if (c7768.f25557 == c5816) {
                                C25213 c25214 = C13146.f42046;
                                c25213 = new C25213("compiler", "self.ref", c5816);
                            } else {
                                C25213 c25215 = C13146.f42046;
                                c25213 = new C25213("compiler", "forward.ref", c5816);
                            }
                            c7312.m34531(abstractC22295, c25213);
                        }
                    }
                }
            }
        }
        c5816.m16959();
        if (!m1920(c5816) || (c24550M29558 = ((C7768) c3168.f10272).f25562.f53083.m29558()) == null || c24550M29558.f38069 == null) {
            return;
        }
        AbstractC11781 abstractC11782 = c5816.f38069;
        if (abstractC11782 == c24550M29558 || this.f1670.m55131(c24550M29558.f38067, abstractC11782.f38067, true)) {
            C13477 c13477 = C22010.f70995;
            AbstractC11781 abstractC11783 = ((C7768) c3168.f10272).f25562.f53083;
            if (!abstractC11783.m29570()) {
                if (abstractC11783.f38069.f38066 != EnumC13603.f43213) {
                    return;
                }
                EnumC13603 enumC13603 = abstractC11783.f38066;
                if ((enumC13603 != EnumC13603.f43205 && (enumC13603 != EnumC13603.f43218 || (abstractC11783.mo29591() & 1048576) == 0)) || (abstractC11783.mo29591() & 8) != 0) {
                    return;
                }
            }
            c7312.m34520(abstractC22295, C22843.f74163);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1920(C5816 c5816) {
        AbstractC11781 abstractC11781 = c5816.f38069;
        int i = C2417.f7744;
        return ((abstractC11781.mo29591() & 16384) == 0 || (c5816.f38071 & 8) == 0 || c5816.m16959() != null || c5816.f38072 == this.f1668.f49816) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0297 A[Catch: ᩺ۚۘ -> 0x02c1, ۫ۤۘ -> 0x02c5, TryCatch #12 {۫ۤۘ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:163:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1 A[Catch: ᩺ۚۘ -> 0x02c1, ۫ۤۘ -> 0x02c5, TryCatch #12 {۫ۤۘ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:163:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e A[Catch: ۫ۤۘ -> 0x0283, ᩺ۚۘ -> 0x02c7, TRY_ENTER, TryCatch #3 {᩺ۚۘ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:153:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0289 A[Catch: ᩺ۚۘ -> 0x02c7, ۫ۤۘ -> 0x02cd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {۫ۤۘ -> 0x02cd, blocks: (B:90:0x0264, B:98:0x0289), top: B:147:0x0264 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1943(AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, C14479 c14479, C3168 c3168, C14769 c14769, C14769 c147610, C14769 c147611) {
        InterfaceC1013 interfaceC1013;
        C14769 c147612;
        C7312 c7312;
        Object obj;
        C3168 c3169;
        C14769 c147613;
        C24705 c24705;
        C14769 c147614;
        AbstractC22664 c23191;
        EnumC8869 enumC8869;
        EnumC20234 enumC20234;
        boolean z;
        Object obj2;
        AbstractC22664 abstractC22664M55101;
        InterfaceC1013 interfaceC1014 = c14479.f45571;
        C22010 c22010 = this.f1707;
        long jMo29591 = abstractC11781.mo29591() & 8;
        C22092 c22092 = this.f1698;
        C24705 c24706 = this.f1670;
        if (jMo29591 == 0 && ((abstractC22664.m51067(EnumC21172.CLASS) || abstractC22664.m51067(EnumC21172.TYPEVAR)) && (abstractC22664M55101 = c24706.m55101(abstractC11781.f38069, abstractC22664)) != null && abstractC22664M55101.mo9328() && !c24706.m55148(abstractC11781.f38067.mo50621(), abstractC11781.mo29576(c24706).mo50621()))) {
            AbstractC8036 abstractC8036 = c3168.f10273;
            abstractC8036.getClass();
            C25213 c25213 = C13146.f42046;
            c22092.m50048(abstractC8036, new C25213("compiler", "unchecked.call.mbr.of.raw.type", abstractC11781, abstractC22664M55101));
        }
        Object obj3 = c3168.f10272;
        AbstractC22664 abstractC22665 = ((C7768) obj3).f25567;
        C7312 c7313 = this.f1705;
        if (abstractC22665 != null) {
            Iterator it = c24706.m55144(c3168.f10279.f26659).m35552(c24706.m55137(c3168.f10279.f26659)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC1013 = interfaceC1014;
                    break;
                }
                AbstractC22664 abstractC22666 = (AbstractC22664) it.next();
                if (abstractC22666.f73596.mo29596((AbstractC11781) abstractC11781.m29558(), c24706)) {
                    C7768 c7768 = (C7768) obj3;
                    if (c24706.m55149(abstractC22666, c7768.f25567)) {
                        interfaceC1013 = interfaceC1014;
                    } else {
                        C14769 c14769M55098 = c24706.m55098(abstractC22666, (C10377) abstractC11781);
                        if (!c14769M55098.m35550() || (obj2 = c14769M55098.f48335) == abstractC11781) {
                            interfaceC1013 = interfaceC1014;
                        } else {
                            C10377 c10377 = (C10377) obj2;
                            interfaceC1013 = interfaceC1014;
                            if (c10377.mo26689(abstractC11781, c10377.m29558(), c24706, true)) {
                                AbstractC8036 abstractC8037 = c3168.f10273;
                                abstractC8037.getClass();
                                AbstractC22664 abstractC22667 = c7768.f25567;
                                C15515 c15515 = C19859.f63823;
                                C15515 c15516 = new C15515("compiler", "overridden.default", abstractC11781, abstractC22666);
                                C11040 c11040 = C22843.f74058;
                                c7313.m34520(abstractC8037, new C11040("compiler", "illegal.default.super.call", abstractC22667, c15516));
                                break;
                            }
                        }
                    }
                } else {
                    interfaceC1013 = interfaceC1014;
                }
                it = it;
                interfaceC1014 = interfaceC1013;
                c24706 = c24706;
            }
            ((C7768) obj3).f25567 = null;
        } else {
            c24706 = c24706;
            interfaceC1013 = interfaceC1014;
        }
        if (abstractC11781.mo7874() && abstractC22664.mo31586() && c3168.f10273.m21911(EnumC21461.f68526)) {
            C24533 c24533 = (C24533) c3168.f10273;
            if (c24533.f79554.m21911(EnumC21461.f68485) && !C11239.m28335(((C23041) c24533.f79554).f74776, this.f1668)) {
                AbstractC8036 abstractC8038 = c3168.f10273;
                abstractC8038.getClass();
                C11040 c11041 = C22843.f74058;
                c7313.m34520(abstractC8038, new C11040("compiler", "illegal.static.intf.meth.call", abstractC22664));
            }
        }
        C1083 c1083 = new C1083();
        try {
            obj = obj3;
            c7312 = c7313;
            try {
                try {
                    AbstractC22664 abstractC22664M49785 = this.f1707.m49785(c3168, abstractC22664, abstractC11781, c14479, c147610, c147611, c1083);
                    AbstractC22664 abstractC22668 = c14479.f45575;
                    C12863 c12863 = this.f1710;
                    C17359.requireNonNull(c12863);
                    try {
                        C7175 c7175 = new C7175(c12863, EnumC16124.CHECK, abstractC11781, ((C7768) obj).f25570);
                        c147612 = c147610;
                        try {
                            C14769 c14769M35547 = c147612.m35547((Function) c7175);
                            try {
                                try {
                                    try {
                                        try {
                                            if (c1083.m4084(EnumC19876.UNCHECKED)) {
                                                try {
                                                    try {
                                                        AbstractC8036 abstractC8039 = c3168.f10273;
                                                        abstractC8039.getClass();
                                                        EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781);
                                                        AbstractC19728 abstractC19728 = abstractC11781.f38072;
                                                        Object objM49759 = c22010.m49759(abstractC11781.f38067.mo50621());
                                                        Object objM497510 = c22010.m49759(c14769M35547.m35547((Function) c7175));
                                                        EnumC4960 enumC4960M27727 = C10925.m27726(abstractC11781.m29579());
                                                        AbstractC11781 abstractC11781M29579 = abstractC11781.m29579();
                                                        try {
                                                            C25213 c25214 = C13146.f42046;
                                                            c22010 = c22010;
                                                            try {
                                                                c147614 = c14769M35547;
                                                                try {
                                                                    c22092.m50048(abstractC8039, new C25213("compiler", "unchecked.meth.invocation.applied", enumC4960M27726, abstractC19728, objM49759, objM497510, enumC4960M27727, abstractC11781M29579));
                                                                    try {
                                                                        try {
                                                                            if (abstractC22668 == C14528.f45689) {
                                                                                try {
                                                                                    if (!abstractC22664M49785.m51067(EnumC21172.METHOD) || !abstractC22664M49785.mo18049()) {
                                                                                    }
                                                                                    if (abstractC11781.f38067.m51067(EnumC21172.FORALL) || !abstractC11781.f38067.mo31585().m51073(((C5291) abstractC11781.f38067).f18620)) {
                                                                                        enumC8869 = EnumC8869.STANDALONE;
                                                                                    } else {
                                                                                        enumC8869 = EnumC8869.POLY;
                                                                                    }
                                                                                    c3169 = c3168;
                                                                                    C11239.m28333(c3169.f10273, enumC8869);
                                                                                    if (abstractC22668 == C14528.f45689) {
                                                                                        return c23191;
                                                                                    }
                                                                                    C22092 c22093 = this.f1698;
                                                                                    enumC20234 = ((C7768) obj).f25570;
                                                                                    if (enumC20234 == null && enumC20234.m46507()) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    c147613 = c147614;
                                                                                    try {
                                                                                        c22093.m50015(c23191, abstractC11781, c3168, c14769, c147614, z, interfaceC1013.mo2276());
                                                                                        return c23191;
                                                                                    } catch (C24074 e) {
                                                                                        e = e;
                                                                                        C17007 c17007Mo32459 = e.mo32459();
                                                                                        C17359.requireNonNull(c22010);
                                                                                        C22010 c22011 = c22010;
                                                                                        C8339 c8339 = new C8339(c22011, abstractC11781, c17007Mo32459);
                                                                                        EnumC16124 enumC16124 = EnumC16124.CHECK;
                                                                                        EnumC20234 enumC20235 = ((C7768) obj).f25570;
                                                                                        C12863 c12864 = c22011.f71035;
                                                                                        C17359.requireNonNull(c12864);
                                                                                        c7312.mo20039(c8339.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12864, enumC16124, abstractC11781, enumC20235)), c147611));
                                                                                        return c24706.m55139(abstractC22664);
                                                                                    }
                                                                                } catch (C24074 e2) {
                                                                                    e = e2;
                                                                                    c147613 = c147614;
                                                                                    c3169 = c3168;
                                                                                    c24706 = c24706;
                                                                                    C17007 c17007Mo324510 = e.mo32459();
                                                                                    C17359.requireNonNull(c22010);
                                                                                    C22010 c22012 = c22010;
                                                                                    C8339 c83310 = new C8339(c22012, abstractC11781, c17007Mo324510);
                                                                                    EnumC16124 enumC16125 = EnumC16124.CHECK;
                                                                                    EnumC20234 enumC20236 = ((C7768) obj).f25570;
                                                                                    C12863 c12865 = c22012.f71035;
                                                                                    C17359.requireNonNull(c12865);
                                                                                    c7312.mo20039(c83310.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12865, enumC16125, abstractC11781, enumC20236)), c147611));
                                                                                    return c24706.m55139(abstractC22664);
                                                                                }
                                                                            }
                                                                            c23191 = new C23191(abstractC22664M49785.mo50621(), c24706.m55132(abstractC22664M49785.mo31585()), c24706.m55154(abstractC22664M49785.mo50622()), this.f1703.f48275);
                                                                            if (abstractC11781.f38067.m51067(EnumC21172.FORALL)) {
                                                                                enumC8869 = EnumC8869.STANDALONE;
                                                                            } else {
                                                                                enumC8869 = EnumC8869.STANDALONE;
                                                                            }
                                                                            c3169 = c3168;
                                                                            C11239.m28333(c3169.f10273, enumC8869);
                                                                            if (abstractC22668 == C14528.f45689) {
                                                                                return c23191;
                                                                            }
                                                                            C22092 c22094 = this.f1698;
                                                                            enumC20234 = ((C7768) obj).f25570;
                                                                            if (enumC20234 == null) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            c147613 = c147614;
                                                                            c22094.m50015(c23191, abstractC11781, c3168, c14769, c147614, z, interfaceC1013.mo2276());
                                                                            return c23191;
                                                                        } catch (C24074 e3) {
                                                                            e = e3;
                                                                            c147613 = c147614;
                                                                            c3169 = c3168;
                                                                            C17007 c17007Mo324511 = e.mo32459();
                                                                            C17359.requireNonNull(c22010);
                                                                            C22010 c22013 = c22010;
                                                                            C8339 c83311 = new C8339(c22013, abstractC11781, c17007Mo324511);
                                                                            EnumC16124 enumC16126 = EnumC16124.CHECK;
                                                                            EnumC20234 enumC20237 = ((C7768) obj).f25570;
                                                                            C12863 c12866 = c22013.f71035;
                                                                            C17359.requireNonNull(c12866);
                                                                            c7312.mo20039(c83311.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12866, enumC16126, abstractC11781, enumC20237)), c147611));
                                                                            return c24706.m55139(abstractC22664);
                                                                        }
                                                                    } catch (C13037 e4) {
                                                                        e = e4;
                                                                        c3169 = c3168;
                                                                        c24705 = c24706;
                                                                        AbstractC8036 abstractC80310 = c3169.f10273;
                                                                        abstractC80310.getClass();
                                                                        interfaceC1013.mo3910(abstractC80310, e.mo32459());
                                                                        return c24705.m55139(abstractC22664);
                                                                    }
                                                                    c24706 = c24706;
                                                                } catch (C24074 e5) {
                                                                    e = e5;
                                                                    c24706 = c24706;
                                                                    c147613 = c147614;
                                                                    c3169 = c3168;
                                                                    C17007 c17007Mo324512 = e.mo32459();
                                                                    C17359.requireNonNull(c22010);
                                                                    C22010 c22014 = c22010;
                                                                    C8339 c83312 = new C8339(c22014, abstractC11781, c17007Mo324512);
                                                                    EnumC16124 enumC16127 = EnumC16124.CHECK;
                                                                    EnumC20234 enumC20238 = ((C7768) obj).f25570;
                                                                    C12863 c12867 = c22014.f71035;
                                                                    C17359.requireNonNull(c12867);
                                                                    c7312.mo20039(c83312.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12867, enumC16127, abstractC11781, enumC20238)), c147611));
                                                                    return c24706.m55139(abstractC22664);
                                                                }
                                                            } catch (C24074 e6) {
                                                                e = e6;
                                                                c147614 = c14769M35547;
                                                            }
                                                        } catch (C24074 e7) {
                                                            e = e7;
                                                            c147614 = c14769M35547;
                                                            c22010 = c22010;
                                                        }
                                                    } catch (C24074 e8) {
                                                        e = e8;
                                                        c3169 = c3168;
                                                        c147613 = c14769M35547;
                                                        C17007 c17007Mo324513 = e.mo32459();
                                                        C17359.requireNonNull(c22010);
                                                        C22010 c22015 = c22010;
                                                        C8339 c83313 = new C8339(c22015, abstractC11781, c17007Mo324513);
                                                        EnumC16124 enumC16128 = EnumC16124.CHECK;
                                                        EnumC20234 enumC20239 = ((C7768) obj).f25570;
                                                        C12863 c12868 = c22015.f71035;
                                                        C17359.requireNonNull(c12868);
                                                        c7312.mo20039(c83313.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12868, enumC16128, abstractC11781, enumC20239)), c147611));
                                                        return c24706.m55139(abstractC22664);
                                                    }
                                                } catch (C13037 e9) {
                                                    e = e9;
                                                    abstractC22664 = abstractC22664;
                                                    c3169 = c3168;
                                                    c24705 = c24706;
                                                    AbstractC8036 abstractC80311 = c3169.f10273;
                                                    abstractC80311.getClass();
                                                    interfaceC1013.mo3910(abstractC80311, e.mo32459());
                                                    return c24705.m55139(abstractC22664);
                                                }
                                            } else {
                                                c147614 = c14769M35547;
                                                c22010 = c22010;
                                            }
                                            C11239.m28333(c3169.f10273, enumC8869);
                                            if (abstractC22668 == C14528.f45689) {
                                                return c23191;
                                            }
                                            C22092 c22095 = this.f1698;
                                            enumC20234 = ((C7768) obj).f25570;
                                            if (enumC20234 == null) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            c147613 = c147614;
                                            c22095.m50015(c23191, abstractC11781, c3168, c14769, c147614, z, interfaceC1013.mo2276());
                                            return c23191;
                                        } catch (C13037 e10) {
                                            e = e10;
                                            c24705 = c24706;
                                            AbstractC8036 abstractC80312 = c3169.f10273;
                                            abstractC80312.getClass();
                                            interfaceC1013.mo3910(abstractC80312, e.mo32459());
                                            return c24705.m55139(abstractC22664);
                                        }
                                    } catch (C24074 e11) {
                                        e = e11;
                                        c147613 = c147614;
                                    }
                                    if (abstractC11781.f38067.m51067(EnumC21172.FORALL)) {
                                        enumC8869 = EnumC8869.STANDALONE;
                                    } else {
                                        enumC8869 = EnumC8869.STANDALONE;
                                    }
                                    c3169 = c3168;
                                } catch (C13037 e12) {
                                    e = e12;
                                    c3169 = c3168;
                                }
                                c24706 = c24706;
                                c23191 = abstractC22664M49785;
                            } catch (C24074 e13) {
                                e = e13;
                                c3169 = c3168;
                            }
                        } catch (C24074 e14) {
                            e = e14;
                            c3169 = c3168;
                            c22010 = c22010;
                            c24706 = c24706;
                            c147613 = c147612;
                            C17007 c17007Mo324514 = e.mo32459();
                            C17359.requireNonNull(c22010);
                            C22010 c22016 = c22010;
                            C8339 c83314 = new C8339(c22016, abstractC11781, c17007Mo324514);
                            EnumC16124 enumC16129 = EnumC16124.CHECK;
                            EnumC20234 enumC202310 = ((C7768) obj).f25570;
                            C12863 c12869 = c22016.f71035;
                            C17359.requireNonNull(c12869);
                            c7312.mo20039(c83314.mo3799(EnumC22229.ERROR, c3169.f10273, abstractC11781, abstractC22664, abstractC11781.f38072, c147613.m35547((Function) new C9046(c12869, enumC16129, abstractC11781, enumC202310)), c147611));
                            return c24706.m55139(abstractC22664);
                        }
                    } catch (C24074 e15) {
                        e = e15;
                        c147612 = c147610;
                    }
                } catch (C13037 e16) {
                    e = e16;
                    c3169 = c3168;
                    abstractC22664 = abstractC22664;
                }
            } catch (C24074 e17) {
                e = e17;
                c147612 = c147610;
            }
        } catch (C13037 e18) {
            e = e18;
            abstractC22664 = abstractC22664;
            c3169 = c3168;
        } catch (C24074 e19) {
            e = e19;
            c147612 = c147610;
            c7312 = c7313;
            obj = obj3;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1970(C23787 c23787) {
        EnumC21172 enumC21172 = c23787.f77042;
        EnumC21172 enumC21173 = EnumC21172.CLASS;
        C14764 c14764 = this.f1703;
        this.f1691 = m1938(c23787, (enumC21172 == enumC21173 ? c14764.f48282 : c14764.f48292[enumC21172.ordinal()]).mo23624(c23787.f77043), C22114.f71281, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1958(C14089 c14089) {
        this.f1691 = m1938(c14089, this.f1703.f48292[c14089.f44595.ordinal()], C22114.f71269, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1968(C23589 c23589) {
        this.f1691 = m1938(c23589, new C2832(m1981(c23589.f76594, this.f1678, AbstractC22664.f73590), this.f1703.f48271), C22114.f71269, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1973(C25191 c25191) {
        AbstractC22664 abstractC22664M55101;
        AbstractC22664 abstractC22664 = c25191.f26659;
        C24705 c24705 = this.f1670;
        C10510 c10510M55139 = c24705.m55139(abstractC22664);
        AbstractC22295 abstractC22295 = c25191.f81425;
        abstractC22295.getClass();
        AbstractC22664 abstractC22664M1981 = m1981(c25191.f81425, this.f1678, AbstractC22664.f73590);
        C22092 c22092 = this.f1698;
        AbstractC22664 abstractC22664M50044 = c22092.m50044(abstractC22295, abstractC22664M1981);
        C14769 c14769 = c25191.f81424;
        C14769 c14769M1928 = m1928(c14769, this.f1678);
        c22092.m50007(c14769, c14769M1928);
        if (abstractC22664M50044.m51067(EnumC21172.CLASS)) {
            C14769 c14769Mo15882 = abstractC22664M50044.f73596.f38067.mo15882();
            if (c14769M1928.isEmpty()) {
                c14769M1928 = c14769Mo15882;
            }
            if (c14769M1928.m35551() == c14769Mo15882.m35551()) {
                C14769 c147610 = c14769M1928;
                while (c147610.m35550()) {
                    c147610.f48335 = ((AbstractC22664) c147610.f48335).mo27318((AbstractC22664) c14769Mo15882.f48335);
                    c147610 = c147610.f48336;
                    c14769Mo15882 = c14769Mo15882.f48336;
                }
                AbstractC22664 abstractC22664Mo23449 = abstractC22664M50044.mo23449();
                EnumC21172 enumC21172 = EnumC21172.CLASS;
                if (abstractC22664Mo23449.m51067(enumC21172)) {
                    AbstractC22295 abstractC22295M28341 = C11239.m28341(c25191.f81425);
                    if (abstractC22295M28341.m21911(EnumC21461.f68523)) {
                        abstractC22664M55101 = this.f1678.f10279.f26345.f38067;
                    } else if (abstractC22295M28341.m21911(EnumC21461.f68485)) {
                        abstractC22664M55101 = ((C23041) abstractC22295M28341).f74776.f26659;
                    } else {
                        throw new AssertionError("" + c25191);
                    }
                    if (abstractC22664Mo23449.m51067(enumC21172) && abstractC22664M55101 != abstractC22664Mo23449) {
                        if (abstractC22664M55101.m51067(enumC21172)) {
                            abstractC22664M55101 = c24705.m55101(abstractC22664Mo23449.f73596, abstractC22664M55101);
                        }
                        abstractC22664Mo23449 = abstractC22664M55101 == null ? c24705.m55132(abstractC22664Mo23449) : abstractC22664M55101;
                    }
                }
                c10510M55139 = new C10510(abstractC22664Mo23449, c14769M1928, abstractC22664M50044.f73596, abstractC22664M50044.m51069());
            } else {
                int iM35551 = c14769Mo15882.m35551();
                C7312 c7312 = this.f1705;
                if (iM35551 != 0) {
                    String string = Integer.toString(c14769Mo15882.m35551());
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c25191, new C11040("compiler", "wrong.number.type.args", string));
                } else {
                    AbstractC22970 abstractC22970 = abstractC22664M50044.f73596;
                    C11040 c11041 = C22843.f74058;
                    c7312.m34520(c25191, new C11040("compiler", "type.doesnt.take.params", abstractC22970));
                }
                c10510M55139 = c24705.m55139(c25191.f26659);
            }
        }
        this.f1691 = m1938(c25191, c10510M55139, C22114.f71269, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1969(C23699 c23699) {
        C24705 c24705;
        C18499<AbstractC22664> c18499 = new C18499();
        Iterator it = c23699.f76826.iterator();
        C18499 c184910 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c24705 = this.f1670;
            if (!zHasNext) {
                break;
            }
            AbstractC22295 abstractC22295 = (AbstractC22295) it.next();
            AbstractC22664 abstractC22664M1981 = m1981(abstractC22295, this.f1678, AbstractC22664.f73590);
            abstractC22295.getClass();
            C22092 c22092 = this.f1698;
            AbstractC22664 abstractC22664M49970 = c22092.m49970(abstractC22295, c22092.m50044(abstractC22295, abstractC22664M1981), this.f1703.f48325, c22092.f71222);
            if (!abstractC22664M49970.mo9329()) {
                if (c22092.m50035(abstractC22664M49970, c18499.m43093())) {
                    for (AbstractC22664 abstractC22664 : c18499) {
                        boolean zM55131 = c24705.m55131(abstractC22664M49970, abstractC22664, true);
                        boolean zM55132 = c24705.m55131(abstractC22664, abstractC22664M49970, true);
                        if (zM55131 || zM55132) {
                            AbstractC22664 abstractC22665 = zM55131 ? abstractC22664M49970 : abstractC22664;
                            if (!zM55131) {
                                abstractC22664 = abstractC22664M49970;
                            }
                            C11040 c11040 = C22843.f74058;
                            this.f1705.m34520(abstractC22295, new C11040("compiler", "multicatch.types.must.be.disjoint", abstractC22665, abstractC22664));
                        }
                    }
                }
                c18499.m43089(abstractC22664M49970);
                if (c184910 != null) {
                    c184910.m43089(abstractC22664M49970);
                }
            } else {
                if (c184910 == null) {
                    c184910 = new C18499();
                    c184910.m43091(c18499);
                }
                c184910.m43089(abstractC22664M49970);
            }
        }
        AbstractC22664 abstractC22664M1938 = m1938(c23699, c24705.m55147(c18499.m43093()), C22114.f71269, this.f1675.mo30573(EnumC17463.f56779));
        if (abstractC22664M1938.m51067(EnumC21172.CLASS)) {
            if (c184910 != null) {
                c18499 = c184910;
            }
            abstractC22664M1938 = new C6783((C10510) abstractC22664M1938, c18499.m43093());
        }
        this.f1691 = abstractC22664M1938;
        c23699.f26659 = abstractC22664M1938;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1965(C17731 c17731) throws Throwable {
        C14769 c14769 = c17731.f58264;
        this.f1698.m50007(c14769, m1928(c14769, this.f1678));
        AbstractC22664 abstractC22664M1935 = m1935(c17731, c17731.f58264);
        this.f1691 = abstractC22664M1935;
        c17731.f26659 = abstractC22664M1935;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1961(C16239 c16239) {
        C17969 c17969 = (C17969) c16239.f26659;
        C14769 c14769 = c16239.f52783;
        if (c14769 != null && c14769.m35550()) {
            C14769 c147610 = c16239.f52783;
            C11518 c11518 = this.f1669;
            c11518.getClass();
            c11518.f36243.m43089(new RunnableC8296(0, c11518, c147610));
        }
        if (c17969.mo19992().mo9329()) {
            return;
        }
        c17969.mo19991(m1935(c16239, c16239.f52785));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m1935(AbstractC8036 abstractC8036, C14769 c14769) throws Throwable {
        AbstractC22295 abstractC22295;
        HashSet hashSet = new HashSet();
        boolean zM35550 = c14769.m35550();
        C24705 c24705 = this.f1670;
        if (zM35550) {
            Object obj = c14769.f48335;
            AbstractC22295 abstractC22296 = (AbstractC22295) obj;
            abstractC22296.f26659 = m1942(abstractC22296.f26659, (AbstractC8036) obj, false, false, false);
            hashSet.add(c24705.m55132(((AbstractC22295) c14769.f48335).f26659));
            if (((AbstractC22295) c14769.f48335).f26659.mo9329()) {
                return ((AbstractC22295) c14769.f48335).f26659;
            }
            if (((AbstractC22295) c14769.f48335).f26659.m51067(EnumC21172.TYPEVAR)) {
                if (c14769.f48336.m35550()) {
                    AbstractC22295 abstractC22297 = (AbstractC22295) c14769.f48336.f48335;
                    abstractC22297.getClass();
                    this.f1705.m34520(abstractC22297, C22843.f74079);
                    return ((AbstractC22295) c14769.f48335).f26659;
                }
            } else {
                for (AbstractC22295 abstractC22298 : c14769.f48336) {
                    AbstractC22664 abstractC22664M1942 = m1942(abstractC22298.f26659, (AbstractC8036) abstractC22298, false, true, false);
                    abstractC22298.f26659 = abstractC22664M1942;
                    if (abstractC22664M1942.mo9329()) {
                        c14769 = C14769.of((Object) abstractC22298);
                    } else if (abstractC22298.f26659.m51067(EnumC21172.CLASS)) {
                        this.f1698.m50013(abstractC22298, c24705.m55132(abstractC22298.f26659), hashSet);
                    }
                }
            }
        }
        if (c14769.m35551() == 0) {
            return this.f1703.f48286;
        }
        if (c14769.m35551() == 1) {
            return ((AbstractC22295) c14769.f48335).f26659;
        }
        C1562 c1562M55138 = c24705.m55138(C11239.m28328(c14769));
        if (((AbstractC22295) c14769.f48335).f26659.mo31586()) {
            abstractC22295 = null;
        } else {
            abstractC22295 = (AbstractC22295) c14769.f48335;
            c14769 = c14769.f48336;
        }
        C15714 c15714 = this.f1700;
        c15714.m37552((InterfaceC5075) abstractC8036);
        C7926 c7926M37514 = c15714.m37514(c15714.m37507(1025L), this.f1668.f49799, C14769.m35543(), abstractC22295, c14769, C14769.m35543());
        C24550 c24550 = (C24550) c1562M55138.f73596;
        c24550.mo29590();
        C11972.m30026((c24550.f38071 & 16777216) != 0);
        c7926M37514.f26345 = c24550;
        C3168 c3168 = this.f1678;
        c24550.f79584 = c3168.f10275.f61856;
        c24550.f38071 |= 268435456;
        this.f1688.getClass();
        this.f1677.m38997(c24550, C15846.m37790(c3168, c7926M37514));
        m1972(c24550);
        return c1562M55138;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1971(C24445 c24445) {
        AbstractC22664 abstractC22664M1981;
        EnumC18670 enumC18670 = c24445.f79358.f60145;
        EnumC18670 enumC18671 = EnumC18670.UNBOUND;
        C14764 c14764 = this.f1703;
        if (enumC18670 != enumC18671) {
            abstractC22664M1981 = m1981(c24445.f79357, this.f1678, AbstractC22664.f73590);
        } else {
            abstractC22664M1981 = c14764.f48286;
        }
        this.f1691 = m1938(c24445, new C10729(this.f1698.m49958(c24445, abstractC22664M1981), c24445.f79358.f60145, c14764.f48274), C22114.f71269, this.f1675);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1964(C17621 c17621) {
        C11972.m30024("should be handled in annotate");
        throw null;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        C3168 c3168 = this.f1678;
        for (C14769 c14769 = c16875.f55197; c14769.m35550(); c14769 = c14769.f48336) {
            m1981(((C17621) c14769.f48335).f57962, c3168, AbstractC22664.f73590);
        }
        AbstractC22664 abstractC22664Mo9927 = m1981(c16875.f55198, this.f1678, AbstractC22664.f73590).mo9927(C6256.f21228);
        if (!((C7768) this.f1678.f10272).f25561) {
            C14769 c147610 = c16875.f55197;
            C11518 c11518 = this.f1669;
            c11518.getClass();
            c11518.f36243.m43089(new RunnableC12200(c11518, c147610, abstractC22664Mo9927, 1));
        }
        c16875.f26659 = abstractC22664Mo9927;
        this.f1691 = abstractC22664Mo9927;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1957(C13891 c13891) {
        C14769 c14769 = c13891.f44048;
        if (c14769 != null) {
            C3168 c3168 = this.f1678;
            C3168 c3168M10350 = c3168.m10350(c3168.f10273, c3168.f10272);
            ((C7768) c3168M10350.f10272).f25564 = this.f1687;
            Iterator it = c14769.iterator();
            while (it.hasNext()) {
                m1933((AbstractC8036) it.next(), c3168M10350, new C14479(this, C22114.f71271, this.f1675.f45575));
            }
        }
        C12748 c12748 = this.f1703.f48263;
        c13891.f26659 = c12748;
        this.f1691 = c12748;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1949(AbstractC8036 abstractC8036) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1946(C3168 c3168) throws Throwable {
        int i = C13559.f43052[c3168.f10273.mo2285().ordinal()];
        C11518 c11518 = this.f1669;
        C22092 c22092 = this.f1698;
        if (i == 22) {
            AbstractC8036 abstractC8036 = c3168.f10273;
            abstractC8036.getClass();
            C2920 c2920 = ((C14835) c3168.f10273).f48524;
            try {
                c11518.m29000();
                C3168 c3168M38995 = this.f1688.f51524.m38995(c2920);
                m1932(c3168M38995.f10273, c3168M38995);
                return;
            } catch (C21566 e) {
                c22092.m49966(abstractC8036, e);
                return;
            }
        }
        if (i == 23) {
            AbstractC8036 abstractC8037 = c3168.f10273;
            abstractC8037.getClass();
            C14106 c14106 = ((C10360) c3168.f10273).f32981;
            try {
                c11518.m29000();
                AbstractC22295 abstractC22295 = ((C10360) this.f1677.m38995(c14106).f10273).f32980;
                abstractC22295.getClass();
                c22092.m50003(c14106, abstractC22295);
                return;
            } catch (C21566 e2) {
                c22092.m49966(abstractC8037, e2);
                return;
            }
        }
        AbstractC8036 abstractC8038 = c3168.f10273;
        abstractC8038.getClass();
        C24550 c24550 = c3168.f10279.f26345;
        try {
            c11518.m29000();
            m1972(c24550);
        } catch (C21566 e3) {
            c22092.m49966(abstractC8038, e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1972(C24550 c24550) throws Throwable {
        C15400 c15400;
        InterfaceC15976 interfaceC15976;
        C14479 c14479;
        boolean z;
        C15515 c15515;
        if (!c24550.f38067.m51067(EnumC21172.ERROR)) {
            AbstractC22664 abstractC22664 = c24550.f38067;
            C22092 c22092 = this.f1698;
            c22092.m50038(null, abstractC22664);
            AbstractC22664 abstractC22665 = c24550.f38067;
            C24705 c24705 = this.f1670;
            AbstractC22664 abstractC22664M55137 = c24705.m55137(abstractC22665);
            long j = c24550.f38071;
            if ((16777216 & j) == 0 && (j & 536870912) == 0) {
                EnumC21172 enumC21172 = EnumC21172.CLASS;
                if (abstractC22664M55137.m51067(enumC21172)) {
                    m1972((C24550) abstractC22664M55137.f73596);
                }
                AbstractC11781 abstractC11781 = c24550.f38069;
                if (abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.f38067.m51067(enumC21172)) {
                    m1972((C24550) c24550.f38069);
                }
                c24550.f38071 |= 536870912;
            }
            long j2 = c24550.f38071;
            if ((268435456 & j2) != 0) {
                c24550.f38071 = j2 & (-268435457);
                C3168 c3168M38995 = this.f1677.m38995(c24550);
                boolean zM29562 = c24550.m29562();
                C7312 c7312 = this.f1705;
                if (zM29562 && !c24550.m29588() && !c24550.f79581 && c24550.f79583.isEmpty()) {
                    c7312.m34520(C11239.m28325(c24550, c3168M38995.f10273, false), C22843.f74211);
                }
                boolean zM29563 = c24550.m29562();
                C14764 c14764 = this.f1703;
                if (zM29563) {
                    HashSet hashSet = new HashSet();
                    boolean z2 = c24550.m29564().f44618 == c14764.f48308 || c24550.m29564().f44618 == c14764.f48278;
                    for (Iterator it = c24550.f79583.iterator(); it.hasNext(); it = it) {
                        AbstractC11781 abstractC11782 = (AbstractC11781) it.next();
                        if (abstractC11782.f38067.mo9097() == EnumC21172.TYPEVAR) {
                            AbstractC8036 abstractC8036M28325 = C11239.m28325(abstractC11782, c3168M38995.f10273, false);
                            AbstractC22664 abstractC22666 = abstractC11782.f38067;
                            C15515 c15516 = C19859.f63823;
                            c7312.m34520(abstractC8036M28325, C22843.m51553(new C15515("compiler", "is.a.type.variable", abstractC22666)));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (abstractC11782.f38072.isEmpty() && !c24550.m29588()) {
                            AbstractC8036 abstractC8036M28326 = C11239.m28325(abstractC11782, c3168M38995.f10273, false);
                            C11040 c11040 = C22843.f74058;
                            c7312.m34520(abstractC8036M28326, new C11040("compiler", "local.classes.cant.extend.sealed", C19859.f63879));
                        }
                        if (hashSet.contains(abstractC11782)) {
                            InterfaceC5075 interfaceC5075 = (InterfaceC5075) ((C14769) C1170.stream(c3168M38995.f10279.f26342).filter(new C21765(0, abstractC11782)).limit(2L).collect(C14769.m35544())).get(1);
                            AbstractC22664 abstractC22667 = abstractC11782.f38067;
                            C15515 c15517 = C19859.f63823;
                            c7312.m34520(interfaceC5075, C22843.m51553(new C15515("compiler", "is.duplicated", abstractC22667)));
                        } else {
                            hashSet.add(abstractC11782);
                        }
                        if (z2) {
                            if (abstractC11782.m29564() != c24550.m29564()) {
                                AbstractC8036 abstractC8036M28327 = C11239.m28325(abstractC11782, c3168M38995.f10273, false);
                                C11040 c11041 = C22843.f74058;
                                c7312.m34520(abstractC8036M28327, new C11040("compiler", "class.in.unnamed.module.cant.extend.sealed.in.diff.package", c24550));
                            }
                        } else if (abstractC11782.m29564().f44618 != c24550.m29564().f44618) {
                            AbstractC8036 abstractC8036M28328 = C11239.m28325(abstractC11782, c3168M38995.f10273, false);
                            C2920 c2920 = c24550.m29564().f44618;
                            C11040 c11042 = C22843.f74058;
                            c7312.m34520(abstractC8036M28328, new C11040("compiler", "class.in.module.cant.extend.sealed.in.diff.module", c24550, c2920));
                        }
                        AbstractC22664 abstractC22668 = c24550.f38067;
                        if (abstractC11782 == abstractC22668.f73596 || c24705.m55141(abstractC11782.f38067, abstractC22668)) {
                            InterfaceC5075 interfaceC5076 = (InterfaceC5075) C1170.stream(((C7926) c3168M38995.f10273).f26342).map(new C7290(0, abstractC11782)).filter(new C16541(2)).findFirst().get();
                            if (abstractC11782 == c24550.f38067.f73596) {
                                c15515 = C19859.f63813;
                            } else {
                                AbstractC22664 abstractC22669 = abstractC11782.f38067;
                                C15515 c15518 = C19859.f63823;
                                c15515 = new C15515("compiler", "must.not.be.supertype", abstractC22669);
                            }
                            c7312.m34520(interfaceC5076, C22843.m51553(c15515));
                        } else if (!z && !C1170.stream(c24705.m55135(abstractC11782.f38067)).anyMatch(new C10576(0, c24550))) {
                            AbstractC8036 abstractC8036M28329 = C11239.m28325(abstractC11782, c3168M38995.f10273, false);
                            AbstractC22664 abstractC226610 = abstractC11782.f38067;
                            C15515 c15519 = C19859.f63823;
                            c7312.m34520(abstractC8036M28329, C22843.m51553(new C15515("compiler", "doesnt.extend.sealed", abstractC226610)));
                        }
                        abstractC22664M55137 = abstractC22664M55137;
                        c14764 = c14764;
                    }
                }
                C14764 c14765 = c14764;
                AbstractC22664 abstractC226611 = abstractC22664M55137;
                C14769<C24550> c14769 = (C14769) C1170.stream(c24705.m55135(c24550.f38067)).filter(new C6191(1)).map(new C9587(9)).collect(C14769.m35544());
                if (!c14769.isEmpty()) {
                    if (c24550.m29602() && !c24550.m29588()) {
                        AbstractC8036 abstractC8036M283210 = C11239.m28325(c24550, c3168M38995.f10273, false);
                        C15515 c155110 = c24550.f38072.isEmpty() ? C19859.f63879 : C19859.f63883;
                        C11040 c11043 = C22843.f74058;
                        c7312.m34520(abstractC8036M283210, new C11040("compiler", "local.classes.cant.extend.sealed", c155110));
                    }
                    if (!c24550.f38067.mo18914()) {
                        for (C24550 c24551 : c14769) {
                            if (!c24551.f79583.contains(c24550.f38067.f73596)) {
                                AbstractC8036 abstractC8036M283211 = C11239.m28325(c24550.f38067.f73596, c3168M38995.f10273, false);
                                C11040 c11044 = C22843.f74058;
                                c7312.m34520(abstractC8036M283211, new C11040("compiler", "cant.inherit.from.sealed", c24551));
                            }
                        }
                        long j3 = c24550.f38071;
                        if ((j3 & Long.MIN_VALUE) == 0 && (j3 & 16) == 0 && !c24550.m29562()) {
                            c7312.m34520(C11239.m28325(c24550, c3168M38995.f10273, false), c24550.m29587() ? C22843.f74114 : C22843.f74072);
                        }
                    }
                } else if ((c24550.f38071 & Long.MIN_VALUE) != 0 && !C1170.stream(c24705.m55135(c24550.f38067)).anyMatch(new C17603(2))) {
                    AbstractC8036 abstractC8036M283212 = C11239.m28325(c24550, c3168M38995.f10273, false);
                    C11040 c11045 = C22843.f74058;
                    c7312.m34520(abstractC8036M283212, new C11040("compiler", "non.sealed.with.no.sealed.supertype", c24550));
                }
                C3168 c3168 = c3168M38995;
                while (true) {
                    c15400 = ((C7768) c3168.f10272).f25558;
                    if (c15400 != null) {
                        break;
                    } else {
                        c3168 = c3168.f10274;
                    }
                }
                Object obj = c3168M38995.f10272;
                ((C7768) obj).f25558 = c15400.m36876(c24550);
                C7768 c7768 = (C7768) obj;
                C15400 c15400M49962 = c22092.m49962(c7768.f25558);
                InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c24550.f79584);
                C14479 c144710 = c7768.f25564;
                try {
                    this.f1672.m17748(c3168M38995.f10273);
                    ((C7768) obj).f25564 = null;
                    if (abstractC226611.f73596 == c14765.f48309) {
                        interfaceC15976 = interfaceC15976M34530;
                        c14479 = c144710;
                        try {
                            if ((c24550.f38071 & 16793600) == 0) {
                                AbstractC8036 abstractC8036 = c3168M38995.f10273;
                                abstractC8036.getClass();
                                c7312.m34520(abstractC8036, C22843.f74207);
                            }
                        } catch (Throwable th) {
                            th = th;
                            c7768.f25564 = c14479;
                            c7312.m34530(interfaceC15976);
                            c22092.m49962(c15400M49962);
                            throw th;
                        }
                    } else {
                        interfaceC15976 = interfaceC15976M34530;
                        c14479 = c144710;
                    }
                    AbstractC22970 abstractC22970 = abstractC226611.f73596;
                    if (abstractC22970 != null && (abstractC22970.f38071 & 16384) != 0 && (c24550.f38071 & 16793600) == 0) {
                        AbstractC8036 abstractC8037 = c3168M38995.f10273;
                        abstractC8037.getClass();
                        c7312.m34520(abstractC8037, C22843.f74146);
                    }
                    if (m1976(c24550.f38067)) {
                        ((C7768) obj).f25556 = true;
                    }
                    m1917(c24550, c3168M38995);
                    AbstractC8036 abstractC8038 = c3168M38995.f10273;
                    abstractC8038.getClass();
                    c22092.m50003((AbstractC11781) c24550, abstractC8038);
                    AbstractC8036 abstractC8039 = c3168M38995.f10273;
                    abstractC8039.getClass();
                    c22092.m50001(abstractC8039, c24550);
                    c22092.m49994((C7926) c3168M38995.f10273, c24550);
                    c22092.m49978(c3168M38995, (C7926) c3168M38995.f10273);
                    c7768.f25564 = c14479;
                    c7312.m34530(interfaceC15976);
                    c22092.m49962(c15400M49962);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC15976 = interfaceC15976M34530;
                    c14479 = c144710;
                }
            }
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        C2920 c2920 = c14835.f48524;
        InterfaceC14852 interfaceC14852 = c2920.f9555;
        InterfaceC14852 interfaceC14853 = InterfaceC14852.f48554;
        if (interfaceC14852 != interfaceC14853) {
            c2920.f9555 = interfaceC14853;
            interfaceC14852.mo11629(c2920);
        }
        C2920 c2921 = c14835.f48524;
        C7768 c7768 = (C7768) this.f1678.f10278.f10272;
        C15400 c15400M36876 = c7768.f25558.m36876(c2921);
        c7768.f25558 = c15400M36876;
        C22092 c22092 = this.f1698;
        C15400 c15400M49962 = c22092.m49962(c15400M36876);
        c22092.m50008(c14835);
        c22092.m50003(c2921, c14835);
        try {
            this.f1672.m17748((AbstractC8036) c14835);
        } finally {
            c22092.m49962(c15400M49962);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1917(C24550 c24550, C3168 c3168) throws Throwable {
        C15252 c15252;
        long j;
        C5816 c5816;
        C17621 c17621;
        AbstractC8036 abstractC8036 = c3168.f10273;
        Object obj = c3168.f10272;
        C7926 c7926 = (C7926) abstractC8036;
        C11972.m30026(c24550 == c7926.f26345);
        m1983(c7926.f26343, c3168);
        boolean zIsEmpty = c24550.f38072.isEmpty();
        C22092 c22092 = this.f1698;
        if (!zIsEmpty) {
            c22092.m50006(c7926.f26343, c3168);
            c22092.m49999((AbstractC8036) c7926.f26348, c3168, true);
            c22092.m50006(c7926.f26347, c3168);
        }
        C24705 c24705 = this.f1670;
        c24550.m54837(c24705);
        c24550.mo29590();
        if ((c24550.f38071 & 1536) == 0) {
            c22092.m50018(c24550, (InterfaceC5075) c7926);
        }
        c24550.mo29590();
        long j2 = c24550.f38071 & 8192;
        C7312 c7312 = this.f1705;
        if (j2 != 0) {
            if (c7926.f26347.m35550()) {
                AbstractC22295 abstractC22295 = (AbstractC22295) c7926.f26347.f48335;
                abstractC22295.getClass();
                c7312.m34520(abstractC22295, C22843.f74128);
            }
            if (c7926.f26343.m35550()) {
                C16239 c16239 = (C16239) c7926.f26343.f48335;
                c16239.getClass();
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c16239, new C11040("compiler", "intf.annotation.cant.have.type.params", c24550));
            }
            C23892 c23892Mo45419 = c24550.mo51845().mo45419();
            if (c23892Mo45419 != null) {
                AbstractC22664 abstractC22664 = c23892Mo45419.f69124;
                C14769 c14769 = c7926.f26341.f15824;
                while (true) {
                    if (c14769.isEmpty()) {
                        c17621 = null;
                        break;
                    } else {
                        if (c24705.m55149(((C17621) c14769.f48335).f57962.f26659, abstractC22664)) {
                            c17621 = (C17621) c14769.f48335;
                            c17621.getClass();
                            break;
                        }
                        c14769 = c14769.f48336;
                    }
                }
                C11972.m30021(c17621);
                c22092.m50019(c24550, c23892Mo45419, c17621);
            }
        } else {
            c22092.m50031(c7926, c24550.f38067);
            if (this.f1674) {
                c22092.m50040(c7926, c24550.f38067);
            }
        }
        AbstractC22664 abstractC22665 = c24550.f38067;
        c22092.getClass();
        c22092.m49979(c7926, new HashMap(), abstractC22665);
        c7926.f26659 = c24550.f38067;
        for (C14769 c147610 = c7926.f26343; c147610.m35550(); c147610 = c147610.f48336) {
            C11972.m30021(((C7768) obj).f25562.mo7474(((C16239) c147610.f48335).f52784, (Predicate) null));
        }
        if (!c24550.f38067.mo9323().isEmpty() && c24705.m55131(c24550.f38067, this.f1703.f48325, true)) {
            AbstractC22295 abstractC22296 = c7926.f26348;
            abstractC22296.getClass();
            c7312.m34520(abstractC22296, C22843.f74158);
        }
        C24550 c24551 = c7926.f26345;
        c22092.m50002((AbstractC8036) c7926, c24551, c24551);
        m1947((InterfaceC5075) c7926, c3168, c24550.f38067);
        C14769 c147611 = c7926.f26344;
        while (true) {
            boolean zM35550 = c147611.m35550();
            c15252 = this.f1668;
            if (!zM35550) {
                break;
            }
            m1932((AbstractC8036) c147611.f48335, c3168);
            if (!this.f1708 && c24550.f38069.f38066 != EnumC13603.f43219) {
                c24550.mo29590();
                if (((c24550.f38071 & 8) == 0 || c24550.f38072 == c15252.f49799) && (C11239.m28344((AbstractC8036) c147611.f48335) & 520) != 0) {
                    C5816 c5817 = ((AbstractC8036) c147611.f48335).m21911(EnumC21461.f68538) ? ((C12510) c147611.f48335).f40168 : null;
                    if (c5817 == null || c5817.f38066 != EnumC13603.f43205 || c5817.m16959() == null) {
                        AbstractC8036 abstractC8037 = (AbstractC8036) c147611.f48335;
                        abstractC8037.getClass();
                        C11040 c11041 = C22843.f74058;
                        c7312.m34520(abstractC8037, new C11040("compiler", "icls.cant.have.static.decl", c24550));
                    }
                }
            }
            c147611 = c147611.f48336;
        }
        c22092.m49993(c7926);
        long j3 = c7926.f26345.f38071;
        if ((j3 & 8192) != 0) {
            C11972.m30026((j3 & 134217728) == 0);
            try {
                j = 34359738368L;
                try {
                    c7926.f26345.f38071 |= 134217728;
                    for (AbstractC8036 abstractC8038 : c7926.f26344) {
                        if (abstractC8038.m21911(EnumC21461.f68505)) {
                            C6633 c6633 = (C6633) abstractC8038;
                            c22092.m49989(c6633, c6633.f22147.f26659);
                        }
                    }
                    C24550 c24552 = c7926.f26345;
                    c24552.f38071 = ((-134217729) & c24552.f38071) | 34359738368L;
                } catch (Throwable th) {
                    th = th;
                    C24550 c24553 = c7926.f26345;
                    c24553.f38071 = (c24553.f38071 & (-134217729)) | j;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 34359738368L;
            }
        }
        C7768 c7768 = (C7768) obj;
        if (c7768.f25558.m36878(EnumC19876.SERIAL) && m1976(c24550.f38067)) {
            c24550.mo29590();
            if ((c24550.f38071 & 16896) == 0 && !c24550.f38072.isEmpty()) {
                c24550.mo29590();
                Iterator it = c24550.f79576.m38842(c15252.f49833).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c5816 = null;
                        break;
                    }
                    AbstractC11781 abstractC11781 = (AbstractC11781) it.next();
                    if (abstractC11781.f38066 == EnumC13603.f43205) {
                        c5816 = (C5816) abstractC11781;
                        break;
                    }
                }
                if (c5816 != null) {
                    C15400 c15400M36876 = c7768.f25558.m36876(c5816);
                    EnumC19876 enumC19876 = EnumC19876.SERIAL;
                    if (!c15400M36876.m36879(enumC19876)) {
                        if ((c5816.f38071 & 24) != 24) {
                            AbstractC8036 abstractC8036M28325 = C11239.m28325(c5816, c7926, false);
                            C25213 c25213 = C13146.f42046;
                            c7312.m34532(enumC19876, abstractC8036M28325, new C25213("compiler", "improper.SVUID", c24550));
                        } else if (!c5816.f38067.m51067(EnumC21172.LONG)) {
                            AbstractC8036 abstractC8036M28326 = C11239.m28325(c5816, c7926, false);
                            C25213 c25214 = C13146.f42046;
                            c7312.m34532(enumC19876, abstractC8036M28326, new C25213("compiler", "long.SVUID", c24550));
                        } else if (c5816.m16959() == null) {
                            AbstractC8036 abstractC8036M28327 = C11239.m28325(c5816, c7926, false);
                            C25213 c25215 = C13146.f42046;
                            c7312.m34532(enumC19876, abstractC8036M28327, new C25213("compiler", "constant.SVUID", c24550));
                        }
                    }
                } else if (!c24550.m54827()) {
                    EnumC19876 enumC19877 = EnumC19876.SERIAL;
                    C25213 c25216 = C13146.f42046;
                    c7312.m34532(enumC19877, c7926, new C25213("compiler", "missing.SVUID", c24550));
                }
            }
        }
        if (this.f1689) {
            this.f1690.m30497(c7926);
            m1950((AbstractC8036) c7926, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1976(AbstractC22664 abstractC22664) {
        C14764 c14764 = this.f1703;
        try {
            c14764.f48313.mo9322();
            return this.f1670.m55131(abstractC22664, c14764.f48313, true);
        } catch (C21566 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1912(C12510 c12510, AbstractC22664 abstractC22664) {
        boolean zMo9329 = abstractC22664.mo9329();
        C15714 c15714 = this.f1700;
        if (zMo9329) {
            c15714.f51040 = -1;
            c12510.f40166 = c15714.m37568();
        } else {
            c15714.f51040 = -1;
            c12510.f40166 = c15714.m37557(abstractC22664);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1950(AbstractC8036 abstractC8036, boolean z) {
        abstractC8036.mo2284(new C18209(this, z));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1982(AbstractC8036 abstractC8036) {
        new C6277(this).mo5474(abstractC8036);
    }
}
