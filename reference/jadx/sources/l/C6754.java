package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6754 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21695 f22774;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f22775;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final IOException f22776;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14744 f22777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final IOException f22778;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21571 f22779;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f22780;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1109 f22781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8996 f22782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22983 f22783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f22784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f22785;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized C14744 m18262() {
        if (this.f22779 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f22777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C21571 m18263() {
        C21571 c21571;
        c21571 = this.f22779;
        if (c21571 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        c21571.m48290();
        return c21571;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m18264() {
        if (this.f22779 == null) {
            throw new IllegalStateException("Recovered state is closed");
        }
        return this.f22780;
    }

    public C6754(C22983 c22983, C14744 c14744, C21571 c21571, C21695 c21695, C8996 c8996, C1109 c1109, long j, IOException iOException, IOException iOException2) {
        c22983.f74699.m38089();
        this.f22783 = c22983;
        this.f22777 = c14744;
        this.f22779 = c21571;
        this.f22774 = c21695;
        this.f22782 = c8996;
        this.f22780 = c21571.f70014;
        this.f22781 = c1109;
        this.f22785 = c1109.f5023;
        this.f22775 = c1109.f5028;
        this.f22784 = j;
        this.f22778 = iOException;
        this.f22776 = iOException2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C21571 c21571 = this.f22779;
            if (c21571 == null) {
                return;
            }
            this.f22779 = null;
            this.f22780 = null;
            this.f22777 = null;
            this.f22774 = null;
            this.f22782 = null;
            try {
                c21571.close();
            } finally {
                this.f22783.f74699.m38088();
            }
        }
    }
}
