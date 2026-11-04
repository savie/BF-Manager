package l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۫ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4G9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13238 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ParcelFileDescriptor f42310;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Uri f42311;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42312 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f42313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public FileDescriptor f42314;

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

    public C13238(Uri uri, String str) throws FileNotFoundException {
        this.f42311 = uri;
        this.f42313 = str;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C21576.m49091().openFileDescriptor(uri, str);
            this.f42310 = parcelFileDescriptorOpenFileDescriptor;
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new FileNotFoundException();
            }
            this.f42314 = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
        } catch (Error | RuntimeException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC15475 mo7070(long j, long j2) {
        return new C22189(mo7071(), j, j2);
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        try {
            Os.lseek(this.f42314, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC15475 mo7068(long j, long j2) {
        return new C22189(this, j, j2);
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = Os.read(this.f42314, bArr, i, i2);
            if (i3 == 0) {
                return -1;
            }
            return i3;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            Os.write(this.f42314, bArr, i, i2);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    public final long length() throws IOException {
        FileDescriptor fileDescriptor = this.f42314;
        try {
            long jLseek = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            long jLseek2 = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_END);
            Os.lseek(fileDescriptor, jLseek, OsConstants.SEEK_SET);
            return jLseek2;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        try {
            Os.ftruncate(this.f42314, j);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    public final long position() throws IOException {
        try {
            return Os.lseek(this.f42314, 0L, OsConstants.SEEK_CUR);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() throws IOException {
        try {
            Os.fsync(this.f42314);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f42312;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42312) {
            return;
        }
        this.f42312 = true;
        boolean zEquals = this.f42313.equals("r");
        ParcelFileDescriptor parcelFileDescriptor = this.f42310;
        if (zEquals) {
            C20244.m46520(parcelFileDescriptor);
        } else {
            parcelFileDescriptor.close();
        }
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return C23053.m51954(this.f42311);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() {
        return new C13238(this.f42311, this.f42313);
    }
}
