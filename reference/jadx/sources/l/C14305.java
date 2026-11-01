package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14305 implements Function {
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
        InterfaceC1657 interfaceC1657 = (InterfaceC1657) obj;
        int i = AbstractC5400.f18636;
        interfaceC1657.getClass();
        return new C13599(interfaceC1657);
    }
}
