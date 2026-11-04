package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14062 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44517;

    public /* synthetic */ C14062(int i) {
        this.f44517 = i;
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
        switch (this.f44517) {
            case 0:
                C14150 c14150 = (C14150) obj;
                EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
                return new C7110(c14150.m34370(), (String) c14150.f61429);
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
            case 3:
                return new ArrayList();
            default:
                return ((C12510) obj).f40168.f38072;
        }
    }
}
