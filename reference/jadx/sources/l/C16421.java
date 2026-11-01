package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16421 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52838;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52839;

    public /* synthetic */ C16421(int i, Object obj) {
        this.f52838 = i;
        this.f52839 = obj;
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
        switch (this.f52838) {
            case 0:
                return Boolean.valueOf(!((EnumC12490) obj).equals(((InterfaceC19775) this.f52839).mo1801()));
            case 1:
                return ((MaterialDynamicColors) this.f52839).lambda$tertiary$81((DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f52839).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}
