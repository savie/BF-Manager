package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67CD */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15364 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50122;

    public /* synthetic */ C15364(int i) {
        this.f50122 = i;
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
        switch (this.f50122) {
            case 0:
                return Integer.valueOf(((EnumC13127) obj).m32608());
            case 1:
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + "=" + ((String) entry.getValue());
        }
    }
}
