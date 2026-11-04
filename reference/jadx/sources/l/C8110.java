package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8110 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26774;

    public /* synthetic */ C8110(int i) {
        this.f26774 = i;
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
        switch (this.f26774) {
            case 0:
                return new C6728((C20348) obj);
            case 1:
                return C24320.m54358((C20348) obj);
            case 2:
                return ((PackageInfo) obj).applicationInfo.sourceDir;
            case 3:
                return C6574.m18493((CharSequence) obj);
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return C11719.of(((C20586) obj).getLength());
            case 6:
                return (InterfaceC10838) ((AbstractC20997) obj);
            default:
                int i = C23914.f77423;
                return "?";
        }
    }
}
