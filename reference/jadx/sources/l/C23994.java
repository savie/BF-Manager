package l;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XARL */
/* JADX INFO: loaded from: classes.dex */
public final class C23994 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6354 f77765 = C6354.m17460();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52829(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16233 m52830(char[] cArr) {
        InterfaceC18433 c8556;
        AbstractC17373 c6438;
        int i;
        int[] iArr = new int[cArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < cArr.length) {
            int i4 = i2 + 1;
            char c = cArr[i2];
            if ((32768 & c) == 0) {
                iArr[i3] = c;
                i3++;
                i2 = i4;
            } else {
                i2 += 2;
                char c2 = cArr[i4];
                if (c == 65535 && c2 == 65535) {
                    iArr[i3] = -1;
                    i3++;
                } else {
                    iArr[i3] = (c2 & 65535) | ((c & 32767) << 16);
                    i3++;
                }
            }
        }
        int i5 = iArr[0];
        int i6 = 4;
        if (i5 != 4) {
            throw new UnsupportedOperationException(new InvalidClassException(C16233.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(i5), 4)));
        }
        C16233 c16233 = new C16233(EnumC9883.values()[iArr[1]], iArr[2]);
        ArrayList<C3697> arrayList = new ArrayList();
        ArrayList<C3697> arrayList2 = new ArrayList();
        int i7 = iArr[3];
        int i8 = 0;
        while (true) {
            ArrayList<AbstractC2120> arrayList3 = c16233.f52365;
            if (i8 >= i7) {
                for (C3697 c3697 : arrayList) {
                    ((C17022) c3697.f13496).f54384 = (AbstractC2120) arrayList3.get(((Integer) c3697.f13497).intValue());
                }
                for (C3697 c3698 : arrayList2) {
                    ((AbstractC0793) c3698.f13496).f3382 = (C21961) arrayList3.get(((Integer) c3698.f13497).intValue());
                }
                int i9 = i6 + 1;
                int i10 = iArr[i6];
                int i11 = 0;
                while (i11 < i10) {
                    ((AbstractC12789) arrayList3.get(iArr[i9])).f42610 = true;
                    i11++;
                    i9++;
                }
                int i12 = i9 + 1;
                int i13 = iArr[i9];
                int i14 = 0;
                while (i14 < i13) {
                    ((C3966) arrayList3.get(iArr[i12])).f14725 = true;
                    i14++;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                EnumC9883 enumC9883 = EnumC9883.LEXER;
                EnumC9883 enumC9884 = c16233.f52370;
                if (enumC9884 == enumC9883) {
                    c16233.f52369 = new int[i16];
                }
                c16233.f52371 = new C3966[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = i15 + 1;
                    c16233.f52371[i17] = (C3966) arrayList3.get(iArr[i15]);
                    if (enumC9884 == EnumC9883.LEXER) {
                        i15 += 2;
                        c16233.f52369[i17] = iArr[i18];
                    } else {
                        i15 = i18;
                    }
                }
                c16233.f52363 = new C6789[i16];
                for (AbstractC2120 abstractC2120 : arrayList3) {
                    if (abstractC2120 instanceof C6789) {
                        C6789 c6789 = (C6789) abstractC2120;
                        C6789[] c6789Arr = c16233.f52363;
                        int i19 = abstractC2120.f7773;
                        c6789Arr[i19] = c6789;
                        c16233.f52371[i19].f14724 = c6789;
                    }
                }
                int i20 = i15 + 1;
                int i21 = iArr[i15];
                int i22 = 0;
                while (i22 < i21) {
                    c16233.f52367.add((C16668) arrayList3.get(iArr[i20]));
                    i22++;
                    i20++;
                }
                ArrayList arrayList4 = new ArrayList();
                int i23 = i20 + 1;
                int i24 = iArr[i20];
                for (int i25 = 0; i25 < i24; i25++) {
                    int i26 = iArr[i23];
                    int i27 = i23 + 1;
                    C0875 c0875 = new C0875(new int[0]);
                    arrayList4.add(c0875);
                    i23 += 2;
                    if (iArr[i27] != 0) {
                        c0875.m3502(-1);
                    }
                    for (int i28 = 0; i28 < i26; i28++) {
                        int i29 = i23 + 1;
                        int i30 = iArr[i23];
                        i23 += 2;
                        c0875.m3503(i30, iArr[i29]);
                    }
                }
                int i31 = i23 + 1;
                int i32 = iArr[i23];
                for (int i33 = 0; i33 < i32; i33++) {
                    int i34 = iArr[i31];
                    int i35 = iArr[i31 + 1];
                    int i36 = iArr[i31 + 2];
                    int i37 = iArr[i31 + 3];
                    int i38 = iArr[i31 + 4];
                    int i39 = iArr[i31 + 5];
                    AbstractC2120 abstractC2121 = (AbstractC2120) arrayList3.get(i35);
                    switch (i36) {
                        case 1:
                            c6438 = new C6438(abstractC2121, -1);
                            break;
                        case 2:
                            c6438 = i39 != 0 ? new C13140(abstractC2121, -1, i38) : new C13140(abstractC2121, i37, i38);
                            break;
                        case 3:
                            c6438 = new C23018((C3966) arrayList3.get(i37), i38, i39, abstractC2121);
                            break;
                        case 4:
                            c6438 = new C13846(abstractC2121, i37, i38, i39 != 0);
                            break;
                        case 5:
                            c6438 = i39 != 0 ? new C11378(abstractC2121, -1) : new C11378(abstractC2121, i37);
                            break;
                        case 6:
                            c6438 = new C4321(abstractC2121, i37, i38);
                            break;
                        case 7:
                            c6438 = new C10318(abstractC2121, (C0875) arrayList4.get(i37));
                            break;
                        case 8:
                            c6438 = new C5733(abstractC2121, (C0875) arrayList4.get(i37));
                            break;
                        case 9:
                            c6438 = new C6084(abstractC2121);
                            break;
                        case 10:
                            c6438 = new C4672(abstractC2121, i37);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC2120) arrayList3.get(i34)).m6672(c6438);
                    i31 += 6;
                }
                for (AbstractC2120 abstractC2122 : arrayList3) {
                    for (int i40 = 0; i40 < abstractC2122.f7778.size(); i40++) {
                        AbstractC17373 abstractC17373M6671 = abstractC2122.m6671(i40);
                        if (abstractC17373M6671 instanceof C23018) {
                            C23018 c23018 = (C23018) abstractC17373M6671;
                            C3966[] c3966Arr = c16233.f52371;
                            int i41 = c23018.f55272.f7773;
                            if (!c3966Arr[i41].f14725 || c23018.f74807 != 0) {
                                i41 = -1;
                            }
                            c16233.f52363[c23018.f55272.f7773].m6672(new C6438(c23018.f74809, i41));
                        }
                    }
                }
                for (AbstractC2120 abstractC2123 : arrayList3) {
                    if (abstractC2123 instanceof AbstractC0793) {
                        AbstractC0793 abstractC0793 = (AbstractC0793) abstractC2123;
                        C21961 c21961 = abstractC0793.f3382;
                        if (c21961 == null) {
                            throw new IllegalStateException();
                        }
                        if (c21961.f71259 != null) {
                            throw new IllegalStateException();
                        }
                        c21961.f71259 = abstractC0793;
                    }
                    if (abstractC2123 instanceof C2910) {
                        C2910 c2910 = (C2910) abstractC2123;
                        for (int i42 = 0; i42 < c2910.f7778.size(); i42++) {
                            AbstractC2120 abstractC2124 = c2910.m6671(i42).f55272;
                            if (abstractC2124 instanceof C9262) {
                                ((C9262) abstractC2124).f31487 = c2910;
                            }
                        }
                    } else if (abstractC2123 instanceof C0439) {
                        C0439 c0439 = (C0439) abstractC2123;
                        for (int i43 = 0; i43 < c0439.f7778.size(); i43++) {
                            AbstractC2120 abstractC2125 = c0439.m6671(i43).f55272;
                            if (abstractC2125 instanceof C20196) {
                                ((C20196) abstractC2125).f65546 = c0439;
                            }
                        }
                    }
                }
                int i44 = i31 + 1;
                int i45 = iArr[i31];
                int i46 = 1;
                while (i46 <= i45) {
                    int i47 = i44 + 1;
                    AbstractC12789 abstractC12789 = (AbstractC12789) arrayList3.get(iArr[i44]);
                    c16233.f52366.add(abstractC12789);
                    abstractC12789.f42611 = i46 - 1;
                    i46++;
                    i44 = i47;
                }
                if (enumC9884 == EnumC9883.LEXER) {
                    int i48 = i44 + 1;
                    c16233.f52368 = new InterfaceC18433[iArr[i44]];
                    for (int i49 = 0; i49 < c16233.f52368.length; i49++) {
                        EnumC19139 enumC19139 = EnumC19139.values()[iArr[i48]];
                        int i50 = i48 + 2;
                        int i51 = iArr[i48 + 1];
                        i48 += 3;
                        int i52 = iArr[i50];
                        switch (C11294.f38132[enumC19139.ordinal()]) {
                            case 1:
                                c8556 = new C8556(i51);
                                break;
                            case 2:
                                c8556 = new C9967(i51, i52);
                                break;
                            case 3:
                                c8556 = new C20550(i51);
                                break;
                            case 4:
                                c8556 = C15612.f50751;
                                break;
                            case 5:
                                c8556 = C19845.f63665;
                                break;
                            case 6:
                                c8556 = new C0088(i51);
                                break;
                            case 7:
                                c8556 = C16317.f52549;
                                break;
                            case 8:
                                c8556 = new C12084(i51);
                                break;
                            default:
                                Locale.getDefault();
                                throw new IllegalArgumentException("The specified lexer action type " + enumC19139 + " is not valid.");
                        }
                        c16233.f52368[i49] = c8556;
                    }
                }
                for (AbstractC2120 abstractC2126 : arrayList3) {
                    if ((abstractC2126 instanceof C20196) && c16233.f52371[abstractC2126.f7773].f14725) {
                        AbstractC2120 abstractC2127 = abstractC2126.m6671(abstractC2126.f7778.size() - 1).f55272;
                        if ((abstractC2127 instanceof C17022) && abstractC2127.f7777 && (abstractC2127.m6671(0).f55272 instanceof C6789)) {
                            ((C20196) abstractC2126).f65545 = true;
                        }
                    }
                }
                this.f77765.getClass();
                for (AbstractC2120 abstractC2128 : arrayList3) {
                    if (abstractC2128 != null) {
                        ArrayList arrayList5 = abstractC2128.f7778;
                        m52829(abstractC2128.f7777 || arrayList5.size() <= 1);
                        if (abstractC2128 instanceof C9262) {
                            m52829(((C9262) abstractC2128).f31487 != null);
                        }
                        if (abstractC2128 instanceof C20196) {
                            C20196 c20196 = (C20196) abstractC2128;
                            m52829(c20196.f65546 != null);
                            m52829(c20196.f7778.size() == 2);
                            if (c20196.m6671(0).f55272 instanceof C15963) {
                                m52829(c20196.m6671(1).f55272 instanceof C17022);
                                m52829(!c20196.f42610);
                            } else {
                                if (!(c20196.m6671(0).f55272 instanceof C17022)) {
                                    throw new IllegalStateException();
                                }
                                m52829(c20196.m6671(1).f55272 instanceof C15963);
                                m52829(c20196.f42610);
                            }
                        }
                        if (abstractC2128 instanceof C0439) {
                            m52829(arrayList5.size() == 1);
                            m52829(abstractC2128.m6671(0).f55272 instanceof C20196);
                        }
                        if (abstractC2128 instanceof C17022) {
                            m52829(((C17022) abstractC2128).f54384 != null);
                        }
                        if (abstractC2128 instanceof C3966) {
                            m52829(((C3966) abstractC2128).f14724 != null);
                        }
                        if (abstractC2128 instanceof AbstractC0793) {
                            m52829(((AbstractC0793) abstractC2128).f3382 != null);
                        }
                        if (abstractC2128 instanceof C21961) {
                            m52829(((C21961) abstractC2128).f71259 != null);
                        }
                        if (abstractC2128 instanceof AbstractC12789) {
                            AbstractC12789 abstractC127810 = (AbstractC12789) abstractC2128;
                            m52829(abstractC127810.f7778.size() <= 1 || abstractC127810.f42611 >= 0);
                        } else {
                            m52829(arrayList5.size() <= 1 || (abstractC2128 instanceof C6789));
                        }
                    }
                }
                return c16233;
            }
            int i53 = i6 + 1;
            int i54 = iArr[i6];
            AbstractC2120 c5027 = null;
            if (i54 == 0) {
                arrayList3.add(null);
                i6 = i53;
            } else {
                int i55 = i6 + 2;
                int i56 = iArr[i53];
                switch (i54) {
                    case 0:
                        if (i54 != 12) {
                            if (c5027 instanceof AbstractC0793) {
                                i = i6 + 3;
                                arrayList2.add(new C3697((AbstractC0793) c5027, Integer.valueOf(iArr[i55])));
                            }
                            if (c5027 != null) {
                                c5027.f7774 = c16233;
                                c5027.f7775 = arrayList3.size();
                            }
                            arrayList3.add(c5027);
                            i6 = i55;
                            continue;
                        } else {
                            i = i6 + 3;
                            arrayList.add(new C3697((C17022) c5027, Integer.valueOf(iArr[i55])));
                        }
                        i55 = i;
                        if (c5027 != null) {
                            c5027.f7774 = c16233;
                            c5027.f7775 = arrayList3.size();
                        }
                        arrayList3.add(c5027);
                        i6 = i55;
                        continue;
                    case 1:
                        c5027 = new C5027();
                        break;
                    case 2:
                        c5027 = new C3966();
                        break;
                    case 3:
                        c5027 = new C2204();
                        break;
                    case 4:
                        c5027 = new C9262();
                        break;
                    case 5:
                        c5027 = new C15963();
                        break;
                    case 6:
                        c5027 = new C16668();
                        break;
                    case 7:
                        c5027 = new C6789();
                        break;
                    case 8:
                        c5027 = new C21961();
                        break;
                    case 9:
                        c5027 = new C0439();
                        break;
                    case 10:
                        c5027 = new C20196();
                        break;
                    case 11:
                        c5027 = new C2910();
                        break;
                    case 12:
                        c5027 = new C17022();
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(i54)));
                }
                c5027.f7773 = i56;
                if (i54 != 12) {
                    i = i6 + 3;
                    arrayList.add(new C3697((C17022) c5027, Integer.valueOf(iArr[i55])));
                } else {
                    if (c5027 instanceof AbstractC0793) {
                        i = i6 + 3;
                        arrayList2.add(new C3697((AbstractC0793) c5027, Integer.valueOf(iArr[i55])));
                    }
                    if (c5027 != null) {
                        c5027.f7774 = c16233;
                        c5027.f7775 = arrayList3.size();
                    }
                    arrayList3.add(c5027);
                    i6 = i55;
                    continue;
                }
                i55 = i;
                if (c5027 != null) {
                    c5027.f7774 = c16233;
                    c5027.f7775 = arrayList3.size();
                }
                arrayList3.add(c5027);
                i6 = i55;
                continue;
            }
            i8++;
        }
    }
}
