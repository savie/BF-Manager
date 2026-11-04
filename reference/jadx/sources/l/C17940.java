package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17940 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f58774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23908 f58775;

    public C17940(C23908 c23908, Iterator it) {
        this.f58774 = it;
        this.f58775 = c23908;
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Iterator it = this.f58774;
        if (!it.hasNext()) {
            m14148();
            return null;
        }
        C2346 c2346 = (C2346) it.next();
        if (this.f58775.f77415.f7569.mo11449((Comparable) c2346.f7569)) {
            m14148();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c2346.f7569, c2346);
    }
}
