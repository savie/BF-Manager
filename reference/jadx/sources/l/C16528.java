package l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܺۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16528 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C15648 c15648 = ((C17447) obj).f56742;
        int i = c15648.f50828;
        if (i > 0) {
            return i;
        }
        int i2 = c15648.f50815;
        return i2 > 0 ? i2 : C25227.FOREVER_NS;
    }
}
