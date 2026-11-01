package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20444 extends AbstractC0582 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0687 f66277;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20444(C0687 c0687) {
        super(c0687.f37626);
        this.f66277 = c0687;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20444(C0687 c0687, int i, int i2) {
        super(i, i2);
        this.f66277 = c0687;
    }

    @Override // l.AbstractC0582
    /* JADX INFO: renamed from: ܰ */
    public final int mo2760() {
        return this.f66277.f37625;
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ */
    public final long mo8512(int i) {
        return this.f66277.f2868.f54097[i];
    }

    @Override // l.AbstractC7639
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10462 mo8513(int i, int i2) {
        return new C20444(this.f66277, i, i2);
    }

    @Override // l.AbstractC1911, l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f25223 >= mo2759()) {
            return false;
        }
        long[] jArr = this.f66277.f2868.f54097;
        int i = this.f25223;
        this.f25223 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.AbstractC1911, l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        long[] jArr = this.f66277.f2868.f54097;
        int iMo2759 = mo2759();
        while (true) {
            int i = this.f25223;
            if (i >= iMo2759) {
                return;
            }
            this.f25223 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
