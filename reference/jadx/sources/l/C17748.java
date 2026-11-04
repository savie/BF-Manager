package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17748 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58297;

    public /* synthetic */ C17748(int i) {
        this.f58297 = i;
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
        switch (this.f58297) {
            case 0:
                return new HashMap();
            case 1:
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() + ": \n -> " + C4123.m13221((Iterable) entry.getValue(), "\n -> ");
            default:
                return C14769.m35543();
        }
    }
}
