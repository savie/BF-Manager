package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۡۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes4.dex */
public final class C9096 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8351 f29557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f29558 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29556 = false;

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۙۤ */
    public final /* synthetic */ FileChannel mo7066() {
        return null;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۚۤ */
    public final /* synthetic */ boolean mo7067() {
        return false;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15475 mo7068(long j, long j2) {
        return C19951.m45879(this, j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() {
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC15475 mo7070(long j, long j2) {
        return C19951.m45880(this, j, j2);
    }

    public C9096(C8351 c8351) {
        this.f29557 = c8351;
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C24770.m55292(j, "offset < 0: "));
        }
        this.f29558 = j;
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) {
        int iM22472 = this.f29557.m22472(this.f29558, bArr, i, i2);
        if (iM22472 != -1) {
            this.f29558 += (long) iM22472;
        }
        return iM22472;
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC15475
    public final long length() {
        return this.f29557.m22473();
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC15475
    public final long position() {
        return this.f29558;
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return this.f29557.f27376;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f29556;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29556) {
            return;
        }
        this.f29556 = true;
        this.f29557.close();
    }
}
