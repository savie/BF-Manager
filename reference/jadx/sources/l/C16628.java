package l;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܽۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C16628 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f53351;

    public C16628(AbstractC7186 abstractC7186) {
        this.f53351 = abstractC7186;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        this.f53351.mo1572(c1145, Long.valueOf(((AtomicLong) obj).get()));
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        return new AtomicLong(((Number) this.f53351.mo1571(c5379)).longValue());
    }
}
