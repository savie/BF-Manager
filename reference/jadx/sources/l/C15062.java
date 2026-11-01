package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15062 extends C17883 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f49110 = C13488.m32998(C15062.class.getName());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f49111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36095(C20706 c20706) {
        AbstractC11015 abstractC11015Mo40399 = c20706.mo40399();
        if (abstractC11015Mo40399 == null || !abstractC11015Mo40399.mo1673()) {
            f49110.mo12115(c20706, "Service Resolved called for an unresolved event: {}");
        } else {
            String str = c20706.getName() + "." + c20706.mo40397();
            AbstractC11015 abstractC11015 = (AbstractC11015) this.f49111.get(str);
            if (abstractC11015 != null && abstractC11015Mo40399.equals(abstractC11015)) {
                byte[] bArrMo1658 = abstractC11015Mo40399.mo1658();
                byte[] bArrMo1659 = abstractC11015.mo1658();
                if (bArrMo1658.length == bArrMo1659.length) {
                    int i = 0;
                    while (true) {
                        if (i < bArrMo1658.length) {
                            if (bArrMo1658[i] != bArrMo1659[i]) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!abstractC11015Mo40399.mo1651(abstractC11015)) {
                            break;
                        } else {
                            f49110.mo12126(c20706, "Service Resolved called for a service already resolved: {}");
                        }
                    }
                }
            }
            if (abstractC11015 == null) {
                if (this.f49111.putIfAbsent(str, abstractC11015Mo40399.clone()) == null) {
                    ((InterfaceC23715) m41505()).mo26979(c20706);
                }
            } else if (this.f49111.replace(str, abstractC11015, abstractC11015Mo40399.clone())) {
                ((InterfaceC23715) m41505()).mo26979(c20706);
            }
        }
    }

    public C15062(InterfaceC23715 interfaceC23715, boolean z) {
        super(interfaceC23715, z);
        this.f49111 = new ConcurrentMapC13783(32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36094(AbstractC17364 abstractC17364) {
        if (this.f49111.putIfAbsent(abstractC17364.getName() + "." + abstractC17364.mo40397(), abstractC17364.mo40399().clone()) == null) {
            ((InterfaceC23715) m41505()).mo26980(abstractC17364);
            AbstractC11015 abstractC11015Mo40399 = abstractC17364.mo40399();
            if (abstractC11015Mo40399 == null || !abstractC11015Mo40399.mo1673()) {
                return;
            }
            ((InterfaceC23715) m41505()).mo26979(abstractC17364);
            return;
        }
        f49110.mo12126(abstractC17364, "Service Added called for a service already added: {}");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36096(AbstractC17364 abstractC17364) {
        String str = abstractC17364.getName() + "." + abstractC17364.mo40397();
        ConcurrentMapC13783 concurrentMapC13783 = this.f49111;
        if (concurrentMapC13783.remove(str, concurrentMapC13783.get(str))) {
            ((InterfaceC23715) m41505()).mo26978(abstractC17364);
        } else {
            f49110.mo12126(abstractC17364, "Service Removed called for a service already removed: {}");
        }
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(2048, "[Status for ");
        sbM40152.append(((InterfaceC23715) m41505()).toString());
        ConcurrentMapC13783 concurrentMapC13783 = this.f49111;
        if (concurrentMapC13783.isEmpty()) {
            sbM40152.append(" no type event ");
        } else {
            sbM40152.append(" (");
            Iterator it = concurrentMapC13783.keySet().iterator();
            while (it.hasNext()) {
                sbM40152.append(((String) it.next()) + ", ");
            }
            sbM40152.append(") ");
        }
        sbM40152.append("]");
        return sbM40152.toString();
    }
}
