package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QD */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3697 implements InterfaceC22804 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m12014() {
        return new C18613(mo40124(), new InterfaceC23057() { // from class: l.᩹᩸ۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // l.InterfaceC21433, java.util.Map
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C11122.m28073(this, obj);
            }

            @Override // l.InterfaceC23057
            public final Object get(int i) {
                return this.f77191.mo40127(i);
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

            @Override // l.InterfaceC23057, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC23057
            /* JADX INFO: renamed from: ۙ */
            public final Object mo13466(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC23057
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC22804 interfaceC22804 = (InterfaceC22804) interfaceC1921;
        if (mo40124() != interfaceC22804.mo40124()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo40124(); i++) {
            mo40127(i).mo6599(interfaceC22804.mo40127(i));
        }
    }

    @Override // l.InterfaceC22804
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterable mo12015() {
        return m12014();
    }
}
