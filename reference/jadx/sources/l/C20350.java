package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20350 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65277;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1879 f65278;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f65276 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23334[] f65275 = new C23334[8];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65279 = 7;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65282 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f65281 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f65280 = 4096;

    public C20350(C1879 c1879) {
        this.f65278 = c1879;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m46763(int i) {
        int i2;
        if (i > 0) {
            int length = this.f65275.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f65279;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f65275[length].f75576;
                i -= i4;
                this.f65281 -= i4;
                this.f65282--;
                i3++;
                length--;
            }
            C23334[] c23334Arr = this.f65275;
            int i5 = i2 + 1;
            System.arraycopy(c23334Arr, i5, c23334Arr, i5 + i3, this.f65282);
            C23334[] c23334Arr2 = this.f65275;
            int i6 = this.f65279 + 1;
            Arrays.fill(c23334Arr2, i6, i6 + i3, (Object) null);
            this.f65279 += i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46762(C23334 c23334) {
        int i = c23334.f75576;
        int i2 = this.f65280;
        if (i > i2) {
            Arrays.fill(this.f65275, (Object) null);
            this.f65279 = this.f65275.length - 1;
            this.f65282 = 0;
            this.f65281 = 0;
            return;
        }
        m46763((this.f65281 + i) - i2);
        int i3 = this.f65282 + 1;
        C23334[] c23334Arr = this.f65275;
        if (i3 > c23334Arr.length) {
            C23334[] c23334Arr2 = new C23334[c23334Arr.length * 2];
            System.arraycopy(c23334Arr, 0, c23334Arr2, c23334Arr.length, c23334Arr.length);
            this.f65279 = this.f65275.length - 1;
            this.f65275 = c23334Arr2;
        }
        int i4 = this.f65279;
        this.f65279 = i4 - 1;
        this.f65275[i4] = c23334;
        this.f65282++;
        this.f65281 += i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46766(ArrayList arrayList) {
        int length;
        int length2;
        C16794 c16794;
        int i;
        int length3;
        if (this.f65277) {
            int i2 = this.f65276;
            if (i2 < this.f65280) {
                m46765(i2, 31, 32);
            }
            this.f65277 = false;
            this.f65276 = Integer.MAX_VALUE;
            m46765(this.f65280, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C23334 c23334 = (C23334) arrayList.get(i3);
            C16794 c16794Mo23093 = c23334.f75578.mo23093();
            C16794 c16795 = c23334.f75577;
            Integer num = (Integer) C12145.f39053.get(c16794Mo23093);
            if (num != null) {
                int iIntValue = num.intValue();
                length = iIntValue + 1;
                if (length > 1 && length < 8) {
                    C23334[] c23334Arr = C12145.f39054;
                    if (C19822.m45605(c23334Arr[iIntValue].f75577, c16795)) {
                        length2 = length;
                    } else if (C19822.m45605(c23334Arr[length].f75577, c16795)) {
                        length = iIntValue + 2;
                        length2 = length;
                    }
                }
                if (length == -1) {
                    length3 = this.f65275.length;
                    for (i = this.f65279 + 1; i < length3; i++) {
                        if (!C19822.m45605(this.f65275[i].f75578, c16794Mo23093)) {
                            if (C19822.m45605(this.f65275[i].f75577, c16795)) {
                                length = (i - this.f65279) + C12145.f39054.length;
                                break;
                            } else if (length2 == -1) {
                                length2 = (i - this.f65279) + C12145.f39054.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    m46765(length, 127, 128);
                } else if (length2 == -1) {
                    this.f65278.m6455writeByte(64);
                    m46767(c16794Mo23093);
                    m46767(c16795);
                    m46762(c23334);
                } else {
                    c16794 = C23334.f75575;
                    c16794Mo23093.getClass();
                    if (!c16794Mo23093.mo23086(c16794, c16794.mo23081()) && !C23334.f75573.equals(c16794Mo23093)) {
                        m46765(length2, 15, 0);
                        m46767(c16795);
                    } else {
                        m46765(length2, 63, 64);
                        m46767(c16795);
                        m46762(c23334);
                    }
                }
            } else {
                length = -1;
            }
            length2 = length;
            length = -1;
            if (length == -1) {
                length3 = this.f65275.length;
                while (i < length3) {
                    if (!C19822.m45605(this.f65275[i].f75578, c16794Mo23093)) {
                        if (C19822.m45605(this.f65275[i].f75577, c16795)) {
                            length = (i - this.f65279) + C12145.f39054.length;
                            break;
                        } else if (length2 == -1) {
                            length2 = (i - this.f65279) + C12145.f39054.length;
                        }
                    }
                }
            }
            if (length != -1) {
                m46765(length, 127, 128);
            } else if (length2 == -1) {
                this.f65278.m6455writeByte(64);
                m46767(c16794Mo23093);
                m46767(c16795);
                m46762(c23334);
            } else {
                c16794 = C23334.f75575;
                c16794Mo23093.getClass();
                if (!c16794Mo23093.mo23086(c16794, c16794.mo23081())) {
                    m46765(length2, 63, 64);
                    m46767(c16795);
                    m46762(c23334);
                } else {
                    m46765(length2, 63, 64);
                    m46767(c16795);
                    m46762(c23334);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46765(int i, int i2, int i3) {
        C1879 c1879 = this.f65278;
        if (i < i2) {
            c1879.m6455writeByte(i | i3);
            return;
        }
        c1879.m6455writeByte(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c1879.m6455writeByte(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c1879.m6455writeByte(i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46767(C16794 c16794) {
        C17256.m40515().getClass();
        int iM40514 = C17256.m40514(c16794);
        int iMo23081 = c16794.mo23081();
        C1879 c1879 = this.f65278;
        if (iM40514 < iMo23081) {
            C1879 c18710 = new C1879();
            C17256.m40515().getClass();
            C17256.m40516(c16794, c18710);
            C16794 c16794M6443 = c18710.m6443();
            m46765(c16794M6443.mo23081(), 127, 128);
            c1879.m6441(c16794M6443);
            return;
        }
        m46765(c16794.mo23081(), 127, 0);
        c1879.m6441(c16794);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46764(int i) {
        int iMin = Math.min(i, 16384);
        int i2 = this.f65280;
        if (i2 == iMin) {
            return;
        }
        if (iMin < i2) {
            this.f65276 = Math.min(this.f65276, iMin);
        }
        this.f65277 = true;
        this.f65280 = iMin;
        int i3 = this.f65281;
        if (iMin < i3) {
            if (iMin == 0) {
                Arrays.fill(this.f65275, (Object) null);
                this.f65279 = this.f65275.length - 1;
                this.f65282 = 0;
                this.f65281 = 0;
                return;
            }
            m46763(i3 - iMin);
        }
    }
}
