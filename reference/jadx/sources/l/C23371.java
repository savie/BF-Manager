package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6HV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23371 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75670;

    public /* synthetic */ C23371(int i) {
        this.f75670 = i;
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
        switch (this.f75670) {
            case 0:
                return new ArrayList();
            case 1:
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            default:
                return ((C22811) obj).m51441();
        }
    }
}
