package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17115 implements InterfaceC19501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f54582;

    public C17115(C20145 c20145) {
        this.f54582 = c20145;
    }

    @Override // l.InterfaceC19501
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30287(AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826) {
        if (abstractC16579.mo1926() || AbstractC16579.m38998(c21825)) {
            return false;
        }
        return c21826 == null || !AbstractC16579.m38998(c21826);
    }

    @Override // l.InterfaceC19501
    /* JADX INFO: renamed from: ۙ */
    public final C21825 mo30286(AbstractC23903 abstractC23903, C21825 c21825) {
        EnumC9729 enumC9729 = EnumC9729.SPECULATIVE;
        C20145 c20145 = this.f54582;
        EnumC11678 enumC11678 = c20145.f65437.f20637;
        C5870 c5870 = c20145.f65438;
        C13638.requireNonNull(c5870);
        return c21825.m48592((Function) new C19439(c5870, enumC9729, abstractC23903, enumC11678));
    }
}
