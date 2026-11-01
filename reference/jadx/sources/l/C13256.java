package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13256 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44024;

    public /* synthetic */ C13256(int i) {
        this.f44024 = i;
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
        switch (this.f44024) {
            case 0:
                return ((C4082) obj).toString();
            case 1:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            default:
                return ((InterfaceC4164) obj).mo11809();
        }
    }
}
