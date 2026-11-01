package l;

import java.util.Collection;
import java.util.Collections;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.۠᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8462 extends AbstractC9376 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18339 f29361;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f29362;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8462(C20456 c20456) {
        super(EnumC3584.PATCH_MODULE_PATH, EnumC19730.f63341);
        this.f29362 = c20456;
        this.f29361 = new C18339(c20456);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        this.f31745 = true;
        C18339 c18339 = this.f29361;
        c18339.m42589();
        for (String str2 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            int iIndexOf = str2.indexOf(61);
            C20456 c20456 = this.f29362;
            if (iIndexOf > 0) {
                String strSubstring = str2.substring(0, iIndexOf);
                C10579 c10579 = new C10579(c20456);
                c10579.m26754(str2.substring(iIndexOf + 1));
                c18339.m42590(new C11990(c20456, this, this.f31747.getName() + "[" + strSubstring + "]", strSubstring, c10579, false));
            } else {
                C20414 c20414 = c20456.f66387;
                C5909 c5909 = C23879.f77204;
                c20414.m48197(new C5909("compiler", "locn.invalid.arg.for.xpatch", str));
            }
        }
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo22116() {
        return !this.f29361.m42592();
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC9376, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4919(Iterable iterable, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4290 mo4917(String str) {
        return this.f29361.m42588(str);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo4922(InterfaceC3800 interfaceC3800) {
        return this.f29361.m42594(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo4923() {
        return Collections.singleton(this.f29361.m42587());
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        return this.f29361.m42591(interfaceC3800);
    }
}
