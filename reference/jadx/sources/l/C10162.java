package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10162 implements InterfaceC12984 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34688;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34689 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34690;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f34691;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f34692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34693;

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final void mo19602(AbstractC20745 abstractC20745, int i) throws IOException {
        OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
        try {
            this.f34689 = false;
            outputStreamMo33976.write(this.f34691, this.f34690, this.f34693);
            outputStreamMo33976.close();
            if (i == 0 && this.f34688) {
                C5553.m15325(this.f34692);
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

    public C10162(AbstractC20745 abstractC20745, byte[] bArr, int i, int i2, boolean z) {
        this.f34692 = abstractC20745;
        this.f34691 = bArr;
        this.f34690 = i;
        this.f34693 = i2;
        this.f34688 = z;
    }

    @Override // l.InterfaceC12984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19603(IOException iOException) {
        return this.f34689;
    }
}
