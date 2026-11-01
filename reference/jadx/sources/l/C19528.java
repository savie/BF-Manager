package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.᩵ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19528 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8945 f62790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23659 f62791;

    public C19528(C8945 c8945, InterfaceC23659 interfaceC23659) {
        this.f62791 = interfaceC23659;
        this.f62790 = c8945;
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        C19986 c19986 = (C19986) this.f62791;
        if (!c19986.hasNext()) {
            m25170();
            return null;
        }
        C9548 c9548 = (C9548) c19986.next();
        if (!this.f62790.f30668.f32247.mo18344((Comparable) c9548.f32248)) {
            m25170();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c9548.f32248, c9548);
    }
}
