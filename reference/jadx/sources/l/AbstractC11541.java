package l;

import com.alipay.sdk.m.p.d;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۨۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7XB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11541 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3073 f38778 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC21335 f38781 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f38780 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f38777 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f38779 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f38775 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f38776 = "";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28714(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo3495(C14904 c14904);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo3496();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28720() {
        int i = this.f38775;
        if (i == 1) {
            return "DSA";
        }
        if (i == 0) {
            return d.a;
        }
        return i == 3 ? "EDDSA" : "ECDSA";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28718() {
        return this.f38776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28715(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            return bArr;
        }
        int i = bArr[0] & 255;
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            i2 |= (i >>> i3) & 1;
        }
        int i4 = i2 ^ 1;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            int i7 = bArr[i6];
            i4 &= ((i7 & 128) >>> 7) ^ 1;
            i5 += i4;
            int i8 = i7 & 127;
            for (int i9 = 0; i9 < 7; i9++) {
                i4 &= ((i8 >>> i9) & 1) ^ 1;
            }
        }
        int i10 = length - i5;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, new byte[i5], 0, i5);
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        C8491.m22182(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28719(String str, byte[] bArr, byte[] bArr2, int i) throws C5813 {
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            this.f38775 = 0;
            this.f38776 = str;
            int i2 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
            int i3 = i + 3;
            int i4 = i2 | ((bArr[i + 2] << 8) & 65280);
            int i5 = i + 4;
            int i6 = i4 | (bArr[i3] & 255);
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr, i5, bArr3, 0, i6);
            int i7 = i5 + i6;
            int i8 = ((bArr[i7 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i7] << 24)) | (65280 & (bArr[i7 + 2] << 8));
            int i9 = i8 | (bArr[i7 + 3] & 255);
            byte[] bArr4 = new byte[i9];
            System.arraycopy(bArr, i7 + 4, bArr4, 0, i9);
            byte[] bArrM35628 = new C14904(bArr2).m35628();
            byte[] bArr5 = C8491.f29422;
            try {
                InterfaceC13430 interfaceC13430 = (InterfaceC13430) Class.forName(this.f38778.m9231(new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8))).asSubclass(InterfaceC13430.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC13430.init();
                interfaceC13430.mo32922(bArr3, bArr4);
                interfaceC13430.update(this.f38777);
                boolean zVerify = interfaceC13430.verify(bArr2);
                this.f38778.f11634.m1333().getClass();
                return zVerify;
            } catch (Exception e) {
                throw new C5813(e.toString(), e);
            }
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            this.f38775 = 1;
            this.f38776 = str;
            int i10 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
            int i11 = i + 3;
            int i12 = i10 | ((bArr[i + 2] << 8) & 65280);
            int i13 = i + 4;
            int i14 = i12 | (bArr[i11] & 255);
            byte[] bArr6 = new byte[i14];
            System.arraycopy(bArr, i13, bArr6, 0, i14);
            int i15 = i13 + i14;
            int i16 = ((bArr[i15 + 1] << 16) & 16711680) | ((bArr[i15] << 24) & (-16777216));
            int i17 = i15 + 3;
            int i18 = i16 | ((bArr[i15 + 2] << 8) & 65280);
            int i19 = i15 + 4;
            int i20 = i18 | (bArr[i17] & 255);
            byte[] bArr7 = new byte[i20];
            System.arraycopy(bArr, i19, bArr7, 0, i20);
            int i21 = i19 + i20;
            int i22 = ((bArr[i21 + 1] << 16) & 16711680) | ((bArr[i21] << 24) & (-16777216));
            int i23 = i21 + 3;
            int i24 = i22 | ((bArr[i21 + 2] << 8) & 65280);
            int i25 = i21 + 4;
            int i26 = i24 | (bArr[i23] & 255);
            byte[] bArr8 = new byte[i26];
            System.arraycopy(bArr, i25, bArr8, 0, i26);
            int i27 = i25 + i26;
            int i28 = ((bArr[i27 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i27] << 24)) | (65280 & (bArr[i27 + 2] << 8));
            int i29 = i28 | (bArr[i27 + 3] & 255);
            byte[] bArr9 = new byte[i29];
            System.arraycopy(bArr, i27 + 4, bArr9, 0, i29);
            try {
                InterfaceC5668 interfaceC5668 = (InterfaceC5668) Class.forName(this.f38778.m9231("signature.dss")).asSubclass(InterfaceC5668.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC5668.init();
                interfaceC5668.mo15558(bArr9, bArr6, bArr7, bArr8);
                interfaceC5668.update(this.f38777);
                boolean zVerify2 = interfaceC5668.verify(bArr2);
                this.f38778.f11634.m1333().getClass();
                return zVerify2;
            } catch (Exception e2) {
                throw new C5813(e2.toString(), e2);
            }
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38775 = 3;
            this.f38776 = str;
            int i30 = ((bArr[i + 1] << 16) & 16711680) | ((-16777216) & (bArr[i] << 24)) | (65280 & (bArr[i + 2] << 8));
            int i31 = i30 | (bArr[i + 3] & 255);
            byte[] bArr10 = new byte[i31];
            System.arraycopy(bArr, i + 4, bArr10, 0, i31);
            try {
                InterfaceC1434 interfaceC1434 = (InterfaceC1434) Class.forName(this.f38778.m9231(str)).asSubclass(InterfaceC1434.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC1434.init();
                interfaceC1434.mo5010(bArr10);
                interfaceC1434.update(this.f38777);
                boolean zVerify3 = interfaceC1434.verify(bArr2);
                this.f38778.f11634.m1333().getClass();
                return zVerify3;
            } catch (Exception | LinkageError e3) {
                throw new C5813(e3.toString(), e3);
            }
        }
        this.f38775 = 2;
        this.f38776 = str;
        int i32 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
        int i33 = i + 3;
        int i34 = i32 | ((bArr[i + 2] << 8) & 65280);
        int i35 = i + 4;
        int i36 = i34 | (bArr[i33] & 255);
        System.arraycopy(bArr, i35, new byte[i36], 0, i36);
        int i37 = i35 + i36;
        int i38 = (65280 & (bArr[i37 + 2] << 8)) | (16711680 & (bArr[i37 + 1] << 16)) | ((-16777216) & (bArr[i37] << 24)) | (bArr[i37 + 3] & 255);
        int i39 = i37 + 5;
        int i40 = (i38 - 1) / 2;
        byte[] bArr11 = new byte[i40];
        System.arraycopy(bArr, i39, bArr11, 0, i40);
        byte[] bArr12 = new byte[i40];
        System.arraycopy(bArr, i39 + i40, bArr12, 0, i40);
        try {
            InterfaceC22602 interfaceC22602 = (InterfaceC22602) Class.forName(this.f38778.m9231(str)).asSubclass(InterfaceC22602.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC22602.init();
            interfaceC22602.mo28243(bArr11, bArr12);
            interfaceC22602.update(this.f38777);
            boolean zVerify4 = interfaceC22602.verify(bArr2);
            this.f38778.f11634.m1333().getClass();
            return zVerify4;
        } catch (Exception e4) {
            throw new C5813(e4.toString(), e4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28716(byte[] bArr, boolean z) {
        int i = (bArr[0] & 128) >>> 7;
        int length = bArr.length + i;
        byte[] bArr2 = new byte[length + 4];
        byte[] bArr3 = new byte[i ^ 1];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, i + 4, length - i);
        if (z) {
            C8491.m22182(bArr);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m28717(byte[] bArr, boolean z) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 4];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, 4, length);
        if (z) {
            C8491.m22182(bArr);
        }
        return bArr2;
    }
}
