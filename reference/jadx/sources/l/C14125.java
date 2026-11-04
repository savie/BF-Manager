package l;

/* JADX INFO: renamed from: l.۬᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8JS */
/* JADX INFO: loaded from: classes4.dex */
public class C14125 implements InterfaceC22024 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f44661;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f44665;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44666;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24929 f44667;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f44668;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f44669;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f44672;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15648 f44673;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44676;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12994 f44677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15648 f44679;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f44680;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15648 f44684;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 f44685;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f44686;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44690;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1448 f44691;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f44692;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2939 f44662 = new C2939();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f44674 = 1000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long[] f44683 = new long[1000];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long[] f44664 = new long[1000];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long[] f44670 = new long[1000];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f44675 = new int[1000];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f44687 = new int[1000];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4870[] f44689 = new C4870[1000];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16780 f44678 = new C16780(new C9650());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f44660 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f44681 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f44682 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f44663 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f44671 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f44688 = true;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private synchronized void m34295() {
        this.f44676 = 0;
        this.f44691.m5214();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m34297(long j, int i, long j2, int i2, C4870 c4870) {
        int i3 = this.f44680;
        if (i3 > 0) {
            int iM34300 = m34300(i3 - 1);
            C20782.m47565(this.f44664[iM34300] + ((long) this.f44687[iM34300]) <= j2);
        }
        this.f44692 = (536870912 & i) != 0;
        this.f44682 = Math.max(this.f44682, j);
        int iM34301 = m34300(this.f44680);
        this.f44670[iM34301] = j;
        this.f44664[iM34301] = j2;
        this.f44687[iM34301] = i2;
        this.f44675[iM34301] = i;
        this.f44689[iM34301] = c4870;
        this.f44683[iM34301] = this.f44669;
        if (this.f44678.m39618() || !((C8905) this.f44678.m39619()).f29091.equals(this.f44673)) {
            C15648 c15648 = this.f44673;
            c15648.getClass();
            InterfaceC24929 interfaceC24929 = this.f44667;
            this.f44678.m39616(m34312(), new C8905(c15648, interfaceC24929 != null ? interfaceC24929.mo6289(this.f44677, c15648) : InterfaceC11502.f36202));
        }
        int i4 = this.f44680 + 1;
        this.f44680 = i4;
        int i5 = this.f44674;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            C4870[] c4870Arr = new C4870[i6];
            int i7 = this.f44668;
            int i8 = i5 - i7;
            System.arraycopy(this.f44664, i7, jArr2, 0, i8);
            System.arraycopy(this.f44670, this.f44668, jArr3, 0, i8);
            System.arraycopy(this.f44675, this.f44668, iArr, 0, i8);
            System.arraycopy(this.f44687, this.f44668, iArr2, 0, i8);
            System.arraycopy(this.f44689, this.f44668, c4870Arr, 0, i8);
            System.arraycopy(this.f44683, this.f44668, jArr, 0, i8);
            int i9 = this.f44668;
            System.arraycopy(this.f44664, 0, jArr2, i8, i9);
            System.arraycopy(this.f44670, 0, jArr3, i8, i9);
            System.arraycopy(this.f44675, 0, iArr, i8, i9);
            System.arraycopy(this.f44687, 0, iArr2, i8, i9);
            System.arraycopy(this.f44689, 0, c4870Arr, i8, i9);
            System.arraycopy(this.f44683, 0, jArr, i8, i9);
            this.f44664 = jArr2;
            this.f44670 = jArr3;
            this.f44675 = iArr;
            this.f44687 = iArr2;
            this.f44689 = c4870Arr;
            this.f44683 = jArr;
            this.f44668 = 0;
            this.f44674 = i6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m34305(long j, boolean z) {
        int iM34300 = m34300(this.f44676);
        int i = this.f44676;
        int i2 = this.f44680;
        if ((i != i2) && j >= this.f44670[iM34300]) {
            if (j > this.f44682 && z) {
                return i2 - i;
            }
            int iM34296 = m34296(iM34300, i2 - i, j, true);
            if (iM34296 == -1) {
                return 0;
            }
            return iM34296;
        }
        return 0;
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo14382(long j) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34311(boolean z) {
        C15648 c15648;
        boolean z2 = false;
        if (this.f44676 != this.f44680) {
            if (((C8905) this.f44678.m39617(m34318())).f29091 != this.f44679) {
                return true;
            }
            return m34299(m34300(this.f44676));
        }
        if (z || this.f44692 || ((c15648 = this.f44673) != null && c15648 != this.f44679)) {
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34314(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f44676 + i <= this.f44680) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        C20782.m47565(z);
        this.f44676 += i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34316() {
        return this.f44692;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C15648 m34317() {
        return this.f44663 ? null : this.f44673;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized long m34320() {
        return this.f44676 != this.f44680 ? this.f44683[m34300(this.f44676)] : this.f44669;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized long m34322() {
        return Math.max(this.f44681, m34301(this.f44676));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized long m34328() {
        return this.f44682;
    }

    public C14125(InterfaceC13314 interfaceC13314, InterfaceC24929 interfaceC24929, C12994 c12994) {
        this.f44667 = interfaceC24929;
        this.f44677 = c12994;
        this.f44691 = new C1448(interfaceC13314);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14381(int i, C21287 c21287) {
        mo14385(c21287, i, 0);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34319() {
        m34325(true);
        InterfaceC10756 interfaceC10756 = this.f44685;
        if (interfaceC10756 != null) {
            interfaceC10756.mo27415(this.f44677);
            this.f44685 = null;
            this.f44679 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34325(boolean z) {
        this.f44691.m5215();
        this.f44680 = 0;
        this.f44666 = 0;
        this.f44668 = 0;
        this.f44676 = 0;
        this.f44671 = true;
        this.f44660 = Long.MIN_VALUE;
        this.f44681 = Long.MIN_VALUE;
        this.f44682 = Long.MIN_VALUE;
        this.f44692 = false;
        this.f44678.m39614();
        if (z) {
            this.f44684 = null;
            this.f44673 = null;
            this.f44663 = true;
            this.f44688 = true;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34315(long j) {
        this.f44660 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34329(long j) {
        this.f44669 = j;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34330() {
        this.f44686 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m34312() {
        return this.f44666 + this.f44680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34308(int i) {
        this.f44691.m5216(m34302(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34321() {
        m34307();
        InterfaceC10756 interfaceC10756 = this.f44685;
        if (interfaceC10756 != null) {
            interfaceC10756.mo27415(this.f44677);
            this.f44685 = null;
            this.f44679 = null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34331() throws C21945 {
        InterfaceC10756 interfaceC10756 = this.f44685;
        if (interfaceC10756 == null || interfaceC10756.getState() != 1) {
            return;
        }
        C21945 error = this.f44685.getError();
        error.getClass();
        throw error;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m34313() {
        return this.f44666;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m34318() {
        return this.f44666 + this.f44676;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34306(C16461 c16461, C5690 c5690, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C2939 c2939 = this.f44662;
        synchronized (this) {
            c5690.f19654 = false;
            i2 = -3;
            if (this.f44676 != this.f44680) {
                C15648 c15648 = ((C8905) this.f44678.m39617(m34318())).f29091;
                if (z2 || c15648 != this.f44679) {
                    m34298(c15648, c16461);
                    i2 = -5;
                } else {
                    int iM34300 = m34300(this.f44676);
                    if (m34299(iM34300)) {
                        c5690.m33307(this.f44675[iM34300]);
                        if (this.f44676 == this.f44680 - 1 && (z || this.f44692)) {
                            c5690.m33309(536870912);
                        }
                        c5690.f19652 = this.f44670[iM34300];
                        c2939.f9620 = this.f44687[iM34300];
                        c2939.f9621 = this.f44664[iM34300];
                        c2939.f9619 = this.f44689[iM34300];
                        i2 = -4;
                    } else {
                        c5690.f19654 = true;
                    }
                }
            } else if (z || this.f44692) {
                c5690.m33307(4);
                c5690.f19652 = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C15648 c15649 = this.f44673;
                if (c15649 != null && (z2 || c15649 != this.f44679)) {
                    m34298(c15649, c16461);
                    i2 = -5;
                }
            }
        }
        if (i2 == -4 && !c5690.m33305()) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    this.f44691.m5213(c5690, this.f44662);
                } else {
                    this.f44691.m5217(c5690, this.f44662);
                }
            }
            if (!z3) {
                this.f44676++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34326(int i) {
        m34295();
        int i2 = this.f44666;
        if (i >= i2 && i <= this.f44680 + i2) {
            this.f44660 = Long.MIN_VALUE;
            this.f44676 = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34327(long j, boolean z) {
        int iM34296;
        try {
            m34295();
            int iM34300 = m34300(this.f44676);
            int i = this.f44676;
            int i2 = this.f44680;
            if ((i != i2) && j >= this.f44670[iM34300] && (j <= this.f44682 || z)) {
                if (this.f44688) {
                    iM34296 = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iM34296) {
                            if (!z) {
                                iM34296 = -1;
                                break;
                            }
                            break;
                        }
                        if (this.f44670[iM34300] >= j) {
                            iM34296 = i3;
                            break;
                        }
                        iM34300++;
                        if (iM34300 == this.f44674) {
                            iM34300 = 0;
                        }
                        i3++;
                    }
                } else {
                    iM34296 = m34296(iM34300, i2 - i, j, true);
                }
                if (iM34296 == -1) {
                    return false;
                }
                this.f44660 = j;
                this.f44676 += iM34296;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34309(long j, boolean z, boolean z2) {
        long jM34303;
        int i;
        C1448 c1448 = this.f44691;
        synchronized (this) {
            try {
                int i2 = this.f44680;
                jM34303 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f44670;
                    int i3 = this.f44668;
                    if (j >= jArr[i3]) {
                        int iM34296 = m34296(i3, (!z2 || (i = this.f44676) == i2) ? i2 : i + 1, j, z);
                        if (iM34296 != -1) {
                            jM34303 = m34303(iM34296);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c1448.m5212(jM34303);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34323() {
        long jM34303;
        C1448 c1448 = this.f44691;
        synchronized (this) {
            int i = this.f44676;
            jM34303 = i == 0 ? -1L : m34303(i);
        }
        c1448.m5212(jM34303);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34307() {
        long jM34303;
        C1448 c1448 = this.f44691;
        synchronized (this) {
            int i = this.f44680;
            jM34303 = i == 0 ? -1L : m34303(i);
        }
        c1448.m5212(jM34303);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34324(long j) {
        if (this.f44665 != j) {
            this.f44665 = j;
            this.f44661 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34310(InterfaceC7414 interfaceC7414) {
        this.f44672 = interfaceC7414;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, l.ۜ᩷᩷] */
    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14384(C15648 c15648) {
        C15648 c15648Mo1260 = mo1260(c15648);
        boolean z = false;
        this.f44661 = false;
        this.f44684 = c15648;
        synchronized (this) {
            this.f44663 = false;
            if (!C17359.equals(c15648Mo1260, this.f44673)) {
                if (this.f44678.m39618() || !((C8905) this.f44678.m39619()).f29091.equals(c15648Mo1260)) {
                    this.f44673 = c15648Mo1260;
                } else {
                    this.f44673 = ((C8905) this.f44678.m39619()).f29091;
                }
                boolean z2 = this.f44688;
                C15648 c15649 = this.f44673;
                this.f44688 = z2 & C9681.m25253(c15649.f50848, c15649.f50836);
                this.f44690 = false;
                z = true;
            }
        }
        ?? r5 = this.f44672;
        if (r5 == 0 || !z) {
            return;
        }
        r5.mo20329();
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final int mo14380(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return this.f44691.m5209(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14386(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return this.f44691.m5209(interfaceC9461, i, z);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14385(C21287 c21287, int i, int i2) {
        this.f44691.m5211(i, c21287);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public void mo14383(long j, int i, int i2, int i3, C4870 c4870) {
        int i4;
        if (this.f44661) {
            C15648 c15648 = this.f44684;
            C20782.m47566(c15648);
            mo14384(c15648);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.f44671) {
            if (!z2) {
                return;
            } else {
                this.f44671 = false;
            }
        }
        long j2 = this.f44665 + j;
        if (!this.f44688) {
            i4 = i;
        } else {
            if (j2 < this.f44660) {
                return;
            }
            if (i5 == 0) {
                if (!this.f44690) {
                    C1896.m6517("Overriding unexpected non-sync sample for format: " + this.f44673);
                    this.f44690 = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f44686) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f44680 == 0) {
                    z = j2 > this.f44681;
                } else if (m34322() >= j2) {
                    z = false;
                } else {
                    int i6 = this.f44680;
                    int iM34300 = m34300(i6 - 1);
                    while (i6 > this.f44676 && this.f44670[iM34300] >= j2) {
                        i6--;
                        iM34300--;
                        if (iM34300 == -1) {
                            iM34300 = this.f44674 - 1;
                        }
                    }
                    m34302(this.f44666 + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.f44686 = false;
            }
        }
        m34297(j2, i4, (this.f44691.m5210() - ((long) i2)) - ((long) i3), i2, c4870);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34304() {
        this.f44661 = true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public C15648 mo1260(C15648 c15648) {
        if (this.f44665 == 0 || c15648.f50837 == C25227.FOREVER_NS) {
            return c15648;
        }
        C20124 c20124M37397 = c15648.m37397();
        c20124M37397.m46298(c15648.f50837 + this.f44665);
        return c20124M37397.m46295();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private long m34302(int i) {
        int iM34312 = m34312() - i;
        boolean z = false;
        C20782.m47565(iM34312 >= 0 && iM34312 <= this.f44680 - this.f44676);
        int i2 = this.f44680 - iM34312;
        this.f44680 = i2;
        this.f44682 = Math.max(this.f44681, m34301(i2));
        if (iM34312 == 0 && this.f44692) {
            z = true;
        }
        this.f44692 = z;
        this.f44678.m39615(i);
        int i3 = this.f44680;
        if (i3 == 0) {
            return 0L;
        }
        int iM34300 = m34300(i3 - 1);
        return this.f44664[iM34300] + ((long) this.f44687[iM34300]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34298(C15648 c15648, C16461 c16461) {
        C15648 c15649 = this.f44679;
        boolean z = c15649 == null;
        C22362 c22362 = c15649 == null ? null : c15649.f50838;
        this.f44679 = c15648;
        C22362 c22363 = c15648.f50838;
        InterfaceC24929 interfaceC24929 = this.f44667;
        c16461.f53378 = interfaceC24929 != null ? c15648.m37396(interfaceC24929.mo6285(c15648)) : c15648;
        c16461.f53377 = this.f44685;
        if (interfaceC24929 == null) {
            return;
        }
        if (z || !C17359.equals(c22362, c22363)) {
            InterfaceC10756 interfaceC10756 = this.f44685;
            C12994 c12994 = this.f44677;
            InterfaceC10756 interfaceC10756Mo6286 = interfaceC24929.mo6286(c12994, c15648);
            this.f44685 = interfaceC10756Mo6286;
            c16461.f53377 = interfaceC10756Mo6286;
            if (interfaceC10756 != null) {
                interfaceC10756.mo27415(c12994);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m34299(int i) {
        InterfaceC10756 interfaceC10756 = this.f44685;
        if (interfaceC10756 == null || interfaceC10756.getState() == 4) {
            return true;
        }
        return (this.f44675[i] & 1073741824) == 0 && this.f44685.mo27416();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m34296(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f44670[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f44675[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f44674) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m34303(int i) {
        this.f44681 = Math.max(this.f44681, m34301(i));
        this.f44680 -= i;
        int i2 = this.f44666 + i;
        this.f44666 = i2;
        int i3 = this.f44668 + i;
        this.f44668 = i3;
        int i4 = this.f44674;
        if (i3 >= i4) {
            this.f44668 = i3 - i4;
        }
        int i5 = this.f44676 - i;
        this.f44676 = i5;
        if (i5 < 0) {
            this.f44676 = 0;
        }
        this.f44678.m39620(i2);
        if (this.f44680 == 0) {
            int i6 = this.f44668;
            if (i6 == 0) {
                i6 = this.f44674;
            }
            int i7 = i6 - 1;
            return this.f44664[i7] + ((long) this.f44687[i7]);
        }
        return this.f44664[this.f44668];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m34301(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM34300 = m34300(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f44670[iM34300]);
            if ((this.f44675[iM34300] & 1) != 0) {
                return jMax;
            }
            iM34300--;
            if (iM34300 == -1) {
                iM34300 = this.f44674 - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m34300(int i) {
        int i2 = this.f44668 + i;
        int i3 = this.f44674;
        return i2 < i3 ? i2 : i2 - i3;
    }
}
