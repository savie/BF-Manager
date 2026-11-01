package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12740 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42495;

    public /* synthetic */ C12740(int i) {
        this.f42495 = i;
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
        switch (this.f42495) {
            case 0:
                return ((EnumC7501) obj).f24977;
            case 1:
                return ((C6148) obj).m17153();
            case 2:
                return ((DynamicScheme) obj).errorPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 5:
                return Boolean.valueOf(((String) obj).contains("package-info."));
            case 6:
                return "#" + ((Integer) obj);
            default:
                return C9030.stream(((C18630) obj).f60400);
        }
    }
}
