package l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64N8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22702 implements InterfaceC6432 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC10977 f73941 = EnumC10977.AOSP;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m50269() {
        return new C14236(mo5141(), new InterfaceC17372() { // from class: l.ۜۖۨ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C12434.m30906(this, obj);
            }

            @Override // l.InterfaceC17372
            public final Object get(int i) {
                return this.f21847.mo5140(i);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ Object get(Object obj) {
                return C12434.m30908(this, obj);
            }

            @Override // l.InterfaceC6456
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // l.InterfaceC17372, l.InterfaceC9612
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ boolean mo8945(int i) {
                return true;
            }

            @Override // l.InterfaceC17372
            /* JADX INFO: renamed from: ۨ */
            public final /* synthetic */ Object mo10756() {
                return null;
            }

            @Override // l.InterfaceC17372, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC17372
            /* JADX INFO: renamed from: ۙ */
            public final Object mo8944(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC17372
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17616() {
        Iterator it = mo17615().iterator();
        while (it.hasNext()) {
            if (((InterfaceC17721) it.next()).mo19106() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC6432 interfaceC6432 = (InterfaceC6432) interfaceC7138;
        C22785 c22785 = (C22785) this;
        if (c22785.mo5141() != interfaceC6432.mo5141()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c22785.mo5141(); i++) {
            c22785.mo5140(i).mo10755(interfaceC6432.mo5140(i));
        }
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo17615() {
        return m50269();
    }
}
