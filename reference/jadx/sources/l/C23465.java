package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23465 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75986;

    public /* synthetic */ C23465(int i, Object obj) {
        this.f75985 = i;
        this.f75986 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f75985) {
            case 0:
                return C14293.m34524((C14293) this.f75986, (String) obj);
            default:
                return ((MaterialDynamicColors) this.f75986).lambda$tertiaryFixedDim$136((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }
}
