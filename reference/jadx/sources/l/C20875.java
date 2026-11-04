package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3HU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f66819 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47710(AbstractC12450 abstractC12450, AbstractC12450 abstractC12451, AbstractC12450 abstractC12452) {
        LinkedHashMap linkedHashMap = this.f66819;
        Map linkedHashMap2 = (Map) linkedHashMap.get(abstractC12450);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(abstractC12450, linkedHashMap2);
        } else {
            linkedHashMap2.get(abstractC12451);
        }
        linkedHashMap2.put(abstractC12451, abstractC12452);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m47709(AbstractC12450 abstractC12450, AbstractC12450 abstractC12451) {
        Map map = (Map) this.f66819.get(abstractC12450);
        if (map == null) {
            return null;
        }
        return map.get(abstractC12451);
    }
}
