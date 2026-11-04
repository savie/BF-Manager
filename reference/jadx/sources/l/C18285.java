package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18285 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59632;

    public /* synthetic */ C18285(int i) {
        this.f59632 = i;
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
        switch (this.f59632) {
            case 0:
                return (C16946) ((Map.Entry) obj).getValue();
            case 1:
                return ((C13395) obj).m33027();
            case 2:
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            case 3:
                return ((EnumC5202) obj).m15646();
            case 4:
                return "#" + ((Integer) obj);
            case 5:
                return ((C5816) obj).f38072;
            case 6:
                return ((C5816) obj).f38072;
            default:
                return (String) ((C23787) obj).m53058();
        }
    }
}
