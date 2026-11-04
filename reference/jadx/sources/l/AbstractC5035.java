package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.Features3;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۙܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C145 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5035 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f17441 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor f17442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f17443;

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

    public AbstractC5035(ParcelFileDescriptor parcelFileDescriptor) {
        this.f17442 = parcelFileDescriptor;
        this.f17443 = parcelFileDescriptor.getFd();
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) {
        Features3.seek(this.f17443, j);
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = Features3.read(this.f17443, bArr, i, i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) {
        Features3.write(this.f17443, bArr, i, i2);
    }

    @Override // l.InterfaceC15475
    public final long length() {
        return Features3.length(this.f17443);
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) {
        Features3.truncate(this.f17443, j);
    }

    @Override // l.InterfaceC15475
    public final long position() {
        return Features3.tell(this.f17443);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC15475 mo7070(long j, long j2) {
        return new C22189(mo7071(), j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC15475 mo7068(long j, long j2) {
        return new C22189(this, j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() {
        Features3.sync(this.f17443);
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f17441;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f17441) {
            return;
        }
        this.f17441 = true;
        this.f17442.close();
    }
}
