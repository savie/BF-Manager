package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1EG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12078 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38889;

    public /* synthetic */ C12078(int i, Object obj) {
        this.f38888 = i;
        this.f38889 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f38888) {
            case 0:
                return (C1441) ((HashMap) this.f38889).get((AbstractC22044) obj);
            case 1:
                return ((MaterialDynamicColors) this.f38889).lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f38889).lambda$inversePrimary$66((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
