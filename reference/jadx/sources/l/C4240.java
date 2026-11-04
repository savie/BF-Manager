package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4240 extends AbstractC13956 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C4240(EnumC14154 enumC14154, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // l.AbstractC13956
    public final InterfaceC18873 e0() {
        switch (this.h) {
            case 0:
                return new C14724((Supplier) this.i, (ObjLongConsumer) this.k, (C21285) this.j);
            case 1:
                return new C24598((Supplier) this.i, (ObjDoubleConsumer) this.k, (C21285) this.j);
            case 2:
                return new C5361(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new C12575((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new C10096((Supplier) this.i, (ObjIntConsumer) this.k, (C21285) this.j);
        }
    }
}
