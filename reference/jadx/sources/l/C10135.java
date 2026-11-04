package l;

/* JADX INFO: renamed from: l.ۢ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 98WG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10135 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26147(InterfaceC13864 interfaceC13864) {
        String str = ((AbstractC10663) interfaceC13864).f33823;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) interfaceC13864.attributes().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return EnumC25067.f81077;
        }
        return null;
    }
}
