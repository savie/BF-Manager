package l;

/* JADX INFO: renamed from: l.ᩴۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18670 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2516 f60605;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f60606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43155() {
        return this.f60606 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43156(Object obj, C2516 c2516) {
        return this.f60606 == obj && this.f60605 == c2516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43157(C2516 c2516) {
        return this.f60606 != null && this.f60605 == c2516;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43158(Object obj, C2516 c2516) {
        if (this.f60606 != null) {
            return false;
        }
        this.f60606 = obj;
        this.f60605 = c2516;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43159(Object obj, C2516 c2516) {
        if (m43156(obj, c2516)) {
            this.f60606 = null;
            this.f60605 = null;
        }
    }
}
