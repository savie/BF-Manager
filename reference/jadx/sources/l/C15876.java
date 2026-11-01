package l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܺۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15876 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C7648 c7648 = ((C17030) obj).f54409;
        int i = c7648.f25259;
        if (i > 0) {
            return i;
        }
        int i2 = c7648.f25266;
        return i2 > 0 ? i2 : C17492.FOREVER_NS;
    }
}
