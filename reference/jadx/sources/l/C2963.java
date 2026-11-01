package l;

import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2963 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11099;

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
        switch (this.f11099) {
            case 0:
                return ((C5123) obj).toString();
            default:
                return new LinkedHashMap();
        }
    }
}
