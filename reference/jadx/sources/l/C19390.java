package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C19390 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f62518;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7395 f62520;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62521;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23949 f62522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20801 f62525;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Charset[] f62517 = {Charset.forName("GBK")};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Charset[] f62516 = {Charset.forName("GBK"), Charset.forName(a.D), Charset.forName("BIG5")};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f62523 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f62519 = new byte[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f62524 = new byte[16];

    public C19390(int i, String str, byte[] bArr, byte[] bArr2, InterfaceC23949 interfaceC23949) throws IOException {
        this.f62522 = interfaceC23949;
        if (i == 1) {
            this.f62521 = 16;
            this.f62518 = 16;
        } else if (i == 2) {
            this.f62521 = 24;
            this.f62518 = 24;
        } else if (i == 3) {
            this.f62521 = 32;
            this.f62518 = 32;
        } else {
            throw new IOException("Invalid aes key strength");
        }
        if (str == null || str.isEmpty()) {
            throw new IOException("Empty or null password provided for AES Decryptor");
        }
        byte[] bArr3 = new byte[this.f62521];
        byte[] bArr4 = new byte[this.f62518];
        byte[] bArr5 = new byte[2];
        for (Charset charset : m44436(str)) {
            try {
                byte[] bArrM37746 = new C15863(new C20096(bArr)).m37746(this.f62521 + this.f62518 + 2, str.getBytes(charset));
                int length = bArrM37746.length;
                int i2 = this.f62521 + this.f62518;
                if (length == i2 + 2) {
                    System.arraycopy(bArrM37746, i2, bArr5, 0, 2);
                    if (Arrays.equals(bArr2, bArr5)) {
                        System.arraycopy(bArrM37746, 0, bArr3, 0, this.f62521);
                        System.arraycopy(bArrM37746, this.f62521, bArr4, 0, this.f62518);
                        this.f62520 = new C7395(bArr3);
                        C20801 c20801 = new C20801();
                        this.f62525 = c20801;
                        c20801.m46785(bArr4);
                        return;
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
        throw ((C17978) this.f62522.get());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44438(int i, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f62524;
        byte[] bArr3 = this.f62519;
        if (this.f62520 == null) {
            throw new IOException("AES not initialized properly");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            try {
                C20801 c20801 = this.f62525;
                c20801.getClass();
                try {
                    c20801.f67628.update(bArr, i2, i4);
                    m44437(this.f62523, bArr3);
                    this.f62520.m19732(bArr3, bArr2);
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i2 + i5;
                        bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5]);
                    }
                    this.f62523++;
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
    public final byte[] m44439() {
        return this.f62525.f67628.doFinal();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44437(int i, byte[] bArr) {
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
    public static Charset[] m44436(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~') {
                return f62516;
            }
        }
        return f62517;
    }
}
