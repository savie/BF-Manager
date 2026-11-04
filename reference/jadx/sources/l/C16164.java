package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16164 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52471;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52472;

    public /* synthetic */ C16164(int i, Object obj) {
        this.f52471 = i;
        this.f52472 = obj;
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
        switch (this.f52471) {
            case 0:
                return Boolean.valueOf(C3486.m11471((C3486) this.f52472, (C2551) obj));
            case 1:
                return ((MaterialDynamicColors) this.f52472).lambda$onPrimaryContainer$63((DynamicScheme) obj);
            default:
                return ((InterfaceC8344) obj).mo2971((C24705) this.f52472);
        }
    }
}
