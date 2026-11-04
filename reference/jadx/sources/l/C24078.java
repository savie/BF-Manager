package l;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩺ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69RK */
/* JADX INFO: loaded from: classes.dex */
public final class C24078 implements InterfaceC15872 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9982 f77857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f77858;

    public C24078(AbstractC22044 abstractC22044) {
        this.f77858 = abstractC22044.m49855("r");
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f77858.skipBytes(i) != i) {
            throw new EOFException();
        }
    }

    public final void seek(long j) {
        this.f77858.seek(j);
    }

    public final byte readByte() {
        return this.f77858.readByte();
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final int m53628() {
        return this.f77858.mo34029();
    }

    @Override // l.InterfaceC15872
    public final int readInt() {
        return this.f77858.readInt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53626() {
        C13961 c13961 = this.f77858;
        long filePointer = c13961.getFilePointer();
        int i = c13961.readInt();
        c13961.seek(filePointer);
        return i;
    }

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m53627() {
        C13961 c13961 = this.f77858;
        int i = c13961.readInt();
        byte[] bArr = new byte[i];
        c13961.readFully(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m53629() {
        C13961 c13961 = this.f77858;
        int i = c13961.readInt();
        byte[] bArr = new byte[i];
        c13961.readFully(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m53630() {
        C9982 c9982 = this.f77857;
        if (c9982 == null) {
            c9982 = new C9982();
            this.f77857 = c9982;
        } else {
            c9982.m25824();
        }
        while (true) {
            int i = this.f77858.read();
            if (i > 0) {
                c9982.write(i);
            } else {
                return new String(c9982.f32079, 0, c9982.f32081, StandardCharsets.UTF_8);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f77858.close();
    }
}
