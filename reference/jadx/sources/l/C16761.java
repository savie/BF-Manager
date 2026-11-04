package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public class C16761 extends AbstractC1584 {
    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return Integer.valueOf(abstractC22664.mo9097().ordinal());
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        return Integer.valueOf(((Integer) c2832.f9333.mo9324(this, (Object) null)).intValue() + 12);
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1125(C8274 c8274, Object obj) {
        return Integer.valueOf(System.identityHashCode(c8274));
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        int iHashCode = c10510.f73596.mo29575().hashCode() + (((Integer) c10510.mo23449().mo9324(this, (Object) null)).intValue() * 127);
        Iterator it = c10510.mo15882().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 127) + ((Integer) ((AbstractC22664) it.next()).mo9324(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        int iHashCode = c10729.f34073.hashCode();
        AbstractC22664 abstractC22664 = c10729.f34074;
        if (abstractC22664 != null) {
            iHashCode = (iHashCode * 127) + ((Integer) abstractC22664.mo9324(this, (Object) null)).intValue();
        }
        return Integer.valueOf(iHashCode);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return 0;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public /* bridge */ /* synthetic */ Object mo1771(C17969 c17969, Object obj) {
        return mo39573(c17969);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2231(C23191 c23191, Object obj) {
        int iOrdinal = EnumC21172.METHOD.ordinal();
        for (C14769 c14769 = c23191.f75155; c14769.f48336 != null; c14769 = c14769.f48336) {
            iOrdinal = (iOrdinal << 5) + ((Integer) ((AbstractC22664) c14769.f48335).mo9324(this, (Object) null)).intValue();
        }
        return Integer.valueOf(((Integer) c23191.f75156.mo9324(this, (Object) null)).intValue() + (iOrdinal << 5));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Integer mo39573(C17969 c17969) {
        return Integer.valueOf(System.identityHashCode(c17969));
    }
}
