package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15649 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return AbstractC13116.m32469().mo4145((C0913) Collections.max(list, new C5147()), (C0913) Collections.max(list2, new C5147()), new C5147()).mo4143(list.size(), list2.size()).mo4145((C0913) Collections.max(list, new C22081()), (C0913) Collections.max(list2, new C22081()), new C22081()).mo4142();
    }
}
