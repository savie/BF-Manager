package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13697 implements InterfaceC8446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45175;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2455 f45176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5229 f45177;

    public C13697(C2455 c2455, C5229 c5229, String str) {
        this.f45176 = c2455;
        this.f45177 = c5229;
        this.f45175 = str;
    }

    @Override // l.InterfaceC8446
    /* JADX INFO: renamed from: ۙ */
    public final void mo22107(AbstractC20745 abstractC20745) throws C12731, IOException {
        try {
            InputStream inputStreamM17999 = C6640.m17999(this.f45177.f18133, this.f45176);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC20745.mo33976(false));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        C8758.m22720();
                        int i = inputStreamM17999.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            inputStreamM17999.close();
                            return;
                        } else if (i > 0) {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        try {
                            inputStreamM17999.close();
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
                inputStreamM17999.close();
                throw th4;
            }
        } catch (C12991 e) {
            throw C6640.m18010(e.f43317);
        }
    }

    @Override // l.InterfaceC8446
    /* JADX INFO: renamed from: ۙ */
    public final void mo22106(C3070 c3070) throws C12731 {
        C8758.m22720();
        c3070.m9209(this.f45175);
    }
}
