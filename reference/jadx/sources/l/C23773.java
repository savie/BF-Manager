package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23773 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77023;

    public /* synthetic */ C23773(int i) {
        this.f77023 = i;
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
        switch (this.f77023) {
            case 0:
                return ((C21120) obj).m48220().toLowerCase();
            case 1:
                return ((EnumC2536) obj).m8458();
            case 2:
                return new C15632();
            case 3:
                return (C2494) ((InterfaceC2386) obj);
            case 4:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
            case 7:
                return (CharSequence) ((Map.Entry) obj).getKey();
            case 8:
                return String.format("??? Invalid constant_pool reference #%d", (Integer) obj);
            default:
                return ((EnumC11979) obj).name();
        }
    }
}
