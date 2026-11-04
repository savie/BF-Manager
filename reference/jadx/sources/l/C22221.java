package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes.dex */
public final class C22221 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19677 f71593;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6785 f71595 = new C6785(30);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f71598 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71596 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f71597 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18712 f71594 = new C18712(this);

    public C22221(C19677 c19677) {
        this.f71593 = c19677;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m50274() {
        m50267(this.f71598);
        m50267(this.f71596);
        this.f71597 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:199:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50277() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        byte b;
        C5067 c5067M50265;
        int i4;
        int i5;
        int i6;
        C5067 c5067M50266;
        boolean z2;
        boolean z3;
        Object obj;
        C5067 c5067M50267;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C18712 c18712 = this.f71594;
        c18712.getClass();
        while (true) {
            arrayList = this.f71598;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C5067) arrayList.get(size)).f17653 != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 2;
            i3 = 4;
            if (size == -1) {
                break;
            }
            int i15 = size + 1;
            C22221 c22221 = c18712.f60835;
            C6785 c6785 = c22221.f71595;
            C5067 c5067 = (C5067) arrayList.get(size);
            C5067 c5068 = (C5067) arrayList.get(i15);
            int i16 = c5068.f17653;
            if (i16 == 1) {
                int i17 = c5067.f17655;
                int i18 = c5068.f17656;
                int i19 = i17 < i18 ? -1 : 0;
                int i20 = c5067.f17656;
                if (i20 < i18) {
                    i19++;
                }
                if (i18 <= i20) {
                    c5067.f17656 = i20 + c5068.f17655;
                }
                int i21 = c5068.f17656;
                if (i21 <= i17) {
                    c5067.f17655 = i17 + c5068.f17655;
                }
                c5068.f17656 = i21 + i19;
                arrayList.set(size, c5068);
                arrayList.set(i15, c5067);
            } else if (i16 == 2) {
                int i22 = c5067.f17656;
                int i23 = c5067.f17655;
                if (i22 < i23) {
                    z2 = c5068.f17656 == i22 && c5068.f17655 == i23 - i22;
                    z3 = false;
                } else {
                    z2 = c5068.f17656 == i23 + 1 && c5068.f17655 == i22 - i23;
                    z3 = true;
                }
                int i24 = c5068.f17656;
                if (i23 < i24) {
                    c5068.f17656 = i24 - 1;
                } else {
                    int i25 = c5068.f17655;
                    if (i23 < i24 + i25) {
                        c5068.f17655 = i25 - 1;
                        c5067.f17653 = 2;
                        c5067.f17655 = 1;
                        if (c5068.f17655 == 0) {
                            arrayList.remove(i15);
                            c5068.f17654 = null;
                            c6785.mo18920(c5068);
                        }
                    }
                }
                int i26 = c5067.f17656;
                int i27 = c5068.f17656;
                if (i26 <= i27) {
                    c5068.f17656 = i27 + 1;
                } else {
                    int i28 = i27 + c5068.f17655;
                    if (i26 < i28) {
                        obj = null;
                        c5067M50267 = c22221.m50265(null, 2, i26 + 1, i28 - i26);
                        c5068.f17655 = c5067.f17656 - c5068.f17656;
                    }
                    if (z2) {
                        arrayList.set(size, c5068);
                        arrayList.remove(i15);
                        c5067.f17654 = obj;
                        c6785.mo18920(c5067);
                    } else {
                        if (z3) {
                            if (c5067M50267 != null) {
                                i13 = c5067.f17656;
                                if (i13 > c5067M50267.f17656) {
                                    c5067.f17656 = i13 - c5067M50267.f17655;
                                }
                                i14 = c5067.f17655;
                                if (i14 > c5067M50267.f17656) {
                                    c5067.f17655 = i14 - c5067M50267.f17655;
                                }
                            }
                            i11 = c5067.f17656;
                            if (i11 > c5068.f17656) {
                                c5067.f17656 = i11 - c5068.f17655;
                            }
                            i12 = c5067.f17655;
                            if (i12 > c5068.f17656) {
                                c5067.f17655 = i12 - c5068.f17655;
                            }
                        } else {
                            if (c5067M50267 != null) {
                                i9 = c5067.f17656;
                                if (i9 >= c5067M50267.f17656) {
                                    c5067.f17656 = i9 - c5067M50267.f17655;
                                }
                                i10 = c5067.f17655;
                                if (i10 >= c5067M50267.f17656) {
                                    c5067.f17655 = i10 - c5067M50267.f17655;
                                }
                            }
                            i7 = c5067.f17656;
                            if (i7 >= c5068.f17656) {
                                c5067.f17656 = i7 - c5068.f17655;
                            }
                            i8 = c5067.f17655;
                            if (i8 >= c5068.f17656) {
                                c5067.f17655 = i8 - c5068.f17655;
                            }
                        }
                        arrayList.set(size, c5068);
                        if (c5067.f17656 != c5067.f17655) {
                            arrayList.set(i15, c5067);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (c5067M50267 != null) {
                            arrayList.add(size, c5067M50267);
                        }
                    }
                }
                obj = null;
                c5067M50267 = null;
                if (z2) {
                    arrayList.set(size, c5068);
                    arrayList.remove(i15);
                    c5067.f17654 = obj;
                    c6785.mo18920(c5067);
                } else {
                    if (z3) {
                        if (c5067M50267 != null) {
                            i13 = c5067.f17656;
                            if (i13 > c5067M50267.f17656) {
                                c5067.f17656 = i13 - c5067M50267.f17655;
                            }
                            i14 = c5067.f17655;
                            if (i14 > c5067M50267.f17656) {
                                c5067.f17655 = i14 - c5067M50267.f17655;
                            }
                        }
                        i11 = c5067.f17656;
                        if (i11 > c5068.f17656) {
                            c5067.f17656 = i11 - c5068.f17655;
                        }
                        i12 = c5067.f17655;
                        if (i12 > c5068.f17656) {
                            c5067.f17655 = i12 - c5068.f17655;
                        }
                    } else {
                        if (c5067M50267 != null) {
                            i9 = c5067.f17656;
                            if (i9 >= c5067M50267.f17656) {
                                c5067.f17656 = i9 - c5067M50267.f17655;
                            }
                            i10 = c5067.f17655;
                            if (i10 >= c5067M50267.f17656) {
                                c5067.f17655 = i10 - c5067M50267.f17655;
                            }
                        }
                        i7 = c5067.f17656;
                        if (i7 >= c5068.f17656) {
                            c5067.f17656 = i7 - c5068.f17655;
                        }
                        i8 = c5067.f17655;
                        if (i8 >= c5068.f17656) {
                            c5067.f17655 = i8 - c5068.f17655;
                        }
                    }
                    arrayList.set(size, c5068);
                    if (c5067.f17656 != c5067.f17655) {
                        arrayList.set(i15, c5067);
                    } else {
                        arrayList.remove(i15);
                    }
                    if (c5067M50267 != null) {
                        arrayList.add(size, c5067M50267);
                    }
                }
            } else if (i16 == 4) {
                int i29 = c5067.f17655;
                int i30 = c5068.f17656;
                if (i29 < i30) {
                    c5068.f17656 = i30 - 1;
                } else {
                    int i31 = c5068.f17655;
                    if (i29 < i30 + i31) {
                        c5068.f17655 = i31 - 1;
                        c5067M50265 = c22221.m50265(c5068.f17654, 4, c5067.f17656, 1);
                    }
                    i4 = c5067.f17656;
                    i5 = c5068.f17656;
                    if (i4 <= i5) {
                        c5068.f17656 = i5 + 1;
                    } else {
                        i6 = i5 + c5068.f17655;
                        if (i4 < i6) {
                            int i32 = i6 - i4;
                            c5067M50266 = c22221.m50265(c5068.f17654, 4, i4 + 1, i32);
                            c5068.f17655 -= i32;
                        }
                        arrayList.set(i15, c5067);
                        if (c5068.f17655 > 0) {
                            arrayList.set(size, c5068);
                        } else {
                            arrayList.remove(size);
                            c5068.f17654 = null;
                            c6785.mo18920(c5068);
                        }
                        if (c5067M50265 != null) {
                            arrayList.add(size, c5067M50265);
                        }
                        if (c5067M50266 != null) {
                            arrayList.add(size, c5067M50266);
                        }
                    }
                    c5067M50266 = null;
                    arrayList.set(i15, c5067);
                    if (c5068.f17655 > 0) {
                        arrayList.set(size, c5068);
                    } else {
                        arrayList.remove(size);
                        c5068.f17654 = null;
                        c6785.mo18920(c5068);
                    }
                    if (c5067M50265 != null) {
                        arrayList.add(size, c5067M50265);
                    }
                    if (c5067M50266 != null) {
                        arrayList.add(size, c5067M50266);
                    }
                }
                c5067M50265 = null;
                i4 = c5067.f17656;
                i5 = c5068.f17656;
                if (i4 <= i5) {
                    c5068.f17656 = i5 + 1;
                } else {
                    i6 = i5 + c5068.f17655;
                    if (i4 < i6) {
                        int i33 = i6 - i4;
                        c5067M50266 = c22221.m50265(c5068.f17654, 4, i4 + 1, i33);
                        c5068.f17655 -= i33;
                    }
                    arrayList.set(i15, c5067);
                    if (c5068.f17655 > 0) {
                        arrayList.set(size, c5068);
                    } else {
                        arrayList.remove(size);
                        c5068.f17654 = null;
                        c6785.mo18920(c5068);
                    }
                    if (c5067M50265 != null) {
                        arrayList.add(size, c5067M50265);
                    }
                    if (c5067M50266 != null) {
                        arrayList.add(size, c5067M50266);
                    }
                }
                c5067M50266 = null;
                arrayList.set(i15, c5067);
                if (c5068.f17655 > 0) {
                    arrayList.set(size, c5068);
                } else {
                    arrayList.remove(size);
                    c5068.f17654 = null;
                    c6785.mo18920(c5068);
                }
                if (c5067M50265 != null) {
                    arrayList.add(size, c5067M50265);
                }
                if (c5067M50266 != null) {
                    arrayList.add(size, c5067M50266);
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C5067 c5067M50268 = (C5067) arrayList.get(i34);
            int i35 = c5067M50268.f17653;
            if (i35 != 1) {
                C6785 c6786 = this.f71595;
                C19677 c19677 = this.f71593;
                if (i35 == i2) {
                    int i36 = c5067M50268.f17656;
                    int i37 = c5067M50268.f17655 + i36;
                    int i38 = 0;
                    byte b2 = -1;
                    int i39 = i36;
                    while (i39 < i37) {
                        C25227 c25227 = c19677.f63369;
                        AbstractC11800 abstractC11800FindViewHolderForPosition = c25227.findViewHolderForPosition(i39, true);
                        if (abstractC11800FindViewHolderForPosition == null) {
                            abstractC11800FindViewHolderForPosition = null;
                        } else {
                            if (c25227.mChildHelper.f50473.contains(abstractC11800FindViewHolderForPosition.itemView)) {
                                int i40 = C25227.HORIZONTAL;
                                abstractC11800FindViewHolderForPosition = null;
                            }
                        }
                        if (abstractC11800FindViewHolderForPosition != null || m50262(i39)) {
                            if (b2 == 0) {
                                m50260(m50265(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                m50261(m50265(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i39 -= i38;
                            i37 -= i38;
                            i38 = 1;
                        } else {
                            i38++;
                        }
                        i39++;
                        b2 = b;
                    }
                    if (i38 != c5067M50268.f17655) {
                        c5067M50268.f17654 = null;
                        c6786.mo18920(c5067M50268);
                        c5067M50268 = m50265(null, 2, i36, i38);
                    }
                    if (b2 == 0) {
                        m50260(c5067M50268);
                    } else {
                        m50261(c5067M50268);
                    }
                } else if (i35 == i3) {
                    int i41 = c5067M50268.f17656;
                    int i42 = c5067M50268.f17655 + i41;
                    int i43 = i41;
                    byte b3 = -1;
                    int i44 = 0;
                    while (i41 < i42) {
                        C25227 c25228 = c19677.f63369;
                        AbstractC11800 abstractC11800FindViewHolderForPosition2 = c25228.findViewHolderForPosition(i41, true);
                        if (abstractC11800FindViewHolderForPosition2 == null) {
                            abstractC11800FindViewHolderForPosition2 = null;
                        } else {
                            if (c25228.mChildHelper.f50473.contains(abstractC11800FindViewHolderForPosition2.itemView)) {
                                int i45 = C25227.HORIZONTAL;
                                abstractC11800FindViewHolderForPosition2 = null;
                            }
                        }
                        if (abstractC11800FindViewHolderForPosition2 != null || m50262(i41)) {
                            if (b3 == 0) {
                                m50260(m50265(c5067M50268.f17654, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                m50261(m50265(c5067M50268.f17654, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != c5067M50268.f17655) {
                        Object obj2 = c5067M50268.f17654;
                        c5067M50268.f17654 = null;
                        c6786.mo18920(c5067M50268);
                        c5067M50268 = m50265(obj2, 4, i43, i44);
                    }
                    if (b3 == 0) {
                        m50260(c5067M50268);
                    } else {
                        m50261(c5067M50268);
                    }
                } else if (i35 == i) {
                    m50261(c5067M50268);
                }
            } else {
                m50261(c5067M50268);
            }
            i34++;
            i = 8;
            i2 = 2;
            i3 = 4;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50266() {
        ArrayList arrayList = this.f71596;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f71593.m45349((C5067) arrayList.get(i));
        }
        m50267(arrayList);
        this.f71597 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50260(C5067 c5067) {
        int i;
        C6785 c6785;
        int i2 = c5067.f17653;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM50263 = m50263(c5067.f17656, i2);
        int i3 = c5067.f17656;
        int i4 = c5067.f17653;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c5067);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c5067.f17655;
            c6785 = this.f71595;
            if (i5 >= i7) {
                break;
            }
            int iM50264 = m50263((i * i5) + c5067.f17656, c5067.f17653);
            int i8 = c5067.f17653;
            if (i8 == 2 ? iM50264 != iM50263 : !(i8 == 4 && iM50264 == iM50263 + 1)) {
                C5067 c5067M50265 = m50265(c5067.f17654, i8, iM50263, i6);
                m50268(c5067M50265, i3);
                c5067M50265.f17654 = null;
                c6785.mo18920(c5067M50265);
                if (c5067.f17653 == 4) {
                    i3 += i6;
                }
                iM50263 = iM50264;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c5067.f17654;
        c5067.f17654 = null;
        c6785.mo18920(c5067);
        if (i6 > 0) {
            C5067 c5067M50266 = m50265(obj, c5067.f17653, iM50263, i6);
            m50268(c5067M50266, i3);
            c5067M50266.f17654 = null;
            c6785.mo18920(c5067M50266);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m50263(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f71596;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5067 c5067 = (C5067) arrayList.get(size);
            int i5 = c5067.f17653;
            if (i5 == 8) {
                int i6 = c5067.f17656;
                int i7 = c5067.f17655;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c5067.f17656 = i6 + 1;
                            c5067.f17655 = i7 + 1;
                        } else if (i2 == 2) {
                            c5067.f17656 = i6 - 1;
                            c5067.f17655 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c5067.f17655 = i7 + 1;
                    } else if (i2 == 2) {
                        c5067.f17655 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c5067.f17656 = i6 + 1;
                    } else if (i2 == 2) {
                        c5067.f17656 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c5067.f17656;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c5067.f17655;
                    } else if (i5 == 2) {
                        i += c5067.f17655;
                    }
                } else if (i2 == 1) {
                    c5067.f17656 = i8 + 1;
                } else if (i2 == 2) {
                    c5067.f17656 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C5067 c5068 = (C5067) arrayList.get(size2);
            int i9 = c5068.f17653;
            C6785 c6785 = this.f71595;
            if (i9 == 8) {
                int i10 = c5068.f17655;
                if (i10 == c5068.f17656 || i10 < 0) {
                    arrayList.remove(size2);
                    c5068.f17654 = null;
                    c6785.mo18920(c5068);
                }
            } else if (c5068.f17655 <= 0) {
                arrayList.remove(size2);
                c5068.f17654 = null;
                c6785.mo18920(c5068);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m50262(int i) {
        ArrayList arrayList = this.f71596;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5067 c5067 = (C5067) arrayList.get(i2);
            int i3 = c5067.f17653;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c5067.f17656;
                    int i5 = c5067.f17655 + i4;
                    while (i4 < i5) {
                        if (m50264(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m50264(c5067.f17655, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50261(C5067 c5067) {
        this.f71596.add(c5067);
        int i = c5067.f17653;
        C19677 c19677 = this.f71593;
        if (i == 1) {
            int i2 = c5067.f17656;
            int i3 = c5067.f17655;
            C25227 c25227 = c19677.f63369;
            c25227.offsetPositionRecordsForInsert(i2, i3);
            c25227.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c5067.f17656;
            int i5 = c5067.f17655;
            C25227 c25228 = c19677.f63369;
            c25228.offsetPositionRecordsForRemove(i4, i5, false);
            c25228.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c5067.f17656;
            int i7 = c5067.f17655;
            Object obj = c5067.f17654;
            C25227 c25229 = c19677.f63369;
            c25229.viewRangeUpdate(i6, i7, obj);
            c25229.mItemsChanged = true;
            return;
        }
        if (i == 8) {
            int i8 = c5067.f17656;
            int i9 = c5067.f17655;
            C25227 c252210 = c19677.f63369;
            c252210.offsetPositionRecordsForMove(i8, i9);
            c252210.mItemsAddedOrRemoved = true;
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for " + c5067);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50272() {
        return this.f71598.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50269(int i) {
        return (i & this.f71597) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50264(int i, int i2) {
        ArrayList arrayList = this.f71596;
        int size = arrayList.size();
        while (i2 < size) {
            C5067 c5067 = (C5067) arrayList.get(i2);
            int i3 = c5067.f17653;
            if (i3 == 8) {
                int i4 = c5067.f17656;
                if (i4 == i) {
                    i = c5067.f17655;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c5067.f17655 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c5067.f17656;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c5067.f17655;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c5067.f17655;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50271(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        C5067 c5067M50265 = m50265(obj, 4, i, i2);
        ArrayList arrayList = this.f71598;
        arrayList.add(c5067M50265);
        this.f71597 |= 4;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50276(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5067 c5067M50265 = m50265(null, 1, i, i2);
        ArrayList arrayList = this.f71598;
        arrayList.add(c5067M50265);
        this.f71597 |= 1;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50273(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C5067 c5067M50265 = m50265(null, 2, i, i2);
        ArrayList arrayList = this.f71598;
        arrayList.add(c5067M50265);
        this.f71597 |= 2;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50270(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        C5067 c5067M50265 = m50265(null, 8, i, i2);
        ArrayList arrayList = this.f71598;
        arrayList.add(c5067M50265);
        this.f71597 |= 8;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50275() {
        m50266();
        ArrayList arrayList = this.f71598;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5067 c5067 = (C5067) arrayList.get(i);
            int i2 = c5067.f17653;
            C19677 c19677 = this.f71593;
            if (i2 == 1) {
                c19677.m45349(c5067);
                int i3 = c5067.f17656;
                int i4 = c5067.f17655;
                C25227 c25227 = c19677.f63369;
                c25227.offsetPositionRecordsForInsert(i3, i4);
                c25227.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c19677.m45349(c5067);
                int i5 = c5067.f17656;
                int i6 = c5067.f17655;
                C25227 c25228 = c19677.f63369;
                c25228.offsetPositionRecordsForRemove(i5, i6, true);
                c25228.mItemsAddedOrRemoved = true;
                c25228.mState.f50516 += i6;
            } else if (i2 == 4) {
                c19677.m45349(c5067);
                int i7 = c5067.f17656;
                int i8 = c5067.f17655;
                Object obj = c5067.f17654;
                C25227 c25229 = c19677.f63369;
                c25229.viewRangeUpdate(i7, i8, obj);
                c25229.mItemsChanged = true;
            } else if (i2 == 8) {
                c19677.m45349(c5067);
                int i9 = c5067.f17656;
                int i10 = c5067.f17655;
                C25227 c252210 = c19677.f63369;
                c252210.offsetPositionRecordsForMove(i9, i10);
                c252210.mItemsAddedOrRemoved = true;
            }
        }
        m50267(arrayList);
        this.f71597 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5067 m50265(Object obj, int i, int i2, int i3) {
        C5067 c5067 = (C5067) this.f71595.mo18919();
        if (c5067 == null) {
            C5067 c5068 = new C5067();
            c5068.f17653 = i;
            c5068.f17656 = i2;
            c5068.f17655 = i3;
            c5068.f17654 = obj;
            return c5068;
        }
        c5067.f17653 = i;
        c5067.f17656 = i2;
        c5067.f17655 = i3;
        c5067.f17654 = obj;
        return c5067;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50267(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5067 c5067 = (C5067) arrayList.get(i);
            c5067.f17654 = null;
            this.f71595.mo18920(c5067);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50268(C5067 c5067, int i) {
        C19677 c19677 = this.f71593;
        c19677.m45349(c5067);
        int i2 = c5067.f17653;
        if (i2 == 2) {
            int i3 = c5067.f17655;
            C25227 c25227 = c19677.f63369;
            c25227.offsetPositionRecordsForRemove(i, i3, true);
            c25227.mItemsAddedOrRemoved = true;
            c25227.mState.f50516 += i3;
            return;
        }
        if (i2 == 4) {
            int i4 = c5067.f17655;
            Object obj = c5067.f17654;
            C25227 c25228 = c19677.f63369;
            c25228.viewRangeUpdate(i, i4, obj);
            c25228.mItemsChanged = true;
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
}
