package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17437 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55537;

    public /* synthetic */ C17437(int i) {
        this.f55537 = i;
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
        switch (this.f55537) {
            case 0:
                return ((C6148) obj).f21002;
            case 1:
                return ((Thread) ((Map.Entry) obj).getKey()).getName();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            case 4:
                return Integer.valueOf(((String) obj).length());
            default:
                return C23879.m52616((EnumC0573) obj);
        }
    }
}
