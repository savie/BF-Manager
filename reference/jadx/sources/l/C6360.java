package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6360 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21489;

    public /* synthetic */ C6360(int i) {
        this.f21489 = i;
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
        switch (this.f21489) {
            case 0:
                return ((C16800) obj).m39683();
            case 1:
                return ((C8002) obj).getName();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((C19684) obj).m45368();
            default:
                int i = C0224.f1435;
                return "invalid index into the constant_pool table";
        }
    }
}
