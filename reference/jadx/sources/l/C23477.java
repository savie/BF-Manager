package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23477 implements Function {
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
        InterfaceC20608 interfaceC20608 = (InterfaceC20608) obj;
        int i = AbstractC5400.f18636;
        interfaceC20608.getClass();
        return new C11482(interfaceC20608);
    }
}
