package l;

import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0490 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2133 = 0;

    public /* synthetic */ C0490() {
    }

    public /* synthetic */ C0490(C4192 c4192) {
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2133) {
            case 0:
                return (C7395) ((Supplier) obj).get();
            default:
                C24330 c24330 = new C24330((C10157) obj);
                c24330.f78906 = new HashSet();
                return c24330;
        }
    }
}
