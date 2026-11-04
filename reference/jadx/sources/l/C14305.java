package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14305 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45170;

    public /* synthetic */ C14305(int i) {
        this.f45170 = i;
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
        switch (this.f45170) {
            case 0:
                return C1170.stream(((C21351) obj).f68007);
            case 1:
                return ((C14764) obj).f48255;
            case 2:
                return ((StackTraceElement) obj).toString();
            default:
                return ((C12510) obj).f40168.f38067;
        }
    }
}
