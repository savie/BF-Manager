package l;

import java.util.HashMap;
import org.bouncycastle.crypto.generators.SCrypt;

/* JADX INFO: renamed from: l.ܳ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14841 implements InterfaceC4484 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f48488;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48489;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48491;

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final void mo12511(byte[] bArr) throws C5813 {
        throw new C5813("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final void mo12510(HashMap map) throws C5813 {
        throw new C5813("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ܰ */
    public final void mo12513(byte[] bArr) throws C5813 {
        try {
            C9197 c9197 = new C9197(bArr);
            if (!c9197.m23650()) {
                throw new C10608();
            }
            C9197[] c9197ArrM23656 = c9197.m23656();
            if (c9197ArrM23656.length < 4 || c9197ArrM23656.length > 5) {
                throw new C10608();
            }
            if (!c9197ArrM23656[0].m23655()) {
                throw new C10608();
            }
            if (!c9197ArrM23656[1].m23657()) {
                throw new C10608();
            }
            if (!c9197ArrM23656[2].m23657()) {
                throw new C10608();
            }
            if (!c9197ArrM23656[3].m23657()) {
                throw new C10608();
            }
            if (c9197ArrM23656.length > 4 && !c9197ArrM23656[4].m23657()) {
                throw new C10608();
            }
            this.f48488 = c9197ArrM23656[0].m23652();
            this.f48491 = C9197.m23646(c9197ArrM23656[1].m23652());
            this.f48489 = C9197.m23646(c9197ArrM23656[2].m23652());
            this.f48490 = C9197.m23646(c9197ArrM23656[3].m23652());
        } catch (Exception | LinkageError e) {
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
            if (!(e instanceof C10608) && !(e instanceof ArithmeticException)) {
                throw new C5813("scrypt unavailable", e);
            }
            throw new C5813("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC4484
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo12512(int i, byte[] bArr) {
        return SCrypt.generate(bArr, this.f48488, this.f48491, this.f48489, this.f48490, i);
    }
}
