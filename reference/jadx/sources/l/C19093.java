package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19093 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f61684;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f61685;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f61686;

    public C19093(Set set, Set set2) {
        this.f61686 = set;
        this.f61685 = set2;
        this.f61684 = set.iterator();
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        Object next;
        do {
            Iterator it = this.f61684;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m25170();
                return null;
            }
        } while (!this.f61685.contains(next));
        return next;
    }
}
