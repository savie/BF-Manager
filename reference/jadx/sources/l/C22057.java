package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22057 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71479;

    public /* synthetic */ C22057(int i) {
        this.f71479 = i;
    }

    public /* synthetic */ C22057(C12590 c12590) {
        this.f71479 = 8;
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
        switch (this.f71479) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return (String) ((Map.Entry) obj).getKey();
            case 2:
                int i = C12334.f41225;
                return C5553.m15313((String) obj, new String[0]);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            case 6:
                return new LinkedHashSet();
            case 7:
                return ((C6656) obj).f22475.f77449;
            default:
                return C12590.m31328((InterfaceC6987) obj);
        }
    }
}
