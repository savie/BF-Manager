package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3900 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13293;

    public /* synthetic */ C3900(int i) {
        this.f13293 = i;
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
        switch (this.f13293) {
            case 0:
                return ((C14340) obj).f45235;
            case 1:
                return new ArrayList();
            case 2:
                return new C3109((C20348) obj);
            case 3:
                return new ArrayList();
            case 4:
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
                if (!interfaceC2386.isDirectory()) {
                    return interfaceC2386.getPath();
                }
                return interfaceC2386.getPath() + "/";
            case 5:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            case 7:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 8:
                return ((InterfaceC20640) obj).getType();
            case 9:
                return ((EnumC23570) obj).m52768();
            default:
                return new LinkedHashSet();
        }
    }
}
