package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20924 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f66941;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20638 f66942;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6754 f66943;

    public C20924(C6754 c6754, Iterator it, AbstractC20638 abstractC20638) {
        this.f66941 = it;
        this.f66942 = abstractC20638;
        this.f66943 = c6754;
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Iterator it = this.f66941;
        if (!it.hasNext()) {
            m14148();
            return null;
        }
        C2346 c2346 = (C2346) it.next();
        if (!this.f66942.mo11449((Comparable) c2346.f7568)) {
            C2346 c2346M7923 = c2346.m7923(this.f66943.f22479);
            return new AbstractMap.SimpleImmutableEntry(c2346M7923.f7568, c2346M7923);
        }
        m14148();
        return null;
    }
}
