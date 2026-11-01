package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21051 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68572;

    public /* synthetic */ C21051(int i) {
        this.f68572 = i;
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
        switch (this.f68572) {
            case 0:
                return ((C20346) ((Map.Entry) obj).getValue()).f65894;
            case 1:
                int i = AbstractActivityC5788.f19654;
                return ((C22722) obj).f74022;
            case 2:
                return C5445.m15068((C17367) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            case 6:
                return ((C4793) obj).m13309();
            case 7:
                int i2 = C17056.f54462;
                return null;
            default:
                return ((C19003) obj).m43726();
        }
    }
}
