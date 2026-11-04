package l;

import com.google.android.material.motion.MotionUtils;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.֨ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C0896 extends C24652 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24652 f3326;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9098 f3327;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public SecretKey f3328;

    public C0896(C9098 c9098, C24652 c24652, SecretKey secretKey) {
        this.f3327 = c9098;
        this.f3326 = c24652;
        this.f3328 = secretKey;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo3631() {
        return this.f3326.mo3631();
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo3628() {
        return this.f3326.mo3628();
    }

    @Override // l.C24652, l.InterfaceC7277
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo3627(C7453 c7453) {
        C9098 c9098 = this.f3327;
        C24652 c24652 = this.f3326;
        try {
            ((C18684) c24652.mo3632()).m43469(EnumC12717.SMB2_FLAGS_SIGNED);
            int iM56019 = c7453.m56019();
            c24652.mo3627(c7453);
            int iM560110 = c7453.m56019() - iM56019;
            int i = C9098.f29566;
            SecretKey secretKey = this.f3328;
            C9689 c9689 = c9098.f29567;
            String algorithm = secretKey.getAlgorithm();
            c9689.getClass();
            InterfaceC5216 interfaceC5216M25275 = C9689.m25275(algorithm);
            interfaceC5216M25275.init(secretKey.getEncoded());
            interfaceC5216M25275.update(c7453.m56011(), iM56019, iM560110);
            System.arraycopy(interfaceC5216M25275.mo9696(), 0, c7453.m56011(), iM56019 + 48, 16);
        } catch (C11181 e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC14164 mo3632() {
        return (C18684) this.f3326.mo3632();
    }

    @Override // l.C24652
    public final String toString() {
        return "Signed(" + this.f3326.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24652 mo3630() {
        return this.f3326.mo3630();
    }
}
