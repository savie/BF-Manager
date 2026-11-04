package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۬ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14039 extends AbstractC4566 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4828 f44488;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14039(C4828 c4828) {
        super(c4828.f50532);
        this.f44488 = c4828;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14039(C4828 c4828, int i, int i2) {
        super(i, i2);
        this.f44488 = c4828;
    }

    @Override // l.AbstractC4566
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14344() {
        return this.f44488.f50533;
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final long mo8663(int i) {
        return this.f44488.f16885.f70927[i];
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9301 mo8664(int i, int i2) {
        return new C14039(this.f44488, i, i2);
    }

    @Override // l.AbstractC2108, l.InterfaceC9154
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f8314 >= mo8662()) {
            return false;
        }
        long[] jArr = this.f44488.f16885.f70927;
        int i = this.f8314;
        this.f8314 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.AbstractC2108, l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        long[] jArr = this.f44488.f16885.f70927;
        int iMo8662 = mo8662();
        while (true) {
            int i = this.f8314;
            if (i >= iMo8662) {
                return;
            }
            this.f8314 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
