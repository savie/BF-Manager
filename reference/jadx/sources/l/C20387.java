package l;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6HV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20387 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65365;

    public /* synthetic */ C20387(int i, Object obj) {
        this.f65364 = i;
        this.f65365 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f65364) {
            case 0:
                return C21133.m48231((HashMap) this.f65365, (C17467) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f65365, (DynamicScheme) obj);
            case 2:
                return ((MaterialDynamicColors) this.f65365).lambda$primaryFixed$105((DynamicScheme) obj);
            default:
                return (AbstractC1566) ((List) this.f65365).get(((Integer) obj).intValue());
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
