package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15321 extends OutputStream {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50059;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50058 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f50060 = new byte[16384];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7359 m36768() {
        return new C19797();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36769(C10209 c10209) throws IOException {
        ArrayList arrayList = this.f50058;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c10209.write((byte[]) it.next());
        }
        int i = this.f50059;
        if (i > 0) {
            c10209.write(this.f50060, 0, i);
        }
        arrayList.clear();
        this.f50059 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f50060;
        if (bArr.length - this.f50059 == 0) {
            this.f50058.add(bArr);
            this.f50060 = new byte[this.f50060.length];
            this.f50059 = 0;
        }
        byte[] bArr2 = this.f50060;
        int i2 = this.f50059;
        this.f50059 = i2 + 1;
        bArr2[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length = this.f50060.length - this.f50059;
        int i3 = 0;
        while (true) {
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return;
            }
            int iMin = Math.min(length, i4);
            System.arraycopy(bArr, i + i3, this.f50060, this.f50059, iMin);
            i3 += iMin;
            int i5 = this.f50059 + iMin;
            this.f50059 = i5;
            byte[] bArr2 = this.f50060;
            int length2 = bArr2.length - i5;
            if (length2 == 0) {
                this.f50058.add(bArr2);
                length = this.f50060.length;
                this.f50060 = new byte[length];
                this.f50059 = 0;
            } else {
                length = length2;
            }
        }
    }
}
