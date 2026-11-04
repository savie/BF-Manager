package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: ZCAG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15006 implements InterfaceC21433, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public abstract /* synthetic */ int size();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }
}
