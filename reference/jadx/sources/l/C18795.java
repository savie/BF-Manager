package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ᩳۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18795 extends C24652 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9844 f61033;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24652 f61034;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SecretKey f61035;

    public C18795(C9844 c9844, C24652 c24652, SecretKey secretKey) {
        this.f61033 = c9844;
        this.f61034 = c24652;
        this.f61035 = secretKey;
    }

    @Override // l.C24652, l.InterfaceC7277
    /* JADX INFO: renamed from: ۤ */
    public final void mo3627(C7453 c7453) {
        C24652 c24652 = this.f61034;
        C7453 c7454 = new C7453(c24652.mo3628());
        c24652.mo3627(c7454);
        byte[] bArrM56011 = c7454.m56011();
        int iM56019 = c7454.m56019();
        C9844 c9844 = this.f61033;
        byte[] bArrM25637 = c9844.m25637();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrM25637, 0, bArrM25637.length);
        C10479 c10479 = new C10479(((C18684) c24652.mo3632()).m43461(), iM56019, bArrM25637);
        byte[] bArrM25631 = C9844.m25631(c10479);
        try {
            C9689 c9689 = c9844.f31685;
            String strM34491 = c9844.f31684.m34491();
            c9689.getClass();
            InterfaceC2758 interfaceC2758M7620 = C2233.m7620(strM34491);
            interfaceC2758M7620.mo9103(EnumC8724.ENCRYPT, this.f61035.getEncoded(), gCMParameterSpec);
            interfaceC2758M7620.mo9104(bArrM25631);
            byte[] bArrMo9105 = interfaceC2758M7620.mo9105(iM56019, bArrM56011);
            if (bArrMo9105.length != iM56019 + 16) {
                throw new IllegalStateException("Invalid length for cipherText after encryption.");
            }
            byte[] bArrM26903 = c10479.m26903();
            System.arraycopy(bArrMo9105, iM56019, bArrM26903, 0, bArrM26903.length);
            c10479.m26908(c7453);
            c7453.m56007(iM56019, bArrMo9105);
        } catch (C11181 e) {
            C9844.f31683.mo13698(c24652.mo3632(), "Security exception while encrypting packet << {} >>");
            throw new C12082(e);
        }
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC14164 mo3632() {
        return (C18684) this.f61034.mo3632();
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩴ */
    public final int mo3631() {
        return this.f61034.mo3631();
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ۤ */
    public final int mo3628() {
        return this.f61034.mo3628() + 52;
    }

    @Override // l.C24652
    public final String toString() {
        return "Encrypted[" + this.f61034.toString() + "]";
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ܳ */
    public final C24652 mo3630() {
        return this.f61034.mo3630();
    }
}
