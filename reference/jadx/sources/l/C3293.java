package l;

/* JADX INFO: renamed from: l.ۗܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 88DU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3293 extends AbstractC14584 {
    @Override // l.AbstractC1882
    /* JADX INFO: renamed from: ۙ */
    public final int mo6132() {
        int iRotateLeft;
        byte[] bArr;
        if (this.f47718 >= 16) {
            iRotateLeft = Integer.rotateLeft(this.f47719, 18) + Integer.rotateLeft(this.f47723, 12) + Integer.rotateLeft(this.f47720, 7) + Integer.rotateLeft(this.f47722, 1);
        } else {
            iRotateLeft = 374761393;
        }
        int iRotateLeft2 = (int) (((long) iRotateLeft) + this.f47718);
        int i = 0;
        while (true) {
            int i2 = this.f47721 - 4;
            bArr = this.f47724;
            if (i > i2) {
                break;
            }
            iRotateLeft2 = Integer.rotateLeft((C23805.m52457(i, bArr) * (-1028477379)) + iRotateLeft2, 17) * 668265263;
            i += 4;
        }
        while (i < this.f47721) {
            iRotateLeft2 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + iRotateLeft2, 11) * (-1640531535);
            i++;
        }
        int i3 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return i4 ^ (i4 >>> 16);
    }

    @Override // l.AbstractC1882
    /* JADX INFO: renamed from: ۙ */
    public final void mo6133(int i, byte[] bArr) {
        int i2;
        C23805.m52453(0, i, bArr);
        this.f47718 += (long) i;
        int i3 = this.f47721;
        int i4 = i3 + i;
        byte[] bArr2 = this.f47724;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f47721 += i;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int iM52457 = (C23805.m52457(0, bArr2) * (-2048144777)) + this.f47722;
            this.f47722 = iM52457;
            this.f47722 = Integer.rotateLeft(iM52457, 13) * (-1640531535);
            int iM52458 = (C23805.m52457(4, bArr2) * (-2048144777)) + this.f47720;
            this.f47720 = iM52458;
            this.f47720 = Integer.rotateLeft(iM52458, 13) * (-1640531535);
            int iM52459 = (C23805.m52457(8, bArr2) * (-2048144777)) + this.f47723;
            this.f47723 = iM52459;
            this.f47723 = Integer.rotateLeft(iM52459, 13) * (-1640531535);
            int iM524510 = (C23805.m52457(12, bArr2) * (-2048144777)) + this.f47719;
            this.f47719 = iM524510;
            this.f47719 = Integer.rotateLeft(iM524510, 13) * (-1640531535);
            i2 = 16 - this.f47721;
            this.f47721 = 0;
        } else {
            i2 = 0;
        }
        int i5 = i - 16;
        int iRotateLeft = this.f47722;
        int iRotateLeft2 = this.f47720;
        int iRotateLeft3 = this.f47723;
        int iRotateLeft4 = this.f47719;
        while (i2 <= i5) {
            iRotateLeft = Integer.rotateLeft((C23805.m52457(i2, bArr) * (-2048144777)) + iRotateLeft, 13) * (-1640531535);
            iRotateLeft2 = Integer.rotateLeft((C23805.m52457(i2 + 4, bArr) * (-2048144777)) + iRotateLeft2, 13) * (-1640531535);
            iRotateLeft3 = Integer.rotateLeft((C23805.m52457(i2 + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
            iRotateLeft4 = Integer.rotateLeft((C23805.m52457(i2 + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
            i2 += 16;
        }
        this.f47722 = iRotateLeft;
        this.f47720 = iRotateLeft2;
        this.f47723 = iRotateLeft3;
        this.f47719 = iRotateLeft4;
        if (i2 < i) {
            int i6 = i - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i6);
            this.f47721 = i6;
        }
    }
}
