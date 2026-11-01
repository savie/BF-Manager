package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ᩳۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17890 extends AbstractC2367 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f56648;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f56649;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f56650;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f56651;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f56652;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f56653;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f56654;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f56655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f56656;

    public C17890(C19925 c19925) {
        this(c19925, null, null, null);
    }

    public C17890(C19925 c19925, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(c19925);
        this.f56650 = bArr;
        this.f56652 = bArr2;
        this.f56651 = bArr3;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C8491.m22185("-----BEGIN RSA PRIVATE KEY-----");
        C8491.m22185("-----END RSA PRIVATE KEY-----");
        f56648 = OpenSSHPublicKeyUtil.RSA.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7210(byte[] bArr) {
        int i;
        C19925 c19925 = this.f8365;
        try {
            int i2 = this.f8371;
            if (i2 == 2 || i2 == 5) {
                C14904 c14904 = new C14904(bArr);
                c14904.m35639(bArr.length);
                try {
                    byte[][] bArrM35635 = c14904.m35635(4, "");
                    this.f56651 = bArrM35635[0];
                    this.f56655 = bArrM35635[1];
                    this.f56649 = bArrM35635[2];
                    this.f56656 = bArrM35635[3];
                    m41516();
                    m41518();
                    return true;
                } catch (C5813 unused) {
                    c19925.getClass();
                    C0168.f1257.getClass();
                }
            } else {
                if (i2 == 1) {
                    if (bArr[0] != 48) {
                        C14904 c14905 = new C14904(bArr);
                        this.f56652 = c14905.m35649();
                        this.f56651 = c14905.m35649();
                        this.f56650 = c14905.m35649();
                        c14905.m35649();
                        this.f56655 = c14905.m35649();
                        this.f56649 = c14905.m35649();
                        if (this.f56650 != null) {
                            new BigInteger(this.f56650).bitLength();
                        }
                        m41516();
                        m41518();
                        m41519();
                        return true;
                    }
                    c19925.getClass();
                    C0168.f1257.getClass();
                    return false;
                }
                if (i2 == 4) {
                    C14904 c14906 = new C14904(bArr);
                    if (c14906.m35638() != c14906.m35638()) {
                        throw new C5813("check failed");
                    }
                    C8491.m22171(c14906.m35628());
                    this.f56650 = c14906.m35636();
                    this.f56652 = c14906.m35636();
                    this.f56651 = c14906.m35636();
                    this.f56656 = c14906.m35636();
                    this.f56655 = c14906.m35636();
                    this.f56649 = c14906.m35636();
                    new BigInteger(this.f56650).bitLength();
                    byte[] bArrM35628 = c14906.m35628();
                    this.f8368 = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                    m41516();
                    m41518();
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
                    this.f56650 = bArr2;
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
                    this.f56652 = bArr3;
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
                    this.f56651 = bArr4;
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
                    this.f56655 = bArr5;
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
                    this.f56649 = bArr6;
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
                    this.f56653 = bArr7;
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
                    this.f56654 = bArr8;
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
                    this.f56656 = bArr9;
                    System.arraycopy(bArr, i71, bArr9, 0, i73);
                    if (this.f56650 != null) {
                        new BigInteger(this.f56650).bitLength();
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            c19925.getClass();
            C0168.f1257.getClass();
            return false;
        }
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo7208() {
        byte[] bArrMo7208 = super.mo7208();
        if (bArrMo7208 != null) {
            return bArrMo7208;
        }
        byte[] bArr = this.f56652;
        if (bArr == null) {
            return null;
        }
        return C14904.m35624(new byte[][]{f56648, bArr, this.f56650}).f48679;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo7202() {
        return f56648;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7212(byte[] bArr) {
        return mo7206(OpenSSHPublicKeyUtil.RSA, bArr);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo7206(String str, byte[] bArr) {
        try {
            InterfaceC13430 interfaceC13430 = (InterfaceC13430) Class.forName(C0168.m1327(str)).asSubclass(InterfaceC13430.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC13430.init();
            interfaceC13430.mo32923(this.f56651, this.f56650);
            interfaceC13430.update(bArr);
            return C14904.m35624(new byte[][]{str.getBytes(StandardCharsets.UTF_8), interfaceC13430.sign()}).f48679;
        } catch (Exception unused) {
            this.f8365.getClass();
            C0168.f1257.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m41517(C19925 c19925, C14904 c14904) throws C5813 {
        byte[][] bArrM35635 = c14904.m35635(8, "invalid key format");
        C17890 c17890 = new C17890(c19925, bArrM35635[1], bArrM35635[2], bArrM35635[3]);
        c17890.f56656 = bArrM35635[4];
        c17890.f56655 = bArrM35635[5];
        c17890.f56649 = bArrM35635[6];
        c17890.f8368 = C8491.m22171(bArrM35635[7]);
        c17890.f8371 = 0;
        return c17890;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m41516() {
        if (this.f56653 == null) {
            this.f56653 = new BigInteger(this.f56651).mod(new BigInteger(this.f56655).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m41518() {
        if (this.f56654 == null) {
            this.f56654 = new BigInteger(this.f56651).mod(new BigInteger(this.f56649).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private byte[] m41519() {
        if (this.f56656 == null) {
            this.f56656 = new BigInteger(this.f56649).modInverse(new BigInteger(this.f56655)).toByteArray();
        }
        return this.f56656;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final void mo7203() {
        C8491.m22182(this.f56651);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7211() throws C5813 {
        if (this.f8367) {
            throw new C5813("key is encrypted.");
        }
        C14904 c14904 = new C14904();
        c14904.m35627(f56648);
        c14904.m35627(this.f56650);
        c14904.m35627(this.f56652);
        c14904.m35627(this.f56651);
        c14904.m35627(m41519());
        c14904.m35627(this.f56655);
        c14904.m35627(this.f56649);
        c14904.m35627(C8491.m22175(this.f8368, StandardCharsets.UTF_8));
        int iM35626 = c14904.m35626();
        byte[] bArr = new byte[iM35626];
        c14904.m35632(0, iM35626, bArr);
        return bArr;
    }
}
