package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15431 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50276;

    public /* synthetic */ C15431(int i) {
        this.f50276 = i;
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
        switch (this.f50276) {
            case 0:
                return ((AbstractC22891) obj).m51622();
            case 1:
                return C17359.toString((EnumC8815) obj);
            case 2:
                return new ArrayList();
            case 3:
                return new ArrayList(((Integer) obj).intValue());
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return String.format("#%d?", (Integer) obj);
        }
    }
}
