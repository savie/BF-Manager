package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6CM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9746 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31435;

    public /* synthetic */ C9746(int i) {
        this.f31435 = i;
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
        switch (this.f31435) {
            case 0:
                return ((InterfaceC21197) obj).mo8532().m49700().m4959();
            case 1:
                return ((C1200) obj).m4414();
            case 2:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            case 3:
                return ((InterfaceC24329) obj).toFile();
            case 4:
                return new HashSet();
            case 5:
                int i = C0442.f2008;
                return null;
            default:
                return new HashSet();
        }
    }
}
