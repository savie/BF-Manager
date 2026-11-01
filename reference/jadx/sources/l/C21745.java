package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21745 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70482;

    public /* synthetic */ C21745(int i) {
        this.f70482 = i;
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
        switch (this.f70482) {
            case 0:
                return ((AbstractC23157) obj).m51156();
            case 1:
                return ((EnumC15236) obj).m36500();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
            case 7:
                return ((EnumC16783) obj).m39431();
            case 8:
                int i = C5061.f17650;
                return "???";
            case 9:
                return ((C6263) obj).f77453;
            case 10:
                C10164 c10164 = (C10164) obj;
                if (c10164.m25894() != null) {
                    return C3128.m9460(c10164.m25894().f25385);
                }
                return null;
            default:
                return (C6656) ((AbstractC8774) obj);
        }
    }
}
