package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13867 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6043 f45708;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f45712;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f45713 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3013[] f45710 = new C3013[8];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45715 = 7;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f45709 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45714 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45711 = 4096;

    public C13867(C6043 c6043) {
        this.f45708 = c6043;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m33702(int i) {
        int i2;
        if (i > 0) {
            int length = this.f45710.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f45715;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f45710[length].f11267;
                i -= i4;
                this.f45714 -= i4;
                this.f45709--;
                i3++;
                length--;
            }
            C3013[] c3013Arr = this.f45710;
            int i5 = i2 + 1;
            System.arraycopy(c3013Arr, i5, c3013Arr, i5 + i3, this.f45709);
            C3013[] c3013Arr2 = this.f45710;
            int i6 = this.f45715 + 1;
            Arrays.fill(c3013Arr2, i6, i6 + i3, (Object) null);
            this.f45715 += i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33701(C3013 c3013) {
        int i = c3013.f11267;
        int i2 = this.f45711;
        if (i > i2) {
            Arrays.fill(this.f45710, (Object) null);
            this.f45715 = this.f45710.length - 1;
            this.f45709 = 0;
            this.f45714 = 0;
            return;
        }
        m33702((this.f45714 + i) - i2);
        int i3 = this.f45709 + 1;
        C3013[] c3013Arr = this.f45710;
        if (i3 > c3013Arr.length) {
            C3013[] c3013Arr2 = new C3013[c3013Arr.length * 2];
            System.arraycopy(c3013Arr, 0, c3013Arr2, c3013Arr.length, c3013Arr.length);
            this.f45715 = this.f45710.length - 1;
            this.f45710 = c3013Arr2;
        }
        int i4 = this.f45715;
        this.f45715 = i4 - 1;
        this.f45710[i4] = c3013;
        this.f45709++;
        this.f45714 += i;
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
    public final void m33705(ArrayList arrayList) {
        int length;
        int length2;
        C14511 c14511;
        int i;
        int length3;
        if (this.f45712) {
            int i2 = this.f45713;
            if (i2 < this.f45711) {
                m33704(i2, 31, 32);
            }
            this.f45712 = false;
            this.f45713 = Integer.MAX_VALUE;
            m33704(this.f45711, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3013 c3013 = (C3013) arrayList.get(i3);
            C14511 c14511Mo34949 = c3013.f11269.mo34949();
            C14511 c14512 = c3013.f11268;
            Integer num = (Integer) C11750.f39477.get(c14511Mo34949);
            if (num != null) {
                int iIntValue = num.intValue();
                length = iIntValue + 1;
                if (length > 1 && length < 8) {
                    C3013[] c3013Arr = C11750.f39478;
                    if (C0140.m1235(c3013Arr[iIntValue].f11268, c14512)) {
                        length2 = length;
                    } else if (C0140.m1235(c3013Arr[length].f11268, c14512)) {
                        length = iIntValue + 2;
                        length2 = length;
                    }
                }
                if (length == -1) {
                    length3 = this.f45710.length;
                    for (i = this.f45715 + 1; i < length3; i++) {
                        if (!C0140.m1235(this.f45710[i].f11269, c14511Mo34949)) {
                            if (C0140.m1235(this.f45710[i].f11268, c14512)) {
                                length = (i - this.f45715) + C11750.f39478.length;
                                break;
                            } else if (length2 == -1) {
                                length2 = (i - this.f45715) + C11750.f39478.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    m33704(length, 127, 128);
                } else if (length2 == -1) {
                    this.f45708.m16434writeByte(64);
                    m33706(c14511Mo34949);
                    m33706(c14512);
                    m33701(c3013);
                } else {
                    c14511 = C3013.f11262;
                    c14511Mo34949.getClass();
                    if (!c14511Mo34949.mo34943(c14511, c14511.mo34938()) && !C3013.f11266.equals(c14511Mo34949)) {
                        m33704(length2, 15, 0);
                        m33706(c14512);
                    } else {
                        m33704(length2, 63, 64);
                        m33706(c14512);
                        m33701(c3013);
                    }
                }
            } else {
                length = -1;
            }
            length2 = length;
            length = -1;
            if (length == -1) {
                length3 = this.f45710.length;
                while (i < length3) {
                    if (!C0140.m1235(this.f45710[i].f11269, c14511Mo34949)) {
                        if (C0140.m1235(this.f45710[i].f11268, c14512)) {
                            length = (i - this.f45715) + C11750.f39478.length;
                            break;
                        } else if (length2 == -1) {
                            length2 = (i - this.f45715) + C11750.f39478.length;
                        }
                    }
                }
            }
            if (length != -1) {
                m33704(length, 127, 128);
            } else if (length2 == -1) {
                this.f45708.m16434writeByte(64);
                m33706(c14511Mo34949);
                m33706(c14512);
                m33701(c3013);
            } else {
                c14511 = C3013.f11262;
                c14511Mo34949.getClass();
                if (!c14511Mo34949.mo34943(c14511, c14511.mo34938())) {
                    m33704(length2, 63, 64);
                    m33706(c14512);
                    m33701(c3013);
                } else {
                    m33704(length2, 63, 64);
                    m33706(c14512);
                    m33701(c3013);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33704(int i, int i2, int i3) {
        C6043 c6043 = this.f45708;
        if (i < i2) {
            c6043.m16434writeByte(i | i3);
            return;
        }
        c6043.m16434writeByte(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6043.m16434writeByte(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6043.m16434writeByte(i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33706(C14511 c14511) {
        C1871.m6066().getClass();
        int iM6065 = C1871.m6065(c14511);
        int iMo34938 = c14511.mo34938();
        C6043 c6043 = this.f45708;
        if (iM6065 < iMo34938) {
            C6043 c6044 = new C6043();
            C1871.m6066().getClass();
            C1871.m6067(c14511, c6044);
            C14511 c14511M16398 = c6044.m16398();
            m33704(c14511M16398.mo34938(), 127, 128);
            c6043.m16412(c14511M16398);
            return;
        }
        m33704(c14511.mo34938(), 127, 0);
        c6043.m16412(c14511);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33703(int i) {
        int iMin = Math.min(i, 16384);
        int i2 = this.f45711;
        if (i2 == iMin) {
            return;
        }
        if (iMin < i2) {
            this.f45713 = Math.min(this.f45713, iMin);
        }
        this.f45712 = true;
        this.f45711 = iMin;
        int i3 = this.f45714;
        if (iMin < i3) {
            if (iMin == 0) {
                Arrays.fill(this.f45710, (Object) null);
                this.f45715 = this.f45710.length - 1;
                this.f45709 = 0;
                this.f45714 = 0;
                return;
            }
            m33702(i3 - iMin);
        }
    }
}
