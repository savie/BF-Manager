package l;

import java.util.ArrayDeque;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15753 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51224;

    public /* synthetic */ C15753(int i) {
        this.f51224 = i;
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
        switch (this.f51224) {
            case 0:
                return new ArrayDeque();
            case 1:
                return ((C14764) obj).f48286;
            default:
                return ((C12510) obj).f40168.f38067;
        }
    }
}
