package l;

/* JADX INFO: renamed from: l.۟ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C8015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f26617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f26618;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26619;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26620;

    /* JADX INFO: renamed from: ᩸ */
    public void mo7060() {
        throw null;
    }

    public C8015(Object obj) {
        this.f26617 = obj;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21882() {
        if (this.f26620 || this.f26618) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f26617);
        }
        this.f26620 = true;
        mo7060();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21883() {
        if (this.f26620 || this.f26618) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f26617);
        }
        this.f26618 = true;
        mo21881();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m21884() {
        return this.f26620 || this.f26618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21880(int i) {
        this.f26619 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21879() {
        return this.f26619;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo21881() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f26617);
    }
}
