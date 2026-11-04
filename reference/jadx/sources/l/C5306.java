package l;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۚ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I66L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5306 implements InterfaceC4848, InterfaceC15568 {
    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public int mo14089(long j) {
        return 0;
    }

    @Override // l.InterfaceC15568
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24652 mo15939(C24652 c24652, SecretKey secretKey) {
        return c24652;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public void mo14091() {
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo14092() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15932(double d) {
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid number: " + d);
        }
        return C4560.m14325(Float.toString((float) d));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m15937(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public int mo14090(C16461 c16461, C5690 c5690, int i) {
        c5690.m33307(4);
        return -4;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m15938(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m15934(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m15936(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m15935(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15933(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
