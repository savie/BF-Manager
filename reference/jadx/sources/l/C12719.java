package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12719 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f40734;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6754 f40735;

    public C12719(C6754 c6754, Iterator it) {
        this.f40734 = it;
        this.f40735 = c6754;
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Iterator it = this.f40734;
        if (!it.hasNext()) {
            m14148();
            return null;
        }
        C2346 c2346 = (C2346) it.next();
        C6754 c6754 = this.f40735;
        if (c6754.f22479.f7568.compareTo(c2346.f7569) < 0) {
            C2346 c2346M7923 = c2346.m7923(c6754.f22479);
            AbstractC20638 abstractC20638 = c2346M7923.f7568;
            if (!c6754.f22480.m7918(abstractC20638)) {
                m14148();
                return null;
            }
            return new AbstractMap.SimpleImmutableEntry(abstractC20638, c2346M7923);
        }
        m14148();
        return null;
    }
}
