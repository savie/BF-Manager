package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20703 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24433 f66361;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6908 f66363;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f66364;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4295 f66365;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f66366;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset[] f66360 = {Charset.forName("GBK")};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset[] f66359 = {Charset.forName("GBK"), Charset.forName(a.D), Charset.forName("BIG5")};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66362 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f66368 = new byte[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f66367 = new byte[16];

    public C20703(int i, String str, byte[] bArr, byte[] bArr2, InterfaceC6908 interfaceC6908) throws IOException {
        this.f66363 = interfaceC6908;
        if (i == 1) {
            this.f66366 = 16;
            this.f66364 = 16;
        } else if (i == 2) {
            this.f66366 = 24;
            this.f66364 = 24;
        } else if (i == 3) {
            this.f66366 = 32;
            this.f66364 = 32;
        } else {
            throw new IOException("Invalid aes key strength");
        }
        if (str == null || str.isEmpty()) {
            throw new IOException("Empty or null password provided for AES Decryptor");
        }
        byte[] bArr3 = new byte[this.f66366];
        byte[] bArr4 = new byte[this.f66364];
        byte[] bArr5 = new byte[2];
        for (Charset charset : m47365(str)) {
            try {
                byte[] bArrM35424 = new C14735(new C21449(bArr)).m35424(this.f66366 + this.f66364 + 2, str.getBytes(charset));
                int length = bArrM35424.length;
                int i2 = this.f66366 + this.f66364;
                if (length == i2 + 2) {
                    System.arraycopy(bArrM35424, i2, bArr5, 0, 2);
                    if (Arrays.equals(bArr2, bArr5)) {
                        System.arraycopy(bArrM35424, 0, bArr3, 0, this.f66366);
                        System.arraycopy(bArrM35424, this.f66366, bArr4, 0, this.f66364);
                        this.f66361 = new C24433(bArr3);
                        C4295 c4295 = new C4295();
                        this.f66365 = c4295;
                        c4295.m13671(bArr4);
                        return;
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
        throw ((C16227) this.f66363.get());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47367(int i, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f66367;
        byte[] bArr3 = this.f66368;
        if (this.f66361 == null) {
            throw new IOException("AES not initialized properly");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            try {
                C4295 c4295 = this.f66365;
                c4295.getClass();
                try {
                    c4295.f15575.update(bArr, i2, i4);
                    m47366(this.f66362, bArr3);
                    this.f66361.m54646(bArr3, bArr2);
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i2 + i5;
                        bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5]);
                    }
                    this.f66362++;
                    i2 = i3;
                } catch (IllegalStateException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new IOException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m47368() {
        return this.f66365.f15575.doFinal();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47366(int i, byte[] bArr) {
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 0;
        bArr[9] = 0;
        bArr[10] = 0;
        bArr[11] = 0;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Charset[] m47365(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~') {
                return f66359;
            }
        }
        return f66360;
    }
}
