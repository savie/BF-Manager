package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.BitSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16485 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52972;

    public /* synthetic */ C16485(int i) {
        this.f52972 = i;
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
        switch (this.f52972) {
            case 0:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 1:
                return new C11672((C17367) obj);
            case 2:
                return ((C18295) obj).f58374;
            case 3:
                return ((C23013) obj).f74796;
            case 4:
                return new BitSet();
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 7:
                return ((DynamicScheme) obj).neutralPalette;
            case 8:
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            case 9:
                return ((EnumC9728) obj).m24688();
            case 10:
                return ((EnumC20934) obj).m47092();
            case 11:
                return ((StackTraceElement) obj).toString();
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }
}
