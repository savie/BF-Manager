package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q398 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5536 implements InterfaceC1807 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f19250 = C1402.m5127();

    @Override // l.InterfaceC1807
    /* JADX INFO: renamed from: ۙ */
    public final void mo6284(C17007 c17007) {
        C17359.requireNonNull(c17007);
        this.f19250.add(c17007);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m16447() {
        return C4681.unmodifiableList(this.f19250);
    }
}
