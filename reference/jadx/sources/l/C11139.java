package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11139 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6908 m28097(InterfaceC6908 interfaceC6908) {
        if ((interfaceC6908 instanceof C5174) || (interfaceC6908 instanceof C13619)) {
            return interfaceC6908;
        }
        if (interfaceC6908 instanceof Serializable) {
            return new C13619(interfaceC6908);
        }
        return new C5174(interfaceC6908);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6908 m28096(Object obj) {
        return new C22328(obj);
    }
}
