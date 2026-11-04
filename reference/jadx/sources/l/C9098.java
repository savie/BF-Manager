package l;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۡۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9098 implements InterfaceC15568 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f29565 = C16980.m40037(C9098.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29566 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9689 f29567;

    public C9098(C9689 c9689) {
        this.f29567 = c9689;
    }

    @Override // l.InterfaceC15568
    /* JADX INFO: renamed from: ۙ */
    public final C24652 mo15939(C24652 c24652, SecretKey secretKey) {
        if (secretKey != null) {
            return new C0896(this, c24652, secretKey);
        }
        f29565.mo13716(((C18684) c24652.mo3632()).m43462(), "Not wrapping {} as signed, as no key is set.");
        return c24652;
    }
}
