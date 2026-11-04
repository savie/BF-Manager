package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14224 implements InterfaceC13258 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f44945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f44946;

    public C14224(long[] jArr, byte[] bArr) {
        this.f44945 = jArr;
        this.f44946 = bArr;
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        long j = c12512.f40174;
        this.f44945[0] = j;
        byte[] bArr = this.f44946;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 >= length) {
            InputStream inputStreamM31067 = c12512.m31067();
            try {
                C24535.m54818(inputStreamM31067, bufferedOutputStream, j, true);
                if (inputStreamM31067 != null) {
                    inputStreamM31067.close();
                }
                bufferedOutputStream.write(bArr);
                C24535.m54817();
                return;
            } catch (Throwable th) {
                if (inputStreamM31067 != null) {
                    try {
                        inputStreamM31067.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw C9968.m25813("Appended bytes exceed the supported final file size.", j2, length);
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo968() throws C10186 {
        C24535.m54817();
    }
}
