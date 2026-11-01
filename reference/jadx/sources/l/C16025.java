package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16025 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51856;

    public /* synthetic */ C16025(int i) {
        this.f51856 = i;
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
        switch (this.f51856) {
            case 0:
                return new HashSet();
            case 1:
                return new C9061("", ((C0176) obj).m1373());
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return ((C6656) obj).f22475.f77453;
            default:
                return ((InterfaceC6157) obj).toString();
        }
    }
}
