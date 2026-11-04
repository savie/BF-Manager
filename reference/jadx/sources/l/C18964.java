package l;

import bin.mt.json.JSONValue;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18964 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61485;

    public /* synthetic */ C18964(int i) {
        this.f61485 = i;
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
        switch (this.f61485) {
            case 0:
                return ((EnumC6670) obj).f22242;
            case 1:
                return new ArrayList();
            case 2:
                return ((JSONValue) obj).asString();
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            case 5:
                return C1170.stream(((C21943) obj).m49646());
            case 6:
                return C1170.stream(((C21351) obj).f68007);
            default:
                return ((C18499) obj).m43093();
        }
    }
}
