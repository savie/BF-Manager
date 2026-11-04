package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩷ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJ2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22189 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 f71490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f71491;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f71492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f71493;

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

    public C22189(InterfaceC15475 interfaceC15475, long j, long j2) throws IOException {
        this.f71490 = interfaceC15475;
        this.f71493 = j;
        this.f71491 = j2;
        long length = interfaceC15475.length();
        if (j + j2 > length) {
            throw new IOException(String.format("fragment.offset=%d, fragment.length=%d, data.length=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        }
        seek(0L);
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) {
        long j2 = this.f71493;
        InterfaceC15475 interfaceC15475 = this.f71490;
        interfaceC15475.seek(j + j2);
        this.f71492 = interfaceC15475.position() - j2;
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f71491 - this.f71492;
        if (i2 > j) {
            if (j <= 0) {
                return -1;
            }
            i2 = (int) j;
        }
        int i3 = this.f71490.read(bArr, i, i2);
        if (i3 > 0) {
            this.f71492 += (long) i3;
        }
        return i3;
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC15475 mo7070(long j, long j2) {
        return new C22189(mo7071(), j, j2);
    }

    @Override // l.InterfaceC15475
    public final long length() {
        return this.f71491;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC15475 mo7068(long j, long j2) {
        return new C22189(this, j, j2);
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC15475
    public final long position() {
        return this.f71492;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() {
        this.f71490.mo7069();
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f71490.getName());
        sb.append("-Fragment(");
        sb.append(this.f71493);
        sb.append(",");
        return C2764.m9137(sb, this.f71491, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() {
        return new C22189(this.f71490.mo7071(), this.f71493, this.f71491);
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f71490.isClosed();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f71490.close();
    }
}
