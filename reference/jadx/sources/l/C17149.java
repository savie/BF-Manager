package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17149 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f54689;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f54690;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f54691;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54692;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f54693;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f54694;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21493 f54695;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f54696;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean[] f54697;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1031 f54698;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54699;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f54700;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f54701;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f54702;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f54703;

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0440  */
    public C17149(CharSequence charSequence, List list, C23289 c23289, C21493 c21493) {
        Iterator it;
        boolean[] zArr;
        int[] iArr;
        int i;
        C17149 c17149 = this;
        c17149.f54692 = new ArrayList();
        c17149.f54703 = new ArrayList();
        c17149.f54699 = new ArrayList();
        c17149.f54701 = charSequence;
        c17149.f54700 = list;
        c17149.f54695 = c21493;
        c17149.f54698 = new C1031(c23289, list.size(), c21493);
        int i2 = 1;
        c17149.f54696 = new int[Character.codePointCount(charSequence, 0, charSequence.length()) + 1];
        int i3 = 0;
        int iCharCount = 0;
        while (true) {
            int[] iArr2 = c17149.f54696;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = iCharCount;
            if (iCharCount < charSequence.length()) {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
            }
            i3++;
        }
        int i4 = 1;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (charSequence.charAt(i5) == '\n') {
                i4++;
            }
        }
        c17149.f54689 = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (charSequence.charAt(i7) == '\n') {
                c17149.f54689[i6] = i7 + 1;
                i6++;
            }
        }
        c17149.f54694 = new int[i4];
        c17149.f54691 = new int[i4];
        int[] iArr3 = new int[i4];
        c17149.f54702 = iArr3;
        c17149.f54693 = new boolean[i4];
        c17149.f54690 = new boolean[i4];
        c17149.f54697 = new boolean[i4];
        Arrays.fill(iArr3, -1);
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = c17149.f54689[i8];
            if (i9 == 0 && C21460.m48082(charSequence, false, 0, "\ufeff", 1)) {
                i9++;
            }
            int i10 = 0;
            while (i9 < charSequence.length()) {
                char cCharAt = charSequence.charAt(i9);
                if (cCharAt == ' ') {
                    i10++;
                } else if (cCharAt == '\t') {
                    i10 = (8 - (i10 % 8)) + i10;
                } else if (cCharAt != '\f') {
                    break;
                } else {
                    i10 = 0;
                }
                i9++;
            }
            c17149.f54694[i8] = i9;
            c17149.f54691[i8] = i10;
        }
        C12895 c12895 = (C12895) c23289;
        int[] iArr4 = c17149.f54696;
        List list2 = c17149.f54700;
        if (((C0132) c12895.m51374(C0132.class, 0)) != null) {
            for (C19889 c19889 : ((C0132) c12895.m51374(C0132.class, 0)).m51372(C19889.class)) {
                int iMo22511 = c19889.f75537.mo22511();
                while (iMo22511 >= c19889.f75536.mo22511()) {
                    InterfaceC19761 interfaceC19761 = (InterfaceC19761) list2.get(iMo22511);
                    if (interfaceC19761.mo22512() == 0 && !C8794.m22912(interfaceC19761.getType())) {
                        break;
                    } else {
                        iMo22511--;
                    }
                }
                if (iMo22511 >= c19889.f75536.mo22511()) {
                    c17149.f54699.add(new C12211(iArr4[c19889.f75536.mo22508()], iArr4[((InterfaceC19761) list2.get(iMo22511)).mo22510() + 1]));
                }
            }
        }
        int[] iArr5 = c17149.f54696;
        List list3 = c17149.f54700;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list3.size()) {
            c17149.f54695.m48131();
            InterfaceC19761 interfaceC19762 = (InterfaceC19761) list3.get(i12);
            int type = interfaceC19762.getType();
            if (type == 2) {
                i11++;
            } else if (type == 3) {
                i11--;
            }
            if (C8794.m22912(type) || type == 104 || type == i2) {
                i = 1;
            } else {
                int i13 = c17149.f54698.f4815[i12];
                int i14 = i13 > i12 ? i13 : i12;
                InterfaceC19761 interfaceC19763 = (InterfaceC19761) list3.get(i14);
                if (interfaceC19762.mo22508() < 0 || interfaceC19763.mo22510() < interfaceC19762.mo22508()) {
                    i = 1;
                } else {
                    int i15 = iArr5[interfaceC19762.mo22508()];
                    int i16 = iArr5[interfaceC19763.mo22510() + i2];
                    int iBinarySearch = Arrays.binarySearch(c17149.f54689, i15);
                    C19972 c19972 = new C19972(i12, i14, type, i15, i16, iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch, i11);
                    c17149.f54692.add(c19972);
                    if (type != 105) {
                        i = 1;
                    } else {
                        int iBinarySearch2 = Arrays.binarySearch(c17149.f54689, i16);
                        if ((iBinarySearch2 < 0 ? (-iBinarySearch2) - 2 : iBinarySearch2) > c19972.f63940) {
                            boolean[] zArr2 = c17149.f54693;
                            int iBinarySearch3 = Arrays.binarySearch(c17149.f54689, i16);
                            i = 1;
                            zArr2[iBinarySearch3 < 0 ? (-iBinarySearch3) - 2 : iBinarySearch3] = true;
                        } else {
                            i = 1;
                        }
                    }
                    i12 = i14;
                }
            }
            i12 += i;
            i2 = 1;
        }
        CharSequence charSequence2 = c17149.f54701;
        ArrayList arrayList = c17149.f54703;
        int[] iArr6 = c17149.f54689;
        int[] iArr7 = c17149.f54691;
        boolean[] zArr3 = c17149.f54690;
        boolean[] zArr4 = c17149.f54693;
        boolean[] zArr5 = c17149.f54697;
        int[] iArr8 = c17149.f54702;
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it2 = c17149.f54692.iterator();
        int i17 = -1;
        while (it2.hasNext()) {
            C19972 c19973 = (C19972) it2.next();
            c17149.f54695.m48131();
            boolean z = c17149.f54694[c19973.f63940] == c19973.f63943;
            int i18 = c19973.f63937;
            int i19 = (i18 == 15 || i18 == 16 || i18 == 17) ? 1 : 0;
            if (!z || zArr4[c19973.f63940]) {
                it = it2;
            } else if (!arrayDeque.isEmpty()) {
                iArr8[c19973.f63940] = ((C0215) arrayDeque.peek()).f1392 + (i19 ^ 1);
                it = it2;
            } else {
                it = it2;
                if (c19973.f63937 == 103) {
                    zArr3[c19973.f63940] = true;
                } else {
                    iArr8[c19973.f63940] = c19973.f63938;
                    zArr5[c19973.f63940] = true;
                }
            }
            String strTrim = c19973.f63937 == 103 ? C21460.m48081(c19973.f63943, c19973.f63939, c17149.f54701).trim() : "";
            if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                if (z && iArr7[c19973.f63940] == 0 && arrayDeque.isEmpty() && !zArr4[c19973.f63940]) {
                    int i20 = c19973.f63943;
                    ArrayList arrayList2 = c17149.f54699;
                    int size = arrayList2.size();
                    zArr = zArr4;
                    int i21 = 0;
                    while (i21 < size) {
                        int i22 = size;
                        size = (i21 + size) >>> 1;
                        int[] iArr9 = iArr7;
                        if (((C12211) arrayList2.get(size)).f40816 <= i20) {
                            i21 = size + 1;
                            size = i22;
                        }
                        iArr7 = iArr9;
                    }
                    iArr = iArr7;
                    if (i21 >= arrayList2.size() || ((C12211) arrayList2.get(i21)).f40817 >= i20) {
                        if (strTrim.equals("# fmt: off")) {
                            if (i17 >= 0) {
                                throw C8794.m22909(EnumC19377.DIRECTIVE, "Nested format directives");
                            }
                            i17 = iArr6[c19973.f63940];
                        } else {
                            if (i17 < 0) {
                                throw C8794.m22909(EnumC19377.DIRECTIVE, "Unmatched format directive");
                            }
                            int i23 = c19973.f63940 + 1;
                            arrayList.add(new C12211(i17, i23 < iArr6.length ? iArr6[i23] : charSequence2.length()));
                            i17 = -1;
                        }
                    }
                }
                throw C8794.m22909(EnumC19377.DIRECTIVE, "Unsafe format directive boundary");
            }
            iArr = iArr7;
            zArr = zArr4;
            int i24 = c19973.f63937;
            if (i24 == 12 || i24 == 13 || i24 == 14) {
                arrayDeque.push(new C0215(iArr8[c19973.f63940] >= 0 ? iArr8[c19973.f63940] : c19973.f63938 + arrayDeque.size()));
            } else if (i19 != 0 && !arrayDeque.isEmpty()) {
                arrayDeque.pop();
            }
            c17149 = this;
            it2 = it;
            iArr7 = iArr;
            zArr3 = zArr3;
            zArr4 = zArr;
        }
        int[] iArr10 = iArr7;
        boolean[] zArr6 = zArr3;
        if (i17 >= 0) {
            arrayList.add(new C12211(i17, charSequence2.length()));
        }
        int[] iArr11 = new int[iArr8.length];
        int i25 = -1;
        for (int length = iArr8.length - 1; length >= 0; length--) {
            iArr11[length] = i25;
            if (zArr5[length]) {
                i25 = length;
            }
        }
        int i26 = -1;
        for (int i27 = 0; i27 < iArr8.length; i27++) {
            if (zArr6[i27]) {
                int i28 = iArr11[i27];
                int i29 = iArr10[i27];
                if (i29 == 0) {
                    iArr8[i27] = 0;
                } else {
                    int i30 = (i26 < 0 || iArr10[i26] != 0) ? i26 : -1;
                    if (i28 >= 0 && iArr10[i28] == 0) {
                        i28 = -1;
                    }
                    if (i30 < 0) {
                        i30 = i28;
                    } else if (i28 >= 0) {
                        int i31 = iArr10[i30];
                        int i32 = iArr10[i28];
                        if (i29 >= Math.min(i31, i32) ? i31 > i29 || (i32 <= i29 && i31 <= i32) : i31 >= i32) {
                            i30 = i28;
                        }
                    }
                    if (i30 >= 0) {
                        iArr8[i27] = iArr8[i30];
                    }
                }
            } else if (zArr5[i27]) {
                i26 = i27;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40077(boolean z, int i, C18503 c18503) {
        CharSequence charSequence;
        C21493 c21493;
        List list;
        C1031 c1031;
        ArrayList arrayList;
        C21493 c21494;
        String strM48081;
        int i2;
        ArrayList<C16444> arrayList2 = new ArrayList();
        char c = ' ';
        String strM18454 = z ? "\t" : C6851.m18454(' ', i);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f54702;
            int length = iArr.length;
            charSequence = this.f54701;
            c21493 = this.f54695;
            if (i3 >= length) {
                break;
            }
            c21493.m48131();
            if (iArr[i3] >= 0 && !this.f54693[i3]) {
                int i4 = this.f54689[i3];
                if (i4 == 0 && C21460.m48082(charSequence, false, 0, "\ufeff", 1)) {
                    i4++;
                }
                m40075(arrayList2, i4, this.f54694[i3], C6851.m18455(iArr[i3], strM18454));
            }
            i3++;
        }
        ArrayList arrayList3 = this.f54692;
        Iterator it = arrayList3.iterator();
        C19972 c19972 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f54700;
            c1031 = this.f54698;
            if (!zHasNext) {
                break;
            }
            C19972 c19973 = (C19972) it.next();
            c21493.m48131();
            if (c19972 == null) {
                arrayList = arrayList3;
                it = it;
                c21494 = c21493;
                break;
                break;
            }
            int i5 = c19972.f63939;
            int i6 = c19973.f63943;
            while (true) {
                if (i5 >= i6) {
                    if (c19972.f63937 != 103 && c19972.f63937 != 105 && c19973.f63937 != 105) {
                        int i7 = c19972.f63939;
                        int i8 = c19973.f63943;
                        if (c19973.f63937 == 103) {
                            strM48081 = EnumC19730.f63352;
                            arrayList = arrayList3;
                            c21494 = c21493;
                        } else {
                            String strM48082 = c19972.f63939 - c19972.f63943 <= 8 ? C21460.m48081(c19972.f63943, c19972.f63939, charSequence) : "";
                            String strM48083 = c19973.f63939 - c19973.f63943 <= 8 ? C21460.m48081(c19973.f63943, c19973.f63939, charSequence) : "";
                            if ((strM48082.equals(".") || strM48082.equals("...")) && (strM48083.equals(".") || strM48083.equals("..."))) {
                                arrayList2 = arrayList2;
                                arrayList = arrayList3;
                                c21494 = c21493;
                                strM48081 = C21460.m48081(c19972.f63939, c19973.f63943, charSequence);
                            } else {
                                if (strM48083.equals(",")) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList3;
                                    if (!strM48083.equals(l.b)) {
                                        c21494 = c21493;
                                        if (strM48083.equals(":")) {
                                            arrayList2 = arrayList2;
                                        } else {
                                            int i9 = c19973.f63937;
                                            arrayList2 = arrayList2;
                                            if (i9 != 15 && i9 != 16 && i9 != 17 && (strM48082.equals(",") || strM48082.equals(l.b) || (!c1031.f4814[c19972.f63941] && !c1031.f4812[c19973.f63942] && (i2 = c19972.f63937) != 12 && i2 != 13 && i2 != 14 && (strM48082.equals(".") || strM48083.equals(".") ? strM48082.equals("from") || strM48083.equals("import") || c19972.f63937 == 100 : !strM48082.equals("...") || (!strM48083.equals(".") && ((InterfaceC19761) list.get(c19973.f63942)).getType() != 99))))) {
                                                strM48081 = " ";
                                            }
                                        }
                                        strM48081 = "";
                                    }
                                }
                                c21494 = c21493;
                                strM48081 = "";
                            }
                            arrayList2 = arrayList2;
                        }
                        m40075(arrayList2, i7, i8, strM48081);
                        break;
                    }
                } else {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt == c || cCharAt == '\t' || cCharAt == '\f') {
                        i5++;
                        c = ' ';
                    }
                }
                arrayList = arrayList3;
                it = it;
                c21494 = c21493;
                break;
            }
            c = ' ';
            c19972 = c19973;
            it = it;
            arrayList3 = arrayList;
            c21493 = c21494;
        }
        ArrayList<C19972> arrayList4 = arrayList3;
        C21493 c21495 = c21493;
        C23846.sort(arrayList2, new C15739());
        C18503 c18503M42895 = c18503.m42895();
        try {
            int i10 = 0;
            for (C16444 c16444 : arrayList2) {
                c21495.m48131();
                if (c16444.f52875 < i10) {
                    throw C8794.m22909(EnumC19377.CHANGED, "Overlapping whitespace edits");
                }
                c18503M42895.m42896(i10, c16444.f52875, charSequence);
                c18503M42895.append((CharSequence) c16444.f52876);
                i10 = c16444.f52874;
            }
            c18503M42895.m42896(i10, charSequence.length(), charSequence);
            if (c18503M42895.length() > 1048576) {
                throw C8794.m22909(EnumC19377.LIMIT, "Formatted source length limit exceeded");
            }
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            boolean[] zArr = new boolean[list.size()];
            int i11 = 0;
            boolean z2 = false;
            for (int i12 = 0; i12 < list.size(); i12++) {
                c21495.m48131();
                InterfaceC19761 interfaceC19761 = (InterfaceC19761) list.get(i12);
                if (interfaceC19761.getType() == 103) {
                    z2 = true;
                }
                if (interfaceC19761.getType() == -1 || (interfaceC19761.getType() == 102 && interfaceC19761.mo22512() == 0)) {
                    if (z2) {
                        Arrays.fill(zArr, i11, i12 + 1, true);
                    }
                    i11 = i12 + 1;
                    z2 = false;
                }
            }
            int i13 = 0;
            int length2 = 0;
            for (C19972 c19974 : arrayList4) {
                c21495.m48131();
                while (i13 < arrayList2.size() && ((C16444) arrayList2.get(i13)).f52874 <= c19974.f63943) {
                    int i14 = i13 + 1;
                    C16444 c16445 = (C16444) arrayList2.get(i13);
                    length2 += c16445.f52876.length() - (c16445.f52874 - c16445.f52875);
                    i13 = i14;
                }
                arrayList5.add(new C15850(c19974.f63943 + length2, c19974.f63939 + length2, c19974.f63937, c1031.f4813[c19974.f63942], zArr[c19974.f63942] || m40076(c19974.f63943, c19974.f63939)));
            }
            new C20083(c18503M42895, arrayList5, this.f54695, z, i, c18503).m45459();
            c18503M42895.close();
        } catch (Throwable th) {
            try {
                c18503M42895.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40075(ArrayList arrayList, int i, int i2, String str) {
        if ((C21460.m48082(this.f54701, false, i, str, str.length()) && i2 - i == str.length()) || m40076(i, i2)) {
            return;
        }
        arrayList.add(new C16444(i, i2, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40076(int i, int i2) {
        ArrayList arrayList = this.f54703;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C12211) arrayList.get(i4)).f40816 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        if (i3 < arrayList.size()) {
            C12211 c12211 = (C12211) arrayList.get(i3);
            if (i >= c12211.f40817 || i2 > c12211.f40817) {
                return true;
            }
        }
        return false;
    }
}
