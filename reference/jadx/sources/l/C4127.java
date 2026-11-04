package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4127 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13995;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13996;

    public /* synthetic */ C4127(int i, Object obj) {
        this.f13995 = i;
        this.f13996 = obj;
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
        switch (this.f13995) {
            case 0:
                C22422 c22422 = (C22422) this.f13996;
                c22422.getClass();
                return c22422.m48011(9, ((C7110) obj).toString());
            default:
                return ((MaterialDynamicColors) this.f13996).lambda$tertiaryContainer$87((DynamicScheme) obj);
        }
    }
}
