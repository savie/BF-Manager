package l;

/* JADX INFO: renamed from: l.۟ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7781 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractViewOnLongClickListenerC5544 f25848;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25851;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21166(AbstractViewOnLongClickListenerC5544 abstractViewOnLongClickListenerC5544) {
        this.f25848 = abstractViewOnLongClickListenerC5544;
        this.f25850 = 0;
        this.f25851 = false;
        this.f25849 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21167(C19714 c19714, int i) {
        if (this.f25848 != c19714) {
            m21166((AbstractViewOnLongClickListenerC5544) c19714);
        }
        this.f25850 = i;
        this.f25851 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21164(C19714 c19714) {
        if (this.f25848 != c19714) {
            return -1;
        }
        int i = this.f25849 + 1;
        this.f25849 = i;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21169(AbstractC11800 abstractC11800) {
        if (this.f25848 != abstractC11800 || !this.f25851) {
            return false;
        }
        this.f25851 = false;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21168(int i, Object obj) {
        return this.f25848 == obj && this.f25849 == i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m21170() {
        return this.f25850;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21165() {
        this.f25848 = null;
        this.f25850 = 0;
        this.f25851 = false;
        this.f25849 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m21171() {
        return this.f25848;
    }
}
