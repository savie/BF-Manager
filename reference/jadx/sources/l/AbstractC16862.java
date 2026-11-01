package l;

/* JADX INFO: renamed from: l.ܽ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8I7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16862 implements InterfaceC4784, InterfaceC2667 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53937;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C7648[] f53939;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f53940;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f53941;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15274 f53942;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC18739 f53943;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9724 f53944;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f53945;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f53946;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f53947;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC11841 f53948;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC11593 f53949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53950;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5490 f53952;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f53951 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12526 f53936 = new C12526();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f53953 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16511 f53938 = AbstractC16511.f53035;

    /* JADX INFO: renamed from: ֫ */
    public void mo13928() {
    }

    /* JADX INFO: renamed from: ۗ */
    public void mo13931() {
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo13257(float f, float f2) {
    }

    @Override // l.InterfaceC23691
    /* JADX INFO: renamed from: ۙ */
    public void mo13941(int i, Object obj) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13942(long j, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public void mo13949(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
    }

    /* JADX INFO: renamed from: ۠ */
    public int mo8213() {
        return 0;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۡ */
    public InterfaceC1941 mo13265() {
        return null;
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo13956() {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo13958();

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۬ */
    public /* synthetic */ void mo13266() {
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC16862 mo13270() {
        return this;
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo13967() {
    }

    public AbstractC16862(int i) {
        this.f53941 = i;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13272() {
        return this.f53941;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public boolean mo13268() {
        return mo13253();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13258(int i, C9724 c9724, InterfaceC11593 interfaceC11593) {
        this.f53950 = i;
        this.f53944 = c9724;
        this.f53949 = interfaceC11593;
    }

    @Override // l.InterfaceC4784
    public final int getState() {
        return this.f53937;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public long mo13267(long j, long j2) {
        if (this.f53937 == 1) {
            return (mo13264() || mo13268()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13261(C5490 c5490, C7648[] c7648Arr, InterfaceC18739 interfaceC18739, boolean z, boolean z2, long j, long j2, C15274 c15274) {
        C2023.m6510(this.f53937 == 0);
        this.f53952 = c5490;
        this.f53942 = c15274;
        this.f53937 = 1;
        mo13949(z, z2);
        mo13263(c7648Arr, interfaceC18739, j, j2, c15274);
        this.f53940 = false;
        this.f53946 = j;
        this.f53953 = j;
        mo13942(j, z);
    }

    @Override // l.InterfaceC4784
    public final void start() {
        C2023.m6510(this.f53937 == 1);
        this.f53937 = 2;
        mo13956();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13263(C7648[] c7648Arr, InterfaceC18739 interfaceC18739, long j, long j2, C15274 c15274) {
        C2023.m6510(!this.f53940);
        this.f53943 = interfaceC18739;
        this.f53942 = c15274;
        if (this.f53953 == Long.MIN_VALUE) {
            this.f53953 = j;
        }
        this.f53939 = c7648Arr;
        this.f53947 = j2;
        mo13950(c7648Arr, j, j2, c15274);
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18739 mo13273() {
        return this.f53943;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo13253() {
        return this.f53953 == Long.MIN_VALUE;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩵ */
    public final long mo13271() {
        return this.f53953;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۘ */
    public final void mo13255() {
        this.f53940 = true;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo13269() {
        return this.f53940;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ᩺ */
    public final void mo13274() {
        InterfaceC18739 interfaceC18739 = this.f53943;
        interfaceC18739.getClass();
        interfaceC18739.mo12777();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13262(AbstractC16511 abstractC16511) {
        if (C13638.equals(this.f53938, abstractC16511)) {
            return;
        }
        this.f53938 = abstractC16511;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13259(long j) {
        this.f53940 = false;
        this.f53946 = j;
        this.f53953 = j;
        mo13942(j, false);
    }

    @Override // l.InterfaceC4784
    public final void stop() {
        C2023.m6510(this.f53937 == 2);
        this.f53937 = 1;
        mo13931();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۖ */
    public final void mo13254() {
        C2023.m6510(this.f53937 == 1);
        this.f53936.m31083();
        this.f53937 = 0;
        this.f53943 = null;
        this.f53939 = null;
        this.f53940 = false;
        mo13958();
        this.f53942 = null;
    }

    @Override // l.InterfaceC4784
    public final void reset() {
        C2023.m6510(this.f53937 == 0);
        this.f53936.m31083();
        mo13928();
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13256() {
        C2023.m6510(this.f53937 == 0);
        mo13967();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39518(InterfaceC11841 interfaceC11841) {
        synchronized (this.f53951) {
            this.f53948 = interfaceC11841;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39521() {
        synchronized (this.f53951) {
            this.f53948 = null;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long m39528() {
        return this.f53946;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m39522() {
        return this.f53947;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12526 m39525() {
        C12526 c12526 = this.f53936;
        c12526.m31083();
        return c12526;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7648[] m39526() {
        C7648[] c7648Arr = this.f53939;
        c7648Arr.getClass();
        return c7648Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5490 m39529() {
        C5490 c5490 = this.f53952;
        c5490.getClass();
        return c5490;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9724 m39514() {
        C9724 c9724 = this.f53944;
        c9724.getClass();
        return c9724;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 m39520() {
        InterfaceC11593 interfaceC11593 = this.f53949;
        interfaceC11593.getClass();
        return interfaceC11593;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m39527() {
        return this.f53938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2170 m39516(Throwable th, C7648 c7648, int i) {
        return m39517(th, c7648, false, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2170 m39517(Throwable th, C7648 c7648, boolean z, int i) {
        int i2;
        if (c7648 == null || this.f53945) {
            i2 = 4;
        } else {
            this.f53945 = true;
            try {
                int iMo8212 = mo8212(c7648) & 7;
                this.f53945 = false;
                i2 = iMo8212;
            } catch (C2170 unused) {
                this.f53945 = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.f53945 = false;
                throw th2;
            }
        }
        return C2170.m6758(th, getName(), this.f53950, c7648, i2, this.f53942, z, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39515(C12526 c12526, C16033 c16033, int i) {
        InterfaceC18739 interfaceC18739 = this.f53943;
        interfaceC18739.getClass();
        int iMo12776 = interfaceC18739.mo12776(c12526, c16033, i);
        if (iMo12776 == -4) {
            if (c16033.m42264()) {
                this.f53953 = Long.MIN_VALUE;
                return this.f53940 ? -4 : -3;
            }
            long j = c16033.f51910 + this.f53947;
            c16033.f51910 = j;
            this.f53953 = Math.max(this.f53953, j);
            return iMo12776;
        }
        if (iMo12776 == -5) {
            C7648 c7648 = c12526.f41899;
            c7648.getClass();
            long j2 = c7648.f25278;
            if (j2 != C17492.FOREVER_NS) {
                C10471 c10471M20201 = c7648.m20201();
                c10471M20201.m26500(j2 + this.f53947);
                c12526.f41899 = c10471M20201.m26497();
            }
        }
        return iMo12776;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m39523(long j) {
        InterfaceC18739 interfaceC18739 = this.f53943;
        interfaceC18739.getClass();
        return interfaceC18739.mo12775(j - this.f53947);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m39519() {
        if (mo13253()) {
            return this.f53940;
        }
        InterfaceC18739 interfaceC18739 = this.f53943;
        interfaceC18739.getClass();
        return interfaceC18739.mo12778();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39524() {
        InterfaceC11841 interfaceC11841;
        synchronized (this.f53951) {
            interfaceC11841 = this.f53948;
        }
        if (interfaceC11841 != null) {
            ((C12909) interfaceC11841).m31996(this);
        }
    }
}
