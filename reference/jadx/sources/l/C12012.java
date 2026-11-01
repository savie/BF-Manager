package l;

import com.google.android.material.motion.MotionUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: renamed from: l.ۨ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QA1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C12012 extends AbstractC4955 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f40247 = C13488.m32998(C12012.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C13568 f40248;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f40249;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f40250;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InetAddress f40251;

    public C12012(C22823 c22823, C13568 c13568, InetAddress inetAddress, int i) {
        super(c22823);
        this.f40248 = c13568;
        this.f40251 = inetAddress;
        this.f40250 = i;
        this.f40249 = i != C17178.f54759;
    }

    @Override // l.AbstractC4955
    /* JADX INFO: renamed from: ܰ */
    public final String mo4999() {
        return C22697.m50267(new StringBuilder("Responder("), m13745() != null ? m13745().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC4955
    public final String toString() {
        return mo4999() + " incomming: " + this.f40248;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29907(Timer timer) {
        InterfaceC4314 interfaceC4314;
        C13568 c13568 = this.f40248;
        Iterator it = c13568.m6986().iterator();
        boolean zMo10855 = true;
        do {
            boolean zHasNext = it.hasNext();
            interfaceC4314 = f40247;
            if (!zHasNext) {
                break;
            }
            C18506 c18506 = (C18506) it.next();
            interfaceC4314.mo12137("{}.start() question={}", mo4999(), c18506);
            zMo10855 = c18506.mo10855(m13745());
        } while (zMo10855);
        int iNextInt = (!zMo10855 || c13568.m6984()) ? (C22823.m50525().nextInt(96) + 20) - c13568.m33165() : 0;
        int i = iNextInt >= 0 ? iNextInt : 0;
        interfaceC4314.mo12137("{}.start() Responder chosen delay={}", mo4999(), Integer.valueOf(i));
        if (m13745().m50560() || m13745().m50533()) {
            return;
        }
        timer.schedule(this, i);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC4314 interfaceC4314 = f40247;
        C22823 c22823M13745 = m13745();
        C13568 c13568 = this.f40248;
        c22823M13745.m50556(c13568);
        HashSet<C18506> hashSet = new HashSet();
        HashSet<AbstractC19918> hashSet2 = new HashSet();
        if (m13745().m50550()) {
            try {
                Iterator it = c13568.m6986().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z = this.f40249;
                    if (!zHasNext) {
                        break;
                    }
                    C18506 c18506 = (C18506) it.next();
                    interfaceC4314.mo12121("{}.run() JmDNS responding to: {}", mo4999(), c18506);
                    if (z) {
                        hashSet.add(c18506);
                    }
                    c18506.mo10854(m13745(), hashSet2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (AbstractC19918 abstractC19918 : c13568.m6982()) {
                    if (abstractC19918.m45207(jCurrentTimeMillis)) {
                        hashSet2.remove(abstractC19918);
                        interfaceC4314.mo12126(mo4999(), "{} - JmDNS Responder Known Answer Removed");
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                interfaceC4314.mo12126(mo4999(), "{}.run() JmDNS responding");
                C22034 c22034 = new C22034(33792, c13568.m33166(), !z);
                if (z) {
                    c22034.m48940(new InetSocketAddress(this.f40251, this.f40250));
                }
                c22034.m6983(c13568.m6974());
                for (C18506 c18507 : hashSet) {
                    if (c18507 != null) {
                        c22034 = m13742(c22034, c18507);
                    }
                }
                for (AbstractC19918 abstractC19919 : hashSet2) {
                    if (abstractC19919 != null) {
                        c22034 = m13741(c22034, c13568, abstractC19919);
                    }
                }
                if (c22034.m6981()) {
                    return;
                }
                m13745().m50547(c22034);
            } catch (Throwable th) {
                interfaceC4314.mo12122(mo4999() + "run() exception ", th);
                m13745().close();
            }
        }
    }
}
