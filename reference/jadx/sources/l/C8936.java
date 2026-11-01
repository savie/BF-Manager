package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8936 extends AbstractC9568 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f30630;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f30631;

    public C8936(long j, List list) {
        super(list.size() - 1);
        this.f30631 = j;
        this.f30630 = list;
    }

    @Override // l.InterfaceC2241
    /* JADX INFO: renamed from: ۙ */
    public final long mo6884() {
        m24424();
        return this.f30631 + ((C19853) this.f30630.get((int) m24423())).f63678;
    }

    @Override // l.InterfaceC2241
    /* JADX INFO: renamed from: ܰ */
    public final long mo6885() {
        m24424();
        C19853 c19853 = (C19853) this.f30630.get((int) m24423());
        return this.f30631 + c19853.f63678 + c19853.f63680;
    }
}
