package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22124 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71624;

    public /* synthetic */ C22124(int i) {
        this.f71624 = i;
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
        switch (this.f71624) {
            case 0:
                return C0252.m1693("ecdsa-sha2-", (String) obj);
            case 1:
                return new C4715((C17367) obj);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            default:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
        }
    }
}
