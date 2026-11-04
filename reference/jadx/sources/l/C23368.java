package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes.dex */
public final class C23368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f75653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75654;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f75655;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5049 f75656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f75657;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f75658;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f75659;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75660;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1298 f75661;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f75662;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean[] f75663;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f75664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f75665;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f75666;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f75667;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52532(int i) {
        return i == 15 || i == 16 || i == 17;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m52535(int i) {
        return i == 12 || i == 13 || i == 14;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:219:0x042d  */
    public C23368(CharSequence charSequence, List list, C7998 c7998, C5049 c5049) {
        Iterator it;
        boolean[] zArr;
        int[] iArr;
        int i;
        C23368 c23368 = this;
        c23368.f75654 = new ArrayList();
        c23368.f75667 = new ArrayList();
        c23368.f75660 = new ArrayList();
        c23368.f75662 = charSequence;
        c23368.f75666 = list;
        c23368.f75656 = c5049;
        c23368.f75661 = new C1298(c7998, list.size(), c5049);
        int i2 = 1;
        c23368.f75655 = new int[Character.codePointCount(charSequence, 0, charSequence.length()) + 1];
        int i3 = 0;
        int iCharCount = 0;
        while (true) {
            int[] iArr2 = c23368.f75655;
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
        c23368.f75658 = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (charSequence.charAt(i7) == '\n') {
                c23368.f75658[i6] = i7 + 1;
                i6++;
            }
        }
        c23368.f75657 = new int[i4];
        c23368.f75653 = new int[i4];
        int[] iArr3 = new int[i4];
        c23368.f75659 = iArr3;
        c23368.f75663 = new boolean[i4];
        c23368.f75665 = new boolean[i4];
        c23368.f75664 = new boolean[i4];
        Arrays.fill(iArr3, -1);
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = c23368.f75658[i8];
            if (i9 == 0 && C18856.m43750(charSequence, false, 0, "\ufeff", 1)) {
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
            c23368.f75657[i8] = i9;
            c23368.f75653[i8] = i10;
        }
        C9478 c9478 = (C9478) c7998;
        int[] iArr4 = c23368.f75655;
        List list2 = c23368.f75666;
        if (((C16828) c9478.m21805(C16828.class, 0)) != null) {
            for (C25034 c25034 : ((C16828) c9478.m21805(C16828.class, 0)).m21803(C25034.class)) {
                int iMo23438 = c25034.f26548.mo23438();
                while (iMo23438 >= c25034.f26549.mo23438()) {
                    InterfaceC8743 interfaceC8743 = (InterfaceC8743) list2.get(iMo23438);
                    if (interfaceC8743.mo23441() == 0 && !C15489.m37054(interfaceC8743.getType())) {
                        break;
                    } else {
                        iMo23438--;
                    }
                }
                if (iMo23438 >= c25034.f26549.mo23438()) {
                    c23368.f75660.add(new C15908(iArr4[c25034.f26549.mo23442()], iArr4[((InterfaceC8743) list2.get(iMo23438)).mo23440() + 1]));
                }
            }
        }
        int[] iArr5 = c23368.f75655;
        List list3 = c23368.f75666;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list3.size()) {
            c23368.f75656.m15284();
            InterfaceC8743 interfaceC8744 = (InterfaceC8743) list3.get(i12);
            int type = interfaceC8744.getType();
            if (type == 2) {
                i11++;
            } else if (type == 3) {
                i11--;
            }
            if (C15489.m37054(type) || type == 104 || type == i2) {
                i = 1;
            } else {
                int i13 = c23368.f75661.f4640[i12];
                int i14 = i13 > i12 ? i13 : i12;
                InterfaceC8743 interfaceC8745 = (InterfaceC8743) list3.get(i14);
                if (interfaceC8744.mo23442() < 0 || interfaceC8745.mo23440() < interfaceC8744.mo23442()) {
                    i = 1;
                } else {
                    int i15 = iArr5[interfaceC8744.mo23442()];
                    int i16 = iArr5[interfaceC8745.mo23440() + i2];
                    int iBinarySearch = Arrays.binarySearch(c23368.f75658, i15);
                    C24860 c24860 = new C24860(i12, i14, type, i15, i16, iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch, i11);
                    c23368.f75654.add(c24860);
                    if (type != 105) {
                        i = 1;
                    } else {
                        int iBinarySearch2 = Arrays.binarySearch(c23368.f75658, i16);
                        if ((iBinarySearch2 < 0 ? (-iBinarySearch2) - 2 : iBinarySearch2) > c24860.f80464) {
                            boolean[] zArr2 = c23368.f75663;
                            int iBinarySearch3 = Arrays.binarySearch(c23368.f75658, i16);
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
        CharSequence charSequence2 = c23368.f75662;
        ArrayList arrayList = c23368.f75667;
        int[] iArr6 = c23368.f75658;
        int[] iArr7 = c23368.f75653;
        boolean[] zArr3 = c23368.f75665;
        boolean[] zArr4 = c23368.f75663;
        boolean[] zArr5 = c23368.f75664;
        int[] iArr8 = c23368.f75659;
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it2 = c23368.f75654.iterator();
        int i17 = -1;
        while (it2.hasNext()) {
            C24860 c24861 = (C24860) it2.next();
            c23368.f75656.m15284();
            boolean z = c23368.f75657[c24861.f80464] == c24861.f80463;
            boolean zM52532 = m52532(c24861.f80462);
            if (!z || zArr4[c24861.f80464]) {
                it = it2;
            } else if (!arrayDeque.isEmpty()) {
                iArr8[c24861.f80464] = ((C16654) arrayDeque.peek()).f53801 + (!zM52532 ? 1 : 0);
                it = it2;
            } else {
                it = it2;
                if (c24861.f80462 == 103) {
                    zArr3[c24861.f80464] = true;
                } else {
                    iArr8[c24861.f80464] = c24861.f80466;
                    zArr5[c24861.f80464] = true;
                }
            }
            String strTrim = c24861.f80462 == 103 ? C18856.m43743(c24861.f80463, c24861.f80460, c23368.f75662).trim() : "";
            if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                if (z && iArr7[c24861.f80464] == 0 && arrayDeque.isEmpty() && !zArr4[c24861.f80464]) {
                    int i18 = c24861.f80463;
                    ArrayList arrayList2 = c23368.f75660;
                    int size = arrayList2.size();
                    zArr = zArr4;
                    int i19 = 0;
                    while (i19 < size) {
                        int i20 = size;
                        size = (i19 + size) >>> 1;
                        int[] iArr9 = iArr7;
                        if (((C15908) arrayList2.get(size)).f51678 <= i18) {
                            i19 = size + 1;
                            size = i20;
                        }
                        iArr7 = iArr9;
                    }
                    iArr = iArr7;
                    if (i19 >= arrayList2.size() || ((C15908) arrayList2.get(i19)).f51679 >= i18) {
                        if (strTrim.equals("# fmt: off")) {
                            if (i17 >= 0) {
                                throw C15489.m37050(EnumC19965.DIRECTIVE, "Nested format directives");
                            }
                            i17 = iArr6[c24861.f80464];
                        } else {
                            if (i17 < 0) {
                                throw C15489.m37050(EnumC19965.DIRECTIVE, "Unmatched format directive");
                            }
                            int i21 = c24861.f80464 + 1;
                            arrayList.add(new C15908(i17, i21 < iArr6.length ? iArr6[i21] : charSequence2.length()));
                            i17 = -1;
                        }
                    }
                }
                throw C15489.m37050(EnumC19965.DIRECTIVE, "Unsafe format directive boundary");
            }
            iArr = iArr7;
            zArr = zArr4;
            if (m52535(c24861.f80462)) {
                arrayDeque.push(new C16654(iArr8[c24861.f80464] >= 0 ? iArr8[c24861.f80464] : c24861.f80466 + arrayDeque.size()));
            } else if (zM52532 && !arrayDeque.isEmpty()) {
                arrayDeque.pop();
            }
            c23368 = this;
            it2 = it;
            iArr7 = iArr;
            zArr3 = zArr3;
            zArr4 = zArr;
        }
        int[] iArr10 = iArr7;
        boolean[] zArr6 = zArr3;
        if (i17 >= 0) {
            arrayList.add(new C15908(i17, charSequence2.length()));
        }
        int[] iArr11 = new int[iArr8.length];
        int i22 = -1;
        for (int length = iArr8.length - 1; length >= 0; length--) {
            iArr11[length] = i22;
            if (zArr5[length]) {
                i22 = length;
            }
        }
        int i23 = -1;
        for (int i24 = 0; i24 < iArr8.length; i24++) {
            if (zArr6[i24]) {
                int i25 = iArr11[i24];
                int i26 = iArr10[i24];
                if (i26 == 0) {
                    iArr8[i24] = 0;
                } else {
                    int i27 = (i23 < 0 || iArr10[i23] != 0) ? i23 : -1;
                    if (i25 >= 0 && iArr10[i25] == 0) {
                        i25 = -1;
                    }
                    if (i27 < 0) {
                        i27 = i25;
                    } else if (i25 >= 0) {
                        int i28 = iArr10[i27];
                        int i29 = iArr10[i25];
                        if (i26 >= Math.min(i28, i29) ? i28 > i26 || (i29 <= i26 && i28 <= i29) : i28 >= i29) {
                            i27 = i25;
                        }
                    }
                    if (i27 >= 0) {
                        iArr8[i24] = iArr8[i27];
                    }
                }
            } else if (zArr5[i24]) {
                i23 = i24;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0301  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52537(boolean z, int i, boolean z2, C11228 c11228) {
        C5049 c5049;
        CharSequence charSequence;
        List list;
        C1298 c1298;
        boolean z3;
        ArrayList arrayList;
        Iterator it;
        C5049 c50410;
        String strM43743;
        ArrayList<C17400> arrayList2 = new ArrayList();
        char c = ' ';
        String strM54280 = z ? "\t" : C24276.m54280(' ', i);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f75659;
            int length = iArr.length;
            c5049 = this.f75656;
            charSequence = this.f75662;
            if (i2 >= length) {
                break;
            }
            c5049.m15284();
            if (iArr[i2] >= 0 && !this.f75663[i2]) {
                int i3 = this.f75658[i2];
                if (i3 == 0 && C18856.m43750(charSequence, false, 0, "\ufeff", 1)) {
                    i3++;
                }
                m52530(arrayList2, i3, this.f75657[i2], C24276.m54281(iArr[i2], strM54280));
            }
            i2++;
        }
        ArrayList arrayList3 = this.f75654;
        Iterator it2 = arrayList3.iterator();
        C24860 c24860 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            list = this.f75666;
            c1298 = this.f75661;
            if (!zHasNext) {
                break;
            }
            C24860 c24861 = (C24860) it2.next();
            c5049.m15284();
            if (c24860 == null) {
                arrayList = arrayList3;
                it = it2;
                c50410 = c5049;
                break;
                break;
            }
            int i4 = c24860.f80460;
            int i5 = c24861.f80463;
            while (true) {
                if (i4 >= i5) {
                    if (c24860.f80462 != 103 && c24860.f80462 != 105 && c24861.f80462 != 105) {
                        int i6 = c24860.f80460;
                        int i7 = c24861.f80463;
                        if (c24861.f80462 == 103) {
                            strM43743 = EnumC7687.f25319;
                            arrayList = arrayList3;
                            it = it2;
                            c50410 = c5049;
                        } else {
                            String strM43744 = c24860.f80460 - c24860.f80463 <= 8 ? C18856.m43743(c24860.f80463, c24860.f80460, charSequence) : "";
                            it = it2;
                            String strM43745 = c24861.f80460 - c24861.f80463 <= 8 ? C18856.m43743(c24861.f80463, c24861.f80460, charSequence) : "";
                            if ((strM43744.equals(".") || strM43744.equals("...")) && (strM43745.equals(".") || strM43745.equals("..."))) {
                                arrayList = arrayList3;
                                c50410 = c5049;
                                strM43743 = C18856.m43743(c24860.f80460, c24861.f80463, charSequence);
                            } else {
                                if (strM43745.equals(",")) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList3;
                                    if (!strM43745.equals(l.b)) {
                                        c50410 = c5049;
                                        if (!strM43745.equals(":") && !m52532(c24861.f80462) && (strM43744.equals(",") || strM43744.equals(l.b) || (!c1298.f4639[c24860.f80461] && !c1298.f4638[c24861.f80465] && !m52535(c24860.f80462) && (strM43744.equals(".") || strM43745.equals(".") ? strM43744.equals("from") || strM43745.equals("import") || c24860.f80462 == 100 : !strM43744.equals("...") || (!strM43745.equals(".") && ((InterfaceC8743) list.get(c24861.f80465)).getType() != 99))))) {
                                            strM43743 = " ";
                                        }
                                    }
                                    strM43743 = "";
                                }
                                c50410 = c5049;
                                strM43743 = "";
                            }
                        }
                        m52530(arrayList2, i6, i7, strM43743);
                        break;
                    }
                } else {
                    char cCharAt = charSequence.charAt(i4);
                    if (cCharAt == c || cCharAt == '\t' || cCharAt == '\f') {
                        i4++;
                        c = ' ';
                    }
                }
                arrayList = arrayList3;
                it = it2;
                c50410 = c5049;
                break;
            }
            c = ' ';
            c24860 = c24861;
            it2 = it;
            arrayList3 = arrayList;
            c5049 = c50410;
        }
        ArrayList arrayList4 = arrayList3;
        C5049 c50411 = c5049;
        C12884.sort(arrayList2, new C11433());
        C11228 c11228M28291 = c11228.m28291();
        try {
            int i8 = 0;
            for (C17400 c17400 : arrayList2) {
                c50411.m15284();
                if (c17400.f56570 < i8) {
                    throw C15489.m37050(EnumC19965.CHANGED, "Overlapping whitespace edits");
                }
                c11228M28291.m28292(i8, c17400.f56570, charSequence);
                c11228M28291.append((CharSequence) c17400.f56571);
                i8 = c17400.f56569;
            }
            c11228M28291.m28292(i8, charSequence.length(), charSequence);
            if (c11228M28291.length() > 1048576) {
                throw C15489.m37050(EnumC19965.LIMIT, "Formatted source length limit exceeded");
            }
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            boolean[] zArr = new boolean[list.size()];
            int i9 = 0;
            boolean z4 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                c50411.m15284();
                InterfaceC8743 interfaceC8743 = (InterfaceC8743) list.get(i10);
                if (interfaceC8743.getType() == 103) {
                    z4 = true;
                }
                if (interfaceC8743.getType() == -1 || (interfaceC8743.getType() == 102 && interfaceC8743.mo23441() == 0)) {
                    if (z4) {
                        Arrays.fill(zArr, i9, i10 + 1, true);
                    }
                    i9 = i10 + 1;
                    z4 = false;
                }
            }
            boolean[] zArrM52536 = m52536();
            int iM52529 = m52529();
            int i11 = 0;
            int length2 = 0;
            int i12 = 0;
            C24860 c24862 = null;
            while (i11 < arrayList4.size()) {
                ArrayList arrayList6 = arrayList4;
                C24860 c24863 = (C24860) arrayList6.get(i11);
                c50411.m15284();
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        arrayList4 = arrayList6;
                        break;
                    }
                    arrayList4 = arrayList6;
                    if (((C17400) arrayList2.get(i12)).f56569 > c24863.f80463) {
                        break;
                    }
                    int i13 = i12 + 1;
                    C17400 c17401 = (C17400) arrayList2.get(i12);
                    length2 += c17401.f56571.length() - (c17401.f56569 - c17401.f56570);
                    i12 = i13;
                    arrayList6 = arrayList4;
                }
                if (i11 <= iM52529) {
                    z3 = true;
                } else if (m52533(c24862 == null ? 0 : c24862.f80460, c24863.f80463) || c24863.f80462 == 105 || (c24862 != null && c24862.f80462 == 105)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList5.add(new C11760(c24863.f80463 + length2, c24863.f80460 + length2, c24863.f80462, c1298.f4641[c24863.f80465], zArr[c24863.f80465] || m52533(c24863.f80463, c24863.f80460), zArrM52536[i11], z3));
                i11++;
                c24862 = c24863;
            }
            new C25187(c11228M28291, arrayList5, this.f75656, z, i, c11228).m56152(z2, m52533(c24862 == null ? 0 : c24862.f80460, charSequence.length()));
            c11228M28291.close();
        } catch (Throwable th) {
            try {
                c11228M28291.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m52529() {
        int i = -1;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f75654;
            if (i2 >= arrayList.size() || !m52534((C24860) arrayList.get(i2))) {
                break;
            }
            this.f75656.m15284();
            C24860 c24860 = (C24860) arrayList.get(i2);
            String strM43743 = C18856.m43743(c24860.f80463, c24860.f80460, this.f75662);
            if (strM43743.startsWith("#!") || strM43743.contains("coding:") || strM43743.contains("coding=")) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean[] m52536() {
        ArrayList arrayList = this.f75654;
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        int[] iArr = new int[size];
        int i = size;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            iArr[i2] = i;
            if (!m52534((C24860) arrayList.get(i2))) {
                i = i2;
            }
        }
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            this.f75656.m15284();
            C24860 c24860 = (C24860) arrayList.get(i5);
            if (!m52534(c24860)) {
                C1298 c1298 = this.f75661;
                if (c1298.f4637[c24860.f80465]) {
                    m52531(zArr, i4, i5, i4 >= 0 && ((C24860) arrayList.get(i4)).f80462 != 19, true);
                } else if (c1298.f4636[c24860.f80465]) {
                    m52531(zArr, i4, i5, i4 >= 0, false);
                }
                if (m52535(c24860.f80462)) {
                    i3++;
                    int i6 = iArr[i5];
                    m52531(zArr, i5, i6, false, i6 < size && !m52532(((C24860) arrayList.get(i6)).f80462));
                } else if (m52532(c24860.f80462)) {
                    m52531(zArr, i4, i5, i4 >= 0 && !m52535(((C24860) arrayList.get(i4)).f80462), false);
                    i3--;
                } else if (i3 > 0 && c1298.f4642[c24860.f80465]) {
                    int i7 = iArr[i5];
                    m52531(zArr, i5, i7, true, i7 < size && !m52532(((C24860) arrayList.get(i7)).f80462));
                }
                i4 = i5;
            }
        }
        m52531(zArr, i4, size, i4 >= 0, false);
        return zArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52534(C24860 c24860) {
        return c24860.f80462 == 103 || c24860.f80462 == 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52531(boolean[] zArr, int i, int i2, boolean z, boolean z2) {
        int i3 = i + 1;
        while (i3 <= i2 && i3 < zArr.length) {
            this.f75656.m15284();
            if (z && (i3 != i2 || z2)) {
                zArr[i3] = true;
            }
            i3++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52530(ArrayList arrayList, int i, int i2, String str) {
        if ((C18856.m43750(this.f75662, false, i, str, str.length()) && i2 - i == str.length()) || m52533(i, i2)) {
            return;
        }
        arrayList.add(new C17400(i, i2, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52533(int i, int i2) {
        ArrayList arrayList = this.f75667;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C15908) arrayList.get(i4)).f51678 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        if (i3 < arrayList.size()) {
            C15908 c15908 = (C15908) arrayList.get(i3);
            if (i >= c15908.f51679 || i2 > c15908.f51679) {
                return true;
            }
        }
        return false;
    }
}
