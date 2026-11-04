package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.LinkedHashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12796 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40927;

    public /* synthetic */ C12796(int i) {
        this.f40927 = i;
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
        switch (this.f40927) {
            case 0:
                return new C5688((InterfaceC12509) ((InterfaceC17730) obj));
            case 1:
                return new C13576("", ((C18099) obj).m42221());
            case 2:
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((C19081) obj).m44194();
            case 6:
                return C1170.stream(((C21943) obj).mo1986());
            case 7:
                return new LinkedHashSet();
            case 8:
                return Boolean.valueOf(((InterfaceC8665) obj).isRegularFile());
            default:
                C14835 c14835M44238 = ((C19113) obj).m44238();
                if (c14835M44238 != null) {
                    return C11239.m28338(c14835M44238.f48522);
                }
                return null;
        }
    }
}
