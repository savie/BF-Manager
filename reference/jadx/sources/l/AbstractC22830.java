package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7V8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22830 extends AbstractC2367 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f74279;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f74280;

    /* JADX INFO: renamed from: ֨ */
    public abstract String mo11022();

    /* JADX INFO: renamed from: ᩹ */
    public abstract String mo11023();

    public AbstractC22830(C19925 c19925, byte[] bArr, byte[] bArr2) {
        super(c19925);
        this.f74279 = bArr;
        this.f74280 = bArr2;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo7210(byte[] bArr) {
        int i = this.f8371;
        C19925 c19925 = this.f8365;
        if (i == 2 || i == 5) {
            C14904 c14904 = new C14904(bArr);
            c14904.m35639(bArr.length);
            try {
                this.f74280 = c14904.m35635(1, "")[0];
                return true;
            } catch (C5813 unused) {
                c19925.getClass();
                C0168.f1257.getClass();
                return false;
            }
        }
        if (i == 4) {
            try {
                C14904 c14905 = new C14904(bArr);
                if (c14905.m35638() != c14905.m35638()) {
                    throw new C5813("check failed");
                }
                C8491.m22171(c14905.m35628());
                this.f74279 = c14905.m35628();
                this.f74280 = Arrays.copyOf(c14905.m35628(), mo7209());
                byte[] bArrM35628 = c14905.m35628();
                this.f8368 = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                return true;
            } catch (Exception unused2) {
                c19925.getClass();
                C0168.f1257.getClass();
                return false;
            }
        }
        if (i != 3) {
            c19925.getClass();
            C0168.f1257.getClass();
            return false;
        }
        try {
            InterfaceC15069 interfaceC15069 = (InterfaceC15069) Class.forName(C0168.m1327("keypairgen_fromprivate.eddsa")).asSubclass(InterfaceC15069.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC15069.mo36098(mo11023(), bArr);
            this.f74279 = interfaceC15069.mo36099();
            this.f74280 = interfaceC15069.mo36100();
            return true;
        } catch (Exception | LinkageError unused3) {
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
        if (this.f74279 == null) {
            return null;
        }
        return C14904.m35624(new byte[][]{mo7202(), this.f74279}).f48679;
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo7202() {
        String strMo11022 = mo11022();
        byte[] bArr = C8491.f29422;
        return strMo11022.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7212(byte[] bArr) {
        return mo7206(mo11022(), bArr);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo7206(String str, byte[] bArr) {
        try {
            InterfaceC1434 interfaceC1434 = (InterfaceC1434) Class.forName(C0168.m1327(str)).asSubclass(InterfaceC1434.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC1434.init();
            interfaceC1434.mo5009(this.f74280);
            interfaceC1434.update(bArr);
            byte[] bArrSign = interfaceC1434.sign();
            byte[] bArr2 = C8491.f29422;
            return C14904.m35624(new byte[][]{str.getBytes(StandardCharsets.UTF_8), bArrSign}).f48679;
        } catch (Exception | LinkageError unused) {
            this.f8365.getClass();
            C0168.f1257.getClass();
            return null;
        }
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ۙ */
    public final void mo7203() {
        C8491.m22182(this.f74280);
    }

    @Override // l.AbstractC2367
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo7211() throws C5813 {
        if (this.f8367) {
            throw new C5813("key is encrypted.");
        }
        C14904 c14904 = new C14904();
        c14904.m35627(mo7202());
        c14904.m35627(this.f74279);
        byte[] bArr = this.f74280;
        int length = bArr.length + this.f74279.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f74279;
        System.arraycopy(bArr3, 0, bArr2, this.f74280.length, bArr3.length);
        c14904.m35640(0, length, bArr2);
        c14904.m35627(C8491.m22175(this.f8368, StandardCharsets.UTF_8));
        int iM35626 = c14904.m35626();
        byte[] bArr4 = new byte[iM35626];
        c14904.m35632(0, iM35626, bArr4);
        return bArr4;
    }
}
