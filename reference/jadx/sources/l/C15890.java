package l;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܶۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C15890 extends EnumC7687 {
    public /* synthetic */ C15890(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("MODULE_SOURCE_PATH", 13, "--module-source-path", "opt.arg.mspath", "opt.modulesourcepath", enumC18128, enumC21112);
    }

    public C15890(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (str2.isEmpty()) {
            throw abstractC9923.m25755(C22843.m51546(str));
        }
        final Pattern patternMo10552 = mo10552();
        String strMo12199 = abstractC9923.mo12199(EnumC7687.f25301);
        if (strMo12199 == null) {
            super.mo4242(abstractC9923, str, str2);
            return;
        }
        if (!patternMo10552.matcher(str2).matches()) {
            if (C13847.stream(strMo12199.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).anyMatch(new Predicate() { // from class: l.ܽۛۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C15890.m37870(patternMo10552, (String) obj);
                }
            })) {
                throw abstractC9923.m25755(C22843.f74135);
            }
            super.mo4242(abstractC9923, str, C8008.m21875((char) 0, strMo12199, str2));
        } else {
            final String strSubstring = str2.substring(0, str2.indexOf(61));
            if (C13847.stream(strMo12199.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).filter(new Predicate() { // from class: l.ۧۛۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C15890.m37865(patternMo10552, (String) obj);
                }
            }).map(new C24842()).anyMatch(new Predicate() { // from class: l.ܺۛۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C15890.m37867(strSubstring, (String) obj);
                }
            })) {
                C11040 c11040 = C22843.f74058;
                throw abstractC9923.m25755(new C11040("compiler", "repeated.value.for.module.source.path", strSubstring));
            }
            super.mo4242(abstractC9923, str, C8008.m21875((char) 0, strMo12199, str2));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m37865(Pattern pattern, String str) {
        return pattern.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m37866(String str) {
        return str.substring(0, str.indexOf(61));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m37867(String str, String str2) {
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m37870(Pattern pattern, String str) {
        return !pattern.matcher(str).matches();
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ᩴ */
    public Pattern mo10552() {
        return Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
    }
}
