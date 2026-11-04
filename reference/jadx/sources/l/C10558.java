package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10558 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33546;

    public /* synthetic */ C10558(int i) {
        this.f33546 = i;
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
        switch (this.f33546) {
            case 0:
                return ((C24927) obj).m55573();
            case 1:
                return ((C1260) obj).f4542;
            case 2:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            default:
                return new HashSet();
        }
    }
}
