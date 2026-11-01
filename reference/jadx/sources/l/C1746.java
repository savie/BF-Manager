package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1746 extends AbstractC22686 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C1746(EnumC22761 enumC22761, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // l.AbstractC22686
    public final InterfaceC2319 e0() {
        switch (this.h) {
            case 0:
                return new C9281((Supplier) this.i, (ObjLongConsumer) this.k, (C20146) this.j);
            case 1:
                return new C14261((Supplier) this.i, (ObjDoubleConsumer) this.k, (C20146) this.j);
            case 2:
                return new C10061(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new C11036((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new C5059((Supplier) this.i, (ObjIntConsumer) this.k, (C20146) this.j);
        }
    }
}
