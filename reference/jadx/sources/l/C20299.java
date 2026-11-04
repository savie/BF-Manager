package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: YITH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20299 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65159;

    public /* synthetic */ C20299(int i) {
        this.f65159 = i;
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
        switch (this.f65159) {
            case 0:
                return new C10907((C6129) obj);
            case 1:
                return ((C1723) obj).f5880;
            case 2:
                return ((DynamicScheme) obj).errorPalette;
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            case 5:
                return new C13145((InterfaceC3560) ((InterfaceC17730) obj));
            case 6:
                return ((C21943) obj).m49643();
            case 7:
                ((C2457) obj).m8280().getClass();
                return "dex-input";
            case 8:
                return ((StringBuilder) obj).toString();
            default:
                C19113 c19113 = (C19113) obj;
                if (c19113.m44237() != null) {
                    return C11239.m28338(c19113.m44237().f32980);
                }
                return null;
        }
    }
}
