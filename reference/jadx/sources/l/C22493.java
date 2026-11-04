package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22493 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72783;

    public /* synthetic */ C22493(int i) {
        this.f72783 = i;
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
        switch (this.f72783) {
            case 0:
                return C1170.stream(((C24927) obj).getMethods());
            case 1:
                return new C18099(((AbstractC22044) obj).m49874());
            case 2:
                String str = (String) obj;
                return str.startsWith("/") ? str.substring(1) : str;
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 6:
                return new ArrayList();
            default:
                return (C12510) ((AbstractC8036) obj);
        }
    }
}
