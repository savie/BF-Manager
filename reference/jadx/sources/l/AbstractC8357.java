package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Y2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8357 extends AbstractC18053 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f27417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC21037 f27418;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f27416 = C16980.m40038(AbstractC8357.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f27415 = C3137.f10167;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8127();

    /* JADX INFO: renamed from: ۙ */
    public abstract C1271 mo8128(C1271 c1271);

    /* JADX INFO: renamed from: ۙ */
    public abstract C1271 mo8129(C17307 c17307, C1271 c1271);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo8130();

    /* JADX INFO: renamed from: ۫ */
    public abstract String mo8131();

    /* JADX INFO: renamed from: ᩴ */
    public abstract C1271 mo8132();

    /* JADX INFO: renamed from: ᩸ */
    public abstract boolean mo8133();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m22491() {
        return f27415;
    }

    public AbstractC8357(C14168 c14168, int i) {
        super(c14168);
        this.f27418 = null;
        this.f27417 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22496() {
        return this.f27417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22493(EnumC21037 enumC21037) {
        synchronized (m42076()) {
            m42076().m34425(this, enumC21037);
        }
        Iterator it = ((ConcurrentMapC17249) m42076().m34445()).values().iterator();
        while (it.hasNext()) {
            ((C17307) ((AbstractC12457) it.next())).m40641(this, enumC21037);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22495() {
        synchronized (m42076()) {
            m42076().m34424(this);
        }
        Iterator it = ((ConcurrentMapC17249) m42076().m34445()).values().iterator();
        while (it.hasNext()) {
            ((C17307) ((AbstractC12457) it.next())).m40640(this);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1271 c1271Mo8132 = mo8132();
        try {
            if (!mo8133()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (m42076()) {
                if (m42076().m34456(this, this.f27418)) {
                    f27416.mo13725("{}.run() JmDNS {} {}", mo1348(), mo8131(), m42076().getName());
                    arrayList.add(m42076());
                    c1271Mo8132 = mo8128(c1271Mo8132);
                }
            }
            Iterator it = ((ConcurrentMapC17249) m42076().m34445()).values().iterator();
            while (it.hasNext()) {
                C17307 c17307 = (C17307) ((AbstractC12457) it.next());
                synchronized (c17307) {
                    if (c17307.m40653(this, this.f27418)) {
                        f27416.mo13725("{}.run() JmDNS {} {}", mo1348(), mo8131(), c17307.mo30944());
                        arrayList.add(c17307);
                        c1271Mo8132 = mo8129(c17307, c1271Mo8132);
                    }
                }
            }
            if (!c1271Mo8132.m44426()) {
                f27416.mo13725("{}.run() JmDNS {} #{}", mo1348(), mo8131(), this.f27418);
                m42076().m34422(c1271Mo8132);
                m22492(arrayList);
                mo8130();
                return;
            }
            m22492(arrayList);
            cancel();
        } catch (Throwable th) {
            f27416.mo13702(mo1348() + ".run() exception ", th);
            mo8127();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22492(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23866 interfaceC23866 = (InterfaceC23866) it.next();
            synchronized (interfaceC23866) {
                interfaceC23866.mo34430(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC21037 m22494() {
        return this.f27418;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22497(EnumC21037 enumC21037) {
        this.f27418 = enumC21037;
    }
}
