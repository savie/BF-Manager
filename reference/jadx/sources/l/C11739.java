package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11739 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39467;

    public /* synthetic */ C11739(int i) {
        this.f39467 = i;
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
        switch (this.f39467) {
            case 0:
                return ((C2565) obj).f10124;
            case 1:
                int i = C1749.f6874;
                return C5553.m15313((String) obj, new String[0]);
            case 2:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 3:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            case 6:
                return ((C6656) obj).f22475.f77449;
            default:
                return ((InterfaceC9105) obj).toString();
        }
    }
}
