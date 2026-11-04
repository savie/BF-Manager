package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6596 implements Function {
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
        C1997 c1997 = (C1997) obj;
        int iM44775 = C19362.m44775(c1997);
        if (iM44775 == 0) {
            return null;
        }
        return new C18528(c1997.m6840(), c1997.m6835(), C19362.m44774(c1997), (int) c1997.m6834(), iM44775);
    }
}
