package l;

import com.umeng.analytics.pro.d;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֨ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1218 implements InterfaceC22386, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C1218 f5350 = new C1218();

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4415(Object obj, InterfaceC8400 interfaceC8400) {
        return obj;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2629 mo4416(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        return null;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 mo4417(InterfaceC22386 interfaceC22386) {
        C13465.m32966(interfaceC22386, d.R);
        return interfaceC22386;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 mo4418(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        return this;
    }

    private final Object readResolve() {
        return f5350;
    }
}
