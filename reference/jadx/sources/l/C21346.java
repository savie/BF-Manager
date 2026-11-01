package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21346 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69464;

    public /* synthetic */ C21346(int i, Object obj) {
        this.f69463 = i;
        this.f69464 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69463) {
            case 0:
                return ((C1254) this.f69464).m4531((BooleanSupplier) obj);
            case 1:
                return ((MaterialDynamicColors) this.f69464).lambda$secondaryContainer$75((DynamicScheme) obj);
            default:
                return C1912.m6223((C1912) this.f69464, (String) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
