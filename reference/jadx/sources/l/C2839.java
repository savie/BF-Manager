package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2839 extends C11452 implements InterfaceC4395 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f10747;

    @Override // l.InterfaceC14544
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo8596(Object obj) {
        C4956 c4956 = (C4956) obj;
        if (c4956 == null || c4956.f17305.size() == 0) {
            return 0;
        }
        return c4956.f17304;
    }

    @Override // l.InterfaceC4395
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo8597(Object obj) {
        C4956 c4956 = (C4956) obj;
        return c4956 == null ? C4956.f17303 : c4956.f17305;
    }

    public C2839(C8485 c8485) {
        super(c8485);
        this.f10747 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4956 m8598(List list) {
        if (list == null || list.size() == 0) {
            return C4956.f17303;
        }
        ConcurrentMapC13783 concurrentMapC13783 = this.f10747;
        C4956 c4956 = (C4956) concurrentMapC13783.get(list);
        if (c4956 != null) {
            return c4956;
        }
        C4956 c4957 = new C4956(AbstractC22433.m49797(C22808.m50466(list, new C14130(this))));
        C4956 c4958 = (C4956) concurrentMapC13783.putIfAbsent(c4957, c4957);
        return c4958 == null ? c4957 : c4958;
    }

    @Override // l.InterfaceC1842
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3473() {
        return new C12013(this.f10747.values());
    }
}
