package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2804 extends AbstractC16106 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5627 f10661;

    @Override // l.AbstractC7639, l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2804(C5627 c5627, int i, int i2) {
        super(i, i2);
        this.f10661 = c5627;
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo8512(int i) {
        return this.f10661.f19277.f23649[i];
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10462 mo8513(int i, int i2) {
        return new C2804(this.f10661, i, i2);
    }

    @Override // l.AbstractC1911, l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        C7038 c7038 = this.f10661.f19277;
        long[] jArr = c7038.f23649;
        int i = c7038.f23647;
        while (true) {
            int i2 = this.f25223;
            if (i2 >= i) {
                return;
            }
            this.f25223 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
