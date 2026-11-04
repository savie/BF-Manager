package l;

import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܽۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17274 implements ToLongFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56267;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.f56267) {
            case 0:
                C15648 c15648 = ((C17447) obj).f56742;
                int i = c15648.f50814;
                int i2 = c15648.f50852;
                return (i <= 0 || i2 <= 0) ? C25227.FOREVER_NS : ((long) i) * ((long) i2);
            default:
                return ((C19538) obj).m45070();
        }
    }
}
