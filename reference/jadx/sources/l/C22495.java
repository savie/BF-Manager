package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes.dex */
public final class C22495 extends AbstractC6340 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f72784;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f72785;

    public C22495(long j, List list) {
        super(list.size() - 1);
        this.f72784 = j;
        this.f72785 = list;
    }

    @Override // l.InterfaceC18272
    /* JADX INFO: renamed from: ۙ */
    public final long mo42425() {
        m18061();
        return this.f72784 + ((C1786) this.f72785.get((int) m18062())).f6095;
    }

    @Override // l.InterfaceC18272
    /* JADX INFO: renamed from: ᩷ */
    public final long mo42426() {
        m18061();
        C1786 c1786 = (C1786) this.f72785.get((int) m18062());
        return this.f72784 + c1786.f6095 + c1786.f6093;
    }
}
