package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۙᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56G1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5077 implements InterfaceC24447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22977 f17710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13280 f17711;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15517 f17712;

    public C5077(C22977 c22977, C13280 c13280, C15517 c15517) {
        this.f17710 = c22977;
        this.f17711 = c13280;
        this.f17712 = c15517;
    }

    @Override // l.InterfaceC24447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15357(BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        MessageDigest messageDigestM36179 = C15022.m36179();
        byte[] bArr = new byte[65536];
        C13280 c13280 = this.f17711;
        long j = c13280.f42424;
        String str = c13280.f42422;
        C15517 c15517 = this.f17712;
        InputStream inputStreamM12227 = c15517.f50499.m12227();
        while (j > 0) {
            C22977 c22977 = this.f17710;
            c22977.f74615.m17002(c15517);
            int i = inputStreamM12227.read(bArr, 0, (int) Math.min(65536, j));
            if (i <= 0) {
                throw new IOException("Upload ended before Content-Length");
            }
            bufferedOutputStream.write(bArr, 0, i);
            messageDigestM36179.update(bArr, 0, i);
            j -= (long) i;
            c22977.f74615.m17003(c15517, i);
        }
        String strM36182 = C15022.m36182(messageDigestM36179.digest());
        if (str.isEmpty() || str.equalsIgnoreCase(strM36182)) {
            return strM36182;
        }
        throw C5823.m16993("TRANSFER_DIGEST_MISMATCH", "The uploaded content does not match the expected SHA-256.");
    }

    @Override // l.InterfaceC24447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15358() {
        C5823 c5823 = this.f17710.f74615;
        C15517 c15517 = this.f17712;
        synchronized (c5823) {
            c5823.m17002(c15517);
            c15517.f50500.f42431 = "publishing";
        }
    }
}
