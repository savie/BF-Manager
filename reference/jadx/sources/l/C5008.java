package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5008 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17420;

    public /* synthetic */ C5008(int i) {
        this.f17420 = i;
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
        switch (this.f17420) {
            case 0:
                return ((InterfaceC2557) obj).getName() + "/";
            case 1:
                return (C19146) ((Map.Entry) obj).getValue();
            case 2:
                return ((C2565) obj).f10122;
            case 3:
                String str = (String) obj;
                return str.startsWith("/") ? str.substring(1) : str;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((DynamicScheme) obj).secondaryPalette;
            case 6:
                return ((DynamicScheme) obj).errorPalette;
            case 7:
                return ((C6534) obj).toString();
            case 8:
                return String.format("#%d?", (Integer) obj);
            default:
                return ((EnumC4870) obj).toString();
        }
    }
}
