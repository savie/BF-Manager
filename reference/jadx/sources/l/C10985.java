package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10985 extends AbstractC4450 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f34693;

    public C10985(C22920 c22920) {
        this.f34693 = C22920.f74487.m3766(c22920.f74488).iterator();
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        Iterator it = this.f34693;
        if (it.hasNext()) {
            String str = (String) it.next();
            if (it.hasNext() || !str.isEmpty()) {
                return str;
            }
        }
        m14148();
        return null;
    }
}
