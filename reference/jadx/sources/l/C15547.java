package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1U0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15547 implements InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22261 f50569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5853 f50570;

    public C15547(C22261 c22261, C8398 c8398, C5853 c5853) {
        this.f50569 = c22261;
        this.f50570 = c5853;
    }

    @Override // l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6610(C21383 c21383, C18399 c18399) {
        m37236(c21383, c18399, true);
    }

    @Override // l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ */
    public final void mo6609(C21383 c21383, C7958 c7958) {
        if (C13923.m33909(c7958.m35295())) {
            return;
        }
        m37236(c21383, c7958, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37236(C21383 c21383, AbstractC0500 abstractC0500, boolean z) {
        String strM42088;
        String string;
        String strM35295 = abstractC0500.m35295();
        C22261 c22261 = this.f50569;
        AbstractC5107 abstractC5107 = C14143.f44726;
        Map map = (Map) c22261.get(abstractC5107);
        if (map == null) {
            map = new HashMap();
            c22261.put(abstractC5107, map);
        }
        String strM17036 = C5853.m17036(abstractC0500);
        String str = (String) map.get(strM17036);
        if (str == null || strM35295.equals(str)) {
            return;
        }
        if (C11818.m29667(abstractC0500) instanceof C13310) {
            AbstractC5107 abstractC5107M35293 = abstractC0500.m35293();
            StringBuilder sb = new StringBuilder("Warning: ");
            sb.append(c21383.m13516().replace('/', '.'));
            if (z) {
                StringBuilder sb2 = new StringBuilder(": field '");
                sb2.append("" + C13923.m33908(abstractC5107M35293.mo15452()) + ' ' + strM35295);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(": method '");
                String strM13516 = c21383.m13516();
                String strMo15452 = abstractC5107M35293.mo15452();
                StringBuilder sb4 = new StringBuilder("");
                if (strM35295.equals("<init>")) {
                    strM42088 = C18063.m42088(46, 1, strM13516.replace('/', '.'));
                } else {
                    strM42088 = C13923.m33908(strMo15452.substring(strMo15452.indexOf(41) + 1)) + ' ' + strM35295;
                }
                sb4.append(strM42088);
                sb4.append('(');
                sb4.append(C13923.m33906(strMo15452));
                sb4.append(')');
                sb3.append(sb4.toString());
                string = sb3.toString();
            }
            C4794.m14774(sb, string, "' can't be mapped to '", strM17036, "' because it would conflict with ");
            C4794.m14774(sb, z ? "field '" : "method '", str, "', which is already being mapped to '", strM17036);
            sb.append("'");
        }
        C11818.m29667(abstractC0500).mo13503(null);
        abstractC0500.mo21663(c21383, this.f50570);
    }
}
