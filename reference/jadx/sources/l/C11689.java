package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11689 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37853;

    public /* synthetic */ C11689(int i, Object obj) {
        this.f37852 = i;
        this.f37853 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f37852) {
            case 0:
                return Boolean.valueOf(C3486.m11467((C3486) this.f37853, (C2551) obj));
            case 1:
                return ((MaterialDynamicColors) this.f37853).lambda$onSecondaryContainer$77((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f37853).lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
