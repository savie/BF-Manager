package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8239 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8945 f28687;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f28688;

    public C8239(C8945 c8945, Iterator it) {
        this.f28688 = it;
        this.f28687 = c8945;
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        Iterator it = this.f28688;
        if (!it.hasNext()) {
            m25170();
            return null;
        }
        C9548 c9548 = (C9548) it.next();
        if (this.f28687.f30668.f32248.mo18344((Comparable) c9548.f32248)) {
            m25170();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c9548.f32248, c9548);
    }
}
