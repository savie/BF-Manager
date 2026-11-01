package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7533 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16001 f25034;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18054 f25035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f25036;

    public C7533(C16001 c16001, Iterator it, AbstractC18054 abstractC18054) {
        this.f25036 = it;
        this.f25035 = abstractC18054;
        this.f25034 = c16001;
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo20056() {
        Iterator it = this.f25036;
        if (!it.hasNext()) {
            m25170();
            return null;
        }
        C9548 c9548 = (C9548) it.next();
        if (!this.f25035.mo18344((Comparable) c9548.f32247)) {
            C9548 c9548M24410 = c9548.m24410(this.f25034.f51810);
            return new AbstractMap.SimpleImmutableEntry(c9548M24410.f32247, c9548M24410);
        }
        m25170();
        return null;
    }
}
