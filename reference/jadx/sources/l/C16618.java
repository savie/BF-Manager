package l;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ܽۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16618 extends AbstractC21287 implements InterfaceC21993 {
    public final /* synthetic */ EnumC0120 c;
    public final /* synthetic */ LongPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16618(EnumC0120 enumC0120, LongPredicate longPredicate) {
        super(enumC0120);
        this.c = enumC0120;
        this.d = longPredicate;
    }

    @Override // l.AbstractC21287, l.InterfaceC19171
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(j);
        EnumC0120 enumC0120 = this.c;
        if (zTest == enumC0120.a) {
            this.a = true;
            this.b = enumC0120.b;
        }
    }
}
