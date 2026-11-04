package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6694 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17355 f22289;

    public /* synthetic */ C6694(C17355 c17355) {
        this.f22289 = c17355;
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
        C15291 c15291 = this.f22289.f20376;
        c15291.getClass();
        return c15291.m36706(EnumC3185.f10366, (C7110) obj);
    }
}
