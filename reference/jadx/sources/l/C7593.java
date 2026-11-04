package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7593 extends AbstractC10706 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18780 f25075;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7593(C18780 c18780) {
        super(c18780.f51221);
        this.f25075 = c18780;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7593(C18780 c18780, int i, int i2) {
        super(i, i2);
        this.f25075 = c18780;
    }

    @Override // l.AbstractC10706
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo20761() {
        return this.f25075.f51222;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f25075.f60993.f31642[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C7593(this.f25075, i, i2);
    }

    @Override // l.AbstractC8512, l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f27823 >= mo14637()) {
            return false;
        }
        Object[] objArr = this.f25075.f60993.f31642;
        int i = this.f27823;
        this.f27823 = i + 1;
        consumer.n(objArr[i]);
        return true;
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        Object[] objArr = this.f25075.f60993.f31642;
        int iMo14637 = mo14637();
        while (true) {
            int i = this.f27823;
            if (i >= iMo14637) {
                return;
            }
            this.f27823 = i + 1;
            consumer.n(objArr[i]);
        }
    }
}
