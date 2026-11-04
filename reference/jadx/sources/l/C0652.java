package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0652 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2518;

    public /* synthetic */ C0652(int i) {
        this.f2518 = i;
    }

    public /* synthetic */ C0652(C13586 c13586) {
        this.f2518 = 6;
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
        switch (this.f2518) {
            case 0:
                return new C20766((C20348) obj);
            case 1:
                return C11969.f38536;
            case 2:
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$142((DynamicScheme) obj);
            case 3:
                return ((EnumC23570) obj).m52766();
            case 4:
                return "#" + ((Integer) obj);
            case 5:
                return (C20605) ((AbstractC22295) obj);
            default:
                return C13586.m33295((InterfaceC23942) obj);
        }
    }
}
