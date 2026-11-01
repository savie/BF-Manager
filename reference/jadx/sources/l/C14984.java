package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14984 implements InterfaceC7222 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f48899;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48900;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6942 f48901;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f48902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f48904 = new byte[65536];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f48905 = new byte[4096];

    static {
        C11572.m28868("media3.extractor");
    }

    public C14984(InterfaceC6942 interfaceC6942, long j, long j2) {
        this.f48901 = interfaceC6942;
        this.f48902 = j;
        this.f48899 = j2;
    }

    @Override // l.InterfaceC7222
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo19212(false, i, i2, bArr);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۨ */
    public final void mo19214(int i) {
        mo19211(i, false);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final int mo19216(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        m35960(i2);
        int i3 = this.f48903;
        int i4 = this.f48900;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m35961(true, i4, this.f48904, i2, 0);
            if (iMin == -1) {
                return -1;
            }
            this.f48903 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f48904, this.f48900, bArr, i, iMin);
        this.f48900 += iMin;
        return iMin;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19219(boolean z, int i, int i2, byte[] bArr) {
        if (!mo19218(i2, z)) {
            return false;
        }
        System.arraycopy(this.f48904, this.f48900 - i2, bArr, i, i2);
        return true;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final void mo19210(int i, int i2, byte[] bArr) {
        mo19219(false, i, i2, bArr);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19218(int i, boolean z) throws EOFException, InterruptedIOException {
        m35960(i);
        int iM35961 = this.f48903 - this.f48900;
        while (iM35961 < i) {
            iM35961 = m35961(z, this.f48900, this.f48904, i, iM35961);
            if (iM35961 == -1) {
                return false;
            }
            this.f48903 = this.f48900 + iM35961;
        }
        this.f48900 += i;
        return true;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final void mo19209(int i) throws EOFException, InterruptedIOException {
        mo19218(i, false);
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final void mo19217() {
        this.f48900 = 0;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۨ */
    public final long mo19213() {
        return this.f48902 + ((long) this.f48900);
    }

    @Override // l.InterfaceC7222
    public final long getPosition() {
        return this.f48902;
    }

    @Override // l.InterfaceC7222
    public final long getLength() {
        return this.f48899;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m35960(int i) {
        int i2 = this.f48900 + i;
        byte[] bArr = this.f48904;
        if (i2 > bArr.length) {
            this.f48904 = Arrays.copyOf(this.f48904, C17983.m41813(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19211(int i, boolean z) {
        int iMin = Math.min(this.f48903, i);
        m35962(iMin);
        int iM35961 = iMin;
        while (iM35961 < i && iM35961 != -1) {
            byte[] bArr = this.f48905;
            iM35961 = m35961(z, -iM35961, bArr, Math.min(i, bArr.length + iM35961), iM35961);
        }
        if (iM35961 != -1) {
            this.f48902 += (long) iM35961;
        }
        return iM35961 != -1;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ܰ */
    public final int mo19215(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f48903, i);
        m35962(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f48905;
            iMin = m35961(true, 0, bArr, Math.min(i, bArr.length), 0);
        }
        if (iMin != -1) {
            this.f48902 += (long) iMin;
        }
        return iMin;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f48903;
        int iM35961 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f48904, 0, bArr, i, iMin);
            m35962(iMin);
            iM35961 = iMin;
        }
        if (iM35961 == 0) {
            iM35961 = m35961(true, i, bArr, i2, 0);
        }
        if (iM35961 != -1) {
            this.f48902 += (long) iM35961;
        }
        return iM35961;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19212(boolean z, int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f48903;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f48904, 0, bArr, i, iMin);
            m35962(iMin);
        }
        int iM35961 = iMin;
        while (iM35961 < i2 && iM35961 != -1) {
            iM35961 = m35961(z, i, bArr, i2, iM35961);
        }
        if (iM35961 != -1) {
            this.f48902 += (long) iM35961;
        }
        return iM35961 != -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m35962(int i) {
        int i2 = this.f48903 - i;
        this.f48903 = i2;
        this.f48900 = 0;
        byte[] bArr = this.f48904;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f48904 = bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35961(boolean z, int i, byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f48901.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }
}
