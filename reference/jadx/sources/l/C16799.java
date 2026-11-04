package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16799 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f54192;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f54193;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f54194;

    public C16799(Set set, Set set2) {
        this.f54192 = set;
        this.f54193 = set2;
        this.f54194 = set.iterator();
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Object next;
        do {
            Iterator it = this.f54194;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m14148();
                return null;
            }
        } while (!this.f54193.contains(next));
        return next;
    }
}
