package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RIV7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14672 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47972;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47973;

    public /* synthetic */ C14672(int i, Object obj) {
        this.f47972 = i;
        this.f47973 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f47972) {
            case 0:
                return C18402.m42912((C18402) this.f47973, (AbstractC1566) obj);
            default:
                return ((MaterialDynamicColors) this.f47973).lambda$secondaryContainer$75((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
