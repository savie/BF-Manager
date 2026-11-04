package l;

import bin.mt.plus.R;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7924 implements InterfaceC6804 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19111 f26340;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ boolean containsKey(Object obj) {
        return true;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ Integer get(Object obj) {
        return C8295.m22386(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ int size() {
        return -1;
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public final int mo7845(int i, Object obj) {
        throw null;
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public final int mo7846(Object obj) {
        throw null;
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7848(Object obj) {
        return this.f26340.f61851.size() + R.anim.MT_Protector;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo7848(obj);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo10608andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
