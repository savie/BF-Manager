package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۬ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12952 extends AbstractC2367 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String[] f43054;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[][] f43055 = {new byte[]{6, 8, 42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static String[] f43056;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f43057;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f43058;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f43059;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f43060;

    static {
        String[] strArr = {"nistp256", "nistp384", "nistp521"};
        f43054 = strArr;
        f43056 = (String[]) C20318.stream(strArr).map(new C22124(0)).toArray(new C0956());
        C8491.m22185("-----BEGIN EC PRIVATE KEY-----");
        C8491.m22185("-----END EC PRIVATE KEY-----");
    }

    public C12952(C19925 c19925) {
        this(c19925, null, null, null, null);
    }

    public C12952(C19925 c19925, byte[] bArr) {
        this(c19925, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            Charset charset = StandardCharsets.UTF_8;
            if (C8491.m22174(bArr2, C8491.m22175("nistp384", charset))) {
                this.f43060 = bArr2;
            }
            if (C8491.m22174(bArr2, C8491.m22175("nistp521", charset))) {
                this.f43060 = bArr2;
            }
        }
    }

    public C12952(C19925 c19925, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(c19925);
        this.f43060 = C8491.m22175(f43054[0], StandardCharsets.UTF_8);
        if (bArr != null) {
            this.f43060 = bArr;
        }
        this.f43059 = bArr2;
        this.f43057 = bArr3;
        this.f43058 = bArr4;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m32088() {
        char c;
        byte[] bArr = {1};
        byte[] bArr2 = this.f43059;
        if (bArr2.length >= 64) {
            c = 2;
        } else {
            c = bArr2.length >= 48 ? (char) 1 : (char) 0;
        }
        byte[] bArr3 = f43055[c];
        byte[] bArr4 = this.f43057;
        int length = bArr2.length + 1 + bArr4.length;
        byte[] bArr5 = new byte[length];
        bArr5[0] = 4;
        System.arraycopy(bArr2, 0, bArr5, 1, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length + 1, bArr4.length);
        int i = length + 1;
        int i2 = (i & 128) == 0 ? 3 : 4;
        int i3 = length + i2;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr5, 0, bArr6, i2, length);
        bArr6[0] = 3;
        if (i2 == 3) {
            bArr6[1] = (byte) i;
        } else {
            bArr6[1] = -127;
            bArr6[2] = (byte) i;
        }
        int iM7190 = AbstractC2367.m7190(1) + 3 + AbstractC2367.m7190(this.f43058.length) + this.f43058.length + 1 + AbstractC2367.m7190(bArr3.length) + bArr3.length + 1 + AbstractC2367.m7190(i3) + i3;
        byte[] bArr7 = new byte[AbstractC2367.m7190(iM7190) + 1 + iM7190];
        bArr7[0] = UTF8.S_P3A;
        int iM7191 = AbstractC2367.m7191(AbstractC2367.m7199(1, iM7190, bArr7), bArr7, bArr);
        byte[] bArr8 = this.f43058;
        bArr7[iM7191] = 4;
        int iM7199 = AbstractC2367.m7199(iM7191 + 1, bArr8.length, bArr7);
        System.arraycopy(bArr8, 0, bArr7, iM7199, bArr8.length);
        int length2 = iM7199 + bArr8.length;
        bArr7[length2] = -96;
        int iM71910 = AbstractC2367.m7199(length2 + 1, bArr3.length, bArr7);
        System.arraycopy(bArr3, 0, bArr7, iM71910, bArr3.length);
        int length3 = iM71910 + bArr3.length;
        bArr7[length3] = -95;
        System.arraycopy(bArr6, 0, bArr7, AbstractC2367.m7199(length3 + 1, i3, bArr7), i3);
        return bArr7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: Exception -> 0x01e8, TryCatch #1 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:110:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: Exception -> 0x01e8, TryCatch #1 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:110:0x0009, inners: #0 }] */
    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7210(byte[] bArr) {
        int i;
        String str;
        byte[] bArrM35628;
        C19925 c19925 = this.f8365;
        try {
            int i2 = this.f8371;
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2 || i2 == 5) {
                C14904 c14904 = new C14904(bArr);
                c14904.m35639(bArr.length);
                try {
                    byte[] bArr2 = c14904.m35635(1, "")[0];
                    this.f43058 = bArr2;
                    if (bArr2.length < 64) {
                        int length = bArr2.length;
                    }
                    return true;
                } catch (C5813 unused) {
                    c19925.getClass();
                    C0168.f1257.getClass();
                    return false;
                }
            }
            String[] strArr = f43054;
            if (i2 == 4) {
                C14904 c14905 = new C14904(bArr);
                if (c14905.m35638() != c14905.m35638()) {
                    throw new C5813("check failed");
                }
                byte[] bArrM35629 = c14905.m35628();
                int length2 = bArrM35629.length;
                Charset charset = StandardCharsets.UTF_8;
                String str2 = new String(bArrM35629, 0, length2, charset);
                if (!Arrays.asList(f43056).contains(str2)) {
                    throw new IllegalArgumentException("unknown key type ".concat(str2));
                }
                byte[] bArrM356210 = c14905.m35628();
                this.f43060 = bArrM356210;
                String strM22171 = C8491.m22171(bArrM356210);
                if (!Arrays.asList(strArr).contains(strM22171)) {
                    throw new IllegalArgumentException("unknown curve name ".concat(strM22171));
                }
                if (!str2.endsWith(strM22171)) {
                    throw new IllegalArgumentException("key type " + str2 + " does not match curve name " + strM22171);
                }
                int iHashCode = strM22171.hashCode();
                if (iHashCode == 537081663) {
                    str = "nistp256";
                } else {
                    if (iHashCode != 537082715) {
                        if (iHashCode == 537084448) {
                            str = "nistp521";
                        }
                        bArrM35628 = c14905.m35628();
                        if (bArrM35628[0] == 4) {
                            throw new IllegalArgumentException("only uncompressed ECPoint supported");
                        }
                        byte[][] bArrM32086 = m32086(bArrM35628);
                        this.f43058 = c14905.m35636();
                        byte[] bArrM356211 = c14905.m35628();
                        this.f8368 = new String(bArrM356211, 0, bArrM356211.length, charset);
                        this.f43059 = bArrM32086[0];
                        this.f43057 = bArrM32086[1];
                        return true;
                    }
                    str = "nistp384";
                }
                strM22171.equals(str);
                bArrM35628 = c14905.m35628();
                if (bArrM35628[0] == 4) {
                    throw new IllegalArgumentException("only uncompressed ECPoint supported");
                }
                byte[][] bArrM32087 = m32086(bArrM35628);
                this.f43058 = c14905.m35636();
                byte[] bArrM356212 = c14905.m35628();
                this.f8368 = new String(bArrM356212, 0, bArrM356212.length, charset);
                this.f43059 = bArrM32087[0];
                this.f43057 = bArrM32087[1];
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
            byte[] bArr3 = new byte[i17];
            this.f43058 = bArr3;
            System.arraycopy(bArr, i15, bArr3, 0, i17);
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
            byte[] bArr4 = new byte[i25];
            System.arraycopy(bArr, i23, bArr4, 0, i25);
            int i29 = i23 + i25;
            int i30 = 0;
            while (true) {
                byte[][] bArr5 = f43055;
                if (i30 >= 3) {
                    break;
                }
                if (C8491.m22174(bArr5[i30], bArr4)) {
                    this.f43060 = C8491.m22175(strArr[i30], StandardCharsets.UTF_8);
                    break;
                }
                i30++;
            }
            int i31 = i29 + 1;
            int i32 = i29 + 2;
            int i33 = bArr[i31];
            int i34 = i33 & 255;
            if ((i33 & 128) != 0) {
                int i35 = i33 & 127;
                i34 = 0;
                while (true) {
                    int i36 = i35 - 1;
                    if (i35 <= 0) {
                        break;
                    }
                    int i37 = (i34 << 8) + (bArr[i32] & 255);
                    i32++;
                    i34 = i37;
                    i35 = i36;
                }
            }
            byte[] bArr6 = new byte[i34];
            System.arraycopy(bArr, i32, bArr6, 0, i34);
            byte[][] bArrM32088 = m32086(bArr6);
            this.f43059 = bArrM32088[0];
            this.f43057 = bArrM32088[1];
            byte[] bArr7 = this.f43058;
            if (bArr7 != null && bArr7.length < 64) {
                int length3 = bArr7.length;
            }
            return true;
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
        if (this.f43059 == null) {
            return null;
        }
        byte[] bArrM22175 = C8491.m22175("ecdsa-sha2-".concat(C8491.m22171(this.f43060)), StandardCharsets.UTF_8);
        byte[] bArr = this.f43060;
        byte[] bArr2 = this.f43059;
        byte[][] bArr3 = {bArrM22175, bArr, new byte[bArr2.length + 1 + this.f43057.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.f43057;
        System.arraycopy(bArr5, 0, bArr3[2], this.f43059.length + 1, bArr5.length);
        return C14904.m35624(bArr3).f48679;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo7202() {
        return C8491.m22175("ecdsa-sha2-".concat(C8491.m22171(this.f43060)), StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7212(byte[] bArr) throws Throwable {
        byte[] bArrCopyOf;
        byte[] bArr2 = null;
        try {
            InterfaceC22602 interfaceC22602 = (InterfaceC22602) Class.forName(C0168.m1327("ecdsa-sha2-".concat(C8491.m22171(this.f43060)))).asSubclass(InterfaceC22602.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC22602.init();
            byte[] bArr3 = this.f43058;
            bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
            try {
                try {
                    interfaceC22602.mo28242(bArrCopyOf);
                    interfaceC22602.update(bArr);
                    byte[] bArr4 = C14904.m35624(new byte[][]{C8491.m22175("ecdsa-sha2-".concat(C8491.m22171(this.f43060)), StandardCharsets.UTF_8), interfaceC22602.sign()}).f48679;
                    C8491.m22182(bArrCopyOf);
                    return bArr4;
                } catch (Exception unused) {
                    this.f8365.getClass();
                    C0168.f1257.getClass();
                    C8491.m22182(bArrCopyOf);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bArr2 = bArrCopyOf;
                C8491.m22182(bArr2);
                throw th;
            }
        } catch (Exception unused2) {
            bArrCopyOf = null;
        } catch (Throwable th2) {
            th = th2;
            C8491.m22182(bArr2);
            throw th;
        }
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo7206(String str, byte[] bArr) {
        return mo7212(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2367 m32087(C19925 c19925, C14904 c14904) throws C5813 {
        byte[][] bArrM35635 = c14904.m35635(5, "invalid key format");
        byte[] bArr = bArrM35635[1];
        byte[][] bArrM32086 = m32086(bArrM35635[2]);
        C12952 c12952 = new C12952(c19925, bArr, bArrM32086[0], bArrM32086[1], bArrM35635[3]);
        c12952.f8368 = C8491.m22171(bArrM35635[4]);
        c12952.f8371 = 0;
        return c12952;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static byte[][] m32086(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final void mo7203() {
        C8491.m22182(this.f43058);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7211() throws C5813 {
        if (this.f8367) {
            throw new C5813("key is encrypted.");
        }
        C14904 c14904 = new C14904();
        String strConcat = "ecdsa-sha2-".concat(C8491.m22171(this.f43060));
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627(C8491.m22175(strConcat, charset));
        c14904.m35627(this.f43060);
        byte[] bArr = this.f43059;
        byte[] bArr2 = this.f43057;
        int length = bArr.length + 1 + bArr2.length;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        c14904.m35640(0, length, bArr3);
        c14904.m35627(this.f43058);
        c14904.m35627(C8491.m22175(this.f8368, charset));
        int iM35626 = c14904.m35626();
        byte[] bArr4 = new byte[iM35626];
        c14904.m35632(0, iM35626, bArr4);
        return bArr4;
    }
}
