package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ܰۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13527 extends AbstractC21287 implements InterfaceC8857 {
    public final /* synthetic */ EnumC0120 c;
    public final /* synthetic */ DoublePredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13527(EnumC0120 enumC0120, DoublePredicate doublePredicate) {
        super(enumC0120);
        this.c = enumC0120;
        this.d = doublePredicate;
    }

    @Override // l.AbstractC21287, l.InterfaceC19171
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(d);
        EnumC0120 enumC0120 = this.c;
        if (zTest == enumC0120.a) {
            this.a = true;
            this.b = enumC0120.b;
        }
    }
}
