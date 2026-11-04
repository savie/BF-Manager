package l;

/* JADX INFO: renamed from: l.ۨ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88DU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12648 extends AbstractC23837 {
    @Override // l.AbstractC3699
    /* JADX INFO: renamed from: ۙ */
    public final int mo12019() {
        int iRotateLeft;
        byte[] bArr;
        if (this.f77196 >= 16) {
            iRotateLeft = Integer.rotateLeft(this.f77194, 18) + Integer.rotateLeft(this.f77197, 12) + Integer.rotateLeft(this.f77193, 7) + Integer.rotateLeft(this.f77192, 1);
        } else {
            iRotateLeft = 374761393;
        }
        int iRotateLeft2 = (int) (((long) iRotateLeft) + this.f77196);
        int i = 0;
        while (true) {
            int i2 = this.f77195 - 4;
            bArr = this.f77198;
            if (i > i2) {
                break;
            }
            iRotateLeft2 = Integer.rotateLeft((C23800.m53097(i, bArr) * (-1028477379)) + iRotateLeft2, 17) * 668265263;
            i += 4;
        }
        while (i < this.f77195) {
            iRotateLeft2 = Integer.rotateLeft(((bArr[i] & 255) * 374761393) + iRotateLeft2, 11) * (-1640531535);
            i++;
        }
        int i3 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return i4 ^ (i4 >>> 16);
    }

    @Override // l.AbstractC3699
    /* JADX INFO: renamed from: ۙ */
    public final void mo12020(int i, byte[] bArr) {
        int i2;
        C23800.m53094(0, i, bArr);
        this.f77196 += (long) i;
        int i3 = this.f77195;
        int i4 = i3 + i;
        byte[] bArr2 = this.f77198;
        if (i4 < 16) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f77195 += i;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, i3, 16 - i3);
            int iM53097 = (C23800.m53097(0, bArr2) * (-2048144777)) + this.f77192;
            this.f77192 = iM53097;
            this.f77192 = Integer.rotateLeft(iM53097, 13) * (-1640531535);
            int iM53098 = (C23800.m53097(4, bArr2) * (-2048144777)) + this.f77193;
            this.f77193 = iM53098;
            this.f77193 = Integer.rotateLeft(iM53098, 13) * (-1640531535);
            int iM53099 = (C23800.m53097(8, bArr2) * (-2048144777)) + this.f77197;
            this.f77197 = iM53099;
            this.f77197 = Integer.rotateLeft(iM53099, 13) * (-1640531535);
            int iM530910 = (C23800.m53097(12, bArr2) * (-2048144777)) + this.f77194;
            this.f77194 = iM530910;
            this.f77194 = Integer.rotateLeft(iM530910, 13) * (-1640531535);
            i2 = 16 - this.f77195;
            this.f77195 = 0;
        } else {
            i2 = 0;
        }
        int i5 = i - 16;
        int iRotateLeft = this.f77192;
        int iRotateLeft2 = this.f77193;
        int iRotateLeft3 = this.f77197;
        int iRotateLeft4 = this.f77194;
        while (i2 <= i5) {
            iRotateLeft = Integer.rotateLeft((C23800.m53097(i2, bArr) * (-2048144777)) + iRotateLeft, 13) * (-1640531535);
            iRotateLeft2 = Integer.rotateLeft((C23800.m53097(i2 + 4, bArr) * (-2048144777)) + iRotateLeft2, 13) * (-1640531535);
            iRotateLeft3 = Integer.rotateLeft((C23800.m53097(i2 + 8, bArr) * (-2048144777)) + iRotateLeft3, 13) * (-1640531535);
            iRotateLeft4 = Integer.rotateLeft((C23800.m53097(i2 + 12, bArr) * (-2048144777)) + iRotateLeft4, 13) * (-1640531535);
            i2 += 16;
        }
        this.f77192 = iRotateLeft;
        this.f77193 = iRotateLeft2;
        this.f77197 = iRotateLeft3;
        this.f77194 = iRotateLeft4;
        if (i2 < i) {
            int i6 = i - i2;
            System.arraycopy(bArr, i2, bArr2, 0, i6);
            this.f77195 = i6;
        }
    }
}
