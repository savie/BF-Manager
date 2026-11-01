package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5WF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3650 implements InterfaceC3609, InterfaceC17372 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f13381;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12783 f13382;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f13383;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // l.InterfaceC6456
    public final /* synthetic */ boolean containsKey(Object obj) {
        return C12434.m30906(this, obj);
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object mo10756() {
        return null;
    }

    public AbstractC3650(InterfaceC12783 interfaceC12783, int i) {
        this.f13382 = interfaceC12783;
        this.f13383 = i;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC6432 mo10689() {
        return this.f13382.mo31749();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC17721 mo10692() {
        return this.f13382.mo31754();
    }

    @Override // l.InterfaceC3609
    public InterfaceC19133 getType() {
        return this.f13382.getType();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۚ */
    public InterfaceC12783 mo10690() {
        return this.f13382;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۡܰ */
    public final int mo10691() {
        return this.f13383;
    }

    @Override // l.InterfaceC3609
    public final int getParent() {
        return this.f13381;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m10757() {
        return new C14236(mo7647(), this);
    }

    @Override // l.InterfaceC17372, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC3609
    public final String getPath() {
        return mo10690().getPath() + "/" + mo7645();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܰۙ */
    public final int mo10693() {
        InterfaceC19133 type = getType();
        int iMo19106 = (type.mo1537().mo19106() & 255) << 24;
        return ((type.mo26942() & 255) << 16) | iMo19106 | (this.f13383 & 65535);
    }

    @Override // l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ᩴ */
    public final String mo10694() {
        return String.format("%08x", Integer.valueOf(mo10693()));
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC3609 interfaceC3609 = (InterfaceC3609) interfaceC7138;
        if (this.f13383 != interfaceC3609.mo10691()) {
            throw new RuntimeException(getPath());
        }
        if (!C13638.equals(mo7645(), interfaceC3609.mo7645())) {
            throw new RuntimeException(getPath());
        }
        if (mo7644() != interfaceC3609.mo7644()) {
            throw new RuntimeException(getPath());
        }
        if (mo7647() != interfaceC3609.mo7647() && mo7644()) {
            throw new RuntimeException(getPath());
        }
        if (mo7649() != interfaceC3609.mo7649()) {
            throw new RuntimeException(getPath());
        }
        if (mo7648() != interfaceC3609.mo7648()) {
            throw new RuntimeException(getPath());
        }
        if (mo7646() != interfaceC3609.mo7646()) {
            throw new RuntimeException(getPath());
        }
        if (getType().getTypeName().equals("style")) {
            if (this instanceof C18551) {
                ((C18551) this).m42939(C18551.f59019);
            }
            if (interfaceC7138 instanceof C18551) {
                ((C18551) interfaceC7138).m42939(C18551.f59019);
            }
        }
        for (int i = 0; i < mo7647(); i++) {
            getValue(i).mo10755(interfaceC3609.getValue(i));
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC17372
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        return getValue(i);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC3609
    public Iterable values() {
        return m10757();
    }
}
