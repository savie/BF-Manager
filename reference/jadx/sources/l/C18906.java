package l;

/* JADX INFO: renamed from: l.ᩴܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98WG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18906 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43571(InterfaceC21022 interfaceC21022) {
        String str = ((AbstractC0560) interfaceC21022).f2341;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) interfaceC21022.attributes().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return EnumC6895.f23212;
        }
        return null;
    }
}
