package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11788 implements InterfaceC17733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38088;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22941 f38089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17755 f38090;

    public C11788(C22941 c22941, C17755 c17755, String str) {
        this.f38089 = c22941;
        this.f38090 = c17755;
        this.f38088 = str;
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29627(AbstractC22044 abstractC22044) throws C10186, IOException {
        try {
            InputStream inputStreamM31140 = C12534.m31140(this.f38090.f58310, this.f38089);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC22044.mo4289(false));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        C8060.m21953();
                        int i = inputStreamM31140.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            inputStreamM31140.close();
                            return;
                        } else if (i > 0) {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        try {
                            inputStreamM31140.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamM31140.close();
                throw th4;
            }
        } catch (C3585 e) {
            throw C12534.m31151(e.f12274);
        }
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29626(C9113 c9113) throws C10186 {
        C8060.m21953();
        c9113.m24268(this.f38088);
    }
}
