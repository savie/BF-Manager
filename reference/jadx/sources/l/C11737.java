package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11737 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37963;

    public /* synthetic */ C11737(int i, Object obj) {
        this.f37962 = i;
        this.f37963 = obj;
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
        switch (this.f37962) {
            case 0:
                return "#" + ((C16958) this.f37963).f81355;
            default:
                return C2026.m6975((C2026) this.f37963, (InterfaceC24928) obj);
        }
    }
}
