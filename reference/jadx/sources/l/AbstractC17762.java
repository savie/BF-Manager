package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9QQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17762 implements InterfaceC14900 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f56341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f56342;

    public AbstractC17762(String str, String str2) {
        this.f56342 = str;
        this.f56341 = str2;
    }

    @Override // l.InterfaceC14900
    public final String getName() {
        return this.f56342;
    }

    @Override // l.InterfaceC14900
    /* JADX INFO: renamed from: ᩴܰ */
    public final String mo35622() {
        return this.f56341;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m41318() {
        return new C14236(mo8712(), new InterfaceC17372() { // from class: l.᩸ۖۨ
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
                return this.f69286.mo8713(i);
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
        InterfaceC14900 interfaceC14900 = (InterfaceC14900) interfaceC7138;
        if (!C13638.equals(this.f56342, interfaceC14900.getName())) {
            throw new RuntimeException();
        }
        if (!C13638.equals(this.f56341, interfaceC14900.mo35622())) {
            throw new RuntimeException();
        }
        if (mo8712() != interfaceC14900.mo8712()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo8712(); i++) {
            mo8713(i).mo10755(interfaceC14900.mo8713(i));
        }
    }

    @Override // l.InterfaceC14900
    /* JADX INFO: renamed from: ᩷ۙ */
    public Iterable mo35623() {
        return m41318();
    }
}
