package l;

import com.alipay.sdk.m.o.b;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

/* JADX INFO: renamed from: l.ۗ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3641 {
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11794(C14573 c14573, C16319 c16319) throws C2970 {
        long jM35157;
        c14573.m35156();
        int iM11792 = m11792(c14573, 3, 8, 8);
        c16319.f52972 = iM11792;
        if (iM11792 == -1) {
            return false;
        }
        C20782.m47565(Math.max(Math.max(2, 8), 32) <= 63);
        C20682.m47305(C20682.m47305(3L, 255L), Blake2xsDigest.MAX_NUMBER_BLOCKS);
        if (c14573.m35152() < 2) {
            jM35157 = -1;
        } else {
            jM35157 = c14573.m35157(2);
            if (jM35157 == 3) {
                if (c14573.m35152() < 8) {
                    jM35157 = -1;
                } else {
                    long jM35158 = c14573.m35157(8);
                    jM35157 += jM35158;
                    if (jM35158 == 255) {
                        if (c14573.m35152() < 32) {
                            jM35157 = -1;
                        } else {
                            jM35157 += c14573.m35157(32);
                        }
                    }
                }
            }
        }
        c16319.f52971 = jM35157;
        if (jM35157 == -1) {
            return false;
        }
        if (jM35157 > 16) {
            throw C2970.m9689("Contains sub-stream with an invalid packet label " + c16319.f52971);
        }
        if (jM35157 == 0) {
            int i = c16319.f52972;
            if (i == 1) {
                throw C2970.m9688("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 2) {
                throw C2970.m9688("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 17) {
                throw C2970.m9688("AudioTruncation packet with invalid packet label 0", (Throwable) null);
            }
        }
        int iM11793 = m11792(c14573, 11, 24, 24);
        c16319.f52973 = iM11793;
        return iM11793 != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23779 m11793(C14573 c14573) throws C2970 {
        int iM35163;
        int i;
        char c;
        int iM35164;
        int i2 = 8;
        int iM35165 = c14573.m35163(8);
        int iM35166 = c14573.m35163(5);
        if (iM35166 != 31) {
            switch (iM35166) {
                case 0:
                    iM35163 = 96000;
                    break;
                case 1:
                    iM35163 = 88200;
                    break;
                case 2:
                    iM35163 = 64000;
                    break;
                case 3:
                    iM35163 = 48000;
                    break;
                case 4:
                    iM35163 = 44100;
                    break;
                case 5:
                    iM35163 = 32000;
                    break;
                case 6:
                    iM35163 = 24000;
                    break;
                case 7:
                    iM35163 = 22050;
                    break;
                case 8:
                    iM35163 = 16000;
                    break;
                case 9:
                    iM35163 = 12000;
                    break;
                case 10:
                    iM35163 = 11025;
                    break;
                case 11:
                    iM35163 = 8000;
                    break;
                case 12:
                    iM35163 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw C2970.m9689("Unsupported sampling rate index " + iM35166);
                case 15:
                    iM35163 = 57600;
                    break;
                case 16:
                    iM35163 = PKCS12KeyStoreSpi.MIN_ITERATIONS;
                    break;
                case 17:
                    iM35163 = 40000;
                    break;
                case 18:
                    iM35163 = 38400;
                    break;
                case 19:
                    iM35163 = 34150;
                    break;
                case 20:
                    iM35163 = 28800;
                    break;
                case 21:
                    iM35163 = 25600;
                    break;
                case 22:
                    iM35163 = b.j0;
                    break;
                case 23:
                    iM35163 = 19200;
                    break;
                case 24:
                    iM35163 = 17075;
                    break;
                case 25:
                    iM35163 = 14400;
                    break;
                case 26:
                    iM35163 = 12800;
                    break;
                case 27:
                    iM35163 = 9600;
                    break;
            }
        } else {
            iM35163 = c14573.m35163(24);
        }
        int iM35167 = c14573.m35163(3);
        int i3 = 1;
        if (iM35167 == 0) {
            i = 768;
        } else if (iM35167 == 1) {
            i = 1024;
        } else if (iM35167 == 2 || iM35167 == 3) {
            i = 2048;
        } else {
            if (iM35167 != 4) {
                throw C2970.m9689("Unsupported coreSbrFrameLengthIndex " + iM35167);
            }
            i = 4096;
        }
        if (iM35167 == 0 || iM35167 == 1) {
            c = 0;
        } else if (iM35167 == 2) {
            c = 2;
        } else if (iM35167 == 3) {
            c = 3;
        } else {
            if (iM35167 != 4) {
                throw C2970.m9689("Unsupported coreSbrFrameLengthIndex " + iM35167);
            }
            c = 1;
        }
        c14573.m35161(2);
        m11795(c14573);
        int iM35168 = c14573.m35163(5);
        int i4 = 0;
        int iM11792 = 0;
        while (true) {
            int i5 = 16;
            if (i4 < iM35168 + 1) {
                int iM35169 = c14573.m35163(3);
                iM11792 += m11792(c14573, 5, 8, 16) + 1;
                if ((iM35169 == 0 || iM35169 == 2) && c14573.m35162()) {
                    m11795(c14573);
                }
                i4++;
            } else {
                int iM11793 = m11792(c14573, 4, 8, 16) + 1;
                c14573.m35159();
                int i6 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i6 >= iM11793) {
                        byte[] bArr = null;
                        if (c14573.m35162()) {
                            int iM11794 = m11792(c14573, 2, 4, 8) + 1;
                            for (int i7 = 0; i7 < iM11794; i7++) {
                                int iM11795 = m11792(c14573, 4, 8, 16);
                                int iM11796 = m11792(c14573, 4, 8, 16);
                                if (iM11795 == 7) {
                                    int iM351610 = c14573.m35163(4) + 1;
                                    c14573.m35161(4);
                                    byte[] bArr2 = new byte[iM351610];
                                    for (int i8 = 0; i8 < iM351610; i8++) {
                                        bArr2[i8] = (byte) c14573.m35163(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c14573.m35161(iM11796 * 8);
                                }
                            }
                        }
                        switch (iM35163) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw C2970.m9689("Unsupported sampling rate " + iM35163);
                        }
                        return new C23779(iM35165, bArr, (int) (((double) iM35163) * d), (int) (((double) i) * d));
                    }
                    int iM351611 = c14573.m35163(2);
                    if (iM351611 == 0) {
                        c14573.m35161(3);
                        if (c14573.m35162()) {
                            c14573.m35161(13);
                        }
                        if (c > 0) {
                            m11796(c14573);
                        }
                    } else if (iM351611 == i3) {
                        c14573.m35161(3);
                        boolean zM35162 = c14573.m35162();
                        if (zM35162) {
                            c14573.m35161(13);
                        }
                        if (zM35162) {
                            c14573.m35159();
                        }
                        if (c > 0) {
                            m11796(c14573);
                            iM35164 = c14573.m35163(2);
                        } else {
                            iM35164 = 0;
                        }
                        if (iM35164 > 0) {
                            c14573.m35161(6);
                            int iM351612 = c14573.m35163(2);
                            c14573.m35161(4);
                            if (c14573.m35162()) {
                                c14573.m35161(5);
                            }
                            if (iM35164 == 2 || iM35164 == 3) {
                                c14573.m35161(6);
                            }
                            if (iM351612 == 2) {
                                c14573.m35159();
                            }
                        }
                        int iFloor = ((int) Math.floor(Math.log(iM11792 - 1) / Math.log(2.0d))) + 1;
                        int iM351613 = c14573.m35163(2);
                        if (iM351613 > 0 && c14573.m35162()) {
                            c14573.m35161(iFloor);
                        }
                        if (c14573.m35162()) {
                            c14573.m35161(iFloor);
                        }
                        if (c == 0 && iM351613 == 0) {
                            c14573.m35159();
                        }
                    } else if (iM351611 == 3) {
                        m11792(c14573, 4, i2, i5);
                        int iM11797 = m11792(c14573, 4, i2, i5);
                        if (c14573.m35162()) {
                            m11792(c14573, i2, i5, 0);
                        }
                        c14573.m35159();
                        if (iM11797 > 0) {
                            c14573.m35161(iM11797 * 8);
                        }
                    }
                    i6++;
                    i3 = 1;
                    i5 = 16;
                    i2 = 8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m11795(C14573 c14573) {
        int iM35163;
        int iM35164 = c14573.m35163(2);
        if (iM35164 == 0) {
            c14573.m35161(6);
            return;
        }
        int iM11792 = m11792(c14573, 5, 8, 16) + 1;
        if (iM35164 == 1) {
            c14573.m35161(iM11792 * 7);
            return;
        }
        if (iM35164 == 2) {
            boolean zM35162 = c14573.m35162();
            int i = zM35162 ? 1 : 5;
            int i2 = zM35162 ? 7 : 5;
            int i3 = zM35162 ? 8 : 6;
            int i4 = 0;
            while (i4 < iM11792) {
                if (c14573.m35162()) {
                    c14573.m35161(7);
                    iM35163 = 0;
                } else {
                    if (c14573.m35163(2) == 3 && c14573.m35163(i2) * i != 0) {
                        c14573.m35159();
                    }
                    iM35163 = c14573.m35163(i3) * i;
                    if (iM35163 != 0 && iM35163 != 180) {
                        c14573.m35159();
                    }
                    c14573.m35159();
                }
                if (iM35163 != 0 && iM35163 != 180 && c14573.m35162()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11796(C14573 c14573) {
        c14573.m35161(3);
        c14573.m35161(8);
        boolean zM35162 = c14573.m35162();
        boolean zM35163 = c14573.m35162();
        if (zM35162) {
            c14573.m35161(5);
        }
        if (zM35163) {
            c14573.m35161(6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11792(C14573 c14573, int i, int i2, int i3) {
        C20782.m47565(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        long j = ((long) i4) + ((long) i5);
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        long j3 = j2 + ((long) (1 << i3));
        if (j3 != ((int) j3)) {
            throw new ArithmeticException();
        }
        if (c14573.m35152() < i) {
            return -1;
        }
        int iM35163 = c14573.m35163(i);
        if (iM35163 == i4) {
            if (c14573.m35152() < i2) {
                return -1;
            }
            int iM35164 = c14573.m35163(i2);
            iM35163 += iM35164;
            if (iM35164 == i5) {
                if (c14573.m35152() < i3) {
                    return -1;
                }
                return c14573.m35163(i3) + iM35163;
            }
        }
        return iM35163;
    }
}
