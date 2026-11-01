package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9942 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20876 f33947;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14474 f33951 = new C14474(30);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f33946 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f33948 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f33950 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6764 f33949 = new C6764(this);

    public C9942(C20876 c20876) {
        this.f33947 = c20876;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25165() {
        m25160(this.f33946);
        m25160(this.f33948);
        this.f33950 = 0;
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
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25156() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        byte b;
        C8531 c8531M25158;
        int i4;
        int i5;
        int i6;
        C8531 c8531M25159;
        boolean z2;
        boolean z3;
        Object obj;
        C8531 c8531M251510;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C6764 c6764 = this.f33949;
        c6764.getClass();
        while (true) {
            arrayList = this.f33946;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C8531) arrayList.get(size)).f29534 != 8) {
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
            C9942 c9942 = c6764.f22851;
            C14474 c14474 = c9942.f33951;
            C8531 c8531 = (C8531) arrayList.get(size);
            C8531 c8532 = (C8531) arrayList.get(i15);
            int i16 = c8532.f29534;
            if (i16 == 1) {
                int i17 = c8531.f29536;
                int i18 = c8532.f29533;
                int i19 = i17 < i18 ? -1 : 0;
                int i20 = c8531.f29533;
                if (i20 < i18) {
                    i19++;
                }
                if (i18 <= i20) {
                    c8531.f29533 = i20 + c8532.f29536;
                }
                int i21 = c8532.f29533;
                if (i21 <= i17) {
                    c8531.f29536 = i17 + c8532.f29536;
                }
                c8532.f29533 = i21 + i19;
                arrayList.set(size, c8532);
                arrayList.set(i15, c8531);
            } else if (i16 == 2) {
                int i22 = c8531.f29533;
                int i23 = c8531.f29536;
                if (i22 < i23) {
                    z2 = c8532.f29533 == i22 && c8532.f29536 == i23 - i22;
                    z3 = false;
                } else {
                    z2 = c8532.f29533 == i23 + 1 && c8532.f29536 == i22 - i23;
                    z3 = true;
                }
                int i24 = c8532.f29533;
                if (i23 < i24) {
                    c8532.f29533 = i24 - 1;
                } else {
                    int i25 = c8532.f29536;
                    if (i23 < i24 + i25) {
                        c8532.f29536 = i25 - 1;
                        c8531.f29534 = 2;
                        c8531.f29536 = 1;
                        if (c8532.f29536 == 0) {
                            arrayList.remove(i15);
                            c8532.f29535 = null;
                            c14474.mo5813(c8532);
                        }
                    }
                }
                int i26 = c8531.f29533;
                int i27 = c8532.f29533;
                if (i26 <= i27) {
                    c8532.f29533 = i27 + 1;
                } else {
                    int i28 = i27 + c8532.f29536;
                    if (i26 < i28) {
                        obj = null;
                        c8531M251510 = c9942.m25158(null, 2, i26 + 1, i28 - i26);
                        c8532.f29536 = c8531.f29533 - c8532.f29533;
                    }
                    if (z2) {
                        arrayList.set(size, c8532);
                        arrayList.remove(i15);
                        c8531.f29535 = obj;
                        c14474.mo5813(c8531);
                    } else {
                        if (z3) {
                            if (c8531M251510 != null) {
                                i13 = c8531.f29533;
                                if (i13 > c8531M251510.f29533) {
                                    c8531.f29533 = i13 - c8531M251510.f29536;
                                }
                                i14 = c8531.f29536;
                                if (i14 > c8531M251510.f29533) {
                                    c8531.f29536 = i14 - c8531M251510.f29536;
                                }
                            }
                            i11 = c8531.f29533;
                            if (i11 > c8532.f29533) {
                                c8531.f29533 = i11 - c8532.f29536;
                            }
                            i12 = c8531.f29536;
                            if (i12 > c8532.f29533) {
                                c8531.f29536 = i12 - c8532.f29536;
                            }
                        } else {
                            if (c8531M251510 != null) {
                                i9 = c8531.f29533;
                                if (i9 >= c8531M251510.f29533) {
                                    c8531.f29533 = i9 - c8531M251510.f29536;
                                }
                                i10 = c8531.f29536;
                                if (i10 >= c8531M251510.f29533) {
                                    c8531.f29536 = i10 - c8531M251510.f29536;
                                }
                            }
                            i7 = c8531.f29533;
                            if (i7 >= c8532.f29533) {
                                c8531.f29533 = i7 - c8532.f29536;
                            }
                            i8 = c8531.f29536;
                            if (i8 >= c8532.f29533) {
                                c8531.f29536 = i8 - c8532.f29536;
                            }
                        }
                        arrayList.set(size, c8532);
                        if (c8531.f29533 != c8531.f29536) {
                            arrayList.set(i15, c8531);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (c8531M251510 != null) {
                            arrayList.add(size, c8531M251510);
                        }
                    }
                }
                obj = null;
                c8531M251510 = null;
                if (z2) {
                    arrayList.set(size, c8532);
                    arrayList.remove(i15);
                    c8531.f29535 = obj;
                    c14474.mo5813(c8531);
                } else {
                    if (z3) {
                        if (c8531M251510 != null) {
                            i13 = c8531.f29533;
                            if (i13 > c8531M251510.f29533) {
                                c8531.f29533 = i13 - c8531M251510.f29536;
                            }
                            i14 = c8531.f29536;
                            if (i14 > c8531M251510.f29533) {
                                c8531.f29536 = i14 - c8531M251510.f29536;
                            }
                        }
                        i11 = c8531.f29533;
                        if (i11 > c8532.f29533) {
                            c8531.f29533 = i11 - c8532.f29536;
                        }
                        i12 = c8531.f29536;
                        if (i12 > c8532.f29533) {
                            c8531.f29536 = i12 - c8532.f29536;
                        }
                    } else {
                        if (c8531M251510 != null) {
                            i9 = c8531.f29533;
                            if (i9 >= c8531M251510.f29533) {
                                c8531.f29533 = i9 - c8531M251510.f29536;
                            }
                            i10 = c8531.f29536;
                            if (i10 >= c8531M251510.f29533) {
                                c8531.f29536 = i10 - c8531M251510.f29536;
                            }
                        }
                        i7 = c8531.f29533;
                        if (i7 >= c8532.f29533) {
                            c8531.f29533 = i7 - c8532.f29536;
                        }
                        i8 = c8531.f29536;
                        if (i8 >= c8532.f29533) {
                            c8531.f29536 = i8 - c8532.f29536;
                        }
                    }
                    arrayList.set(size, c8532);
                    if (c8531.f29533 != c8531.f29536) {
                        arrayList.set(i15, c8531);
                    } else {
                        arrayList.remove(i15);
                    }
                    if (c8531M251510 != null) {
                        arrayList.add(size, c8531M251510);
                    }
                }
            } else if (i16 == 4) {
                int i29 = c8531.f29536;
                int i30 = c8532.f29533;
                if (i29 < i30) {
                    c8532.f29533 = i30 - 1;
                } else {
                    int i31 = c8532.f29536;
                    if (i29 < i30 + i31) {
                        c8532.f29536 = i31 - 1;
                        c8531M25158 = c9942.m25158(c8532.f29535, 4, c8531.f29533, 1);
                    }
                    i4 = c8531.f29533;
                    i5 = c8532.f29533;
                    if (i4 <= i5) {
                        c8532.f29533 = i5 + 1;
                    } else {
                        i6 = i5 + c8532.f29536;
                        if (i4 < i6) {
                            int i32 = i6 - i4;
                            c8531M25159 = c9942.m25158(c8532.f29535, 4, i4 + 1, i32);
                            c8532.f29536 -= i32;
                        }
                        arrayList.set(i15, c8531);
                        if (c8532.f29536 > 0) {
                            arrayList.set(size, c8532);
                        } else {
                            arrayList.remove(size);
                            c8532.f29535 = null;
                            c14474.mo5813(c8532);
                        }
                        if (c8531M25158 != null) {
                            arrayList.add(size, c8531M25158);
                        }
                        if (c8531M25159 != null) {
                            arrayList.add(size, c8531M25159);
                        }
                    }
                    c8531M25159 = null;
                    arrayList.set(i15, c8531);
                    if (c8532.f29536 > 0) {
                        arrayList.set(size, c8532);
                    } else {
                        arrayList.remove(size);
                        c8532.f29535 = null;
                        c14474.mo5813(c8532);
                    }
                    if (c8531M25158 != null) {
                        arrayList.add(size, c8531M25158);
                    }
                    if (c8531M25159 != null) {
                        arrayList.add(size, c8531M25159);
                    }
                }
                c8531M25158 = null;
                i4 = c8531.f29533;
                i5 = c8532.f29533;
                if (i4 <= i5) {
                    c8532.f29533 = i5 + 1;
                } else {
                    i6 = i5 + c8532.f29536;
                    if (i4 < i6) {
                        int i33 = i6 - i4;
                        c8531M25159 = c9942.m25158(c8532.f29535, 4, i4 + 1, i33);
                        c8532.f29536 -= i33;
                    }
                    arrayList.set(i15, c8531);
                    if (c8532.f29536 > 0) {
                        arrayList.set(size, c8532);
                    } else {
                        arrayList.remove(size);
                        c8532.f29535 = null;
                        c14474.mo5813(c8532);
                    }
                    if (c8531M25158 != null) {
                        arrayList.add(size, c8531M25158);
                    }
                    if (c8531M25159 != null) {
                        arrayList.add(size, c8531M25159);
                    }
                }
                c8531M25159 = null;
                arrayList.set(i15, c8531);
                if (c8532.f29536 > 0) {
                    arrayList.set(size, c8532);
                } else {
                    arrayList.remove(size);
                    c8532.f29535 = null;
                    c14474.mo5813(c8532);
                }
                if (c8531M25158 != null) {
                    arrayList.add(size, c8531M25158);
                }
                if (c8531M25159 != null) {
                    arrayList.add(size, c8531M25159);
                }
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C8531 c8531M251511 = (C8531) arrayList.get(i34);
            int i35 = c8531M251511.f29534;
            if (i35 != 1) {
                C14474 c14475 = this.f33951;
                C20876 c20876 = this.f33947;
                if (i35 == i2) {
                    int i36 = c8531M251511.f29533;
                    int i37 = c8531M251511.f29536 + i36;
                    int i38 = 0;
                    byte b2 = -1;
                    int i39 = i36;
                    while (i39 < i37) {
                        C17492 c17492 = c20876.f67813;
                        AbstractC12554 abstractC12554FindViewHolderForPosition = c17492.findViewHolderForPosition(i39, true);
                        if (abstractC12554FindViewHolderForPosition == null) {
                            abstractC12554FindViewHolderForPosition = null;
                        } else {
                            if (c17492.mChildHelper.f63624.contains(abstractC12554FindViewHolderForPosition.itemView)) {
                                int i40 = C17492.HORIZONTAL;
                                abstractC12554FindViewHolderForPosition = null;
                            }
                        }
                        if (abstractC12554FindViewHolderForPosition != null || m25155(i39)) {
                            if (b2 == 0) {
                                m25153(m25158(null, 2, i36, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                m25154(m25158(null, 2, i36, i38));
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
                    if (i38 != c8531M251511.f29536) {
                        c8531M251511.f29535 = null;
                        c14475.mo5813(c8531M251511);
                        c8531M251511 = m25158(null, 2, i36, i38);
                    }
                    if (b2 == 0) {
                        m25153(c8531M251511);
                    } else {
                        m25154(c8531M251511);
                    }
                } else if (i35 == i3) {
                    int i41 = c8531M251511.f29533;
                    int i42 = c8531M251511.f29536 + i41;
                    int i43 = i41;
                    byte b3 = -1;
                    int i44 = 0;
                    while (i41 < i42) {
                        C17492 c17493 = c20876.f67813;
                        AbstractC12554 abstractC12554FindViewHolderForPosition2 = c17493.findViewHolderForPosition(i41, true);
                        if (abstractC12554FindViewHolderForPosition2 == null) {
                            abstractC12554FindViewHolderForPosition2 = null;
                        } else {
                            if (c17493.mChildHelper.f63624.contains(abstractC12554FindViewHolderForPosition2.itemView)) {
                                int i45 = C17492.HORIZONTAL;
                                abstractC12554FindViewHolderForPosition2 = null;
                            }
                        }
                        if (abstractC12554FindViewHolderForPosition2 != null || m25155(i41)) {
                            if (b3 == 0) {
                                m25153(m25158(c8531M251511.f29535, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                m25154(m25158(c8531M251511.f29535, 4, i43, i44));
                                i44 = 0;
                                i43 = i41;
                            }
                            b3 = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != c8531M251511.f29536) {
                        Object obj2 = c8531M251511.f29535;
                        c8531M251511.f29535 = null;
                        c14475.mo5813(c8531M251511);
                        c8531M251511 = m25158(obj2, 4, i43, i44);
                    }
                    if (b3 == 0) {
                        m25153(c8531M251511);
                    } else {
                        m25154(c8531M251511);
                    }
                } else if (i35 == i) {
                    m25154(c8531M251511);
                }
            } else {
                m25154(c8531M251511);
            }
            i34++;
            i = 8;
            i2 = 2;
            i3 = 4;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25159() {
        ArrayList arrayList = this.f33948;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f33947.m46922((C8531) arrayList.get(i));
        }
        m25160(arrayList);
        this.f33950 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25153(C8531 c8531) {
        int i;
        C14474 c14474;
        int i2 = c8531.f29534;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM25152 = m25152(c8531.f29533, i2);
        int i3 = c8531.f29533;
        int i4 = c8531.f29534;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c8531);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c8531.f29536;
            c14474 = this.f33951;
            if (i5 >= i7) {
                break;
            }
            int iM25153 = m25152((i * i5) + c8531.f29533, c8531.f29534);
            int i8 = c8531.f29534;
            if (i8 == 2 ? iM25153 != iM25152 : !(i8 == 4 && iM25153 == iM25152 + 1)) {
                C8531 c8531M25158 = m25158(c8531.f29535, i8, iM25152, i6);
                m25161(c8531M25158, i3);
                c8531M25158.f29535 = null;
                c14474.mo5813(c8531M25158);
                if (c8531.f29534 == 4) {
                    i3 += i6;
                }
                iM25152 = iM25153;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c8531.f29535;
        c8531.f29535 = null;
        c14474.mo5813(c8531);
        if (i6 > 0) {
            C8531 c8531M25159 = m25158(obj, c8531.f29534, iM25152, i6);
            m25161(c8531M25159, i3);
            c8531M25159.f29535 = null;
            c14474.mo5813(c8531M25159);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m25152(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f33948;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8531 c8531 = (C8531) arrayList.get(size);
            int i5 = c8531.f29534;
            if (i5 == 8) {
                int i6 = c8531.f29533;
                int i7 = c8531.f29536;
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
                            c8531.f29533 = i6 + 1;
                            c8531.f29536 = i7 + 1;
                        } else if (i2 == 2) {
                            c8531.f29533 = i6 - 1;
                            c8531.f29536 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c8531.f29536 = i7 + 1;
                    } else if (i2 == 2) {
                        c8531.f29536 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c8531.f29533 = i6 + 1;
                    } else if (i2 == 2) {
                        c8531.f29533 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c8531.f29533;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c8531.f29536;
                    } else if (i5 == 2) {
                        i += c8531.f29536;
                    }
                } else if (i2 == 1) {
                    c8531.f29533 = i8 + 1;
                } else if (i2 == 2) {
                    c8531.f29533 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C8531 c8532 = (C8531) arrayList.get(size2);
            int i9 = c8532.f29534;
            C14474 c14474 = this.f33951;
            if (i9 == 8) {
                int i10 = c8532.f29536;
                if (i10 == c8532.f29533 || i10 < 0) {
                    arrayList.remove(size2);
                    c8532.f29535 = null;
                    c14474.mo5813(c8532);
                }
            } else if (c8532.f29536 <= 0) {
                arrayList.remove(size2);
                c8532.f29535 = null;
                c14474.mo5813(c8532);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m25155(int i) {
        ArrayList arrayList = this.f33948;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8531 c8531 = (C8531) arrayList.get(i2);
            int i3 = c8531.f29534;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c8531.f29533;
                    int i5 = c8531.f29536 + i4;
                    while (i4 < i5) {
                        if (m25157(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m25157(c8531.f29536, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m25154(C8531 c8531) {
        this.f33948.add(c8531);
        int i = c8531.f29534;
        C20876 c20876 = this.f33947;
        if (i == 1) {
            int i2 = c8531.f29533;
            int i3 = c8531.f29536;
            C17492 c17492 = c20876.f67813;
            c17492.offsetPositionRecordsForInsert(i2, i3);
            c17492.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c8531.f29533;
            int i5 = c8531.f29536;
            C17492 c17493 = c20876.f67813;
            c17493.offsetPositionRecordsForRemove(i4, i5, false);
            c17493.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c8531.f29533;
            int i7 = c8531.f29536;
            Object obj = c8531.f29535;
            C17492 c17494 = c20876.f67813;
            c17494.viewRangeUpdate(i6, i7, obj);
            c17494.mItemsChanged = true;
            return;
        }
        if (i == 8) {
            int i8 = c8531.f29533;
            int i9 = c8531.f29536;
            C17492 c17495 = c20876.f67813;
            c17495.offsetPositionRecordsForMove(i8, i9);
            c17495.mItemsAddedOrRemoved = true;
            return;
        }
        throw new IllegalArgumentException("Unknown update op type for " + c8531);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m25166() {
        return this.f33946.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25162(int i) {
        return (i & this.f33950) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25157(int i, int i2) {
        ArrayList arrayList = this.f33948;
        int size = arrayList.size();
        while (i2 < size) {
            C8531 c8531 = (C8531) arrayList.get(i2);
            int i3 = c8531.f29534;
            if (i3 == 8) {
                int i4 = c8531.f29533;
                if (i4 == i) {
                    i = c8531.f29536;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c8531.f29536 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c8531.f29533;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c8531.f29536;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c8531.f29536;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25164(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        C8531 c8531M25158 = m25158(obj, 4, i, i2);
        ArrayList arrayList = this.f33946;
        arrayList.add(c8531M25158);
        this.f33950 |= 4;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m25169(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C8531 c8531M25158 = m25158(null, 1, i, i2);
        ArrayList arrayList = this.f33946;
        arrayList.add(c8531M25158);
        this.f33950 |= 1;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m25167(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        C8531 c8531M25158 = m25158(null, 2, i, i2);
        ArrayList arrayList = this.f33946;
        arrayList.add(c8531M25158);
        this.f33950 |= 2;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25163(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        C8531 c8531M25158 = m25158(null, 8, i, i2);
        ArrayList arrayList = this.f33946;
        arrayList.add(c8531M25158);
        this.f33950 |= 8;
        return arrayList.size() == 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25168() {
        m25159();
        ArrayList arrayList = this.f33946;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8531 c8531 = (C8531) arrayList.get(i);
            int i2 = c8531.f29534;
            C20876 c20876 = this.f33947;
            if (i2 == 1) {
                c20876.m46922(c8531);
                int i3 = c8531.f29533;
                int i4 = c8531.f29536;
                C17492 c17492 = c20876.f67813;
                c17492.offsetPositionRecordsForInsert(i3, i4);
                c17492.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                c20876.m46922(c8531);
                int i5 = c8531.f29533;
                int i6 = c8531.f29536;
                C17492 c17493 = c20876.f67813;
                c17493.offsetPositionRecordsForRemove(i5, i6, true);
                c17493.mItemsAddedOrRemoved = true;
                c17493.mState.f52014 += i6;
            } else if (i2 == 4) {
                c20876.m46922(c8531);
                int i7 = c8531.f29533;
                int i8 = c8531.f29536;
                Object obj = c8531.f29535;
                C17492 c17494 = c20876.f67813;
                c17494.viewRangeUpdate(i7, i8, obj);
                c17494.mItemsChanged = true;
            } else if (i2 == 8) {
                c20876.m46922(c8531);
                int i9 = c8531.f29533;
                int i10 = c8531.f29536;
                C17492 c17495 = c20876.f67813;
                c17495.offsetPositionRecordsForMove(i9, i10);
                c17495.mItemsAddedOrRemoved = true;
            }
        }
        m25160(arrayList);
        this.f33950 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8531 m25158(Object obj, int i, int i2, int i3) {
        C8531 c8531 = (C8531) this.f33951.mo5812();
        if (c8531 == null) {
            C8531 c8532 = new C8531();
            c8532.f29534 = i;
            c8532.f29533 = i2;
            c8532.f29536 = i3;
            c8532.f29535 = obj;
            return c8532;
        }
        c8531.f29534 = i;
        c8531.f29533 = i2;
        c8531.f29536 = i3;
        c8531.f29535 = obj;
        return c8531;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25160(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C8531 c8531 = (C8531) arrayList.get(i);
            c8531.f29535 = null;
            this.f33951.mo5813(c8531);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25161(C8531 c8531, int i) {
        C20876 c20876 = this.f33947;
        c20876.m46922(c8531);
        int i2 = c8531.f29534;
        if (i2 == 2) {
            int i3 = c8531.f29536;
            C17492 c17492 = c20876.f67813;
            c17492.offsetPositionRecordsForRemove(i, i3, true);
            c17492.mItemsAddedOrRemoved = true;
            c17492.mState.f52014 += i3;
            return;
        }
        if (i2 == 4) {
            int i4 = c8531.f29536;
            Object obj = c8531.f29535;
            C17492 c17493 = c20876.f67813;
            c17493.viewRangeUpdate(i, i4, obj);
            c17493.mItemsChanged = true;
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
}
