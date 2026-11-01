package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9426 extends AbstractC1205 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3074 f31931;

    @Override // l.AbstractC2616, l.InterfaceC20693
    public final int characteristics() {
        return 17744;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9426(C3074 c3074) {
        super(c3074.f11642, c3074.f11641);
        this.f31931 = c3074;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9426(C3074 c3074, int i, int i2) {
        super(i, i2);
        this.f31931 = c3074;
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final int mo1568(int i) {
        return this.f31931.f11640[i];
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11790 mo1569(int i, int i2) {
        return new C9426(this.f31931, i, i2);
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f10225;
        if (i >= this.f5320) {
            return false;
        }
        int[] iArr = this.f31931.f11640;
        this.f10225 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f31931.f11640;
        while (true) {
            int i = this.f10225;
            if (i >= this.f5320) {
                return;
            }
            this.f10225 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
