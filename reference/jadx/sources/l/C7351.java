package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7351 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24193;

    public /* synthetic */ C7351(int i) {
        this.f24193 = i;
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
        switch (this.f24193) {
            case 0:
                C14150 c14150 = (C14150) obj;
                EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
                return new C7110(c14150.m34370(), (String) c14150.f61429);
            case 1:
                return ((C13395) obj).m33026();
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                return ((C8456) obj).toString();
            case 6:
                return ((C12510) obj).f40168.f38067;
            case 7:
                return C1170.stream(((C21351) obj).f68007);
            default:
                return C22843.m51549(EnumC7466.f24678, EnumC7466.f24603);
        }
    }
}
