package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3398 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11053;

    public /* synthetic */ C3398(int i) {
        this.f11053 = i;
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
        switch (this.f11053) {
            case 0:
                return ((AbstractC22044) obj).getName();
            case 1:
                C14126 c14126 = (C14126) obj;
                return c14126.m34332() + ": " + c14126.m34333();
            case 2:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return (Integer) ((C24019) obj).m53574().m7922();
            case 5:
                return AbstractC1566.m5535((String) obj);
            case 6:
                return ((C1345) obj).m4971();
            default:
                return C22843.m51549(EnumC7466.f24678, EnumC7466.f24603);
        }
    }
}
