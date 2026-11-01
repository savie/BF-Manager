package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13874 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45725;

    public /* synthetic */ C13874(int i) {
        this.f45725 = i;
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
        switch (this.f45725) {
            case 0:
                return C9030.stream((List) obj);
            case 1:
                return new C0176(((AbstractC20745) obj).m46718());
            case 2:
                return C8768.m22822((CharSequence) obj);
            case 3:
                return "$RECYCLE.BIN$" + ((InterfaceC2557) obj).getPath();
            case 4:
                return MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return (Integer) ((C16690) obj).m39161().m24409();
        }
    }
}
