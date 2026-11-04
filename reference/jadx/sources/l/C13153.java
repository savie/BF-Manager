package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13153 implements Function {
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
        C8373 c8373 = (C8373) obj;
        if (c8373.m22534() == null) {
            return c8373.m22535();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8373.m22535());
        sb.append(" [");
        return C8947.m23910(sb, c8373.m22534(), "]");
    }
}
