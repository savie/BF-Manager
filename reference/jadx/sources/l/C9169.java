package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NH */
/* JADX INFO: loaded from: classes4.dex */
public final class C9169 implements InterfaceC19502 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9461 f29758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f29759;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f29760;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f29762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29764;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f29763 = new byte[65536];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f29761 = new byte[4096];

    static {
        C21616.m49139("media3.extractor");
    }

    public C9169(InterfaceC9461 interfaceC9461, long j, long j2) {
        this.f29758 = interfaceC9461;
        this.f29762 = j;
        this.f29760 = j2;
    }

    @Override // l.InterfaceC19502
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo10071(false, i, i2, bArr);
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۤ */
    public final void mo10073(int i) {
        mo10070(i, false);
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ᩷ */
    public final int mo10075(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        m24302(i2);
        int i3 = this.f29759;
        int i4 = this.f29764;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m24300(true, i4, this.f29763, i2, 0);
            if (iMin == -1) {
                return -1;
            }
            this.f29759 += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f29763, this.f29764, bArr, i, iMin);
        this.f29764 += iMin;
        return iMin;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10078(boolean z, int i, int i2, byte[] bArr) {
        if (!mo10077(i2, z)) {
            return false;
        }
        System.arraycopy(this.f29763, this.f29764 - i2, bArr, i, i2);
        return true;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۙ */
    public final void mo10069(int i, int i2, byte[] bArr) {
        mo10078(false, i, i2, bArr);
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10077(int i, boolean z) throws EOFException, InterruptedIOException {
        m24302(i);
        int iM24300 = this.f29759 - this.f29764;
        while (iM24300 < i) {
            iM24300 = m24300(z, this.f29764, this.f29763, i, iM24300);
            if (iM24300 == -1) {
                return false;
            }
            this.f29759 = this.f29764 + iM24300;
        }
        this.f29764 += i;
        return true;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۙ */
    public final void mo10068(int i) throws EOFException, InterruptedIOException {
        mo10077(i, false);
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10076() {
        this.f29764 = 0;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۤ */
    public final long mo10072() {
        return this.f29762 + ((long) this.f29764);
    }

    @Override // l.InterfaceC19502
    public final long getPosition() {
        return this.f29762;
    }

    @Override // l.InterfaceC19502
    public final long getLength() {
        return this.f29760;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m24302(int i) {
        int i2 = this.f29764 + i;
        byte[] bArr = this.f29763;
        if (i2 > bArr.length) {
            this.f29763 = Arrays.copyOf(this.f29763, C7116.m19460(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10070(int i, boolean z) {
        int iMin = Math.min(this.f29759, i);
        m24301(iMin);
        int iM24300 = iMin;
        while (iM24300 < i && iM24300 != -1) {
            byte[] bArr = this.f29761;
            iM24300 = m24300(z, -iM24300, bArr, Math.min(i, bArr.length + iM24300), iM24300);
        }
        if (iM24300 != -1) {
            this.f29762 += (long) iM24300;
        }
        return iM24300 != -1;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ᩷ */
    public final int mo10074(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f29759, i);
        m24301(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f29761;
            iMin = m24300(true, 0, bArr, Math.min(i, bArr.length), 0);
        }
        if (iMin != -1) {
            this.f29762 += (long) iMin;
        }
        return iMin;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f29759;
        int iM24300 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f29763, 0, bArr, i, iMin);
            m24301(iMin);
            iM24300 = iMin;
        }
        if (iM24300 == 0) {
            iM24300 = m24300(true, i, bArr, i2, 0);
        }
        if (iM24300 != -1) {
            this.f29762 += (long) iM24300;
        }
        return iM24300;
    }

    @Override // l.InterfaceC19502
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10071(boolean z, int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f29759;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f29763, 0, bArr, i, iMin);
            m24301(iMin);
        }
        int iM24300 = iMin;
        while (iM24300 < i2 && iM24300 != -1) {
            iM24300 = m24300(z, i, bArr, i2, iM24300);
        }
        if (iM24300 != -1) {
            this.f29762 += (long) iM24300;
        }
        return iM24300 != -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m24301(int i) {
        int i2 = this.f29759 - i;
        this.f29759 = i2;
        this.f29764 = 0;
        byte[] bArr = this.f29763;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f29763 = bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m24300(boolean z, int i, byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f29758.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }
}
