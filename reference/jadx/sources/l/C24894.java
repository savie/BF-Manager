package l;

import java.util.HashMap;
import org.bouncycastle.crypto.generators.SCrypt;

/* JADX INFO: renamed from: l.᩻۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7W8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24894 implements InterfaceC3570 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f80546;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f80547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f80548;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f80549;

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11616(byte[] bArr) throws C2079 {
        throw new C2079("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11615(HashMap map) throws C2079 {
        throw new C2079("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11618(byte[] bArr) throws C2079 {
        try {
            C8266 c8266 = new C8266(bArr);
            if (!c8266.m22305()) {
                throw new C6775();
            }
            C8266[] c8266ArrM22313 = c8266.m22313();
            if (c8266ArrM22313.length < 4 || c8266ArrM22313.length > 5) {
                throw new C6775();
            }
            if (!c8266ArrM22313[0].m22308()) {
                throw new C6775();
            }
            if (!c8266ArrM22313[1].m22311()) {
                throw new C6775();
            }
            if (!c8266ArrM22313[2].m22311()) {
                throw new C6775();
            }
            if (!c8266ArrM22313[3].m22311()) {
                throw new C6775();
            }
            if (c8266ArrM22313.length > 4 && !c8266ArrM22313[4].m22311()) {
                throw new C6775();
            }
            this.f80549 = c8266ArrM22313[0].m22307();
            this.f80548 = C8266.m22303(c8266ArrM22313[1].m22307());
            this.f80546 = C8266.m22303(c8266ArrM22313[2].m22307());
            this.f80547 = C8266.m22303(c8266ArrM22313[3].m22307());
        } catch (Exception | LinkageError e) {
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            if (!(e instanceof C6775) && !(e instanceof ArithmeticException)) {
                throw new C2079("scrypt unavailable", e);
            }
            throw new C2079("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo11617(int i, byte[] bArr) {
        return SCrypt.generate(bArr, this.f80549, this.f80548, this.f80546, this.f80547, i);
    }
}
