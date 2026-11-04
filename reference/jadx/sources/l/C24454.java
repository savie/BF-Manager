package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩺ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7YM */
/* JADX INFO: loaded from: classes.dex */
public final class C24454 extends AbstractC6554 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f79382;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f79383;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f79384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f79385;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f79386;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f79387;

    public C24454(C22962 c22962) {
        this(c22962, null, null, null, null, null);
    }

    public C24454(C22962 c22962, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(c22962);
        this.f79384 = bArr;
        this.f79387 = bArr2;
        this.f79385 = bArr3;
        this.f79386 = bArr4;
        this.f79383 = bArr5;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C9011.m24065("-----BEGIN DSA PRIVATE KEY-----");
        C9011.m24065("-----END DSA PRIVATE KEY-----");
        f79382 = OpenSSHPublicKeyUtil.DSS.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m54698() {
        int iM18444 = AbstractC6554.m18444(1) + 3 + AbstractC6554.m18444(this.f79384.length) + this.f79384.length + 1 + AbstractC6554.m18444(this.f79387.length) + this.f79387.length + 1 + AbstractC6554.m18444(this.f79385.length) + this.f79385.length + 1 + AbstractC6554.m18444(this.f79386.length) + this.f79386.length + 1 + AbstractC6554.m18444(this.f79383.length) + this.f79383.length;
        byte[] bArr = new byte[AbstractC6554.m18444(iM18444) + 1 + iM18444];
        bArr[0] = UTF8.S_P3A;
        AbstractC6554.m18445(AbstractC6554.m18445(AbstractC6554.m18445(AbstractC6554.m18445(AbstractC6554.m18445(AbstractC6554.m18445(AbstractC6554.m18454(1, iM18444, bArr), bArr, new byte[1]), bArr, this.f79384), bArr, this.f79387), bArr, this.f79385), bArr, this.f79386), bArr, this.f79383);
        return bArr;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2670(byte[] bArr) {
        int i;
        C22962 c22962 = this.f22008;
        try {
            int i2 = this.f22011;
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                C9866 c9866 = new C9866(bArr);
                c9866.m25658();
                this.f79384 = c9866.m25664();
                this.f79385 = c9866.m25664();
                this.f79387 = c9866.m25664();
                this.f79386 = c9866.m25664();
                this.f79383 = c9866.m25664();
                if (this.f79384 != null) {
                    new BigInteger(this.f79384).bitLength();
                }
                return true;
            }
            if (i2 != 2 && i2 != 5) {
                if (i2 == 4) {
                    C9866 c9867 = new C9866(bArr);
                    if (c9867.m25658() != c9867.m25658()) {
                        throw new C2079("check failed");
                    }
                    C9011.m24051(c9867.m25649());
                    this.f79384 = c9867.m25667();
                    this.f79387 = c9867.m25667();
                    this.f79385 = c9867.m25667();
                    this.f79386 = c9867.m25667();
                    this.f79383 = c9867.m25667();
                    byte[] bArrM25649 = c9867.m25649();
                    this.f22003 = new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                    new BigInteger(this.f79384).bitLength();
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
                this.f79384 = bArr2;
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
                this.f79387 = bArr3;
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
                this.f79385 = bArr4;
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
                this.f79386 = bArr5;
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
                this.f79383 = bArr6;
                System.arraycopy(bArr, i47, bArr6, 0, i49);
                if (this.f79384 != null) {
                    new BigInteger(this.f79384).bitLength();
                }
                return true;
            }
            C9866 c9868 = new C9866(bArr);
            c9868.m25659(bArr.length);
            try {
                this.f79383 = c9868.m25656(1, "")[0];
                return true;
            } catch (C2079 unused) {
                c22962.getClass();
                C19978.f64189.getClass();
                return false;
            }
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
        byte[] bArr = this.f79384;
        if (bArr == null) {
            return null;
        }
        return C9866.m25648(new byte[][]{f79382, bArr, this.f79387, this.f79385, this.f79386}).f31750;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo2676() {
        return f79382;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2675(byte[] bArr) {
        try {
            InterfaceC6029 interfaceC6029 = (InterfaceC6029) Class.forName(C19978.m45892("signature.dss")).asSubclass(InterfaceC6029.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC6029.init();
            interfaceC6029.mo17501(this.f79383, this.f79384, this.f79387, this.f79385);
            interfaceC6029.update(bArr);
            return C9866.m25648(new byte[][]{f79382, interfaceC6029.sign()}).f31750;
        } catch (Exception unused) {
            this.f22008.getClass();
            C19978.f64189.getClass();
            return null;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo2669(String str, byte[] bArr) {
        return mo2675(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6554 m54697(C22962 c22962, C9866 c9866) throws C2079 {
        byte[][] bArrM25656 = c9866.m25656(7, "invalid key format");
        C24454 c24454 = new C24454(c22962, bArrM25656[1], bArrM25656[2], bArrM25656[3], bArrM25656[4], bArrM25656[5]);
        c24454.f22003 = C9011.m24051(bArrM25656[6]);
        c24454.f22011 = 0;
        return c24454;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ */
    public final void mo2668() {
        C9011.m24062(this.f79383);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo2674() throws C2079 {
        if (this.f22004) {
            throw new C2079("key is encrypted.");
        }
        C9866 c9866 = new C9866();
        c9866.m25673(f79382);
        c9866.m25673(this.f79384);
        c9866.m25673(this.f79387);
        c9866.m25673(this.f79385);
        c9866.m25673(this.f79386);
        c9866.m25673(this.f79383);
        c9866.m25673(C9011.m24055(this.f22003, StandardCharsets.UTF_8));
        int iM25672 = c9866.m25672();
        byte[] bArr = new byte[iM25672];
        c9866.m25653(0, iM25672, bArr);
        return bArr;
    }
}
