package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23173 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75092;

    public /* synthetic */ C23173(int i) {
        this.f75092 = i;
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
        switch (this.f75092) {
            case 0:
                return ((C1345) obj).m4959();
            case 1:
                int i = C19077.f61782;
                return C3281.m10818((String) obj, EnumC12230.MODIFY_DIRECTORY);
            case 2:
                return ((PackageInfo) obj).packageName;
            case 3:
                return new ArrayList();
            case 4:
                return ((InterfaceC14906) obj).mo10207();
            case 5:
                return ((DynamicScheme) obj).neutralPalette;
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return ((C4571) obj).toString();
        }
    }
}
