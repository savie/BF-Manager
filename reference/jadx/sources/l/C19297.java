package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.BitSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19297 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62371;

    public /* synthetic */ C19297(int i) {
        this.f62371 = i;
    }

    public /* synthetic */ C19297(C13586 c13586) {
        this.f62371 = 5;
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
        switch (this.f62371) {
            case 0:
                return new C21227((C20348) obj);
            case 1:
                return C11312.m28585((C20348) obj);
            case 2:
                return ((C1392) obj).f4951;
            case 3:
                return new BitSet();
            case 4:
                return ((DynamicScheme) obj).errorPalette;
            default:
                return C13586.m33294((InterfaceC14244) obj);
        }
    }
}
