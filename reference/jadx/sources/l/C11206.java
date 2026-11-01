package l;

import com.alipay.sdk.m.o.b;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

/* JADX INFO: renamed from: l.ۧ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11206 {
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28148(C11634 c11634, C17555 c17555) throws C22861 {
        long jM29037;
        c11634.m29036();
        int iM28146 = m28146(c11634, 3, 8, 8);
        c17555.f55788 = iM28146;
        if (iM28146 == -1) {
            return false;
        }
        C2023.m6507(Math.max(Math.max(2, 8), 32) <= 63);
        C7161.m19080(C7161.m19080(3L, 255L), Blake2xsDigest.MAX_NUMBER_BLOCKS);
        if (c11634.m29030() < 2) {
            jM29037 = -1;
        } else {
            jM29037 = c11634.m29037(2);
            if (jM29037 == 3) {
                if (c11634.m29030() < 8) {
                    jM29037 = -1;
                } else {
                    long jM29038 = c11634.m29037(8);
                    jM29037 += jM29038;
                    if (jM29038 == 255) {
                        if (c11634.m29030() < 32) {
                            jM29037 = -1;
                        } else {
                            jM29037 += c11634.m29037(32);
                        }
                    }
                }
            }
        }
        c17555.f55787 = jM29037;
        if (jM29037 == -1) {
            return false;
        }
        if (jM29037 > 16) {
            throw C22861.m50611("Contains sub-stream with an invalid packet label " + c17555.f55787);
        }
        if (jM29037 == 0) {
            int i = c17555.f55788;
            if (i == 1) {
                throw C22861.m50610("Mpegh3daConfig packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 2) {
                throw C22861.m50610("Mpegh3daFrame packet with invalid packet label 0", (Throwable) null);
            }
            if (i == 17) {
                throw C22861.m50610("AudioTruncation packet with invalid packet label 0", (Throwable) null);
            }
        }
        int iM28147 = m28146(c11634, 11, 24, 24);
        c17555.f55789 = iM28147;
        return iM28147 != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6266 m28147(C11634 c11634) throws C22861 {
        int iM29039;
        int i;
        char c;
        int iM290310;
        int i2 = 8;
        int iM290311 = c11634.m29039(8);
        int iM290312 = c11634.m29039(5);
        if (iM290312 != 31) {
            switch (iM290312) {
                case 0:
                    iM29039 = 96000;
                    break;
                case 1:
                    iM29039 = 88200;
                    break;
                case 2:
                    iM29039 = 64000;
                    break;
                case 3:
                    iM29039 = 48000;
                    break;
                case 4:
                    iM29039 = 44100;
                    break;
                case 5:
                    iM29039 = 32000;
                    break;
                case 6:
                    iM29039 = 24000;
                    break;
                case 7:
                    iM29039 = 22050;
                    break;
                case 8:
                    iM29039 = 16000;
                    break;
                case 9:
                    iM29039 = 12000;
                    break;
                case 10:
                    iM29039 = 11025;
                    break;
                case 11:
                    iM29039 = 8000;
                    break;
                case 12:
                    iM29039 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw C22861.m50611("Unsupported sampling rate index " + iM290312);
                case 15:
                    iM29039 = 57600;
                    break;
                case 16:
                    iM29039 = PKCS12KeyStoreSpi.MIN_ITERATIONS;
                    break;
                case 17:
                    iM29039 = 40000;
                    break;
                case 18:
                    iM29039 = 38400;
                    break;
                case 19:
                    iM29039 = 34150;
                    break;
                case 20:
                    iM29039 = 28800;
                    break;
                case 21:
                    iM29039 = 25600;
                    break;
                case 22:
                    iM29039 = b.j0;
                    break;
                case 23:
                    iM29039 = 19200;
                    break;
                case 24:
                    iM29039 = 17075;
                    break;
                case 25:
                    iM29039 = 14400;
                    break;
                case 26:
                    iM29039 = 12800;
                    break;
                case 27:
                    iM29039 = 9600;
                    break;
            }
        } else {
            iM29039 = c11634.m29039(24);
        }
        int iM290313 = c11634.m29039(3);
        int i3 = 1;
        if (iM290313 == 0) {
            i = 768;
        } else if (iM290313 == 1) {
            i = 1024;
        } else if (iM290313 == 2 || iM290313 == 3) {
            i = 2048;
        } else {
            if (iM290313 != 4) {
                throw C22861.m50611("Unsupported coreSbrFrameLengthIndex " + iM290313);
            }
            i = 4096;
        }
        if (iM290313 == 0 || iM290313 == 1) {
            c = 0;
        } else if (iM290313 == 2) {
            c = 2;
        } else if (iM290313 == 3) {
            c = 3;
        } else {
            if (iM290313 != 4) {
                throw C22861.m50611("Unsupported coreSbrFrameLengthIndex " + iM290313);
            }
            c = 1;
        }
        c11634.m29034(2);
        m28149(c11634);
        int iM290314 = c11634.m29039(5);
        int i4 = 0;
        int iM28146 = 0;
        while (true) {
            int i5 = 16;
            if (i4 < iM290314 + 1) {
                int iM290315 = c11634.m29039(3);
                iM28146 += m28146(c11634, 5, 8, 16) + 1;
                if ((iM290315 == 0 || iM290315 == 2) && c11634.m29035()) {
                    m28149(c11634);
                }
                i4++;
            } else {
                int iM28147 = m28146(c11634, 4, 8, 16) + 1;
                c11634.m29042();
                int i6 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i6 >= iM28147) {
                        byte[] bArr = null;
                        if (c11634.m29035()) {
                            int iM28148 = m28146(c11634, 2, 4, 8) + 1;
                            for (int i7 = 0; i7 < iM28148; i7++) {
                                int iM28149 = m28146(c11634, 4, 8, 16);
                                int iM281410 = m28146(c11634, 4, 8, 16);
                                if (iM28149 == 7) {
                                    int iM290316 = c11634.m29039(4) + 1;
                                    c11634.m29034(4);
                                    byte[] bArr2 = new byte[iM290316];
                                    for (int i8 = 0; i8 < iM290316; i8++) {
                                        bArr2[i8] = (byte) c11634.m29039(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c11634.m29034(iM281410 * 8);
                                }
                            }
                        }
                        switch (iM29039) {
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
                                throw C22861.m50611("Unsupported sampling rate " + iM29039);
                        }
                        return new C6266(iM290311, bArr, (int) (((double) iM29039) * d), (int) (((double) i) * d));
                    }
                    int iM290317 = c11634.m29039(2);
                    if (iM290317 == 0) {
                        c11634.m29034(3);
                        if (c11634.m29035()) {
                            c11634.m29034(13);
                        }
                        if (c > 0) {
                            m28150(c11634);
                        }
                    } else if (iM290317 == i3) {
                        c11634.m29034(3);
                        boolean zM29035 = c11634.m29035();
                        if (zM29035) {
                            c11634.m29034(13);
                        }
                        if (zM29035) {
                            c11634.m29042();
                        }
                        if (c > 0) {
                            m28150(c11634);
                            iM290310 = c11634.m29039(2);
                        } else {
                            iM290310 = 0;
                        }
                        if (iM290310 > 0) {
                            c11634.m29034(6);
                            int iM290318 = c11634.m29039(2);
                            c11634.m29034(4);
                            if (c11634.m29035()) {
                                c11634.m29034(5);
                            }
                            if (iM290310 == 2 || iM290310 == 3) {
                                c11634.m29034(6);
                            }
                            if (iM290318 == 2) {
                                c11634.m29042();
                            }
                        }
                        int iFloor = ((int) Math.floor(Math.log(iM28146 - 1) / Math.log(2.0d))) + 1;
                        int iM290319 = c11634.m29039(2);
                        if (iM290319 > 0 && c11634.m29035()) {
                            c11634.m29034(iFloor);
                        }
                        if (c11634.m29035()) {
                            c11634.m29034(iFloor);
                        }
                        if (c == 0 && iM290319 == 0) {
                            c11634.m29042();
                        }
                    } else if (iM290317 == 3) {
                        m28146(c11634, 4, i2, i5);
                        int iM281411 = m28146(c11634, 4, i2, i5);
                        if (c11634.m29035()) {
                            m28146(c11634, i2, i5, 0);
                        }
                        c11634.m29042();
                        if (iM281411 > 0) {
                            c11634.m29034(iM281411 * 8);
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m28149(C11634 c11634) {
        int iM29039;
        int iM290310 = c11634.m29039(2);
        if (iM290310 == 0) {
            c11634.m29034(6);
            return;
        }
        int iM28146 = m28146(c11634, 5, 8, 16) + 1;
        if (iM290310 == 1) {
            c11634.m29034(iM28146 * 7);
            return;
        }
        if (iM290310 == 2) {
            boolean zM29035 = c11634.m29035();
            int i = zM29035 ? 1 : 5;
            int i2 = zM29035 ? 7 : 5;
            int i3 = zM29035 ? 8 : 6;
            int i4 = 0;
            while (i4 < iM28146) {
                if (c11634.m29035()) {
                    c11634.m29034(7);
                    iM29039 = 0;
                } else {
                    if (c11634.m29039(2) == 3 && c11634.m29039(i2) * i != 0) {
                        c11634.m29042();
                    }
                    iM29039 = c11634.m29039(i3) * i;
                    if (iM29039 != 0 && iM29039 != 180) {
                        c11634.m29042();
                    }
                    c11634.m29042();
                }
                if (iM29039 != 0 && iM29039 != 180 && c11634.m29035()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28150(C11634 c11634) {
        c11634.m29034(3);
        c11634.m29034(8);
        boolean zM29035 = c11634.m29035();
        boolean zM29036 = c11634.m29035();
        if (zM29035) {
            c11634.m29034(5);
        }
        if (zM29036) {
            c11634.m29034(6);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28146(C11634 c11634, int i, int i2, int i3) {
        C2023.m6507(Math.max(Math.max(i, i2), i3) <= 31);
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
        if (c11634.m29030() < i) {
            return -1;
        }
        int iM29039 = c11634.m29039(i);
        if (iM29039 == i4) {
            if (c11634.m29030() < i2) {
                return -1;
            }
            int iM290310 = c11634.m29039(i2);
            iM29039 += iM290310;
            if (iM290310 == i5) {
                if (c11634.m29030() < i3) {
                    return -1;
                }
                return c11634.m29039(i3) + iM29039;
            }
        }
        return iM29039;
    }
}
