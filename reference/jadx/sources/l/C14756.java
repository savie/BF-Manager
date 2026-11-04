package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14756 extends AbstractC6554 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static byte[][] f48170 = {new byte[]{6, 8, 42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String[] f48171;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static String[] f48172;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f48173;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f48174;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f48175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f48176;

    static {
        String[] strArr = {"nistp256", "nistp384", "nistp521"};
        f48171 = strArr;
        f48172 = (String[]) C13847.stream(strArr).map(new C18980(6)).toArray(new C4316());
        C9011.m24065("-----BEGIN EC PRIVATE KEY-----");
        C9011.m24065("-----END EC PRIVATE KEY-----");
    }

    public C14756(C22962 c22962) {
        this(c22962, null, null, null, null);
    }

    public C14756(C22962 c22962, byte[] bArr) {
        this(c22962, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            Charset charset = StandardCharsets.UTF_8;
            if (C9011.m24054(bArr2, C9011.m24055("nistp384", charset))) {
                this.f48175 = bArr2;
            }
            if (C9011.m24054(bArr2, C9011.m24055("nistp521", charset))) {
                this.f48175 = bArr2;
            }
        }
    }

    public C14756(C22962 c22962, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(c22962);
        this.f48175 = C9011.m24055(f48171[0], StandardCharsets.UTF_8);
        if (bArr != null) {
            this.f48175 = bArr;
        }
        this.f48176 = bArr2;
        this.f48173 = bArr3;
        this.f48174 = bArr4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m35441() {
        char c;
        byte[] bArr = {1};
        byte[] bArr2 = this.f48176;
        if (bArr2.length >= 64) {
            c = 2;
        } else {
            c = bArr2.length >= 48 ? (char) 1 : (char) 0;
        }
        byte[] bArr3 = f48170[c];
        byte[] bArr4 = this.f48173;
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
        int iM18444 = AbstractC6554.m18444(1) + 3 + AbstractC6554.m18444(this.f48174.length) + this.f48174.length + 1 + AbstractC6554.m18444(bArr3.length) + bArr3.length + 1 + AbstractC6554.m18444(i3) + i3;
        byte[] bArr7 = new byte[AbstractC6554.m18444(iM18444) + 1 + iM18444];
        bArr7[0] = UTF8.S_P3A;
        int iM18445 = AbstractC6554.m18445(AbstractC6554.m18454(1, iM18444, bArr7), bArr7, bArr);
        byte[] bArr8 = this.f48174;
        bArr7[iM18445] = 4;
        int iM18454 = AbstractC6554.m18454(iM18445 + 1, bArr8.length, bArr7);
        System.arraycopy(bArr8, 0, bArr7, iM18454, bArr8.length);
        int length2 = iM18454 + bArr8.length;
        bArr7[length2] = -96;
        int iM18455 = AbstractC6554.m18454(length2 + 1, bArr3.length, bArr7);
        System.arraycopy(bArr3, 0, bArr7, iM18455, bArr3.length);
        int length3 = iM18455 + bArr3.length;
        bArr7[length3] = -95;
        System.arraycopy(bArr6, 0, bArr7, AbstractC6554.m18454(length3 + 1, i3, bArr7), i3);
        return bArr7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: Exception -> 0x01e8, TryCatch #1 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:110:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: Exception -> 0x01e8, TryCatch #1 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:110:0x0009, inners: #0 }] */
    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2670(byte[] bArr) {
        int i;
        String str;
        byte[] bArrM25649;
        C22962 c22962 = this.f22008;
        try {
            int i2 = this.f22011;
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2 || i2 == 5) {
                C9866 c9866 = new C9866(bArr);
                c9866.m25659(bArr.length);
                try {
                    byte[] bArr2 = c9866.m25656(1, "")[0];
                    this.f48174 = bArr2;
                    if (bArr2.length < 64) {
                        int length = bArr2.length;
                    }
                    return true;
                } catch (C2079 unused) {
                    c22962.getClass();
                    C19978.f64189.getClass();
                    return false;
                }
            }
            String[] strArr = f48171;
            if (i2 == 4) {
                C9866 c9867 = new C9866(bArr);
                if (c9867.m25658() != c9867.m25658()) {
                    throw new C2079("check failed");
                }
                byte[] bArrM256410 = c9867.m25649();
                int length2 = bArrM256410.length;
                Charset charset = StandardCharsets.UTF_8;
                String str2 = new String(bArrM256410, 0, length2, charset);
                if (!Arrays.asList(f48172).contains(str2)) {
                    throw new IllegalArgumentException("unknown key type ".concat(str2));
                }
                byte[] bArrM256411 = c9867.m25649();
                this.f48175 = bArrM256411;
                String strM24051 = C9011.m24051(bArrM256411);
                if (!Arrays.asList(strArr).contains(strM24051)) {
                    throw new IllegalArgumentException("unknown curve name ".concat(strM24051));
                }
                if (!str2.endsWith(strM24051)) {
                    throw new IllegalArgumentException("key type " + str2 + " does not match curve name " + strM24051);
                }
                int iHashCode = strM24051.hashCode();
                if (iHashCode == 537081663) {
                    str = "nistp256";
                } else {
                    if (iHashCode != 537082715) {
                        if (iHashCode == 537084448) {
                            str = "nistp521";
                        }
                        bArrM25649 = c9867.m25649();
                        if (bArrM25649[0] == 4) {
                            throw new IllegalArgumentException("only uncompressed ECPoint supported");
                        }
                        byte[][] bArrM35440 = m35440(bArrM25649);
                        this.f48174 = c9867.m25667();
                        byte[] bArrM256412 = c9867.m25649();
                        this.f22003 = new String(bArrM256412, 0, bArrM256412.length, charset);
                        this.f48176 = bArrM35440[0];
                        this.f48173 = bArrM35440[1];
                        return true;
                    }
                    str = "nistp384";
                }
                strM24051.equals(str);
                bArrM25649 = c9867.m25649();
                if (bArrM25649[0] == 4) {
                    throw new IllegalArgumentException("only uncompressed ECPoint supported");
                }
                byte[][] bArrM35441 = m35440(bArrM25649);
                this.f48174 = c9867.m25667();
                byte[] bArrM256413 = c9867.m25649();
                this.f22003 = new String(bArrM256413, 0, bArrM256413.length, charset);
                this.f48176 = bArrM35441[0];
                this.f48173 = bArrM35441[1];
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
            this.f48174 = bArr3;
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
                byte[][] bArr5 = f48170;
                if (i30 >= 3) {
                    break;
                }
                if (C9011.m24054(bArr5[i30], bArr4)) {
                    this.f48175 = C9011.m24055(strArr[i30], StandardCharsets.UTF_8);
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
            byte[][] bArrM35442 = m35440(bArr6);
            this.f48176 = bArrM35442[0];
            this.f48173 = bArrM35442[1];
            byte[] bArr7 = this.f48174;
            if (bArr7 != null && bArr7.length < 64) {
                int length3 = bArr7.length;
            }
            return true;
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
        if (this.f48176 == null) {
            return null;
        }
        byte[] bArrM24055 = C9011.m24055("ecdsa-sha2-".concat(C9011.m24051(this.f48175)), StandardCharsets.UTF_8);
        byte[] bArr = this.f48175;
        byte[] bArr2 = this.f48176;
        byte[][] bArr3 = {bArrM24055, bArr, new byte[bArr2.length + 1 + this.f48173.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.f48173;
        System.arraycopy(bArr5, 0, bArr3[2], this.f48176.length + 1, bArr5.length);
        return C9866.m25648(bArr3).f31750;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo2676() {
        return C9011.m24055("ecdsa-sha2-".concat(C9011.m24051(this.f48175)), StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2675(byte[] bArr) throws Throwable {
        byte[] bArrCopyOf;
        byte[] bArr2 = null;
        try {
            InterfaceC23929 interfaceC23929 = (InterfaceC23929) Class.forName(C19978.m45892("ecdsa-sha2-".concat(C9011.m24051(this.f48175)))).asSubclass(InterfaceC23929.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC23929.init();
            byte[] bArr3 = this.f48174;
            bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
            try {
                try {
                    interfaceC23929.mo6339(bArrCopyOf);
                    interfaceC23929.update(bArr);
                    byte[] bArr4 = C9866.m25648(new byte[][]{C9011.m24055("ecdsa-sha2-".concat(C9011.m24051(this.f48175)), StandardCharsets.UTF_8), interfaceC23929.sign()}).f31750;
                    C9011.m24062(bArrCopyOf);
                    return bArr4;
                } catch (Exception unused) {
                    this.f22008.getClass();
                    C19978.f64189.getClass();
                    C9011.m24062(bArrCopyOf);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bArr2 = bArrCopyOf;
                C9011.m24062(bArr2);
                throw th;
            }
        } catch (Exception unused2) {
            bArrCopyOf = null;
        } catch (Throwable th2) {
            th = th2;
            C9011.m24062(bArr2);
            throw th;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2669(String str, byte[] bArr) {
        return mo2675(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6554 m35439(C22962 c22962, C9866 c9866) throws C2079 {
        byte[][] bArrM25656 = c9866.m25656(5, "invalid key format");
        byte[] bArr = bArrM25656[1];
        byte[][] bArrM35440 = m35440(bArrM25656[2]);
        C14756 c14756 = new C14756(c22962, bArr, bArrM35440[0], bArrM35440[1], bArrM25656[3]);
        c14756.f22003 = C9011.m24051(bArrM25656[4]);
        c14756.f22011 = 0;
        return c14756;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static byte[][] m35440(byte[] bArr) {
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

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2668() {
        C9011.m24062(this.f48174);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2674() throws C2079 {
        if (this.f22004) {
            throw new C2079("key is encrypted.");
        }
        C9866 c9866 = new C9866();
        String strConcat = "ecdsa-sha2-".concat(C9011.m24051(this.f48175));
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673(C9011.m24055(strConcat, charset));
        c9866.m25673(this.f48175);
        byte[] bArr = this.f48176;
        byte[] bArr2 = this.f48173;
        int length = bArr.length + 1 + bArr2.length;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        c9866.m25660(0, length, bArr3);
        c9866.m25673(this.f48174);
        c9866.m25673(C9011.m24055(this.f22003, charset));
        int iM25672 = c9866.m25672();
        byte[] bArr4 = new byte[iM25672];
        c9866.m25653(0, iM25672, bArr4);
        return bArr4;
    }
}
