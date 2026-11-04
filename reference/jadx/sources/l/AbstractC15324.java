package l;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15324 extends OutputStream {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f50065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f50067;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50068;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50066 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50064 = -1;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract byte[] mo32557();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36770(int i) {
        int i2 = this.f50064;
        ArrayList arrayList = this.f50066;
        if (i2 < arrayList.size() - 1) {
            this.f50065 += this.f50067.length;
            int i3 = this.f50064 + 1;
            this.f50064 = i3;
            this.f50067 = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f50067;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.f50065 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f50065);
            this.f50065 += this.f50067.length;
        }
        this.f50064++;
        byte[] bArr2 = C5125.f17846;
        byte[] bArr3 = new byte[i];
        this.f50067 = bArr3;
        arrayList.add(bArr3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m36774() {
        int i = this.f50068;
        if (i == 0) {
            return C5125.f17846;
        }
        byte[] bArr = C5125.f17846;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : this.f50066) {
            int iMin = Math.min(bArr3.length, i);
            System.arraycopy(bArr3, 0, bArr2, i2, iMin);
            i2 += iMin;
            i -= iMin;
            if (i == 0) {
                break;
            }
        }
        return bArr2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m36773(i);
    }

    @Deprecated
    public final String toString() {
        return new String(mo32557(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36772(int i, int i2, byte[] bArr) {
        int i3 = this.f50068;
        int i4 = i3 + i2;
        int i5 = i3 - this.f50065;
        int i6 = i2;
        while (i6 > 0) {
            int iMin = Math.min(i6, this.f50067.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.f50067, i5, iMin);
            i6 -= iMin;
            if (i6 > 0) {
                m36770(i4);
                i5 = 0;
            }
        }
        this.f50068 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36771(C22038 c22038) {
        int i = this.f50068 - this.f50065;
        byte[] bArr = this.f50067;
        int i2 = c22038.read(bArr, i, bArr.length - i);
        while (i2 != -1) {
            i += i2;
            this.f50068 += i2;
            byte[] bArr2 = this.f50067;
            if (i == bArr2.length) {
                m36770(bArr2.length);
                i = 0;
            }
            byte[] bArr3 = this.f50067;
            i2 = c22038.read(bArr3, i, bArr3.length - i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36773(int i) {
        int i2 = this.f50068;
        int i3 = i2 - this.f50065;
        if (i3 == this.f50067.length) {
            m36770(i2 + 1);
            i3 = 0;
        }
        this.f50067[i3] = (byte) i;
        this.f50068++;
    }
}
