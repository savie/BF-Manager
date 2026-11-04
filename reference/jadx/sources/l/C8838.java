package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UIVK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8838 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28907;

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
        InterfaceC6238 interfaceC6238 = (AbstractC16481) obj;
        if ((interfaceC6238 instanceof InterfaceC3057) && C17359.equals(((InterfaceC3057) interfaceC6238).getName(), this.f28907)) {
            return interfaceC6238;
        }
        return null;
    }
}
