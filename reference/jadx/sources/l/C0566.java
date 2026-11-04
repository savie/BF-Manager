package l;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֡ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34GF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0566 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8024 f2325;

    public C0566(C22941 c22941, C8002 c8002, String str, byte[] bArr) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("Password can not be empty.");
        }
        for (Charset charset : C20703.m47365(str)) {
            try {
                this.f2325 = m2580(c8002, bArr, str.getBytes(charset));
                return;
            } catch (IOException unused) {
            }
        }
        c22941.m51730("");
        throw new C16227(c8002.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2581(int i, int i2, byte[] bArr) {
        C8024 c8024 = this.f2325;
        if (i < 0 || i2 < 0) {
            throw new IOException("One of the input parameters were null in standard decrpyt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                byte bM21889 = (byte) (((bArr[i3] & 255) ^ c8024.m21889()) & 255);
                c8024.m21890(bM21889);
                bArr[i3] = bM21889;
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8024 m2580(C8002 c8002, byte[] bArr, byte[] bArr2) throws IOException {
        byte bM21825;
        C8024 c8024 = new C8024();
        c8024.m21891(bArr2);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12) {
                byte bM21889 = (byte) (c8024.m21889() ^ b);
                if ((c8002.m21841() & 8) == 8) {
                    bM21825 = (byte) (C17719.m41497(c8002.getTime()) >> 8);
                } else {
                    bM21825 = (byte) (c8002.m21825() >> 24);
                }
                if (bM21889 != bM21825) {
                    throw new IOException();
                }
            }
            c8024.m21890((byte) (c8024.m21889() ^ b));
            if (i != 12) {
                b = bArr[i];
            }
        }
        return c8024;
    }
}
