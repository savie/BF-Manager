package l;

/* JADX INFO: renamed from: l.᩻᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8I7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25280 implements InterfaceC4002, InterfaceC18172 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81648;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20738 f81649;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC21156 f81650;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f81651;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC4848 f81652;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f81653;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f81654;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8402 f81656;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f81657;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15648[] f81658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC14814 f81659;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int f81662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0273 f81663;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f81664;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f81661 = new Object();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16461 f81660 = new C16461();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f81655 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC24755 f81665 = AbstractC24755.f80138;

    /* JADX INFO: renamed from: ֨ */
    public abstract void mo11184();

    /* JADX INFO: renamed from: ۗ */
    public int mo11268() {
        return 0;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo12940(float f, float f2) {
    }

    @Override // l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public void mo10630(int i, Object obj) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11187(long j, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public void mo22678(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۚ */
    public /* synthetic */ void mo12946() {
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo45800() {
    }

    /* JADX INFO: renamed from: ۠ */
    public void mo22684() {
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo48644() {
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۨ */
    public InterfaceC11986 mo12947() {
        return null;
    }

    /* JADX INFO: renamed from: ۬ */
    public void mo45801() {
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC25280 mo12950() {
        return this;
    }

    public AbstractC25280(int i) {
        this.f81662 = i;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ܽ */
    public final int mo12952() {
        return this.f81662;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo11190() {
        return mo12948();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12941(int i, C20738 c20738, InterfaceC14814 interfaceC14814) {
        this.f81648 = i;
        this.f81649 = c20738;
        this.f81659 = interfaceC14814;
    }

    @Override // l.InterfaceC4002
    public final int getState() {
        return this.f81654;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public long mo12954(long j, long j2) {
        if (this.f81654 == 1) {
            return (mo11189() || mo11190()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12943(C0273 c0273, C15648[] c15648Arr, InterfaceC4848 interfaceC4848, boolean z, boolean z2, long j, long j2, C8402 c8402) {
        C20782.m47568(this.f81654 == 0);
        this.f81663 = c0273;
        this.f81656 = c8402;
        this.f81654 = 1;
        mo22678(z, z2);
        mo12945(c15648Arr, interfaceC4848, j, j2, c8402);
        this.f81651 = false;
        this.f81653 = j;
        this.f81655 = j;
        mo11187(j, z);
    }

    @Override // l.InterfaceC4002
    public final void start() {
        C20782.m47568(this.f81654 == 1);
        this.f81654 = 2;
        mo45800();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12945(C15648[] c15648Arr, InterfaceC4848 interfaceC4848, long j, long j2, C8402 c8402) {
        C20782.m47568(!this.f81651);
        this.f81652 = interfaceC4848;
        this.f81656 = c8402;
        if (this.f81655 == Long.MIN_VALUE) {
            this.f81655 = j;
        }
        this.f81658 = c15648Arr;
        this.f81664 = j2;
        mo11188(c15648Arr, j, j2, c8402);
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4848 mo12949() {
        return this.f81652;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo12948() {
        return this.f81655 == Long.MIN_VALUE;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩵ */
    public final long mo12953() {
        return this.f81655;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ֫ */
    public final void mo12938() {
        this.f81651 = true;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo12951() {
        return this.f81651;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩻ */
    public final void mo12956() {
        InterfaceC4848 interfaceC4848 = this.f81652;
        interfaceC4848.getClass();
        interfaceC4848.mo14091();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12944(AbstractC24755 abstractC24755) {
        if (C17359.equals(this.f81665, abstractC24755)) {
            return;
        }
        this.f81665 = abstractC24755;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12942(long j) {
        this.f81651 = false;
        this.f81653 = j;
        this.f81655 = j;
        mo11187(j, false);
    }

    @Override // l.InterfaceC4002
    public final void stop() {
        C20782.m47568(this.f81654 == 2);
        this.f81654 = 1;
        mo45801();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩸ */
    public final void mo12955() {
        C20782.m47568(this.f81654 == 1);
        this.f81660.m39010();
        this.f81654 = 0;
        this.f81652 = null;
        this.f81658 = null;
        this.f81651 = false;
        mo11184();
        this.f81656 = null;
    }

    @Override // l.InterfaceC4002
    public final void reset() {
        C20782.m47568(this.f81654 == 0);
        this.f81660.m39010();
        mo22684();
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo12939() {
        C20782.m47568(this.f81654 == 0);
        mo48644();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56446(InterfaceC21156 interfaceC21156) {
        synchronized (this.f81661) {
            this.f81650 = interfaceC21156;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m56447() {
        synchronized (this.f81661) {
            this.f81650 = null;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long m56453() {
        return this.f81653;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long m56448() {
        return this.f81664;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16461 m56450() {
        C16461 c16461 = this.f81660;
        c16461.m39010();
        return c16461;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15648[] m56440() {
        C15648[] c15648Arr = this.f81658;
        c15648Arr.getClass();
        return c15648Arr;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0273 m56442() {
        C0273 c0273 = this.f81663;
        c0273.getClass();
        return c0273;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20738 m56451() {
        C20738 c20738 = this.f81649;
        c20738.getClass();
        return c20738;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 m56455() {
        InterfaceC14814 interfaceC14814 = this.f81659;
        interfaceC14814.getClass();
        return interfaceC14814;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m56452() {
        return this.f81665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18566 m56444(Throwable th, C15648 c15648, int i) {
        return m56445(th, c15648, false, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18566 m56445(Throwable th, C15648 c15648, boolean z, int i) {
        int i2;
        if (c15648 == null || this.f81657) {
            i2 = 4;
        } else {
            this.f81657 = true;
            try {
                int iMo11185 = mo11185(c15648) & 7;
                this.f81657 = false;
                i2 = iMo11185;
            } catch (C18566 unused) {
                this.f81657 = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.f81657 = false;
                throw th2;
            }
        }
        return C18566.m43145(th, getName(), this.f81648, c15648, i2, this.f81656, z, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56443(C16461 c16461, C5690 c5690, int i) {
        InterfaceC4848 interfaceC4848 = this.f81652;
        interfaceC4848.getClass();
        int iMo14090 = interfaceC4848.mo14090(c16461, c5690, i);
        if (iMo14090 == -4) {
            if (c5690.m33305()) {
                this.f81655 = Long.MIN_VALUE;
                return this.f81651 ? -4 : -3;
            }
            long j = c5690.f19652 + this.f81664;
            c5690.f19652 = j;
            this.f81655 = Math.max(this.f81655, j);
            return iMo14090;
        }
        if (iMo14090 == -5) {
            C15648 c15648 = c16461.f53378;
            c15648.getClass();
            long j2 = c15648.f50837;
            if (j2 != C25227.FOREVER_NS) {
                C20124 c20124M37397 = c15648.m37397();
                c20124M37397.m46298(j2 + this.f81664);
                c16461.f53378 = c20124M37397.m46295();
            }
        }
        return iMo14090;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m56454(long j) {
        InterfaceC4848 interfaceC4848 = this.f81652;
        interfaceC4848.getClass();
        return interfaceC4848.mo14089(j - this.f81664);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m56449() {
        if (mo12948()) {
            return this.f81651;
        }
        InterfaceC4848 interfaceC4848 = this.f81652;
        interfaceC4848.getClass();
        return interfaceC4848.mo14092();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m56441() {
        InterfaceC21156 interfaceC21156;
        synchronized (this.f81661) {
            interfaceC21156 = this.f81650;
        }
        if (interfaceC21156 != null) {
            ((C19369) interfaceC21156).m44795(this);
        }
    }
}
