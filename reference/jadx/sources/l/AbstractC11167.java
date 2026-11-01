package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZCAG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11167 implements InterfaceC6456, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // l.InterfaceC6456
    public abstract /* synthetic */ int size();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }
}
