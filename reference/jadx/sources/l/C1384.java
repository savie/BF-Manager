package l;

import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.֨᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1384 extends EnumC19730 {
    public /* synthetic */ C1384(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("PATCH_MODULE", 17, "--patch-module", "opt.arg.patch", "opt.patch", enumC19024, enumC18318);
    }

    public C1384(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        if (str2.isEmpty()) {
            throw abstractC10558.m26710(C23879.m52614(str));
        }
        if (mo4848().matcher(str2).matches()) {
            String strMo12003 = abstractC10558.mo12003(EnumC19730.f63341);
            if (strMo12003 == null) {
                super.mo2368(abstractC10558, str, str2);
                return;
            }
            String strSubstring = str2.substring(0, str2.indexOf(61));
            if (((Set) C20318.stream(strMo12003.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).map(new C22552()).collect(C1890.toSet())).contains(strSubstring)) {
                C5909 c5909 = C23879.f77204;
                throw abstractC10558.m26710(new C5909("compiler", "repeated.value.for.patch.module", strSubstring));
            }
            super.mo2368(abstractC10558, str, strMo12003 + (char) 0 + str2);
            return;
        }
        throw abstractC10558.m26710(C23879.m52615(str, str2));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m4847(String str) {
        return str.substring(0, str.indexOf(61));
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Pattern mo4848() {
        return Pattern.compile("([^/]+)=(,*[^,].*)");
    }
}
