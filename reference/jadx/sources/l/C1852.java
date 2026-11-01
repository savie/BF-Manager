package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1852 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7073;

    public /* synthetic */ C1852(int i) {
        this.f7073 = i;
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
        switch (this.f7073) {
            case 0:
                return new C22504((C17367) obj);
            case 1:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                C23590 c23590 = C11038.f37488;
                return null;
            default:
                return ((AbstractC23903) obj).f77449;
        }
    }
}
