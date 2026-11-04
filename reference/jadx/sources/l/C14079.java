package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14079 implements InterfaceC21539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44572 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f44573;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44574;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44575;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f44576;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44577;

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final void mo15009(AbstractC22044 abstractC22044, int i) throws IOException {
        OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
        try {
            this.f44572 = false;
            outputStreamMo4289.write(this.f44573, this.f44575, this.f44574);
            outputStreamMo4289.close();
            if (i == 0 && this.f44577) {
                C14584.m35203(this.f44576);
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

    public C14079(AbstractC22044 abstractC22044, byte[] bArr, int i, int i2, boolean z) {
        this.f44576 = abstractC22044;
        this.f44573 = bArr;
        this.f44575 = i;
        this.f44574 = i2;
        this.f44577 = z;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15010(IOException iOException) {
        return this.f44572;
    }
}
