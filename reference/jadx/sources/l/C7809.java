package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7809 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C18334 c18334 = (C18334) obj;
        int iM16343 = C6024.m16343(c18334);
        if (iM16343 == 0) {
            return null;
        }
        return new C16981(c18334.m42573(), c18334.m42575(), C6024.m16342(c18334), (int) c18334.m42577(), iM16343);
    }
}
