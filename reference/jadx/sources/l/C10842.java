package l;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۤۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10842 extends AbstractC21857 implements InterfaceC12334 {
    public final /* synthetic */ EnumC17381 c;
    public final /* synthetic */ IntPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        AbstractC13956.p(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10842(EnumC17381 enumC17381, IntPredicate intPredicate) {
        super(enumC17381);
        this.c = enumC17381;
        this.d = intPredicate;
    }

    @Override // l.AbstractC21857, l.InterfaceC15143
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        EnumC17381 enumC17381 = this.c;
        if (zTest == enumC17381.a) {
            this.a = true;
            this.b = enumC17381.b;
        }
    }
}
