package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7290 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24009;

    public /* synthetic */ C7290(int i, Object obj) {
        this.f24008 = i;
        this.f24009 = obj;
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
        switch (this.f24008) {
            case 0:
                return C11239.m28325((AbstractC11781) this.f24009, (AbstractC8036) obj, false);
            case 1:
                return ((MaterialDynamicColors) this.f24009).lambda$onTertiaryFixed$139((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f24009).lambda$secondaryFixedDim$122((DynamicScheme) obj);
        }
    }
}
