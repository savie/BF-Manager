package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1443 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5910;

    public /* synthetic */ C1443(int i) {
        this.f5910 = i;
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
        switch (this.f5910) {
            case 0:
                return C15556.m37195((AbstractC20745) obj);
            case 1:
                return ((C9166) obj).m23581();
            case 2:
                return C13638.toString((EnumC17465) obj);
            case 3:
                return AbstractC12233.m30337((C17367) obj);
            case 4:
                return ((InterfaceC9354) obj).mo24002();
            case 5:
                return new ArrayList();
            case 6:
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            case 8:
                return C16523.m38890("\"", (String) obj, "\"");
            default:
                return C11521.of(((InterfaceC1984) obj).m6395());
        }
    }
}
