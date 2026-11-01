package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10317 extends AbstractC1205 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7494 f35383;

    @Override // l.AbstractC2616, l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10317(C7494 c7494, int i, int i2) {
        super(i, i2);
        this.f35383 = c7494;
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final int mo1568(int i) {
        return this.f35383.f24959.f53439[i];
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11790 mo1569(int i, int i2) {
        return new C10317(this.f35383, i, i2);
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C16667 c16667 = this.f35383.f24959;
        int[] iArr = c16667.f53439;
        int i = c16667.f53437;
        while (true) {
            int i2 = this.f10225;
            if (i2 >= i) {
                return;
            }
            this.f10225 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
