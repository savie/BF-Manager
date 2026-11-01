package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C20809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f67645;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67646 = 0;

    public C20809(int i) {
        this.f67645 = new byte[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46793(int i) {
        byte[] bArrM52455 = C23805.m52455(this.f67646, this.f67645);
        this.f67645 = bArrM52455;
        int i2 = this.f67646;
        this.f67646 = i2 + 1;
        bArrM52455[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46794(int i, int i2, byte[] bArr) {
        byte[] bArrM52455 = C23805.m52455(this.f67646 + i2, this.f67645);
        this.f67645 = bArrM52455;
        System.arraycopy(bArr, i, bArrM52455, this.f67646, i2);
        this.f67646 += i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46798(int i) {
        byte[] bArrM52455 = C23805.m52455(this.f67646 + 1, this.f67645);
        this.f67645 = bArrM52455;
        int i2 = this.f67646;
        bArrM52455[i2] = (byte) ((i >> 8) & 255);
        bArrM52455[i2 + 1] = (byte) (i & 255);
        this.f67646 = i2 + 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46797(int i) {
        byte[] bArrM52455 = C23805.m52455(this.f67646 + 3, this.f67645);
        this.f67645 = bArrM52455;
        int i2 = this.f67646;
        bArrM52455[i2] = (byte) ((i >> 24) & 255);
        bArrM52455[i2 + 1] = (byte) ((i >> 16) & 255);
        bArrM52455[i2 + 2] = (byte) ((i >> 8) & 255);
        bArrM52455[i2 + 3] = (byte) (i & 255);
        this.f67646 = i2 + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46795(InputStream inputStream) {
        try {
            int i = this.f67646;
            int iAvailable = inputStream.available();
            byte[] bArrM52455 = C23805.m52455(this.f67646 + iAvailable, this.f67645);
            this.f67645 = bArrM52455;
            int i2 = inputStream.read(bArrM52455, i, iAvailable);
            while (i2 != -1) {
                i += i2;
                byte[] bArrM52456 = C23805.m52455(i, this.f67645);
                this.f67645 = bArrM52456;
                i2 = inputStream.read(bArrM52456, i, bArrM52456.length - i);
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m46796(int i) {
        byte[] bArr = this.f67645;
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final char m46792(int i) {
        byte[] bArr = this.f67645;
        return (char) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }
}
