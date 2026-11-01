package l;

/* JADX INFO: renamed from: l.ᩳۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8JS */
/* JADX INFO: loaded from: classes5.dex */
public class C18033 implements InterfaceC8011 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21200 f57654;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f57658;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 f57659;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7648 f57660;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3921 f57662;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f57664;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f57665;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f57666;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f57667;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC16967 f57670;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7648 f57676;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f57677;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f57678;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f57679;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f57681;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7648 f57683;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f57684;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f57685;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22973 f57657 = new C22973();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f57668 = 1000;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long[] f57653 = new long[1000];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long[] f57663 = new long[1000];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long[] f57669 = new long[1000];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f57661 = new int[1000];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f57680 = new int[1000];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18594[] f57656 = new C18594[1000];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12390 f57674 = new C12390(new C6744());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f57675 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f57673 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f57682 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f57672 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f57655 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f57671 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m41987(long j, int i, long j2, int i2, C18594 c18594) {
        int i3 = this.f57677;
        if (i3 > 0) {
            int iM41984 = m41984(i3 - 1);
            C2023.m6507(this.f57663[iM41984] + ((long) this.f57680[iM41984]) <= j2);
        }
        this.f57684 = (536870912 & i) != 0;
        this.f57682 = Math.max(this.f57682, j);
        int iM41985 = m41984(this.f57677);
        this.f57669[iM41985] = j;
        this.f57663[iM41985] = j2;
        this.f57680[iM41985] = i2;
        this.f57661[iM41985] = i;
        this.f57656[iM41985] = c18594;
        this.f57653[iM41985] = this.f57665;
        if (this.f57674.m30815() || !((C15212) this.f57674.m30816()).f49619.equals(this.f57660)) {
            C7648 c7648 = this.f57660;
            c7648.getClass();
            InterfaceC16967 interfaceC16967 = this.f57670;
            this.f57674.m30813(m42009(), new C15212(c7648, interfaceC16967 != null ? interfaceC16967.mo39760(this.f57654, c7648) : InterfaceC0738.f3028));
        }
        int i4 = this.f57677 + 1;
        this.f57677 = i4;
        int i5 = this.f57668;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            C18594[] c18594Arr = new C18594[i6];
            int i7 = this.f57666;
            int i8 = i5 - i7;
            System.arraycopy(this.f57663, i7, jArr2, 0, i8);
            System.arraycopy(this.f57669, this.f57666, jArr3, 0, i8);
            System.arraycopy(this.f57661, this.f57666, iArr, 0, i8);
            System.arraycopy(this.f57680, this.f57666, iArr2, 0, i8);
            System.arraycopy(this.f57656, this.f57666, c18594Arr, 0, i8);
            System.arraycopy(this.f57653, this.f57666, jArr, 0, i8);
            int i9 = this.f57666;
            System.arraycopy(this.f57663, 0, jArr2, i8, i9);
            System.arraycopy(this.f57669, 0, jArr3, i8, i9);
            System.arraycopy(this.f57661, 0, iArr, i8, i9);
            System.arraycopy(this.f57680, 0, iArr2, i8, i9);
            System.arraycopy(this.f57656, 0, c18594Arr, i8, i9);
            System.arraycopy(this.f57653, 0, jArr, i8, i9);
            this.f57663 = jArr2;
            this.f57669 = jArr3;
            this.f57661 = iArr;
            this.f57680 = iArr2;
            this.f57656 = c18594Arr;
            this.f57653 = jArr;
            this.f57666 = 0;
            this.f57668 = i6;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private synchronized void m41990() {
        this.f57664 = 0;
        this.f57662.m11378();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C7648 m41993() {
        return this.f57672 ? null : this.f57660;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized long m41994() {
        return this.f57682;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m41997(long j, boolean z) {
        int iM41984 = m41984(this.f57664);
        int i = this.f57664;
        int i2 = this.f57677;
        if ((i != i2) && j >= this.f57669[iM41984]) {
            if (j > this.f57682 && z) {
                return i2 - i;
            }
            int iM41986 = m41986(iM41984, i2 - i, j, true);
            if (iM41986 == -1) {
                return 0;
            }
            return iM41986;
        }
        return 0;
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo8113(long j) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42003(boolean z) {
        C7648 c7648;
        boolean z2 = false;
        if (this.f57664 != this.f57677) {
            if (((C15212) this.f57674.m30814(m42019())).f49619 != this.f57683) {
                return true;
            }
            return m41991(m41984(this.f57664));
        }
        if (z || this.f57684 || ((c7648 = this.f57660) != null && c7648 != this.f57683)) {
            z2 = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized long m42004() {
        return Math.max(this.f57673, m41992(this.f57664));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42005() {
        return this.f57684;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42007(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f57664 + i <= this.f57677) {
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
        C2023.m6507(z);
        this.f57664 += i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized long m42015() {
        return this.f57664 != this.f57677 ? this.f57653[m41984(this.f57664)] : this.f57665;
    }

    public C18033(InterfaceC15732 interfaceC15732, InterfaceC16967 interfaceC16967, C21200 c21200) {
        this.f57670 = interfaceC16967;
        this.f57654 = c21200;
        this.f57662 = new C3921(interfaceC15732);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8112(int i, C2460 c2460) {
        mo8115(c2460, i, 0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m42016() {
        m42012(true);
        InterfaceC19790 interfaceC19790 = this.f57659;
        if (interfaceC19790 != null) {
            interfaceC19790.mo28386(this.f57654);
            this.f57659 = null;
            this.f57683 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42012(boolean z) {
        this.f57662.m11379();
        this.f57677 = 0;
        this.f57658 = 0;
        this.f57666 = 0;
        this.f57664 = 0;
        this.f57655 = true;
        this.f57675 = Long.MIN_VALUE;
        this.f57673 = Long.MIN_VALUE;
        this.f57682 = Long.MIN_VALUE;
        this.f57684 = false;
        this.f57674.m30811();
        if (z) {
            this.f57676 = null;
            this.f57660 = null;
            this.f57672 = true;
            this.f57671 = true;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42008(long j) {
        this.f57675 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m41995(long j) {
        this.f57665 = j;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m42017() {
        this.f57679 = true;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m42009() {
        return this.f57658 + this.f57677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42000(int i) {
        this.f57662.m11380(m41989(i));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42018() {
        m41999();
        InterfaceC19790 interfaceC19790 = this.f57659;
        if (interfaceC19790 != null) {
            interfaceC19790.mo28386(this.f57654);
            this.f57659 = null;
            this.f57683 = null;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m42020() throws C8501 {
        InterfaceC19790 interfaceC19790 = this.f57659;
        if (interfaceC19790 == null || interfaceC19790.getState() != 1) {
            return;
        }
        C8501 error = this.f57659.getError();
        error.getClass();
        throw error;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m42006() {
        return this.f57658;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m42019() {
        return this.f57658 + this.f57664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41998(C12526 c12526, C16033 c16033, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C22973 c22973 = this.f57657;
        synchronized (this) {
            c16033.f51915 = false;
            i2 = -3;
            if (this.f57664 != this.f57677) {
                C7648 c7648 = ((C15212) this.f57674.m30814(m42019())).f49619;
                if (z2 || c7648 != this.f57683) {
                    m41988(c7648, c12526);
                    i2 = -5;
                } else {
                    int iM41984 = m41984(this.f57664);
                    if (m41991(iM41984)) {
                        c16033.m42267(this.f57661[iM41984]);
                        if (this.f57664 == this.f57677 - 1 && (z || this.f57684)) {
                            c16033.m42270(536870912);
                        }
                        c16033.f51910 = this.f57669[iM41984];
                        c22973.f74676 = this.f57680[iM41984];
                        c22973.f74677 = this.f57663[iM41984];
                        c22973.f74675 = this.f57656[iM41984];
                        i2 = -4;
                    } else {
                        c16033.f51915 = true;
                    }
                }
            } else if (z || this.f57684) {
                c16033.m42267(4);
                c16033.f51910 = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C7648 c7649 = this.f57660;
                if (c7649 != null && (z2 || c7649 != this.f57683)) {
                    m41988(c7649, c12526);
                    i2 = -5;
                }
            }
        }
        if (i2 == -4 && !c16033.m42264()) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    this.f57662.m11377(c16033, this.f57657);
                } else {
                    this.f57662.m11381(c16033, this.f57657);
                }
            }
            if (!z3) {
                this.f57664++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42013(int i) {
        m41990();
        int i2 = this.f57658;
        if (i >= i2 && i <= this.f57677 + i2) {
            this.f57675 = Long.MIN_VALUE;
            this.f57664 = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42014(long j, boolean z) {
        int iM41986;
        try {
            m41990();
            int iM41984 = m41984(this.f57664);
            int i = this.f57664;
            int i2 = this.f57677;
            if ((i != i2) && j >= this.f57669[iM41984] && (j <= this.f57682 || z)) {
                if (this.f57671) {
                    iM41986 = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iM41986) {
                            if (!z) {
                                iM41986 = -1;
                                break;
                            }
                            break;
                        }
                        if (this.f57669[iM41984] >= j) {
                            iM41986 = i3;
                            break;
                        }
                        iM41984++;
                        if (iM41984 == this.f57668) {
                            iM41984 = 0;
                        }
                        i3++;
                    }
                } else {
                    iM41986 = m41986(iM41984, i2 - i, j, true);
                }
                if (iM41986 == -1) {
                    return false;
                }
                this.f57675 = j;
                this.f57664 += iM41986;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42001(long j, boolean z, boolean z2) {
        long jM41985;
        int i;
        C3921 c3921 = this.f57662;
        synchronized (this) {
            try {
                int i2 = this.f57677;
                jM41985 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f57669;
                    int i3 = this.f57666;
                    if (j >= jArr[i3]) {
                        int iM41986 = m41986(i3, (!z2 || (i = this.f57664) == i2) ? i2 : i + 1, j, z);
                        if (iM41986 != -1) {
                            jM41985 = m41985(iM41986);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c3921.m11376(jM41985);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42010() {
        long jM41985;
        C3921 c3921 = this.f57662;
        synchronized (this) {
            int i = this.f57664;
            jM41985 = i == 0 ? -1L : m41985(i);
        }
        c3921.m11376(jM41985);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41999() {
        long jM41985;
        C3921 c3921 = this.f57662;
        synchronized (this) {
            int i = this.f57677;
            jM41985 = i == 0 ? -1L : m41985(i);
        }
        c3921.m11376(jM41985);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42011(long j) {
        if (this.f57681 != j) {
            this.f57681 = j;
            this.f57667 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42002(InterfaceC21561 interfaceC21561) {
        this.f57685 = interfaceC21561;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, l.᩸ۨܰ] */
    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8116(C7648 c7648) {
        C7648 c7648Mo6827 = mo6827(c7648);
        boolean z = false;
        this.f57667 = false;
        this.f57676 = c7648;
        synchronized (this) {
            this.f57672 = false;
            if (!C13638.equals(c7648Mo6827, this.f57660)) {
                if (this.f57674.m30815() || !((C15212) this.f57674.m30816()).f49619.equals(c7648Mo6827)) {
                    this.f57660 = c7648Mo6827;
                } else {
                    this.f57660 = ((C15212) this.f57674.m30816()).f49619;
                }
                boolean z2 = this.f57671;
                C7648 c7649 = this.f57660;
                this.f57671 = z2 & C6632.m17980(c7649.f25265, c7649.f25277);
                this.f57678 = false;
                z = true;
            }
        }
        ?? r5 = this.f57685;
        if (r5 == 0 || !z) {
            return;
        }
        r5.mo7677();
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final int mo8111(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return this.f57662.m11373(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ܰ */
    public final int mo8117(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return this.f57662.m11373(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8115(C2460 c2460, int i, int i2) {
        this.f57662.m11375(i, c2460);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public void mo8114(long j, int i, int i2, int i3, C18594 c18594) {
        int i4;
        if (this.f57667) {
            C7648 c7648 = this.f57676;
            C2023.m6508(c7648);
            mo8116(c7648);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.f57655) {
            if (!z2) {
                return;
            } else {
                this.f57655 = false;
            }
        }
        long j2 = this.f57681 + j;
        if (!this.f57671) {
            i4 = i;
        } else {
            if (j2 < this.f57675) {
                return;
            }
            if (i5 == 0) {
                if (!this.f57678) {
                    C0303.m1848("Overriding unexpected non-sync sample for format: " + this.f57660);
                    this.f57678 = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f57679) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f57677 == 0) {
                    z = j2 > this.f57673;
                } else if (m42004() >= j2) {
                    z = false;
                } else {
                    int i6 = this.f57677;
                    int iM41984 = m41984(i6 - 1);
                    while (i6 > this.f57664 && this.f57669[iM41984] >= j2) {
                        i6--;
                        iM41984--;
                        if (iM41984 == -1) {
                            iM41984 = this.f57668 - 1;
                        }
                    }
                    m41989(this.f57658 + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.f57679 = false;
            }
        }
        m41987(j2, i4, (this.f57662.m11374() - ((long) i2)) - ((long) i3), i2, c18594);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m41996() {
        this.f57667 = true;
    }

    /* JADX INFO: renamed from: ܰ */
    public C7648 mo6827(C7648 c7648) {
        if (this.f57681 == 0 || c7648.f25278 == C17492.FOREVER_NS) {
            return c7648;
        }
        C10471 c10471M20201 = c7648.m20201();
        c10471M20201.m26500(c7648.f25278 + this.f57681);
        return c10471M20201.m26497();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private long m41989(int i) {
        int iM42009 = m42009() - i;
        boolean z = false;
        C2023.m6507(iM42009 >= 0 && iM42009 <= this.f57677 - this.f57664);
        int i2 = this.f57677 - iM42009;
        this.f57677 = i2;
        this.f57682 = Math.max(this.f57673, m41992(i2));
        if (iM42009 == 0 && this.f57684) {
            z = true;
        }
        this.f57684 = z;
        this.f57674.m30812(i);
        int i3 = this.f57677;
        if (i3 == 0) {
            return 0L;
        }
        int iM41984 = m41984(i3 - 1);
        return this.f57663[iM41984] + ((long) this.f57680[iM41984]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41988(C7648 c7648, C12526 c12526) {
        C7648 c7649 = this.f57683;
        boolean z = c7649 == null;
        C8354 c8354 = c7649 == null ? null : c7649.f25271;
        this.f57683 = c7648;
        C8354 c8355 = c7648.f25271;
        InterfaceC16967 interfaceC16967 = this.f57670;
        c12526.f41899 = interfaceC16967 != null ? c7648.m20200(interfaceC16967.mo39756(c7648)) : c7648;
        c12526.f41898 = this.f57659;
        if (interfaceC16967 == null) {
            return;
        }
        if (z || !C13638.equals(c8354, c8355)) {
            InterfaceC19790 interfaceC19790 = this.f57659;
            C21200 c21200 = this.f57654;
            InterfaceC19790 interfaceC19790Mo39757 = interfaceC16967.mo39757(c21200, c7648);
            this.f57659 = interfaceC19790Mo39757;
            c12526.f41898 = interfaceC19790Mo39757;
            if (interfaceC19790 != null) {
                interfaceC19790.mo28386(c21200);
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m41991(int i) {
        InterfaceC19790 interfaceC19790 = this.f57659;
        if (interfaceC19790 == null || interfaceC19790.getState() == 4) {
            return true;
        }
        return (this.f57661[i] & 1073741824) == 0 && this.f57659.mo28387();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41986(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f57669[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f57661[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f57668) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private long m41985(int i) {
        this.f57673 = Math.max(this.f57673, m41992(i));
        this.f57677 -= i;
        int i2 = this.f57658 + i;
        this.f57658 = i2;
        int i3 = this.f57666 + i;
        this.f57666 = i3;
        int i4 = this.f57668;
        if (i3 >= i4) {
            this.f57666 = i3 - i4;
        }
        int i5 = this.f57664 - i;
        this.f57664 = i5;
        if (i5 < 0) {
            this.f57664 = 0;
        }
        this.f57674.m30817(i2);
        if (this.f57677 == 0) {
            int i6 = this.f57666;
            if (i6 == 0) {
                i6 = this.f57668;
            }
            int i7 = i6 - 1;
            return this.f57663[i7] + ((long) this.f57680[i7]);
        }
        return this.f57663[this.f57666];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private long m41992(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM41984 = m41984(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f57669[iM41984]);
            if ((this.f57661[iM41984] & 1) != 0) {
                return jMax;
            }
            iM41984--;
            if (iM41984 == -1) {
                iM41984 = this.f57668 - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m41984(int i) {
        int i2 = this.f57666 + i;
        int i3 = this.f57668;
        return i2 < i3 ? i2 : i2 - i3;
    }
}
