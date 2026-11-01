package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܶۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15166 implements InterfaceC14834 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f49529 = C13488.m32997(C15166.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedList f49531 = new LinkedList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedList f49532 = new LinkedList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f49530 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f49533 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3875 m36378(InterfaceC19067 interfaceC19067, C19668 c19668, int i, boolean z, boolean z2) {
        C3875 c3875M36376;
        interfaceC19067.mo29449().getClass();
        interfaceC19067.mo29449().getClass();
        int i2 = i <= 0 ? 445 : i;
        synchronized (this.f49531) {
            try {
                m36377();
                InterfaceC4314 interfaceC4314 = f49529;
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12127("Exclusive " + z + " enforced signing " + z2);
                }
                if (!z && ((C9895) interfaceC19067.mo29449()).m25045() != 1 && (c3875M36376 = m36376(interfaceC19067, c19668, i2, null, z2, false)) != null) {
                    return c3875M36376;
                }
                C3875 c3875 = new C3875(interfaceC19067, c19668, i2, z2);
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("New transport connection " + c3875);
                }
                if (z) {
                    this.f49532.add(c3875);
                } else {
                    this.f49531.add(0, c3875);
                }
                return c3875;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3875 m36376(InterfaceC19067 interfaceC19067, InterfaceC18361 interfaceC18361, int i, String str, boolean z, boolean z2) {
        InterfaceC4314 interfaceC4314 = f49529;
        for (C3875 c3875 : this.f49531) {
            if (c3875.m11239(interfaceC18361, i, str) && (((C9895) interfaceC19067.mo29449()).m25045() == 0 || c3875.m11250() < ((C9895) interfaceC19067.mo29449()).m25045())) {
                try {
                    if (!c3875.mo9585() && (!z2 || !c3875.mo9573())) {
                        if (z && !c3875.m11243()) {
                            if (interfaceC4314.mo12133()) {
                                interfaceC4314.mo12135("Cannot reuse, signing enforced but connection does not have it enabled " + c3875);
                            }
                        } else {
                            if (!z) {
                                interfaceC19067.mo29449().getClass();
                                if (c3875.m11243() && !c3875.m11246().mo11873()) {
                                    if (interfaceC4314.mo12133()) {
                                        interfaceC4314.mo12135("Cannot reuse, signing enforced on connection " + c3875);
                                    }
                                }
                            }
                            if (!c3875.m11246().mo11864(interfaceC19067)) {
                                if (interfaceC4314.mo12133()) {
                                    interfaceC4314.mo12127("Cannot reuse, different config " + c3875);
                                }
                            } else {
                                if (interfaceC4314.mo12133()) {
                                    interfaceC4314.mo12127("Reusing transport connection " + c3875);
                                }
                                c3875.m9577();
                                return c3875;
                            }
                        }
                    }
                } catch (C8484 e) {
                    interfaceC4314.mo12120("Error while checking for reuse", (Exception) e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6698 m36379(InterfaceC19067 interfaceC19067, String str, int i, boolean z, boolean z2) throws IOException {
        C19668[] c19668ArrM18734 = ((RunnableC6967) interfaceC19067.mo29450()).m18734(str, true);
        if (c19668ArrM18734.length == 0) {
            throw new UnknownHostException(str);
        }
        Arrays.sort(c19668ArrM18734, new C22927(this));
        synchronized (this.f49531) {
            for (C19668 c19668 : c19668ArrM18734) {
                interfaceC19067.mo29449().getClass();
                interfaceC19067.mo29449().getClass();
                C3875 c3875M36376 = m36376(interfaceC19067, c19668, i, str, z2, true);
                if (c3875M36376 != null) {
                    return c3875M36376;
                }
            }
            IOException e = null;
            for (C19668 c19669 : c19668ArrM18734) {
                InterfaceC4314 interfaceC4314 = f49529;
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12126(c19669, "Trying address {}");
                }
                try {
                    C3875 c3875M36378 = m36378(interfaceC19067, c19669, i, z, z2);
                    c3875M36378.m11234(C3875.class);
                    try {
                        try {
                            c3875M36378.m11249();
                            c3875M36378.m9577();
                            c3875M36378.m9589();
                            return c3875M36378;
                        } catch (IOException e2) {
                            m36380(c3875M36378);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        try {
                            c3875M36378.m9589();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    String strMo36917 = c19669.mo36917();
                    Integer num = (Integer) this.f49533.get(strMo36917);
                    if (num == null) {
                        this.f49533.put(strMo36917, 1);
                    } else {
                        this.f49533.put(strMo36917, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (e != null) {
                throw e;
            }
            throw new C4498("All connection attempts failed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36380(InterfaceC6698 interfaceC6698) {
        InterfaceC4314 interfaceC4314 = f49529;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Scheduling transport connection for removal " + interfaceC6698 + " (" + System.identityHashCode(interfaceC6698) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f49530.add((C3875) interfaceC6698);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m36377() {
        synchronized (this.f49531) {
            while (true) {
                C3875 c3875 = (C3875) this.f49530.poll();
                if (c3875 != null) {
                    InterfaceC4314 interfaceC4314 = f49529;
                    if (interfaceC4314.mo12125()) {
                        interfaceC4314.mo12135("Removing transport connection " + c3875 + " (" + System.identityHashCode(c3875) + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    this.f49531.remove(c3875);
                    this.f49532.remove(c3875);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36381() {
        LinkedList linkedList;
        synchronized (this.f49531) {
            m36377();
            f49529.mo12135("Closing pool");
            linkedList = new LinkedList(this.f49531);
            linkedList.addAll(this.f49532);
            this.f49531.clear();
            this.f49532.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zM9582 = false;
        while (it.hasNext()) {
            try {
                zM9582 |= ((C3875) it.next()).m9582(false, false);
            } catch (IOException e) {
                f49529.mo12122("Failed to close connection", (Throwable) e);
            }
        }
        synchronized (this.f49531) {
            m36377();
        }
        return zM9582;
    }
}
