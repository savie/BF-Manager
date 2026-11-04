package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16910 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55303;

    public /* synthetic */ C16910(int i, Object obj) {
        this.f55302 = i;
        this.f55303 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f55302) {
            case 0:
                return Boolean.valueOf(C3486.m11472((C3486) this.f55303, (C2551) obj));
            default:
                return ((MaterialDynamicColors) this.f55303).lambda$onPrimaryFixed$111((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
