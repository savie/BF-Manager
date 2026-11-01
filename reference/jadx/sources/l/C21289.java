package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21289 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69285;

    public /* synthetic */ C21289(int i, Object obj) {
        this.f69284 = i;
        this.f69285 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f69284;
        Object obj2 = this.f69285;
        switch (i) {
            case 0:
                return ((C12118) obj2).m18212(9, "uses").concat(String.format("%s;%n", (C0122) obj));
            default:
                C23549 c23549 = (C23549) obj2;
                if (obj instanceof C14377) {
                    return c23549.m51910((C14377) obj);
                }
                c23549.getClass();
                return obj;
        }
    }
}
