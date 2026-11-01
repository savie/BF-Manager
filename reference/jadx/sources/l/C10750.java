package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10750 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3775 f36648;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14952 f36649;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14578 f36650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27045() {
        C3775.m11017().m11020();
    }

    public C10750(C14578 c14578, C14952 c14952) {
        C3775 c3775M11017 = C3775.m11017();
        this.f36650 = c14578;
        this.f36649 = c14952;
        this.f36648 = c3775M11017;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [l.᩺ۜ۬] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.ܿۘ۬] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [l.᩺ۜ۬] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.ۗۘ۬] */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.ۗۘ۬] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.ܽۘ۬] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21332 m27050(C21956 c21956, C6784 c6784, C15283 c15283) {
        ?? c2987;
        ?? c16394;
        C5032 c5032;
        int i;
        C17099 c17099;
        C15283 c15284 = c15283;
        String str = c6784.f22904;
        String str2 = c6784.f22901;
        boolean zEquals = "dex_method".equals(str2);
        String str3 = c6784.f22903;
        String str4 = c6784.f22902;
        String str5 = c6784.f22907;
        C14952 c14952 = this.f36649;
        if (zEquals) {
            C3775 c3775 = this.f36648;
            c3775.m11020();
            if (!"exact".equals(str)) {
                c14952.getClass();
                if (C14952.m35723(str5)) {
                    c2987 = new C2987(str4, c3775);
                    Iterator it = c21956.f71221.iterator();
                    while (it.hasNext()) {
                        C7807 c7807M35047 = this.f36650.m35047(c21956, (C5032) it.next(), c15284);
                        c2987.m8936(c7807M35047.getType(), C23450.m51669(c7807M35047, str4));
                    }
                } else {
                    c2987 = new C2987(str4, c3775);
                    Iterator it2 = c14952.m35869(c21956, str5, c15284).iterator();
                    while (it2.hasNext()) {
                        C7807 c7807M35891 = c14952.m35891(c21956, str5, (C5032) it2.next(), c15284);
                        c2987.m8936(c7807M35891.getType(), C23450.m51669(c7807M35891, str4));
                    }
                }
            } else {
                C11538 c11538Mo11019 = c3775.mo11019(str3, str4);
                if (c11538Mo11019.f38773 == EnumC2364.FOUND) {
                    int i2 = c11538Mo11019.f38772.f45021 & 7;
                    c2987 = new C16394(str3, str4, i2 == 2 || i2 == 4);
                } else {
                    Iterator it3 = c14952.m35870(c21956, str5, false, c15284).iterator();
                    do {
                        if (!it3.hasNext()) {
                            c5032 = null;
                            break;
                        }
                        c5032 = (C5032) it3.next();
                    } while (!str3.equals(C21966.m48798(c5032.f17548)));
                    if (c5032 == null) {
                        c16394 = new C16394(str3, str4, false);
                    } else {
                        Iterator it4 = c14952.m35875(c21956, str5, c5032, c15284).getMethods().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                InterfaceC18528 interfaceC18528 = (InterfaceC18528) it4.next();
                                if (C20627.m46497(interfaceC18528, str4)) {
                                    c16394 = new C16394(str3, str4, C2987.m8918(interfaceC18528));
                                    break;
                                }
                            } else {
                                c16394 = new C16394(str3, str4, false);
                                break;
                            }
                        }
                    }
                }
            }
            c16394 = c2987;
        } else {
            c16394 = new C16394("", "", false);
        }
        ?? r15 = c16394;
        boolean z = "dex_method".equals(str2) && r15.mo8937(str3, str4);
        ArrayList arrayList = new ArrayList();
        C12161 c12161 = new C12161();
        C5810 c5810M15991 = C5810.m15991(c6784);
        C17099 c170910 = new C17099(this);
        C4481 c4481 = c6784.f22908;
        ArrayList arrayListM35869 = c14952.m35869(c21956, str5, c15284);
        int i3 = c4481.f15949;
        int i4 = c4481.f15950;
        int i5 = i3;
        ?? r16 = r15;
        while (i5 < arrayListM35869.size()) {
            C7807 c7807M35892 = c14952.m35891(c21956, str5, (C5032) arrayListM35869.get(i5), c15284);
            int i6 = i5 == i3 ? i4 : 0;
            int i7 = 0;
            ?? r17 = r16;
            for (C11770 c11770 : c7807M35892.getMethods()) {
                int i8 = i7 + 1;
                if (i7 < i6) {
                    i = i5;
                    c17099 = c170910;
                } else {
                    int i9 = (i5 == i3 && i7 == i4) ? c4481.f15951 : 0;
                    int i10 = i7;
                    i = i5;
                    c17099 = c170910;
                    c170910.m39920(c6784, r17, arrayList, c11770, z, c12161, c5810M15991);
                    int iM29394 = c11770.m29394(i9, c17099);
                    C4481 c4482 = iM29394 >= 0 ? new C4481(i, i10, iM29394) : null;
                    if (c4482 != null) {
                        return new C21332(c21956.f71244, c6784.f22901, c6784.f22903, c6784.f22902, str, arrayList, c4482);
                    }
                }
                i5 = i;
                c170910 = c17099;
                i7 = i8;
                str5 = str5;
                i6 = i6;
                c14952 = c14952;
                i4 = i4;
                i3 = i3;
                arrayListM35869 = arrayListM35869;
                c4481 = c4481;
                r17 = r17;
            }
            i5++;
            c15284 = c15283;
            c14952 = c14952;
            r16 = r17;
        }
        return new C21332(c21956.f71244, c6784.f22901, c6784.f22903, c6784.f22902, str, arrayList, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27048(C10750 c10750, C6784 c6784, InterfaceC22827 interfaceC22827, C11770 c11770, C17684 c17684, int i, EnumC10297 enumC10297, int i2, boolean z, C12161 c12161, C5810 c5810) {
        if (i2 != 3 || !enumC10297.f35326.startsWith("invoke-")) {
            return false;
        }
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int iM41180 = c17684.m41180(i);
        int iM42183 = abstractC18119M41166.m42183(iM41180);
        String str = c6784.f22902;
        String str2 = c6784.f22904;
        String str3 = c6784.f22903;
        if ("exact".equals(str2)) {
            if (!c17684.m41193(iM42183, 0, str3.length(), str3) || !m27049(c17684, iM41180, str, c5810)) {
                return false;
            }
            m27047(c12161, enumC10297, c17684.m41204(iM42183), str, z);
            return true;
        }
        if (enumC10297.f35326.startsWith("invoke-polymorphic") || enumC10297.f35326.startsWith("invoke-static") || enumC10297.f35326.startsWith("invoke-direct") || enumC10297.f35326.startsWith("invoke-object-init")) {
            if (!c17684.m41193(iM42183, 0, str3.length(), str3) || !m27049(c17684, iM41180, str, c5810)) {
                return false;
            }
            m27047(c12161, enumC10297, c17684.m41204(iM42183), str, z);
            return true;
        }
        if (enumC10297.f35326.startsWith("invoke-super")) {
            if (!m27049(c17684, iM41180, str, c5810)) {
                return false;
            }
            String strM41204 = c17684.m41204(iM42183);
            boolean zEquals = str3.equals(strM41204);
            if (!"slot".equals(str2)) {
                EnumC6598 enumC6598Mo8935 = interfaceC22827.mo8935(c11770.f39513.getType(), strM41204, str3, str);
                if (enumC6598Mo8935 == EnumC6598.NONE) {
                    return false;
                }
                m27046(c12161, strM41204, str, "super_call", enumC6598Mo8935.f22223);
                return true;
            }
            if (zEquals) {
                m27046(c12161, strM41204, str, "super_call", "not_applicable");
                return true;
            }
            if (!interfaceC22827.mo8939(strM41204, str3, str)) {
                return false;
            }
            m27046(c12161, strM41204, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!enumC10297.f35326.startsWith("invoke-virtual") && !enumC10297.f35326.startsWith("invoke-interface")) {
            if (!c17684.m41193(iM42183, 0, str3.length(), str3) || !m27049(c17684, iM41180, str, c5810)) {
                return false;
            }
            m27047(c12161, enumC10297, c17684.m41204(iM42183), str, z);
            return true;
        }
        if (!m27049(c17684, iM41180, str, c5810)) {
            return false;
        }
        String strM41205 = c17684.m41204(iM42183);
        boolean zEquals2 = str3.equals(strM41205);
        if ("slot".equals(str2)) {
            if (!str.equals(str)) {
                return false;
            }
            if (zEquals2) {
                m27046(c12161, strM41205, str, "exact_reference", z ? "possible" : "not_applicable");
                return true;
            }
            if (!interfaceC22827.mo8939(strM41205, str3, str)) {
                return false;
            }
            m27046(c12161, strM41205, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!str.equals(str)) {
            return false;
        }
        if (zEquals2) {
            m27046(c12161, strM41205, str, "exact_reference", z ? "possible" : "not_applicable");
            return true;
        }
        if (z) {
            if (!interfaceC22827.mo8938(strM41205, str3, str)) {
                return false;
            }
            m27046(c12161, strM41205, str, "possible_virtual_dispatch", "possible");
            return true;
        }
        if (!interfaceC22827.mo8939(strM41205, str3, str)) {
            return false;
        }
        m27046(c12161, strM41205, str, "same_virtual_slot", "not_applicable");
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27047(C12161 c12161, EnumC10297 enumC10297, String str, String str2, boolean z) {
        if (enumC10297.f35326.startsWith("invoke-super")) {
            m27046(c12161, str, str2, "super_call", "not_applicable");
            return;
        }
        if (enumC10297.f35326.startsWith("invoke-virtual") || enumC10297.f35326.startsWith("invoke-interface")) {
            m27046(c12161, str, str2, "exact_reference", z ? "possible" : "not_applicable");
        } else if (enumC10297.f35326.startsWith("invoke-polymorphic")) {
            m27046(c12161, str, str2, "exact_reference", "not_applicable");
        } else {
            m27046(c12161, str, str2, "exact_reference", "exact");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27049(C17684 c17684, int i, String str, C5810 c5810) {
        int i2;
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        if (!c17684.m41178(abstractC18119M41166.mo9809(i + 4), 0, c5810.f19737, str)) {
            return false;
        }
        int iM42183 = abstractC18119M41166.m42183(i + 2);
        AbstractC18119 abstractC18119M41167 = c17684.m41166();
        int iM41189 = c17684.m41189(iM42183);
        int iMo9809 = abstractC18119M41167.mo9809(iM41189 + 8);
        int i3 = c5810.f19736;
        int i4 = c5810.f19739;
        int i5 = c5810.f19734;
        if (iMo9809 > 0) {
            int iMo98010 = abstractC18119M41167.mo9809(iMo9809);
            int i6 = iMo9809 + 4;
            int i7 = 0;
            while (i7 < iMo98010) {
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
                if (i8 >= 0 && c17684.m41193(abstractC18119M41167.m42183((i7 * 2) + i6), i3, i8 - i3, str)) {
                    i7++;
                    i3 = i8;
                }
            }
            if (i3 == i5) {
                return c17684.m41193(abstractC18119M41167.mo9809(iM41189 + 4), i4, str.length() - i4, str);
            }
        } else if (i3 == i5) {
            return c17684.m41193(abstractC18119M41167.mo9809(iM41189 + 4), i4, str.length() - i4, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27046(C12161 c12161, String str, String str2, String str3, String str4) {
        c12161.f40700 = C1679.m5594(str, "->", str2);
        c12161.f40701 = str3;
        c12161.f40699 = str4;
    }
}
