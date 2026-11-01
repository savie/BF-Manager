package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23590 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76421;

    public /* synthetic */ C23590(int i) {
        this.f76421 = i;
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
        switch (this.f76421) {
            case 0:
                return C14418.m34685((String) obj);
            case 1:
                return C21611.f70098;
            case 2:
                return new ArrayList();
            case 3:
                return new C6794((AbstractC20745) obj);
            case 4:
                return ((C17763) obj).f56350;
            case 5:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
            case 8:
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 9:
                return String.format("??? Invalid constant_pool reference #%d", (Integer) obj);
            default:
                return C23879.m52617(EnumC0573.f2484, EnumC0573.f2433);
        }
    }
}
