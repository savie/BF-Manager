package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4DD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21314 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public IOException f67923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f67924;

    public C21314(IOException iOException) {
        super(iOException);
        this.f67923 = iOException;
        this.f67924 = iOException;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m48550() {
        return this.f67923;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IOException m48552() {
        return this.f67924;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48551(IOException iOException) {
        C19822.m45602((Throwable) this.f67923, iOException);
        this.f67924 = iOException;
    }
}
