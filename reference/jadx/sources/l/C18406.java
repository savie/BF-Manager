package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18406 implements Function {
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
        return C14442.m34865("\"", ((EnumC5202) obj).m15637(), "\"");
    }
}
