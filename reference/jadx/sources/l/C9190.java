package l;

/* JADX INFO: renamed from: l.ۡۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA1K */
/* JADX INFO: loaded from: classes4.dex */
public final class C9190 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f29967;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f29968;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte f29969;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f29970;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public byte f29971;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C14411[] f29972;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C14411[] f29973;

    public C9190(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f29968, i, bArr);
        bArr[i + 2] = this.f29969;
        bArr[i + 3] = this.f29971;
        C0481.m2323(this.f29967, i + 4, bArr);
        int i2 = i + 8;
        C14411[] c14411Arr = this.f29972;
        C0481.m2319(c14411Arr != null ? c14411Arr.length : 0L, i2, bArr);
        int i3 = i + 10;
        C14411[] c14411Arr2 = this.f29973;
        C0481.m2319(c14411Arr2 != null ? c14411Arr2.length : 0L, i3, bArr);
        return i - (i + 12);
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f29968 = C0481.m2318(i, bArr);
        byte b = bArr[i + 2];
        this.f29969 = b;
        if ((b & 16) == 16) {
            this.f29970 = true;
        }
        this.f29971 = bArr[i + 3];
        this.f29967 = C0481.m2322(i + 4, bArr);
        this.f29972 = new C14411[C0481.m2318(i + 8, bArr)];
        this.f29973 = new C14411[C0481.m2318(i + 10, bArr)];
        return i - (i + 12);
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int iMo10573;
        C14411[] c14411Arr = this.f29972;
        if (c14411Arr != null) {
            iMo10573 = i;
            for (C14411 c14411 : c14411Arr) {
                iMo10573 += c14411.mo10573(iMo10573, bArr);
            }
        } else {
            iMo10573 = i;
        }
        C14411[] c14411Arr2 = this.f29973;
        if (c14411Arr2 != null) {
            for (C14411 c14412 : c14411Arr2) {
                iMo10573 += c14412.mo10573(iMo10573, bArr);
            }
        }
        return i - iMo10573;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        int iMo6138 = i;
        while (true) {
            C14411[] c14411Arr = this.f29972;
            if (i3 >= c14411Arr.length) {
                break;
            }
            C14411 c14411 = new C14411(this.f29970);
            c14411Arr[i3] = c14411;
            iMo6138 += c14411.mo6138(iMo6138, bArr.length, bArr);
            i3++;
        }
        while (true) {
            C14411[] c14411Arr2 = this.f29973;
            if (i2 >= c14411Arr2.length) {
                return i - iMo6138;
            }
            C14411 c14412 = new C14411(this.f29970);
            c14411Arr2[i2] = c14412;
            iMo6138 += c14412.mo6138(iMo6138, bArr.length, bArr);
            i2++;
        }
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComLockingAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f29968);
        sb.append(",typeOfLock=");
        sb.append((int) this.f29969);
        sb.append(",newOplockLevel=");
        return new String(C12669.m31437(this.f29971, "]", sb));
    }
}
