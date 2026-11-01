package l;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܽۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34GF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12335 f53200;

    public C16568(C2455 c2455, C12107 c12107, String str, byte[] bArr) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("Password can not be empty.");
        }
        for (Charset charset : C19390.m44436(str)) {
            try {
                this.f53200 = m38980(c12107, bArr, str.getBytes(charset));
                return;
            } catch (IOException unused) {
            }
        }
        c2455.m7474("");
        throw new C17978(c12107.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38981(int i, int i2, byte[] bArr) {
        C12335 c12335 = this.f53200;
        if (i < 0 || i2 < 0) {
            throw new IOException("One of the input parameters were null in standard decrpyt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                byte bM30645 = (byte) (((bArr[i3] & 255) ^ c12335.m30645()) & 255);
                c12335.m30646(bM30645);
                bArr[i3] = bM30645;
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12335 m38980(C12107 c12107, byte[] bArr, byte[] bArr2) throws IOException {
        byte bM30126;
        C12335 c12335 = new C12335();
        c12335.m30647(bArr2);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12) {
                byte bM30645 = (byte) (c12335.m30645() ^ b);
                if ((c12107.m30131() & 8) == 8) {
                    bM30126 = (byte) (C21506.m48153(c12107.getTime()) >> 8);
                } else {
                    bM30126 = (byte) (c12107.m30126() >> 24);
                }
                if (bM30645 != bM30126) {
                    throw new IOException();
                }
            }
            c12335.m30646((byte) (c12335.m30645() ^ b));
            if (i != 12) {
                b = bArr[i];
            }
        }
        return c12335;
    }
}
