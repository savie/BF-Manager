package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5612 implements Function {
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
        C23770 c23770 = (C23770) obj;
        if (c23770.m52314() == null) {
            return c23770.m52316();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c23770.m52316());
        sb.append(" [");
        return C22697.m50267(sb, c23770.m52314(), "]");
    }
}
