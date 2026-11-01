package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7497 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24965;

    public /* synthetic */ C7497(int i) {
        this.f24965 = i;
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
        switch (this.f24965) {
            case 0:
                return ((C23540) obj).m51888().toLowerCase();
            case 1:
                return C21766.m48522((C4853) obj);
            case 2:
                return ((C4316) obj).f15499;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return ((EnumC9728) obj).m24689();
            case 8:
                C9979 c9979 = (C9979) obj;
                EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
                return new C19879(c9979.m25242(), (String) c9979.f43680);
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
