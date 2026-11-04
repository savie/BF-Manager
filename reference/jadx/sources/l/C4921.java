package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIYD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4921 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17175;

    public /* synthetic */ C4921(int i) {
        this.f17175 = i;
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
        switch (this.f17175) {
            case 0:
                return ((C17973) obj).m41941();
            case 1:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 2:
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
            case 4:
                return 1;
            case 5:
                return C1170.stream(((C21351) obj).f68007);
            default:
                return C22843.m51549(EnumC7466.f24678, EnumC7466.f24603);
        }
    }
}
