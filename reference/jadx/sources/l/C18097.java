package l;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ᩳܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18097 implements InterfaceC0458 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f57863 = C13488.m32997(C18097.class);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57864 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21356 f57865;

    public C18097(C21356 c21356) {
        this.f57865 = c21356;
    }

    @Override // l.InterfaceC0458
    /* JADX INFO: renamed from: ۙ */
    public final C11771 mo2283(C11771 c11771, SecretKey secretKey) {
        if (secretKey != null) {
            return new C21625(this, c11771, secretKey);
        }
        f57863.mo12126(((C1186) c11771.mo25478()).m4325(), "Not wrapping {} as signed, as no key is set.");
        return c11771;
    }
}
