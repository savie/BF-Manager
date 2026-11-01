package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22202 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72635;

    public /* synthetic */ C22202(int i) {
        this.f72635 = i;
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
        switch (this.f72635) {
            case 0:
                return ((C19670) obj).f77453.toString();
            default:
                return ((C3836) obj).f14228;
        }
    }
}
