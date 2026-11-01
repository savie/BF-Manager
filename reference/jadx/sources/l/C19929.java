package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19929 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63864;

    public /* synthetic */ C19929(int i) {
        this.f63864 = i;
    }

    public /* synthetic */ C19929(C12590 c12590) {
        this.f63864 = 8;
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
        switch (this.f63864) {
            case 0:
                return ((InterfaceC2557) obj).getName();
            case 1:
                return ((InterfaceC2557) obj).getName().toLowerCase();
            case 2:
                return ((C14078) obj).m34060();
            case 3:
                return ((C2565) obj).f10124;
            case 4:
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            case 5:
                int i = C7240.f24124;
                return "????";
            case 6:
                return String.format("#%d?", (Integer) obj);
            case 7:
                return String.format("#%d", (Integer) obj);
            default:
                return C12590.m31330((InterfaceC15455) obj);
        }
    }
}
