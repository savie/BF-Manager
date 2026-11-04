package l;

/* JADX INFO: renamed from: l.ۧۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11344 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f35737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28641() {
        while (!this.f35737) {
            wait();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28642() {
        boolean z = this.f35737;
        this.f35737 = true;
        if (!z) {
            notify();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m28643() {
        this.f35737 = false;
    }
}
