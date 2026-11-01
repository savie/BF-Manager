package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6602 extends AbstractC4027 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22831 f22224;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6602(C22831 c22831) {
        super(c22831.f20000);
        this.f22224 = c22831;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6602(C22831 c22831, int i, int i2) {
        super(i, i2);
        this.f22224 = c22831;
    }

    @Override // l.AbstractC4027
    /* JADX INFO: renamed from: ܰ */
    public final int mo1570() {
        return this.f22224.f19999;
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final int mo1568(int i) {
        return this.f22224.f74281.f49125[i];
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11790 mo1569(int i, int i2) {
        return new C6602(this.f22224, i, i2);
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f10225 >= mo4401()) {
            return false;
        }
        int[] iArr = this.f22224.f74281.f49125;
        int i = this.f10225;
        this.f10225 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f22224.f74281.f49125;
        int iMo4401 = mo4401();
        while (true) {
            int i = this.f10225;
            if (i >= iMo4401) {
                return;
            }
            this.f10225 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
