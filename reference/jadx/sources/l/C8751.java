package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8751 implements InterfaceC12984 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f30080;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8978 f30081;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f30082;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f30083;

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final void mo19602(AbstractC20745 abstractC20745, int i) throws IOException {
        OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
        try {
            this.f30080[0] = true;
            C22487.m49992(this.f30083, outputStreamMo33976, this.f30082, this.f30081);
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C8751(boolean[] zArr, InputStream inputStream, long j, InterfaceC8978 interfaceC8978) {
        this.f30080 = zArr;
        this.f30083 = inputStream;
        this.f30082 = j;
        this.f30081 = interfaceC8978;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19603(IOException iOException) {
        return !this.f30080[0];
    }
}
