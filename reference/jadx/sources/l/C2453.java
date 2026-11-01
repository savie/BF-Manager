package l;

import java.nio.charset.Charset;
import java.util.Random;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ۖۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W9GW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2453 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Random f9764;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21356 f9765;

    public C2453(Random random, C21356 c21356) {
        this.f9764 = random;
        this.f9765 = c21356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13744 m7438(String str, String str2, char[] cArr, C22210 c22210, long j, C22916 c22916) {
        byte[] bArr = new byte[8];
        this.f9764.nextBytes(bArr);
        byte[] bArrM7439 = m7439(String.valueOf(cArr), str, str2);
        byte[] bArrM74310 = m7439(String.valueOf(cArr), str, str2);
        byte[] bArrM49331 = c22210.m49331();
        C5982 c5982 = new C5982();
        C21356 c21356 = this.f9765;
        byte[] bArrM28968 = C11627.m28968(c21356, bArrM74310, bArrM49331, bArr);
        c5982.m27383(bArrM28968.length, bArrM28968);
        c5982.m27383(8, bArr);
        byte[] bArrM27377 = c5982.m27377();
        byte[] bArrM49332 = c22210.m49331();
        C5982 c5983 = new C5982();
        c5983.m27381((byte) 1);
        c5983.m27381((byte) 1);
        c5983.m27396(0);
        c5983.m27398(0L);
        c5983.m27384(j);
        c5983.m27383(8, bArr);
        c5983.m27398(0L);
        if (c22916 != null) {
            c22916.m50696(c5983);
        }
        c5983.m27398(0L);
        byte[] bArrM27378 = c5983.m27377();
        byte[] bArrM28969 = C11627.m28968(c21356, bArrM7439, bArrM49332, bArrM27378);
        byte[] bArr2 = new byte[bArrM28969.length + bArrM27378.length];
        System.arraycopy(bArrM28969, 0, bArr2, 0, bArrM28969.length);
        System.arraycopy(bArrM27378, 0, bArr2, bArrM28969.length, bArrM27378.length);
        return new C13744(bArr2, bArrM27377, C11627.m28968(c21356, bArrM7439, Arrays.copyOfRange(bArr2, 0, 16)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m7439(String str, String str2, String str3) {
        byte[] bytes;
        C21356 c21356 = this.f9765;
        if (str == null) {
            Charset charset = C11627.f39051;
            bytes = new byte[0];
        } else {
            bytes = str.getBytes(C11627.f39051);
        }
        try {
            c21356.getClass();
            C15007 c15007M47885 = C21356.m47885("MD4");
            c15007M47885.m35984(bytes);
            byte[] bArrM35986 = c15007M47885.m35986();
            String upperCase = str2.toUpperCase();
            return C11627.m28968(c21356, bArrM35986, upperCase == null ? new byte[0] : upperCase.getBytes(C11627.f39051), str3 == null ? new byte[0] : str3.getBytes(C11627.f39051));
        } catch (C7206 e) {
            throw new C16338(e);
        }
    }
}
