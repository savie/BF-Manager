package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1533 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6233;

    public /* synthetic */ C1533(int i) {
        this.f6233 = i;
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
        switch (this.f6233) {
            case 0:
                return ((EnumC4438) obj).name();
            case 1:
                return C8809.m22928((C17367) obj);
            case 2:
                return new ArrayList();
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                return ((C6204) obj).mo14317();
            case 7:
                return (C6656) C6656.class.cast((InterfaceC17428) obj);
            case 8:
                return ((StringBuilder) obj).toString();
            case 9:
                return (InterfaceC12387) ((AbstractC6741) obj);
            default:
                return ((C6948) obj).f23371;
        }
    }
}
