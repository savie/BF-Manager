package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۘ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJ2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4210 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f15282;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f15283;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 f15284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f15285;

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ֨ۨ */
    public final /* synthetic */ boolean mo3051() {
        return false;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۙۨ */
    public final /* synthetic */ FileChannel mo3055() {
        return null;
    }

    public C4210(InterfaceC21850 interfaceC21850, long j, long j2) throws IOException {
        this.f15284 = interfaceC21850;
        this.f15285 = j;
        this.f15283 = j2;
        long length = interfaceC21850.length();
        if (j + j2 > length) {
            throw new IOException(String.format("fragment.offset=%d, fragment.length=%d, data.length=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        }
        seek(0L);
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) {
        long j2 = this.f15285;
        InterfaceC21850 interfaceC21850 = this.f15284;
        interfaceC21850.seek(j + j2);
        this.f15282 = interfaceC21850.position() - j2;
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f15283 - this.f15282;
        if (i2 > j) {
            if (j <= 0) {
                return -1;
            }
            i2 = (int) j;
        }
        int i3 = this.f15284.read(bArr, i, i2);
        if (i3 > 0) {
            this.f15282 += (long) i3;
        }
        return i3;
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC21850 mo3058(long j, long j2) {
        return new C4210(mo3060(), j, j2);
    }

    @Override // l.InterfaceC21850
    public final long length() {
        return this.f15283;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC21850 mo3056(long j, long j2) {
        return new C4210(this, j, j2);
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC21850
    public final long position() {
        return this.f15282;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() {
        this.f15284.mo3059();
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15284.getName());
        sb.append("-Fragment(");
        sb.append(this.f15285);
        sb.append(",");
        return C15037.m36023(sb, this.f15283, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() {
        return new C4210(this.f15284.mo3060(), this.f15285, this.f15283);
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f15284.isClosed();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15284.close();
    }
}
