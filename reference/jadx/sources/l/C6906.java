package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6906 extends AbstractC18154 {
    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        Void r3 = (Void) obj;
        if ((c0309 instanceof C7406) || (c0309 instanceof C23594)) {
            return Boolean.FALSE;
        }
        Iterator it = c0309.mo1943().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((AbstractC16579) it.next()).mo1928(this, r3)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        return (Boolean) c0350.f1774.mo1928(this, (Void) obj);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        return (Boolean) c8777.f30194.mo1928(this, (Void) obj);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo11014(C20771 c20771, Object obj) {
        return Boolean.FALSE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        return Boolean.valueOf((c22929.f53222.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0);
    }
}
