package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ܽܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8BB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17675 extends C7077 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C8002 f58078;

    public C17675(C8002 c8002, InputStream inputStream) {
        super(inputStream);
        this.f58078 = c8002;
    }

    @Override // l.C7077, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C17719.m41496(e, this.f58078);
            throw null;
        }
    }

    @Override // l.C7077, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C17719.m41496(e, this.f58078);
            throw null;
        }
    }

    @Override // l.C7077, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws ZipException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C17719.m41496(e, this.f58078);
            throw null;
        }
    }
}
