package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes2.dex */
public final class C24461 extends AbstractC24155 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4323 f79410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24461(C4323 c4323) {
        super(c4323.f64763);
        this.f79410 = c4323;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24461(C4323 c4323, int i, int i2) {
        super(i, i2);
        this.f79410 = c4323;
    }

    @Override // l.AbstractC24155
    /* JADX INFO: renamed from: ᩷ */
    public final int mo15798() {
        return this.f79410.f64764;
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final int mo3336(int i) {
        return this.f79410.f15669.f48233[i];
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15949 mo3337(int i, int i2) {
        return new C24461(this.f79410, i, i2);
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f75777 >= mo30492()) {
            return false;
        }
        int[] iArr = this.f79410.f15669.f48233;
        int i = this.f75777;
        this.f75777 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f79410.f15669.f48233;
        int iMo30492 = mo30492();
        while (true) {
            int i = this.f75777;
            if (i >= iMo30492) {
                return;
            }
            this.f75777 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
