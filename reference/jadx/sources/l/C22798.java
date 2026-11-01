package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22798 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74188;

    public /* synthetic */ C22798(int i, Object obj) {
        this.f74187 = i;
        this.f74188 = obj;
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
        switch (this.f74187) {
            case 0:
                return ActivityC5677.m15624((ActivityC5677) this.f74188, (AbstractC22611) obj);
            case 1:
                return (C5546) ((C2723) this.f74188).invoke(obj);
            default:
                return ((MaterialDynamicColors) this.f74188).lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
        }
    }
}
