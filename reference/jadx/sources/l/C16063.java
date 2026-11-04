package l;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ܶۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16063 extends AbstractC21857 implements InterfaceC1148 {
    public final /* synthetic */ EnumC17381 c;
    public final /* synthetic */ LongPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16063(EnumC17381 enumC17381, LongPredicate longPredicate) {
        super(enumC17381);
        this.c = enumC17381;
        this.d = longPredicate;
    }

    @Override // l.AbstractC21857, l.InterfaceC15143
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(j);
        EnumC17381 enumC17381 = this.c;
        if (zTest == enumC17381.a) {
            this.a = true;
            this.b = enumC17381.b;
        }
    }
}
