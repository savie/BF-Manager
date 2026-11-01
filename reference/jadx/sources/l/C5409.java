package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5409 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2586[] f18674;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f18675;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean[] f18676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2586[] f18677;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f18678;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f18679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f18680;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18503 f18681;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18682;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f18683;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f18684;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List f18685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14982(int i) {
        return i == 59 || i == 57 || i == 55;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14984(CharSequence charSequence, boolean z, int i, C18503 c18503) throws InterruptedException {
        C4703.m13018(charSequence, z, i, c18503);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0259  */
    /* JADX WARN: Code duplicated, block: B:121:0x0260  */
    /* JADX WARN: Code duplicated, block: B:123:0x0268  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:221:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:223:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:232:0x03eb A[LOOP:11: B:231:0x03e9->B:232:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:243:0x0414  */
    /* JADX WARN: Code duplicated, block: B:246:0x0423  */
    /* JADX WARN: Code duplicated, block: B:248:0x0426 A[LOOP:12: B:247:0x0424->B:248:0x0426, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x044c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0466  */
    /* JADX WARN: Code duplicated, block: B:262:0x0470  */
    /* JADX WARN: Code duplicated, block: B:263:0x0474  */
    /* JADX WARN: Code duplicated, block: B:266:0x0479  */
    /* JADX WARN: Code duplicated, block: B:267:0x047b  */
    /* JADX WARN: Code duplicated, block: B:306:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0279 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:223:0x03dc, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14981(CharSequence charSequence, boolean z, int i, C18503 c18503) {
        String str;
        C18503 c18504;
        boolean[] zArr;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        C2586 c2586;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC14988 interfaceC14988Mo22136;
        C2586 c2587;
        int i10;
        InterfaceC14988 interfaceC14988Mo22137;
        InterfaceC17809 interfaceC17809;
        int type;
        m14980();
        try {
            C22343 c22343 = new C22343(new C14325(charSequence, new RunnableC3575(3)));
            C11760 c11760 = new C11760();
            c22343.m43805();
            c22343.m43803(c11760);
            C4943 c4943 = new C4943(c22343);
            c4943.m13728();
            int i11 = -1;
            if (c4943.mo11332(1) == -1) {
                c18503.append(charSequence);
                return;
            }
            ArrayList arrayListM13723 = c4943.m13723();
            C5409 c5409 = new C5409(charSequence, arrayListM13723, z, i, c18503);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int i13 = -1;
            while (true) {
                int size = arrayListM13723.size();
                C2586[] c2586Arr = c5409.f18677;
                C2586[] c2586Arr2 = c5409.f18674;
                if (i12 < size) {
                    m14980();
                    InterfaceC19761 interfaceC19761 = (InterfaceC19761) arrayListM13723.get(i12);
                    int type2 = interfaceC19761.getType();
                    if (type2 != 64 && type2 != 53 && type2 != i11) {
                        if (type2 == 65) {
                            if (!arrayDeque.isEmpty()) {
                                ((C2586) arrayDeque.peek()).f10169 = true;
                            }
                        } else if (m14982(type2)) {
                            if (arrayDeque.size() >= 128) {
                                throw new C13877(interfaceC19761.getLine(), interfaceC19761.mo22509(), "Formatting nesting limit exceeded");
                            }
                            C2586 c2588 = new C2586(i12);
                            if (!arrayDeque.isEmpty() && type2 != 55) {
                                ((C2586) arrayDeque.peek()).f10169 = true;
                            }
                            c2586Arr2[i12] = c2588;
                            arrayDeque.push(c2588);
                        } else if (type2 == 60 || type2 == 58 || type2 == 56) {
                            if (arrayDeque.isEmpty() || !(((type = ((InterfaceC19761) arrayListM13723.get(((C2586) arrayDeque.peek()).f10170)).getType()) == 59 && type2 == 60) || ((type == 57 && type2 == 58) || (type == 55 && type2 == 56)))) {
                                throw new C13877(interfaceC19761.getLine(), interfaceC19761.mo22509(), "Mismatched closing delimiter");
                            }
                            C2586 c2589 = (C2586) arrayDeque.pop();
                            c2589.f10166 = i12;
                            c2589.f10168 = i13 != c2589.f10170;
                            c2586Arr[i12] = c2589;
                        }
                        i13 = i12;
                    }
                    i12++;
                    i11 = -1;
                } else {
                    if (!arrayDeque.isEmpty()) {
                        InterfaceC19761 interfaceC19762 = (InterfaceC19761) arrayListM13723.get(((C2586) arrayDeque.peek()).f10170);
                        throw new C13877(interfaceC19762.getLine(), interfaceC19762.mo22509(), "Unclosed delimiter");
                    }
                    C22199 c22199 = new C22199(c4943);
                    c22199.m43805();
                    c22199.m43803(c11760);
                    C6115 c6115M49291 = c22199.m49291();
                    if (c4943.mo11332(1) != -1) {
                        InterfaceC19761 interfaceC19761Mo13724 = c4943.mo13724(1);
                        throw new C13877(interfaceC19761Mo13724.getLine(), interfaceC19761Mo13724.mo22509(), "Unexpected trailing content");
                    }
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    arrayDeque2.push(c6115M49291);
                    while (true) {
                        boolean zIsEmpty = arrayDeque2.isEmpty();
                        int[] iArr = c5409.f18680;
                        boolean[] zArr2 = c5409.f18678;
                        if (zIsEmpty) {
                            ArrayDeque arrayDeque3 = new ArrayDeque();
                            int size2 = arrayListM13723.size();
                            while (true) {
                                size2--;
                                if (size2 >= 0) {
                                    C2586 c25810 = c2586Arr[size2];
                                    if (c25810 != null) {
                                        arrayDeque3.push(c25810);
                                    }
                                    if (c2586Arr2[size2] != null) {
                                        C2586 c25811 = (C2586) arrayDeque3.pop();
                                        boolean z7 = c25811.f10169 & c25811.f10168;
                                        c25811.f10169 = z7;
                                        if (z7 && !arrayDeque3.isEmpty()) {
                                            ((C2586) arrayDeque3.peek()).f10169 = true;
                                        }
                                    }
                                } else {
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int size3 = arrayListM13723.size();
                                        int[] iArr2 = c5409.f18683;
                                        if (i14 >= size3) {
                                            ArrayDeque arrayDeque4 = new ArrayDeque();
                                            int i16 = 0;
                                            int i17 = 0;
                                            int i18 = 0;
                                            boolean z8 = false;
                                            boolean z9 = false;
                                            int i19 = 0;
                                            while (true) {
                                                int size4 = arrayListM13723.size();
                                                int i20 = i19;
                                                str = c5409.f18684;
                                                c18504 = c5409.f18681;
                                                if (i16 < size4) {
                                                    m14980();
                                                    InterfaceC19761 interfaceC19763 = (InterfaceC19761) arrayListM13723.get(i16);
                                                    ArrayList arrayList = arrayListM13723;
                                                    int type3 = interfaceC19763.getType();
                                                    C2586[] c2586Arr3 = c2586Arr2;
                                                    if (type3 != -1) {
                                                        if (type3 == 53) {
                                                            i19 = i20;
                                                            zArr = zArr2;
                                                            c2586Arr = c2586Arr;
                                                        } else if (type3 == 64) {
                                                            String text = interfaceC19763.getText();
                                                            int i21 = 0;
                                                            for (int i22 = 0; i22 < text.length(); i22++) {
                                                                char cCharAt = text.charAt(i22);
                                                                if (cCharAt == '\n' || (cCharAt == '\r' && ((i8 = i22 + 1) == text.length() || text.charAt(i8) != '\n'))) {
                                                                    i21++;
                                                                }
                                                            }
                                                            i17 += i21;
                                                            i19 = i20;
                                                            zArr = zArr2;
                                                            c2586Arr = c2586Arr;
                                                        } else {
                                                            C2586 c25812 = c2586Arr[i16];
                                                            if (c25812 != null) {
                                                                arrayDeque4.pop();
                                                                i2 = c25812.f10165;
                                                            } else {
                                                                i2 = i20;
                                                            }
                                                            if (!zArr2[i16] || arrayDeque4.isEmpty()) {
                                                                zArr = zArr2;
                                                            } else {
                                                                zArr = zArr2;
                                                                if (((C2586) arrayDeque4.peek()).f10167 && i18 != 54 && i18 != 61) {
                                                                    z2 = true;
                                                                }
                                                                if (!z8 || z9 || z2 || (c25812 != null && c25812.f10167)) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                if (type3 == 65) {
                                                                    if (!z8 || i17 > 0) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                }
                                                                if (!z3 || (i7 = iArr[i16]) == 0 || (c5409.f18682 + iArr2[i7]) - iArr2[i16] <= 120) {
                                                                    i3 = i2;
                                                                } else {
                                                                    i3 = i2 + 1;
                                                                    z3 = true;
                                                                }
                                                                if (z3) {
                                                                    i5 = i17 < 2 ? 1 : 2;
                                                                    if (c18504.length() != 0) {
                                                                        for (i6 = 0; i6 < i5; i6++) {
                                                                            c18504.append((CharSequence) str);
                                                                        }
                                                                        c5409.f18682 = 0;
                                                                    }
                                                                } else if (c5409.f18682 > 0) {
                                                                    if (c5409.m14983(i18, i16)) {
                                                                        c18504.append(',');
                                                                        c5409.f18682++;
                                                                    }
                                                                    if (type3 != 65 || m14985(i18, type3)) {
                                                                        c18504.append(' ');
                                                                        c5409.f18682++;
                                                                    }
                                                                }
                                                                if (c5409.f18682 == 0) {
                                                                    for (i4 = 0; i4 < i3; i4++) {
                                                                        c18504.append((CharSequence) c5409.f18675);
                                                                    }
                                                                    c5409.f18682 = i3 * c5409.f18679;
                                                                }
                                                                c18504.append((CharSequence) interfaceC19763.getText());
                                                                int length = interfaceC19763.getText().length() + c5409.f18682;
                                                                c5409.f18682 = length;
                                                                c2586 = c2586Arr3[i16];
                                                                if (c2586 != null) {
                                                                    c2586.f10165 = i2;
                                                                    if (c2586.f10168 || (!c2586.f10169 && (length + iArr2[c2586.f10166 + 1]) - iArr2[i16 + 1] <= 120)) {
                                                                        z6 = false;
                                                                    } else {
                                                                        z6 = true;
                                                                    }
                                                                    c2586.f10167 = z6;
                                                                    arrayDeque4.push(c2586);
                                                                    if (c2586.f10167) {
                                                                        i2++;
                                                                        z4 = true;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                                if (type3 == 65) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                z9 = z4;
                                                                z8 = z5;
                                                                i18 = type3;
                                                                i19 = i2;
                                                                i17 = 0;
                                                            }
                                                            z2 = false;
                                                            if (z8) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            if (type3 == 65) {
                                                                if (z8) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                            }
                                                            if (z3) {
                                                                i3 = i2;
                                                            } else {
                                                                i3 = i2;
                                                            }
                                                            if (z3) {
                                                                if (i17 < 2) {
                                                                }
                                                                if (c18504.length() != 0) {
                                                                    while (i6 < i5) {
                                                                        c18504.append((CharSequence) str);
                                                                    }
                                                                    c5409.f18682 = 0;
                                                                }
                                                            } else if (c5409.f18682 > 0) {
                                                                if (c5409.m14983(i18, i16)) {
                                                                    c18504.append(',');
                                                                    c5409.f18682++;
                                                                }
                                                                if (type3 != 65) {
                                                                    c18504.append(' ');
                                                                    c5409.f18682++;
                                                                } else {
                                                                    c18504.append(' ');
                                                                    c5409.f18682++;
                                                                }
                                                            }
                                                            if (c5409.f18682 == 0) {
                                                                while (i4 < i3) {
                                                                    c18504.append((CharSequence) c5409.f18675);
                                                                }
                                                                c5409.f18682 = i3 * c5409.f18679;
                                                            }
                                                            c18504.append((CharSequence) interfaceC19763.getText());
                                                            int length2 = interfaceC19763.getText().length() + c5409.f18682;
                                                            c5409.f18682 = length2;
                                                            c2586 = c2586Arr3[i16];
                                                            if (c2586 != null) {
                                                                c2586.f10165 = i2;
                                                                if (c2586.f10168) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                c2586.f10167 = z6;
                                                                arrayDeque4.push(c2586);
                                                                if (c2586.f10167) {
                                                                    i2++;
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            if (type3 == 65) {
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            z9 = z4;
                                                            z8 = z5;
                                                            i18 = type3;
                                                            i19 = i2;
                                                            i17 = 0;
                                                        }
                                                        i16++;
                                                        zArr2 = zArr;
                                                        c2586Arr2 = c2586Arr3;
                                                        c2586Arr = c2586Arr;
                                                        arrayListM13723 = arrayList;
                                                    }
                                                }
                                            }
                                            if (charSequence.length() > 0) {
                                                if (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == '\r') {
                                                    c18504.append((CharSequence) str);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        m14980();
                                        InterfaceC19761 interfaceC19764 = (InterfaceC19761) arrayListM13723.get(i14);
                                        int type4 = interfaceC19764.getType();
                                        int i23 = i14 + 1;
                                        int i24 = iArr2[i14];
                                        iArr2[i23] = i24;
                                        if (type4 != 64 && type4 != 53 && type4 != -1) {
                                            iArr2[i23] = interfaceC19764.getText().length() + (m14985(i15, type4) ? 1 : 0) + (c5409.m14983(i15, i14) ? 1 : 0) + i24;
                                            i15 = type4;
                                        }
                                        i14 = i23;
                                    }
                                }
                            }
                        } else {
                            m14980();
                            InterfaceC14988 interfaceC14988 = (InterfaceC14988) arrayDeque2.pop();
                            if (interfaceC14988 instanceof C23289) {
                                C23289 c23289 = (C23289) interfaceC14988;
                                int iMo1058 = c23289.mo1058();
                                if (c23289.getChildCount() > 1) {
                                    InterfaceC14988 interfaceC14988Mo22138 = c23289.mo22136(1);
                                    if ((interfaceC14988Mo22138 instanceof InterfaceC17809) && ((InterfaceC17809) interfaceC14988Mo22138).mo41396().getType() == 54) {
                                        zArr2[c23289.f75536.mo22511()] = true;
                                    }
                                }
                                if (iMo1058 == 20) {
                                    for (int i25 = 0; i25 < c23289.getChildCount(); i25++) {
                                        InterfaceC14988 interfaceC14988Mo22139 = c23289.mo22136(i25);
                                        if (interfaceC14988Mo22139 instanceof InterfaceC17809) {
                                            InterfaceC17809 interfaceC178010 = (InterfaceC17809) interfaceC14988Mo22139;
                                            if (interfaceC178010.mo41396().getType() == 49 || interfaceC178010.mo41396().getType() == 51) {
                                                c5409.f18676[interfaceC178010.mo41396().mo22511()] = true;
                                            }
                                        }
                                    }
                                }
                                if (iMo1058 == 0) {
                                    for (i9 = 0; i9 < c23289.getChildCount(); i9++) {
                                        interfaceC14988Mo22136 = c23289.mo22136(i9);
                                        if (!(interfaceC14988Mo22136 instanceof InterfaceC17809) && (c2587 = c2586Arr2[((InterfaceC17809) interfaceC14988Mo22136).mo41396().mo22511()]) != null) {
                                            c2587.f10169 = true;
                                        }
                                    }
                                } else if (iMo1058 == 5) {
                                    zArr2[c23289.f75536.mo22511()] = true;
                                } else if (iMo1058 == 9) {
                                    while (i9 < c23289.getChildCount()) {
                                        interfaceC14988Mo22136 = c23289.mo22136(i9);
                                        if (!(interfaceC14988Mo22136 instanceof InterfaceC17809)) {
                                        }
                                    }
                                } else if (iMo1058 == 20) {
                                    zArr2[c23289.f75536.mo22511()] = true;
                                } else if (iMo1058 == 47) {
                                    while (i9 < c23289.getChildCount()) {
                                        interfaceC14988Mo22136 = c23289.mo22136(i9);
                                        if (!(interfaceC14988Mo22136 instanceof InterfaceC17809)) {
                                        }
                                    }
                                } else if (iMo1058 == 50) {
                                    zArr2[c23289.f75536.mo22511()] = true;
                                } else if (iMo1058 == 64) {
                                    int i26 = 1;
                                    while (true) {
                                        int i27 = i26 + 1;
                                        if (i27 < c23289.getChildCount()) {
                                            iArr[((InterfaceC17809) c23289.mo22136(i26)).mo41396().mo22511()] = ((C23289) c23289.mo22136(i27)).f75537.mo22511() + 1;
                                            i26 += 2;
                                        }
                                    }
                                } else if (iMo1058 != 61 && iMo1058 != 62) {
                                    switch (iMo1058) {
                                        case 13:
                                            for (i10 = 0; i10 < c23289.getChildCount(); i10++) {
                                                interfaceC14988Mo22137 = c23289.mo22136(i10);
                                                if (interfaceC14988Mo22137 instanceof InterfaceC17809) {
                                                    interfaceC17809 = (InterfaceC17809) interfaceC14988Mo22137;
                                                    if (interfaceC17809.mo41396().getType() != 46) {
                                                        zArr2[interfaceC17809.mo41396().mo22511()] = true;
                                                    } else {
                                                        zArr2[interfaceC17809.mo41396().mo22511()] = true;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            switch (iMo1058) {
                                                case 27:
                                                case 28:
                                                case 29:
                                                    zArr2[c23289.f75536.mo22511()] = true;
                                                    break;
                                            }
                                        case 14:
                                        case 15:
                                        case 16:
                                            while (i9 < c23289.getChildCount()) {
                                                interfaceC14988Mo22136 = c23289.mo22136(i9);
                                                if (!(interfaceC14988Mo22136 instanceof InterfaceC17809)) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    while (i10 < c23289.getChildCount()) {
                                        interfaceC14988Mo22137 = c23289.mo22136(i10);
                                        if (interfaceC14988Mo22137 instanceof InterfaceC17809) {
                                            interfaceC17809 = (InterfaceC17809) interfaceC14988Mo22137;
                                            if (interfaceC17809.mo41396().getType() != 46 || interfaceC17809.mo41396().getType() == 61) {
                                                zArr2[interfaceC17809.mo41396().mo22511()] = true;
                                            }
                                        }
                                    }
                                }
                                for (int childCount = c23289.getChildCount() - 1; childCount >= 0; childCount--) {
                                    arrayDeque2.push(c23289.mo22136(childCount));
                                }
                            }
                        }
                    }
                }
            }
        } catch (C13068 unused) {
            throw new InterruptedException();
        }
    }

    public C5409(CharSequence charSequence, ArrayList arrayList, boolean z, int i, C18503 c18503) {
        String str;
        char cCharAt;
        this.f18685 = arrayList;
        int iMax = Math.max(1, i);
        this.f18679 = iMax;
        this.f18675 = z ? "\t" : C6851.m18454(' ', iMax);
        int i2 = 0;
        while (true) {
            str = "\n";
            if (i2 >= charSequence.length() || (cCharAt = charSequence.charAt(i2)) == '\n') {
                break;
            }
            if (cCharAt == '\r') {
                int i3 = i2 + 1;
                if (i3 < charSequence.length() && charSequence.charAt(i3) == '\n') {
                    str = "\r\n";
                    break;
                } else {
                    str = "\r";
                    break;
                }
            }
            i2++;
        }
        this.f18684 = str;
        this.f18681 = c18503;
        this.f18674 = new C2586[arrayList.size()];
        this.f18677 = new C2586[arrayList.size()];
        this.f18678 = new boolean[arrayList.size()];
        this.f18676 = new boolean[arrayList.size()];
        this.f18680 = new int[arrayList.size()];
        this.f18683 = new int[arrayList.size() + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14983(int i, int i2) {
        return ((!this.f18678[i2] && !this.f18676[i2]) || i == 0 || i == 65 || m14982(i) || i == 54 || i == 61 || i == 62 || i == 63 || ((InterfaceC19761) this.f18685.get(i2)).getType() == 61) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m14985(int i, int i2) {
        return (i == 0 || m14982(i) || i2 == 54 || i2 == 53 || i2 == 55 || i2 == 60 || i2 == 58 || i2 == 56) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14980() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
