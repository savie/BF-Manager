package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7350 extends AbstractC0315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20756 f24413;

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7350(C20756 c20756, int i, int i2) {
        super(i, i2);
        this.f24413 = c20756;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f24413.f67554.f51191[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C7350(this.f24413, i, i2);
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C15818 c15818 = this.f24413.f67554;
        Object[] objArr = c15818.f51191;
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
