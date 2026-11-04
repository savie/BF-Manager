package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G8ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14149 implements InterfaceC8929 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f44739 = new HashMap(3);

    @Override // l.InterfaceC8929
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8929 mo23841(Class cls, InterfaceC16299 interfaceC16299) {
        this.f44739.put(cls, interfaceC16299);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7438 m34369() {
        return new C5113(C4681.unmodifiableMap(this.f44739));
    }
}
