package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f19804;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19805 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19806;

    public C5759() {
        byte[] bArr = new byte[65536];
        this.f19804 = bArr;
        this.f19806 = bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m16831() {
        return this.f19804;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16833() {
        return this.f19805;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m16832() {
        return this.f19806 == this.f19805;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m16834(InputStream inputStream) throws IOException {
        this.f19805 = 0;
        byte[] bArr = this.f19804;
        int i = this.f19806;
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        this.f19805 = i2;
        return i2 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16830(InputStream inputStream) throws IOException {
        int i = this.f19806;
        if (i >= 524288) {
            return false;
        }
        int i2 = i * 2;
        byte[] bArr = this.f19804;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, this.f19805);
            this.f19804 = bArr2;
        }
        this.f19806 = i2;
        byte[] bArr3 = this.f19804;
        int i3 = this.f19805;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr3, i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        this.f19805 = i3;
        return true;
    }
}
