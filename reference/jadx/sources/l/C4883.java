package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4883 extends AbstractC20874 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final C18415 f17065 = C18415.m42925("(?m)^[ \\t]*// MARK_(?:CLASS_START (L.+?;)|(CLASS_END)|METHOD_START ([vd]) (.+)|(METHOD_END)|FIELD_START ([si]) (.+)|(FIELD_END))\\r?\\n");

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17066;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17067;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17068;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f17069;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public List f17070 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f17071;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9051 f17072;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f17073;

    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[PHI: r16 r17
      0x0132: PHI (r16v7 l.۬᩵ۧ) = (r16v4 l.۬᩵ۧ), (r16v4 l.۬᩵ۧ), (r16v4 l.۬᩵ۧ), (r16v9 l.۬᩵ۧ) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r17v7 int) = (r17v4 int), (r17v4 int), (r17v4 int), (r17v10 int) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2310 m14982(String str) {
        char c;
        C14072 c14072;
        int i;
        int i2;
        C14160 c14160;
        C9685 c9685;
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C14160> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C14072 c14073 = new C14072(str);
        C4245 c4245Matcher = f17065.matcher((CharSequence) str);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        C1483 c1483 = null;
        while (c4245Matcher.find()) {
            while (i4 < c4245Matcher.start()) {
                int iM34237 = c14073.m34237(i4, true);
                i4 = iM34237 > i4 ? iM34237 : i4 + 1;
            }
            if (i4 <= c4245Matcher.start()) {
                int iEnd = c4245Matcher.end();
                if (c4245Matcher.group(1) != null) {
                    c = 4;
                } else if (c4245Matcher.group(2) != null) {
                    c = 5;
                } else if (c4245Matcher.group(3) != null) {
                    c = 6;
                } else if (c4245Matcher.group(5) != null) {
                    c = 7;
                } else {
                    c = c4245Matcher.group(6) != null ? '\b' : '\t';
                }
                sb.append((CharSequence) str, i3, c4245Matcher.start());
                int iEnd2 = c4245Matcher.end();
                switch (c) {
                    case 4:
                        c14072 = c14073;
                        i = iEnd2;
                        i2 = iEnd;
                        String strGroup = c4245Matcher.group(1);
                        int length = sb.length();
                        if (strGroup == null || strGroup.isEmpty()) {
                            c14160 = null;
                        } else {
                            c14160 = new C14160();
                            c14160.f44772 = strGroup;
                            int iLastIndexOf = strGroup.lastIndexOf(47) + 1;
                            if (iLastIndexOf == 0 && strGroup.startsWith("L")) {
                                iLastIndexOf = 1;
                            }
                            c14160.f44771 = C1402.m5124(1, iLastIndexOf, strGroup);
                            c14160.f44770 = length;
                        }
                        if (c14160 != null) {
                            arrayList.add(c14160);
                            arrayList4.add(c14160);
                        }
                        c14073 = c14072;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 5:
                        c14072 = c14073;
                        i = iEnd2;
                        i2 = iEnd;
                        if (!arrayList4.isEmpty()) {
                            ((C14160) C18011.m41990(arrayList4, 1)).f44769 = sb.length();
                        }
                        c14073 = c14072;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 6:
                        c14072 = c14073;
                        i = iEnd2;
                        String strGroup2 = c4245Matcher.group(4);
                        boolean zEquals = c4245Matcher.group(3).equals(am.aE);
                        int length2 = sb.length();
                        if (strGroup2 == null || (iIndexOf = strGroup2.indexOf("->")) == -1) {
                            i2 = iEnd;
                        } else {
                            i2 = iEnd;
                            String strSubstring = strGroup2.substring(0, iIndexOf);
                            String[] strArrSplit = strGroup2.substring(iIndexOf + 2).split("[()]");
                            if (strArrSplit.length == 3) {
                                C9685 c9686 = new C9685();
                                c9686.f31271 = strArrSplit[0];
                                c9686.f31265 = strArrSplit[1];
                                c9686.f31269 = strArrSplit[2];
                                c9686.f31266 = strSubstring;
                                c9686.f31267 = zEquals;
                                c9686.f31268 = length2;
                                c9685 = c9686;
                            }
                            if (c9685 != null) {
                                arrayList5.add(c9685);
                            }
                            c14073 = c14072;
                            i3 = i;
                            i4 = i2;
                        }
                        c9685 = null;
                        if (c9685 != null) {
                            arrayList5.add(c9685);
                        }
                        c14073 = c14072;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 7:
                        c14072 = c14073;
                        i = iEnd2;
                        if (!arrayList5.isEmpty()) {
                            C9685 c9687 = (C9685) C18011.m41990(arrayList5, 1);
                            c9687.f31270 = sb.length();
                            arrayList2.add(c9687);
                        }
                        i2 = iEnd;
                        c14073 = c14072;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\b':
                        c14072 = c14073;
                        i = iEnd2;
                        String strGroup3 = c4245Matcher.group(7);
                        boolean zEquals2 = c4245Matcher.group(6).equals(am.aB);
                        int length3 = sb.length();
                        if (strGroup3 == null || (iIndexOf2 = strGroup3.indexOf("->")) == -1) {
                            c1483 = null;
                        } else {
                            String strSubstring2 = strGroup3.substring(0, iIndexOf2);
                            String strSubstring3 = strGroup3.substring(iIndexOf2 + 2);
                            int iIndexOf3 = strSubstring3.indexOf(58);
                            if (iIndexOf3 == -1) {
                                c1483 = null;
                            } else {
                                C1483 c1484 = new C1483();
                                c1484.f5157 = strSubstring3.substring(0, iIndexOf3);
                                c1484.f5154 = strSubstring3.substring(iIndexOf3 + 1);
                                c1484.f5156 = strSubstring2;
                                c1484.f5155 = length3;
                                c1484.f5152 = zEquals2;
                                c1483 = c1484;
                            }
                        }
                        i2 = iEnd;
                        c14073 = c14072;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\t':
                        if (c1483 != null) {
                            int length4 = sb.length();
                            c1483.f5151 = length4;
                            String strTrim = sb.substring(c1483.f5155, length4).trim();
                            C14072 c14074 = new C14072(strTrim);
                            int i5 = -1;
                            int i6 = 0;
                            c14072 = c14073;
                            while (true) {
                                if (i6 < strTrim.length()) {
                                    int iM34238 = c14074.m34237(i6, true);
                                    if (iM34238 > i6) {
                                        i6 = iM34238;
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
                                            c1483.f5153 = C18969.m44060(24, strTrim.substring(i5, i6));
                                        }
                                    }
                                    iEnd2 = i;
                                } else {
                                    i = iEnd2;
                                }
                            }
                            arrayList3.add(c1483);
                            c1483 = null;
                        } else {
                            c14072 = c14073;
                            i = iEnd2;
                        }
                        i2 = iEnd;
                        c14073 = c14072;
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
        for (C14160 c14161 : arrayList) {
            if (c14161.f44769 == 0) {
                c14161.f44769 = string.length();
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        return new C2310(string, new C4883(arrayList, arrayList2, arrayList3));
    }

    public C4883(C14691 c14691) {
        C6489 c6489M35345 = c14691.m35345(am.aI);
        C6489 c6489M35346 = c14691.m35345("m");
        C6489 c6489M35347 = c14691.m35345("f");
        c6489M35345 = c6489M35345 == null ? new C6489() : c6489M35345;
        ArrayList arrayList = new ArrayList(c6489M35345.size());
        ArrayList arrayList2 = new ArrayList(c6489M35346.size());
        ArrayList arrayList3 = new ArrayList(c6489M35347.size());
        for (int i = 0; i < c6489M35345.size(); i++) {
            C14691 c14691M18322 = c6489M35345.m18322(i);
            C14160 c14160 = new C14160();
            c14160.f44771 = c14691M18322.m35343("n");
            c14160.f44772 = c14691M18322.m35343(am.aI);
            c14160.f44770 = c14691M18322.m35341(am.aB);
            c14160.f44769 = c14691M18322.m35341("e");
            arrayList.add(c14160);
        }
        for (int i2 = 0; i2 < c6489M35346.size(); i2++) {
            C14691 c14691M18323 = c6489M35346.m18322(i2);
            C9685 c9685 = new C9685();
            c9685.f31271 = c14691M18323.m35343("n");
            c9685.f31265 = c14691M18323.m35343(am.av);
            c9685.f31269 = c14691M18323.m35343("r");
            c9685.f31266 = c14691M18323.m35343(am.aG);
            c9685.f31267 = c14691M18323.m35342().booleanValue();
            c9685.f31268 = c14691M18323.m35341(am.aB);
            c9685.f31270 = c14691M18323.m35341("e");
            arrayList2.add(c9685);
        }
        for (int i3 = 0; i3 < c6489M35347.size(); i3++) {
            C14691 c14691M18324 = c6489M35347.m18322(i3);
            C1483 c1483 = new C1483();
            c1483.f5157 = c14691M18324.m35343("n");
            c1483.f5154 = c14691M18324.m35343(am.aI);
            c1483.f5153 = c14691M18324.m35343(am.aE);
            c1483.f5156 = c14691M18324.m35343(am.aG);
            c1483.f5152 = c14691M18324.m35344(am.aF);
            c1483.f5155 = c14691M18324.m35341(am.aB);
            c1483.f5151 = c14691M18324.m35341("e");
            arrayList3.add(c1483);
        }
        this.f17068 = arrayList;
        this.f17067 = arrayList2;
        this.f17066 = arrayList3;
    }

    public C4883(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f17068 = arrayList;
        this.f17067 = arrayList2;
        this.f17066 = arrayList3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14691 m14986() {
        C14691 c14691 = new C14691();
        C6489 c6489 = new C6489();
        C6489 c64810 = new C6489();
        C6489 c64811 = new C6489();
        for (C14160 c14160 : this.f17068) {
            c14160.getClass();
            C14691 c14692 = new C14691();
            c14692.m35340("n", c14160.f44771);
            c14692.m35340(am.aI, c14160.f44772);
            c14692.m35340(am.aB, Integer.valueOf(c14160.f44770));
            c14692.m35340("e", Integer.valueOf(c14160.f44769));
            c6489.add(c14692);
        }
        for (C9685 c9685 : this.f17067) {
            c9685.getClass();
            C14691 c14693 = new C14691();
            c14693.m35340("n", c9685.f31271);
            c14693.m35340(am.av, c9685.f31265);
            c14693.m35340("r", c9685.f31269);
            String str = c9685.f31266;
            if (str != null) {
                c14693.m35340(am.aG, str);
            }
            c14693.m35340(am.aE, Boolean.valueOf(c9685.f31267));
            c14693.m35340(am.aB, Integer.valueOf(c9685.f31268));
            c14693.m35340("e", Integer.valueOf(c9685.f31270));
            c64810.add(c14693);
        }
        for (C1483 c1483 : this.f17066) {
            c1483.getClass();
            C14691 c14694 = new C14691();
            c14694.m35340("n", c1483.f5157);
            c14694.m35340(am.aI, c1483.f5154);
            String str2 = c1483.f5153;
            if (str2 != null) {
                c14694.m35340(am.aE, str2);
            }
            String str3 = c1483.f5156;
            if (str3 != null) {
                c14694.m35340(am.aG, str3);
            }
            c14694.m35340(am.aF, Boolean.valueOf(c1483.f5152));
            c14694.m35340(am.aB, Integer.valueOf(c1483.f5155));
            c14694.m35340("e", Integer.valueOf(c1483.f5151));
            c64811.add(c14694);
        }
        c14691.m35340(am.aI, c6489);
        c14691.m35340("m", c64810);
        c14691.m35340("f", c64811);
        return c14691;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14428(C20283 c20283, CharSequence charSequence) {
        m47706(charSequence, new InterfaceC23858() { // from class: l.ۜ᩵ۧ
            @Override // l.InterfaceC23858
            /* JADX INFO: renamed from: ۙ */
            public final Runnable mo19062(CharSequence charSequence2, InterfaceC7509 interfaceC7509) {
                ArrayList arrayList = new ArrayList();
                C14072 c14072 = new C14072(charSequence2);
                int i = 0;
                while (i < charSequence2.length() && !interfaceC7509.mo924()) {
                    try {
                        int iM34237 = c14072.m34237(i, false);
                        if (iM34237 == i) {
                            i++;
                        } else {
                            if (charSequence2.charAt(i) == '\"') {
                                C7449 c7449 = new C7449();
                                int i2 = i + 1;
                                c7449.f24518 = i2;
                                int i3 = iM34237 - 1;
                                c7449.f24517 = i3;
                                String string = charSequence2.subSequence(i2, i3).toString();
                                c7449.f24519 = string;
                                try {
                                    c7449.f24520 = C15830.f51499.m10291(string);
                                } catch (RuntimeException unused) {
                                    c7449.f24520 = c7449.f24519;
                                }
                                arrayList.add(c7449);
                            }
                            i = iM34237;
                        }
                    } catch (Exception unused2) {
                    }
                }
                return new RunnableC16699(2, this.f24205, arrayList);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14983(C4883 c4883, ArrayList arrayList) {
        c4883.f17070 = C4681.unmodifiableList(arrayList);
        ?? r4 = c4883.f17072;
        if (r4 != 0) {
            c4883.m14985(c4883.f17073, c4883.f17071, r4);
        }
        InterfaceC2974 interfaceC2974 = c4883.f69427;
        if (interfaceC2974 != null) {
            interfaceC2974.mo9690(c4883.f17068, c4883.f17067, c4883.f17066, c4883.f17070);
        }
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14424() {
        if (m47708()) {
            return this.f17069;
        }
        return null;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14425(final int i, final int i2, final InterfaceC8940 interfaceC8940) {
        m47707(new Runnable(interfaceC8940, i, i2) { // from class: l.۠᩵ۧ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f28928;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f28930;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC9051 f28931;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f28931 = (AbstractC9051) interfaceC8940;
                this.f28930 = i;
                this.f28928 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
            @Override // java.lang.Runnable
            public final void run() {
                C4883.m14984(this.f28929, this.f28931, this.f28930, this.f28928);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14984(C4883 c4883, InterfaceC8940 interfaceC8940, int i, int i2) {
        c4883.f17072 = (AbstractC9051) interfaceC8940;
        c4883.f17073 = i;
        c4883.f17071 = i2;
        if (c4883.m47708()) {
            c4883.m14985(i, i2, interfaceC8940);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m14985(int i, int i2, InterfaceC8940 interfaceC8940) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f17069 = null;
        for (C9685 c9685 : this.f17067) {
            int i7 = c9685.f31268;
            if (i >= i7 && i <= (i6 = c9685.f31270)) {
                if (i2 < i7 || i2 > i6) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f17069 = c9685;
                    interfaceC8940.mo1434(c9685.f31268, c9685.f31270, C8947.m23910(new StringBuilder(), c9685.f31271, "()"));
                    return;
                }
            }
        }
        for (C1483 c1483 : this.f17066) {
            int i8 = c1483.f5155;
            if (i >= i8 && i <= (i5 = c1483.f5151)) {
                if (i2 < i8 || i2 > i5) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f17069 = c1483;
                    interfaceC8940.mo1434(-1, -1, c1483.f5157);
                    return;
                }
            }
        }
        int i9 = Integer.MAX_VALUE;
        C14160 c14160 = null;
        for (C14160 c14161 : this.f17068) {
            int i10 = c14161.f44770;
            if (i >= i10 && i <= (i3 = c14161.f44769) && i2 >= i10 && i2 <= i3 && (i4 = i3 - i10) < i9) {
                c14160 = c14161;
                i9 = i4;
            }
        }
        if (c14160 == null) {
            interfaceC8940.mo1434(0, 0, null);
        } else {
            this.f17069 = c14160;
            interfaceC8940.mo1434(-1, -1, c14160.f44771);
        }
    }
}
