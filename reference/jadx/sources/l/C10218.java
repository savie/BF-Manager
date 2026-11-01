package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: l.ۤۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L4GC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10218 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f34876;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7395 f34877;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C20801 f34878;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34879;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f34880;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34881 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34882;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f34883;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34884;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f34885;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f34886;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f34887;

    public C10218(String str, int i) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("input password is empty or null in AES encryptor constructor");
        }
        if (i != 1 && i != 3) {
            throw new IOException("Invalid key strength in AES encryptor constructor");
        }
        this.f34887 = str;
        this.f34876 = false;
        this.f34880 = new byte[16];
        this.f34883 = new byte[16];
        if (i == 1) {
            this.f34879 = 16;
            this.f34884 = 16;
            this.f34882 = 8;
        } else if (i == 3) {
            this.f34879 = 32;
            this.f34884 = 32;
            this.f34882 = 16;
        } else {
            throw new IOException("invalid aes key strength, cannot determine key sizes");
        }
        int i2 = this.f34882;
        if (i2 != 8 && i2 != 16) {
            throw new IOException("invalid salt size, cannot generate salt");
        }
        int i3 = i2 == 16 ? 4 : i2 == 8 ? 2 : 0;
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i3; i4++) {
            int iNextInt = new Random().nextInt();
            int i5 = i4 * 4;
            bArr[i5] = (byte) (iNextInt >> 24);
            bArr[i5 + 1] = (byte) (iNextInt >> 16);
            bArr[i5 + 2] = (byte) (iNextInt >> 8);
            bArr[i5 + 3] = (byte) iNextInt;
        }
        this.f34885 = bArr;
        try {
            byte[] bArrM37746 = new C15863(new C20096(bArr)).m37746(this.f34879 + this.f34884 + 2, this.f34887.getBytes(a.D));
            int length = bArrM37746.length;
            int i6 = this.f34879;
            int i7 = this.f34884;
            if (length != i6 + i7 + 2) {
                throw new IOException("invalid key generated, cannot decrypt file");
            }
            byte[] bArr2 = new byte[i6];
            byte[] bArr3 = new byte[i7];
            this.f34886 = new byte[2];
            System.arraycopy(bArrM37746, 0, bArr2, 0, i6);
            System.arraycopy(bArrM37746, this.f34879, bArr3, 0, this.f34884);
            System.arraycopy(bArrM37746, this.f34879 + this.f34884, this.f34886, 0, 2);
            this.f34877 = new C7395(bArr2);
            C20801 c20801 = new C20801();
            this.f34878 = c20801;
            c20801.m46785(bArr3);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26001(int i, byte[] bArr) throws IOException {
        if (this.f34876) {
            throw new IOException("AES Encryptor is in finished state (A non 16 byte block has already been passed to encryptor)");
        }
        if (i % 16 != 0) {
            this.f34876 = true;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            int i5 = this.f34881;
            byte[] bArr2 = this.f34883;
            C19390.m44437(i5, bArr2);
            C7395 c7395 = this.f34877;
            byte[] bArr3 = this.f34880;
            c7395.m19732(bArr2, bArr3);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i2 + i6;
                bArr[i7] = (byte) (bArr[i7] ^ bArr3[i6]);
            }
            C20801 c20801 = this.f34878;
            c20801.getClass();
            try {
                c20801.f67628.update(bArr, i2, i4);
                this.f34881++;
                i2 = i3;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m26004() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f34878.f67628.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m26002() {
        return this.f34886;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m26003() {
        return this.f34885;
    }
}
