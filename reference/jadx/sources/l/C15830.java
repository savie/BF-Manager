package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܶۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23290 f51496;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C23290 f51497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C23290 f51498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C23290 f51499;

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        C21052 c21052 = new C21052(C4681.unmodifiableMap(map));
        Map map2 = C3898.f13282;
        f51498 = new C23290(c21052, new C21052(map2), new C14338(127));
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        f51496 = new C23290(new C21052(C4681.unmodifiableMap(map3)), new C21052(map2), new C14338(127));
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        new C23290(new C21052(C4681.unmodifiableMap(map4)), new C21052(map2), new C14338(126));
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
        Map map6 = C3898.f13285;
        C21052 c21053 = new C21052(map6);
        Map map7 = C3898.f13283;
        new C23290(c21053, new C21052(map7), new C21052(C4681.unmodifiableMap(map5)), C18068.m42100(127, 132), C18068.m42100(134, 159), new C9117());
        HashMap map8 = new HashMap();
        map8.put(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "");
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", "");
        map8.put("\uffff", "");
        f51497 = new C23290(new C21052(map6), new C21052(map7), new C21052(C4681.unmodifiableMap(map8)), C18068.m42100(1, 8), C18068.m42100(14, 31), C18068.m42100(127, 132), C18068.m42100(134, 159), new C9117());
        C21052 c21054 = new C21052(map6);
        Map map9 = C3898.f13287;
        new C23290(c21054, new C21052(map9));
        new C23290(new C21052(map6), new C21052(map9), new C21052(C3898.f13289));
        new C12101();
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
        new C21052(C4681.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", "");
        f51499 = new C23290(new C18814(), new C0915(), new C21052(C3898.f13286), new C21052(C4681.unmodifiableMap(map11)));
        Map map12 = C3898.f13291;
        C21052 c21055 = new C21052(map12);
        Map map13 = C3898.f13284;
        new C23290(c21055, new C21052(map13), new C7627(new EnumC0169[0]));
        new C23290(new C21052(map12), new C21052(map13), new C21052(C3898.f13288), new C7627(new EnumC0169[0]));
        new C23290(new C21052(map12), new C21052(C3898.f13290), new C7627(new EnumC0169[0]));
        new C6136();
        new C17322();
    }
}
