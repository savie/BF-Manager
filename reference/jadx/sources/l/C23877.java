package l;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23877 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77166;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f77167;

    public /* synthetic */ C23877(int i, Serializable serializable) {
        this.f77166 = i;
        this.f77167 = serializable;
    }

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
        switch (this.f77166) {
            case 0:
                return C14705.m35230((File) obj, (String) this.f77167);
            default:
                return new ArrayList((ArrayList) this.f77167);
        }
    }
}
