package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7777 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25643;

    public /* synthetic */ C7777(int i) {
        this.f25643 = i;
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
        switch (this.f25643) {
            case 0:
                C18255 c18255M25899 = ((C10164) obj).m25899();
                if (c18255M25899 != null) {
                    return C3128.m9460(c18255M25899.f58253);
                }
                return null;
            case 1:
                return new ArrayList();
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralVariantPalette;
            default:
                return Integer.valueOf(((EnumC16783) obj).m39427());
        }
    }
}
