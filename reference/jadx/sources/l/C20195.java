package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20195 extends AbstractC0315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0438 f65544;

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20195(C0438 c0438, int i, int i2) {
        super(i, i2);
        this.f65544 = c0438;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f65544.f2030.f53435[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C20195(this.f65544, i, i2);
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C16667 c16667 = this.f65544.f2030;
        Object[] objArr = c16667.f53435;
        int i = c16667.f53437;
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
