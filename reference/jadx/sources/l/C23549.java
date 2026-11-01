package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes.dex */
public final class C23549 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16576 f76265 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet f76266;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f76267;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8815 f76268;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23549 m51906(C12343 c12343) {
        C23549 c23549 = (C23549) c12343.m30656(f76265);
        return c23549 == null ? new C23549(c12343) : c23549;
    }

    public C23549(C12343 c12343) {
        C22531 c22531M50048 = C22531.m50048(c12343);
        this.f76267 = "compiler";
        this.f76268 = new C8815(c22531M50048, new C19398());
        EnumSet enumSetOf = EnumSet.of(EnumC0264.MANDATORY);
        this.f76266 = enumSetOf;
        c12343.m30659(f76265, this);
        final C14770 c14770M35395 = C14770.m35395(c12343);
        if (c14770M35395.m35407("onlySyntaxErrorsUnrecoverable")) {
            enumSetOf.add(EnumC0264.RECOVERABLE);
        }
        c14770M35395.m35400(new Runnable() { // from class: l.ۧ۟۟
            @Override // java.lang.Runnable
            public final void run() {
                if (c14770M35395.m35407("onlySyntaxErrorsUnrecoverable")) {
                    this.f36923.f76266.add(EnumC0264.RECOVERABLE);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m51908(EnumC0264 enumC0264, C22137 c22137, InterfaceC12260 interfaceC12260, C5909 c5909) {
        C11948 c11948M51909 = m51909((EnumC0597) null, EnumSet.copyOf((Collection) this.f76266), c22137, interfaceC12260, c5909);
        if (enumC0264 != null) {
            c11948M51909.m29766(enumC0264);
        }
        return c11948M51909;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m51910(C14377 c14377) {
        return m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), (C22137) null, (InterfaceC12260) null, c14377);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m51912(EnumC17198 enumC17198, C22137 c22137, InterfaceC12260 interfaceC12260, String str, Object... objArr) {
        return m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, interfaceC12260, AbstractC16493.m38767(enumC17198, this.f76267, str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m51911(EnumC17198 enumC17198, EnumSet enumSet, C22137 c22137, InterfaceC12260 interfaceC12260, Object... objArr) {
        return m51909((EnumC0597) null, enumSet, c22137, interfaceC12260, AbstractC16493.m38767(enumC17198, this.f76267, "cant.apply.symbols", objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11948 m51909(EnumC0597 enumC0597, Set set, C22137 c22137, InterfaceC12260 interfaceC12260, AbstractC16493 abstractC16493) {
        return new C11948(this.f76268, AbstractC16493.m38767(abstractC16493.f52996, abstractC16493.f52998, abstractC16493.f52999, C11397.of(abstractC16493.f52997).map(new C21289(1, this)).toArray()), enumC0597, set, c22137, interfaceC12260);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5909 m51907(String str, Object... objArr) {
        return (C5909) AbstractC16493.m38767(EnumC17198.ERROR, this.f76267, str, objArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9438 m51913(String str, Object... objArr) {
        return (C9438) AbstractC16493.m38767(EnumC17198.NOTE, this.f76267, str, objArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11948 m51914(String str, Object... objArr) {
        return m51910((C14377) AbstractC16493.m38767(EnumC17198.FRAGMENT, this.f76267, str, objArr));
    }
}
