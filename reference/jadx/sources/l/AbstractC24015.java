package l;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24015 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f77819;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f77820;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77821 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77822 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f77823;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract byte[] mo35530();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52848(int i) {
        int i2 = this.f77822;
        ArrayList arrayList = this.f77821;
        if (i2 < arrayList.size() - 1) {
            this.f77820 += this.f77819.length;
            int i3 = this.f77822 + 1;
            this.f77822 = i3;
            this.f77819 = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f77819;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.f77820 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f77820);
            this.f77820 += this.f77819.length;
        }
        this.f77822++;
        byte[] bArr2 = C20010.f64054;
        byte[] bArr3 = new byte[i];
        this.f77819 = bArr3;
        arrayList.add(bArr3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m52850() {
        int i = this.f77823;
        if (i == 0) {
            return C20010.f64054;
        }
        byte[] bArr = C20010.f64054;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : this.f77821) {
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
        m52851(i);
    }

    @Deprecated
    public final String toString() {
        return new String(mo35530(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52849(int i, int i2, byte[] bArr) {
        int i3 = this.f77823;
        int i4 = i3 + i2;
        int i5 = i3 - this.f77820;
        int i6 = i2;
        while (i6 > 0) {
            int iMin = Math.min(i6, this.f77819.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.f77819, i5, iMin);
            i6 -= iMin;
            if (i6 > 0) {
                m52848(i4);
                i5 = 0;
            }
        }
        this.f77823 = i4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52851(int i) {
        int i2 = this.f77823;
        int i3 = i2 - this.f77820;
        if (i3 == this.f77819.length) {
            m52848(i2 + 1);
            i3 = 0;
        }
        this.f77819[i3] = (byte) i;
        this.f77823++;
    }
}
