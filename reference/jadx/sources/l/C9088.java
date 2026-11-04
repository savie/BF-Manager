package l;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9088 extends AbstractC13956 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ InterfaceC5754 k;

    @Override // l.AbstractC13956
    public final InterfaceC18873 e0() {
        return new C13321(this.j, this.i, this.h);
    }

    @Override // l.AbstractC13956, l.InterfaceC8605
    public final int j() {
        if (this.k.characteristics().contains(EnumC13211.UNORDERED)) {
            return EnumC21614.r;
        }
        return 0;
    }

    public C9088(EnumC14154 enumC14154, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, InterfaceC5754 interfaceC5754) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = interfaceC5754;
    }
}
