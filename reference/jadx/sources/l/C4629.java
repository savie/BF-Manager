package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4629 extends C10594 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f16391 = C16980.m40038(C4629.class.getName());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f16392;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m14444(C11340 c11340) {
        AbstractC12457 abstractC12457Mo11502 = c11340.mo11502();
        if (abstractC12457Mo11502 == null || !abstractC12457Mo11502.mo30935()) {
            f16391.mo13728(c11340, "Service Resolved called for an unresolved event: {}");
        } else {
            String str = c11340.getName() + "." + c11340.mo11501();
            AbstractC12457 abstractC12457 = (AbstractC12457) this.f16392.get(str);
            if (abstractC12457 != null && abstractC12457Mo11502.equals(abstractC12457)) {
                byte[] bArrMo30942 = abstractC12457Mo11502.mo30942();
                byte[] bArrMo30943 = abstractC12457.mo30942();
                if (bArrMo30942.length == bArrMo30943.length) {
                    int i = 0;
                    while (true) {
                        if (i < bArrMo30942.length) {
                            if (bArrMo30942[i] != bArrMo30943[i]) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!abstractC12457Mo11502.mo30937(abstractC12457)) {
                            break;
                        } else {
                            f16391.mo13716(c11340, "Service Resolved called for a service already resolved: {}");
                        }
                    }
                }
            }
            if (abstractC12457 == null) {
                if (this.f16392.putIfAbsent(str, abstractC12457Mo11502.clone()) == null) {
                    ((InterfaceC6492) m27043()).mo9704(c11340);
                }
            } else if (this.f16392.replace(str, abstractC12457, abstractC12457Mo11502.clone())) {
                ((InterfaceC6492) m27043()).mo9704(c11340);
            }
        }
    }

    public C4629(InterfaceC6492 interfaceC6492, boolean z) {
        super(interfaceC6492, z);
        this.f16392 = new ConcurrentMapC17249(32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14443(AbstractC3508 abstractC3508) {
        if (this.f16392.putIfAbsent(abstractC3508.getName() + "." + abstractC3508.mo11501(), abstractC3508.mo11502().clone()) == null) {
            ((InterfaceC6492) m27043()).mo9705(abstractC3508);
            AbstractC12457 abstractC12457Mo11502 = abstractC3508.mo11502();
            if (abstractC12457Mo11502 == null || !abstractC12457Mo11502.mo30935()) {
                return;
            }
            ((InterfaceC6492) m27043()).mo9704(abstractC3508);
            return;
        }
        f16391.mo13716(abstractC3508, "Service Added called for a service already added: {}");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14445(AbstractC3508 abstractC3508) {
        String str = abstractC3508.getName() + "." + abstractC3508.mo11501();
        ConcurrentMapC17249 concurrentMapC17249 = this.f16392;
        if (concurrentMapC17249.remove(str, concurrentMapC17249.get(str))) {
            ((InterfaceC6492) m27043()).mo9703(abstractC3508);
        } else {
            f16391.mo13716(abstractC3508, "Service Removed called for a service already removed: {}");
        }
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(2048, "[Status for ");
        sbM3018.append(((InterfaceC6492) m27043()).toString());
        ConcurrentMapC17249 concurrentMapC17249 = this.f16392;
        if (concurrentMapC17249.isEmpty()) {
            sbM3018.append(" no type event ");
        } else {
            sbM3018.append(" (");
            Iterator it = concurrentMapC17249.keySet().iterator();
            while (it.hasNext()) {
                sbM3018.append(((String) it.next()) + ", ");
            }
            sbM3018.append(") ");
        }
        sbM3018.append("]");
        return sbM3018.toString();
    }
}
