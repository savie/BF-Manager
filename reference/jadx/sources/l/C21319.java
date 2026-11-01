package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩸ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R8BB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21319 extends C8233 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C12107 f69368;

    public C21319(C12107 c12107, InputStream inputStream) {
        super(inputStream);
        this.f69368 = c12107;
    }

    @Override // l.C8233, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C21506.m48152(e, this.f69368);
            throw null;
        }
    }

    @Override // l.C8233, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C21506.m48152(e, this.f69368);
            throw null;
        }
    }

    @Override // l.C8233, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws ZipException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C21506.m48152(e, this.f69368);
            throw null;
        }
    }
}
