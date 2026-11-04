package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22773 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73883;

    public /* synthetic */ C22773(int i) {
        this.f73883 = i;
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
        switch (this.f73883) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            default:
                return C1170.stream(((InterfaceC6470) obj).mo18294());
        }
    }
}
