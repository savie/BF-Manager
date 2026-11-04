package l;

import android.text.SpannableStringBuilder;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2573 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8261;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8262;

    public /* synthetic */ C2573(int i, Object obj) {
        this.f8261 = i;
        this.f8262 = obj;
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
        int i = this.f8261;
        Object obj2 = this.f8262;
        switch (i) {
            case 0:
                return AbstractC1566.m5532((C1610) obj2, (AbstractC1566) obj);
            case 1:
                return (SpannableStringBuilder) ((C21557) obj2).invoke(obj);
            case 2:
                return ((MaterialDynamicColors) obj2).lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
            default:
                return ((C22422) obj2).m47990(9, "exports").concat(String.format("%s;%n", ((C10092) ((Map.Entry) obj).getKey()).toString()));
        }
    }
}
