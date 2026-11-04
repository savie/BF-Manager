package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66FP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13105 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41887;

    public /* synthetic */ C13105(int i) {
        this.f41887 = i;
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
        switch (this.f41887) {
            case 0:
                return ((PackageInfo) obj).packageName;
            case 1:
                int i = C19041.f61676;
                return new SharedPreferencesC6074();
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 5:
                return obj == C14287.f45114 ? "default" : obj.toString();
            case 6:
                return new ArrayList(2);
            case 7:
                return Boolean.valueOf(((String) obj).contains("module-info."));
            default:
                return ((C0180) obj).f1262;
        }
    }
}
