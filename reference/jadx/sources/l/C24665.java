package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24665 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f79830;

    public /* synthetic */ C24665(int i, Object obj) {
        this.f79829 = i;
        this.f79830 = obj;
    }

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
        switch (this.f79829) {
            case 0:
                return C11984.m30082((HashMap) this.f79830, (AbstractC12531) obj);
            case 1:
                return C14584.m35193(C14483.m34972((String) this.f79830, (String) obj), new String[0]);
            case 2:
                return ((MaterialDynamicColors) this.f79830).lambda$onError$96((DynamicScheme) obj);
            default:
                return Boolean.valueOf(C3486.m11458((C3486) this.f79830, (C2551) obj));
        }
    }
}
