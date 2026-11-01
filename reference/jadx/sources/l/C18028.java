package l;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ᩳۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18028 extends AbstractC21287 implements InterfaceC10974 {
    public final /* synthetic */ EnumC0120 c;
    public final /* synthetic */ IntPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18028(EnumC0120 enumC0120, IntPredicate intPredicate) {
        super(enumC0120);
        this.c = enumC0120;
        this.d = intPredicate;
    }

    @Override // l.AbstractC21287, l.InterfaceC19171
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        EnumC0120 enumC0120 = this.c;
        if (zTest == enumC0120.a) {
            this.a = true;
            this.b = enumC0120.b;
        }
    }
}
