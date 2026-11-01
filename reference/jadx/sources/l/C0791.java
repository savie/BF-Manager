package l;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.֨֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3378;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f3379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f3380;

    public C0791(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f3380 = byteArray;
                this.f3379 = byteArray.length;
                this.f3378 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3335() {
        return this.f3378;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private byte m3333() throws EOFException {
        int i = this.f3378;
        if (i >= this.f3379) {
            throw new EOFException("Reached EOF, file size=" + this.f3379);
        }
        this.f3378 = i + 1;
        return this.f3380[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m3340() {
        return m3333();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3336(int i) throws EOFException {
        int i2 = this.f3378;
        if (i + i2 > this.f3379) {
            throw new EOFException("Reached EOF, file size=" + this.f3379);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3380, i2, bArr, 0, i);
        this.f3378 += i;
        return new String(bArr, (i <= 0 || bArr[0] != 0) ? LocalizedMessage.DEFAULT_ENCODING : "UTF-16BE");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m3341(int i) throws EOFException {
        int i2 = this.f3378;
        if (i + i2 > this.f3379) {
            throw new EOFException("Reached EOF, file size=" + this.f3379);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3380, i2, bArr, 0, i);
        this.f3378 += i;
        return new String(bArr, "UTF-16BE");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m3339() throws EOFException {
        byte bM3333 = m3333();
        return bM3333 < 0 ? bM3333 + 256 : bM3333;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m3334() {
        return (((((((long) m3339()) << 8) + ((long) m3339())) << 8) + ((long) m3339())) << 8) + ((long) m3339());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m3338() {
        return m3339() + (m3339() << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3337(long j) throws EOFException {
        if (j > this.f3379 || j < 0) {
            throw new EOFException("Reached EOF, file size=" + this.f3379 + " offset=" + j);
        }
        this.f3378 = (int) j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3342(long j) throws EOFException {
        m3337(((long) this.f3378) + j);
    }
}
