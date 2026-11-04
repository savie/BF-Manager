package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩹ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23643 extends C23650 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76698 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8002 f76699;

    public C23643(C8002 c8002, InputStream inputStream, long j, byte b, int i) {
        super(inputStream, j, b, i);
        this.f76699 = c8002;
    }

    @Override // l.C23650, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C17719.m41496(e, this.f76699);
            throw null;
        }
    }
}
