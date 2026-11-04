package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5WF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11154 implements InterfaceC8697, InterfaceC23057 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2731 f35129;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f35130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35131;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ boolean containsKey(Object obj) {
        return C11122.m28073(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        return C11122.m28075(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final /* synthetic */ int size() {
        return -1;
    }

    @Override // l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo13467(int i) {
        return true;
    }

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Object mo18702() {
        return null;
    }

    public AbstractC11154(InterfaceC2731 interfaceC2731, int i) {
        this.f35129 = interfaceC2731;
        this.f35131 = i;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7206 mo18150() {
        return this.f35129.mo9068();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۤ */
    public InterfaceC10869 mo18153() {
        return this.f35129.mo9071();
    }

    @Override // l.InterfaceC8697
    public InterfaceC15344 getType() {
        return this.f35129.getType();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC2731 mo18158() {
        return this.f35129;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۨ᩷ */
    public final int mo23383() {
        return this.f35131;
    }

    @Override // l.InterfaceC8697
    public final int getParent() {
        return this.f35130;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Iterable m28102() {
        return new C18613(mo18154(), this);
    }

    @Override // l.InterfaceC23057, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC8697
    public final String getPath() {
        return mo18158().getPath() + "/" + mo18156();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ᩷ۙ */
    public final int mo23384() {
        InterfaceC15344 type = getType();
        int iMo27607 = (type.mo4332().mo27607() & 255) << 24;
        return ((type.mo35833() & 255) << 16) | iMo27607 | (this.f35131 & 65535);
    }

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ᩹ */
    public final String mo23385() {
        return String.format("%08x", Integer.valueOf(mo23384()));
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC8697 interfaceC8697 = (InterfaceC8697) interfaceC1921;
        if (this.f35131 != interfaceC8697.mo23383()) {
            throw new RuntimeException(getPath());
        }
        if (!C17359.equals(mo18156(), interfaceC8697.mo18156())) {
            throw new RuntimeException(getPath());
        }
        if (mo18155() != interfaceC8697.mo18155()) {
            throw new RuntimeException(getPath());
        }
        if (mo18154() != interfaceC8697.mo18154() && mo18155()) {
            throw new RuntimeException(getPath());
        }
        if (mo18152() != interfaceC8697.mo18152()) {
            throw new RuntimeException(getPath());
        }
        if (mo18157() != interfaceC8697.mo18157()) {
            throw new RuntimeException(getPath());
        }
        if (mo18151() != interfaceC8697.mo18151()) {
            throw new RuntimeException(getPath());
        }
        if (getType().getTypeName().equals("style")) {
            if (this instanceof C13304) {
                ((C13304) this).m32851(C13304.f42461);
            }
            if (interfaceC1921 instanceof C13304) {
                ((C13304) interfaceC1921).m32851(C13304.f42461);
            }
        }
        for (int i = 0; i < mo18154(); i++) {
            getValue(i).mo6599(interfaceC8697.getValue(i));
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC23057
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        return getValue(i);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC8697
    public Iterable values() {
        return m28102();
    }
}
