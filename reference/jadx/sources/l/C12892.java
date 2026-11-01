package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12892 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public IOException f42859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f42860;

    public C12892(IOException iOException) {
        super(iOException);
        this.f42859 = iOException;
        this.f42860 = iOException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m31964() {
        return this.f42859;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IOException m31966() {
        return this.f42860;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31965(IOException iOException) {
        C0140.m1232((Throwable) this.f42859, iOException);
        this.f42860 = iOException;
    }
}
