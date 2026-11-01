package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3145 implements InterfaceC2282, InterfaceC0380, InterfaceC13150 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11877;

    public /* synthetic */ C3145(int i, Object obj) {
        this.f11876 = i;
        this.f11877 = obj;
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        switch (this.f11876) {
            case 0:
                C7898.m20894((C7898) this.f11877);
                break;
            default:
                ((C19383) this.f11877).m44413(((Integer) obj).intValue());
                break;
        }
    }

    @Override // l.InterfaceC13150
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo9540(List list, List list2, List list3, List list4) {
        C11718.m29269((C11718) this.f11877, list, list2, list3, list4);
    }

    @Override // l.InterfaceC2282
    /* JADX INFO: renamed from: ۙ */
    public long mo6989(long j) {
        C23451 c23451 = (C23451) this.f11877;
        return C17983.m41829((j * ((long) c23451.f75950)) / 1000000, 0L, c23451.f75957 - 1);
    }
}
