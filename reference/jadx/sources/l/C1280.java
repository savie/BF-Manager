package l;

import java.util.Collection;
import java.util.Collections;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.֨ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280 extends AbstractC16941 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f4591;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19179 f4592;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280(C22185 c22185) {
        super(EnumC6282.PATCH_MODULE_PATH, EnumC7687.f25346);
        this.f4591 = c22185;
        this.f4592 = new C19179(c22185);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        this.f55346 = true;
        C19179 c19179 = this.f4592;
        c19179.m44443();
        for (String str2 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            int iIndexOf = str2.indexOf(61);
            C22185 c22185 = this.f4591;
            if (iIndexOf > 0) {
                String strSubstring = str2.substring(0, iIndexOf);
                C8737 c8737 = new C8737(c22185);
                c8737.m23422(str2.substring(iIndexOf + 1));
                c19179.m44444(new C3517(c22185, this, this.f55348.getName() + "[" + strSubstring + "]", strSubstring, c8737, false));
            } else {
                C7312 c7312 = c22185.f71482;
                C11040 c11040 = C22843.f74058;
                c7312.m34525(new C11040("compiler", "locn.invalid.arg.for.xpatch", str));
            }
        }
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo4674() {
        return !this.f4592.m44446();
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Collection mo4675() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4669(Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC16941, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4670(Iterable iterable, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24928 mo4668(String str) {
        return this.f4592.m44442(str);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24928 mo4676(InterfaceC24329 interfaceC24329) {
        return this.f4592.m44448(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable mo4673() {
        return Collections.singleton(this.f4592.m44450());
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        return this.f4592.m44445(interfaceC24329);
    }
}
