package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۗܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3505 extends C0529 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8002 f12084;

    public C3505(C8002 c8002, InputStream inputStream) {
        super(inputStream);
        this.f12084 = c8002;
    }

    @Override // l.C0529, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C17719.m41496(e, this.f12084);
            throw null;
        }
    }
}
