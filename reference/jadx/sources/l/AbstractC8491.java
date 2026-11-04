package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LCL2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8491 implements InterfaceC21499, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* synthetic */ Object get(Object obj) {
        return C14785.m35629(this, obj);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return mo13849(j);
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo13846(long j, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
