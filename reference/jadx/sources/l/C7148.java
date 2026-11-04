package l;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7148 extends C20573 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19713(String str, String str2) {
        Object obj;
        C19278.m44624(str, str2);
        Map map = this.f65896;
        Object obj2 = map;
        if (map == null) {
            C15416 c15416 = new C15416();
            c15416.m36916(3);
            this.f65896 = c15416;
            obj2 = c15416;
        }
        AbstractC13924 abstractC13924 = (AbstractC13924) ((C15416) obj2).get(str);
        AbstractC13924 abstractC13925 = abstractC13924;
        if (abstractC13924 == null) {
            int i = AbstractC8639.f28224;
            C19278.m44623(4, "expectedSize");
            C9384 c9384 = new C9384(4);
            c9384.f30462 = new Object[AbstractC8639.m23275(4)];
            Map map2 = this.f65896;
            if (map2 == null) {
                obj = map2;
                C15416 c15417 = new C15416();
                c15417.m36916(3);
                this.f65896 = c15417;
                obj = c15417;
            }
            obj = map2;
            ((C15416) obj).put(str, c9384);
            abstractC13925 = c9384;
        }
        abstractC13925.mo24710(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13859 m19712() {
        Map map = this.f65896;
        if (map == null) {
            return C24368.f79072;
        }
        C15416 c15416 = (C15416) map;
        C4976<Map.Entry> c4976 = new C4976(c15416);
        if (c4976.isEmpty()) {
            return C24368.f79072;
        }
        C25049 c25049 = new C25049(c15416.size());
        int size = 0;
        for (Map.Entry entry : c4976) {
            Object key = entry.getKey();
            AbstractC8639 abstractC8639CopyOf = AbstractC8639.copyOf((Collection) ((C9384) entry.getValue()).mo24709());
            if (!abstractC8639CopyOf.isEmpty()) {
                c25049.mo14569(key, abstractC8639CopyOf);
                size += abstractC8639CopyOf.size();
            }
        }
        return new C13859(c25049.mo14570(), size, null);
    }
}
