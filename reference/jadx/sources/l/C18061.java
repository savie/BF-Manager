package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6I5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18061 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59131;

    public /* synthetic */ C18061(int i) {
        this.f59131 = i;
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
        switch (this.f59131) {
            case 0:
                return C2503.toPath((File) obj);
            case 1:
                return ((InterfaceC24329) obj).toString();
            case 2:
                return ((InterfaceC2386) obj).getName();
            case 3:
                return ((C19382) obj).f62622;
            case 4:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).primaryPalette;
            case 7:
                return new ArrayList();
            case 8:
                return C1170.stream((Set) obj);
            default:
                int i = C3381.f11010;
                return "???";
        }
    }
}
