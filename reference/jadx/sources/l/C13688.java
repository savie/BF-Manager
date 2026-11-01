package l;

import bin.mt.plus.Features;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 350S */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13688 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45153;

    public /* synthetic */ C13688(int i) {
        this.f45153 = i;
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
        switch (this.f45153) {
            case 0:
                return Features.uid2name(((Integer) obj).intValue());
            case 1:
                int i = C23523.f76125;
                return new SharedPreferencesC10259();
            case 2:
                return C8289.m21708((C17367) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return "#" + ((Integer) obj);
            case 5:
                return ((Map) obj).values().iterator();
            default:
                return C23879.m52617(EnumC0573.f2484, EnumC0573.f2433);
        }
    }
}
