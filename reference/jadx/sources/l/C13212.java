package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13212 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43967;

    public /* synthetic */ C13212(int i) {
        this.f43967 = i;
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
        switch (this.f43967) {
            case 0:
                return ((C12107) obj).m30093();
            case 1:
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return (InterfaceC20693) obj;
            default:
                return ((AbstractC16579) obj).mo5593();
        }
    }
}
