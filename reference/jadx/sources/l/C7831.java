package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7831 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25765;

    public /* synthetic */ C7831(int i) {
        this.f25765 = i;
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
        switch (this.f25765) {
            case 0:
                return ((C1250) obj).m4474();
            case 1:
                return ((C22722) obj).f74022;
            case 2:
                return ((EnumC10297) obj).f35326;
            case 3:
                return ((C5032) obj).f17548;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
        }
    }
}
