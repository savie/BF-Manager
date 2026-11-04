package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5724 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19733;

    public /* synthetic */ C5724(int i, Object obj) {
        this.f19732 = i;
        this.f19733 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f19732) {
            case 0:
                return C3486.m11460((C3486) this.f19733, (C2551) obj);
            default:
                return ((MaterialDynamicColors) this.f19733).lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
