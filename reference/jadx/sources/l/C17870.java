package l;

/* JADX INFO: renamed from: l.ܽ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f58572;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f58573;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile Object f58574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f58575;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f58576;

    public /* synthetic */ C17870(int i) {
        this();
    }

    public C17870() {
        this.f58575 = false;
        this.f58572 = false;
        this.f58576 = false;
        this.f58573 = new Object();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41715(Object obj) {
        synchronized (this.f58573) {
            if (this.f58572 || this.f58576) {
                return false;
            }
            this.f58574 = obj;
            this.f58575 = true;
            this.f58573.notifyAll();
            return true;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m41716() {
        Object obj;
        synchronized (this.f58573) {
            while (!this.f58575 && !this.f58572) {
                this.f58573.wait();
            }
            obj = this.f58575 ? this.f58574 : null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41714() {
        synchronized (this.f58573) {
            this.f58572 = true;
            this.f58573.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41717() {
        synchronized (this.f58573) {
            this.f58576 = true;
        }
    }
}
