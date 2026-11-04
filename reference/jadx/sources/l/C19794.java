package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19794 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63656;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63657;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63658;

    public /* synthetic */ C19794(int i, Object obj, Object obj2) {
        this.f63656 = i;
        this.f63658 = obj;
        this.f63657 = obj2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f63656) {
            case 0:
                return ((EnumC7687) this.f63658).m20943((C7312) this.f63657, (String) obj);
            case 1:
                return C7044.m19376((C7044) this.f63658, (C18565) this.f63657, (C18565) obj);
            default:
                return C2026.m6967((C2026) this.f63658, (InterfaceC24928) this.f63657);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
