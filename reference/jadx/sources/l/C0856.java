package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֨֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4IX4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0856 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3227;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3228;

    public /* synthetic */ C0856(int i, Object obj) {
        this.f3227 = i;
        this.f3228 = obj;
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
        switch (this.f3227) {
            case 0:
                if (((C18959) obj) == ((C18959) this.f3228)) {
                    return Boolean.TRUE;
                }
                return null;
            default:
                return (C8877) ((C2911) this.f3228).invoke(obj);
        }
    }
}
