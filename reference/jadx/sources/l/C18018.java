package l;

/* JADX INFO: renamed from: l.ᩳۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18018 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f57613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f57614;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile Object f57615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f57616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f57617;

    public /* synthetic */ C18018(int i) {
        this();
    }

    public C18018() {
        this.f57617 = false;
        this.f57614 = false;
        this.f57613 = false;
        this.f57616 = new Object();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41959(Object obj) {
        synchronized (this.f57616) {
            if (this.f57614 || this.f57613) {
                return false;
            }
            this.f57615 = obj;
            this.f57617 = true;
            this.f57616.notifyAll();
            return true;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m41960() {
        Object obj;
        synchronized (this.f57616) {
            while (!this.f57617 && !this.f57614) {
                this.f57616.wait();
            }
            obj = this.f57617 ? this.f57615 : null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41958() {
        synchronized (this.f57616) {
            this.f57614 = true;
            this.f57616.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41961() {
        synchronized (this.f57616) {
            this.f57613 = true;
        }
    }
}
