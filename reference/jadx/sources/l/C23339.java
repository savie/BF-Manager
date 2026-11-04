package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes.dex */
public final class C23339 extends AbstractC4450 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f75599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6163 f75600;

    public C23339(Iterator it, InterfaceC6163 interfaceC6163) {
        this.f75599 = it;
        this.f75600 = interfaceC6163;
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Object next;
        do {
            Iterator it = this.f75599;
            if (it.hasNext()) {
                next = it.next();
            } else {
                m14148();
                return null;
            }
        } while (!this.f75600.apply(next));
        return next;
    }
}
