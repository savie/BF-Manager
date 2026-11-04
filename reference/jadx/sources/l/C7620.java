package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIVL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7620 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25153;

    public /* synthetic */ C7620(int i) {
        this.f25153 = i;
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
        switch (this.f25153) {
            case 0:
                return ((C0908) obj).m3676();
            case 1:
                return new AtomicInteger();
            case 2:
                return ((Thread) ((Map.Entry) obj).getKey()).getName();
            case 3:
                int i = C11727.f37935;
                return new ArrayList();
            case 4:
                return ((C19382) obj).f62621;
            case 5:
                return C16705.m39471((String) obj);
            case 6:
                return ((DynamicScheme) obj).errorPalette;
            case 7:
                return ((DynamicScheme) obj).neutralPalette;
            case 8:
                return MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
            case 9:
                return ((C21943) obj).m49646();
            default:
                return "#" + ((Integer) obj);
        }
    }
}
