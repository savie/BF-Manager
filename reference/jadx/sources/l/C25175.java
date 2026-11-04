package l;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XARL */
/* JADX INFO: loaded from: classes.dex */
public final class C25175 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2054 f81368 = C2054.m7072();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56093(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11002 m56094(char[] cArr) {
        InterfaceC9510 c7274;
        AbstractC5959 c0562;
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
            throw new UnsupportedOperationException(new InvalidClassException(C11002.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(i5), 4)));
        }
        C11002 c11002 = new C11002(EnumC16223.values()[iArr[1]], iArr[2]);
        ArrayList<C18637> arrayList = new ArrayList();
        ArrayList<C18637> arrayList2 = new ArrayList();
        int i7 = iArr[3];
        int i8 = 0;
        while (true) {
            ArrayList<AbstractC17715> arrayList3 = c11002.f34748;
            if (i8 >= i7) {
                for (C18637 c18637 : arrayList) {
                    ((C5739) c18637.f60598).f19757 = (AbstractC17715) arrayList3.get(((Integer) c18637.f60599).intValue());
                }
                for (C18637 c18638 : arrayList2) {
                    ((AbstractC14731) c18638.f60598).f48134 = (C4291) arrayList3.get(((Integer) c18638.f60599).intValue());
                }
                int i9 = i6 + 1;
                int i10 = iArr[i6];
                int i11 = 0;
                while (i11 < i10) {
                    ((AbstractC21445) arrayList3.get(iArr[i9])).f68397 = true;
                    i11++;
                    i9++;
                }
                int i12 = i9 + 1;
                int i13 = iArr[i9];
                int i14 = 0;
                while (i14 < i13) {
                    ((C18417) arrayList3.get(iArr[i12])).f59990 = true;
                    i14++;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                EnumC16223 enumC16223 = EnumC16223.LEXER;
                EnumC16223 enumC16224 = c11002.f34755;
                if (enumC16224 == enumC16223) {
                    c11002.f34750 = new int[i16];
                }
                c11002.f34753 = new C18417[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = i15 + 1;
                    c11002.f34753[i17] = (C18417) arrayList3.get(iArr[i15]);
                    if (enumC16224 == EnumC16223.LEXER) {
                        i15 += 2;
                        c11002.f34750[i17] = iArr[i18];
                    } else {
                        i15 = i18;
                    }
                }
                c11002.f34752 = new C0518[i16];
                for (AbstractC17715 abstractC17715 : arrayList3) {
                    if (abstractC17715 instanceof C0518) {
                        C0518 c0518 = (C0518) abstractC17715;
                        C0518[] c0518Arr = c11002.f34752;
                        int i19 = abstractC17715.f58211;
                        c0518Arr[i19] = c0518;
                        c11002.f34753[i19].f59989 = c0518;
                    }
                }
                int i20 = i15 + 1;
                int i21 = iArr[i15];
                int i22 = 0;
                while (i22 < i21) {
                    c11002.f34754.add((C15653) arrayList3.get(iArr[i20]));
                    i22++;
                    i20++;
                }
                ArrayList arrayList4 = new ArrayList();
                int i23 = i20 + 1;
                int i24 = iArr[i20];
                for (int i25 = 0; i25 < i24; i25++) {
                    int i26 = iArr[i23];
                    int i27 = i23 + 1;
                    C14907 c14907 = new C14907(new int[0]);
                    arrayList4.add(c14907);
                    i23 += 2;
                    if (iArr[i27] != 0) {
                        c14907.m35858(-1);
                    }
                    for (int i28 = 0; i28 < i26; i28++) {
                        int i29 = i23 + 1;
                        int i30 = iArr[i23];
                        i23 += 2;
                        c14907.m35859(i30, iArr[i29]);
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
                    AbstractC17715 abstractC17716 = (AbstractC17715) arrayList3.get(i35);
                    switch (i36) {
                        case 1:
                            c0562 = new C0562(abstractC17716, -1);
                            break;
                        case 2:
                            c0562 = i39 != 0 ? new C21401(abstractC17716, -1, i38) : new C21401(abstractC17716, i37, i38);
                            break;
                        case 3:
                            c0562 = new C7976((C18417) arrayList3.get(i37), i38, i39, abstractC17716);
                            break;
                        case 4:
                            c0562 = new C20655(abstractC17716, i37, i38, i39 != 0);
                            break;
                        case 5:
                            c0562 = i39 != 0 ? new C12494(abstractC17716, -1) : new C12494(abstractC17716, i37);
                            break;
                        case 6:
                            c0562 = new C3545(abstractC17716, i37, i38);
                            break;
                        case 7:
                            c0562 = new C13941(abstractC17716, (C14907) arrayList4.get(i37));
                            break;
                        case 8:
                            c0562 = new C2010(abstractC17716, (C14907) arrayList4.get(i37));
                            break;
                        case 9:
                            c0562 = new C2230(abstractC17716);
                            break;
                        case 10:
                            c0562 = new C3501(abstractC17716, i37);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC17715) arrayList3.get(i34)).m41479(c0562);
                    i31 += 6;
                }
                for (AbstractC17715 abstractC17717 : arrayList3) {
                    for (int i40 = 0; i40 < abstractC17717.f58208.size(); i40++) {
                        AbstractC5959 abstractC5959M41478 = abstractC17717.m41478(i40);
                        if (abstractC5959M41478 instanceof C7976) {
                            C7976 c7976 = (C7976) abstractC5959M41478;
                            C18417[] c18417Arr = c11002.f34753;
                            int i41 = c7976.f20405.f58211;
                            if (!c18417Arr[i41].f59990 || c7976.f26512 != 0) {
                                i41 = -1;
                            }
                            c11002.f34752[c7976.f20405.f58211].m41479(new C0562(c7976.f26510, i41));
                        }
                    }
                }
                for (AbstractC17715 abstractC17718 : arrayList3) {
                    if (abstractC17718 instanceof AbstractC14731) {
                        AbstractC14731 abstractC14731 = (AbstractC14731) abstractC17718;
                        C4291 c4291 = abstractC14731.f48134;
                        if (c4291 == null) {
                            throw new IllegalStateException();
                        }
                        if (c4291.f15561 != null) {
                            throw new IllegalStateException();
                        }
                        c4291.f15561 = abstractC14731;
                    }
                    if (abstractC17718 instanceof C23639) {
                        C23639 c23639 = (C23639) abstractC17718;
                        for (int i42 = 0; i42 < c23639.f58208.size(); i42++) {
                            AbstractC17715 abstractC17719 = c23639.m41478(i42).f20405;
                            if (abstractC17719 instanceof C16179) {
                                ((C16179) abstractC17719).f52513 = c23639;
                            }
                        }
                    } else if (abstractC17718 instanceof C20129) {
                        C20129 c20129 = (C20129) abstractC17718;
                        for (int i43 = 0; i43 < c20129.f58208.size(); i43++) {
                            AbstractC17715 abstractC177110 = c20129.m41478(i43).f20405;
                            if (abstractC177110 instanceof C23113) {
                                ((C23113) abstractC177110).f74967 = c20129;
                            }
                        }
                    }
                }
                int i44 = i31 + 1;
                int i45 = iArr[i31];
                int i46 = 1;
                while (i46 <= i45) {
                    int i47 = i44 + 1;
                    AbstractC21445 abstractC21445 = (AbstractC21445) arrayList3.get(iArr[i44]);
                    c11002.f34749.add(abstractC21445);
                    abstractC21445.f68398 = i46 - 1;
                    i46++;
                    i44 = i47;
                }
                if (enumC16224 == EnumC16223.LEXER) {
                    int i48 = i44 + 1;
                    c11002.f34751 = new InterfaceC9510[iArr[i44]];
                    for (int i49 = 0; i49 < c11002.f34751.length; i49++) {
                        EnumC8765 enumC8765 = EnumC8765.values()[iArr[i48]];
                        int i50 = i48 + 2;
                        int i51 = iArr[i48 + 1];
                        i48 += 3;
                        int i52 = iArr[i50];
                        switch (C11748.f37988[enumC8765.ordinal()]) {
                            case 1:
                                c7274 = new C7274(i51);
                                break;
                            case 2:
                                c7274 = new C13985(i51, i52);
                                break;
                            case 3:
                                c7274 = new C22147(i51);
                                break;
                            case 4:
                                c7274 = C10958.f34628;
                                break;
                            case 5:
                                c7274 = C22893.f74375;
                                break;
                            case 6:
                                c7274 = new C19909(i51);
                                break;
                            case 7:
                                c7274 = C15433.f50278;
                                break;
                            case 8:
                                c7274 = new C13196(i51);
                                break;
                            default:
                                Locale.getDefault();
                                throw new IllegalArgumentException("The specified lexer action type " + enumC8765 + " is not valid.");
                        }
                        c11002.f34751[i49] = c7274;
                    }
                }
                for (AbstractC17715 abstractC177111 : arrayList3) {
                    if ((abstractC177111 instanceof C23113) && c11002.f34753[abstractC177111.f58211].f59990) {
                        AbstractC17715 abstractC177112 = abstractC177111.m41478(abstractC177111.f58208.size() - 1).f20405;
                        if ((abstractC177112 instanceof C5739) && abstractC177112.f58210 && (abstractC177112.m41478(0).f20405 instanceof C0518)) {
                            ((C23113) abstractC177111).f74966 = true;
                        }
                    }
                }
                this.f81368.getClass();
                for (AbstractC17715 abstractC177113 : arrayList3) {
                    if (abstractC177113 != null) {
                        ArrayList arrayList5 = abstractC177113.f58208;
                        m56093(abstractC177113.f58210 || arrayList5.size() <= 1);
                        if (abstractC177113 instanceof C16179) {
                            m56093(((C16179) abstractC177113).f52513 != null);
                        }
                        if (abstractC177113 instanceof C23113) {
                            C23113 c23113 = (C23113) abstractC177113;
                            m56093(c23113.f74967 != null);
                            m56093(c23113.f58208.size() == 2);
                            if (c23113.m41478(0).f20405 instanceof C11178) {
                                m56093(c23113.m41478(1).f20405 instanceof C5739);
                                m56093(!c23113.f68397);
                            } else {
                                if (!(c23113.m41478(0).f20405 instanceof C5739)) {
                                    throw new IllegalStateException();
                                }
                                m56093(c23113.m41478(1).f20405 instanceof C11178);
                                m56093(c23113.f68397);
                            }
                        }
                        if (abstractC177113 instanceof C20129) {
                            m56093(arrayList5.size() == 1);
                            m56093(abstractC177113.m41478(0).f20405 instanceof C23113);
                        }
                        if (abstractC177113 instanceof C5739) {
                            m56093(((C5739) abstractC177113).f19757 != null);
                        }
                        if (abstractC177113 instanceof C18417) {
                            m56093(((C18417) abstractC177113).f59989 != null);
                        }
                        if (abstractC177113 instanceof AbstractC14731) {
                            m56093(((AbstractC14731) abstractC177113).f48134 != null);
                        }
                        if (abstractC177113 instanceof C4291) {
                            m56093(((C4291) abstractC177113).f15561 != null);
                        }
                        if (abstractC177113 instanceof AbstractC21445) {
                            AbstractC21445 abstractC21446 = (AbstractC21445) abstractC177113;
                            m56093(abstractC21446.f58208.size() <= 1 || abstractC21446.f68398 >= 0);
                        } else {
                            m56093(arrayList5.size() <= 1 || (abstractC177113 instanceof C0518));
                        }
                    }
                }
                return c11002;
            }
            int i53 = i6 + 1;
            int i54 = iArr[i6];
            AbstractC17715 c24429 = null;
            if (i54 == 0) {
                arrayList3.add(null);
                i6 = i53;
            } else {
                int i55 = i6 + 2;
                int i56 = iArr[i53];
                switch (i54) {
                    case 0:
                        if (i54 != 12) {
                            if (c24429 instanceof AbstractC14731) {
                                i = i6 + 3;
                                arrayList2.add(new C18637((AbstractC14731) c24429, Integer.valueOf(iArr[i55])));
                            }
                            if (c24429 != null) {
                                c24429.f58206 = c11002;
                                c24429.f58209 = arrayList3.size();
                            }
                            arrayList3.add(c24429);
                            i6 = i55;
                            continue;
                        } else {
                            i = i6 + 3;
                            arrayList.add(new C18637((C5739) c24429, Integer.valueOf(iArr[i55])));
                        }
                        i55 = i;
                        if (c24429 != null) {
                            c24429.f58206 = c11002;
                            c24429.f58209 = arrayList3.size();
                        }
                        arrayList3.add(c24429);
                        i6 = i55;
                        continue;
                    case 1:
                        c24429 = new C24429();
                        break;
                    case 2:
                        c24429 = new C18417();
                        break;
                    case 3:
                        c24429 = new C6529();
                        break;
                    case 4:
                        c24429 = new C16179();
                        break;
                    case 5:
                        c24429 = new C11178();
                        break;
                    case 6:
                        c24429 = new C15653();
                        break;
                    case 7:
                        c24429 = new C0518();
                        break;
                    case 8:
                        c24429 = new C4291();
                        break;
                    case 9:
                        c24429 = new C20129();
                        break;
                    case 10:
                        c24429 = new C23113();
                        break;
                    case 11:
                        c24429 = new C23639();
                        break;
                    case 12:
                        c24429 = new C5739();
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(i54)));
                }
                c24429.f58211 = i56;
                if (i54 != 12) {
                    i = i6 + 3;
                    arrayList.add(new C18637((C5739) c24429, Integer.valueOf(iArr[i55])));
                } else {
                    if (c24429 instanceof AbstractC14731) {
                        i = i6 + 3;
                        arrayList2.add(new C18637((AbstractC14731) c24429, Integer.valueOf(iArr[i55])));
                    }
                    if (c24429 != null) {
                        c24429.f58206 = c11002;
                        c24429.f58209 = arrayList3.size();
                    }
                    arrayList3.add(c24429);
                    i6 = i55;
                    continue;
                }
                i55 = i;
                if (c24429 != null) {
                    c24429.f58206 = c11002;
                    c24429.f58209 = arrayList3.size();
                }
                arrayList3.add(c24429);
                i6 = i55;
                continue;
            }
            i8++;
        }
    }
}
