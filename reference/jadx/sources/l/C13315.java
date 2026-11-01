package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13315 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44196;

    public /* synthetic */ C13315(int i) {
        this.f44196 = i;
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
        switch (this.f44196) {
            case 0:
                return ((File) obj).getPath();
            case 1:
                return new C9183((C17367) obj);
            case 2:
                int i = C17044.f54427;
                return C4579.m12723((String) obj, EnumC11636.MODIFY_DIRECTORY);
            case 3:
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 6:
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            case 7:
                return "#" + ((Integer) obj);
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }
}
