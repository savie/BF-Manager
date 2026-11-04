package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13402 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return AbstractC25114.m55993().mo6827((C8182) Collections.max(list, new C18623()), (C8182) Collections.max(list2, new C18623()), new C18623()).mo6825(list.size(), list2.size()).mo6827((C8182) Collections.max(list, new C0724()), (C8182) Collections.max(list2, new C0724()), new C0724()).mo6824();
    }
}
