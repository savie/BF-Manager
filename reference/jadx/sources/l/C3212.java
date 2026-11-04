package l;

import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۗۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C3212 extends EnumC7687 {
    public /* synthetic */ C3212(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("PATCH_MODULE", 17, "--patch-module", "opt.arg.patch", "opt.patch", enumC18128, enumC21112);
    }

    public C3212(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (str2.isEmpty()) {
            throw abstractC9923.m25755(C22843.m51546(str));
        }
        if (!mo10552().matcher(str2).matches()) {
            throw abstractC9923.m25755(C22843.m51547(str, str2));
        }
        String strMo12199 = abstractC9923.mo12199(EnumC7687.f25346);
        if (strMo12199 == null) {
            super.mo4242(abstractC9923, str, str2);
            return;
        }
        String strSubstring = str2.substring(0, str2.indexOf(61));
        if (((Set) C13847.stream(strMo12199.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).map(new C23350()).collect(C2025.toSet())).contains(strSubstring)) {
            C11040 c11040 = C22843.f74058;
            throw abstractC9923.m25755(new C11040("compiler", "repeated.value.for.patch.module", strSubstring));
        }
        super.mo4242(abstractC9923, str, C8008.m21875((char) 0, strMo12199, str2));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m10550(String str) {
        return str.substring(0, str.indexOf(61));
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Pattern mo10552() {
        return Pattern.compile("([^/]+)=(,*[^,].*)");
    }
}
