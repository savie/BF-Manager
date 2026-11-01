package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۘۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3874 extends AbstractC9771 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15165 f14482;

    public C3874(AbstractC15165 abstractC15165) {
        this.f14482 = abstractC15165;
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11014(C20771 c20771, Object obj) {
        Locale locale = (Locale) obj;
        AbstractC15165 abstractC15165 = this.f14482;
        if (!abstractC15165.f49525.contains(c20771)) {
            abstractC15165.f49525 = abstractC15165.f49525.m48591(c20771);
        }
        return super.m24880(c20771, locale);
    }

    @Override // l.AbstractC9771
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo11218(Locale locale, String str, Object... objArr) {
        return this.f14482.mo15110(locale, str, objArr);
    }

    @Override // l.AbstractC9771
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo11219(C20771 c20771) {
        return "" + (this.f14482.f49525.indexOf(c20771) + 1);
    }
}
