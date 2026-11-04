package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1VH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20023 extends AbstractC21976 implements InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22261 f64321;

    public C20023(C22261 c22261) {
        this.f64321 = c22261;
    }

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ۙ */
    public final void mo17037(AbstractC0500 abstractC0500) {
        String strM17036;
        String strM35295 = abstractC0500.m35295();
        if (C13923.m33909(strM35295) || (strM17036 = C5853.m17036(abstractC0500)) == null) {
            return;
        }
        C22261 c22261 = this.f64321;
        AbstractC5107 abstractC5107 = C14143.f44726;
        Map map = (Map) c22261.get(abstractC5107);
        if (map == null) {
            map = new HashMap();
            c22261.put(abstractC5107, map);
        }
        String str = (String) map.get(strM17036);
        if (str == null || (C11818.m29667(abstractC0500) instanceof C13310) || strM35295.compareTo(str) < 0) {
            map.put(strM17036, strM35295);
        }
    }
}
