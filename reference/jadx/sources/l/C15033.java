package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15033 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49073;

    public /* synthetic */ C15033(int i) {
        this.f49073 = i;
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
        switch (this.f49073) {
            case 0:
                return ((C24927) obj).m55569();
            case 1:
                return ((DynamicScheme) obj).neutralPalette;
            case 2:
                return MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return new ArrayList();
            case 5:
                return ((C17467) ((Map.Entry) obj).getKey()).mo13008();
            case 6:
                ((InterfaceC24334) obj).mo33125();
                return "dex-input";
            default:
                return C1170.stream(((C21351) obj).f68007);
        }
    }
}
