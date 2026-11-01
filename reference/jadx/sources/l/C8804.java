package l;

/* JADX INFO: renamed from: l.ۡۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30280 = {100, 101, 120, 10, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22922(int i) {
        int i2;
        if (i > 23) {
            switch (i) {
                case 24:
                case 25:
                    i2 = 37;
                    break;
                case 26:
                case 27:
                    i2 = 38;
                    break;
                case 28:
                case 29:
                    i2 = 39;
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    i2 = 40;
                    break;
                case 35:
                    i2 = 41;
                    break;
                default:
                    i2 = -1;
                    break;
            }
        } else {
            i2 = 35;
        }
        byte[] bArr = (byte[]) f30280.clone();
        if (i2 < 0) {
            throw new IllegalArgumentException("dexVersion must be within [0, 999]");
        }
        for (int i3 = 6; i3 >= 4; i3--) {
            bArr[i3] = (byte) ((i2 % 10) + 48);
            i2 /= 10;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m22923(AbstractC18119 abstractC18119) {
        if (abstractC18119.length() < 8) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = f30280;
            if (i >= 4) {
                for (int i2 = 4; i2 < 7; i2++) {
                    if (abstractC18119.mo5855(i2) < 48 || abstractC18119.mo5855(i2) > 57) {
                        return false;
                    }
                }
                return abstractC18119.mo5855(7) == bArr[7];
            }
            if (abstractC18119.mo5855(i) != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22921(AbstractC18119 abstractC18119) {
        if (!m22923(abstractC18119)) {
            return -1;
        }
        return (abstractC18119.mo5855(6) - 48) + ((abstractC18119.mo5855(5) - 48) * 10) + ((abstractC18119.mo5855(4) - 48) * 100);
    }
}
