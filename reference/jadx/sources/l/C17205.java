package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17205 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56056;

    public /* synthetic */ C17205(int i) {
        this.f56056 = i;
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
        switch (this.f56056) {
            case 0:
                return ((C1345) obj).m4965();
            case 1:
                return C12276.m30656((C20348) obj);
            case 2:
                return new C6004((AbstractC22044) obj);
            case 3:
                return ((C8667) obj).m23346();
            case 4:
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            default:
                return ((InterfaceC9769) obj).toString();
        }
    }
}
