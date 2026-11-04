package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15080 f27044;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18282 f27045;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12887 f27046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22110() {
        C15080.m36338().m36341();
    }

    public C8214(C12887 c12887, C18282 c18282) {
        C15080 c15080M36338 = C15080.m36338();
        this.f27046 = c12887;
        this.f27045 = c18282;
        this.f27044 = c15080M36338;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [l.ۚۘۚ] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.ܿ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [l.ۚۘۚ] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.ۖ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.ۖ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.ܰ᩺ۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11942 m22115(C14069 c14069, C15146 c15146, C4156 c4156) {
        ?? c2993;
        ?? c14925;
        C23330 c23330;
        int i;
        C18655 c18655;
        C4156 c4157 = c4156;
        String str = c15146.f49419;
        String str2 = c15146.f49417;
        boolean zEquals = "dex_method".equals(str2);
        String str3 = c15146.f49414;
        String str4 = c15146.f49421;
        String str5 = c15146.f49420;
        C18282 c18282 = this.f27045;
        if (zEquals) {
            C15080 c15080 = this.f27044;
            c15080.m36341();
            if (!"exact".equals(str)) {
                c18282.getClass();
                if (C18282.m42583(str5)) {
                    c2993 = new C2993(str4, c15080);
                    Iterator it = c14069.f44553.iterator();
                    while (it.hasNext()) {
                        C22737 c22737M31928 = this.f27046.m31928(c14069, (C23330) it.next(), c4157);
                        c2993.m9790(c22737M31928.getType(), C19401.m44857(c22737M31928, str4));
                    }
                } else {
                    c2993 = new C2993(str4, c15080);
                    Iterator it2 = c18282.m42588(c14069, str5, c4157).iterator();
                    while (it2.hasNext()) {
                        C22737 c22737M42614 = c18282.m42614(c14069, str5, (C23330) it2.next(), c4157);
                        c2993.m9790(c22737M42614.getType(), C19401.m44857(c22737M42614, str4));
                    }
                }
            } else {
                C14179 c14179Mo36340 = c15080.mo36340(str3, str4);
                if (c14179Mo36340.f44837 == EnumC4640.FOUND) {
                    int i2 = c14179Mo36340.f44836.f24724 & 7;
                    c2993 = new C14925(str3, str4, i2 == 2 || i2 == 4);
                } else {
                    Iterator it3 = c18282.m42589(c14069, str5, false, c4157).iterator();
                    do {
                        if (!it3.hasNext()) {
                            c23330 = null;
                            break;
                        }
                        c23330 = (C23330) it3.next();
                    } while (!str3.equals(C3192.m10509(c23330.f75565)));
                    if (c23330 == null) {
                        c14925 = new C14925(str3, str4, false);
                    } else {
                        Iterator it4 = c18282.m42600(c14069, str5, c23330, c4157).getMethods().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                InterfaceC8631 interfaceC8631 = (InterfaceC8631) it4.next();
                                if (C12688.m31482(interfaceC8631, str4)) {
                                    c14925 = new C14925(str3, str4, C2993.m9769(interfaceC8631));
                                    break;
                                }
                            } else {
                                c14925 = new C14925(str3, str4, false);
                                break;
                            }
                        }
                    }
                }
            }
            c14925 = c2993;
        } else {
            c14925 = new C14925("", "", false);
        }
        ?? r15 = c14925;
        boolean z = "dex_method".equals(str2) && r15.mo9791(str3, str4);
        ArrayList arrayList = new ArrayList();
        C21639 c21639 = new C21639();
        C0756 c0756M3122 = C0756.m3122(c15146);
        C18655 c18656 = new C18655(this);
        C8959 c8959 = c15146.f49418;
        ArrayList arrayListM42588 = c18282.m42588(c14069, str5, c4157);
        int i3 = c8959.f29221;
        int i4 = c8959.f29222;
        int i5 = i3;
        ?? r16 = r15;
        while (i5 < arrayListM42588.size()) {
            C22737 c22737M42615 = c18282.m42614(c14069, str5, (C23330) arrayListM42588.get(i5), c4157);
            int i6 = i5 == i3 ? i4 : 0;
            int i7 = 0;
            ?? r17 = r16;
            for (C4091 c4091 : c22737M42615.getMethods()) {
                int i8 = i7 + 1;
                if (i7 < i6) {
                    i = i5;
                    c18655 = c18656;
                } else {
                    int i9 = (i5 == i3 && i7 == i4) ? c8959.f29223 : 0;
                    int i10 = i7;
                    i = i5;
                    c18655 = c18656;
                    c18656.m43416(c15146, r17, arrayList, c4091, z, c21639, c0756M3122);
                    int iM13178 = c4091.m13178(i9, c18655);
                    C8959 c89510 = iM13178 >= 0 ? new C8959(i, i10, iM13178) : null;
                    if (c89510 != null) {
                        return new C11942(c14069.f44556, c15146.f49417, c15146.f49414, c15146.f49421, str, arrayList, c89510);
                    }
                }
                i5 = i;
                c18656 = c18655;
                i7 = i8;
                str5 = str5;
                i6 = i6;
                c18282 = c18282;
                i4 = i4;
                i3 = i3;
                arrayListM42588 = arrayListM42588;
                c8959 = c8959;
                r17 = r17;
            }
            i5++;
            c4157 = c4156;
            c18282 = c18282;
            r16 = r17;
        }
        return new C11942(c14069.f44556, c15146.f49417, c15146.f49414, c15146.f49421, str, arrayList, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22113(C8214 c8214, C15146 c15146, InterfaceC5386 interfaceC5386, C4091 c4091, C24975 c24975, int i, EnumC22631 enumC22631, int i2, boolean z, C21639 c21639, C0756 c0756) {
        if (i2 != 3 || !enumC22631.f73509.startsWith("invoke-")) {
            return false;
        }
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int iM55812 = c24975.m55812(i);
        int iM8721 = abstractC2599M55818.m8721(iM55812);
        String str = c15146.f49421;
        String str2 = c15146.f49419;
        String str3 = c15146.f49414;
        if ("exact".equals(str2)) {
            if (!c24975.m55817(iM8721, 0, str3.length(), str3) || !m22114(c24975, iM55812, str, c0756)) {
                return false;
            }
            m22112(c21639, enumC22631, c24975.m55822(iM8721), str, z);
            return true;
        }
        if (enumC22631.f73509.startsWith("invoke-polymorphic") || enumC22631.f73509.startsWith("invoke-static") || enumC22631.f73509.startsWith("invoke-direct") || enumC22631.f73509.startsWith("invoke-object-init")) {
            if (!c24975.m55817(iM8721, 0, str3.length(), str3) || !m22114(c24975, iM55812, str, c0756)) {
                return false;
            }
            m22112(c21639, enumC22631, c24975.m55822(iM8721), str, z);
            return true;
        }
        if (enumC22631.f73509.startsWith("invoke-super")) {
            if (!m22114(c24975, iM55812, str, c0756)) {
                return false;
            }
            String strM55822 = c24975.m55822(iM8721);
            boolean zEquals = str3.equals(strM55822);
            if (!"slot".equals(str2)) {
                EnumC12843 enumC12843Mo9789 = interfaceC5386.mo9789(c4091.f13949.getType(), strM55822, str3, str);
                if (enumC12843Mo9789 == EnumC12843.NONE) {
                    return false;
                }
                m22111(c21639, strM55822, str, "super_call", enumC12843Mo9789.f41137);
                return true;
            }
            if (zEquals) {
                m22111(c21639, strM55822, str, "super_call", "not_applicable");
                return true;
            }
            if (!interfaceC5386.mo9793(strM55822, str3, str)) {
                return false;
            }
            m22111(c21639, strM55822, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!enumC22631.f73509.startsWith("invoke-virtual") && !enumC22631.f73509.startsWith("invoke-interface")) {
            if (!c24975.m55817(iM8721, 0, str3.length(), str3) || !m22114(c24975, iM55812, str, c0756)) {
                return false;
            }
            m22112(c21639, enumC22631, c24975.m55822(iM8721), str, z);
            return true;
        }
        if (!m22114(c24975, iM55812, str, c0756)) {
            return false;
        }
        String strM55823 = c24975.m55822(iM8721);
        boolean zEquals2 = str3.equals(strM55823);
        if ("slot".equals(str2)) {
            if (!str.equals(str)) {
                return false;
            }
            if (zEquals2) {
                m22111(c21639, strM55823, str, "exact_reference", z ? "possible" : "not_applicable");
                return true;
            }
            if (!interfaceC5386.mo9793(strM55823, str3, str)) {
                return false;
            }
            m22111(c21639, strM55823, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!str.equals(str)) {
            return false;
        }
        if (zEquals2) {
            m22111(c21639, strM55823, str, "exact_reference", z ? "possible" : "not_applicable");
            return true;
        }
        if (z) {
            if (!interfaceC5386.mo9792(strM55823, str3, str)) {
                return false;
            }
            m22111(c21639, strM55823, str, "possible_virtual_dispatch", "possible");
            return true;
        }
        if (!interfaceC5386.mo9793(strM55823, str3, str)) {
            return false;
        }
        m22111(c21639, strM55823, str, "same_virtual_slot", "not_applicable");
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22112(C21639 c21639, EnumC22631 enumC22631, String str, String str2, boolean z) {
        if (enumC22631.f73509.startsWith("invoke-super")) {
            m22111(c21639, str, str2, "super_call", "not_applicable");
            return;
        }
        if (enumC22631.f73509.startsWith("invoke-virtual") || enumC22631.f73509.startsWith("invoke-interface")) {
            m22111(c21639, str, str2, "exact_reference", z ? "possible" : "not_applicable");
        } else if (enumC22631.f73509.startsWith("invoke-polymorphic")) {
            m22111(c21639, str, str2, "exact_reference", "not_applicable");
        } else {
            m22111(c21639, str, str2, "exact_reference", "exact");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22114(C24975 c24975, int i, String str, C0756 c0756) {
        int i2;
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        if (!c24975.m55793(abstractC2599M55818.mo8719(i + 4), 0, c0756.f2755, str)) {
            return false;
        }
        int iM8721 = abstractC2599M55818.m8721(i + 2);
        AbstractC2599 abstractC2599M55819 = c24975.m55818();
        int iM55796 = c24975.m55796(iM8721);
        int iMo8719 = abstractC2599M55819.mo8719(iM55796 + 8);
        int i3 = c0756.f2757;
        int i4 = c0756.f2756;
        int i5 = c0756.f2759;
        if (iMo8719 > 0) {
            int iMo87110 = abstractC2599M55819.mo8719(iMo8719);
            int i6 = iMo8719 + 4;
            int i7 = 0;
            while (i7 < iMo87110) {
                int i8 = -1;
                if (i3 < i5) {
                    int i9 = i3;
                    while (i9 < i5 && str.charAt(i9) == '[') {
                        i9++;
                    }
                    if (i9 < i5) {
                        if (str.charAt(i9) == 'L') {
                            int iIndexOf = str.indexOf(59, i9);
                            if (iIndexOf >= 0 && iIndexOf < i5) {
                                i2 = iIndexOf + 1;
                                i8 = i2;
                            }
                        } else {
                            i2 = i9 + 1;
                            if (i2 <= i5) {
                                i8 = i2;
                            }
                        }
                    }
                }
                if (i8 >= 0 && c24975.m55817(abstractC2599M55819.m8721((i7 * 2) + i6), i3, i8 - i3, str)) {
                    i7++;
                    i3 = i8;
                }
            }
            if (i3 == i5) {
                return c24975.m55817(abstractC2599M55819.mo8719(iM55796 + 4), i4, str.length() - i4, str);
            }
        } else if (i3 == i5) {
            return c24975.m55817(abstractC2599M55819.mo8719(iM55796 + 4), i4, str.length() - i4, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22111(C21639 c21639, String str, String str2, String str3, String str4) {
        c21639.f69088 = C20196.m46451(str, "->", str2);
        c21639.f69089 = str3;
        c21639.f69087 = str4;
    }
}
