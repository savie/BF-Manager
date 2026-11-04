package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7368 implements InterfaceC21539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23711 f24239;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f24240;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f24241;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f24242;

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final void mo15009(AbstractC22044 abstractC22044, int i) throws IOException {
        OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
        try {
            this.f24242[0] = true;
            C21298.m48534(this.f24241, outputStreamMo4289, this.f24240, this.f24239);
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C7368(boolean[] zArr, InputStream inputStream, long j, InterfaceC23711 interfaceC23711) {
        this.f24242 = zArr;
        this.f24241 = inputStream;
        this.f24240 = j;
        this.f24239 = interfaceC23711;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15010(IOException iOException) {
        return !this.f24242[0];
    }
}
