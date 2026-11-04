package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9714 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31347;

    public /* synthetic */ C9714(int i) {
        this.f31347 = i;
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
        switch (this.f31347) {
            case 0:
                return ((C8969) obj).f29259;
            case 1:
                int i = C7672.f25266;
                return C14584.m35193((String) obj, new String[0]);
            case 2:
                return C14584.m35193((String) obj, new String[0]);
            case 3:
                return C22015.m49799((AbstractC22044) obj);
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 6:
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
            default:
                return C14769.m35543();
        }
    }
}
