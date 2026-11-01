package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18840 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f61036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61037 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61038;

    public C18840() {
        byte[] bArr = new byte[65536];
        this.f61036 = bArr;
        this.f61038 = bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43470() {
        return this.f61036;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43472() {
        return this.f61037;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m43471() {
        return this.f61038 == this.f61037;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43473(InputStream inputStream) throws IOException {
        this.f61037 = 0;
        byte[] bArr = this.f61036;
        int i = this.f61038;
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        this.f61037 = i2;
        return i2 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43469(InputStream inputStream) throws IOException {
        int i = this.f61038;
        if (i >= 524288) {
            return false;
        }
        int i2 = i * 2;
        byte[] bArr = this.f61036;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, this.f61037);
            this.f61036 = bArr2;
        }
        this.f61038 = i2;
        byte[] bArr3 = this.f61036;
        int i3 = this.f61037;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr3, i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        this.f61037 = i3;
        return true;
    }
}
