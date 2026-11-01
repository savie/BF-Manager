package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6072 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20575;

    public /* synthetic */ C6072(int i) {
        this.f20575 = i;
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
        switch (this.f20575) {
            case 0:
                return ((C20889) obj).m46958();
            case 1:
                return ((C13080) obj).m32297();
            case 2:
                return new ArrayList();
            case 3:
                return ((DynamicScheme) obj).errorPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            default:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
        }
    }
}
