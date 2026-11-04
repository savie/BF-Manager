package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10346 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32961;

    public /* synthetic */ C10346(int i) {
        this.f32961 = i;
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
        switch (this.f32961) {
            case 0:
                return new C24913((C20348) obj);
            case 1:
                return new C9577(((C20348) obj).m46758());
            case 2:
                return ((C19716) obj).f63460;
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            case 5:
                return ((InterfaceC13673) obj).getName();
            case 6:
                return (InterfaceC10838) ((AbstractC20997) obj);
            default:
                return ((EnumC24688) obj).toString();
        }
    }
}
