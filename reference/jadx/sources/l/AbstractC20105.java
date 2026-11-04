package l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64N8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20105 implements InterfaceC7206 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC18262 f64598 = EnumC18262.AOSP;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m46228() {
        return new C18613(mo15674(), new InterfaceC23057() { // from class: l.᩸᩸ۤ
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
                return this.f74876.mo15673(i);
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

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo19789() {
        Iterator it = mo15672().iterator();
        while (it.hasNext()) {
            if (((InterfaceC10869) it.next()).mo27607() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC7206 interfaceC7206 = (InterfaceC7206) interfaceC1921;
        C23001 c23001 = (C23001) this;
        if (c23001.mo15674() != interfaceC7206.mo15674()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c23001.mo15674(); i++) {
            c23001.mo15673(i).mo6599(interfaceC7206.mo15673(i));
        }
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۠ */
    public Iterable mo15672() {
        return m46228();
    }
}
