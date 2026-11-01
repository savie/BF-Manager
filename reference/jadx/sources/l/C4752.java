package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۙܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4752 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23949 m13183(InterfaceC23949 interfaceC23949) {
        if ((interfaceC23949 instanceof C9838) || (interfaceC23949 instanceof C14777)) {
            return interfaceC23949;
        }
        if (interfaceC23949 instanceof Serializable) {
            return new C14777(interfaceC23949);
        }
        return new C9838(interfaceC23949);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23949 m13182(Object obj) {
        return new C3486(obj);
    }
}
