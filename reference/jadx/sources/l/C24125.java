package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24125 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77971;

    public /* synthetic */ C24125(int i) {
        this.f77971 = i;
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
        switch (this.f77971) {
            case 0:
                return ((C5675) obj).m16686();
            case 1:
                return new HashMap();
            case 2:
                return MaterialDynamicColors.lambda$error$92((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return ((C2551) obj).m8536();
            default:
                return (AbstractC22295) ((AbstractC18367) obj);
        }
    }
}
