package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23788 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76915;

    public /* synthetic */ C23788(int i) {
        this.f76915 = i;
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
        switch (this.f76915) {
            case 0:
                return C21920.m48729((C17367) obj);
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return new HashMap();
        }
    }
}
