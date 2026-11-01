package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A3HU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f44770 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33183(AbstractC11729 abstractC11729, AbstractC11729 abstractC117210, AbstractC11729 abstractC117211) {
        LinkedHashMap linkedHashMap = this.f44770;
        Map linkedHashMap2 = (Map) linkedHashMap.get(abstractC11729);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(abstractC11729, linkedHashMap2);
        } else {
            linkedHashMap2.get(abstractC117210);
        }
        linkedHashMap2.put(abstractC117210, abstractC117211);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m33182(AbstractC11729 abstractC11729, AbstractC11729 abstractC117210) {
        Map map = (Map) this.f44770.get(abstractC11729);
        if (map == null) {
            return null;
        }
        return map.get(abstractC117210);
    }
}
