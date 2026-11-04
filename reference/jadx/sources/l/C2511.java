package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2511 implements InterfaceC13258 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f8034;

    public C2511(long j) {
        this.f8034 = j;
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        long j = c12512.f40174;
        long j2 = this.f8034;
        if (j2 > j) {
            throw C9968.m25813("Truncation cannot extend the file.", j, j2);
        }
        InputStream inputStreamM31067 = c12512.m31067();
        try {
            C24535.m54818(inputStreamM31067, bufferedOutputStream, j2, j2 == j);
            if (inputStreamM31067 != null) {
                inputStreamM31067.close();
            }
        } catch (Throwable th) {
            if (inputStreamM31067 != null) {
                try {
                    inputStreamM31067.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public final void mo968() throws C10186 {
        C24535.m54817();
    }
}
