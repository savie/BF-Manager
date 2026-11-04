package l;

import com.umeng.analytics.pro.d;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24963 implements InterfaceC11536, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C24963 f80840 = new C24963();

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5004(Object obj, InterfaceC23955 interfaceC23955) {
        return obj;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5571 mo5005(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        return null;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11536 mo5006(InterfaceC11536 interfaceC11536) {
        C15243.m36590(interfaceC11536, d.R);
        return interfaceC11536;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC11536 mo5007(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        return this;
    }

    private final Object readResolve() {
        return f80840;
    }
}
