package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21325 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67940;

    public /* synthetic */ C21325(int i) {
        this.f67940 = i;
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
        switch (this.f67940) {
            case 0:
                return ((C21853) obj).toString();
            default:
                return Short.toString(((C13538) obj).f27297);
        }
    }
}
