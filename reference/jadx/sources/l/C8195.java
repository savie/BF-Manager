package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8195 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27013;

    public /* synthetic */ C8195(int i) {
        this.f27013 = i;
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
        switch (this.f27013) {
            case 0:
                return ((C19382) obj).f62622;
            case 1:
                return ((C11636) obj).f36488;
            case 2:
                return ((C8950) ((Map.Entry) obj).getValue()).f29202;
            case 3:
                return ((C14340) obj).m34760();
            case 4:
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
            case 6:
                return ((C9384) obj).mo24709();
            case 7:
                return AbstractC1566.m5526((String) obj);
            case 8:
                return "#" + ((Integer) obj);
            default:
                return ((Map) obj).values().iterator();
        }
    }
}
