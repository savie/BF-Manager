package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18663 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60586;

    public /* synthetic */ C18663(int i) {
        this.f60586 = i;
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
        switch (this.f60586) {
            case 0:
                String strMo7967 = ((InterfaceC2557) obj).mo7967();
                return (strMo7967.equals("application/vnd.android.package-archive") && C12597.m31375()) ? "application/octet-stream" : strMo7967;
            case 1:
                return ((C13080) obj).m32296();
            case 2:
                return (C5696) ((InterfaceC2557) obj);
            case 3:
                return ((C0787) obj).f3366;
            case 4:
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
                if (!interfaceC2557.isDirectory()) {
                    return interfaceC2557.getPath();
                }
                return interfaceC2557.getPath() + "/";
            case 5:
                return MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
            case 6:
                return ((C8317) obj).toString();
            case 7:
                return "#" + ((Integer) obj);
            case 8:
                return C21825.m48588();
            case 9:
                return Boolean.valueOf(((InterfaceC20735) obj).isRegularFile());
            default:
                return (AbstractC5930) ((AbstractC8047) obj);
        }
    }
}
