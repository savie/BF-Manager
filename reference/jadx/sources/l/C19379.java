package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19379 implements Function {
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
        C9979 c9979 = (C9979) obj;
        EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
        return new C19879(c9979.m25242(), (String) c9979.f43680);
    }
}
