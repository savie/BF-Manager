package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5HO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0722 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f3003;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3004 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f3005 = new byte[16384];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19774 m3142() {
        return new C20479();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3143(C15249 c15249) throws IOException {
        ArrayList arrayList = this.f3004;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c15249.write((byte[]) it.next());
        }
        int i = this.f3003;
        if (i > 0) {
            c15249.write(this.f3005, 0, i);
        }
        arrayList.clear();
        this.f3003 = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f3005;
        if (bArr.length - this.f3003 == 0) {
            this.f3004.add(bArr);
            this.f3005 = new byte[this.f3005.length];
            this.f3003 = 0;
        }
        byte[] bArr2 = this.f3005;
        int i2 = this.f3003;
        this.f3003 = i2 + 1;
        bArr2[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length = this.f3005.length - this.f3003;
        int i3 = 0;
        while (true) {
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return;
            }
            int iMin = Math.min(length, i4);
            System.arraycopy(bArr, i + i3, this.f3005, this.f3003, iMin);
            i3 += iMin;
            int i5 = this.f3003 + iMin;
            this.f3003 = i5;
            byte[] bArr2 = this.f3005;
            int length2 = bArr2.length - i5;
            if (length2 == 0) {
                this.f3004.add(bArr2);
                length = this.f3005.length;
                this.f3005 = new byte[length];
                this.f3003 = 0;
            } else {
                length = length2;
            }
        }
    }
}
