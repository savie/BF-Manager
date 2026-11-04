package l;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: l.ۜܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7267 extends AbstractC13956 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C7267(EnumC14154 enumC14154, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // l.AbstractC13956
    public final InterfaceC18873 e0() {
        switch (this.h) {
            case 0:
                return new C3211((LongBinaryOperator) this.i);
            case 1:
                return new C8714((DoubleBinaryOperator) this.i);
            case 2:
                return new C6107((BinaryOperator) this.i);
            default:
                return new C20539((IntBinaryOperator) this.i);
        }
    }
}
