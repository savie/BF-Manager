package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B53K */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16375 implements InterfaceC10869 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f53160;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 f53161;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53162;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC18262 f53163;

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۙ᩷ */
    public final EnumC18262 mo27606() {
        return this.f53163;
    }

    public AbstractC16375(AbstractC20105 abstractC20105) {
        this.f53161 = abstractC20105;
        this.f53163 = abstractC20105.f64598;
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7206 mo21425() {
        return this.f53161;
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۫ */
    public final int mo27607() {
        return this.f53162;
    }

    @Override // l.InterfaceC10869
    public final String getPackageName() {
        return this.f53160;
    }

    @Override // l.InterfaceC10869
    public final String getPath() {
        return this.f53160;
    }

    public final String toString() {
        return this.f53160;
    }

    @Override // l.InterfaceC10869
    public InterfaceC15344 getType(String str) {
        for (int i = 0; i < mo19820(); i++) {
            InterfaceC15344 type = getType(i);
            if (type.getTypeName().equals(str)) {
                return type;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable m38864() {
        return new C18613(mo19820(), new InterfaceC23057() { // from class: l.ۧ᩸ۤ
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
                return this.f38328.getType(i);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m38865() {
        return new C18613(mo19827(), new InterfaceC23057() { // from class: l.ܽ᩸ۤ
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
                return this.f58568.mo19821(i);
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

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩵ۙ */
    public Iterable mo19824() {
        return new C18613(mo19823(), new InterfaceC23057() { // from class: l.ܺ᩸ۤ
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
                return this.f55862.mo19826(i);
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

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩶ */
    public Iterable mo19825() {
        return new C18613(mo19819(), new InterfaceC23057() { // from class: l.᩻᩸ۤ
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
                return this.f81788.mo19817(i);
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
        InterfaceC10869 interfaceC10869 = (InterfaceC10869) interfaceC1921;
        if (mo19820() != interfaceC10869.mo19820()) {
            throw new RuntimeException(this.f53160);
        }
        if (mo19827() != interfaceC10869.mo19827()) {
            throw new RuntimeException(this.f53160);
        }
        if (mo19823() != interfaceC10869.mo19823()) {
            throw new RuntimeException(this.f53160);
        }
        if (mo19819() != interfaceC10869.mo19819()) {
            throw new RuntimeException(this.f53160);
        }
        for (int i = 0; i < mo19820(); i++) {
            getType(i).mo6599(interfaceC10869.getType(i));
        }
        for (int i2 = 0; i2 < mo19827(); i2++) {
            mo19821(i2).mo6599(interfaceC10869.mo19821(i2));
        }
        for (int i3 = 0; i3 < mo19823(); i3++) {
            mo19826(i3).mo6599(interfaceC10869.mo19826(i3));
        }
        for (int i4 = 0; i4 < mo19819(); i4++) {
            mo19817(i4).mo6599(interfaceC10869.mo19817(i4));
        }
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ܽ᩷ */
    public Iterable mo19822() {
        return m38864();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩺᩷ */
    public Iterable mo19828() {
        return m38865();
    }
}
