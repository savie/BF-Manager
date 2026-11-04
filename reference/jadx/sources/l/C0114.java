package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֡֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0114 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1063;

    public /* synthetic */ C0114(int i) {
        this.f1063 = i;
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
        switch (this.f1063) {
            case 0:
                return Short.toString(((C6827) obj).f27297);
            default:
                int i = C21853.f69618;
                return "????";
        }
    }
}
