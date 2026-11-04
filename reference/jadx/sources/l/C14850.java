package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes5.dex */
public final class C14850 implements InterfaceC21539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48547 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48548;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f48549;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f48550;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48551;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48552;

    public C14850(CharSequence charSequence, String str, int i, boolean z, AbstractC22044 abstractC22044) {
        this.f48549 = charSequence;
        this.f48552 = str;
        this.f48551 = i;
        this.f48548 = z;
        this.f48550 = abstractC22044;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15010(IOException iOException) {
        return this.f48547;
    }

    @Override // l.InterfaceC21539
    /* JADX INFO: renamed from: ۙ */
    public final void mo15009(AbstractC22044 abstractC22044, int i) throws IOException {
        OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
        try {
            this.f48547 = false;
            C0681.m2966(new C5630(outputStreamMo4289), this.f48549, this.f48552, this.f48551);
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
            if (i == 0 && this.f48548) {
                C14584.m35203(this.f48550);
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
}
