package l;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19839 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63659;

    public /* synthetic */ C19839(int i) {
        this.f63659 = i;
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
        switch (this.f63659) {
            case 0:
                return new ArrayList();
            case 1:
                return new AtomicInteger();
            case 2:
                return (C15187) ((Map.Entry) obj).getValue();
            default:
                int i = C22078.f71527;
                return "?";
        }
    }
}
