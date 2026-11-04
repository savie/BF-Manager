package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6I5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21045 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67257;

    public /* synthetic */ C21045(int i) {
        this.f67257 = i;
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
        switch (this.f67257) {
            case 0:
                ((InterfaceC17730) obj).m41522();
                throw null;
            case 1:
                return new ArrayList();
            case 2:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
            default:
                return ((C24927) obj).m55571();
        }
    }
}
