package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: TITQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18110 extends AbstractC21094 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f59265;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f59266;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f59267;

    public C18110(InterfaceC17713 interfaceC17713, long j, int i) {
        synchronized (interfaceC17713) {
            if (interfaceC17713.isClosed()) {
                throw new IOException("File is closed");
            }
            long length = interfaceC17713.length();
            if (j < 0 || i < 0 || j > length || i > length - j) {
                throw new IndexOutOfBoundsException("Invalid file buffer range");
            }
        }
        this.f59265 = interfaceC17713;
        this.f59266 = j;
        this.f59267 = i;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۙ */
    public final int mo10510() {
        return this.f59267;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m42227(int i) throws IOException {
        InterfaceC17713 interfaceC17713 = this.f59265;
        if (interfaceC17713.isClosed()) {
            throw new IOException("File is closed");
        }
        interfaceC17713.seek(this.f59266 + ((long) i));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m42228(int i, int i2) {
        long j;
        m48158(i, i2);
        synchronized (this.f59265) {
            try {
                try {
                    m42227(i);
                    j = 0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        j |= (((long) this.f59265.readByte()) & 255) << (i3 * 8);
                    }
                } catch (IOException e) {
                    throw new C24824(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10516(int i) {
        return (byte) m42228(i, 1);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ᩸ */
    public final short mo10518(int i) {
        return (short) m42228(i, 2);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۤ */
    public final int mo10513(int i) {
        return (int) m42228(i, 4);
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] mo42229(int i, int i2) {
        m48155(i, i2);
        int[] iArr = new int[i2];
        synchronized (this.f59265) {
            try {
                try {
                    m42227(i);
                    for (int i3 = 0; i3 < i2; i3++) {
                        iArr[i3] = this.f59265.readInt();
                    }
                } catch (IOException e) {
                    throw new C24824(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    @Override // l.AbstractC21094
    /* JADX INFO: renamed from: ۙ */
    public final void mo10511(int i, int i2, byte[] bArr) {
        m48158(i, i2);
        if (i2 > bArr.length || bArr.length < 0) {
            throw new IndexOutOfBoundsException("Invalid destination range");
        }
        synchronized (this.f59265) {
            try {
                try {
                    m42227(i);
                    if (i2 != 0) {
                        this.f59265.readFully(bArr, 0, i2);
                    }
                } catch (IOException e) {
                    throw new C24824(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
