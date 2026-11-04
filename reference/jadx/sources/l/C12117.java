package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12117 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38972;

    public /* synthetic */ C12117(int i) {
        this.f38972 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f38972) {
            case 0:
                return C1170.stream(((C21351) obj).f68007);
            default:
                return ((C14764) obj).f48296;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
