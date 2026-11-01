package l;

/* JADX INFO: renamed from: l.᩹ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public class C22444 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f73235;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f73236;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f73237;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73238;

    /* JADX INFO: renamed from: ۖ */
    public void mo3032() {
        throw null;
    }

    public C22444(Object obj) {
        this.f73236 = obj;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m49807() {
        if (this.f73235 || this.f73237) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f73236);
        }
        this.f73235 = true;
        mo3032();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m49805() {
        if (this.f73235 || this.f73237) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f73236);
        }
        this.f73237 = true;
        mo31506();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m49806() {
        return this.f73235 || this.f73237;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49804(int i) {
        this.f73238 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49803() {
        return this.f73238;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo31506() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f73236);
    }
}
