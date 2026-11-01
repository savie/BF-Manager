package l;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15037 implements InterfaceC7359, InterfaceC11955, InterfaceC15954 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49025;

    public /* synthetic */ C15037(int i) {
        this.f49025 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36023(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Map m36024() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-Content-Type-Options", "nosniff"), new AbstractMap.SimpleEntry("Cache-Control", "private, max-age=31536000")};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C13638.requireNonNull(key);
            Object value = entry.getValue();
            C13638.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C9023.m23354(key, "duplicate key: "));
            }
        }
        return C0561.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36025(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        switch (this.f49025) {
            case 0:
                int i = ActivityC5677.f19358;
                ((Throwable) obj).getClass();
                return null;
            case 6:
                return Integer.valueOf(((C17216) obj).f54866);
            case 8:
                int i2 = C20346.f65889;
                return null;
            default:
                InterfaceC14749 interfaceC14749 = (InterfaceC14749) obj;
                return C7908.m20922((int) interfaceC14749.getLineNumber(), (int) interfaceC14749.getColumnNumber(), interfaceC14749.mo29758(Locale.ENGLISH));
        }
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
