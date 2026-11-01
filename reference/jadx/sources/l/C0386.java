package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7UG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0386 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1867;

    public /* synthetic */ C0386(int i, Object obj) {
        this.f1866 = i;
        this.f1867 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1866) {
            case 0:
                return C12382.m30803((C12382) this.f1867, (C10971) obj);
            default:
                return super/*l.᩸ۚ۟*/.mo36011((InterfaceC3800) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
