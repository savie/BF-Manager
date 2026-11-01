package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22781 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74161;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74162;

    public /* synthetic */ C22781(int i, Object obj) {
        this.f74161 = i;
        this.f74162 = obj;
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
        switch (this.f74161) {
            case 0:
                InterfaceC3800 interfaceC3800 = (InterfaceC3800) obj;
                ((C15020) this.f74162).getClass();
                try {
                    return C11521.of(C5212.readAttributes(interfaceC3800, InterfaceC20735.class, new EnumC22146[0]));
                } catch (IOException unused) {
                    return C11521.empty();
                }
            case 1:
                return ((MaterialDynamicColors) this.f74162).lambda$onTertiaryFixed$139((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f74162).lambda$onPrimaryContainer$62((DynamicScheme) obj);
        }
    }
}
