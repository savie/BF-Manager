package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۨ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11985 extends AbstractC16146 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3782 f38619;

    public C11985(AbstractC3782 abstractC3782) {
        this.f38619 = abstractC3782;
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1770(C14018 c14018, Object obj) {
        Locale locale = (Locale) obj;
        AbstractC3782 abstractC3782 = this.f38619;
        if (!abstractC3782.f12956.contains(c14018)) {
            abstractC3782.f12956 = abstractC3782.f12956.m35546(c14018);
        }
        return super.m38325(c14018, locale);
    }

    @Override // l.AbstractC16146
    /* JADX INFO: renamed from: ۙ */
    public final String mo13132(Locale locale, String str, Object... objArr) {
        return this.f38619.mo12282(locale, str, objArr);
    }

    @Override // l.AbstractC16146
    /* JADX INFO: renamed from: ۙ */
    public final String mo13136(C14018 c14018) {
        return "" + (this.f38619.f12956.indexOf(c14018) + 1);
    }
}
