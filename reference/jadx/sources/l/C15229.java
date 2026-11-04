package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15229 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49691;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49692;

    public /* synthetic */ C15229(int i, Object obj) {
        this.f49691 = i;
        this.f49692 = obj;
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
        switch (this.f49691) {
            case 0:
                C24927 c24927 = (C24927) this.f49692;
                InterfaceC1213 interfaceC1213 = (InterfaceC1213) obj;
                C17467 c17467 = new C17467(c24927, C14022.m34143(c24927.mo8527(), interfaceC1213), interfaceC1213.mo4433());
                c17467.m39411(interfaceC1213.getAttributes());
                return c17467;
            case 1:
                return ((MaterialDynamicColors) this.f49692).lambda$onTertiaryContainer$90((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f49692).lambda$tertiaryFixedDim$136((DynamicScheme) obj);
        }
    }
}
