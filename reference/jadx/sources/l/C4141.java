package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4141 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15148;

    public /* synthetic */ C4141(int i) {
        this.f15148 = i;
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
        switch (this.f15148) {
            case 0:
                Object objM15313 = C5553.m15313((String) obj, new String[0]);
                return objM15313 instanceof InterfaceC16034 ? ((InterfaceC16034) objM15313).mo8445() : objM15313;
            case 1:
                return new C20098((C17367) obj);
            case 2:
                return ((PackageInfo) obj).applicationInfo.sourceDir;
            case 3:
                return ((C6189) obj).m17194();
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralVariantPalette;
        }
    }
}
