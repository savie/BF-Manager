package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C22899 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f74384;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 f74385;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16800 f74386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15439 f74387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f74388;

    public C22899(C16800 c16800, AbstractC2805 abstractC2805, List list, C15439 c15439) {
        this.f74386 = c16800;
        this.f74385 = abstractC2805;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f74388 = C4681.unmodifiableList(arrayList);
        this.f74384 = new int[list.size()];
        this.f74387 = c15439;
    }
}
