package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes5.dex */
public final class C20536 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f65755;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f65756;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65757;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65759;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65760;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f65761;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65762;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65763;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f65764;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65765;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f65766;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25012 f65767;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f65768;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f65769;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence f65770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47090(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47093(int i) {
        return i == 30 || i == 47 || i == 45;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:166:0x030e  */
    /* JADX WARN: Code duplicated, block: B:174:0x033f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0345  */
    /* JADX WARN: Code duplicated, block: B:179:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0356 A[EDGE_INSN: B:229:0x0356->B:181:0x0356 BREAK  A[LOOP:3: B:177:0x0346->B:231:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02f5 A[ADDED_TO_REGION, EDGE_INSN: B:233:0x02f5->B:163:0x02f5 BREAK  A[LOOP:4: B:157:0x02d8->B:162:0x02f1], REMOVE, SYNTHETIC] */
    public C20536(CharSequence charSequence, List list, C2353 c2353, C13406 c13406, String str, C25012 c25012) {
        String string;
        int i;
        boolean[] zArr;
        C25012 c25013;
        boolean z;
        C3382 c3382;
        int i2;
        int i3;
        List list2;
        int i4;
        int i5;
        boolean[] zArr2;
        int i6;
        boolean z2;
        List list3;
        int i7;
        int i8;
        this.f65770 = charSequence;
        this.f65769 = list;
        this.f65767 = c25012;
        this.f65768 = new int[list.size()];
        this.f65766 = new int[list.size()];
        this.f65757 = new boolean[list.size()];
        this.f65763 = new boolean[list.size()];
        this.f65765 = new boolean[list.size()];
        this.f65758 = new boolean[list.size()];
        this.f65760 = new boolean[list.size()];
        this.f65755 = new boolean[list.size()];
        this.f65759 = new boolean[list.size()];
        this.f65762 = new boolean[list.size()];
        int iMax = Math.max(1, Math.min(16, c13406.m33047()));
        this.f65764 = iMax;
        if (c13406.m33049()) {
            string = "\t";
        } else {
            if (iMax < 0) {
                throw new IllegalArgumentException(C13645.m33382(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C14442.m34864(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i9 = 0; i9 < iMax; i9++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f65756 = string;
        this.f65761 = str;
        boolean[] zArr3 = this.f65760;
        boolean[] zArr4 = this.f65765;
        int[] iArr = this.f65768;
        boolean[] zArr5 = this.f65757;
        C25012 c25014 = this.f65767;
        boolean[] zArr6 = this.f65763;
        List list4 = this.f65769;
        int[] iArr2 = new int[list4.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C3382(c2353, 0, false));
        while (!arrayDeque.isEmpty()) {
            c25014.m55844();
            C3382 c3383 = (C3382) arrayDeque.pop();
            C7998 c7998 = c3383.f11020;
            int iMo1229 = c7998.mo1229();
            if (iMo1229 == 18) {
                this.f65766[c7998.f26549.mo23438()] = c7998.f26548.mo23440() + 1;
            }
            if ((iMo1229 == 3 || iMo1229 == 6) && c7998.f26549.getType() != 1) {
                zArr5[c7998.f26549.mo23438()] = true;
            }
            if (iMo1229 == 5 && c7998.getChildCount() > 0) {
                String text = c7998.mo9151(1).getText();
                if (!text.equals("const") && !text.equals("close")) {
                    throw new C21744(EnumC4590.SYNTAX, c7998.f26549.getLine(), c7998.f26549.mo23437(), "Unknown local attribute: ".concat(text));
                }
            }
            int childCount = c7998.getChildCount() - 1;
            while (childCount >= 0) {
                InterfaceC19383 interfaceC19383Mo9151 = c7998.mo9151(childCount);
                if (interfaceC19383Mo9151 instanceof C7998) {
                    C7998 c7999 = (C7998) interfaceC19383Mo9151;
                    int i10 = c3383.f11021;
                    c25013 = c25014;
                    zArr = zArr3;
                    if (c7999.mo1229() == 2 && iMo1229 != 1) {
                        int i11 = i10 + 1;
                        int iMo23438 = ((InterfaceC1484) c7998.mo9151(childCount - 1)).mo5285().mo23438();
                        int i12 = iMo23438 + 1;
                        int iMo23439 = ((InterfaceC1484) c7998.mo9151(childCount + 1)).mo5285().mo23438();
                        iArr2[i12] = iArr2[i12] + 1;
                        iArr2[iMo23439] = iArr2[iMo23439] - 1;
                        m47089(c7999, iMo23438, iMo23439);
                        i10 = i11;
                    } else if (c7999.mo1229() == 2) {
                        m47089(c7999, -1, list4.size() - 1);
                    }
                    int iMo12210 = c7999.mo1229();
                    arrayDeque.push(new C3382(c7999, i10, iMo12210 != 2 && (c3383.f11022 || iMo12210 == 12 || iMo12210 == 14 || iMo12210 == 11 || iMo12210 == 20 || iMo12210 == 10 || iMo12210 == 4 || iMo12210 == 9)));
                } else {
                    zArr = zArr3;
                    c25013 = c25014;
                    if (interfaceC19383Mo9151 instanceof InterfaceC1484) {
                        InterfaceC8743 interfaceC8743Mo5285 = ((InterfaceC1484) interfaceC19383Mo9151).mo5285();
                        int iMo234310 = interfaceC8743Mo5285.mo23438();
                        int type = interfaceC8743Mo5285.getType();
                        iArr[iMo234310] = c3383.f11021;
                        this.f65759[iMo234310] = c3383.f11022;
                        if (type == 6 || type == 13 || type == 12 || type == 9) {
                            z = true;
                            zArr5[iMo234310] = true;
                        } else {
                            z = true;
                        }
                        c3382 = c3383;
                        if (type == 30 && (iMo1229 == 17 || iMo1229 == 19)) {
                            zArr6[iMo234310] = z;
                        }
                        if (type == 47 && iMo1229 != 23) {
                            zArr6[iMo234310] = z;
                        }
                        if (iMo1229 == 5) {
                            if (type == 19) {
                                zArr4[iMo234310] = z;
                            }
                            if (type == 20) {
                                zArr6[iMo234310] = z;
                            }
                        }
                        if (iMo1229 == 12 && childCount == 0) {
                            if (type == 28 || type == 27 || type == 29) {
                                zArr4[iMo234310] = true;
                            } else {
                                i3 = 12;
                                i2 = 1;
                            }
                            if (iMo1229 == i3 && childCount == i2 && (c7998.mo9151(0) instanceof C3098)) {
                                zArr[iMo234310] = true;
                            }
                            if (iMo1229 == 15 && (type == 26 || type == 38)) {
                                zArr[iMo234310] = true;
                            }
                            if (type != 15 || iMo1229 == 24 || type == 2 || type == 21) {
                                this.f65755[iMo234310] = true;
                            }
                            if (iMo1229 != 24 || (type == 15 && (iMo1229 == 20 || ((iMo1229 == 10 && c7998.f9157.mo1229() == 20) || (iMo1229 == 11 && c7998.f9157.mo1229() == 17))))) {
                                list2 = this.f65769;
                                i4 = iMo234310;
                                while (true) {
                                    i5 = i4 + 1;
                                    zArr2 = zArr4;
                                    if (i4 + 2 >= list2.size() || ((InterfaceC8743) list2.get(i5)).mo23441() == 0) {
                                        break;
                                    }
                                    i4 = i5;
                                    zArr4 = zArr2;
                                }
                                m47088(iMo234310, i5, true, !m47090(((InterfaceC8743) list4.get(i5)).getType()));
                            } else {
                                zArr2 = zArr4;
                            }
                            if (m47093(type)) {
                                list3 = this.f65769;
                                i7 = iMo234310;
                                while (true) {
                                    i8 = i7 + 1;
                                    if (i7 + 2 >= list3.size() || ((InterfaceC8743) list3.get(i8)).mo23441() == 0) {
                                        break;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                m47088(iMo234310, i8, false, !m47090(((InterfaceC8743) list4.get(i8)).getType()));
                            } else if (m47090(type)) {
                                i6 = iMo234310;
                                do {
                                    i6--;
                                    if (i6 >= 0) {
                                        break;
                                    }
                                } while (((InterfaceC8743) list4.get(i6)).mo23441() != 0);
                                if (i6 >= 0 || m47093(((InterfaceC8743) list4.get(i6)).getType())) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                m47088(i6, iMo234310, z2, false);
                            }
                        }
                        i2 = 1;
                        i3 = 12;
                        if (iMo1229 == i3) {
                            zArr[iMo234310] = true;
                        }
                        if (iMo1229 == 15) {
                            zArr[iMo234310] = true;
                        }
                        if (type != 15) {
                            this.f65755[iMo234310] = true;
                        } else {
                            this.f65755[iMo234310] = true;
                        }
                        if (iMo1229 != 24) {
                            list2 = this.f65769;
                            i4 = iMo234310;
                            while (true) {
                                i5 = i4 + 1;
                                zArr2 = zArr4;
                                if (i4 + 2 >= list2.size()) {
                                    break;
                                }
                                break;
                                break;
                                i4 = i5;
                                zArr4 = zArr2;
                            }
                            m47088(iMo234310, i5, true, !m47090(((InterfaceC8743) list4.get(i5)).getType()));
                        } else {
                            list2 = this.f65769;
                            i4 = iMo234310;
                            while (true) {
                                i5 = i4 + 1;
                                zArr2 = zArr4;
                                if (i4 + 2 >= list2.size()) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                                i4 = i5;
                                zArr4 = zArr2;
                            }
                            m47088(iMo234310, i5, true, !m47090(((InterfaceC8743) list4.get(i5)).getType()));
                        }
                        if (m47093(type)) {
                            list3 = this.f65769;
                            i7 = iMo234310;
                            while (true) {
                                i8 = i7 + 1;
                                if (i7 + 2 >= list3.size()) {
                                    break;
                                }
                                break;
                                break;
                                i7 = i8;
                            }
                            m47088(iMo234310, i8, false, !m47090(((InterfaceC8743) list4.get(i8)).getType()));
                        } else if (m47090(type)) {
                            i6 = iMo234310;
                            do {
                                i6--;
                                if (i6 >= 0) {
                                    break;
                                    break;
                                }
                            } while (((InterfaceC8743) list4.get(i6)).mo23441() != 0);
                            if (i6 >= 0) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            m47088(i6, iMo234310, z2, false);
                        }
                    }
                    childCount--;
                    c25014 = c25013;
                    zArr3 = zArr;
                    c3383 = c3382;
                    zArr4 = zArr2;
                }
                zArr2 = zArr4;
                c3382 = c3383;
                childCount--;
                c25014 = c25013;
                zArr3 = zArr;
                c3383 = c3382;
                zArr4 = zArr2;
            }
        }
        C25012 c25015 = c25014;
        int i13 = 0;
        for (int i14 = 0; i14 < list4.size(); i14++) {
            if ((i14 & 1023) == 0) {
                c25015.m55844();
            }
            i13 += iArr2[i14];
            if (m47092((InterfaceC8743) list4.get(i14))) {
                iArr[i14] = i13;
            }
        }
        int i15 = 0;
        C15776 c15776 = (C15776) ((C23236) c2353.m21805(C23236.class, 0)).m21805(C15776.class, 0);
        List list5 = this.f65769;
        ArrayList arrayList = new ArrayList(c15776.m21803(C8319.class));
        if (((C9064) c15776.m21805(C9064.class, 0)) != null) {
            arrayList.add((C9064) c15776.m21805(C9064.class, 0));
        }
        int iMo234311 = 0;
        while (i15 < arrayList.size()) {
            this.f65767.m55844();
            C7998 c79910 = (C7998) arrayList.get(i15);
            i15++;
            int iMo234312 = i15 < arrayList.size() ? ((C7998) arrayList.get(i15)).f26549.mo23438() : list5.size();
            while (true) {
                if (iMo234311 >= iMo234312) {
                    i = 1;
                    break;
                } else {
                    if (m47092((InterfaceC8743) list5.get(iMo234311))) {
                        i = 1;
                        Arrays.fill(this.f65758, c79910.f26549.mo23438(), c79910.f26548.mo23438() + 1, true);
                        break;
                    }
                    iMo234311++;
                }
            }
            iMo234311 = c79910.f26548.mo23438() + i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47087(CharSequence charSequence, C25012 c25012) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                c25012.m55844();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int i2 = i + 1;
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) == (cCharAt != '\r' ? '\r' : '\n')) {
                        return cCharAt == '\r' ? "\r\n" : "\n\r";
                    }
                }
                return String.valueOf(cCharAt);
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47089(C7998 c7998, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < c7998.getChildCount(); i3++) {
            InterfaceC19383 interfaceC19383Mo9151 = c7998.mo9151(i3);
            if (interfaceC19383Mo9151 instanceof C7998) {
                C7998 c7999 = (C7998) interfaceC19383Mo9151;
                m47088(i, c7999.f26549.mo23438(), z, true);
                i = c7999.f26548.mo23438();
                z = true;
            }
        }
        m47088(i, i2, z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47088(int i, int i2, boolean z, boolean z2) {
        for (int i3 = i + 1; i3 <= i2; i3++) {
            this.f65767.m55844();
            if (((InterfaceC8743) this.f65769.get(i3)).getType() != 65) {
                if (z && (i3 != i2 || z2)) {
                    this.f65762[i3] = true;
                }
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47094(C11228 c11228, boolean z) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8743 interfaceC8743 : this.f65769) {
            if (interfaceC8743.getType() != 65 && interfaceC8743.getType() != -1) {
                arrayList.add(interfaceC8743);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        InterfaceC8743 interfaceC8744 = null;
        int i2 = 0;
        int iMo23440 = 0;
        while (true) {
            int size = arrayList.size();
            C25012 c25012 = this.f65767;
            if (i2 < size) {
                c25012.m55844();
                InterfaceC8743 interfaceC8745 = (InterfaceC8743) arrayList.get(i2);
                int iMo23438 = interfaceC8745.mo23438();
                int type = interfaceC8745.getType();
                int i3 = this.f65768[iMo23438];
                if (m47090(type)) {
                    arrayDeque.pop();
                }
                int i4 = arrayDeque.isEmpty() ? 0 : ((C23520) arrayDeque.peek()).f76005;
                int i5 = i3 + i4;
                int iMo23442 = interfaceC8745.mo23442();
                CharSequence charSequence = this.f65770;
                if (m47091(iMo23440, iMo23442, charSequence)) {
                    int iMo23443 = interfaceC8745.mo23442();
                    while (iMo23443 > iMo23440) {
                        int i6 = iMo23443 - 1;
                        if (charSequence.charAt(i6) == '\n' || charSequence.charAt(i6) == '\r') {
                            break;
                        } else {
                            iMo23443--;
                        }
                    }
                    i = iMo23443;
                } else {
                    i = -1;
                }
                boolean[] zArr = this.f65758;
                boolean z2 = zArr[iMo23438] || m47092(interfaceC8745) || (interfaceC8744 != null && (zArr[interfaceC8744.mo23438()] || m47092(interfaceC8744)));
                String str2 = "";
                if (interfaceC8744 == null || interfaceC8744.getType() == 67) {
                    str = str2;
                } else {
                    int type2 = interfaceC8744.getType();
                    int type3 = interfaceC8745.getType();
                    if (m47092(interfaceC8745)) {
                        str2 = EnumC7687.f25319;
                    } else if ((type2 == 28 && type3 == 28) || (type2 == 47 && (type3 == 47 || type3 == 59))) {
                        str2 = " ";
                    } else if (type3 != 15 && type3 != 1 && !m47090(type3) && type3 != 26 && type3 != 38 && type2 != 26 && type2 != 38 && !m47093(type2) && type2 != 22 && type3 != 22 && !this.f65763[interfaceC8745.mo23438()] && !this.f65765[interfaceC8744.mo23438()]) {
                        str = " ";
                    }
                    str = str2;
                }
                boolean[] zArr2 = this.f65757;
                arrayList2.add(new C1607(interfaceC8745.mo23442(), interfaceC8745.mo23440() + 1, type, i5, i, str, (interfaceC8744 == null || interfaceC8744.getType() == 67 || !zArr2[iMo23438] || z2) ? false : true, z2, this.f65760[iMo23438] || (interfaceC8744 != null && this.f65755[interfaceC8744.mo23438()]), this.f65759[iMo23438] && !zArr2[iMo23438], this.f65766[iMo23438], this.f65762[iMo23438]));
                if (m47093(type)) {
                    arrayDeque.push(new C23520(i4 + 1));
                }
                iMo23440 = interfaceC8745.mo23440() + 1;
                i2++;
                interfaceC8744 = interfaceC8745;
            } else {
                new C11301(this.f65770, arrayList2, this.f65756, this.f65761, this.f65764, c25012, c11228).m28562(z);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47092(InterfaceC8743 interfaceC8743) {
        return interfaceC8743.getType() == 64 || interfaceC8743.getType() == 66;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47091(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if ((i & 1023) == 0) {
                C18870.m43769();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            i++;
        }
        return false;
    }
}
