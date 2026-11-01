package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۧᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11168 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C23868 f37846;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23868 f37847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C23868 f37848;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C23868 f37849;

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        C2721 c2721 = new C2721(C0561.unmodifiableMap(map));
        Map map2 = C14012.f46044;
        f37849 = new C23868(c2721, new C2721(map2), new C11895());
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        f37847 = new C23868(new C2721(C0561.unmodifiableMap(map3)), new C2721(map2), new C11895());
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        new C23868(new C2721(C0561.unmodifiableMap(map4)), new C2721(map2), new C11895());
        HashMap map5 = new HashMap();
        map5.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map5.put("\u0001", "");
        map5.put("\u0002", "");
        map5.put("\u0003", "");
        map5.put("\u0004", "");
        map5.put("\u0005", "");
        map5.put("\u0006", "");
        map5.put("\u0007", "");
        map5.put("\b", "");
        map5.put("\u000b", "");
        map5.put("\f", "");
        map5.put("\u000e", "");
        map5.put("\u000f", "");
        map5.put("\u0010", "");
        map5.put("\u0011", "");
        map5.put("\u0012", "");
        map5.put("\u0013", "");
        map5.put("\u0014", "");
        map5.put("\u0015", "");
        map5.put("\u0016", "");
        map5.put("\u0017", "");
        map5.put("\u0018", "");
        map5.put("\u0019", "");
        map5.put("\u001a", "");
        map5.put("\u001b", "");
        map5.put("\u001c", "");
        map5.put("\u001d", "");
        map5.put("\u001e", "");
        map5.put("\u001f", "");
        map5.put("\ufffe", "");
        map5.put("\uffff", "");
        Map map6 = C14012.f46048;
        C2721 c2722 = new C2721(map6);
        Map map7 = C14012.f46045;
        new C23868(c2722, new C2721(map7), new C2721(C0561.unmodifiableMap(map5)), C5544.m15282(127, 132), C5544.m15282(134, 159), new C23184());
        HashMap map8 = new HashMap();
        map8.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", "");
        map8.put("\uffff", "");
        f37848 = new C23868(new C2721(map6), new C2721(map7), new C2721(C0561.unmodifiableMap(map8)), C5544.m15282(1, 8), C5544.m15282(14, 31), C5544.m15282(127, 132), C5544.m15282(134, 159), new C23184());
        C2721 c2723 = new C2721(map6);
        Map map9 = C14012.f46042;
        new C23868(c2723, new C2721(map9));
        new C23868(new C2721(map6), new C2721(map9), new C2721(C14012.f46046));
        new C9757();
        HashMap map10 = new HashMap();
        map10.put("|", "\\|");
        map10.put(a.p, "\\&");
        map10.put(l.b, "\\;");
        map10.put("<", "\\<");
        map10.put(">", "\\>");
        map10.put(MotionUtils.EASING_TYPE_FORMAT_START, "\\(");
        map10.put(MotionUtils.EASING_TYPE_FORMAT_END, "\\)");
        map10.put("$", "\\$");
        map10.put("`", "\\`");
        map10.put("\\", "\\\\");
        map10.put("\"", "\\\"");
        map10.put("'", "\\'");
        map10.put(" ", "\\ ");
        map10.put("\t", "\\\t");
        map10.put("\r\n", "");
        map10.put("\n", "");
        map10.put("*", "\\*");
        map10.put("?", "\\?");
        map10.put("[", "\\[");
        map10.put("#", "\\#");
        map10.put("~", "\\~");
        map10.put("=", "\\=");
        map10.put("%", "\\%");
        new C2721(C0561.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", "");
        C13306 c13306 = new C13306();
        C6955 c6955 = new C6955();
        Map map12 = C14012.f46047;
        f37846 = new C23868(c13306, c6955, new C2721(map12), new C2721(C0561.unmodifiableMap(map11)));
        new C23868(new C13306(), new C6955(), new C2721(map12));
        Map map13 = C14012.f46043;
        C2721 c2724 = new C2721(map13);
        Map map14 = C14012.f46049;
        new C23868(c2724, new C2721(map14), new C1310(new EnumC22478[0]));
        new C23868(new C2721(map13), new C2721(map14), new C2721(C14012.f46051), new C1310(new EnumC22478[0]));
        new C23868(new C2721(map13), new C2721(C14012.f46050), new C1310(new EnumC22478[0]));
        new C3405();
        new C6228();
    }
}
