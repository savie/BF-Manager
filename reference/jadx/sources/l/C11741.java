package l;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ۨܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11741 implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC13514) {
            return C4340.convert((InterfaceC13514) objApply);
        }
        if (objApply instanceof IntStream) {
            return C3301.convert((IntStream) objApply);
        }
        C12040.a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC22686.G(j, this.a);
    }
}
