package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23726 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76780;

    public /* synthetic */ C23726(int i) {
        this.f76780 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f76780) {
            case 0:
                return new C23085((C17367) obj);
            case 1:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).primaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            case 5:
                return C9030.stream((C21825) obj);
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
