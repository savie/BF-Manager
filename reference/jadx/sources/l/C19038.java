package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19038 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f61662;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f61663;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f61664;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f61665;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61666;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14562 f61667;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map f61668;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f61669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f61670;

    public C19038(C10087 c10087) {
        this.f61667 = c10087.f32333;
        Map map = c10087.f32332;
        int i = C9341.f30354;
        this.f61669 = C4681.unmodifiableMap(new HashMap(map));
        this.f61663 = C4681.unmodifiableMap(new HashMap(c10087.f32329));
        this.f61664 = C4681.unmodifiableMap(new HashMap(c10087.f32331));
        Map mapUnmodifiableMap = C4681.unmodifiableMap(new HashMap(c10087.f32330));
        this.f61668 = mapUnmodifiableMap;
        ArrayList<C16800> arrayList = new ArrayList(mapUnmodifiableMap.values());
        C12884.sort(arrayList, C2661.comparing(new C6360(0)));
        this.f61665 = C4681.unmodifiableList(arrayList);
        HashMap map2 = new HashMap();
        for (C16800 c16800 : arrayList) {
            Iterator it = c16800.m39687().iterator();
            while (it.hasNext()) {
                C11392.putIfAbsent(map2, ((String) it.next()).toLowerCase(Locale.ROOT), c16800);
            }
        }
        this.f61670 = C4681.unmodifiableMap(new HashMap(map2));
        Collection<C16800> collectionValues = this.f61669.values();
        ArrayList arrayList2 = new ArrayList(arrayList.size() + collectionValues.size() + 1);
        for (C16800 c16801 : collectionValues) {
            if (!c16801.m39686()) {
                arrayList2.add(c16801.m39683());
            }
        }
        for (C16800 c16802 : arrayList) {
            if (!c16802.m39686()) {
                arrayList2.add(c16802.m39683());
            }
        }
        Collections.sort(arrayList2);
        arrayList2.add(0, "Text");
        arrayList2.trimToSize();
        this.f61662 = C4681.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16800 m44133(C19038 c19038, String str) {
        C16800 c16800 = (C16800) c19038.f61668.get(str);
        return c16800 != null ? c16800 : (C16800) c19038.f61669.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16800 m44125(C19038 c19038, String str) {
        C16800 c16800 = (C16800) c19038.f61670.get(str);
        return c16800 != null ? c16800 : (C16800) c19038.f61663.get(str);
    }
}
