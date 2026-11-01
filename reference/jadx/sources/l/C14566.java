package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14566 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47671;

    public /* synthetic */ C14566(int i) {
        this.f47671 = i;
    }

    public /* synthetic */ C14566(C20724 c20724) {
        this.f47671 = 1;
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
        switch (this.f47671) {
            case 0:
                return (InterfaceC12387) ((AbstractC6741) obj);
            case 1:
                return ((AbstractC20745) obj).getName();
            case 2:
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            default:
                return (Iterator) obj;
        }
    }
}
