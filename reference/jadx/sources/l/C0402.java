package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.֡ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0402 extends AbstractC21857 implements InterfaceC13080 {
    public final /* synthetic */ EnumC17381 c;
    public final /* synthetic */ DoublePredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402(EnumC17381 enumC17381, DoublePredicate doublePredicate) {
        super(enumC17381);
        this.c = enumC17381;
        this.d = doublePredicate;
    }

    @Override // l.AbstractC21857, l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(d);
        EnumC17381 enumC17381 = this.c;
        if (zTest == enumC17381.a) {
            this.a = true;
            this.b = enumC17381.b;
        }
    }
}
