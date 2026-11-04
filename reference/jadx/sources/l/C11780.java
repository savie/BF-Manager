package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۧܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11780 extends AbstractC8448 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C9630 f38056;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f38058;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16695 f38059;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient boolean f38061;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f38063;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient C9630 f38064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f38065 = new boolean[64];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient C9630[] f38057 = new C9630[64];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient C9630 f38060 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38062 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۢ */
    public final void mo13470() {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9630 m29554(int i) {
        C9630 c9630M25133 = this.f38060;
        while (c9630M25133 != null) {
            int iCompare = Integer.compare(i, c9630M25133.f3592);
            if (iCompare == 0) {
                break;
            }
            c9630M25133 = iCompare < 0 ? c9630M25133.m25133() : c9630M25133.m25137();
        }
        return c9630M25133;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9630 m29555(int i) {
        C9630 c9630M25133 = this.f38060;
        C9630 c9630 = c9630M25133;
        int iCompare = 0;
        while (c9630M25133 != null) {
            iCompare = Integer.compare(i, c9630M25133.f3592);
            if (iCompare == 0) {
                break;
            }
            c9630 = c9630M25133;
            c9630M25133 = iCompare < 0 ? c9630M25133.m25133() : c9630M25133.m25137();
        }
        return iCompare == 0 ? c9630M25133 : c9630;
    }

    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        int i2;
        C9630 c9630;
        C9630 c9631;
        C9630 c9632;
        int i3 = 0;
        this.f38061 = false;
        C9630 c9633 = this.f38060;
        if (c9633 == null) {
            this.f38062++;
            c9633 = new C9630(i, null);
            this.f38056 = c9633;
            this.f38064 = c9633;
            this.f38060 = c9633;
        } else {
            int i4 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c9633.f3592);
                if (iCompare == 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            break;
                        }
                        this.f38057[i5] = null;
                        i4 = i5;
                    }
                } else {
                    this.f38057[i4] = c9633;
                    boolean[] zArr = this.f38065;
                    i2 = i4 + 1;
                    boolean z = iCompare > 0;
                    zArr[i4] = z;
                    if (z) {
                        if (c9633.m25129()) {
                            this.f38062++;
                            c9630 = new C9630(i, null);
                            C9630 c9634 = c9633.f31139;
                            if (c9634 == null) {
                                this.f38064 = c9630;
                            }
                            c9630.f31138 = c9633;
                            c9630.f31139 = c9634;
                            c9633.m25139(c9630);
                            break;
                        }
                        c9633 = c9633.f31139;
                        i4 = i2;
                    } else {
                        if (c9633.m25132()) {
                            this.f38062++;
                            c9630 = new C9630(i, null);
                            C9630 c9635 = c9633.f31138;
                            if (c9635 == null) {
                                this.f38056 = c9630;
                            }
                            c9630.f31139 = c9633;
                            c9630.f31138 = c9635;
                            c9633.f31140 &= -1073741825;
                            c9633.f31138 = c9630;
                            break;
                        }
                        c9633 = c9633.f31138;
                        i4 = i2;
                    }
                }
                Object obj2 = c9633.f3593;
                c9633.f3593 = obj;
                return obj2;
            }
            c9633 = c9630;
            this.f38061 = true;
            while (i4 > 0 && !this.f38057[i4].m25140()) {
                int i6 = i4 - 1;
                if (!this.f38065[i6]) {
                    C9630 c9636 = this.f38057[i6];
                    C9630 c9637 = c9636.f31139;
                    if (!c9636.m25129() && !c9637.m25140()) {
                        this.f38057[i4].m25131(true);
                        c9637.m25131(true);
                        this.f38057[i6].m25131(false);
                        i4 -= 2;
                    } else {
                        if (this.f38065[i4]) {
                            C9630[] c9630Arr = this.f38057;
                            C9630 c9638 = c9630Arr[i4];
                            C9630 c9639 = c9638.f31139;
                            c9638.f31139 = c9639.f31138;
                            c9639.f31138 = c9638;
                            c9630Arr[i6].f31138 = c9639;
                            if (c9639.m25132()) {
                                c9639.m25135(false);
                                c9638.m25134(c9639);
                            }
                            c9632 = c9639;
                        } else {
                            c9632 = this.f38057[i4];
                        }
                        C9630 c96310 = this.f38057[i6];
                        c96310.m25131(false);
                        c9632.m25131(true);
                        c96310.f31138 = c9632.f31139;
                        c9632.f31139 = c96310;
                        if (i4 < 2) {
                            this.f38060 = c9632;
                        } else {
                            int i7 = i4 - 2;
                            if (this.f38065[i7]) {
                                this.f38057[i7].f31139 = c9632;
                            } else {
                                this.f38057[i7].f31138 = c9632;
                            }
                        }
                        if (!c9632.m25129()) {
                            break;
                        }
                        c9632.m25141(false);
                        c96310.m25130(c9632);
                        break;
                    }
                } else {
                    C9630 c96311 = this.f38057[i6];
                    C9630 c96312 = c96311.f31138;
                    if (!c96311.m25132() && !c96312.m25140()) {
                        this.f38057[i4].m25131(true);
                        c96312.m25131(true);
                        this.f38057[i6].m25131(false);
                        i4 -= 2;
                    } else {
                        if (this.f38065[i4]) {
                            c9631 = this.f38057[i4];
                        } else {
                            C9630[] c9630Arr2 = this.f38057;
                            C9630 c96313 = c9630Arr2[i4];
                            C9630 c96314 = c96313.f31138;
                            c96313.f31138 = c96314.f31139;
                            c96314.f31139 = c96313;
                            c9630Arr2[i6].f31139 = c96314;
                            if (c96314.m25129()) {
                                c96314.m25141(false);
                                c96313.m25130(c96314);
                            }
                            c9631 = c96314;
                        }
                        C9630 c96315 = this.f38057[i6];
                        c96315.m25131(false);
                        c9631.m25131(true);
                        c96315.f31139 = c9631.f31138;
                        c9631.f31138 = c96315;
                        if (i4 < 2) {
                            this.f38060 = c9631;
                        } else {
                            int i8 = i4 - 2;
                            if (this.f38065[i8]) {
                                this.f38057[i8].f31139 = c9631;
                            } else {
                                this.f38057[i8].f31138 = c9631;
                            }
                        }
                        if (!c9631.m25132()) {
                            break;
                        }
                        c9631.m25135(false);
                        c96315.m25134(c9631);
                        break;
                    }
                }
            }
            i3 = i2;
        }
        this.f38060.m25131(true);
        while (true) {
            int i9 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            this.f38057[i9] = null;
            i3 = i9;
        }
        Object obj3 = c9633.f3593;
        c9633.f3593 = obj;
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x027e  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:158:0x0349  */
    /* JADX WARN: Code duplicated, block: B:159:0x034e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0358  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    @Override // l.AbstractC9939, l.InterfaceC23057
    public final Object remove(int i) {
        int i2;
        C9630 c9630;
        C9630 c9631;
        C9630 c9632;
        int i3;
        C9630[] c9630Arr;
        int i4;
        C9630[] c9630Arr2;
        int i5;
        C9630 c9633;
        C9630 c9634;
        int i6;
        C9630[] c9630Arr3;
        int i7;
        C9630[] c9630Arr4;
        int i8;
        this.f38061 = false;
        C9630 c9630M25137 = this.f38060;
        if (c9630M25137 == null) {
            return null;
        }
        int i9 = 0;
        while (true) {
            int iCompare = Integer.compare(i, c9630M25137.f3592);
            if (iCompare != 0) {
                boolean[] zArr = this.f38065;
                boolean z = iCompare > 0;
                zArr[i9] = z;
                this.f38057[i9] = c9630M25137;
                i9++;
                if (z) {
                    c9630M25137 = c9630M25137.m25137();
                    if (c9630M25137 == null) {
                        while (true) {
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f38057[i10] = null;
                            i9 = i10;
                        }
                    }
                } else {
                    c9630M25137 = c9630M25137.m25133();
                    if (c9630M25137 == null) {
                        while (true) {
                            int i11 = i9 - 1;
                            if (i9 == 0) {
                                return null;
                            }
                            this.f38057[i11] = null;
                            i9 = i11;
                        }
                    }
                }
            } else {
                if (c9630M25137.f31138 == null) {
                    this.f38056 = c9630M25137.m25136();
                }
                if (c9630M25137.f31139 == null) {
                    this.f38064 = c9630M25137.m25138();
                }
                if (c9630M25137.m25129()) {
                    if (!c9630M25137.m25132()) {
                        c9630M25137.m25138().f31139 = c9630M25137.f31139;
                        if (i9 == 0) {
                            this.f38060 = c9630M25137.f31138;
                        } else {
                            int i12 = i9 - 1;
                            if (this.f38065[i12]) {
                                this.f38057[i12].f31139 = c9630M25137.f31138;
                            } else {
                                this.f38057[i12].f31138 = c9630M25137.f31138;
                            }
                        }
                    } else if (i9 == 0) {
                        this.f38060 = c9630M25137.f31138;
                    } else {
                        int i13 = i9 - 1;
                        if (this.f38065[i13]) {
                            this.f38057[i13].m25134(c9630M25137.f31139);
                        } else {
                            this.f38057[i13].m25130(c9630M25137.f31138);
                        }
                    }
                } else {
                    C9630 c9635 = c9630M25137.f31139;
                    if (c9635.m25132()) {
                        c9635.f31138 = c9630M25137.f31138;
                        c9635.m25135(c9630M25137.m25132());
                        if (!c9635.m25132()) {
                            c9635.m25138().f31139 = c9635;
                        }
                        if (i9 == 0) {
                            this.f38060 = c9635;
                        } else {
                            int i14 = i9 - 1;
                            if (this.f38065[i14]) {
                                this.f38057[i14].f31139 = c9635;
                            } else {
                                this.f38057[i14].f31138 = c9635;
                            }
                        }
                        boolean zM25140 = c9635.m25140();
                        c9635.m25131(c9630M25137.m25140());
                        c9630M25137.m25131(zM25140);
                        this.f38065[i9] = true;
                        this.f38057[i9] = c9635;
                        i9++;
                    } else {
                        int i15 = i9 + 1;
                        while (true) {
                            this.f38065[i15] = false;
                            i2 = i15 + 1;
                            this.f38057[i15] = c9635;
                            c9630 = c9635.f31138;
                            if (c9630.m25132()) {
                                break;
                            }
                            c9635 = c9630;
                            i15 = i2;
                        }
                        this.f38065[i9] = true;
                        this.f38057[i9] = c9630;
                        if (c9630.m25129()) {
                            c9635.m25130(c9630);
                        } else {
                            c9635.f31138 = c9630.f31139;
                        }
                        c9630.f31138 = c9630M25137.f31138;
                        if (!c9630M25137.m25132()) {
                            c9630M25137.m25138().f31139 = c9630;
                            c9630.m25135(false);
                        }
                        c9630.m25139(c9630M25137.f31139);
                        boolean zM25141 = c9630.m25140();
                        c9630.m25131(c9630M25137.m25140());
                        c9630M25137.m25131(zM25141);
                        if (i9 == 0) {
                            this.f38060 = c9630;
                        } else {
                            int i16 = i9 - 1;
                            if (this.f38065[i16]) {
                                this.f38057[i16].f31139 = c9630;
                            } else {
                                this.f38057[i16].f31138 = c9630;
                            }
                        }
                        i9 = i2;
                    }
                }
                if (c9630M25137.m25140()) {
                    int i17 = i9;
                    while (true) {
                        if (i9 > 0) {
                            int i18 = i9 - 1;
                            if ((this.f38065[i18] && !this.f38057[i18].m25129()) || (!this.f38065[i18] && !this.f38057[i18].m25132())) {
                                C9630 c9636 = this.f38065[i18] ? this.f38057[i18].f31139 : this.f38057[i18].f31138;
                                if (!c9636.m25140()) {
                                    c9636.m25131(true);
                                } else if (!this.f38065[i18]) {
                                    c9633 = this.f38057[i18].f31139;
                                    if (!c9633.m25140()) {
                                        c9633.m25131(true);
                                        this.f38057[i18].m25131(false);
                                        c9630Arr4 = this.f38057;
                                        C9630 c9637 = c9630Arr4[i18];
                                        c9637.f31139 = c9633.f31138;
                                        c9633.f31138 = c9637;
                                        if (i9 < 2) {
                                            this.f38060 = c9633;
                                        } else {
                                            i8 = i9 - 2;
                                            if (this.f38065[i8]) {
                                                c9630Arr4[i8].f31139 = c9633;
                                            } else {
                                                c9630Arr4[i8].f31138 = c9633;
                                            }
                                        }
                                        c9630Arr4[i9] = c9637;
                                        this.f38065[i9] = false;
                                        c9630Arr4[i18] = c9633;
                                        int i19 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c9633 = c9630Arr4[i9].f31139;
                                        i9 = i19;
                                    }
                                    if (!c9633.m25132()) {
                                        c9633.m25131(false);
                                        i9--;
                                    } else {
                                        c9633.m25131(false);
                                        i9--;
                                    }
                                    if (!c9633.m25129()) {
                                        c9634 = c9633.f31138;
                                        c9634.m25131(true);
                                        c9633.m25131(false);
                                        c9633.f31138 = c9634.f31139;
                                        c9634.f31139 = c9633;
                                        this.f38057[i9 - 1].f31139 = c9634;
                                        if (c9634.m25129()) {
                                            c9634.m25141(false);
                                            c9634.f31139.m25130(c9634);
                                        }
                                        c9633 = c9634;
                                    } else {
                                        c9634 = c9633.f31138;
                                        c9634.m25131(true);
                                        c9633.m25131(false);
                                        c9633.f31138 = c9634.f31139;
                                        c9634.f31139 = c9633;
                                        this.f38057[i9 - 1].f31139 = c9634;
                                        if (c9634.m25129()) {
                                            c9634.m25141(false);
                                            c9634.f31139.m25130(c9634);
                                        }
                                        c9633 = c9634;
                                    }
                                    i6 = i9 - 1;
                                    c9633.m25131(this.f38057[i6].m25140());
                                    this.f38057[i6].m25131(true);
                                    c9633.f31139.m25131(true);
                                    c9630Arr3 = this.f38057;
                                    C9630 c9638 = c9630Arr3[i6];
                                    c9638.f31139 = c9633.f31138;
                                    c9633.f31138 = c9638;
                                    if (i9 < 2) {
                                        this.f38060 = c9633;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f38065[i7]) {
                                            c9630Arr3[i7].f31139 = c9633;
                                        } else {
                                            c9630Arr3[i7].f31138 = c9633;
                                        }
                                    }
                                    if (c9633.m25132()) {
                                        c9633.m25135(false);
                                        this.f38057[i6].m25134(c9633);
                                    }
                                } else {
                                    c9631 = this.f38057[i18].f31138;
                                    if (!c9631.m25140()) {
                                        c9631.m25131(true);
                                        this.f38057[i18].m25131(false);
                                        c9630Arr2 = this.f38057;
                                        C9630 c9639 = c9630Arr2[i18];
                                        c9639.f31138 = c9631.f31139;
                                        c9631.f31139 = c9639;
                                        if (i9 < 2) {
                                            this.f38060 = c9631;
                                        } else {
                                            i5 = i9 - 2;
                                            if (this.f38065[i5]) {
                                                c9630Arr2[i5].f31139 = c9631;
                                            } else {
                                                c9630Arr2[i5].f31138 = c9631;
                                            }
                                        }
                                        c9630Arr2[i9] = c9639;
                                        this.f38065[i9] = true;
                                        c9630Arr2[i18] = c9631;
                                        int i20 = i9 + 1;
                                        if (i17 == i9) {
                                            i17++;
                                        }
                                        c9631 = c9630Arr2[i9].f31138;
                                        i9 = i20;
                                    }
                                    if (!c9631.m25132()) {
                                        c9631.m25131(false);
                                        i9--;
                                    } else {
                                        c9631.m25131(false);
                                        i9--;
                                    }
                                    if (!c9631.m25132()) {
                                        c9632 = c9631.f31139;
                                        c9632.m25131(true);
                                        c9631.m25131(false);
                                        c9631.f31139 = c9632.f31138;
                                        c9632.f31138 = c9631;
                                        this.f38057[i9 - 1].f31138 = c9632;
                                        if (c9632.m25132()) {
                                            c9632.m25135(false);
                                            c9632.f31138.m25134(c9632);
                                        }
                                        c9631 = c9632;
                                    } else {
                                        c9632 = c9631.f31139;
                                        c9632.m25131(true);
                                        c9631.m25131(false);
                                        c9631.f31139 = c9632.f31138;
                                        c9632.f31138 = c9631;
                                        this.f38057[i9 - 1].f31138 = c9632;
                                        if (c9632.m25132()) {
                                            c9632.m25135(false);
                                            c9632.f31138.m25134(c9632);
                                        }
                                        c9631 = c9632;
                                    }
                                    i3 = i9 - 1;
                                    c9631.m25131(this.f38057[i3].m25140());
                                    this.f38057[i3].m25131(true);
                                    c9631.f31138.m25131(true);
                                    c9630Arr = this.f38057;
                                    C9630 c96310 = c9630Arr[i3];
                                    c96310.f31138 = c9631.f31139;
                                    c9631.f31139 = c96310;
                                    if (i9 < 2) {
                                        this.f38060 = c9631;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f38065[i4]) {
                                            c9630Arr[i4].f31139 = c9631;
                                        } else {
                                            c9630Arr[i4].f31138 = c9631;
                                        }
                                    }
                                    if (c9631.m25129()) {
                                        c9631.m25141(false);
                                        this.f38057[i3].m25130(c9631);
                                    }
                                }
                            } else if (!this.f38065[i18]) {
                                c9633 = this.f38057[i18].f31139;
                                if (!c9633.m25140()) {
                                    c9633.m25131(true);
                                    this.f38057[i18].m25131(false);
                                    c9630Arr4 = this.f38057;
                                    C9630 c96311 = c9630Arr4[i18];
                                    c96311.f31139 = c9633.f31138;
                                    c9633.f31138 = c96311;
                                    if (i9 < 2) {
                                        this.f38060 = c9633;
                                    } else {
                                        i8 = i9 - 2;
                                        if (this.f38065[i8]) {
                                            c9630Arr4[i8].f31139 = c9633;
                                        } else {
                                            c9630Arr4[i8].f31138 = c9633;
                                        }
                                    }
                                    c9630Arr4[i9] = c96311;
                                    this.f38065[i9] = false;
                                    c9630Arr4[i18] = c9633;
                                    int i110 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c9633 = c9630Arr4[i9].f31139;
                                    i9 = i110;
                                }
                                if ((!c9633.m25132() || c9633.f31138.m25140()) && (c9633.m25129() || c9633.f31139.m25140())) {
                                    c9633.m25131(false);
                                    i9--;
                                } else {
                                    if (!c9633.m25129() || c9633.f31139.m25140()) {
                                        c9634 = c9633.f31138;
                                        c9634.m25131(true);
                                        c9633.m25131(false);
                                        c9633.f31138 = c9634.f31139;
                                        c9634.f31139 = c9633;
                                        this.f38057[i9 - 1].f31139 = c9634;
                                        if (c9634.m25129()) {
                                            c9634.m25141(false);
                                            c9634.f31139.m25130(c9634);
                                        }
                                        c9633 = c9634;
                                    }
                                    i6 = i9 - 1;
                                    c9633.m25131(this.f38057[i6].m25140());
                                    this.f38057[i6].m25131(true);
                                    c9633.f31139.m25131(true);
                                    c9630Arr3 = this.f38057;
                                    C9630 c96312 = c9630Arr3[i6];
                                    c96312.f31139 = c9633.f31138;
                                    c9633.f31138 = c96312;
                                    if (i9 < 2) {
                                        this.f38060 = c9633;
                                    } else {
                                        i7 = i9 - 2;
                                        if (this.f38065[i7]) {
                                            c9630Arr3[i7].f31139 = c9633;
                                        } else {
                                            c9630Arr3[i7].f31138 = c9633;
                                        }
                                    }
                                    if (c9633.m25132()) {
                                        c9633.m25135(false);
                                        this.f38057[i6].m25134(c9633);
                                    }
                                }
                            } else {
                                c9631 = this.f38057[i18].f31138;
                                if (!c9631.m25140()) {
                                    c9631.m25131(true);
                                    this.f38057[i18].m25131(false);
                                    c9630Arr2 = this.f38057;
                                    C9630 c96313 = c9630Arr2[i18];
                                    c96313.f31138 = c9631.f31139;
                                    c9631.f31139 = c96313;
                                    if (i9 < 2) {
                                        this.f38060 = c9631;
                                    } else {
                                        i5 = i9 - 2;
                                        if (this.f38065[i5]) {
                                            c9630Arr2[i5].f31139 = c9631;
                                        } else {
                                            c9630Arr2[i5].f31138 = c9631;
                                        }
                                    }
                                    c9630Arr2[i9] = c96313;
                                    this.f38065[i9] = true;
                                    c9630Arr2[i18] = c9631;
                                    int i21 = i9 + 1;
                                    if (i17 == i9) {
                                        i17++;
                                    }
                                    c9631 = c9630Arr2[i9].f31138;
                                    i9 = i21;
                                }
                                if ((!c9631.m25132() || c9631.f31138.m25140()) && (c9631.m25129() || c9631.f31139.m25140())) {
                                    c9631.m25131(false);
                                    i9--;
                                } else {
                                    if (!c9631.m25132() || c9631.f31138.m25140()) {
                                        c9632 = c9631.f31139;
                                        c9632.m25131(true);
                                        c9631.m25131(false);
                                        c9631.f31139 = c9632.f31138;
                                        c9632.f31138 = c9631;
                                        this.f38057[i9 - 1].f31138 = c9632;
                                        if (c9632.m25132()) {
                                            c9632.m25135(false);
                                            c9632.f31138.m25134(c9632);
                                        }
                                        c9631 = c9632;
                                    }
                                    i3 = i9 - 1;
                                    c9631.m25131(this.f38057[i3].m25140());
                                    this.f38057[i3].m25131(true);
                                    c9631.f31138.m25131(true);
                                    c9630Arr = this.f38057;
                                    C9630 c96314 = c9630Arr[i3];
                                    c96314.f31138 = c9631.f31139;
                                    c9631.f31139 = c96314;
                                    if (i9 < 2) {
                                        this.f38060 = c9631;
                                    } else {
                                        i4 = i9 - 2;
                                        if (this.f38065[i4]) {
                                            c9630Arr[i4].f31139 = c9631;
                                        } else {
                                            c9630Arr[i4].f31138 = c9631;
                                        }
                                    }
                                    if (c9631.m25129()) {
                                        c9631.m25141(false);
                                        this.f38057[i3].m25130(c9631);
                                    }
                                }
                            }
                        }
                        i9 = i17;
                        C9630 c96315 = this.f38060;
                        if (c96315 != null) {
                            c96315.m25131(true);
                        }
                    }
                }
                this.f38061 = true;
                this.f38062--;
                while (true) {
                    int i22 = i9 - 1;
                    if (i9 != 0) {
                        this.f38057[i22] = null;
                        i9 = i22;
                    } else {
                        return c9630M25137.f3593;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C2086 c2086 = new C2086(this);
        int i = this.f38062;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C17359.equals(c2086.m16946().f3593, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f38062 = 0;
        this.f38060 = null;
        this.f38063 = null;
        this.f38058 = null;
        this.f38059 = null;
        this.f38064 = null;
        this.f38056 = null;
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        return m29554(i) != null;
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f38062;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f38062 == 0;
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        C9630 c9630M29554 = m29554(i);
        if (c9630M29554 == null) {
            return null;
        }
        return c9630M29554.f3593;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13474() {
        if (this.f38060 == null) {
            throw new NoSuchElementException();
        }
        return this.f38056.f3592;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۡ */
    public final int mo13469() {
        if (this.f38060 == null) {
            throw new NoSuchElementException();
        }
        return this.f38064.f3592;
    }

    @Override // l.AbstractC8448, l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC9257 mo13468() {
        if (this.f38063 == null) {
            this.f38063 = new C10376(this);
        }
        return this.f38063;
    }

    @Override // l.AbstractC8448, java.util.Map, l.InterfaceC25207, java.util.SortedMap
    public final InterfaceC16695 keySet() {
        if (this.f38059 == null) {
            this.f38059 = new C7394(this);
        }
        return this.f38059;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f38058 == null) {
            this.f38058 = new C1428(this);
        }
        return this.f38058;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC25207 mo13472(int i) {
        return new C13272(this, 0, true, i, false);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC25207 mo13475(int i) {
        return new C13272(this, i, false, 0, true);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC25207 mo13473(int i, int i2) {
        return new C13272(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C11780 c11780 = (C11780) super.clone();
            c11780.f38059 = null;
            c11780.f38058 = null;
            c11780.f38063 = null;
            c11780.f38065 = new boolean[64];
            c11780.f38057 = new C9630[64];
            if (this.f38062 != 0) {
                C9630 c9630 = new C9630();
                C9630 c9631 = new C9630();
                C9630 c9632 = this.f38060;
                c9630.f31140 &= -1073741825;
                c9630.f31138 = c9632;
                c9631.m25130((C9630) null);
                C9630 c9633 = c9631;
                loop0: while (true) {
                    if (!c9630.m25132()) {
                        C9630 c9630Clone = c9630.f31138.clone();
                        c9630Clone.m25130(c9633.f31138);
                        c9630Clone.m25134(c9633);
                        c9633.f31140 &= -1073741825;
                        c9633.f31138 = c9630Clone;
                        c9630 = c9630.f31138;
                        c9633 = c9630Clone;
                    } else {
                        while (c9630.m25129()) {
                            c9630 = c9630.f31139;
                            if (c9630 == null) {
                                break loop0;
                            }
                            c9633 = c9633.f31139;
                        }
                        c9630 = c9630.f31139;
                        c9633 = c9633.f31139;
                    }
                    if (!c9630.m25129()) {
                        C9630 c9630Clone2 = c9630.f31139.clone();
                        c9630Clone2.m25134(c9633.f31139);
                        c9630Clone2.m25130(c9633);
                        c9633.m25139(c9630Clone2);
                    }
                }
                c9633.f31139 = null;
                C9630 c9634 = c9631.f31138;
                c11780.f38060 = c9634;
                c11780.f38056 = c9634;
                while (true) {
                    C9630 c9635 = c11780.f38056.f31138;
                    if (c9635 == null) {
                        break;
                    }
                    c11780.f38056 = c9635;
                }
                c11780.f38064 = c11780.f38060;
                while (true) {
                    C9630 c9636 = c11780.f38064.f31139;
                    if (c9636 == null) {
                        break;
                    }
                    c11780.f38064 = c9636;
                }
            }
            return c11780;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f38062;
        C2919 c2919 = new C2919(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C9630 c9630M16946 = c2919.m16946();
            objectOutputStream.writeInt(c9630M16946.f3592);
            objectOutputStream.writeObject(c9630M16946.f3593);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9630 m29553(ObjectInputStream objectInputStream, int i, C9630 c9630, C9630 c9631) {
        if (i == 1) {
            C9630 c9632 = new C9630(objectInputStream.readInt(), objectInputStream.readObject());
            c9632.m25130(c9630);
            c9632.m25134(c9631);
            c9632.m25131(true);
            return c9632;
        }
        if (i == 2) {
            C9630 c9633 = new C9630(objectInputStream.readInt(), objectInputStream.readObject());
            c9633.m25131(true);
            c9633.m25139(new C9630(objectInputStream.readInt(), objectInputStream.readObject()));
            c9633.f31139.m25130(c9633);
            c9633.m25130(c9630);
            c9633.f31139.m25134(c9631);
            return c9633;
        }
        int i2 = i / 2;
        C9630 c9634 = new C9630();
        C9630 c9630M29553 = m29553(objectInputStream, (i - i2) - 1, c9630, c9634);
        c9634.f31140 &= -1073741825;
        c9634.f31138 = c9630M29553;
        c9634.f3592 = objectInputStream.readInt();
        c9634.f3593 = objectInputStream.readObject();
        c9634.m25131(true);
        c9634.m25139(m29553(objectInputStream, i2, c9634, c9631));
        int i3 = i + 2;
        if (i3 == ((-i3) & i3)) {
            c9634.f31139.m25131(false);
        }
        return c9634;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f38065 = new boolean[64];
        this.f38057 = new C9630[64];
        int i = this.f38062;
        if (i != 0) {
            C9630 c9630M29553 = m29553(objectInputStream, i, null, null);
            this.f38060 = c9630M29553;
            while (c9630M29553.m25133() != null) {
                c9630M29553 = c9630M29553.m25133();
            }
            this.f38056 = c9630M29553;
            C9630 c9630M25137 = this.f38060;
            while (c9630M25137.m25137() != null) {
                c9630M25137 = c9630M25137.m25137();
            }
            this.f38064 = c9630M25137;
        }
    }
}
