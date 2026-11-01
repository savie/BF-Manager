package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20939 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16001 f68253;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f68254;

    public C20939(C16001 c16001, Iterator it) {
        this.f68254 = it;
        this.f68253 = c16001;
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        Iterator it = this.f68254;
        if (!it.hasNext()) {
            m25170();
            return null;
        }
        C9548 c9548 = (C9548) it.next();
        C16001 c16001 = this.f68253;
        if (c16001.f51810.f32247.compareTo(c9548.f32248) < 0) {
            C9548 c9548M24410 = c9548.m24410(c16001.f51810);
            AbstractC18054 abstractC18054 = c9548M24410.f32247;
            if (!c16001.f51809.m24405(abstractC18054)) {
                m25170();
                return null;
            }
            return new AbstractMap.SimpleImmutableEntry(abstractC18054, c9548M24410);
        }
        m25170();
        return null;
    }
}
