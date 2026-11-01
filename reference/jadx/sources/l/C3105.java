package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayDeque;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3105 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11700;

    public /* synthetic */ C3105(int i) {
        this.f11700 = i;
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
        switch (this.f11700) {
            case 0:
                return ((AbstractC20745) obj).getName();
            case 1:
                return ((InterfaceC12783) obj).mo31757();
            case 2:
                return new C13810((C17367) obj);
            case 3:
                return ((C23013) obj).f74795;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return ((EnumC9728) obj).m24687();
            default:
                return new ArrayDeque();
        }
    }
}
