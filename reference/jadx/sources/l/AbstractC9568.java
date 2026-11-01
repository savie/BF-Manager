package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67MK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9568 implements InterfaceC2241 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f32276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f32277 = -1;

    public AbstractC9568(long j) {
        this.f32276 = j;
    }

    @Override // l.InterfaceC2241
    public final boolean next() {
        long j = this.f32277 + 1;
        this.f32277 = j;
        return !(j > this.f32276);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24424() {
        long j = this.f32277;
        if (j < 0 || j > this.f32276) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m24423() {
        return this.f32277;
    }
}
