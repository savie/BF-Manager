package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45BU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19380 extends C6702 implements InterfaceC18414 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f62617;

    @Override // l.InterfaceC18414
    /* JADX INFO: renamed from: ᩴ */
    public final Set mo42922(Object obj) {
        return ((C18634) obj).f60593;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ᩷ */
    public final int mo16027(Object obj) {
        return ((C18634) obj).f60594;
    }

    @Override // l.InterfaceC17888
    /* JADX INFO: renamed from: ᩸ */
    public final int mo41743(Object obj) {
        C18634 c18634 = (C18634) obj;
        if (c18634 == null) {
            return 0;
        }
        return c18634.f60594;
    }

    public C19380(C8850 c8850) {
        super(c8850);
        this.f62617 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18634 m44825(Set set) {
        if (set == null) {
            return C18634.f60592;
        }
        ConcurrentMapC17249 concurrentMapC17249 = this.f62617;
        C18634 c18634 = (C18634) concurrentMapC17249.get(set);
        if (c18634 != null) {
            return c18634;
        }
        C18634 c18635 = new C18634(AbstractC8639.m23278(C7676.m20911(set.iterator(), new C0735(this))));
        C18634 c18636 = (C18634) concurrentMapC17249.putIfAbsent(c18635, c18635);
        return c18636 == null ? c18635 : c18636;
    }

    @Override // l.InterfaceC16396
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo16024() {
        return new C8193(this.f62617.values());
    }
}
