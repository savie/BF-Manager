package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8215 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28596;

    public /* synthetic */ C8215(int i) {
        this.f28596 = i;
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
        switch (this.f28596) {
            case 0:
                return C9030.stream(((AbstractC12449) obj).m30922()).filter(new C16173(4));
            case 1:
                return C5553.m15313((String) obj, new String[0]);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return ((C16788) obj).m39440();
            default:
                return C23879.m52617(EnumC0573.f2484, EnumC0573.f2433);
        }
    }
}
