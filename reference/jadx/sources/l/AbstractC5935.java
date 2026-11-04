package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9QQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5935 implements InterfaceC4904 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f20285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f20286;

    public AbstractC5935(String str, String str2) {
        this.f20286 = str;
        this.f20285 = str2;
    }

    @Override // l.InterfaceC4904
    public final String getName() {
        return this.f20286;
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ᩹᩷ */
    public final String mo15048() {
        return this.f20285;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m17249() {
        return new C18613(mo7301(), new InterfaceC23057() { // from class: l.۫᩸ۤ
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
                return this.f42682.mo7300(i);
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
        InterfaceC4904 interfaceC4904 = (InterfaceC4904) interfaceC1921;
        if (!C17359.equals(this.f20286, interfaceC4904.getName())) {
            throw new RuntimeException();
        }
        if (!C17359.equals(this.f20285, interfaceC4904.mo15048())) {
            throw new RuntimeException();
        }
        if (mo7301() != interfaceC4904.mo7301()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo7301(); i++) {
            mo7300(i).mo6599(interfaceC4904.mo7300(i));
        }
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ۘۙ */
    public Iterable mo15047() {
        return m17249();
    }
}
