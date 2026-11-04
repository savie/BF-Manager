package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.۟᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8248 extends AbstractC13468 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C8008 f27128 = new C8008();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18689 f27129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22194(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C8248(InterfaceC18689 interfaceC18689) {
        this.f27129 = interfaceC18689;
    }

    @Override // l.AbstractC13468
    /* JADX INFO: renamed from: ۙ */
    public final C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer) {
        return m22215(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m22215(int i, byte[] bArr) {
        boolean z;
        C0790 c0790;
        int i2;
        int iM22205;
        AbstractC19435 abstractC19435M22201;
        ArrayList arrayList = new ArrayList();
        C21287 c21287 = new C21287(bArr, i);
        boolean z2 = false;
        if (c21287.m48486() < 10) {
            C1896.m6517("Data too short to be an ID3 tag");
        } else {
            int iM48501 = c21287.m48501();
            if (iM48501 == 4801587) {
                int iM48493 = c21287.m48493();
                c21287.m48503(1);
                int iM48494 = c21287.m48493();
                int iM48499 = c21287.m48499();
                if (iM48493 != 2) {
                    if (iM48493 == 3) {
                        if ((iM48494 & 64) != 0) {
                            int iM48500 = c21287.m48500();
                            c21287.m48503(iM48500);
                            iM48499 -= iM48500 + 4;
                        }
                    } else if (iM48493 == 4) {
                        if ((iM48494 & 64) != 0) {
                            int iM484910 = c21287.m48499();
                            c21287.m48503(iM484910 - 4);
                            iM48499 -= iM484910;
                        }
                        if ((iM48494 & 16) != 0) {
                            iM48499 -= 10;
                        }
                    } else {
                        j$$ExternalSyntheticOutline0.m(iM48493, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iM48493 < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c0790 = new C0790(iM48493, iM48499, z);
                } else if ((iM48494 & 64) != 0) {
                    C1896.m6517("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM48493 < 4 || (iM48494 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c0790 = new C0790(iM48493, iM48499, z);
                }
                if (c0790 == null) {
                    return null;
                }
                int iM48516 = c21287.m48516();
                i2 = c0790.f2829 == 2 ? 6 : 10;
                iM22205 = c0790.f2828;
                if (c0790.f2830) {
                    iM22205 = m22205(c0790.f2828, c21287);
                }
                c21287.m48517(iM48516 + iM22205);
                if (!m22203(c21287, c0790.f2829, i2, false)) {
                    if (c0790.f2829 == 4 || !m22203(c21287, 4, i2, true)) {
                        C1896.m6517("Failed to validate ID3 tag with majorVersion=" + c0790.f2829);
                        return null;
                    }
                    z2 = true;
                }
                while (c21287.m48486() >= i2) {
                    abstractC19435M22201 = m22201(c0790.f2829, c21287, z2, i2, this.f27129);
                    if (abstractC19435M22201 != null) {
                        arrayList.add(abstractC19435M22201);
                    }
                }
                return new C19378(arrayList);
            }
            C1896.m6517("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM48501))));
        }
        c0790 = null;
        if (c0790 == null) {
            return null;
        }
        int iM48517 = c21287.m48516();
        if (c0790.f2829 == 2) {
        }
        iM22205 = c0790.f2828;
        if (c0790.f2830) {
            iM22205 = m22205(c0790.f2828, c21287);
        }
        c21287.m48517(iM48517 + iM22205);
        if (!m22203(c21287, c0790.f2829, i2, false)) {
            if (c0790.f2829 == 4) {
            }
            C1896.m6517("Failed to validate ID3 tag with majorVersion=" + c0790.f2829);
            return null;
        }
        while (c21287.m48486() >= i2) {
            abstractC19435M22201 = m22201(c0790.f2829, c21287, z2, i2, this.f27129);
            if (abstractC19435M22201 != null) {
                arrayList.add(abstractC19435M22201);
            }
        }
        return new C19378(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22203(C21287 c21287, int i, int i2, boolean z) {
        int iM48501;
        long jM48501;
        int iM48494;
        int i3;
        int iM48516 = c21287.m48516();
        while (true) {
            try {
                boolean z2 = true;
                if (c21287.m48486() < i2) {
                    c21287.m48510(iM48516);
                    return true;
                }
                if (i >= 3) {
                    iM48501 = c21287.m48500();
                    jM48501 = c21287.m48485();
                    iM48494 = c21287.m48494();
                } else {
                    iM48501 = c21287.m48501();
                    jM48501 = c21287.m48501();
                    iM48494 = 0;
                }
                if (iM48501 == 0 && jM48501 == 0 && iM48494 == 0) {
                    c21287.m48510(iM48516);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM48501) != 0) {
                        c21287.m48510(iM48516);
                        return false;
                    }
                    jM48501 = (((jM48501 >> 24) & 255) << 21) | (jM48501 & 255) | (((jM48501 >> 8) & 255) << 7) | (((jM48501 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM48494 & 64) != 0 ? 1 : 0;
                    if ((iM48494 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM48494 & 32) != 0 ? 1 : 0;
                        if ((iM48494 & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM48501 < i3) {
                    c21287.m48510(iM48516);
                    return false;
                }
                if (c21287.m48486() >= jM48501) {
                    c21287.m48503((int) jM48501);
                } else {
                    c21287.m48510(iM48516);
                    return false;
                }
            } catch (Throwable th) {
                c21287.m48510(iM48516);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb A[Catch: all -> 0x0127, Exception -> 0x012a, OutOfMemoryError -> 0x012d, TRY_LEAVE, TryCatch #2 {Exception -> 0x012a, OutOfMemoryError -> 0x012d, all -> 0x0127, blocks: (B:91:0x0115, B:93:0x011d, B:106:0x013c, B:108:0x0144, B:116:0x015e, B:125:0x0176, B:136:0x0191, B:143:0x01a3, B:149:0x01b2, B:155:0x01cc, B:161:0x01e6, B:162:0x01eb), top: B:173:0x010b }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19435 m22201(int i, C21287 c21287, boolean z, int i2, InterfaceC18689 interfaceC18689) {
        int iM48501;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC19435 c6757;
        int iM48493 = c21287.m48493();
        int iM48494 = c21287.m48493();
        int iM48495 = c21287.m48493();
        int iM48496 = i >= 3 ? c21287.m48493() : 0;
        if (i == 4) {
            iM48501 = c21287.m48512();
            if (!z) {
                iM48501 = (((iM48501 >> 24) & 255) << 21) | (iM48501 & 255) | (((iM48501 >> 8) & 255) << 7) | (((iM48501 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            iM48501 = c21287.m48512();
        } else {
            iM48501 = c21287.m48501();
        }
        int iM22205 = iM48501;
        int iM48497 = i >= 3 ? c21287.m48494() : 0;
        AbstractC19435 abstractC19435 = null;
        if (iM48493 == 0 && iM48494 == 0 && iM48495 == 0 && iM48496 == 0 && iM22205 == 0 && iM48497 == 0) {
            c21287.m48510(c21287.m48509());
            return null;
        }
        int iM48516 = c21287.m48516() + iM22205;
        if (iM48516 > c21287.m48509()) {
            C1896.m6517("Frame size exceeds remaining tag data");
            c21287.m48510(c21287.m48509());
            return null;
        }
        if (interfaceC18689 != null) {
            i3 = iM48516;
            if (!interfaceC18689.mo5131(i, iM48493, iM48494, iM48495, iM48496)) {
                c21287.m48510(i3);
                return null;
            }
        } else {
            i3 = iM48516;
        }
        if (i == 3) {
            z2 = (iM48497 & 128) != 0;
            boolean z7 = (iM48497 & 64) != 0;
            z4 = (iM48497 & 32) != 0;
            z6 = z7;
            z3 = false;
            z5 = z2;
        } else if (i == 4) {
            boolean z8 = (iM48497 & 64) != 0;
            boolean z9 = (iM48497 & 8) != 0;
            z6 = (iM48497 & 4) != 0;
            z3 = (iM48497 & 2) != 0;
            boolean z10 = z9;
            z5 = (iM48497 & 1) != 0;
            z4 = z8;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            C1896.m6517("Skipping unsupported compressed or encrypted frame");
            c21287.m48510(i3);
            return null;
        }
        if (z4) {
            iM22205--;
            c21287.m48503(1);
        }
        if (z5) {
            iM22205 -= 4;
            c21287.m48503(4);
        }
        if (z3) {
            iM22205 = m22205(iM22205, c21287);
        }
        try {
            if (iM48493 == 84 && iM48494 == 88 && iM48495 == 88 && (i == 2 || iM48496 == 88)) {
                c6757 = m22207(iM22205, c21287);
            } else if (iM48493 == 84) {
                c6757 = m22198(iM22205, c21287, m22195(i, iM48493, iM48494, iM48495, iM48496));
            } else if (iM48493 == 87 && iM48494 == 88 && iM48495 == 88 && (i == 2 || iM48496 == 88)) {
                c6757 = m22206(iM22205, c21287);
            } else if (iM48493 == 87) {
                c6757 = m22212(iM22205, c21287, m22195(i, iM48493, iM48494, iM48495, iM48496));
            } else if (iM48493 == 80 && iM48494 == 82 && iM48495 == 73 && iM48496 == 86) {
                c6757 = m22214(iM22205, c21287);
            } else if (iM48493 == 71 && iM48494 == 69 && iM48495 == 79 && (iM48496 == 66 || i == 2)) {
                c6757 = m22213(iM22205, c21287);
            } else if (i == 2) {
                if (iM48493 == 80 && iM48494 == 73 && iM48495 == 67) {
                    c6757 = m22199(c21287, iM22205, i);
                } else if (iM48493 != 67 && iM48494 == 79 && iM48495 == 77 && (iM48496 == 77 || i == 2)) {
                    c6757 = m22200(iM22205, c21287);
                } else if (iM48493 != 67 && iM48494 == 72 && iM48495 == 65 && iM48496 == 80) {
                    c6757 = m22202(c21287, iM22205, i, z, i2, interfaceC18689);
                } else if (iM48493 != 67 && iM48494 == 84 && iM48495 == 79 && iM48496 == 67) {
                    c6757 = m22211(c21287, iM22205, i, z, i2, interfaceC18689);
                } else if (iM48493 != 77 && iM48494 == 76 && iM48495 == 76 && iM48496 == 84) {
                    c6757 = m22204(iM22205, c21287);
                } else {
                    String strM22195 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr);
                    c6757 = new C6757(strM22195, bArr);
                }
            } else if (iM48493 == 65 && iM48494 == 80 && iM48495 == 73 && iM48496 == 67) {
                c6757 = m22199(c21287, iM22205, i);
            } else if (iM48493 != 67) {
                if (iM48493 != 67) {
                    if (iM48493 != 67) {
                        if (iM48493 != 77) {
                            String strM22196 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                            byte[] bArr2 = new byte[iM22205];
                            c21287.m48490(0, iM22205, bArr2);
                            c6757 = new C6757(strM22196, bArr2);
                        } else {
                            String strM22197 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                            byte[] bArr3 = new byte[iM22205];
                            c21287.m48490(0, iM22205, bArr3);
                            c6757 = new C6757(strM22197, bArr3);
                        }
                    } else if (iM48493 != 77) {
                        String strM22198 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr4 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr4);
                        c6757 = new C6757(strM22198, bArr4);
                    } else {
                        String strM22199 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr5 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr5);
                        c6757 = new C6757(strM22199, bArr5);
                    }
                } else if (iM48493 != 67) {
                    if (iM48493 != 77) {
                        String strM221910 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr6 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr6);
                        c6757 = new C6757(strM221910, bArr6);
                    } else {
                        String strM221911 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr7 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr7);
                        c6757 = new C6757(strM221911, bArr7);
                    }
                } else if (iM48493 != 77) {
                    String strM221912 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr8 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr8);
                    c6757 = new C6757(strM221912, bArr8);
                } else {
                    String strM221913 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr9 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr9);
                    c6757 = new C6757(strM221913, bArr9);
                }
            } else if (iM48493 != 67) {
                if (iM48493 != 67) {
                    if (iM48493 != 77) {
                        String strM221914 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr10 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr10);
                        c6757 = new C6757(strM221914, bArr10);
                    } else {
                        String strM221915 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                        byte[] bArr11 = new byte[iM22205];
                        c21287.m48490(0, iM22205, bArr11);
                        c6757 = new C6757(strM221915, bArr11);
                    }
                } else if (iM48493 != 77) {
                    String strM221916 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr12 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr12);
                    c6757 = new C6757(strM221916, bArr12);
                } else {
                    String strM221917 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr13 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr13);
                    c6757 = new C6757(strM221917, bArr13);
                }
            } else if (iM48493 != 67) {
                if (iM48493 != 77) {
                    String strM221918 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr14 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr14);
                    c6757 = new C6757(strM221918, bArr14);
                } else {
                    String strM221919 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                    byte[] bArr15 = new byte[iM22205];
                    c21287.m48490(0, iM22205, bArr15);
                    c6757 = new C6757(strM221919, bArr15);
                }
            } else if (iM48493 != 77) {
                String strM2219110 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                byte[] bArr16 = new byte[iM22205];
                c21287.m48490(0, iM22205, bArr16);
                c6757 = new C6757(strM2219110, bArr16);
            } else {
                String strM2219111 = m22195(i, iM48493, iM48494, iM48495, iM48496);
                byte[] bArr17 = new byte[iM22205];
                c21287.m48490(0, iM22205, bArr17);
                c6757 = new C6757(strM2219111, bArr17);
            }
            c21287.m48510(i3);
            abstractC19435 = c6757;
            e = null;
        } catch (Exception e) {
            e = e;
        } catch (OutOfMemoryError e2) {
            e = e2;
        } finally {
            c21287.m48510(i3);
        }
        if (abstractC19435 == null) {
            C1896.m6514("Failed to decode frame: id=" + m22195(i, iM48493, iM48494, iM48495, iM48496) + ", frameSize=" + iM22205, e);
        }
        return abstractC19435;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C8993 m22207(int i, C21287 c21287) {
        if (i < 1) {
            return null;
        }
        int iM48493 = c21287.m48493();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c21287.m48490(0, i2, bArr);
        int iM22208 = m22208(0, iM48493, bArr);
        return new C8993("TXXX", new String(bArr, 0, iM22208, m22210(iM48493)), m22197(iM48493, iM22208 + m22194(iM48493), bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8993 m22198(int i, C21287 c21287, String str) {
        if (i < 1) {
            return null;
        }
        int iM48493 = c21287.m48493();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c21287.m48490(0, i2, bArr);
        return new C8993(str, null, m22197(iM48493, 0, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m22197(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC1928.of((Object) "");
        }
        int i3 = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        int iM22208 = m22208(i2, i, bArr);
        while (i2 < iM22208) {
            c22811.m19807(new String(bArr, i2, iM22208 - i2, m22210(i)));
            i2 = m22194(i) + iM22208;
            iM22208 = m22208(i2, i, bArr);
        }
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        return abstractC1928M51441.isEmpty() ? AbstractC1928.of((Object) "") : abstractC1928M51441;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C7502 m22206(int i, C21287 c21287) {
        if (i < 1) {
            return null;
        }
        int iM48493 = c21287.m48493();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c21287.m48490(0, i2, bArr);
        int iM22208 = m22208(0, iM48493, bArr);
        String str = new String(bArr, 0, iM22208, m22210(iM48493));
        int iM22194 = iM22208 + m22194(iM48493);
        return new C7502("WXXX", str, m22196(bArr, iM22194, m22209(iM22194, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7502 m22212(int i, C21287 c21287, String str) {
        byte[] bArr = new byte[i];
        c21287.m48490(0, i, bArr);
        return new C7502(str, null, new String(bArr, 0, m22209(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C3027 m22214(int i, C21287 c21287) {
        byte[] bArrCopyOfRange;
        byte[] bArr = new byte[i];
        c21287.m48490(0, i, bArr);
        int iM22209 = m22209(0, bArr);
        String str = new String(bArr, 0, iM22209, StandardCharsets.ISO_8859_1);
        int i2 = iM22209 + 1;
        if (i <= i2) {
            bArrCopyOfRange = C7116.f23453;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C3027(str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21673 m22213(int i, C21287 c21287) {
        byte[] bArrCopyOfRange;
        int iM48493 = c21287.m48493();
        Charset charsetM22210 = m22210(iM48493);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c21287.m48490(0, i2, bArr);
        int iM22209 = m22209(0, bArr);
        String strM25264 = C9681.m25264(new String(bArr, 0, iM22209, StandardCharsets.ISO_8859_1));
        int i3 = iM22209 + 1;
        int iM22208 = m22208(i3, iM48493, bArr);
        String strM22196 = m22196(bArr, i3, iM22208, charsetM22210);
        int iM22194 = iM22208 + m22194(iM48493);
        int iM222010 = m22208(iM22194, iM48493, bArr);
        String strM22197 = m22196(bArr, iM22194, iM222010, charsetM22210);
        int iM22195 = iM222010 + m22194(iM48493);
        if (i2 <= iM22195) {
            bArrCopyOfRange = C7116.f23453;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM22195, i2);
        }
        return new C21673(bArrCopyOfRange, strM25264, strM22196, strM22197);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12722 m22199(C21287 c21287, int i, int i2) {
        int iM22209;
        String strConcat;
        byte[] bArrCopyOfRange;
        int iM48493 = c21287.m48493();
        Charset charsetM22210 = m22210(iM48493);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c21287.m48490(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + C7914.m21453(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM22209 = 2;
        } else {
            iM22209 = m22209(0, bArr);
            String strM21453 = C7914.m21453(new String(bArr, 0, iM22209, StandardCharsets.ISO_8859_1));
            strConcat = strM21453.indexOf(47) == -1 ? "image/".concat(strM21453) : strM21453;
        }
        int i4 = bArr[iM22209 + 1] & 255;
        int i5 = iM22209 + 2;
        int iM22208 = m22208(i5, iM48493, bArr);
        String str = new String(bArr, i5, iM22208 - i5, charsetM22210);
        int iM22194 = iM22208 + m22194(iM48493);
        if (i3 <= iM22194) {
            bArrCopyOfRange = C7116.f23453;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM22194, i3);
        }
        return new C12722(i4, strConcat, str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14959 m22200(int i, C21287 c21287) {
        if (i < 4) {
            return null;
        }
        int iM48493 = c21287.m48493();
        Charset charsetM22210 = m22210(iM48493);
        byte[] bArr = new byte[3];
        c21287.m48490(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c21287.m48490(0, i2, bArr2);
        int iM22208 = m22208(0, iM48493, bArr2);
        String str2 = new String(bArr2, 0, iM22208, charsetM22210);
        int iM22194 = iM22208 + m22194(iM48493);
        return new C14959(str, str2, m22196(bArr2, iM22194, m22208(iM22194, iM48493, bArr2), charsetM22210));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24657 m22202(C21287 c21287, int i, int i2, boolean z, int i3, InterfaceC18689 interfaceC18689) {
        int iM48516 = c21287.m48516();
        int iM22209 = m22209(iM48516, c21287.m48497());
        String str = new String(c21287.m48497(), iM48516, iM22209 - iM48516, StandardCharsets.ISO_8859_1);
        c21287.m48510(iM22209 + 1);
        int iM48500 = c21287.m48500();
        int iM48501 = c21287.m48500();
        long jM48485 = c21287.m48485();
        long j = jM48485 == 4294967295L ? -1L : jM48485;
        long jM48486 = c21287.m48485();
        long j2 = jM48486 == 4294967295L ? -1L : jM48486;
        ArrayList arrayList = new ArrayList();
        int i4 = iM48516 + i;
        while (c21287.m48516() < i4) {
            AbstractC19435 abstractC19435M22201 = m22201(i2, c21287, z, i3, interfaceC18689);
            if (abstractC19435M22201 != null) {
                arrayList.add(abstractC19435M22201);
            }
        }
        return new C24657(str, iM48500, iM48501, j, j2, (AbstractC19435[]) arrayList.toArray(new AbstractC19435[0]));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4519 m22211(C21287 c21287, int i, int i2, boolean z, int i3, InterfaceC18689 interfaceC18689) {
        int iM48516 = c21287.m48516();
        int iM22209 = m22209(iM48516, c21287.m48497());
        String str = new String(c21287.m48497(), iM48516, iM22209 - iM48516, StandardCharsets.ISO_8859_1);
        c21287.m48510(iM22209 + 1);
        int iM48493 = c21287.m48493();
        boolean z2 = (iM48493 & 2) != 0;
        boolean z3 = (iM48493 & 1) != 0;
        int iM48494 = c21287.m48493();
        String[] strArr = new String[iM48494];
        for (int i4 = 0; i4 < iM48494; i4++) {
            int iM48517 = c21287.m48516();
            int iM222010 = m22209(iM48517, c21287.m48497());
            strArr[i4] = new String(c21287.m48497(), iM48517, iM222010 - iM48517, StandardCharsets.ISO_8859_1);
            c21287.m48510(iM222010 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM48516 + i;
        while (c21287.m48516() < i5) {
            AbstractC19435 abstractC19435M22201 = m22201(i2, c21287, z, i3, interfaceC18689);
            if (abstractC19435M22201 != null) {
                arrayList.add(abstractC19435M22201);
            }
        }
        return new C4519(str, z2, z3, strArr, (AbstractC19435[]) arrayList.toArray(new AbstractC19435[0]));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9738 m22204(int i, C21287 c21287) {
        int iM48494 = c21287.m48494();
        int iM48501 = c21287.m48501();
        int iM48502 = c21287.m48501();
        int iM48493 = c21287.m48493();
        int iM48495 = c21287.m48493();
        C14573 c14573 = new C14573();
        c14573.m35155(c21287);
        int i2 = ((i - 10) * 8) / (iM48493 + iM48495);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM35163 = c14573.m35163(iM48493);
            int iM35164 = c14573.m35163(iM48495);
            iArr[i3] = iM35163;
            iArr2[i3] = iM35164;
        }
        return new C9738(iM48494, iM48501, iArr, iArr2, iM48502);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m22205(int i, C21287 c21287) {
        byte[] bArrM48497 = c21287.m48497();
        int iM48516 = c21287.m48516();
        int i2 = iM48516;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM48516 + i) {
                return i;
            }
            if ((bArrM48497[i2] & 255) == 255 && bArrM48497[i3] == 0) {
                System.arraycopy(bArrM48497, i2 + 2, bArrM48497, i3, (i - (i2 - iM48516)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Charset m22210(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i == 3) {
            return StandardCharsets.UTF_8;
        }
        return StandardCharsets.ISO_8859_1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22195(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22208(int i, int i2, byte[] bArr) {
        int iM22209 = m22209(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM22209;
        }
        while (iM22209 < bArr.length - 1) {
            if ((iM22209 - i) % 2 == 0 && bArr[iM22209 + 1] == 0) {
                return iM22209;
            }
            iM22209 = m22209(iM22209 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22209(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22196(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
