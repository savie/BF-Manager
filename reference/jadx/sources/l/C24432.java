package l;

import java.nio.charset.Charset;
import java.util.Random;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.᩺ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9GW */
/* JADX INFO: loaded from: classes.dex */
public final class C24432 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Random f79303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9689 f79304;

    public C24432(Random random, C9689 c9689) {
        this.f79303 = random;
        this.f79304 = c9689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5985 m54642(String str, String str2, char[] cArr, C14734 c14734, long j, C19210 c19210) {
        byte[] bArr = new byte[8];
        this.f79303.nextBytes(bArr);
        byte[] bArrM54643 = m54643(String.valueOf(cArr), str, str2);
        byte[] bArrM54644 = m54643(String.valueOf(cArr), str, str2);
        byte[] bArrM35422 = c14734.m35422();
        C11707 c11707 = new C11707();
        C9689 c9689 = this.f79304;
        byte[] bArrM18404 = C6532.m18404(c9689, bArrM54644, bArrM35422, bArr);
        c11707.m56007(bArrM18404.length, bArrM18404);
        c11707.m56007(8, bArr);
        byte[] bArrM56028 = c11707.m56028();
        byte[] bArrM35423 = c14734.m35422();
        C11707 c11708 = new C11707();
        c11708.m56005((byte) 1);
        c11708.m56005((byte) 1);
        c11708.m56023(0);
        c11708.m56025(0L);
        c11708.m56008(j);
        c11708.m56007(8, bArr);
        c11708.m56025(0L);
        if (c19210 != null) {
            c19210.m44530(c11708);
        }
        c11708.m56025(0L);
        byte[] bArrM56029 = c11708.m56028();
        byte[] bArrM18405 = C6532.m18404(c9689, bArrM54643, bArrM35423, bArrM56029);
        byte[] bArr2 = new byte[bArrM18405.length + bArrM56029.length];
        System.arraycopy(bArrM18405, 0, bArr2, 0, bArrM18405.length);
        System.arraycopy(bArrM56029, 0, bArr2, bArrM18405.length, bArrM56029.length);
        return new C5985(bArr2, bArrM56028, C6532.m18404(c9689, bArrM54643, Arrays.copyOfRange(bArr2, 0, 16)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m54643(String str, String str2, String str3) {
        byte[] bytes;
        C9689 c9689 = this.f79304;
        if (str == null) {
            Charset charset = C6532.f21949;
            bytes = new byte[0];
        } else {
            bytes = str.getBytes(C6532.f21949);
        }
        try {
            c9689.getClass();
            C1487 c1487M25274 = C9689.m25274("MD4");
            c1487M25274.m5309(bytes);
            byte[] bArrM5311 = c1487M25274.m5311();
            String upperCase = str2.toUpperCase();
            return C6532.m18404(c9689, bArrM5311, upperCase == null ? new byte[0] : upperCase.getBytes(C6532.f21949), str3 == null ? new byte[0] : str3.getBytes(C6532.f21949));
        } catch (C11181 e) {
            throw new C5786(e);
        }
    }
}
