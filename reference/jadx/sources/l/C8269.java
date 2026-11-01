package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8269 implements InterfaceC12984 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28741;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28742 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f28743;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28744;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28745;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f28746;

    public C8269(CharSequence charSequence, String str, int i, boolean z, AbstractC20745 abstractC20745) {
        this.f28746 = charSequence;
        this.f28741 = str;
        this.f28745 = i;
        this.f28744 = z;
        this.f28743 = abstractC20745;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19603(IOException iOException) {
        return this.f28742;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final void mo19602(AbstractC20745 abstractC20745, int i) throws IOException {
        OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
        try {
            this.f28742 = false;
            C10386.m26278(new C2141(outputStreamMo33976), this.f28746, this.f28741, this.f28745);
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
            if (i == 0 && this.f28744) {
                C5553.m15325(this.f28743);
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
}
