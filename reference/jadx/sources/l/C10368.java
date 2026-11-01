package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10368 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f35528;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f35529;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20889 f35530;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 f35531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20951 f35532;

    public C10368(C20889 c20889, AbstractC6839 abstractC6839, List list, C20951 c20951) {
        this.f35530 = c20889;
        this.f35531 = abstractC6839;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f35528 = C0561.unmodifiableList(arrayList);
        this.f35529 = new int[list.size()];
        this.f35532 = c20951;
    }
}
