package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8ZP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20527 implements InterfaceC9944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f66506 = new HashMap(3);

    @Override // l.InterfaceC9944
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9944 mo25171(Class cls, InterfaceC4774 interfaceC4774) {
        this.f66506.put(cls, interfaceC4774);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7121 m46312() {
        return new C15589(C0561.unmodifiableMap(this.f66506));
    }
}
