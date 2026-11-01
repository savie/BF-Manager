package l;

import bin.mt.plus.R;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C22112 implements InterfaceC16127 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0944 f71593;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // l.InterfaceC6456
    public final /* synthetic */ boolean containsKey(Object obj) {
        return true;
    }

    @Override // l.InterfaceC6456
    public final /* synthetic */ Integer get(Object obj) {
        return C21065.m47474(this, obj);
    }

    @Override // l.InterfaceC6456
    public final /* synthetic */ int size() {
        return -1;
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public final int mo18019(int i, Object obj) {
        throw null;
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public final int mo18020(Object obj) {
        throw null;
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ܰ */
    public final int mo18022(Object obj) {
        return this.f71593.f3753.size() + R.anim.MT_Protector;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo18022(obj);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo33696andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
