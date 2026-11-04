package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes.dex */
public final class C23736 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21170 f76931;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final IOException f76932;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f76933;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21697 f76934;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12547 f76935;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f76936;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f76937;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final IOException f76938;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17022 f76939;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12219 f76940;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3598 f76941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f76942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C12547 m53004() {
        C12547 c12547;
        c12547 = this.f76935;
        if (c12547 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        c12547.m31223();
        return c12547;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C21697 m53005() {
        if (this.f76935 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f76934;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m53006() {
        if (this.f76935 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f76933;
    }

    public C23736(C3598 c3598, C21697 c21697, C12547 c12547, C12219 c12219, C21170 c21170, C17022 c17022, long j, IOException iOException, IOException iOException2) {
        c3598.f12301.m25972();
        this.f76941 = c3598;
        this.f76934 = c21697;
        this.f76935 = c12547;
        this.f76940 = c12219;
        this.f76931 = c21170;
        this.f76933 = c12547.f40313;
        this.f76939 = c17022;
        this.f76937 = c17022.f55600;
        this.f76936 = c17022.f55604;
        this.f76942 = j;
        this.f76932 = iOException;
        this.f76938 = iOException2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C12547 c12547 = this.f76935;
            if (c12547 == null) {
                return;
            }
            this.f76935 = null;
            this.f76933 = null;
            this.f76934 = null;
            this.f76940 = null;
            this.f76931 = null;
            try {
                c12547.close();
            } finally {
                this.f76941.f12301.m25975();
            }
        }
    }
}
