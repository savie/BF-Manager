package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: UIX4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4527 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16119;

    public /* synthetic */ C4527(int i) {
        this.f16119 = i;
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
        switch (this.f16119) {
            case 0:
                return new ArrayList();
            case 1:
                return new C15102((C20348) obj);
            case 2:
                return ((InterfaceC2386) obj).getPath();
            case 3:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            case 6:
                return new ArrayList();
            case 7:
                return ((EnumC16110) obj).m38277();
            default:
                return new LinkedHashMap();
        }
    }
}
