package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 67MK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6340 implements InterfaceC18272 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f21463;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f21464 = -1;

    public AbstractC6340(long j) {
        this.f21463 = j;
    }

    @Override // l.InterfaceC18272
    public final boolean next() {
        long j = this.f21464 + 1;
        this.f21464 = j;
        return !(j > this.f21463);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18061() {
        long j = this.f21464;
        if (j < 0 || j > this.f21463) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m18062() {
        return this.f21464;
    }
}
