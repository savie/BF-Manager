package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19603 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63183;

    public /* synthetic */ C19603(int i, Object obj) {
        this.f63182 = i;
        this.f63183 = obj;
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
        switch (this.f63182) {
            case 0:
                return ActivityC0848.m3411((ActivityC0848) this.f63183, (AbstractC9051) obj);
            case 1:
                C23255 c23255 = (C23255) this.f63183;
                return c23255.m54099() == 0 ? (CharSequence) obj : c23255.m54021();
            default:
                return ((MaterialDynamicColors) this.f63183).lambda$errorContainer$99((DynamicScheme) obj);
        }
    }
}
