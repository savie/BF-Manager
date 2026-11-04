package l;

import java.nio.channels.ClosedChannelException;

/* JADX INFO: renamed from: l.᩷ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C22127 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f71294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f71295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4227 f71296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f71297;

    public C22127(int i, long j, C4227 c4227) {
        this.f71296 = c4227;
        this.f71294 = j;
        this.f71297 = i;
    }

    public final int length() {
        return this.f71297;
    }

    public final boolean isOpen() {
        return !this.f71295 && this.f71296.f15422;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f71295) {
                return;
            }
            this.f71295 = true;
            this.f71296.m13498(this.f71297, this.f71294);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50088(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C13921.m33904(this.f71297, i, i3);
            C13921.m33902(bArr.length, i2, i3);
            this.f71296.m13496(this.f71294 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50089(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C13921.m33904(this.f71297, i, i3);
            C13921.m33902(bArr.length, i2, i3);
            this.f71296.m13499(this.f71294 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }
}
