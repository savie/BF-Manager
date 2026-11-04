package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C0267 extends AbstractC1100 {
    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1767(C2832 c2832, Object obj) {
        return (Boolean) c2832.f9333.mo9324(this, (Void) obj);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1768(C10510 c10510, Object obj) {
        Void r3 = (Void) obj;
        if ((c10510 instanceof C6783) || (c10510 instanceof C1562)) {
            return Boolean.FALSE;
        }
        Iterator it = c10510.mo9323().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((AbstractC22664) it.next()).mo9324(this, r3)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1769(C10729 c10729, Object obj) {
        return (Boolean) c10729.f34074.mo9324(this, (Void) obj);
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo1770(C14018 c14018, Object obj) {
        return Boolean.FALSE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1771(C17969 c17969, Object obj) {
        return Boolean.valueOf((c17969.f73596.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0);
    }
}
