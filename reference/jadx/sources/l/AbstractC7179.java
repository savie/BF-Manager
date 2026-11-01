package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B53K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7179 implements InterfaceC17721 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23974;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 f23975;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f23976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC10977 f23977;

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final EnumC10977 mo19107() {
        return this.f23977;
    }

    public AbstractC7179(AbstractC22702 abstractC22702) {
        this.f23975 = abstractC22702;
        this.f23977 = abstractC22702.f73941;
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC6432 mo7938() {
        return this.f23975;
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo19106() {
        return this.f23974;
    }

    @Override // l.InterfaceC17721
    public final String getPackageName() {
        return this.f23976;
    }

    @Override // l.InterfaceC17721
    public final String getPath() {
        return this.f23976;
    }

    public final String toString() {
        return this.f23976;
    }

    @Override // l.InterfaceC17721
    public InterfaceC19133 getType(String str) {
        for (int i = 0; i < mo7941(); i++) {
            InterfaceC19133 type = getType(i);
            if (type.getTypeName().equals(str)) {
                return type;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterable m19113() {
        return new C14236(mo7941(), new InterfaceC17372() { // from class: l.۠ۖۨ
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
                return this.f25928.getType(i);
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m19109() {
        return new C14236(mo7939(), new InterfaceC17372() { // from class: l.ۤۖۨ
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
                return this.f34172.mo7947(i);
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

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public Iterable mo19110() {
        return new C14236(mo7946(), new InterfaceC17372() { // from class: l.ۡۖۨ
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
                return this.f29695.mo7945(i);
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

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterable mo19111() {
        return new C14236(mo7940(), new InterfaceC17372() { // from class: l.᩵ۖۨ
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
                return this.f61918.mo7943(i);
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
        InterfaceC17721 interfaceC17721 = (InterfaceC17721) interfaceC7138;
        if (mo7941() != interfaceC17721.mo7941()) {
            throw new RuntimeException(this.f23976);
        }
        if (mo7939() != interfaceC17721.mo7939()) {
            throw new RuntimeException(this.f23976);
        }
        if (mo7946() != interfaceC17721.mo7946()) {
            throw new RuntimeException(this.f23976);
        }
        if (mo7940() != interfaceC17721.mo7940()) {
            throw new RuntimeException(this.f23976);
        }
        for (int i = 0; i < mo7941(); i++) {
            getType(i).mo10755(interfaceC17721.getType(i));
        }
        for (int i2 = 0; i2 < mo7939(); i2++) {
            mo7947(i2).mo10755(interfaceC17721.mo7947(i2));
        }
        for (int i3 = 0; i3 < mo7946(); i3++) {
            mo7945(i3).mo10755(interfaceC17721.mo7945(i3));
        }
        for (int i4 = 0; i4 < mo7940(); i4++) {
            mo7943(i4).mo10755(interfaceC17721.mo7943(i4));
        }
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public Iterable mo19112() {
        return m19113();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public Iterable mo19108() {
        return m19109();
    }
}
