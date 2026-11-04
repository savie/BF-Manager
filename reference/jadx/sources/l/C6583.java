package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6583 extends AbstractC4741 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24483 f22069;

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6583(C24483 c24483, int i, int i2) {
        super(i, i2);
        this.f22069 = c24483;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f22069.f79456.f15715[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C6583(this.f22069, i, i2);
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C4345 c4345 = this.f22069.f79456;
        Object[] objArr = c4345.f15715;
        int i = c4345.f15714;
        while (true) {
            int i2 = this.f27823;
            if (i2 >= i) {
                return;
            }
            this.f27823 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
