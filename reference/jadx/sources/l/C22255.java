package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64SD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22255 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71667;

    public /* synthetic */ C22255(int i) {
        this.f71667 = i;
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
        switch (this.f71667) {
            case 0:
                return ((InterfaceC2731) obj).mo9074();
            case 1:
                return (String) ((Map.Entry) obj).getKey();
            case 2:
                return ((C17447) obj).f56744.toString();
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }
}
