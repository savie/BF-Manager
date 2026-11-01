package l;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۚ᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5618 extends EnumC19730 {
    public /* synthetic */ C5618(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("MODULE_SOURCE_PATH", 13, "--module-source-path", "opt.arg.mspath", "opt.modulesourcepath", enumC19024, enumC18318);
    }

    public C5618(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        if (str2.isEmpty()) {
            throw abstractC10558.m26710(C23879.m52614(str));
        }
        final Pattern patternMo4848 = mo4848();
        String strMo12003 = abstractC10558.mo12003(EnumC19730.f63354);
        if (strMo12003 == null) {
            super.mo2368(abstractC10558, str, str2);
            return;
        }
        if (patternMo4848.matcher(str2).matches()) {
            final String strSubstring = str2.substring(0, str2.indexOf(61));
            if (C20318.stream(strMo12003.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).filter(new Predicate() { // from class: l.ۙ᩸۟
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C5618.m15500(patternMo4848, (String) obj);
                }
            }).map(new C14086()).anyMatch(new Predicate() { // from class: l.ۨ᩸۟
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C5618.m15501(strSubstring, (String) obj);
                }
            })) {
                C5909 c5909 = C23879.f77204;
                throw abstractC10558.m26710(new C5909("compiler", "repeated.value.for.module.source.path", strSubstring));
            }
            super.mo2368(abstractC10558, str, strMo12003 + (char) 0 + str2);
            return;
        }
        if (C20318.stream(strMo12003.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).anyMatch(new Predicate() { // from class: l.ۖ᩸۟
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C5618.m15496(patternMo4848, (String) obj);
            }
        })) {
            throw abstractC10558.m26710(C23879.f77344);
        }
        super.mo2368(abstractC10558, str, strMo12003 + (char) 0 + str2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m15500(Pattern pattern, String str) {
        return pattern.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m15499(String str) {
        return str.substring(0, str.indexOf(61));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m15501(String str, String str2) {
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m15496(Pattern pattern, String str) {
        return !pattern.matcher(str).matches();
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۚ */
    public Pattern mo4848() {
        return Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
    }
}
