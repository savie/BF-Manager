package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7339 implements InterfaceC12984 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f24382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24383 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8978 f24384;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f24385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f24386;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24387;

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19602(AbstractC20745 abstractC20745, int i) throws IOException {
        OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
        try {
            this.f24383 = false;
            C22487.m49992(this.f24385, outputStreamMo33976, this.f24382, this.f24384);
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
            if (i == 0 && this.f24387) {
                C5553.m15325(this.f24386);
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

    public C7339(AbstractC20745 abstractC20745, InputStream inputStream, long j, InterfaceC8978 interfaceC8978, boolean z) {
        this.f24386 = abstractC20745;
        this.f24385 = inputStream;
        this.f24382 = j;
        this.f24384 = interfaceC8978;
        this.f24387 = z;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19603(IOException iOException) {
        return this.f24383;
    }
}
