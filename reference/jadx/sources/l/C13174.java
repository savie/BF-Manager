package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C13174 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C16576 f43855 = new C16576();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C14422 f43856 = new C14422();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3192 f43857;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23549 f43858;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C9544 f43859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19524 f43861;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20414 f43862;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f43863;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashMap f43864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21017 f43865;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20145 f43866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23800 f43867;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3836 f43868;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10394 f43869;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21825 f43870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C21825 m32569(C13174 c13174, C5412 c5412) {
        c13174.getClass();
        return m32571(c5412, (C12926) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13174 m32565(C12343 c12343) {
        C13174 c13174 = (C13174) c12343.m30656(f43855);
        return c13174 == null ? new C13174(c12343) : c13174;
    }

    public C13174(C12343 c12343) {
        C1781 c1781 = new C1781(this);
        this.f43869 = c1781;
        this.f43859 = new C9544(this);
        this.f43857 = new C3192(this);
        this.f43864 = new HashMap();
        c12343.m30659(f43855, this);
        this.f43866 = C20145.m45505(c12343);
        this.f43865 = C21017.m47211(c12343);
        this.f43868 = C3836.m11131(c12343);
        this.f43867 = C23800.m52336(c12343);
        this.f43858 = C23549.m51906(c12343);
        this.f43862 = C20414.m46161(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f43860 = EnumC14026.f46113.m33945(EnumC11909.m29706(c12343)) && c14770M35395.m35404("useLegacyInference");
        this.f43863 = c14770M35395.m35397("debug.dumpInferenceGraphsTo");
        this.f43870 = C21825.m48588();
        C21825 c21825M48588 = C21825.m48588();
        this.f43861 = new C19524(this, c21825M48588, c21825M48588.m48592((Function) c1781));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17677 m32568(C11948 c11948) {
        C17677 c17677 = new C17677(null);
        C21825 c21825M48588 = C21825.m48588();
        c17677.f56147 = c21825M48588;
        if (c11948 != null) {
            c17677.f56147 = c21825M48588.m48591(c11948);
        }
        return c17677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13757 m32579(C4603 c4603, C21825 c21825, C13757 c13757, C1116 c1116, C18258 c18258, C21825 c21826, C6095 c6095, C10391 c10391) {
        C13757 c5412;
        C13757 c13758 = c13757;
        boolean z = this.f43860;
        C19524 c19524 = new C19524(this, c21825, c21825.m48592((Function) this.f43869));
        try {
            C12926 c12926M16585 = c6095.m16585(c18258, c19524, c1116, c10391);
            c6095.f20635.mo20004(c4603, c12926M16585, c21826, c13758.f45367, c10391);
            if (z && c1116 != null && c1116.f5036 == f43856) {
                m32584(c19524, c10391);
                c5412 = new C5412(this, c13757, c19524, c4603, c10391);
                c19524.m44600();
            } else {
                if (z && c1116 != null) {
                    m32584(c19524, c10391);
                    if (!c10391.m26293(EnumC0597.UNCHECKED)) {
                        boolean zM32576 = m32576(c13758.f45368, c1116, c19524);
                        C19524 c19524M44588 = zM32576 ? c19524.m44588(m32571(c13758, c12926M16585), true, c10391) : c19524;
                        C13757 c13759 = (C13757) this.f43867.m52407(c13758, m32580(c4603.f16296, c1116, c13758, c19524M44588));
                        if (zM32576) {
                            c19524M44588.m44593(c1116.f5037.mo4574(), false);
                            c12926M16585.mo32012();
                            c19524.m44600();
                            m32572(c4603.f16296, c18258, c6095);
                            return c13759;
                        }
                        c13758 = c13759;
                    }
                }
                c12926M16585.mo32012();
                if (z) {
                    c19524.m44592(c10391);
                } else {
                    c19524.m44596(true, c10391, EnumC2589.f10176.f10179);
                }
                c5412 = (C13757) c19524.m44587(c13758);
                if (!z && c19524.m44584().m48595() && c1116 != null && !c10391.m26293(EnumC0597.UNCHECKED)) {
                    m32580(c4603.f16296, c1116, c5412, c19524);
                    c19524.m44596(false, c10391, EnumC2589.f10177.f10179);
                    c5412 = (C13757) c19524.m44587(c5412);
                }
                if (c1116 != null && this.f43866.f65429.contains(EnumC15912.DEFERRED_INST)) {
                    C20414 c20414 = this.f43862;
                    int i = c4603.f16296.f30189;
                    AbstractC16579 abstractC16579 = c1116.f5036;
                    C9438 c9438 = C2005.f7500;
                    c20414.m48189(i, new C9438("compiler", "deferred.method.inst", c18258, c5412, abstractC16579));
                }
                if (c1116 == null && z) {
                    c19524.m44598(c19524.m44589());
                } else {
                    c19524.m44600();
                }
                if (c1116 == null) {
                    c19524.f62772.clear();
                }
            }
            m32572(c4603.f16296, c18258, c6095);
            return c5412;
        } catch (Throwable th) {
            if (c1116 == null && z) {
                c19524.m44598(c19524.m44589());
            } else {
                c19524.m44600();
            }
            if (c1116 == null) {
                c19524.f62772.clear();
            }
            m32572(c4603.f16296, c18258, c6095);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m32576(AbstractC16579 abstractC16579, C1116 c1116, C19524 c19524) {
        if (c1116.f5037.mo4574() == this.f43861 || !abstractC16579.m39005(c19524.f62771)) {
            return false;
        }
        return (c19524.f62771.contains(abstractC16579) && m32574((C10229) c19524.m44602(abstractC16579), c1116.f5036, c19524)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m32571(C13757 c13757, C12926 c12926) {
        if (c12926 != null && c12926.f42954 == EnumC9729.CHECK) {
            C19003 c19003 = new C19003();
            c19003.m43723(c13757.f45368);
            for (C18570 c18570 : c12926.f42952) {
                c19003.addAll(c18570.f59064.mo21045());
                c19003.addAll(c18570.f59064.mo21046());
            }
            C21825 c21825 = (C21825) C9030.stream(c12926.f42956.f62771).filter(new C14483()).collect(C21825.m48587());
            C21825 c21825M43726 = c19003.m43726();
            C21825 c21825M48593 = c21825.m48593(c21825M43726);
            c21825M43726.getClass();
            return c21825M48593.m48594(c21825M43726);
        }
        return C21825.of((Object) c13757.f45368);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32572(InterfaceC12260 interfaceC12260, C18258 c18258, C6095 c6095) {
        String str = this.f43863;
        try {
            try {
                int i = 0;
                for (String str2 : this.f43870.m48589()) {
                    C6171.m17171((Object) str);
                    AbstractC11242 abstractC11242 = c18258.f77453;
                    if (abstractC11242 == abstractC11242.f38032.f21322.f77632) {
                        abstractC11242 = c18258.f77448.f77453;
                    }
                    BufferedWriter bufferedWriterNewBufferedWriter = C5212.newBufferedWriter(C22852.get(str, String.format("%s@%s[mode=%s,step=%s]_%d.dot", abstractC11242, Integer.valueOf(interfaceC12260.mo9279()), c6095.m16584(), c6095.f20637, Integer.valueOf(i))), new InterfaceC0978[0]);
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
                this.f43870 = C21825.m48588();
            } catch (IOException e) {
                C6171.m17174("Error occurred when dumping inference graph: " + e.getMessage());
                throw null;
            }
        } catch (Throwable th3) {
            this.f43870 = C21825.m48588();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m32580(AbstractC8774 abstractC8774, C1116 c1116, C13757 c13757, C19524 c19524) {
        char c;
        AbstractC16579 abstractC16579;
        boolean z;
        C10391 c10391;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        EnumC1946 enumC1946 = c1116.f5040;
        AbstractC16579 abstractC165710 = c1116.f5036;
        C19524 c19524Mo4574 = interfaceC18195.mo4574();
        AbstractC16579 abstractC16579M52419 = c13757.f45368;
        boolean zM39005 = abstractC16579M52419.m39005(c19524.f62771);
        C23800 c23800 = this.f43867;
        if (zM39005 && c19524Mo4574 != this.f43861) {
            abstractC16579M52419 = c23800.m52419(abstractC16579M52419);
            for (AbstractC16579 abstractC165711 : abstractC16579M52419.mo1938()) {
                if (abstractC165711.m39001(EnumC6617.TYPEVAR)) {
                    C22929 c22929 = (C22929) abstractC165711;
                    if (c22929.mo46762()) {
                        c19524.f62776 = c19524.f62776.m48597((AbstractC16579) c22929.mo1928(c19524.f62774.f43869, (Object) null));
                        c19524.f62771 = c19524.f62771.m48597(c22929);
                    }
                }
            }
        }
        AbstractC16579 abstractC16579M44602 = c19524.m44602(abstractC16579M52419);
        boolean zM39001 = abstractC16579M44602.m39001(EnumC6617.VOID);
        boolean z2 = this.f43860;
        C3836 c3836 = this.f43868;
        if (zM39001) {
            abstractC16579 = c3836.f14293;
        } else {
            if (abstractC165710.m39001(EnumC6617.NONE)) {
                if (abstractC16579M52419.mo9481()) {
                    abstractC165710 = abstractC16579M52419;
                } else {
                    abstractC16579 = c3836.f14275;
                }
            } else {
                if (!abstractC16579M44602.m39001(EnumC6617.UNDETVAR)) {
                    c = 1;
                    if (abstractC165710.m39005(c19524Mo4574.f62771)) {
                        abstractC16579M44602 = c19524.m44602(c19524Mo4574.m44586(abstractC8774, abstractC16579M52419, !enumC1946.mo6308()));
                    }
                } else {
                    C10229 c10229 = (C10229) abstractC16579M44602;
                    if (m32574(c10229, abstractC165710, c19524) && (z2 || !abstractC165710.mo9481())) {
                        c19524.m44594(C21825.of((Object) c10229.f53121), new C10391());
                        c19524.m44600();
                        if (c23800.m52363(interfaceC18195.mo4574().m44586(abstractC8774, c10229.m26017(), !enumC1946.mo6308()), interfaceC18195.mo4574().m44602(abstractC165710), c23800.f76946)) {
                            abstractC165710 = c3836.f14275;
                        }
                    }
                }
                if (z2 && abstractC165710.m39005(c19524Mo4574.f62771)) {
                    z = false;
                } else {
                    z = true;
                }
                C6171.m17175("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
                c10391 = new C10391();
                if (!interfaceC18195.mo2933(abstractC16579M44602, c19524Mo4574.m44602(abstractC165710), c10391) && (z2 || !c10391.m26290(EnumC0597.UNCHECKED))) {
                    return abstractC16579M52419;
                }
                C21825 c21825M44584 = c19524.m44584();
                AbstractC16579 abstractC165712 = c13757.f45368;
                C14377 c14377 = C14707.f48054;
                Object[] objArr = new Object[3];
                objArr[0] = c21825M44584;
                objArr[c] = abstractC165712;
                objArr[2] = abstractC165710;
                throw m32568(this.f43858.m51910(new C14377("compiler", "infer.no.conforming.instance.exists", objArr)));
            }
            c = 1;
            if (z2) {
                z = true;
            } else {
                z = true;
            }
            C6171.m17175("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
            c10391 = new C10391();
            if (!interfaceC18195.mo2933(abstractC16579M44602, c19524Mo4574.m44602(abstractC165710), c10391)) {
            }
            C21825 c21825M44585 = c19524.m44584();
            AbstractC16579 abstractC165713 = c13757.f45368;
            C14377 c14378 = C14707.f48054;
            Object[] objArr2 = new Object[3];
            objArr2[0] = c21825M44585;
            objArr2[c] = abstractC165713;
            objArr2[2] = abstractC165710;
            throw m32568(this.f43858.m51910(new C14377("compiler", "infer.no.conforming.instance.exists", objArr2)));
        }
        abstractC165710 = abstractC16579;
        c = 1;
        if (z2) {
            z = true;
        } else {
            z = true;
        }
        C6171.m17175("legacy inference engine cannot handle constraints on both sides of a subtyping assertion", z);
        c10391 = new C10391();
        if (!interfaceC18195.mo2933(abstractC16579M44602, c19524Mo4574.m44602(abstractC165710), c10391)) {
        }
        C21825 c21825M44586 = c19524.m44584();
        AbstractC16579 abstractC165714 = c13757.f45368;
        C14377 c14379 = C14707.f48054;
        Object[] objArr3 = new Object[3];
        objArr3[0] = c21825M44586;
        objArr3[c] = abstractC165714;
        objArr3[2] = abstractC165710;
        throw m32568(this.f43858.m51910(new C14377("compiler", "infer.no.conforming.instance.exists", objArr3)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32574(C10229 c10229, AbstractC16579 abstractC16579, C19524 c19524) {
        boolean zMo9481 = abstractC16579.mo9481();
        C23800 c23800 = this.f43867;
        if (zMo9481) {
            Iterator it = c10229.m26012(EnumC8112.values()).iterator();
            while (it.hasNext()) {
                AbstractC16579 abstractC16579M52437 = c23800.m52437((AbstractC16579) it.next());
                if (abstractC16579M52437 != null && !abstractC16579M52437.m39001(EnumC6617.NONE)) {
                    return true;
                }
            }
            return false;
        }
        if (c23800.m52419(abstractC16579) == abstractC16579) {
            for (AbstractC16579 abstractC165710 : c10229.m26012(EnumC8112.f28428, EnumC8112.f28425)) {
                if (c23800.m52419(abstractC165710) != abstractC165710) {
                    return true;
                }
            }
            for (AbstractC16579 abstractC165711 : c10229.m26012(EnumC8112.f28425)) {
                for (AbstractC16579 abstractC165712 : c10229.m26012(EnumC8112.f28425)) {
                    if (abstractC165711 != abstractC165712 && !abstractC165711.m39005(c19524.f62771) && !abstractC165712.m39005(c19524.f62771)) {
                        for (C2068 c2068 : m32578(abstractC165711, abstractC165712)) {
                            if (!c23800.m52399((AbstractC16579) c2068.f7664, (AbstractC16579) c2068.f7665)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (abstractC16579.mo1942()) {
            Iterator it2 = c10229.m26012(EnumC8112.f28428, EnumC8112.f28425).iterator();
            while (it2.hasNext()) {
                AbstractC16579 abstractC16579M52423 = c23800.m52423(abstractC16579.f53222, (AbstractC16579) it2.next());
                if (abstractC16579M52423 != null && abstractC16579M52423.mo1936()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32585(C21825 c21825, C19524 c19524) {
        C23800 c23800;
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c23800 = this.f43867;
            if (!zHasNext) {
                break;
            }
            C10229 c10229 = (C10229) c19524.m44602((AbstractC16579) it.next());
            EnumC8112 enumC8112 = EnumC8112.f28427;
            C21825 c21825M26012 = c10229.m26012(enumC8112);
            boolean zM38997 = AbstractC16579.m38997(c21825M26012, c21825);
            C3836 c3836 = this.f43868;
            if (zM38997) {
                AbstractC0618 abstractC0618 = c10229.f53121.f53222;
                C16847 c16847 = new C16847(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC0618.f77453, null, abstractC0618.f77448);
                c16847.f77449 = new C22929(c16847, c23800.m52442(c10229.m26012(enumC8112)), c3836.f14228, C3794.f13674);
                c19003.m43723(c10229);
                c10229.m26011(c16847.f77449);
            } else if (c21825M26012.m48595()) {
                c10229.m26011(c23800.m52361(c21825M26012));
            } else {
                c10229.m26011(c3836.f14275);
            }
        }
        C21825 c21826 = c21825;
        Iterator it2 = c19003.iterator();
        while (it2.hasNext()) {
            C10229 c102210 = (C10229) ((AbstractC16579) it2.next());
            C22929 c22929 = (C22929) c102210.m26017();
            c22929.mo18111(c23800.m52361(c19524.m44590(c23800.m52381(c22929))));
            if (c22929.mo18112().mo1926()) {
                m32582(c102210, EnumC8112.f28427);
            }
            c21826 = c21826.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m32581(AbstractC16844 abstractC16844, AbstractC16579 abstractC16579, C21825 c21825, InterfaceC18195 interfaceC18195) {
        C23800 c23800 = this.f43867;
        if (c23800.m52419(abstractC16579) == abstractC16579) {
            return abstractC16579;
        }
        final AbstractC16579 abstractC165710 = abstractC16579.f53222.f77449;
        C21825 c21825Mo1938 = abstractC165710.mo1938();
        C21825 c21825M48592 = c21825Mo1938.m48592((Function) this.f43869);
        new LinkedHashMap();
        new HashMap();
        C6171.m17176(c21825 != null);
        C21825 c21825Mo33523 = c23800.m52431(abstractC165710).mo33523();
        int iM48596 = c21825Mo33523.m48596();
        int iM48597 = c21825.m48596();
        C23549 c23549 = this.f43858;
        if (iM48596 != iM48597) {
            interfaceC18195.mo2545(abstractC16844, c23549.m51910(C14707.f48114));
            return c23800.m52440(abstractC16579);
        }
        Iterator it = c21825Mo33523.iterator();
        while (it.hasNext()) {
            if (!c23800.m52399(c23800.m52371((AbstractC16579) it.next(), c21825Mo1938, c21825M48592), (AbstractC16579) c21825.f70876)) {
                interfaceC18195.mo2545(abstractC16844, c23549.m51910(C14707.m35239(abstractC16579)));
                return c23800.m52440(abstractC16579);
            }
            c21825 = c21825.f70877;
        }
        C21825 c21825Mo1939 = abstractC16579.mo1938();
        Iterator it2 = c21825M48592.iterator();
        while (it2.hasNext()) {
            C10229 c10229 = (C10229) ((AbstractC16579) it2.next());
            c10229.m26011((AbstractC16579) C9030.stream(c10229.m26012(EnumC8112.f28428)).filter(new Predicate() { // from class: l.᩻ۧۤ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !((AbstractC16579) obj).m39005(abstractC165710.mo1938());
                }
            }).findFirst().orElse((AbstractC16579) c21825Mo1939.f70876));
            c21825Mo1939 = c21825Mo1939.f70877;
        }
        C19003 c19003 = new C19003();
        Iterator it3 = c21825M48592.iterator();
        while (it3.hasNext()) {
            C10229 c102210 = (C10229) ((AbstractC16579) it3.next());
            c19003.m43723(c102210.m26017() != null ? c102210.m26017() : c102210.f53121);
        }
        AbstractC16579 abstractC16579M52371 = c23800.m52371(abstractC165710, c21825Mo1938, c19003.m43726());
        if (!this.f43865.m47324(abstractC16579M52371)) {
            interfaceC18195.mo2545(abstractC16844, c23549.m51910(C14707.m35239(abstractC16579)));
        }
        interfaceC18195.mo2933(abstractC16579M52371, abstractC16579, c23800.f76946);
        return abstractC16579M52371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32584(C19524 c19524, C10391 c10391) {
        HashMap map;
        boolean z = true;
        int i = 0;
        while (true) {
            map = this.f43864;
            if (!z || i >= 10000) {
                break;
            }
            try {
                Iterator it = c19524.f62776.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    C10229 c10229 = (C10229) ((AbstractC16579) it.next());
                    if (!c10229.f34911.isEmpty()) {
                        ((AbstractC16267) c10229.f34911.removeFirst()).mo4312(c19524, c10391);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 m32578(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C21825<AbstractC16579> c21825Of;
        AbstractC16579 abstractC16579M52373 = this.f43867.m52373(abstractC16579, abstractC165710);
        C3836 c3836 = this.f43868;
        if (abstractC16579M52373 == c3836.f14261 || abstractC16579M52373 == c3836.f14228) {
            return C21825.m48588();
        }
        abstractC16579M52373.getClass();
        if (abstractC16579M52373 instanceof C23594) {
            C23594 c23594 = (C23594) abstractC16579M52373;
            c21825Of = c23594.f1658.m48597(c23594.f1654);
        } else {
            c21825Of = C21825.of((Object) abstractC16579M52373);
        }
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC165711 : c21825Of) {
            if (abstractC165711.mo1942()) {
                c19003.m43723(new C2068(m32567(abstractC16579, abstractC165711), m32567(abstractC165710, abstractC165711)));
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m32567(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        boolean zM39001 = abstractC165710.m39001(EnumC6617.ARRAY);
        C23800 c23800 = this.f43867;
        if (zM39001) {
            return new C8777(m32567(c23800.m52416(abstractC16579), c23800.m52416(abstractC165710)), this.f43868.f14258);
        }
        return c23800.m52423(abstractC165710.f53222, abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32586(EnumC12739 enumC12739, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        C20500 c20500 = new C20500(this, enumC12739, abstractC16579, abstractC165710);
        HashMap map = this.f43864;
        Boolean boolValueOf = (Boolean) map.get(c20500);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(enumC12739.mo3210(abstractC16579, abstractC165710, c10391, this.f43867));
            map.put(c20500, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32582(C10229 c10229, EnumC8112 enumC8112) {
        int i = C4977.f17352[enumC8112.ordinal()];
        C23549 c23549 = this.f43858;
        if (i == 1) {
            AbstractC16579 abstractC16579 = c10229.f53121;
            C21825 c21825M26012 = c10229.m26012(enumC8112);
            C14377 c14377 = C14707.f48054;
            throw m32568(c23549.m51910(new C14377("compiler", "incompatible.eq.bounds", abstractC16579, c21825M26012)));
        }
        if (i == 2) {
            throw new AssertionError("this case shouldn't happen");
        }
        if (i != 3) {
            return;
        }
        AbstractC16579 abstractC165710 = c10229.f53121;
        C21825 c21825M26013 = c10229.m26012(enumC8112);
        C14377 c14378 = C14707.f48054;
        throw m32568(c23549.m51910(new C14377("compiler", "incompatible.upper.bounds", abstractC165710, c21825M26013)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32583(C10229 c10229, EnumC8112 enumC8112, EnumC8112 enumC8113) {
        AbstractC16579 abstractC16579 = c10229.f53121;
        C14377 c14377M32566 = m32566(enumC8112, c10229.m26012(enumC8112));
        C14377 c14377M32567 = m32566(enumC8113, c10229.m26012(enumC8113));
        C14377 c14377 = C14707.f48054;
        throw m32568(this.f43858.m51910(new C14377("compiler", "incompatible.bounds", abstractC16579, c14377M32566, c14377M32567)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14377 m32566(EnumC8112 enumC8112, C21825 c21825) {
        int i = C4977.f17352[enumC8112.ordinal()];
        if (i == 1) {
            C14377 c14377 = C14707.f48054;
            return new C14377("compiler", "eq.bounds", c21825);
        }
        if (i == 2) {
            C14377 c14378 = C14707.f48054;
            return new C14377("compiler", "lower.bounds", c21825);
        }
        if (i == 3) {
            C14377 c14379 = C14707.f48054;
            return new C14377("compiler", "upper.bounds", c21825);
        }
        throw new AssertionError("can't get to this place");
    }
}
