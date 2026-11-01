package l;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: l.ۜۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6685 extends AbstractC22686 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C6685(EnumC22761 enumC22761, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // l.AbstractC22686
    public final InterfaceC2319 e0() {
        switch (this.h) {
            case 0:
                return new C17054((LongBinaryOperator) this.i);
            case 1:
                return new C3675((DoubleBinaryOperator) this.i);
            case 2:
                return new C23467((BinaryOperator) this.i);
            default:
                return new C6034((IntBinaryOperator) this.i);
        }
    }
}
