package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۢܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10281 extends AbstractC6554 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32826;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f32827;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f32828;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f32829;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f32830;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f32831;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f32832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f32833;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f32834;

    public C10281(C22962 c22962) {
        this(c22962, null, null, null);
    }

    public C10281(C22962 c22962, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(c22962);
        this.f32827 = bArr;
        this.f32828 = bArr2;
        this.f32829 = bArr3;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C9011.m24065("-----BEGIN RSA PRIVATE KEY-----");
        C9011.m24065("-----END RSA PRIVATE KEY-----");
        f32826 = OpenSSHPublicKeyUtil.RSA.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2670(byte[] bArr) {
        int i;
        C22962 c22962 = this.f22008;
        try {
            int i2 = this.f22011;
            if (i2 == 2 || i2 == 5) {
                C9866 c9866 = new C9866(bArr);
                c9866.m25659(bArr.length);
                try {
                    byte[][] bArrM25656 = c9866.m25656(4, "");
                    this.f32829 = bArrM25656[0];
                    this.f32832 = bArrM25656[1];
                    this.f32834 = bArrM25656[2];
                    this.f32831 = bArrM25656[3];
                    m26494();
                    m26493();
                    return true;
                } catch (C2079 unused) {
                    c22962.getClass();
                    C19978.f64189.getClass();
                }
            } else {
                if (i2 == 1) {
                    if (bArr[0] != 48) {
                        C9866 c9867 = new C9866(bArr);
                        this.f32828 = c9867.m25664();
                        this.f32829 = c9867.m25664();
                        this.f32827 = c9867.m25664();
                        c9867.m25664();
                        this.f32832 = c9867.m25664();
                        this.f32834 = c9867.m25664();
                        if (this.f32827 != null) {
                            new BigInteger(this.f32827).bitLength();
                        }
                        m26494();
                        m26493();
                        m26495();
                        return true;
                    }
                    c22962.getClass();
                    C19978.f64189.getClass();
                    return false;
                }
                if (i2 == 4) {
                    C9866 c9868 = new C9866(bArr);
                    if (c9868.m25658() != c9868.m25658()) {
                        throw new C2079("check failed");
                    }
                    C9011.m24051(c9868.m25649());
                    this.f32827 = c9868.m25667();
                    this.f32828 = c9868.m25667();
                    this.f32829 = c9868.m25667();
                    this.f32831 = c9868.m25667();
                    this.f32832 = c9868.m25667();
                    this.f32834 = c9868.m25667();
                    new BigInteger(this.f32827).bitLength();
                    byte[] bArrM25649 = c9868.m25649();
                    this.f22003 = new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                    m26494();
                    m26493();
                    return true;
                }
                byte b = bArr[1];
                if ((b & GCMSIVBlockCipher.MASK) != 0) {
                    int i3 = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                    i = 2;
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 <= 0) {
                            break;
                        }
                        int i5 = i + 1;
                        byte b2 = bArr[i];
                        i = i5;
                        i3 = i4;
                    }
                } else {
                    i = 2;
                }
                if (bArr[i] == 2) {
                    int i6 = i + 1;
                    int i7 = i + 2;
                    int i8 = bArr[i6];
                    int i9 = i8 & 255;
                    if ((i8 & 128) != 0) {
                        int i10 = i8 & 127;
                        i9 = 0;
                        while (true) {
                            int i11 = i10 - 1;
                            if (i10 <= 0) {
                                break;
                            }
                            int i12 = (i9 << 8) + (bArr[i7] & 255);
                            i7++;
                            i9 = i12;
                            i10 = i11;
                        }
                    }
                    int i13 = i7 + i9;
                    int i14 = i13 + 1;
                    int i15 = i13 + 2;
                    int i16 = bArr[i14];
                    int i17 = i16 & 255;
                    if ((i16 & 128) != 0) {
                        int i18 = i16 & 127;
                        i17 = 0;
                        while (true) {
                            int i19 = i18 - 1;
                            if (i18 <= 0) {
                                break;
                            }
                            int i20 = (i17 << 8) + (bArr[i15] & 255);
                            i15++;
                            i17 = i20;
                            i18 = i19;
                        }
                    }
                    byte[] bArr2 = new byte[i17];
                    this.f32827 = bArr2;
                    System.arraycopy(bArr, i15, bArr2, 0, i17);
                    int i21 = i15 + i17;
                    int i22 = i21 + 1;
                    int i23 = i21 + 2;
                    int i24 = bArr[i22];
                    int i25 = i24 & 255;
                    if ((i24 & 128) != 0) {
                        int i26 = i24 & 127;
                        i25 = 0;
                        while (true) {
                            int i27 = i26 - 1;
                            if (i26 <= 0) {
                                break;
                            }
                            int i28 = (i25 << 8) + (bArr[i23] & 255);
                            i23++;
                            i25 = i28;
                            i26 = i27;
                        }
                    }
                    byte[] bArr3 = new byte[i25];
                    this.f32828 = bArr3;
                    System.arraycopy(bArr, i23, bArr3, 0, i25);
                    int i29 = i23 + i25;
                    int i30 = i29 + 1;
                    int i31 = i29 + 2;
                    int i32 = bArr[i30];
                    int i33 = i32 & 255;
                    if ((i32 & 128) != 0) {
                        int i34 = i32 & 127;
                        i33 = 0;
                        while (true) {
                            int i35 = i34 - 1;
                            if (i34 <= 0) {
                                break;
                            }
                            int i36 = (i33 << 8) + (bArr[i31] & 255);
                            i31++;
                            i33 = i36;
                            i34 = i35;
                        }
                    }
                    byte[] bArr4 = new byte[i33];
                    this.f32829 = bArr4;
                    System.arraycopy(bArr, i31, bArr4, 0, i33);
                    int i37 = i31 + i33;
                    int i38 = i37 + 1;
                    int i39 = i37 + 2;
                    int i40 = bArr[i38];
                    int i41 = i40 & 255;
                    if ((i40 & 128) != 0) {
                        int i42 = i40 & 127;
                        i41 = 0;
                        while (true) {
                            int i43 = i42 - 1;
                            if (i42 <= 0) {
                                break;
                            }
                            int i44 = (i41 << 8) + (bArr[i39] & 255);
                            i39++;
                            i41 = i44;
                            i42 = i43;
                        }
                    }
                    byte[] bArr5 = new byte[i41];
                    this.f32832 = bArr5;
                    System.arraycopy(bArr, i39, bArr5, 0, i41);
                    int i45 = i39 + i41;
                    int i46 = i45 + 1;
                    int i47 = i45 + 2;
                    int i48 = bArr[i46];
                    int i49 = i48 & 255;
                    if ((i48 & 128) != 0) {
                        int i50 = i48 & 127;
                        i49 = 0;
                        while (true) {
                            int i51 = i50 - 1;
                            if (i50 <= 0) {
                                break;
                            }
                            int i52 = (i49 << 8) + (bArr[i47] & 255);
                            i47++;
                            i49 = i52;
                            i50 = i51;
                        }
                    }
                    byte[] bArr6 = new byte[i49];
                    this.f32834 = bArr6;
                    System.arraycopy(bArr, i47, bArr6, 0, i49);
                    int i53 = i47 + i49;
                    int i54 = i53 + 1;
                    int i55 = i53 + 2;
                    int i56 = bArr[i54];
                    int i57 = i56 & 255;
                    if ((i56 & 128) != 0) {
                        int i58 = i56 & 127;
                        i57 = 0;
                        while (true) {
                            int i59 = i58 - 1;
                            if (i58 <= 0) {
                                break;
                            }
                            int i60 = (i57 << 8) + (bArr[i55] & 255);
                            i55++;
                            i57 = i60;
                            i58 = i59;
                        }
                    }
                    byte[] bArr7 = new byte[i57];
                    this.f32830 = bArr7;
                    System.arraycopy(bArr, i55, bArr7, 0, i57);
                    int i61 = i55 + i57;
                    int i62 = i61 + 1;
                    int i63 = i61 + 2;
                    int i64 = bArr[i62];
                    int i65 = i64 & 255;
                    if ((i64 & 128) != 0) {
                        int i66 = i64 & 127;
                        i65 = 0;
                        while (true) {
                            int i67 = i66 - 1;
                            if (i66 <= 0) {
                                break;
                            }
                            int i68 = (i65 << 8) + (bArr[i63] & 255);
                            i63++;
                            i65 = i68;
                            i66 = i67;
                        }
                    }
                    byte[] bArr8 = new byte[i65];
                    this.f32833 = bArr8;
                    System.arraycopy(bArr, i63, bArr8, 0, i65);
                    int i69 = i63 + i65;
                    int i70 = i69 + 1;
                    int i71 = i69 + 2;
                    int i72 = bArr[i70];
                    int i73 = i72 & 255;
                    if ((i72 & 128) != 0) {
                        int i74 = i72 & 127;
                        i73 = 0;
                        while (true) {
                            int i75 = i74 - 1;
                            if (i74 <= 0) {
                                break;
                            }
                            int i76 = (i73 << 8) + (bArr[i71] & 255);
                            i71++;
                            i73 = i76;
                            i74 = i75;
                        }
                    }
                    byte[] bArr9 = new byte[i73];
                    this.f32831 = bArr9;
                    System.arraycopy(bArr, i71, bArr9, 0, i73);
                    if (this.f32827 != null) {
                        new BigInteger(this.f32827).bitLength();
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            c22962.getClass();
            C19978.f64189.getClass();
            return false;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩴ */
    public final byte[] mo2673() {
        byte[] bArrMo2673 = super.mo2673();
        if (bArrMo2673 != null) {
            return bArrMo2673;
        }
        byte[] bArr = this.f32828;
        if (bArr == null) {
            return null;
        }
        return C9866.m25648(new byte[][]{f32826, bArr, this.f32827}).f31750;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo2676() {
        return f32826;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2675(byte[] bArr) {
        return mo2669(OpenSSHPublicKeyUtil.RSA, bArr);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2669(String str, byte[] bArr) {
        try {
            InterfaceC14231 interfaceC14231 = (InterfaceC14231) Class.forName(C19978.m45892(str)).asSubclass(InterfaceC14231.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC14231.init();
            interfaceC14231.mo34544(this.f32829, this.f32827);
            interfaceC14231.update(bArr);
            return C9866.m25648(new byte[][]{str.getBytes(StandardCharsets.UTF_8), interfaceC14231.sign()}).f31750;
        } catch (Exception unused) {
            this.f22008.getClass();
            C19978.f64189.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6554 m26492(C22962 c22962, C9866 c9866) throws C2079 {
        byte[][] bArrM25656 = c9866.m25656(8, "invalid key format");
        C10281 c10281 = new C10281(c22962, bArrM25656[1], bArrM25656[2], bArrM25656[3]);
        c10281.f32831 = bArrM25656[4];
        c10281.f32832 = bArrM25656[5];
        c10281.f32834 = bArrM25656[6];
        c10281.f22003 = C9011.m24051(bArrM25656[7]);
        c10281.f22011 = 0;
        return c10281;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m26494() {
        if (this.f32830 == null) {
            this.f32830 = new BigInteger(this.f32829).mod(new BigInteger(this.f32832).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m26493() {
        if (this.f32833 == null) {
            this.f32833 = new BigInteger(this.f32829).mod(new BigInteger(this.f32834).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m26495() {
        if (this.f32831 == null) {
            this.f32831 = new BigInteger(this.f32834).modInverse(new BigInteger(this.f32832)).toByteArray();
        }
        return this.f32831;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2668() {
        C9011.m24062(this.f32829);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2674() throws C2079 {
        if (this.f22004) {
            throw new C2079("key is encrypted.");
        }
        C9866 c9866 = new C9866();
        c9866.m25673(f32826);
        c9866.m25673(this.f32827);
        c9866.m25673(this.f32828);
        c9866.m25673(this.f32829);
        c9866.m25673(m26495());
        c9866.m25673(this.f32832);
        c9866.m25673(this.f32834);
        c9866.m25673(C9011.m24055(this.f22003, StandardCharsets.UTF_8));
        int iM25672 = c9866.m25672();
        byte[] bArr = new byte[iM25672];
        c9866.m25653(0, iM25672, bArr);
        return bArr;
    }
}
