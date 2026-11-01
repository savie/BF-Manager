package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۗۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T9P6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3161 extends C6624 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12107 f11897;

    public C3161(C12107 c12107, InputStream inputStream) {
        super(inputStream);
        this.f11897 = c12107;
    }

    @Override // l.C6624, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C21506.m48152(e, this.f11897);
            throw null;
        }
    }

    @Override // l.C6624, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C21506.m48152(e, this.f11897);
            throw null;
        }
    }
}
