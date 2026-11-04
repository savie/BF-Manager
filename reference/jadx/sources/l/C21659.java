package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21659 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69134;

    public /* synthetic */ C21659(int i, Object obj) {
        this.f69133 = i;
        this.f69134 = obj;
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
        switch (this.f69133) {
            case 0:
                InterfaceC24329 interfaceC24329 = (InterfaceC24329) obj;
                ((C18675) this.f69134).getClass();
                try {
                    return C15867.of(C3445.readAttributes(interfaceC24329, InterfaceC8665.class, new EnumC20599[0]));
                } catch (IOException unused) {
                    return C15867.empty();
                }
            default:
                return Boolean.valueOf(!((EnumC22621) obj).equals(((InterfaceC1407) this.f69134).mo2283()));
        }
    }
}
