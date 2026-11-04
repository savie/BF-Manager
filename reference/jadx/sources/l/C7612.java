package l;

import com.google.android.material.motion.MotionUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: renamed from: l.۟ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C7612 extends AbstractC18053 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f25130 = C16980.m40038(C7612.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f25131;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f25132;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0525 f25133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InetAddress f25134;

    public C7612(C14168 c14168, C0525 c0525, InetAddress inetAddress, int i) {
        super(c14168);
        this.f25133 = c0525;
        this.f25134 = inetAddress;
        this.f25131 = i;
        this.f25132 = i != C3137.f10166;
    }

    @Override // l.AbstractC18053
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1348() {
        return C8947.m23910(new StringBuilder("Responder("), m42076() != null ? m42076().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC18053
    public final String toString() {
        return mo1348() + " incomming: " + this.f25133;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20812(Timer timer) {
        InterfaceC25186 interfaceC25186;
        C0525 c0525 = this.f25133;
        Iterator it = c0525.m44430().iterator();
        boolean zMo9134 = true;
        do {
            boolean zHasNext = it.hasNext();
            interfaceC25186 = f25130;
            if (!zHasNext) {
                break;
            }
            C23120 c23120 = (C23120) it.next();
            interfaceC25186.mo13723("{}.start() question={}", mo1348(), c23120);
            zMo9134 = c23120.mo9134(m42076());
        } while (zMo9134);
        int iNextInt = (!zMo9134 || c0525.m44431()) ? (C14168.m34400().nextInt(96) + 20) - c0525.m2493() : 0;
        int i = iNextInt >= 0 ? iNextInt : 0;
        interfaceC25186.mo13723("{}.start() Responder chosen delay={}", mo1348(), Integer.valueOf(i));
        if (m42076().m34457() || m42076().m34438()) {
            return;
        }
        timer.schedule(this, i);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC25186 interfaceC25186 = f25130;
        C14168 c14168M42076 = m42076();
        C0525 c0525 = this.f25133;
        c14168M42076.m34452(c0525);
        HashSet<C23120> hashSet = new HashSet();
        HashSet<AbstractC17152> hashSet2 = new HashSet();
        if (m42076().m34432()) {
            try {
                Iterator it = c0525.m44430().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z = this.f25132;
                    if (!zHasNext) {
                        break;
                    }
                    C23120 c23120 = (C23120) it.next();
                    interfaceC25186.mo13701("{}.run() JmDNS responding to: {}", mo1348(), c23120);
                    if (z) {
                        hashSet.add(c23120);
                    }
                    c23120.mo9133(m42076(), hashSet2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (AbstractC17152 abstractC17152 : c0525.m44434()) {
                    if (abstractC17152.m40303(jCurrentTimeMillis)) {
                        hashSet2.remove(abstractC17152);
                        interfaceC25186.mo13716(mo1348(), "{} - JmDNS Responder Known Answer Removed");
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                interfaceC25186.mo13716(mo1348(), "{}.run() JmDNS responding");
                C1271 c1271 = new C1271(33792, c0525.m2494(), !z);
                if (z) {
                    c1271.m4637(new InetSocketAddress(this.f25134, this.f25131));
                }
                c1271.m44435(c0525.m44436());
                for (C23120 c23121 : hashSet) {
                    if (c23121 != null) {
                        c1271 = m42075(c1271, c23121);
                    }
                }
                for (AbstractC17152 abstractC17153 : hashSet2) {
                    if (abstractC17153 != null) {
                        c1271 = m42072(c1271, c0525, abstractC17153);
                    }
                }
                if (c1271.m44426()) {
                    return;
                }
                m42076().m34422(c1271);
            } catch (Throwable th) {
                interfaceC25186.mo13702(mo1348() + "run() exception ", th);
                m42076().close();
            }
        }
    }
}
