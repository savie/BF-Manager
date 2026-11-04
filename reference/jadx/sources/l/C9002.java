package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9002 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f29317;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f29318 = 0;

    public C9002(int i) {
        this.f29317 = new byte[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24017(int i) {
        byte[] bArrM42988 = C18450.m42988(this.f29318, this.f29317);
        this.f29317 = bArrM42988;
        int i2 = this.f29318;
        this.f29318 = i2 + 1;
        bArrM42988[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24018(int i, int i2, byte[] bArr) {
        byte[] bArrM42988 = C18450.m42988(this.f29318 + i2, this.f29317);
        this.f29317 = bArrM42988;
        System.arraycopy(bArr, i, bArrM42988, this.f29318, i2);
        this.f29318 += i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24022(int i) {
        byte[] bArrM42988 = C18450.m42988(this.f29318 + 1, this.f29317);
        this.f29317 = bArrM42988;
        int i2 = this.f29318;
        bArrM42988[i2] = (byte) ((i >> 8) & 255);
        bArrM42988[i2 + 1] = (byte) (i & 255);
        this.f29318 = i2 + 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24020(int i) {
        byte[] bArrM42988 = C18450.m42988(this.f29318 + 3, this.f29317);
        this.f29317 = bArrM42988;
        int i2 = this.f29318;
        bArrM42988[i2] = (byte) ((i >> 24) & 255);
        bArrM42988[i2 + 1] = (byte) ((i >> 16) & 255);
        bArrM42988[i2 + 2] = (byte) ((i >> 8) & 255);
        bArrM42988[i2 + 3] = (byte) (i & 255);
        this.f29318 = i2 + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24019(InputStream inputStream) {
        try {
            int i = this.f29318;
            int iAvailable = inputStream.available();
            byte[] bArrM42988 = C18450.m42988(this.f29318 + iAvailable, this.f29317);
            this.f29317 = bArrM42988;
            int i2 = inputStream.read(bArrM42988, i, iAvailable);
            while (i2 != -1) {
                i += i2;
                byte[] bArrM42989 = C18450.m42988(i, this.f29317);
                this.f29317 = bArrM42989;
                i2 = inputStream.read(bArrM42989, i, bArrM42989.length - i);
            }
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m24021(int i) {
        byte[] bArr = this.f29317;
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char m24023(int i) {
        byte[] bArr = this.f29317;
        return (char) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }
}
