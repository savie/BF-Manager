package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes2.dex */
public final class C23737 extends AbstractC7065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3599 f76943;

    @Override // l.AbstractC2590, l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23737(C3599 c3599, int i, int i2) {
        super(i, i2);
        this.f76943 = c3599;
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final long mo8663(int i) {
        return this.f76943.f12304.f15719[i];
    }

    @Override // l.AbstractC2590
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9301 mo8664(int i, int i2) {
        return new C23737(this.f76943, i, i2);
    }

    @Override // l.AbstractC2108, l.InterfaceC9154
    public final void forEachRemaining(LongConsumer longConsumer) {
        C4345 c4345 = this.f76943.f12304;
        long[] jArr = c4345.f15719;
        int i = c4345.f15714;
        while (true) {
            int i2 = this.f8314;
            if (i2 >= i) {
                return;
            }
            this.f8314 = i2 + 1;
            longConsumer.accept(jArr[i2]);
        }
    }
}
