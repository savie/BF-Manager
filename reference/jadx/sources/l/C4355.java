package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4355 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15583;

    public /* synthetic */ C4355(int i) {
        this.f15583 = i;
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
        switch (this.f15583) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return new C1084();
            case 2:
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
                int i = C0693.f2948;
                if (!interfaceC2557.isDirectory()) {
                    return interfaceC2557.getPath();
                }
                return interfaceC2557.getPath() + "/";
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }
}
