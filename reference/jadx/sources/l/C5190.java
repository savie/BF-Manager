package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۚۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7YM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5190 extends AbstractC2367 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f17997;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f17998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f17999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f18000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f18001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f18002;

    public C5190(C19925 c19925) {
        this(c19925, null, null, null, null, null);
    }

    public C5190(C19925 c19925, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(c19925);
        this.f17999 = bArr;
        this.f18000 = bArr2;
        this.f18002 = bArr3;
        this.f18001 = bArr4;
        this.f17998 = bArr5;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C8491.m22185("-----BEGIN DSA PRIVATE KEY-----");
        C8491.m22185("-----END DSA PRIVATE KEY-----");
        f17997 = OpenSSHPublicKeyUtil.DSS.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m14351() {
        int iM7190 = AbstractC2367.m7190(1) + 3 + AbstractC2367.m7190(this.f17999.length) + this.f17999.length + 1 + AbstractC2367.m7190(this.f18000.length) + this.f18000.length + 1 + AbstractC2367.m7190(this.f18002.length) + this.f18002.length + 1 + AbstractC2367.m7190(this.f18001.length) + this.f18001.length + 1 + AbstractC2367.m7190(this.f17998.length) + this.f17998.length;
        byte[] bArr = new byte[AbstractC2367.m7190(iM7190) + 1 + iM7190];
        bArr[0] = UTF8.S_P3A;
        AbstractC2367.m7191(AbstractC2367.m7191(AbstractC2367.m7191(AbstractC2367.m7191(AbstractC2367.m7191(AbstractC2367.m7191(AbstractC2367.m7199(1, iM7190, bArr), bArr, new byte[1]), bArr, this.f17999), bArr, this.f18000), bArr, this.f18002), bArr, this.f18001), bArr, this.f17998);
        return bArr;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7210(byte[] bArr) {
        int i;
        C19925 c19925 = this.f8365;
        try {
            int i2 = this.f8371;
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                C14904 c14904 = new C14904(bArr);
                c14904.m35638();
                this.f17999 = c14904.m35649();
                this.f18002 = c14904.m35649();
                this.f18000 = c14904.m35649();
                this.f18001 = c14904.m35649();
                this.f17998 = c14904.m35649();
                if (this.f17999 != null) {
                    new BigInteger(this.f17999).bitLength();
                }
                return true;
            }
            if (i2 != 2 && i2 != 5) {
                if (i2 == 4) {
                    C14904 c14905 = new C14904(bArr);
                    if (c14905.m35638() != c14905.m35638()) {
                        throw new C5813("check failed");
                    }
                    C8491.m22171(c14905.m35628());
                    this.f17999 = c14905.m35636();
                    this.f18000 = c14905.m35636();
                    this.f18002 = c14905.m35636();
                    this.f18001 = c14905.m35636();
                    this.f17998 = c14905.m35636();
                    byte[] bArrM35628 = c14905.m35628();
                    this.f8368 = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                    new BigInteger(this.f17999).bitLength();
                    return true;
                }
                if (bArr[0] != 48) {
                    return false;
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
                if (bArr[i] != 2) {
                    return false;
                }
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
                this.f17999 = bArr2;
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
                this.f18000 = bArr3;
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
                this.f18002 = bArr4;
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
                this.f18001 = bArr5;
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
                this.f17998 = bArr6;
                System.arraycopy(bArr, i47, bArr6, 0, i49);
                if (this.f17999 != null) {
                    new BigInteger(this.f17999).bitLength();
                }
                return true;
            }
            C14904 c14906 = new C14904(bArr);
            c14906.m35639(bArr.length);
            try {
                this.f17998 = c14906.m35635(1, "")[0];
                return true;
            } catch (C5813 unused) {
                c19925.getClass();
                C0168.f1257.getClass();
                return false;
            }
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
        byte[] bArr = this.f17999;
        if (bArr == null) {
            return null;
        }
        return C14904.m35624(new byte[][]{f17997, bArr, this.f18000, this.f18002, this.f18001}).f48679;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo7202() {
        return f17997;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7212(byte[] bArr) {
        try {
            InterfaceC5668 interfaceC5668 = (InterfaceC5668) Class.forName(C0168.m1327("signature.dss")).asSubclass(InterfaceC5668.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC5668.init();
            interfaceC5668.mo15557(this.f17998, this.f17999, this.f18000, this.f18002);
            interfaceC5668.update(bArr);
            return C14904.m35624(new byte[][]{f17997, interfaceC5668.sign()}).f48679;
        } catch (Exception unused) {
            this.f8365.getClass();
            C0168.f1257.getClass();
            return null;
        }
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo7206(String str, byte[] bArr) {
        return mo7212(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m14350(C19925 c19925, C14904 c14904) throws C5813 {
        byte[][] bArrM35635 = c14904.m35635(7, "invalid key format");
        C5190 c5190 = new C5190(c19925, bArrM35635[1], bArrM35635[2], bArrM35635[3], bArrM35635[4], bArrM35635[5]);
        c5190.f8368 = C8491.m22171(bArrM35635[6]);
        c5190.f8371 = 0;
        return c5190;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final void mo7203() {
        C8491.m22182(this.f17998);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7211() throws C5813 {
        if (this.f8367) {
            throw new C5813("key is encrypted.");
        }
        C14904 c14904 = new C14904();
        c14904.m35627(f17997);
        c14904.m35627(this.f17999);
        c14904.m35627(this.f18000);
        c14904.m35627(this.f18002);
        c14904.m35627(this.f18001);
        c14904.m35627(this.f17998);
        c14904.m35627(C8491.m22175(this.f8368, StandardCharsets.UTF_8));
        int iM35626 = c14904.m35626();
        byte[] bArr = new byte[iM35626];
        c14904.m35632(0, iM35626, bArr);
        return bArr;
    }
}
