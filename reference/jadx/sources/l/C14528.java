package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C14528 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C13477 f45688 = new C13477();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C11256 f45689 = new C11256();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17841 f45690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45691;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f45692;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f45693;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7312 f45694;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16349 f45695;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13777 f45696;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C24705 f45697;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22010 f45698;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14764 f45699;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2596 f45700;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22092 f45701;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19991 f45702;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14769 f45703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C14769 m35048(C14528 c14528, C6326 c6326) {
        c14528.getClass();
        return m35050(c6326, (C4192) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14528 m35047(C4747 c4747) {
        C14528 c14528 = (C14528) c4747.m14643(f45688);
        return c14528 == null ? new C14528(c4747) : c14528;
    }

    public C14528(C4747 c4747) {
        C17095 c17095 = new C17095(this);
        this.f45696 = c17095;
        this.f45690 = new C17841(this);
        this.f45695 = new C16349(this);
        this.f45692 = new HashMap();
        c4747.m14646(f45688, this);
        this.f45698 = C22010.m49750(c4747);
        this.f45701 = C22092.m49912(c4747);
        this.f45699 = C14764.m35506(c4747);
        this.f45697 = C24705.m55066(c4747);
        this.f45702 = C19991.m45972(c4747);
        this.f45694 = C7312.m20023(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f45691 = EnumC3666.f12575.m11915(EnumC20820.m47625(c4747)) && c13015M32421.m32429("useLegacyInference");
        this.f45693 = c13015M32421.m32422("debug.dumpInferenceGraphsTo");
        this.f45703 = C14769.m35543();
        C14769 c14769M35543 = C14769.m35543();
        this.f45700 = new C2596(this, c14769M35543, c14769M35543.m35547((Function) c17095));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13037 m35046(C17007 c17007) {
        C13037 c13037 = new C13037(null);
        C14769 c14769M35543 = C14769.m35543();
        c13037.f41722 = c14769M35543;
        if (c17007 != null) {
            c13037.f41722 = c14769M35543.m35546(c17007);
        }
        return c13037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23191 m35062(C3168 c3168, C14769 c14769, C23191 c23191, C14479 c14479, C10377 c10377, C14769 c147610, C12775 c12775, C1083 c1083) {
        C23191 c6326;
        C23191 c23192 = c23191;
        boolean z = this.f45691;
        C2596 c2596 = new C2596(this, c14769, c14769.m35547((Function) this.f45696));
        try {
            C4192 c4192M31660 = c12775.m31660(c10377, c2596, c14479, c1083);
            c12775.f40881.mo16157(c3168, c4192M31660, c147610, c23192.f75155, c1083);
            if (z && c14479 != null && c14479.f45575 == f45689) {
                m35063(c2596, c1083);
                c6326 = new C6326(this, c23191, c2596, c3168, c1083);
                c2596.m8703();
            } else {
                if (z && c14479 != null) {
                    m35063(c2596, c1083);
                    if (!c1083.m4084(EnumC19876.UNCHECKED)) {
                        boolean zM35057 = m35057(c23192.f75156, c14479, c2596);
                        C2596 c2596M8691 = zM35057 ? c2596.m8691(m35050(c23192, c4192M31660), true, c1083) : c2596;
                        C23191 c23193 = (C23191) this.f45697.m55128(c23192, m35061(c3168.f10273, c14479, c23192, c2596M8691));
                        if (zM35057) {
                            c2596M8691.m8698(c14479.f45571.mo2276(), false);
                            c4192M31660.mo13375();
                            c2596.m8703();
                            m35053(c3168.f10273, c10377, c12775);
                            return c23193;
                        }
                        c23192 = c23193;
                    }
                }
                c4192M31660.mo13375();
                if (z) {
                    c2596.m8697(c1083);
                } else {
                    c2596.m8701(true, c1083, EnumC12291.f39508.f39510);
                }
                c6326 = (C23191) c2596.m8696(c23192);
                if (!z && c2596.m8712().m35550() && c14479 != null && !c1083.m4084(EnumC19876.UNCHECKED)) {
                    m35061(c3168.f10273, c14479, c6326, c2596);
                    c2596.m8701(false, c1083, EnumC12291.f39507.f39510);
                    c6326 = (C23191) c2596.m8696(c6326);
                }
                if (c14479 != null && this.f45698.f71005.contains(EnumC4856.DEFERRED_INST)) {
                    C7312 c7312 = this.f45694;
                    int i = c3168.f10273.f26658;
                    AbstractC22664 abstractC22664 = c14479.f45575;
                    C5821 c5821 = C15383.f50165;
                    c7312.m34516(i, new C5821("compiler", "deferred.method.inst", c10377, c6326, abstractC22664));
                }
                if (c14479 == null && z) {
                    c2596.m8707(c2596.m8692());
                } else {
                    c2596.m8703();
                }
                if (c14479 == null) {
                    c2596.f8335.clear();
                }
            }
            m35053(c3168.f10273, c10377, c12775);
            return c6326;
        } catch (Throwable th) {
            if (c14479 == null && z) {
                c2596.m8707(c2596.m8692());
            } else {
                c2596.m8703();
            }
            if (c14479 == null) {
                c2596.f8335.clear();
            }
            m35053(c3168.f10273, c10377, c12775);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m35057(AbstractC22664 abstractC22664, C14479 c14479, C2596 c2596) {
        if (c14479.f45571.mo2276() == this.f45700 || !abstractC22664.m51073(c2596.f8340)) {
            return false;
        }
        return (c2596.f8340.contains(abstractC22664) && m35055((C8274) c2596.m8710(abstractC22664), c14479.f45575, c2596)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m35050(C23191 c23191, C4192 c4192) {
        if (c4192 != null && c4192.f15331 == EnumC16124.CHECK) {
            C18499 c18499 = new C18499();
            c18499.m43089(c23191.f75156);
            for (C10157 c10157 : c4192.f15329) {
                c18499.addAll(c10157.f32520.mo4424());
                c18499.addAll(c10157.f32520.mo4425());
            }
            C14769 c14769 = (C14769) C1170.stream(c4192.f15335.f8340).filter(new C15165(4)).collect(C14769.m35544());
            C14769 c14769M43093 = c18499.m43093();
            C14769 c14769M35548 = c14769.m35548(c14769M43093);
            c14769M43093.getClass();
            return c14769M35548.m35549(c14769M43093);
        }
        return C14769.of((Object) c23191.f75156);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35053(InterfaceC5075 interfaceC5075, C10377 c10377, C12775 c12775) {
        String str = this.f45693;
        try {
            try {
                int i = 0;
                for (String str2 : this.f45703.m35554()) {
                    C11972.m30021((Object) str);
                    AbstractC19728 abstractC19728 = c10377.f38072;
                    if (abstractC19728 == abstractC19728.f63499.f73707.f49865) {
                        abstractC19728 = c10377.f38069.f38072;
                    }
                    BufferedWriter bufferedWriterNewBufferedWriter = C3445.newBufferedWriter(C14631.get(str, String.format("%s@%s[mode=%s,step=%s]_%d.dot", abstractC19728, Integer.valueOf(interfaceC5075.mo7189()), c12775.m31661(), c12775.f40879, Integer.valueOf(i))), new InterfaceC12394[0]);
                    try {
                        bufferedWriterNewBufferedWriter.append((CharSequence) str2);
                        bufferedWriterNewBufferedWriter.close();
                        i++;
                    } catch (Throwable th) {
                        if (bufferedWriterNewBufferedWriter != null) {
                            try {
                                bufferedWriterNewBufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                this.f45703 = C14769.m35543();
            } catch (IOException e) {
                C11972.m30024("Error occurred when dumping inference graph: " + e.getMessage());
                throw null;
            }
        } catch (Throwable th3) {
            this.f45703 = C14769.m35543();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m35061(AbstractC8036 abstractC8036, C14479 c14479, C23191 c23191, C2596 c2596) {
        char c;
        AbstractC22664 abstractC22664;
        boolean z;
        C1083 c1083;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        EnumC17463 enumC17463 = c14479.f45574;
        AbstractC22664 abstractC22665 = c14479.f45575;
        C2596 c2596Mo2276 = interfaceC1013.mo2276();
        AbstractC22664 abstractC22664M55158 = c23191.f75156;
        boolean zM51073 = abstractC22664M55158.m51073(c2596.f8340);
        C24705 c24705 = this.f45697;
        if (zM51073 && c2596Mo2276 != this.f45700) {
            abstractC22664M55158 = c24705.m55158(abstractC22664M55158);
            for (AbstractC22664 abstractC22666 : abstractC22664M55158.mo15882()) {
                if (abstractC22666.m51067(EnumC21172.TYPEVAR)) {
                    C17969 c17969 = (C17969) abstractC22666;
                    if (c17969.mo34139()) {
                        c2596.f8337 = c2596.f8337.m35552((AbstractC22664) c17969.mo9324(c2596.f8336.f45696, (Object) null));
                        c2596.f8340 = c2596.f8340.m35552(c17969);
                    }
                }
            }
        }
        AbstractC22664 abstractC22664M8710 = c2596.m8710(abstractC22664M55158);
        boolean zM51067 = abstractC22664M8710.m51067(EnumC21172.VOID);
        boolean z2 = this.f45691;
        C14764 c14764 = this.f45699;
        if (zM51067) {
            abstractC22664 = c14764.f48251;
        } else {
            if (abstractC22665.m51067(EnumC21172.NONE)) {
                if (abstractC22664M55158.mo40452()) {
                    abstractC22665 = abstractC22664M55158;
                } else {
                    abstractC22664 = c14764.f48286;
                }
            } else {
                if (!abstractC22664M8710.m51067(EnumC21172.UNDETVAR)) {
                    c = 1;
                    if (abstractC22665.m51073(c2596Mo2276.f8340)) {
                        abstractC22664M8710 = c2596.m8710(c2596Mo2276.m8695(abstractC8036, abstractC22664M55158, !enumC17463.mo40962()));
                    }
                } else {
                    C8274 c8274 = (C8274) abstractC22664M8710;
                    if (m35055(c8274, abstractC22665, c2596) && (z2 || !abstractC22665.mo40452())) {
                        c2596.m8699(C14769.of((Object) c8274.f72657), new C1083());
                        c2596.m8703();
                        if (c24705.m55170(interfaceC1013.mo2276().m8695(abstractC8036, c8274.m22338(), !enumC17463.mo40962()), interfaceC1013.mo2276().m8710(abstractC22665), c24705.f79958)) {
                            abstractC22665 = c14764.f48286;
                        }
                    }
                }
                if (z2 && abstractC22665.m51073(c2596Mo2276.f8340)) {
                    z = false;
                } else {
                    z = true;
                }
                C11972.m30025("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
                c1083 = new C1083();
                if (!interfaceC1013.mo3911(abstractC22664M8710, c2596Mo2276.m8710(abstractC22665), c1083) && (z2 || !c1083.m4081(EnumC19876.UNCHECKED))) {
                    return abstractC22664M55158;
                }
                C14769 c14769M8712 = c2596.m8712();
                AbstractC22664 abstractC22667 = c23191.f75156;
                C15515 c15515 = C19859.f63823;
                Object[] objArr = new Object[3];
                objArr[0] = c14769M8712;
                objArr[c] = abstractC22667;
                objArr[2] = abstractC22665;
                throw m35046(this.f45702.m45975(new C15515("compiler", "infer.no.conforming.instance.exists", objArr)));
            }
            c = 1;
            if (z2) {
                z = true;
            } else {
                z = true;
            }
            C11972.m30025("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
            c1083 = new C1083();
            if (!interfaceC1013.mo3911(abstractC22664M8710, c2596Mo2276.m8710(abstractC22665), c1083)) {
            }
            C14769 c14769M8713 = c2596.m8712();
            AbstractC22664 abstractC22668 = c23191.f75156;
            C15515 c15516 = C19859.f63823;
            Object[] objArr2 = new Object[3];
            objArr2[0] = c14769M8713;
            objArr2[c] = abstractC22668;
            objArr2[2] = abstractC22665;
            throw m35046(this.f45702.m45975(new C15515("compiler", "infer.no.conforming.instance.exists", objArr2)));
        }
        abstractC22665 = abstractC22664;
        c = 1;
        if (z2) {
            z = true;
        } else {
            z = true;
        }
        C11972.m30025("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
        c1083 = new C1083();
        if (!interfaceC1013.mo3911(abstractC22664M8710, c2596Mo2276.m8710(abstractC22665), c1083)) {
        }
        C14769 c14769M8714 = c2596.m8712();
        AbstractC22664 abstractC22669 = c23191.f75156;
        C15515 c15517 = C19859.f63823;
        Object[] objArr3 = new Object[3];
        objArr3[0] = c14769M8714;
        objArr3[c] = abstractC22669;
        objArr3[2] = abstractC22665;
        throw m35046(this.f45702.m45975(new C15515("compiler", "infer.no.conforming.instance.exists", objArr3)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35055(C8274 c8274, AbstractC22664 abstractC22664, C2596 c2596) {
        boolean zMo40452 = abstractC22664.mo40452();
        C24705 c24705 = this.f45697;
        if (zMo40452) {
            Iterator it = c8274.m22332(EnumC0816.values()).iterator();
            while (it.hasNext()) {
                AbstractC22664 abstractC22664M55152 = c24705.m55152((AbstractC22664) it.next());
                if (abstractC22664M55152 != null && !abstractC22664M55152.m51067(EnumC21172.NONE)) {
                    return true;
                }
            }
            return false;
        }
        if (c24705.m55158(abstractC22664) == abstractC22664) {
            for (AbstractC22664 abstractC22665 : c8274.m22332(EnumC0816.f3094, EnumC0816.f3093)) {
                if (c24705.m55158(abstractC22665) != abstractC22665) {
                    return true;
                }
            }
            for (AbstractC22664 abstractC22666 : c8274.m22332(EnumC0816.f3093)) {
                for (AbstractC22664 abstractC22667 : c8274.m22332(EnumC0816.f3093)) {
                    if (abstractC22666 != abstractC22667 && !abstractC22666.m51073(c2596.f8340) && !abstractC22667.m51073(c2596.f8340)) {
                        for (C5558 c5558 : m35059(abstractC22666, abstractC22667)) {
                            if (!c24705.m55149((AbstractC22664) c5558.f19300, (AbstractC22664) c5558.f19301)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (abstractC22664.mo9330()) {
            Iterator it2 = c8274.m22332(EnumC0816.f3094, EnumC0816.f3093).iterator();
            while (it2.hasNext()) {
                AbstractC22664 abstractC22664M55157 = c24705.m55157(abstractC22664.f73596, (AbstractC22664) it2.next());
                if (abstractC22664M55157 != null && abstractC22664M55157.mo9328()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35066(C14769 c14769, C2596 c2596) {
        C24705 c24705;
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c24705 = this.f45697;
            if (!zHasNext) {
                break;
            }
            C8274 c8274 = (C8274) c2596.m8710((AbstractC22664) it.next());
            EnumC0816 enumC0816 = EnumC0816.f3091;
            C14769 c14769M22332 = c8274.m22332(enumC0816);
            boolean zM51060 = AbstractC22664.m51060(c14769M22332, c14769);
            C14764 c14764 = this.f45699;
            if (zM51060) {
                AbstractC22970 abstractC22970 = c8274.f72657.f73596;
                C19986 c19986 = new C19986(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC22970.f38072, null, abstractC22970.f38069);
                c19986.f38067 = new C17969(c19986, c24705.m55138(c8274.m22332(enumC0816)), c14764.f48241, C14458.f45498);
                c18499.m43089(c8274);
                c8274.m22339(c19986.f38067);
            } else if (c14769M22332.m35550()) {
                c8274.m22339(c24705.m55167(c14769M22332));
            } else {
                c8274.m22339(c14764.f48286);
            }
        }
        C14769 c147610 = c14769;
        Iterator it2 = c18499.iterator();
        while (it2.hasNext()) {
            C8274 c8275 = (C8274) ((AbstractC22664) it2.next());
            C17969 c17969 = (C17969) c8275.m22338();
            c17969.mo19991(c24705.m55167(c2596.m8693(c24705.m55097(c17969))));
            if (c17969.mo19992().mo9329()) {
                m35064(c8275, EnumC0816.f3091);
            }
            c147610 = c147610.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m35060(AbstractC7378 abstractC7378, AbstractC22664 abstractC22664, C14769 c14769, InterfaceC1013 interfaceC1013) {
        C24705 c24705 = this.f45697;
        if (c24705.m55158(abstractC22664) == abstractC22664) {
            return abstractC22664;
        }
        AbstractC22664 abstractC22665 = abstractC22664.f73596.f38067;
        C14769 c14769Mo15882 = abstractC22665.mo15882();
        C14769 c14769M35547 = c14769Mo15882.m35547((Function) this.f45696);
        new LinkedHashMap();
        new HashMap();
        int i = 1;
        C11972.m30026(c14769 != null);
        C14769 c14769Mo50621 = c24705.m55143(abstractC22665).mo50621();
        int iM35551 = c14769Mo50621.m35551();
        int iM35552 = c14769.m35551();
        C19991 c19991 = this.f45702;
        if (iM35551 != iM35552) {
            interfaceC1013.mo3910(abstractC7378, c19991.m45975(C19859.f63887));
            return c24705.m55139(abstractC22664);
        }
        Iterator it = c14769Mo50621.iterator();
        while (it.hasNext()) {
            if (!c24705.m55149(c24705.m55103((AbstractC22664) it.next(), c14769Mo15882, c14769M35547), (AbstractC22664) c14769.f48335)) {
                interfaceC1013.mo3910(abstractC7378, c19991.m45975(C19859.m45719(abstractC22664)));
                return c24705.m55139(abstractC22664);
            }
            c14769 = c14769.f48336;
        }
        C14769 c14769Mo15883 = abstractC22664.mo15882();
        Iterator it2 = c14769M35547.iterator();
        while (it2.hasNext()) {
            C8274 c8274 = (C8274) ((AbstractC22664) it2.next());
            c8274.m22339((AbstractC22664) C1170.stream(c8274.m22332(EnumC0816.f3094)).filter(new C7594(i, abstractC22665)).findFirst().orElse((AbstractC22664) c14769Mo15883.f48335));
            c14769Mo15883 = c14769Mo15883.f48336;
        }
        C18499 c18499 = new C18499();
        Iterator it3 = c14769M35547.iterator();
        while (it3.hasNext()) {
            C8274 c8275 = (C8274) ((AbstractC22664) it3.next());
            c18499.m43089(c8275.m22338() != null ? c8275.m22338() : c8275.f72657);
        }
        AbstractC22664 abstractC22664M55103 = c24705.m55103(abstractC22665, c14769Mo15882, c18499.m43093());
        if (!this.f45701.m50027(abstractC22664M55103)) {
            interfaceC1013.mo3910(abstractC7378, c19991.m45975(C19859.m45719(abstractC22664)));
        }
        interfaceC1013.mo3911(abstractC22664M55103, abstractC22664, c24705.f79958);
        return abstractC22664M55103;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35063(C2596 c2596, C1083 c1083) {
        HashMap map;
        boolean z = true;
        int i = 0;
        while (true) {
            map = this.f45692;
            if (!z || i >= 10000) {
                break;
            }
            try {
                Iterator it = c2596.f8337.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    C8274 c8274 = (C8274) ((AbstractC22664) it.next());
                    if (!c8274.f27219.isEmpty()) {
                        ((AbstractC21988) c8274.f27219.removeFirst()).mo13164(c2596, c1083);
                        z2 = true;
                    }
                }
                i++;
                z = z2;
            } catch (Throwable th) {
                map.clear();
                throw th;
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 m35059(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C14769<AbstractC22664> c14769Of;
        AbstractC22664 abstractC22664M55105 = this.f45697.m55105(abstractC22664, abstractC22665);
        C14764 c14764 = this.f45699;
        if (abstractC22664M55105 == c14764.f48263 || abstractC22664M55105 == c14764.f48241) {
            return C14769.m35543();
        }
        abstractC22664M55105.getClass();
        if (abstractC22664M55105 instanceof C1562) {
            C1562 c1562 = (C1562) abstractC22664M55105;
            c14769Of = c1562.f33437.m35552(c1562.f33442);
        } else {
            c14769Of = C14769.of((Object) abstractC22664M55105);
        }
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22666 : c14769Of) {
            if (abstractC22666.mo9330()) {
                c18499.m43089(new C5558(m35052(abstractC22664, abstractC22666), m35052(abstractC22665, abstractC22666)));
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m35052(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        boolean zM51067 = abstractC22665.m51067(EnumC21172.ARRAY);
        C24705 c24705 = this.f45697;
        if (zM51067) {
            return new C2832(m35052(c24705.m55120(abstractC22664), c24705.m55120(abstractC22665)), this.f45699.f48271);
        }
        return c24705.m55157(abstractC22665.f73596, abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35067(EnumC15274 enumC15274, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        C10799 c10799 = new C10799(this, enumC15274, abstractC22664, abstractC22665);
        HashMap map = this.f45692;
        Boolean boolValueOf = (Boolean) map.get(c10799);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(enumC15274.mo36638(abstractC22664, abstractC22665, c1083, this.f45697));
            map.put(c10799, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35064(C8274 c8274, EnumC0816 enumC0816) {
        int i = C23809.f77128[enumC0816.ordinal()];
        C19991 c19991 = this.f45702;
        if (i == 1) {
            AbstractC22664 abstractC22664 = c8274.f72657;
            C14769 c14769M22332 = c8274.m22332(enumC0816);
            C15515 c15515 = C19859.f63823;
            throw m35046(c19991.m45975(new C15515("compiler", "incompatible.eq.bounds", abstractC22664, c14769M22332)));
        }
        if (i == 2) {
            throw new AssertionError("this case shouldn't happen");
        }
        if (i != 3) {
            return;
        }
        AbstractC22664 abstractC22665 = c8274.f72657;
        C14769 c14769M22333 = c8274.m22332(enumC0816);
        C15515 c15516 = C19859.f63823;
        throw m35046(c19991.m45975(new C15515("compiler", "incompatible.upper.bounds", abstractC22665, c14769M22333)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35065(C8274 c8274, EnumC0816 enumC0816, EnumC0816 enumC0817) {
        AbstractC22664 abstractC22664 = c8274.f72657;
        C15515 c15515M35051 = m35051(enumC0816, c8274.m22332(enumC0816));
        C15515 c15515M35052 = m35051(enumC0817, c8274.m22332(enumC0817));
        C15515 c15515 = C19859.f63823;
        throw m35046(this.f45702.m45975(new C15515("compiler", "incompatible.bounds", abstractC22664, c15515M35051, c15515M35052)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15515 m35051(EnumC0816 enumC0816, C14769 c14769) {
        int i = C23809.f77128[enumC0816.ordinal()];
        if (i == 1) {
            C15515 c15515 = C19859.f63823;
            return new C15515("compiler", "eq.bounds", c14769);
        }
        if (i == 2) {
            C15515 c15516 = C19859.f63823;
            return new C15515("compiler", "lower.bounds", c14769);
        }
        if (i == 3) {
            C15515 c15517 = C19859.f63823;
            return new C15515("compiler", "upper.bounds", c14769);
        }
        throw new AssertionError("can't get to this place");
    }
}
