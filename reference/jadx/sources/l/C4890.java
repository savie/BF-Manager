package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4890 implements InterfaceC21539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17082 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f17083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17084;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23711 f17085;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f17086;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17087;

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15009(AbstractC22044 abstractC22044, int i) throws IOException {
        OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
        try {
            this.f17082 = false;
            C21298.m48534(this.f17083, outputStreamMo4289, this.f17087, this.f17085);
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
            if (i == 0 && this.f17084) {
                C14584.m35203(this.f17086);
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

    public C4890(AbstractC22044 abstractC22044, InputStream inputStream, long j, InterfaceC23711 interfaceC23711, boolean z) {
        this.f17086 = abstractC22044;
        this.f17083 = inputStream;
        this.f17087 = j;
        this.f17085 = interfaceC23711;
        this.f17084 = z;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15010(IOException iOException) {
        return this.f17082;
    }
}
