package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۚܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5436 extends AbstractC21188 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C23234 f18749 = new C23234(4);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11787 f18750;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15017(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C5436(InterfaceC11787 interfaceC11787) {
        this.f18750 = interfaceC11787;
    }

    @Override // l.AbstractC21188
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer) {
        return m15036(byteBuffer.limit(), byteBuffer.array());
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
    public final C0987 m15036(int i, byte[] bArr) {
        boolean z;
        C2613 c2613;
        int i2;
        int iM15015;
        AbstractC22370 abstractC22370M15023;
        ArrayList arrayList = new ArrayList();
        C2460 c2460 = new C2460(bArr, i);
        boolean z2 = false;
        if (c2460.m7503() < 10) {
            C0303.m1848("Data too short to be an ID3 tag");
        } else {
            int iM7525 = c2460.m7525();
            if (iM7525 == 4801587) {
                int iM7516 = c2460.m7516();
                c2460.m7535(1);
                int iM7517 = c2460.m7516();
                int iM7515 = c2460.m7515();
                if (iM7516 != 2) {
                    if (iM7516 == 3) {
                        if ((iM7517 & 64) != 0) {
                            int iM7499 = c2460.m7499();
                            c2460.m7535(iM7499);
                            iM7515 -= iM7499 + 4;
                        }
                    } else if (iM7516 == 4) {
                        if ((iM7517 & 64) != 0) {
                            int iM7518 = c2460.m7515();
                            c2460.m7535(iM7518 - 4);
                            iM7515 -= iM7518;
                        }
                        if ((iM7517 & 16) != 0) {
                            iM7515 -= 10;
                        }
                    } else {
                        C7309.m19506(iM7516, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iM7516 < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c2613 = new C2613(iM7516, iM7515, z);
                } else if ((iM7517 & 64) != 0) {
                    C0303.m1848("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM7516 < 4 || (iM7517 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c2613 = new C2613(iM7516, iM7515, z);
                }
                if (c2613 == null) {
                    return null;
                }
                int iM7500 = c2460.m7500();
                i2 = c2613.f10221 == 2 ? 6 : 10;
                iM15015 = c2613.f10220;
                if (c2613.f10222) {
                    iM15015 = m15015(c2613.f10220, c2460);
                }
                c2460.m7501(iM7500 + iM15015);
                if (!m15026(c2460, c2613.f10221, i2, false)) {
                    if (c2613.f10221 == 4 || !m15026(c2460, 4, i2, true)) {
                        C0303.m1848("Failed to validate ID3 tag with majorVersion=" + c2613.f10221);
                        return null;
                    }
                    z2 = true;
                }
                while (c2460.m7503() >= i2) {
                    abstractC22370M15023 = m15023(c2613.f10221, c2460, z2, i2, this.f18750);
                    if (abstractC22370M15023 != null) {
                        arrayList.add(abstractC22370M15023);
                    }
                }
                return new C0987(arrayList);
            }
            C0303.m1848("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM7525))));
        }
        c2613 = null;
        if (c2613 == null) {
            return null;
        }
        int iM7501 = c2460.m7500();
        if (c2613.f10221 == 2) {
        }
        iM15015 = c2613.f10220;
        if (c2613.f10222) {
            iM15015 = m15015(c2613.f10220, c2460);
        }
        c2460.m7501(iM7501 + iM15015);
        if (!m15026(c2460, c2613.f10221, i2, false)) {
            if (c2613.f10221 == 4) {
            }
            C0303.m1848("Failed to validate ID3 tag with majorVersion=" + c2613.f10221);
            return null;
        }
        while (c2460.m7503() >= i2) {
            abstractC22370M15023 = m15023(c2613.f10221, c2460, z2, i2, this.f18750);
            if (abstractC22370M15023 != null) {
                arrayList.add(abstractC22370M15023);
            }
        }
        return new C0987(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15026(C2460 c2460, int i, int i2, boolean z) {
        int iM7525;
        long jM7525;
        int iM7519;
        int i3;
        int iM7500 = c2460.m7500();
        while (true) {
            try {
                boolean z2 = true;
                if (c2460.m7503() < i2) {
                    c2460.m7510(iM7500);
                    return true;
                }
                if (i >= 3) {
                    iM7525 = c2460.m7499();
                    jM7525 = c2460.m7532();
                    iM7519 = c2460.m7519();
                } else {
                    iM7525 = c2460.m7525();
                    jM7525 = c2460.m7525();
                    iM7519 = 0;
                }
                if (iM7525 == 0 && jM7525 == 0 && iM7519 == 0) {
                    c2460.m7510(iM7500);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM7525) != 0) {
                        c2460.m7510(iM7500);
                        return false;
                    }
                    jM7525 = (((jM7525 >> 24) & 255) << 21) | (jM7525 & 255) | (((jM7525 >> 8) & 255) << 7) | (((jM7525 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM7519 & 64) != 0 ? 1 : 0;
                    if ((iM7519 & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM7519 & 32) != 0 ? 1 : 0;
                        if ((iM7519 & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM7525 < i3) {
                    c2460.m7510(iM7500);
                    return false;
                }
                if (c2460.m7503() >= jM7525) {
                    c2460.m7535((int) jM7525);
                } else {
                    c2460.m7510(iM7500);
                    return false;
                }
            } catch (Throwable th) {
                c2460.m7510(iM7500);
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
    public static AbstractC22370 m15023(int i, C2460 c2460, boolean z, int i2, InterfaceC11787 interfaceC11787) {
        int iM7525;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AbstractC22370 c2137;
        int iM7516 = c2460.m7516();
        int iM7517 = c2460.m7516();
        int iM7518 = c2460.m7516();
        int iM7519 = i >= 3 ? c2460.m7516() : 0;
        if (i == 4) {
            iM7525 = c2460.m7531();
            if (!z) {
                iM7525 = (((iM7525 >> 24) & 255) << 21) | (iM7525 & 255) | (((iM7525 >> 8) & 255) << 7) | (((iM7525 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            iM7525 = c2460.m7531();
        } else {
            iM7525 = c2460.m7525();
        }
        int iM15015 = iM7525;
        int iM75110 = i >= 3 ? c2460.m7519() : 0;
        AbstractC22370 abstractC22370 = null;
        if (iM7516 == 0 && iM7517 == 0 && iM7518 == 0 && iM7519 == 0 && iM15015 == 0 && iM75110 == 0) {
            c2460.m7510(c2460.m7509());
            return null;
        }
        int iM7500 = c2460.m7500() + iM15015;
        if (iM7500 > c2460.m7509()) {
            C0303.m1848("Frame size exceeds remaining tag data");
            c2460.m7510(c2460.m7509());
            return null;
        }
        if (interfaceC11787 != null) {
            i3 = iM7500;
            if (!interfaceC11787.mo10336(i, iM7516, iM7517, iM7518, iM7519)) {
                c2460.m7510(i3);
                return null;
            }
        } else {
            i3 = iM7500;
        }
        if (i == 3) {
            z2 = (iM75110 & 128) != 0;
            boolean z7 = (iM75110 & 64) != 0;
            z4 = (iM75110 & 32) != 0;
            z6 = z7;
            z3 = false;
            z5 = z2;
        } else if (i == 4) {
            boolean z8 = (iM75110 & 64) != 0;
            boolean z9 = (iM75110 & 8) != 0;
            z6 = (iM75110 & 4) != 0;
            z3 = (iM75110 & 2) != 0;
            boolean z10 = z9;
            z5 = (iM75110 & 1) != 0;
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
            C0303.m1848("Skipping unsupported compressed or encrypted frame");
            c2460.m7510(i3);
            return null;
        }
        if (z4) {
            iM15015--;
            c2460.m7535(1);
        }
        if (z5) {
            iM15015 -= 4;
            c2460.m7535(4);
        }
        if (z3) {
            iM15015 = m15015(iM15015, c2460);
        }
        try {
            if (iM7516 == 84 && iM7517 == 88 && iM7518 == 88 && (i == 2 || iM7519 == 88)) {
                c2137 = m15027(iM15015, c2460);
            } else if (iM7516 == 84) {
                c2137 = m15025(iM15015, c2460, m15018(i, iM7516, iM7517, iM7518, iM7519));
            } else if (iM7516 == 87 && iM7517 == 88 && iM7518 == 88 && (i == 2 || iM7519 == 88)) {
                c2137 = m15035(iM15015, c2460);
            } else if (iM7516 == 87) {
                c2137 = m15034(iM15015, c2460, m15018(i, iM7516, iM7517, iM7518, iM7519));
            } else if (iM7516 == 80 && iM7517 == 82 && iM7518 == 73 && iM7519 == 86) {
                c2137 = m15016(iM15015, c2460);
            } else if (iM7516 == 71 && iM7517 == 69 && iM7518 == 79 && (iM7519 == 66 || i == 2)) {
                c2137 = m15033(iM15015, c2460);
            } else if (i == 2) {
                if (iM7516 == 80 && iM7517 == 73 && iM7518 == 67) {
                    c2137 = m15022(c2460, iM15015, i);
                } else if (iM7516 != 67 && iM7517 == 79 && iM7518 == 77 && (iM7519 == 77 || i == 2)) {
                    c2137 = m15020(iM15015, c2460);
                } else if (iM7516 != 67 && iM7517 == 72 && iM7518 == 65 && iM7519 == 80) {
                    c2137 = m15021(c2460, iM15015, i, z, i2, interfaceC11787);
                } else if (iM7516 != 67 && iM7517 == 84 && iM7518 == 79 && iM7519 == 67) {
                    c2137 = m15032(c2460, iM15015, i, z, i2, interfaceC11787);
                } else if (iM7516 != 77 && iM7517 == 76 && iM7518 == 76 && iM7519 == 84) {
                    c2137 = m15028(iM15015, c2460);
                } else {
                    String strM15018 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr);
                    c2137 = new C2137(strM15018, bArr);
                }
            } else if (iM7516 == 65 && iM7517 == 80 && iM7518 == 73 && iM7519 == 67) {
                c2137 = m15022(c2460, iM15015, i);
            } else if (iM7516 != 67) {
                if (iM7516 != 67) {
                    if (iM7516 != 67) {
                        if (iM7516 != 77) {
                            String strM15019 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                            byte[] bArr2 = new byte[iM15015];
                            c2460.m7507(0, iM15015, bArr2);
                            c2137 = new C2137(strM15019, bArr2);
                        } else {
                            String strM150110 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                            byte[] bArr3 = new byte[iM15015];
                            c2460.m7507(0, iM15015, bArr3);
                            c2137 = new C2137(strM150110, bArr3);
                        }
                    } else if (iM7516 != 77) {
                        String strM150111 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr4 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr4);
                        c2137 = new C2137(strM150111, bArr4);
                    } else {
                        String strM150112 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr5 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr5);
                        c2137 = new C2137(strM150112, bArr5);
                    }
                } else if (iM7516 != 67) {
                    if (iM7516 != 77) {
                        String strM150113 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr6 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr6);
                        c2137 = new C2137(strM150113, bArr6);
                    } else {
                        String strM150114 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr7 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr7);
                        c2137 = new C2137(strM150114, bArr7);
                    }
                } else if (iM7516 != 77) {
                    String strM150115 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr8 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr8);
                    c2137 = new C2137(strM150115, bArr8);
                } else {
                    String strM150116 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr9 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr9);
                    c2137 = new C2137(strM150116, bArr9);
                }
            } else if (iM7516 != 67) {
                if (iM7516 != 67) {
                    if (iM7516 != 77) {
                        String strM150117 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr10 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr10);
                        c2137 = new C2137(strM150117, bArr10);
                    } else {
                        String strM150118 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                        byte[] bArr11 = new byte[iM15015];
                        c2460.m7507(0, iM15015, bArr11);
                        c2137 = new C2137(strM150118, bArr11);
                    }
                } else if (iM7516 != 77) {
                    String strM150119 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr12 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr12);
                    c2137 = new C2137(strM150119, bArr12);
                } else {
                    String strM1501110 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr13 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr13);
                    c2137 = new C2137(strM1501110, bArr13);
                }
            } else if (iM7516 != 67) {
                if (iM7516 != 77) {
                    String strM1501111 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr14 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr14);
                    c2137 = new C2137(strM1501111, bArr14);
                } else {
                    String strM1501112 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                    byte[] bArr15 = new byte[iM15015];
                    c2460.m7507(0, iM15015, bArr15);
                    c2137 = new C2137(strM1501112, bArr15);
                }
            } else if (iM7516 != 77) {
                String strM1501113 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                byte[] bArr16 = new byte[iM15015];
                c2460.m7507(0, iM15015, bArr16);
                c2137 = new C2137(strM1501113, bArr16);
            } else {
                String strM1501114 = m15018(i, iM7516, iM7517, iM7518, iM7519);
                byte[] bArr17 = new byte[iM15015];
                c2460.m7507(0, iM15015, bArr17);
                c2137 = new C2137(strM1501114, bArr17);
            }
            c2460.m7510(i3);
            abstractC22370 = c2137;
            e = null;
        } catch (Exception e) {
            e = e;
        } catch (OutOfMemoryError e2) {
            e = e2;
        } finally {
            c2460.m7510(i3);
        }
        if (abstractC22370 == null) {
            C0303.m1852("Failed to decode frame: id=" + m15018(i, iM7516, iM7517, iM7518, iM7519) + ", frameSize=" + iM15015, e);
        }
        return abstractC22370;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C23076 m15027(int i, C2460 c2460) {
        if (i < 1) {
            return null;
        }
        int iM7516 = c2460.m7516();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2460.m7507(0, i2, bArr);
        int iM15029 = m15029(0, iM7516, bArr);
        return new C23076("TXXX", new String(bArr, 0, iM15029, m15031(iM7516)), m15024(iM7516, iM15029 + m15017(iM7516), bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23076 m15025(int i, C2460 c2460, String str) {
        if (i < 1) {
            return null;
        }
        int iM7516 = c2460.m7516();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2460.m7507(0, i2, bArr);
        return new C23076(str, null, m15024(iM7516, 0, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m15024(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC22433.of((Object) "");
        }
        int i3 = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        int iM15029 = m15029(i2, i, bArr);
        while (i2 < iM15029) {
            c4793.m52163(new String(bArr, i2, iM15029 - i2, m15031(i)));
            i2 = m15017(i) + iM15029;
            iM15029 = m15029(i2, i, bArr);
        }
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        return abstractC22433M13309.isEmpty() ? AbstractC22433.of((Object) "") : abstractC22433M13309;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C15315 m15035(int i, C2460 c2460) {
        if (i < 1) {
            return null;
        }
        int iM7516 = c2460.m7516();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2460.m7507(0, i2, bArr);
        int iM15029 = m15029(0, iM7516, bArr);
        String str = new String(bArr, 0, iM15029, m15031(iM7516));
        int iM15017 = iM15029 + m15017(iM7516);
        return new C15315("WXXX", str, m15019(bArr, iM15017, m15030(iM15017, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15315 m15034(int i, C2460 c2460, String str) {
        byte[] bArr = new byte[i];
        c2460.m7507(0, i, bArr);
        return new C15315(str, null, new String(bArr, 0, m15030(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C6847 m15016(int i, C2460 c2460) {
        byte[] bArrCopyOfRange;
        byte[] bArr = new byte[i];
        c2460.m7507(0, i, bArr);
        int iM15030 = m15030(0, bArr);
        String str = new String(bArr, 0, iM15030, StandardCharsets.ISO_8859_1);
        int i2 = iM15030 + 1;
        if (i <= i2) {
            bArrCopyOfRange = C17983.f57507;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C6847(str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C13904 m15033(int i, C2460 c2460) {
        byte[] bArrCopyOfRange;
        int iM7516 = c2460.m7516();
        Charset charsetM15031 = m15031(iM7516);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2460.m7507(0, i2, bArr);
        int iM15030 = m15030(0, bArr);
        String strM17989 = C6632.m17989(new String(bArr, 0, iM15030, StandardCharsets.ISO_8859_1));
        int i3 = iM15030 + 1;
        int iM15029 = m15029(i3, iM7516, bArr);
        String strM15019 = m15019(bArr, i3, iM15029, charsetM15031);
        int iM15017 = iM15029 + m15017(iM7516);
        int iM150210 = m15029(iM15017, iM7516, bArr);
        String strM150110 = m15019(bArr, iM15017, iM150210, charsetM15031);
        int iM15018 = iM150210 + m15017(iM7516);
        if (i2 <= iM15018) {
            bArrCopyOfRange = C17983.f57507;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM15018, i2);
        }
        return new C13904(bArrCopyOfRange, strM17989, strM15019, strM150110);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14839 m15022(C2460 c2460, int i, int i2) {
        int iM15030;
        String strConcat;
        byte[] bArrCopyOfRange;
        int iM7516 = c2460.m7516();
        Charset charsetM15031 = m15031(iM7516);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c2460.m7507(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + C20733.m46672(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM15030 = 2;
        } else {
            iM15030 = m15030(0, bArr);
            String strM46672 = C20733.m46672(new String(bArr, 0, iM15030, StandardCharsets.ISO_8859_1));
            strConcat = strM46672.indexOf(47) == -1 ? "image/".concat(strM46672) : strM46672;
        }
        int i4 = bArr[iM15030 + 1] & 255;
        int i5 = iM15030 + 2;
        int iM15029 = m15029(i5, iM7516, bArr);
        String str = new String(bArr, i5, iM15029 - i5, charsetM15031);
        int iM15017 = iM15029 + m15017(iM7516);
        if (i3 <= iM15017) {
            bArrCopyOfRange = C17983.f57507;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iM15017, i3);
        }
        return new C14839(i4, strConcat, str, bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4730 m15020(int i, C2460 c2460) {
        if (i < 4) {
            return null;
        }
        int iM7516 = c2460.m7516();
        Charset charsetM15031 = m15031(iM7516);
        byte[] bArr = new byte[3];
        c2460.m7507(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c2460.m7507(0, i2, bArr2);
        int iM15029 = m15029(0, iM7516, bArr2);
        String str2 = new String(bArr2, 0, iM15029, charsetM15031);
        int iM15017 = iM15029 + m15017(iM7516);
        return new C4730(str, str2, m15019(bArr2, iM15017, m15029(iM15017, iM7516, bArr2), charsetM15031));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9900 m15021(C2460 c2460, int i, int i2, boolean z, int i3, InterfaceC11787 interfaceC11787) {
        int iM7500 = c2460.m7500();
        int iM15030 = m15030(iM7500, c2460.m7518());
        String str = new String(c2460.m7518(), iM7500, iM15030 - iM7500, StandardCharsets.ISO_8859_1);
        c2460.m7510(iM15030 + 1);
        int iM7499 = c2460.m7499();
        int iM74910 = c2460.m7499();
        long jM7532 = c2460.m7532();
        long j = jM7532 == 4294967295L ? -1L : jM7532;
        long jM7533 = c2460.m7532();
        long j2 = jM7533 == 4294967295L ? -1L : jM7533;
        ArrayList arrayList = new ArrayList();
        int i4 = iM7500 + i;
        while (c2460.m7500() < i4) {
            AbstractC22370 abstractC22370M15023 = m15023(i2, c2460, z, i3, interfaceC11787);
            if (abstractC22370M15023 != null) {
                arrayList.add(abstractC22370M15023);
            }
        }
        return new C9900(str, iM7499, iM74910, j, j2, (AbstractC22370[]) arrayList.toArray(new AbstractC22370[0]));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3548 m15032(C2460 c2460, int i, int i2, boolean z, int i3, InterfaceC11787 interfaceC11787) {
        int iM7500 = c2460.m7500();
        int iM15030 = m15030(iM7500, c2460.m7518());
        String str = new String(c2460.m7518(), iM7500, iM15030 - iM7500, StandardCharsets.ISO_8859_1);
        c2460.m7510(iM15030 + 1);
        int iM7516 = c2460.m7516();
        boolean z2 = (iM7516 & 2) != 0;
        boolean z3 = (iM7516 & 1) != 0;
        int iM7517 = c2460.m7516();
        String[] strArr = new String[iM7517];
        for (int i4 = 0; i4 < iM7517; i4++) {
            int iM7501 = c2460.m7500();
            int iM15031 = m15030(iM7501, c2460.m7518());
            strArr[i4] = new String(c2460.m7518(), iM7501, iM15031 - iM7501, StandardCharsets.ISO_8859_1);
            c2460.m7510(iM15031 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM7500 + i;
        while (c2460.m7500() < i5) {
            AbstractC22370 abstractC22370M15023 = m15023(i2, c2460, z, i3, interfaceC11787);
            if (abstractC22370M15023 != null) {
                arrayList.add(abstractC22370M15023);
            }
        }
        return new C3548(str, z2, z3, strArr, (AbstractC22370[]) arrayList.toArray(new AbstractC22370[0]));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C4024 m15028(int i, C2460 c2460) {
        int iM7519 = c2460.m7519();
        int iM7525 = c2460.m7525();
        int iM7526 = c2460.m7525();
        int iM7516 = c2460.m7516();
        int iM7517 = c2460.m7516();
        C11634 c11634 = new C11634();
        c11634.m29033(c2460);
        int i2 = ((i - 10) * 8) / (iM7516 + iM7517);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM29039 = c11634.m29039(iM7516);
            int iM290310 = c11634.m29039(iM7517);
            iArr[i3] = iM29039;
            iArr2[i3] = iM290310;
        }
        return new C4024(iM7519, iM7525, iArr, iArr2, iM7526);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m15015(int i, C2460 c2460) {
        byte[] bArrM7518 = c2460.m7518();
        int iM7500 = c2460.m7500();
        int i2 = iM7500;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM7500 + i) {
                return i;
            }
            if ((bArrM7518[i2] & 255) == 255 && bArrM7518[i3] == 0) {
                System.arraycopy(bArrM7518, i2 + 2, bArrM7518, i3, (i - (i2 - iM7500)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Charset m15031(int i) {
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
    public static String m15018(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m15029(int i, int i2, byte[] bArr) {
        int iM15030 = m15030(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM15030;
        }
        while (iM15030 < bArr.length - 1) {
            if ((iM15030 - i) % 2 == 0 && bArr[iM15030 + 1] == 0) {
                return iM15030;
            }
            iM15030 = m15030(iM15030 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m15030(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15019(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
