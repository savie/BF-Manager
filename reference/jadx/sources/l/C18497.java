package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ᩴۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18497 extends C2548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58937 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12107 f58938;

    public C18497(C12107 c12107, InputStream inputStream, long j, byte b, int i) {
        super(inputStream, j, b, i);
        this.f58938 = c12107;
    }

    @Override // l.C2548, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C21506.m48152(e, this.f58938);
            throw null;
        }
    }
}
