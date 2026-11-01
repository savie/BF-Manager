package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.۠᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8445 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f29300;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f29301 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f29302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f29303;

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ֨ۨ */
    public final boolean mo3051() {
        return true;
    }

    public C8445(File file, String str) {
        this.f29303 = file;
        this.f29300 = str;
        this.f29302 = new RandomAccessFile(file, str);
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        this.f29302.seek(j);
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) {
        return this.f29302.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f29302.write(bArr, i, i2);
    }

    @Override // l.InterfaceC21850
    public final long length() {
        return this.f29302.length();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC21850 mo3058(long j, long j2) {
        return new C4210(mo3060(), j, j2);
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        this.f29302.setLength(j);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC21850 mo3056(long j, long j2) {
        return new C4210(this, j, j2);
    }

    @Override // l.InterfaceC21850
    public final long position() {
        return this.f29302.getFilePointer();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() throws SyncFailedException {
        this.f29302.getFD().sync();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۙۨ */
    public final FileChannel mo3055() {
        return C6001.convertMaybeLegacyFileChannelFromLibrary(this.f29302.getChannel());
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return this.f29303.getName();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() {
        return new C8445(this.f29303, this.f29300);
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f29301;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f29301) {
            return;
        }
        this.f29301 = true;
        boolean zEquals = this.f29300.equals("r");
        RandomAccessFile randomAccessFile = this.f29302;
        if (zEquals) {
            C19431.m44468(randomAccessFile);
        } else {
            randomAccessFile.close();
        }
    }
}
