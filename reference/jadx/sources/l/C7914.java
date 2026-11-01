package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۠ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7914 extends C18071 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12107 f25997;

    public C7914(C12107 c12107, InputStream inputStream) {
        super(inputStream);
        this.f25997 = c12107;
    }

    @Override // l.C18071, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C21506.m48152(e, this.f25997);
            throw null;
        }
    }
}
