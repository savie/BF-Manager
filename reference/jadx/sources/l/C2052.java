package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.֫ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2052 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f6817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6818 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f6819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f6820;

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۚۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo7067() {
        return true;
    }

    public C2052(File file, String str) {
        this.f6820 = file;
        this.f6819 = str;
        this.f6817 = new RandomAccessFile(file, str);
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        this.f6817.seek(j);
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) {
        return this.f6817.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f6817.write(bArr, i, i2);
    }

    @Override // l.InterfaceC15475
    public final long length() {
        return this.f6817.length();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 mo7070(long j, long j2) {
        return new C22189(mo7071(), j, j2);
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        this.f6817.setLength(j);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 mo7068(long j, long j2) {
        return new C22189(this, j, j2);
    }

    @Override // l.InterfaceC15475
    public final long position() {
        return this.f6817.getFilePointer();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo7069() throws SyncFailedException {
        this.f6817.getFD().sync();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public final FileChannel mo7066() {
        return C19853.convertMaybeLegacyFileChannelFromLibrary(this.f6817.getChannel());
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return this.f6820.getName();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 mo7071() {
        return new C2052(this.f6820, this.f6819);
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f6818;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f6818) {
            return;
        }
        this.f6818 = true;
        boolean zEquals = this.f6819.equals("r");
        RandomAccessFile randomAccessFile = this.f6817;
        if (zEquals) {
            C20244.m46520(randomAccessFile);
        } else {
            randomAccessFile.close();
        }
    }
}
