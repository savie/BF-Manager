package l;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156 extends AbstractC22686 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ InterfaceC14592 k;

    @Override // l.AbstractC22686
    public final InterfaceC2319 e0() {
        return new C8919(this.j, this.i, this.h);
    }

    @Override // l.AbstractC22686, l.InterfaceC3647
    public final int j() {
        if (this.k.characteristics().contains(EnumC23764.UNORDERED)) {
            return EnumC2970.r;
        }
        return 0;
    }

    public C1156(EnumC22761 enumC22761, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, InterfaceC14592 interfaceC14592) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = interfaceC14592;
    }
}
