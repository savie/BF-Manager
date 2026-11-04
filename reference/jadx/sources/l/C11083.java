package l;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ۤ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11083 implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC17686) {
            return C16940.convert((InterfaceC17686) objApply);
        }
        if (objApply instanceof IntStream) {
            return C25146.convert((IntStream) objApply);
        }
        C16041.a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC13956.G(j, this.a);
    }
}
