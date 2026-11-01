package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14672 extends C18199 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35204(String str, String str2) {
        C20296.m45807(str, str2);
        Map mapM29221 = this.f58146;
        if (mapM29221 == null) {
            mapM29221 = C11705.m29221();
            this.f58146 = mapM29221;
        }
        AbstractC14528 abstractC14528 = (AbstractC14528) ((C11705) mapM29221).get(str);
        AbstractC14528 abstractC14529 = abstractC14528;
        if (abstractC14528 == null) {
            int i = AbstractC23844.f77093;
            C20296.m45806(4, "expectedSize");
            C6204 c6204 = new C6204(4);
            c6204.f21090 = new Object[AbstractC23844.m52566(4)];
            Map mapM29222 = this.f58146;
            if (mapM29222 == null) {
                mapM29222 = C11705.m29221();
                this.f58146 = mapM29222;
            }
            ((C11705) mapM29222).put(str, c6204);
            abstractC14529 = c6204;
        }
        abstractC14529.mo13308(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9733 m35203() {
        Map map = this.f58146;
        if (map == null) {
            return C19466.f62678;
        }
        Collection collectionEntrySet = ((C11705) map).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return C19466.f62678;
        }
        C1950<Map.Entry> c1950 = (C1950) collectionEntrySet;
        C13261 c13261 = new C13261(c1950.f7350.size());
        int size = 0;
        for (Map.Entry entry : c1950) {
            Object key = entry.getKey();
            AbstractC23844 abstractC23844CopyOf = AbstractC23844.copyOf((Collection) ((C6204) entry.getValue()).mo14317());
            if (!abstractC23844CopyOf.isEmpty()) {
                c13261.mo32741(key, abstractC23844CopyOf);
                size += abstractC23844CopyOf.size();
            }
        }
        return new C9733(c13261.mo32742(), size);
    }
}
