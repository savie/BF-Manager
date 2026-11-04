package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ᩳܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B942 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19186 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return (c12915.m31986("local") || c12915.m31986(b.k)) && c12915.m31981() == 1;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        Main mainM31979 = c12915.m31979();
        InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
        if (interfaceC2386M31989 instanceof AbstractC20042) {
            C0364 c0364 = new C0364(mainM31979);
            C13352 c13352 = (C13352) interfaceC2386M31989;
            c0364.m2131(c13352.mo8100());
            C2166.f7145.getClass();
            c0364.m2132(new C9312(C8153.m22060(interfaceC2386M31989)));
            c0364.m2137("open-ns");
            c0364.m2135(c13352.getPath());
            c0364.m2129();
            c0364.m2130(((C6728) c12915.m31987()).m18804());
            c0364.m2133(c13352.isDirectory());
            c0364.m2136();
            return;
        }
        String[] strArr = interfaceC2386M31989.isDirectory() ? new String[]{"goto", "locate"} : new String[]{"locate", "locate-click", "edit-text", "exec-script", "preview-html"};
        C0364 c0365 = new C0364(mainM31979);
        c0365.m2131(interfaceC2386M31989.mo8100());
        c0365.m2132(new C9312(C13461.f42854.mo3626(interfaceC2386M31989)));
        c0365.m2134(strArr);
        c0365.m2135(interfaceC2386M31989.getPath());
        c0365.m2129();
        c0365.m2136();
    }
}
