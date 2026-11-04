package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C24514 extends C6702 implements InterfaceC20872 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f79498;

    @Override // l.InterfaceC20872
    /* JADX INFO: renamed from: ۙ */
    public final List mo47700(Object obj) {
        C20784 c20784 = (C20784) obj;
        return c20784 == null ? C20784.f66586 : c20784.f66588;
    }

    @Override // l.InterfaceC17888
    /* JADX INFO: renamed from: ᩸ */
    public final int mo41743(Object obj) {
        C20784 c20784 = (C20784) obj;
        if (c20784 == null || c20784.f66588.size() == 0) {
            return 0;
        }
        return c20784.f66587;
    }

    public C24514(C8850 c8850) {
        super(c8850);
        this.f79498 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20784 m54774(List list) {
        if (list == null || list.size() == 0) {
            return C20784.f66586;
        }
        ConcurrentMapC17249 concurrentMapC17249 = this.f79498;
        C20784 c20784 = (C20784) concurrentMapC17249.get(list);
        if (c20784 != null) {
            return c20784;
        }
        C20784 c20785 = new C20784(AbstractC1928.m6612(C16625.m39330(list, new C12579(this))));
        C20784 c20786 = (C20784) concurrentMapC17249.putIfAbsent(c20785, c20785);
        return c20786 == null ? c20785 : c20786;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo16024() {
        return new C6614(this.f79498.values());
    }
}
