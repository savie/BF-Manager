package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8056 extends AbstractC0315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19345 f28211;

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8056(C19345 c19345, int i, int i2) {
        super(i, i2);
        this.f28211 = c19345;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f28211.f62382.f51195[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C8056(this.f28211, i, i2);
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C15818 c15818 = this.f28211.f62382;
        Object[] objArr = c15818.f51195;
        int i = c15818.f51193;
        while (true) {
            int i2 = this.f67579;
            if (i2 >= i) {
                return;
            }
            this.f67579 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
