package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6W3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0578 implements InterfaceC7034 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f2527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f2528;

    public C0578(long[] jArr, byte[] bArr) {
        this.f2527 = jArr;
        this.f2528 = bArr;
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
        long j = c21145.f68868;
        this.f2527[0] = j;
        byte[] bArr = this.f2528;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 >= length) {
            InputStream inputStreamM47580 = c21145.m47580();
            try {
                C16020.m37996(inputStreamM47580, bufferedOutputStream, j, true);
                if (inputStreamM47580 != null) {
                    inputStreamM47580.close();
                }
                bufferedOutputStream.write(bArr);
                C16020.m37995();
                return;
            } catch (Throwable th) {
                if (inputStreamM47580 != null) {
                    try {
                        inputStreamM47580.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw C23884.m52647("Appended bytes exceed the supported final file size.", j2, length);
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2748() throws C12731 {
        C16020.m37995();
    }
}
