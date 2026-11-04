package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9587 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31017;

    public /* synthetic */ C9587(int i) {
        this.f31017 = i;
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
        switch (this.f31017) {
            case 0:
                return Boolean.valueOf(((String) obj).contains("package-info."));
            case 1:
                return new ArrayList();
            case 2:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) ((C19684) obj).m45368());
                C17359.requireNonNull(c18959M52200);
                return c18959M52200.m44027();
            case 6:
                return (Integer) obj;
            case 7:
                return ((C0253) obj).toString();
            case 8:
                return new HashMap();
            case 9:
                return (C24550) ((AbstractC22664) obj).f73596;
            default:
                return C22843.m51548((EnumC7466) obj);
        }
    }
}
