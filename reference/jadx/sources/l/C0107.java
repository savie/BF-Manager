package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0107 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Object f1048 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17930 f1049 = new C17930();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f1050 = new WeakReference(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1212(InterfaceC11217 interfaceC11217, final InterfaceC18006 interfaceC18006) {
        C17930 c17930 = this.f1049;
        if (c17930.m40355()) {
            InterfaceC16438 interfaceC16438 = (InterfaceC16438) this.f1050.get();
            if (interfaceC16438 != null) {
                c17930.m40354(interfaceC16438);
                this.f1050.clear();
            }
            if (c17930.m40355()) {
                throw new RuntimeException();
            }
        }
        InterfaceC16438 interfaceC16439 = new InterfaceC16438() { // from class: l.᩶֫ܺ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C0107.m1210(interfaceC18006, (Object[]) obj);
            }
        };
        this.f1050 = new WeakReference(interfaceC16439);
        c17930.m40350(interfaceC11217, interfaceC16439);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1210(InterfaceC18006 interfaceC18006, Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = f1048;
        if (obj != obj2) {
            objArr[0] = obj2;
            interfaceC18006.mo1736(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1211(Object obj) {
        this.f1049.mo40353(new Object[]{obj});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1213(C23001 c23001) {
        this.f1049.mo40348(new Object[]{c23001});
    }
}
