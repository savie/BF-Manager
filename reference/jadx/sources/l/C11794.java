package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11794 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38096;

    public /* synthetic */ C11794(int i) {
        this.f38096 = i;
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
        switch (this.f38096) {
            case 0:
                String strMo8114 = ((InterfaceC2386) obj).mo8114();
                return (strMo8114.equals("application/vnd.android.package-archive") && C9034.m24094()) ? "application/octet-stream" : strMo8114;
            case 1:
                return ((DynamicScheme) obj).neutralPalette;
            case 2:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 3:
                return Integer.valueOf(((String) obj).length());
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
