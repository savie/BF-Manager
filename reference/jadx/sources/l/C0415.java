package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0415 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1962;

    public /* synthetic */ C0415(int i) {
        this.f1962 = i;
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
        switch (this.f1962) {
            case 0:
                return ((File) obj).getPath();
            case 1:
                return (CharSequence) obj;
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            case 5:
                return ((Boolean) obj).booleanValue() ? "yes" : "no";
            case 6:
                return C12971.m32365((C12971) obj);
            default:
                return C1170.stream(((C21351) obj).f68007);
        }
    }
}
