package l;

import bin.mt.plus.Features;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 350S */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18980 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61526;

    public /* synthetic */ C18980(int i) {
        this.f61526 = i;
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
        switch (this.f61526) {
            case 0:
                return Features.uid2name(((Integer) obj).intValue());
            case 1:
                return C1170.stream(((C23747) obj).f76957);
            case 2:
                return ((InterfaceC2386) obj).getName().toLowerCase();
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 6:
                return C25272.m56409("ecdsa-sha2-", (String) obj);
            case 7:
                return new HashSet();
            case 8:
                return ((InterfaceC6281) obj).mo1988();
            case 9:
                return ((AbstractC16481) obj).mo17528();
            default:
                return ((C21943) obj).m49639();
        }
    }
}
