package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6I0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20957 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67026;

    public /* synthetic */ C20957(int i) {
        this.f67026 = i;
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
        switch (this.f67026) {
            case 0:
                return String.valueOf((AbstractC1566) obj);
            case 1:
                return ((EnumC22631) obj).f73509;
            case 2:
                return Boolean.valueOf(((EnumC7215) obj).m19813());
            case 3:
                return C1170.stream(((C19684) obj).m45365());
            case 4:
                return ((EnumC13127) obj).m32610();
            default:
                return (InterfaceC8540) ((InterfaceC22538) obj).m50778();
        }
    }
}
