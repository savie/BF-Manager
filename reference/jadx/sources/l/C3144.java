package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3144 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10202;

    public /* synthetic */ C3144(int i, Object obj) {
        this.f10201 = i;
        this.f10202 = obj;
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
        switch (this.f10201) {
            case 0:
                return ((C20298) this.f10202).m46635((String) obj);
            default:
                return C20196.m46451((String) this.f10202, ": ", (String) obj);
        }
    }
}
