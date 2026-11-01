package l;

/* JADX INFO: renamed from: l.ܳ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14523 {
    SHORT(new C22979()),
    LONG(new C19028()),
    VERBOSE(new C18917());


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3232 f47567;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m34958(EnumC15934 enumC15934, String str, String str2) {
        return str2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m34961(EnumC15934 enumC15934, String str, String str2) {
        return C1679.m5594(enumC15934.m37892(), ": ", str2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m34964(EnumC15934 enumC15934, String str, String str2) {
        return enumC15934 == EnumC15934.INFO ? str2 : String.format("%-7s-%6s: %s", str, enumC15934.m37893(), str2);
    }

    EnumC14523(InterfaceC3232 interfaceC3232) {
        this.f47567 = interfaceC3232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m34966(EnumC15934 enumC15934, String str, String str2, Object... objArr) {
        return (str2 == null || str == null) ? "" : this.f47567.mo9687(enumC15934, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m34965(String str, C1821 c1821) {
        return c1821.m5924() ? "" : this.f47567.mo9687(c1821.m5923(), str, c1821.m5922());
    }
}
