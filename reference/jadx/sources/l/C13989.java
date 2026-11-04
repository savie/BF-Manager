package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۬ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9P6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13989 extends C1024 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8002 f44342;

    public C13989(C8002 c8002, InputStream inputStream) {
        super(inputStream);
        this.f44342 = c8002;
    }

    @Override // l.C1024, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C17719.m41496(e, this.f44342);
            throw null;
        }
    }

    @Override // l.C1024, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C17719.m41496(e, this.f44342);
            throw null;
        }
    }
}
