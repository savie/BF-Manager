package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7459 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24853;

    public /* synthetic */ C7459(int i) {
        this.f24853 = i;
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
        switch (this.f24853) {
            case 0:
                return ((C21601) obj).f70066;
            case 1:
                return new C14865(((C17367) obj).m40458());
            case 2:
                return ((PackageInfo) obj).packageName;
            case 3:
                return ((C4525) obj).f16107;
            case 4:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            default:
                return (String) ((C1321) obj).m4718();
        }
    }
}
