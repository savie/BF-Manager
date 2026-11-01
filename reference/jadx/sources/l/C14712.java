package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܳᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14712 implements InterfaceC7034 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f48123;

    public C14712(long j) {
        this.f48123 = j;
    }

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
        long j = c21145.f68868;
        long j2 = this.f48123;
        if (j2 > j) {
            throw C23884.m52647("Truncation cannot extend the file.", j, j2);
        }
        InputStream inputStreamM47580 = c21145.m47580();
        try {
            C16020.m37996(inputStreamM47580, bufferedOutputStream, j2, j2 == j);
            if (inputStreamM47580 != null) {
                inputStreamM47580.close();
            }
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

    @Override // l.InterfaceC7034
    /* JADX INFO: renamed from: ۙ */
    public final void mo2748() throws C12731 {
        C16020.m37995();
    }
}
