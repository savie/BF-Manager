package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10968 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37383;

    public /* synthetic */ C10968(int i) {
        this.f37383 = i;
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
        switch (this.f37383) {
            case 0:
                C4616 c4616 = (C4616) obj;
                return c4616.m12762() + ": " + c4616.m12763();
            case 1:
                int i = AbstractActivityC5788.f19654;
                return ((C22722) obj).f74022;
            case 2:
                return ((InterfaceC3800) obj).toString();
            case 3:
                return new ArrayList(((Integer) obj).intValue());
            case 4:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
        }
    }
}
