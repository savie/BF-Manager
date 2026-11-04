package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: l.ۛܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4GC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6533 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4295 f21950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21951;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f21952;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21953;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21954 = 1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f21955;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f21956;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f21957;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f21958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21959;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24433 f21960;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f21961;

    public C6533(String str, int i) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("input password is empty or null in AES encryptor constructor");
        }
        if (i != 1 && i != 3) {
            throw new IOException("Invalid key strength in AES encryptor constructor");
        }
        this.f21961 = str;
        this.f21955 = false;
        this.f21958 = new byte[16];
        this.f21952 = new byte[16];
        if (i == 1) {
            this.f21951 = 16;
            this.f21959 = 16;
            this.f21953 = 8;
        } else if (i == 3) {
            this.f21951 = 32;
            this.f21959 = 32;
            this.f21953 = 16;
        } else {
            throw new IOException("invalid aes key strength, cannot determine key sizes");
        }
        int i2 = this.f21953;
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
        this.f21957 = bArr;
        try {
            byte[] bArrM35424 = new C14735(new C21449(bArr)).m35424(this.f21951 + this.f21959 + 2, this.f21961.getBytes(a.D));
            int length = bArrM35424.length;
            int i6 = this.f21951;
            int i7 = this.f21959;
            if (length != i6 + i7 + 2) {
                throw new IOException("invalid key generated, cannot decrypt file");
            }
            byte[] bArr2 = new byte[i6];
            byte[] bArr3 = new byte[i7];
            this.f21956 = new byte[2];
            System.arraycopy(bArrM35424, 0, bArr2, 0, i6);
            System.arraycopy(bArrM35424, this.f21951, bArr3, 0, this.f21959);
            System.arraycopy(bArrM35424, this.f21951 + this.f21959, this.f21956, 0, 2);
            this.f21960 = new C24433(bArr2);
            C4295 c4295 = new C4295();
            this.f21950 = c4295;
            c4295.m13671(bArr3);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18406(int i, byte[] bArr) throws IOException {
        if (this.f21955) {
            throw new IOException("AES Encryptor is in finished state (A non 16 byte block has already been passed to encryptor)");
        }
        if (i % 16 != 0) {
            this.f21955 = true;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            int i5 = this.f21954;
            byte[] bArr2 = this.f21952;
            C20703.m47366(i5, bArr2);
            C24433 c24433 = this.f21960;
            byte[] bArr3 = this.f21958;
            c24433.m54646(bArr2, bArr3);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i2 + i6;
                bArr[i7] = (byte) (bArr[i7] ^ bArr3[i6]);
            }
            C4295 c4295 = this.f21950;
            c4295.getClass();
            try {
                c4295.f15575.update(bArr, i2, i4);
                this.f21954++;
                i2 = i3;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m18409() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f21950.f15575.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18407() {
        return this.f21956;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m18408() {
        return this.f21957;
    }
}
