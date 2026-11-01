package l;

/* JADX INFO: renamed from: l.᩺ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes.dex */
public final class C22799 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f74189;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f74190;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74191;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50458() {
        this.f74189 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50457(boolean z) {
        this.f74191 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50459(boolean z) {
        this.f74190 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15038 m50456() {
        if (!this.f74189 && (this.f74191 || this.f74190)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C15038(this);
    }
}
