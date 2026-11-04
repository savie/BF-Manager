package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7V8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0587 extends AbstractC6554 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f2353;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f2354;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract String mo2671();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract String mo2672();

    public AbstractC0587(C22962 c22962, byte[] bArr, byte[] bArr2) {
        super(c22962);
        this.f2353 = bArr;
        this.f2354 = bArr2;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo2670(byte[] bArr) {
        int i = this.f22011;
        C22962 c22962 = this.f22008;
        if (i == 2 || i == 5) {
            C9866 c9866 = new C9866(bArr);
            c9866.m25659(bArr.length);
            try {
                this.f2354 = c9866.m25656(1, "")[0];
                return true;
            } catch (C2079 unused) {
                c22962.getClass();
                C19978.f64189.getClass();
                return false;
            }
        }
        if (i == 4) {
            try {
                C9866 c9867 = new C9866(bArr);
                if (c9867.m25658() != c9867.m25658()) {
                    throw new C2079("check failed");
                }
                C9011.m24051(c9867.m25649());
                this.f2353 = c9867.m25649();
                this.f2354 = Arrays.copyOf(c9867.m25649(), mo18459());
                byte[] bArrM25649 = c9867.m25649();
                this.f22003 = new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                return true;
            } catch (Exception unused2) {
                c22962.getClass();
                C19978.f64189.getClass();
                return false;
            }
        }
        if (i != 3) {
            c22962.getClass();
            C19978.f64189.getClass();
            return false;
        }
        try {
            InterfaceC8045 interfaceC8045 = (InterfaceC8045) Class.forName(C19978.m45892("keypairgen_fromprivate.eddsa")).asSubclass(InterfaceC8045.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC8045.mo21932(mo2672(), bArr);
            this.f2353 = interfaceC8045.mo21933();
            this.f2354 = interfaceC8045.mo21934();
            return true;
        } catch (Exception | LinkageError unused3) {
            c22962.getClass();
            C19978.f64189.getClass();
            return false;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] mo2673() {
        byte[] bArrMo2673 = super.mo2673();
        if (bArrMo2673 != null) {
            return bArrMo2673;
        }
        if (this.f2353 == null) {
            return null;
        }
        return C9866.m25648(new byte[][]{mo2676(), this.f2353}).f31750;
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] mo2676() {
        String strMo2671 = mo2671();
        byte[] bArr = C9011.f29358;
        return strMo2671.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] mo2675(byte[] bArr) {
        return mo2669(mo2671(), bArr);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo2669(String str, byte[] bArr) {
        try {
            InterfaceC3791 interfaceC3791 = (InterfaceC3791) Class.forName(C19978.m45892(str)).asSubclass(InterfaceC3791.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC3791.init();
            interfaceC3791.mo10656(this.f2354);
            interfaceC3791.update(bArr);
            byte[] bArrSign = interfaceC3791.sign();
            byte[] bArr2 = C9011.f29358;
            return C9866.m25648(new byte[][]{str.getBytes(StandardCharsets.UTF_8), bArrSign}).f31750;
        } catch (Exception | LinkageError unused) {
            this.f22008.getClass();
            C19978.f64189.getClass();
            return null;
        }
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2668() {
        C9011.m24062(this.f2354);
    }

    @Override // l.AbstractC6554
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] mo2674() throws C2079 {
        if (this.f22004) {
            throw new C2079("key is encrypted.");
        }
        C9866 c9866 = new C9866();
        c9866.m25673(mo2676());
        c9866.m25673(this.f2353);
        byte[] bArr = this.f2354;
        int length = bArr.length + this.f2353.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f2353;
        System.arraycopy(bArr3, 0, bArr2, this.f2354.length, bArr3.length);
        c9866.m25660(0, length, bArr2);
        c9866.m25673(C9011.m24055(this.f22003, StandardCharsets.UTF_8));
        int iM25672 = c9866.m25672();
        byte[] bArr4 = new byte[iM25672];
        c9866.m25653(0, iM25672, bArr4);
        return bArr4;
    }
}
