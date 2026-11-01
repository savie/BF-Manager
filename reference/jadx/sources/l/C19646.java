package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C19646 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f63086;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9126 f63087;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C21825 f63088;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22285 f63089;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f63090;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10474 f63091;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f63092;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21825 f63093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21496 f63094;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Set f63095;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21825 f63096;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21825 f63097;

    public C19646(C10474 c10474, int i, Set set, C9126 c9126) {
        this.f63091 = c10474;
        this.f63094 = new C21496(1);
        this.f63089 = new C22285(1);
        this.f63086 = i;
        if (i != 1) {
            C9126 c9127 = new C9126(c10474.f35835, null);
            this.f63087 = c9127;
            c10474.f35829.m39725(c9127);
        } else {
            C6171.m17171(c9126);
            this.f63087 = c9126;
        }
        this.f63097 = C21825.m48588();
        this.f63093 = C21825.m48588();
        this.f63096 = C21825.m48588();
        this.f63095 = set;
    }

    public C19646(C10474 c10474, C21825 c21825, C21825 c21826, Set set, C9126 c9126) {
        this(c10474, 1, set, c9126);
        this.f63088 = c21825;
        this.f63090 = new HashMap();
        this.f63097 = C10474.m26557(c10474, c21825).m48594(c21826.m48589());
        this.f63093 = C10474.m26542(c10474, c21825);
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C10164 c10164 = (C10164) it.next();
            if (c10164.f34725.mo6761("module-info", EnumC11347.SOURCE) && c10164.f34727.m48595()) {
                for (AbstractC8774 abstractC8774 : c10164.f34727) {
                    if (!abstractC8774.m22847(EnumC18651.f60517)) {
                        if (!abstractC8774.m22847(EnumC18651.f60488)) {
                            break;
                        }
                        c21825M48588 = c21825M48588.m48597(c10164.f34730);
                        break;
                    }
                }
            }
        }
        this.f63096 = c21825M48588.m48589();
        m44780();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19646 m44775(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        int i = this.f63086 + 1;
        Set set = this.f63095;
        C10474 c10474 = this.f63091;
        C19646 c19646 = new C19646(c10474, i, set, null);
        m44773();
        HashMap map = this.f63090;
        c19646.f63090 = map;
        C21825 c21825M39718 = c10474.f35829.m39718((Set) linkedHashSet, true);
        C21825 c21825 = this.f63088;
        c21825.getClass();
        C21825 c21825M48594 = c21825M39718.m48594(c21825);
        c19646.f63088 = c21825M48594;
        if (c19646.m44779()) {
            c10474.f35829.m39734(C21825.m48588());
            return c19646;
        }
        c10474.f35829.m39734(c21825M48594);
        c19646.f63088 = c21825M48594;
        c19646.m44774(map);
        C21825<C22492> c21825M44774 = c19646.m44774(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Map) C9735.computeIfAbsent(c19646.f63090, (C19670) entry.getKey(), new C2963(1))).putAll((Map) entry.getValue());
        }
        c19646.f63091.f35829.m39727(c19646.f63088);
        if (c19646.m44779()) {
            return c19646;
        }
        C21825 c21825M26557 = C10474.m26557(c10474, c21825M39718);
        C21825 c21825M48588 = C21825.m48588();
        for (C22492 c22492 : c21825M44774) {
            if (!c22492.f73422.mo6761("package-info", EnumC11347.CLASS) || c22492.m52724().f25394 != c22492) {
                c21825M48588 = c21825M48588.m48597(c22492);
            }
        }
        C21825 c21825M48589 = c21825M48588.m48589();
        c21825M26557.getClass();
        c19646.f63097 = c21825M48589.m48594(c21825M26557);
        C21825 c21825M26542 = C10474.m26542(c10474, c21825M39718);
        C21825 c21825M485810 = C21825.m48588();
        for (C22492 c22493 : c21825M44774) {
            if (c22493.f73422.mo6761("package-info", EnumC11347.CLASS) && c22493.m52724().f25394 == c22493) {
                c21825M485810 = c21825M485810.m48597((C7675) c22493.f77448);
            }
        }
        C21825 c21825M485811 = c21825M485810.m48589();
        c21825M26542.getClass();
        c19646.f63093 = c21825M485811.m48594(c21825M26542);
        c19646.f63096 = C21825.m48588();
        c19646.m44780();
        return c19646;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44776() {
        m44773();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44779() {
        C10474 c10474 = this.f63091;
        if (c10474.f35848.f18960 > 0) {
            return true;
        }
        for (C11948 c11948 : (C19003) this.f63087.m23454()) {
            int i = C4122.f15095[c11948.mo29759().ordinal()];
            if (i == 1) {
                if (c10474.f35858) {
                    return true;
                }
            } else if (i == 2 && (c10474.f35862 || !c11948.m29760(EnumC0264.RECOVERABLE))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44780() {
        C6945 c6945 = new C6945(this.f63091.f35837);
        this.f63092 = new LinkedHashSet();
        Iterator it = this.f63097.iterator();
        while (it.hasNext()) {
            c6945.m18692((InterfaceC14625) it.next(), (Set) this.f63092);
        }
        Iterator it2 = this.f63093.iterator();
        while (it2.hasNext()) {
            c6945.m18692((InterfaceC14625) it2.next(), (Set) this.f63092);
        }
        Iterator it3 = this.f63096.iterator();
        while (it3.hasNext()) {
            c6945.m18692((InterfaceC14625) it3.next(), (Set) this.f63092);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m44774(HashMap map) {
        C22492 c22492M11148;
        C21825 c21825M48588 = C21825.m48588();
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                C10474 c10474 = this.f63091;
                C23942 c23942 = c10474.f35832;
                AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389((String) entry2.getKey());
                InterfaceC2173 interfaceC2173 = (InterfaceC2173) entry2.getValue();
                EnumC11347 enumC11347Mo6760 = interfaceC2173.mo6760();
                EnumC11347 enumC11347 = EnumC11347.CLASS;
                if (enumC11347Mo6760 != enumC11347) {
                    throw new AssertionError(interfaceC2173);
                }
                if (interfaceC2173.mo6761("package-info", enumC11347)) {
                    C7675 c7675M11157 = c10474.f35855.m11157((C19670) entry.getKey(), abstractC11242M17389.m28210(0, abstractC11242M17389.m28208((byte) 46)));
                    if (c7675M11157.f25394 == null) {
                        c7675M11157.f25394 = c10474.f35855.m11149((C19670) entry.getKey(), C17281.m40243(abstractC11242M17389), c7675M11157);
                    }
                    c22492M11148 = c7675M11157.f25394;
                    c22492M11148.m49996();
                    if (c22492M11148.f73422 == null) {
                        c22492M11148.f73422 = interfaceC2173;
                    }
                    c22492M11148.f77451 = c10474.f35842;
                } else {
                    c22492M11148 = c10474.f35855.m11148((C19670) entry.getKey(), abstractC11242M17389);
                    c22492M11148.m49996();
                    c22492M11148.f73422 = interfaceC2173;
                    c22492M11148.f77451 = c10474.f35842;
                    AbstractC23903 abstractC23903 = c22492M11148.f77448;
                    if (abstractC23903.f77452 == EnumC10477.f35867) {
                        abstractC23903.mo20272().mo24224(c22492M11148);
                    }
                }
                c21825M48588 = c21825M48588.m48597(c22492M11148);
            }
        }
        return c21825M48588.m48589();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44778(boolean z, boolean z2) {
        C9126 c9126 = this.f63087;
        C21825 c21825 = this.f63097;
        C10474 c10474 = this.f63091;
        boolean z3 = c10474.f35847;
        C20414 c20414 = c10474.f35835;
        if (z3 || c10474.f35839) {
            C21825 c21825M48588 = z ? C21825.m48588() : c21825;
            Object obj = z ? Collections.EMPTY_SET : this.f63092;
            c20414.m46185("x.print.rounds", Integer.valueOf(this.f63086), "{" + c21825M48588.m48590(", ") + l.d, obj, Boolean.valueOf(z));
        }
        if (!c10474.f35840.m6633()) {
            c10474.f35840.m6634(new C4209(EnumC13383.ANNOTATION_PROCESSING_ROUND));
        }
        try {
            if (z) {
                c10474.f35831.getClass();
                C7651 c7651 = new C7651(true, z2, Collections.EMPTY_SET, c10474);
                C15413 c15413 = c10474.f35853;
                c15413.getClass();
                for (C8357 c8357 : c15413.f50249) {
                    if (c8357.f28985) {
                        C10474.m26545(c15413.f50248, c8357.f28988, c7651);
                    }
                }
            } else {
                C10474.m26544(c10474, this.f63092, c21825, this.f63093, this.f63096);
            }
            if (c10474.f35840.m6633()) {
                return;
            }
            c10474.f35840.m6632(new C4209(EnumC13383.ANNOTATION_PROCESSING_ROUND));
        } catch (Throwable th) {
            try {
                c9126.m23455(new C22285(1));
                c20414.m46175(c9126);
                c10474.f35829.m39725((C9126) null);
                throw th;
            } catch (Throwable th2) {
                if (!c10474.f35840.m6633()) {
                    c10474.f35840.m6632(new C4209(EnumC13383.ANNOTATION_PROCESSING_ROUND));
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44777(boolean z) {
        Predicate predicate;
        if (z) {
            predicate = this.f63089;
        } else {
            predicate = this.f63094;
        }
        C9126 c9126 = this.f63087;
        c9126.m23455(predicate);
        C10474 c10474 = this.f63091;
        c10474.f35835.m46175(c9126);
        c10474.f35829.m39725((C9126) null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m44773() {
        Set set;
        C10474 c10474 = this.f63091;
        Iterator it = c10474.f35844.m24140().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            set = this.f63095;
            if (!zHasNext) {
                break;
            } else {
                set.add(((C4603) it.next()).f16295);
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            c10474.f35856.mo7248((C10164) it2.next());
        }
        c10474.f35857.m47272();
        c10474.f35844.m24145();
        c10474.f35831.m29646();
        c10474.f35848.f18960 = 0;
        c10474.f35829.m39713();
        c10474.f35845.m30636();
        c10474.f35841.m52386();
        c10474.f35851.m40864();
        c10474.f35837.m38308();
        C3836 c3836 = c10474.f35855;
        c3836.getClass();
        Iterator itM45348 = C20021.m45348(c3836.f14245.values(), new C13688(5));
        while (itM45348.hasNext()) {
            if (((C22492) itM45348.next()).f77452 == EnumC10477.f35866) {
                C3836 c3837 = c10474.f35855;
                c3837.getClass();
                Iterator itM45349 = C20021.m45348(c3837.f14245.values(), new C13688(5));
                while (itM45349.hasNext()) {
                    C22492 c22492 = (C22492) itM45349.next();
                    if (c22492.f73422 != null || c22492.f77452 == EnumC10477.f35866) {
                        EnumC10477 enumC10477 = c22492.f77452;
                        c22492.m49996();
                        if (enumC10477 == EnumC10477.f35866) {
                            c22492.f77449 = new C0309(c22492, c22492.f77449.mo1934(), null);
                        }
                        if (c22492.f77451.mo1180()) {
                            c22492.f77451 = c10474.f35842;
                        }
                    }
                }
                return;
            }
        }
    }
}
