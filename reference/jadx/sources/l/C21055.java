package l;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩶ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21055 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67289;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f67290;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f67291;

    public C21055(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f67291 = byteArray;
                this.f67290 = byteArray.length;
                this.f67289 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48123() {
        return this.f67289;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte m48122() throws EOFException {
        int i = this.f67289;
        if (i >= this.f67290) {
            throw new EOFException("Reached EOF, file size=" + this.f67290);
        }
        this.f67289 = i + 1;
        return this.f67291[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte m48128() {
        return m48122();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48124(int i) throws EOFException {
        int i2 = this.f67289;
        if (i + i2 > this.f67290) {
            throw new EOFException("Reached EOF, file size=" + this.f67290);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f67291, i2, bArr, 0, i);
        this.f67289 += i;
        return new String(bArr, (i <= 0 || bArr[0] != 0) ? LocalizedMessage.DEFAULT_ENCODING : "UTF-16BE");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48129(int i) throws EOFException {
        int i2 = this.f67289;
        if (i + i2 > this.f67290) {
            throw new EOFException("Reached EOF, file size=" + this.f67290);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f67291, i2, bArr, 0, i);
        this.f67289 += i;
        return new String(bArr, "UTF-16BE");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m48126() throws EOFException {
        byte bM48122 = m48122();
        return bM48122 < 0 ? bM48122 + 256 : bM48122;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m48131() {
        return (((((((long) m48126()) << 8) + ((long) m48126())) << 8) + ((long) m48126())) << 8) + ((long) m48126());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m48127() {
        return m48126() + (m48126() << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48125(long j) throws EOFException {
        if (j > this.f67290 || j < 0) {
            throw new EOFException("Reached EOF, file size=" + this.f67290 + " offset=" + j);
        }
        this.f67289 = (int) j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48130(long j) throws EOFException {
        m48125(((long) this.f67289) + j);
    }
}
