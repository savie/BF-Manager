package l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6IG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14746 implements BiFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48160;

    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        InterfaceC11653 interfaceC11653 = (InterfaceC11653) obj2;
        int[] iArr = C21460.f68447;
        int i = iArr[interfaceC11653.mo8493().ordinal()];
        if (i == 3) {
            int i2 = iArr[((C16128) interfaceC11653).m38287().mo8493().ordinal()];
            if (i2 != 1 && i2 != 2) {
                return null;
            }
            this.f48160++;
            return null;
        }
        if (i != 4) {
            return null;
        }
        int i3 = this.f48160;
        if (i3 == 0) {
            return num;
        }
        this.f48160 = i3 - 1;
        return null;
    }
}
