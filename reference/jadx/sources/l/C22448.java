package l;

/* JADX INFO: renamed from: l.᩹ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: PA1K */
/* JADX INFO: loaded from: classes2.dex */
public final class C22448 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public byte f73278;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public byte f73279;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f73280;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f73281;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C2090[] f73282;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C2090[] f73283;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f73284;

    public C22448(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f73284, i, bArr);
        bArr[i + 2] = this.f73279;
        bArr[i + 3] = this.f73278;
        C4850.m13550(this.f73281, i + 4, bArr);
        int i2 = i + 8;
        C2090[] c2090Arr = this.f73282;
        C4850.m13546(c2090Arr != null ? c2090Arr.length : 0L, i2, bArr);
        int i3 = i + 10;
        C2090[] c2090Arr2 = this.f73283;
        C4850.m13546(c2090Arr2 != null ? c2090Arr2.length : 0L, i3, bArr);
        return i - (i + 12);
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f73284 = C4850.m13545(i, bArr);
        byte b = bArr[i + 2];
        this.f73279 = b;
        if ((b & 16) == 16) {
            this.f73280 = true;
        }
        this.f73278 = bArr[i + 3];
        this.f73281 = C4850.m13549(i + 4, bArr);
        this.f73282 = new C2090[C4850.m13545(i + 8, bArr)];
        this.f73283 = new C2090[C4850.m13545(i + 10, bArr)];
        return i - (i + 12);
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int iMo1806;
        C2090[] c2090Arr = this.f73282;
        if (c2090Arr != null) {
            iMo1806 = i;
            for (C2090 c2090 : c2090Arr) {
                iMo1806 += c2090.mo1806(iMo1806, bArr);
            }
        } else {
            iMo1806 = i;
        }
        C2090[] c2090Arr2 = this.f73283;
        if (c2090Arr2 != null) {
            for (C2090 c2091 : c2090Arr2) {
                iMo1806 += c2091.mo1806(iMo1806, bArr);
            }
        }
        return i - iMo1806;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        int iMo1805 = i;
        while (true) {
            C2090[] c2090Arr = this.f73282;
            if (i3 >= c2090Arr.length) {
                break;
            }
            C2090 c2090 = new C2090(this.f73280);
            c2090Arr[i3] = c2090;
            iMo1805 += c2090.mo1805(iMo1805, bArr.length, bArr);
            i3++;
        }
        while (true) {
            C2090[] c2090Arr2 = this.f73283;
            if (i2 >= c2090Arr2.length) {
                return i - iMo1805;
            }
            C2090 c2091 = new C2090(this.f73280);
            c2090Arr2[i2] = c2091;
            iMo1805 += c2091.mo1805(iMo1805, bArr.length, bArr);
            i2++;
        }
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComLockingAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f73284);
        sb.append(",typeOfLock=");
        sb.append((int) this.f73279);
        sb.append(",newOplockLevel=");
        return new String(C12441.m30911(this.f73278, "]", sb));
    }
}
