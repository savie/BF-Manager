package l;

/* JADX INFO: renamed from: l.ۖ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2835 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7027 f10726;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0507 f10727;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4246 f10728;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f10729;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2087 f10730;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20889 f10731;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3498 f10732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10733;

    public RunnableC2835(C4246 c4246, InterfaceC0507 interfaceC0507, C20889 c20889, int i, C3498 c3498, C7027 c7027, int i2, C2087 c2087) {
        this.f10728 = c4246;
        this.f10727 = interfaceC0507;
        this.f10731 = c20889;
        this.f10729 = i;
        this.f10732 = c3498;
        this.f10726 = c7027;
        this.f10733 = i2;
        this.f10730 = c2087;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM16900;
        boolean z;
        boolean z2;
        if (m8591() != 2) {
            return;
        }
        C3498 c3498 = this.f10732;
        if (c3498 != null && c3498.m10284()) {
            zM16900 = this.f10728.f15350.m16889(this.f10732.m10292(), this.f10732.m10286(), this.f10730.m6622());
        } else {
            zM16900 = this.f10728.f15350.m16900(this.f10730.m6622());
        }
        if (!zM16900) {
            this.f10728.f15350.postDelayed(this, 100L);
            return;
        }
        synchronized (this.f10728) {
            if (this.f10728.f15354.f19333 == this) {
                boolean z3 = this.f10728.f15354.f19328;
                z = this.f10728.f15354.f19332;
                this.f10728.f15354.f19333 = null;
                this.f10728.m11957();
                C3498 c3499 = this.f10732;
                if (c3499 == null || z3) {
                    this.f10728.m11951();
                } else if (!c3499.m10284()) {
                    C4246 c4246 = this.f10728;
                    C4246.m11921(c4246, this.f10727, c4246.f15354.f19337.m6620(this.f10730));
                } else {
                    this.f10728.m11917(this.f10727, this.f10732);
                }
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z2) {
            C6111 c6111 = this.f10728.f15350;
            c6111.m17063();
            c6111.invalidate();
            if (z) {
                this.f10728.m11954(this.f10727);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m8591() {
        synchronized (this.f10728) {
            if (this.f10728.f15354.f19333 != this) {
                return 0;
            }
            int i = 1;
            boolean z = this.f10728.f15350.m17000() == this.f10727 && C4246.m11959(this.f10728) == this.f10731 && this.f10727.mo2395() == this.f10729 && this.f10728.f15353.f73623 == this.f10733 && this.f10728.f15354.f19331 == this.f10730 && this.f10728.m11934(this.f10727, this.f10729);
            boolean z2 = this.f10728.f15353.f73624 == this.f10726 && this.f10728.f15353.f73632 == this.f10732 && this.f10727.length() == this.f10726.m18860();
            if (z && z2) {
                if (this.f10728.f15350.isAttachedToWindow() && this.f10728.f15350.m16968() && !this.f10728.f15350.m17044()) {
                    i = 2;
                }
                return i;
            }
            this.f10728.f15354.f19333 = null;
            return 0;
        }
    }
}
