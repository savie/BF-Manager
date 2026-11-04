package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19388 implements Function {
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
        InterfaceC11847 interfaceC11847 = (InterfaceC11847) obj;
        int i = AbstractC14166.f44791;
        interfaceC11847.getClass();
        return new C8726(interfaceC11847);
    }
}
