package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21264 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67825;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67826;

    public /* synthetic */ C21264(int i, Object obj) {
        this.f67825 = i;
        this.f67826 = obj;
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
        switch (this.f67825) {
            case 0:
                return ((C15714) this.f67826).m37565((AbstractC19728) obj);
            default:
                C12510 c12510 = (C12510) obj;
                C15714 c15714 = ((C19108) this.f67826).f61840.f32523.f41181;
                return c15714.m37520(c12510.f40170, c12510.f40164, c15714.m37568(), (AbstractC22295) null);
        }
    }
}
