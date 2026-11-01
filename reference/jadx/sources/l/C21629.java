package l;

import java.nio.channels.ClosedChannelException;

/* JADX INFO: renamed from: l.᩸ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C21629 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1873 f70147;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70148;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f70149;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f70150;

    public C21629(int i, long j, C1873 c1873) {
        this.f70147 = c1873;
        this.f70149 = j;
        this.f70150 = i;
    }

    public final int length() {
        return this.f70150;
    }

    public final boolean isOpen() {
        return !this.f70148 && this.f70147.f7102;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f70148) {
                return;
            }
            this.f70148 = true;
            this.f70147.m6082(this.f70150, this.f70149);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48343(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C22979.m50823(this.f70150, i, i3);
            C22979.m50824(bArr.length, i2, i3);
            this.f70147.m6080(this.f70149 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48344(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C22979.m50823(this.f70150, i, i3);
            C22979.m50824(bArr.length, i2, i3);
            this.f70147.m6083(this.f70149 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }
}
