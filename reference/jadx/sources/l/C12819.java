package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12819 extends AbstractC12176 {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final C14690 f42684 = C14690.m35219("(?m)^[ \\t]*// MARK_(?:CLASS_START (L.+?;)|(CLASS_END)|METHOD_START ([vd]) (.+)|(METHOD_END)|FIELD_START ([si]) (.+)|(FIELD_END))\\r?\\n");

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42685;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f42686;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f42687;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42688;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f42689;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42690;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22611 f42691;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public List f42692 = Collections.EMPTY_LIST;

    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[PHI: r16 r17
      0x0132: PHI (r16v7 l.֨ۖۜ) = (r16v4 l.֨ۖۜ), (r16v4 l.֨ۖۜ), (r16v4 l.֨ۖۜ), (r16v9 l.֨ۖۜ) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r17v7 int) = (r17v4 int), (r17v4 int), (r17v4 int), (r17v10 int) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10946 m31822(String str) {
        char c;
        C0823 c0823;
        int i;
        int i2;
        C23028 c23028;
        C1154 c1154;
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C23028> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C0823 c0824 = new C0823(str);
        C6222 c6222Matcher = f42684.matcher((CharSequence) str);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        C22322 c22322 = null;
        while (c6222Matcher.find()) {
            while (i4 < c6222Matcher.start()) {
                int iM3420 = c0824.m3420(i4, true);
                i4 = iM3420 > i4 ? iM3420 : i4 + 1;
            }
            if (i4 <= c6222Matcher.start()) {
                int iEnd = c6222Matcher.end();
                if (c6222Matcher.group(1) != null) {
                    c = 4;
                } else if (c6222Matcher.group(2) != null) {
                    c = 5;
                } else if (c6222Matcher.group(3) != null) {
                    c = 6;
                } else if (c6222Matcher.group(5) != null) {
                    c = 7;
                } else {
                    c = c6222Matcher.group(6) != null ? '\b' : '\t';
                }
                sb.append((CharSequence) str, i3, c6222Matcher.start());
                int iEnd2 = c6222Matcher.end();
                switch (c) {
                    case 4:
                        c0823 = c0824;
                        i = iEnd2;
                        i2 = iEnd;
                        String strGroup = c6222Matcher.group(1);
                        int length = sb.length();
                        if (strGroup == null || strGroup.isEmpty()) {
                            c23028 = null;
                        } else {
                            c23028 = new C23028();
                            c23028.f74834 = strGroup;
                            int iLastIndexOf = strGroup.lastIndexOf(47) + 1;
                            if (iLastIndexOf == 0 && strGroup.startsWith("L")) {
                                iLastIndexOf = 1;
                            }
                            c23028.f74837 = C20630.m46498(1, iLastIndexOf, strGroup);
                            c23028.f74836 = length;
                        }
                        if (c23028 != null) {
                            arrayList.add(c23028);
                            arrayList4.add(c23028);
                        }
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 5:
                        c0823 = c0824;
                        i = iEnd2;
                        i2 = iEnd;
                        if (!arrayList4.isEmpty()) {
                            ((C23028) C17745.m41308(arrayList4, 1)).f74835 = sb.length();
                        }
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 6:
                        c0823 = c0824;
                        i = iEnd2;
                        String strGroup2 = c6222Matcher.group(4);
                        boolean zEquals = c6222Matcher.group(3).equals(am.aE);
                        int length2 = sb.length();
                        if (strGroup2 == null || (iIndexOf = strGroup2.indexOf("->")) == -1) {
                            i2 = iEnd;
                        } else {
                            i2 = iEnd;
                            String strSubstring = strGroup2.substring(0, iIndexOf);
                            String[] strArrSplit = strGroup2.substring(iIndexOf + 2).split("[()]");
                            if (strArrSplit.length == 3) {
                                C1154 c1155 = new C1154();
                                c1155.f5175 = strArrSplit[0];
                                c1155.f5176 = strArrSplit[1];
                                c1155.f5177 = strArrSplit[2];
                                c1155.f5178 = strSubstring;
                                c1155.f5174 = zEquals;
                                c1155.f5180 = length2;
                                c1154 = c1155;
                            }
                            if (c1154 != null) {
                                arrayList5.add(c1154);
                            }
                            c0824 = c0823;
                            i3 = i;
                            i4 = i2;
                        }
                        c1154 = null;
                        if (c1154 != null) {
                            arrayList5.add(c1154);
                        }
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 7:
                        c0823 = c0824;
                        i = iEnd2;
                        if (!arrayList5.isEmpty()) {
                            C1154 c1156 = (C1154) C17745.m41308(arrayList5, 1);
                            c1156.f5179 = sb.length();
                            arrayList2.add(c1156);
                        }
                        i2 = iEnd;
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\b':
                        c0823 = c0824;
                        i = iEnd2;
                        String strGroup3 = c6222Matcher.group(7);
                        boolean zEquals2 = c6222Matcher.group(6).equals(am.aB);
                        int length3 = sb.length();
                        if (strGroup3 == null || (iIndexOf2 = strGroup3.indexOf("->")) == -1) {
                            c22322 = null;
                        } else {
                            String strSubstring2 = strGroup3.substring(0, iIndexOf2);
                            String strSubstring3 = strGroup3.substring(iIndexOf2 + 2);
                            int iIndexOf3 = strSubstring3.indexOf(58);
                            if (iIndexOf3 == -1) {
                                c22322 = null;
                            } else {
                                C22322 c22323 = new C22322();
                                c22323.f72894 = strSubstring3.substring(0, iIndexOf3);
                                c22323.f72899 = strSubstring3.substring(iIndexOf3 + 1);
                                c22323.f72898 = strSubstring2;
                                c22323.f72896 = length3;
                                c22323.f72897 = zEquals2;
                                c22322 = c22323;
                            }
                        }
                        i2 = iEnd;
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\t':
                        if (c22322 != null) {
                            int length4 = sb.length();
                            c22322.f72895 = length4;
                            String strTrim = sb.substring(c22322.f72896, length4).trim();
                            C0823 c0825 = new C0823(strTrim);
                            int i5 = -1;
                            int i6 = 0;
                            c0823 = c0824;
                            while (true) {
                                if (i6 < strTrim.length()) {
                                    int iM3421 = c0825.m3420(i6, true);
                                    if (iM3421 > i6) {
                                        i6 = iM3421;
                                        i = iEnd2;
                                    } else if (strTrim.startsWith(" = ", i6)) {
                                        i6 += 3;
                                        i = iEnd2;
                                        i5 = i6;
                                    } else {
                                        i = iEnd2;
                                        if (strTrim.charAt(i6) != ';' || i5 == -1) {
                                            i6++;
                                        } else {
                                            c22322.f72893 = C13012.m32189(24, strTrim.substring(i5, i6));
                                        }
                                    }
                                    iEnd2 = i;
                                } else {
                                    i = iEnd2;
                                }
                            }
                            arrayList3.add(c22322);
                            c22322 = null;
                        } else {
                            c0823 = c0824;
                            i = iEnd2;
                        }
                        i2 = iEnd;
                        c0824 = c0823;
                        i3 = i;
                        i4 = i2;
                        break;
                    default:
                        throw new RuntimeException();
                }
            }
        }
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        for (C23028 c23029 : arrayList) {
            if (c23029.f74835 == 0) {
                c23029.f74835 = string.length();
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        return new C10946(string, new C12819(arrayList, arrayList2, arrayList3));
    }

    public C12819(C15676 c15676) {
        C10031 c10031M37346 = c15676.m37346(am.aI);
        C10031 c10031M37347 = c15676.m37346("m");
        C10031 c10031M37348 = c15676.m37346("f");
        c10031M37346 = c10031M37346 == null ? new C10031() : c10031M37346;
        ArrayList arrayList = new ArrayList(c10031M37346.size());
        ArrayList arrayList2 = new ArrayList(c10031M37347.size());
        ArrayList arrayList3 = new ArrayList(c10031M37348.size());
        for (int i = 0; i < c10031M37346.size(); i++) {
            C15676 c15676M25312 = c10031M37346.m25312(i);
            C23028 c23028 = new C23028();
            c23028.f74837 = c15676M25312.m37351("n");
            c23028.f74834 = c15676M25312.m37351(am.aI);
            c23028.f74836 = c15676M25312.m37352(am.aB);
            c23028.f74835 = c15676M25312.m37352("e");
            arrayList.add(c23028);
        }
        for (int i2 = 0; i2 < c10031M37347.size(); i2++) {
            C15676 c15676M25313 = c10031M37347.m25312(i2);
            C1154 c1154 = new C1154();
            c1154.f5175 = c15676M25313.m37351("n");
            c1154.f5176 = c15676M25313.m37351(am.av);
            c1154.f5177 = c15676M25313.m37351("r");
            c1154.f5178 = c15676M25313.m37351(am.aG);
            c1154.f5174 = c15676M25313.m37350().booleanValue();
            c1154.f5180 = c15676M25313.m37352(am.aB);
            c1154.f5179 = c15676M25313.m37352("e");
            arrayList2.add(c1154);
        }
        for (int i3 = 0; i3 < c10031M37348.size(); i3++) {
            C15676 c15676M25314 = c10031M37348.m25312(i3);
            C22322 c22322 = new C22322();
            c22322.f72894 = c15676M25314.m37351("n");
            c22322.f72899 = c15676M25314.m37351(am.aI);
            c22322.f72893 = c15676M25314.m37351(am.aE);
            c22322.f72898 = c15676M25314.m37351(am.aG);
            c22322.f72897 = c15676M25314.m37353(am.aF);
            c22322.f72896 = c15676M25314.m37352(am.aB);
            c22322.f72895 = c15676M25314.m37352("e");
            arrayList3.add(c22322);
        }
        this.f42685 = arrayList;
        this.f42690 = arrayList2;
        this.f42688 = arrayList3;
    }

    public C12819(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f42685 = arrayList;
        this.f42690 = arrayList2;
        this.f42688 = arrayList3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15676 m31826() {
        C15676 c15676 = new C15676();
        C10031 c10031 = new C10031();
        C10031 c10032 = new C10031();
        C10031 c10033 = new C10031();
        for (C23028 c23028 : this.f42685) {
            c23028.getClass();
            C15676 c15677 = new C15676();
            c15677.m37349("n", c23028.f74837);
            c15677.m37349(am.aI, c23028.f74834);
            c15677.m37349(am.aB, Integer.valueOf(c23028.f74836));
            c15677.m37349("e", Integer.valueOf(c23028.f74835));
            c10031.add(c15677);
        }
        for (C1154 c1154 : this.f42690) {
            c1154.getClass();
            C15676 c15678 = new C15676();
            c15678.m37349("n", c1154.f5175);
            c15678.m37349(am.av, c1154.f5176);
            c15678.m37349("r", c1154.f5177);
            String str = c1154.f5178;
            if (str != null) {
                c15678.m37349(am.aG, str);
            }
            c15678.m37349(am.aE, Boolean.valueOf(c1154.f5174));
            c15678.m37349(am.aB, Integer.valueOf(c1154.f5180));
            c15678.m37349("e", Integer.valueOf(c1154.f5179));
            c10032.add(c15678);
        }
        for (C22322 c22322 : this.f42688) {
            c22322.getClass();
            C15676 c15679 = new C15676();
            c15679.m37349("n", c22322.f72894);
            c15679.m37349(am.aI, c22322.f72899);
            String str2 = c22322.f72893;
            if (str2 != null) {
                c15679.m37349(am.aE, str2);
            }
            String str3 = c22322.f72898;
            if (str3 != null) {
                c15679.m37349(am.aG, str3);
            }
            c15679.m37349(am.aF, Boolean.valueOf(c22322.f72897));
            c15679.m37349(am.aB, Integer.valueOf(c22322.f72896));
            c15679.m37349("e", Integer.valueOf(c22322.f72895));
            c10033.add(c15679);
        }
        c15676.m37349(am.aI, c10031);
        c15676.m37349("m", c10032);
        c15676.m37349("f", c10033);
        return c15676;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10753(C6094 c6094, CharSequence charSequence) {
        m30282(charSequence, new InterfaceC0180() { // from class: l.᩹ۖۜ
            @Override // l.InterfaceC0180
            /* JADX INFO: renamed from: ۙ */
            public final Runnable mo1383(CharSequence charSequence2, InterfaceC5614 interfaceC5614) {
                ArrayList arrayList = new ArrayList();
                C0823 c0823 = new C0823(charSequence2);
                int i = 0;
                while (i < charSequence2.length() && !interfaceC5614.mo2357()) {
                    try {
                        int iM3420 = c0823.m3420(i, false);
                        if (iM3420 == i) {
                            i++;
                        } else {
                            if (charSequence2.charAt(i) == '\"') {
                                C6799 c6799 = new C6799();
                                int i2 = i + 1;
                                c6799.f22949 = i2;
                                int i3 = iM3420 - 1;
                                c6799.f22948 = i3;
                                String string = charSequence2.subSequence(i2, i3).toString();
                                c6799.f22950 = string;
                                try {
                                    c6799.f22947 = C11168.f37846.m35229(string);
                                } catch (RuntimeException unused) {
                                    c6799.f22947 = c6799.f22950;
                                }
                                arrayList.add(c6799);
                            }
                            i = iM3420;
                        }
                    } catch (Exception unused2) {
                    }
                }
                return new RunnableC19206(2, this.f71321, arrayList);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31823(C12819 c12819, ArrayList arrayList) {
        c12819.f42692 = C0561.unmodifiableList(arrayList);
        ?? r4 = c12819.f42691;
        if (r4 != 0) {
            c12819.m31825(c12819.f42686, c12819.f42689, r4);
        }
        InterfaceC13150 interfaceC13150 = c12819.f70111;
        if (interfaceC13150 != null) {
            interfaceC13150.mo9540(c12819.f42685, c12819.f42690, c12819.f42688, c12819.f42692);
        }
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10751() {
        if (m30285()) {
            return this.f42687;
        }
        return null;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10752(final int i, final int i2, final InterfaceC3976 interfaceC3976) {
        m30283(new Runnable(interfaceC3976, i, i2) { // from class: l.ۚۖۜ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f17644;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f17646;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC22611 f17647;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f17647 = (AbstractC22611) interfaceC3976;
                this.f17644 = i;
                this.f17646 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
            @Override // java.lang.Runnable
            public final void run() {
                C12819.m31824(this.f17645, this.f17647, this.f17644, this.f17646);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31824(C12819 c12819, InterfaceC3976 interfaceC3976, int i, int i2) {
        c12819.f42691 = (AbstractC22611) interfaceC3976;
        c12819.f42686 = i;
        c12819.f42689 = i2;
        if (c12819.m30285()) {
            c12819.m31825(i, i2, interfaceC3976);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31825(int i, int i2, InterfaceC3976 interfaceC3976) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f42687 = null;
        for (C1154 c1154 : this.f42690) {
            int i7 = c1154.f5180;
            if (i >= i7 && i <= (i6 = c1154.f5179)) {
                if (i2 < i7 || i2 > i6) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f42687 = c1154;
                    interfaceC3976.mo11470(c1154.f5180, c1154.f5179, C22697.m50267(new StringBuilder(), c1154.f5175, "()"));
                    return;
                }
            }
        }
        for (C22322 c22322 : this.f42688) {
            int i8 = c22322.f72896;
            if (i >= i8 && i <= (i5 = c22322.f72895)) {
                if (i2 < i8 || i2 > i5) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f42687 = c22322;
                    interfaceC3976.mo11470(-1, -1, c22322.f72894);
                    return;
                }
            }
        }
        int i9 = Integer.MAX_VALUE;
        C23028 c23028 = null;
        for (C23028 c23029 : this.f42685) {
            int i10 = c23029.f74836;
            if (i >= i10 && i <= (i3 = c23029.f74835) && i2 >= i10 && i2 <= i3 && (i4 = i3 - i10) < i9) {
                c23028 = c23029;
                i9 = i4;
            }
        }
        if (c23028 == null) {
            interfaceC3976.mo11470(0, 0, null);
        } else {
            this.f42687 = c23028;
            interfaceC3976.mo11470(-1, -1, c23028.f74837);
        }
    }
}
