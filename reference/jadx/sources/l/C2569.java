package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2569 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10126;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6741 f10127;

    public /* synthetic */ C2569(AbstractC6741 abstractC6741, int i) {
        this.f10126 = i;
        this.f10127 = abstractC6741;
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
        switch (this.f10126) {
            case 0:
                return Boolean.valueOf(((C3980) this.f10127).f47512.m27814(((Integer) obj).intValue()));
            default:
                C12118 c12118 = (C12118) this.f10127;
                c12118.getClass();
                return c12118.m18207(9, ((C19879) obj).toString());
        }
    }
}
