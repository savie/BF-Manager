package l;

import android.text.SpannableStringBuilder;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23870 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77136;

    public /* synthetic */ C23870(int i, Object obj) {
        this.f77135 = i;
        this.f77136 = obj;
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
        switch (this.f77135) {
            case 0:
                return (SpannableStringBuilder) ((C11170) this.f77136).invoke(obj);
            case 1:
                return ((MaterialDynamicColors) this.f77136).lambda$primary$54((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f77136).lambda$onBackground$14((DynamicScheme) obj);
        }
    }
}
