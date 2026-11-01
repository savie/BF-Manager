package l;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18467 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58844;

    public /* synthetic */ C18467(int i, Object obj) {
        this.f58843 = i;
        this.f58844 = obj;
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
        int i = this.f58843;
        Object obj2 = this.f58844;
        switch (i) {
            case 0:
                return ((C12118) obj2).m18212(9, "exports").concat(String.format("%s;%n", ((C8590) ((Map.Entry) obj).getKey()).toString()));
            default:
                return Integer.valueOf(((C5058) obj2).f17649.size());
        }
    }
}
