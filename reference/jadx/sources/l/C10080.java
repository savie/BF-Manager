package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10080 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32319;

    public /* synthetic */ C10080(int i) {
        this.f32319 = i;
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
        switch (this.f32319) {
            case 0:
                return ((C9442) obj).f30622;
            case 1:
                int i = AbstractActivityC10144.f32485;
                return ((C11636) obj).f36488;
            case 2:
                return new C7495((C20348) obj);
            case 3:
                return "$RECYCLE.BIN$" + ((InterfaceC2386) obj).getPath();
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                return (InterfaceC8409) obj;
            default:
                return "#" + ((Integer) obj);
        }
    }
}
