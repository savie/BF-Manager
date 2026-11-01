package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17868 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19010 f56573;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f56574;

    public C17868(Iterator it, InterfaceC19010 interfaceC19010) {
        this.f56574 = it;
        this.f56573 = interfaceC19010;
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        Object next;
        do {
            Iterator it = this.f56574;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m25170();
                return null;
            }
        } while (!this.f56573.apply(next));
        return next;
    }
}
