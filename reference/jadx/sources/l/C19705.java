package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19705 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63441;

    public /* synthetic */ C19705(int i) {
        this.f63441 = i;
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
        switch (this.f63441) {
            case 0:
                return AbstractC1566.m5538((String) obj);
            case 1:
                return new C14052((C20348) obj);
            case 2:
                return ((InterfaceC2386) obj).getName() + "/";
            case 3:
                return ((String) obj).replace('/', '.');
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            case 6:
                return new ArrayList();
            default:
                return ((EnumC23570) obj).m52767();
        }
    }
}
