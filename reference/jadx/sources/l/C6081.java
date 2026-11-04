package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6081 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20805;

    public /* synthetic */ C6081(int i) {
        this.f20805 = i;
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
        switch (this.f20805) {
            case 0:
                return String.format("#%d?", (Integer) obj);
            case 1:
                return ((C23330) obj).f75565;
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
            default:
                return ((C4171) obj).toString();
        }
    }
}
