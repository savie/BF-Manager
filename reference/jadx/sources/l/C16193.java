package l;

/* JADX INFO: renamed from: l.ܺ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16193 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52287;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractViewOnLongClickListenerC22543 f52288;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52290;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38287(AbstractViewOnLongClickListenerC22543 abstractViewOnLongClickListenerC22543) {
        this.f52288 = abstractViewOnLongClickListenerC22543;
        this.f52290 = 0;
        this.f52287 = false;
        this.f52289 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38286(C11960 c11960, int i) {
        if (this.f52288 != c11960) {
            m38287((AbstractViewOnLongClickListenerC22543) c11960);
        }
        this.f52290 = i;
        this.f52287 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38284(C11960 c11960) {
        if (this.f52288 != c11960) {
            return -1;
        }
        int i = this.f52289 + 1;
        this.f52289 = i;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38289(AbstractC12554 abstractC12554) {
        if (this.f52288 != abstractC12554 || !this.f52287) {
            return false;
        }
        this.f52287 = false;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38288(int i, Object obj) {
        return this.f52288 == obj && this.f52289 == i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38290() {
        return this.f52290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38285() {
        this.f52288 = null;
        this.f52290 = 0;
        this.f52287 = false;
        this.f52289 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m38291() {
        return this.f52288;
    }
}
