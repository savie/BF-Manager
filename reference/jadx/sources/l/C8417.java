package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8417 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27573;

    public /* synthetic */ C8417(int i) {
        this.f27573 = i;
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
        switch (this.f27573) {
            case 0:
                int i = C6926.f22930;
                return C14584.m35193((String) obj, new String[0]);
            case 1:
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
                int i2 = C20876.f66820;
                if (!interfaceC2386.isDirectory()) {
                    return interfaceC2386.getPath();
                }
                return interfaceC2386.getPath() + "/";
            case 2:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            case 3:
                return ((DynamicScheme) obj).primaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return C1170.stream((Set) entry.getValue()).map(new C3144(1, ((EnumC17315) entry.getKey()).name()));
            default:
                return new ArrayList(1);
        }
    }
}
