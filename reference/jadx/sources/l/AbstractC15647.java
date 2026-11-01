package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QD */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15647 implements InterfaceC18427 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m37322() {
        return new C14236(mo14889(), new InterfaceC17372() { // from class: l.᩷ۖۨ
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
                return this.f67076.mo14890(i);
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

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC18427 interfaceC18427 = (InterfaceC18427) interfaceC7138;
        if (mo14889() != interfaceC18427.mo14889()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo14889(); i++) {
            mo14890(i).mo10755(interfaceC18427.mo14890(i));
        }
    }

    @Override // l.InterfaceC18427
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Iterable mo37321() {
        return m37322();
    }
}
