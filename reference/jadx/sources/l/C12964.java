package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12964 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43076;

    public /* synthetic */ C12964(int i) {
        this.f43076 = i;
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
        switch (this.f43076) {
            case 0:
                return C6730.m18175((String) obj);
            case 1:
                int i = C18021.f57621;
                return new ArrayList();
            case 2:
                return ((C12107) obj).getName();
            case 3:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((C6263) obj).f77453;
            default:
                return ((InterfaceC9105) obj).toString();
        }
    }
}
