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

/* JADX INFO: renamed from: l.ᩳ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4G9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18322 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f58454;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Uri f58455;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f58456 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ParcelFileDescriptor f58457;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public FileDescriptor f58458;

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

    public C18322(Uri uri, String str) throws FileNotFoundException {
        this.f58455 = uri;
        this.f58454 = str;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C16737.m39259().openFileDescriptor(uri, str);
            this.f58457 = parcelFileDescriptorOpenFileDescriptor;
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new FileNotFoundException();
            }
            this.f58458 = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
        } catch (Error | RuntimeException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC21850 mo3058(long j, long j2) {
        return new C4210(mo3060(), j, j2);
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        try {
            Os.lseek(this.f58458, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC21850 mo3056(long j, long j2) {
        return new C4210(this, j, j2);
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = Os.read(this.f58458, bArr, i, i2);
            if (i3 == 0) {
                return -1;
            }
            return i3;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            Os.write(this.f58458, bArr, i, i2);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    public final long length() throws IOException {
        FileDescriptor fileDescriptor = this.f58458;
        try {
            long jLseek = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            long jLseek2 = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_END);
            Os.lseek(fileDescriptor, jLseek, OsConstants.SEEK_SET);
            return jLseek2;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        try {
            Os.ftruncate(this.f58458, j);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    public final long position() throws IOException {
        try {
            return Os.lseek(this.f58458, 0L, OsConstants.SEEK_CUR);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() throws IOException {
        try {
            Os.fsync(this.f58458);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f58456;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f58456) {
            return;
        }
        this.f58456 = true;
        boolean zEquals = this.f58454.equals("r");
        ParcelFileDescriptor parcelFileDescriptor = this.f58457;
        if (zEquals) {
            C19431.m44468(parcelFileDescriptor);
        } else {
            parcelFileDescriptor.close();
        }
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return C22529.m50045(this.f58455);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() {
        return new C18322(this.f58455, this.f58454);
    }
}
