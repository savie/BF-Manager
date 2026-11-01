package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13389 extends AbstractC0315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4215 f44341;

    @Override // l.AbstractC20777, l.InterfaceC20693
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13389(C4215 c4215, int i, int i2) {
        super(i, i2);
        this.f44341 = c4215;
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13685(int i) {
        return this.f44341.f15297.f23645[i];
    }

    @Override // l.AbstractC20777
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7371 mo13686(int i, int i2) {
        return new C13389(this.f44341, i, i2);
    }

    @Override // l.AbstractC20777, l.AbstractC1309, l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C7038 c7038 = this.f44341.f15297;
        Object[] objArr = c7038.f23645;
        int i = c7038.f23647;
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
