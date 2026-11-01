package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.Features3;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۬᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C145 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13384 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor f44328;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f44329 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f44330;

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

    public AbstractC13384(ParcelFileDescriptor parcelFileDescriptor) {
        this.f44328 = parcelFileDescriptor;
        this.f44330 = parcelFileDescriptor.getFd();
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) {
        Features3.seek(this.f44330, j);
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = Features3.read(this.f44330, bArr, i, i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) {
        Features3.write(this.f44330, bArr, i, i2);
    }

    @Override // l.InterfaceC21850
    public final long length() {
        return Features3.length(this.f44330);
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) {
        Features3.truncate(this.f44330, j);
    }

    @Override // l.InterfaceC21850
    public final long position() {
        return Features3.tell(this.f44330);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC21850 mo3058(long j, long j2) {
        return new C4210(mo3060(), j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC21850 mo3056(long j, long j2) {
        return new C4210(this, j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() {
        Features3.sync(this.f44330);
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f44329;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f44329) {
            return;
        }
        this.f44329 = true;
        this.f44328.close();
    }
}
