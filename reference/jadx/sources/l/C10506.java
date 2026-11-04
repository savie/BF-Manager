package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۤ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10506 implements InterfaceC24524 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f33425 = C16980.m40037(C10506.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedList f33426 = new LinkedList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedList f33427 = new LinkedList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f33429 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f33428 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14014 m26968(InterfaceC23032 interfaceC23032, C13357 c13357, int i, boolean z, boolean z2) {
        C14014 c14014M26965;
        interfaceC23032.mo2875().getClass();
        interfaceC23032.mo2875().getClass();
        int i2 = i <= 0 ? 445 : i;
        synchronized (this.f33426) {
            try {
                m26966();
                InterfaceC25186 interfaceC25186 = f33425;
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13717("Exclusive " + z + " enforced signing " + z2);
                }
                if (!z && ((C14826) interfaceC23032.mo2875()).m35723() != 1 && (c14014M26965 = m26965(interfaceC23032, c13357, i2, null, z2, false)) != null) {
                    return c14014M26965;
                }
                C14014 c14014 = new C14014(interfaceC23032, c13357, i2, z2);
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("New transport connection " + c14014);
                }
                if (z) {
                    this.f33427.add(c14014);
                } else {
                    this.f33426.add(0, c14014);
                }
                return c14014;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14014 m26965(InterfaceC23032 interfaceC23032, InterfaceC11097 interfaceC11097, int i, String str, boolean z, boolean z2) {
        InterfaceC25186 interfaceC25186 = f33425;
        for (C14014 c14014 : this.f33426) {
            if (c14014.m34126(interfaceC11097, i, str) && (((C14826) interfaceC23032.mo2875()).m35723() == 0 || c14014.m34134() < ((C14826) interfaceC23032.mo2875()).m35723())) {
                try {
                    if (!c14014.mo1090() && (!z2 || !c14014.mo1093())) {
                        if (z && !c14014.m34117()) {
                            if (interfaceC25186.mo13713()) {
                                interfaceC25186.mo13721("Cannot reuse, signing enforced but connection does not have it enabled " + c14014);
                            }
                        } else {
                            if (!z) {
                                interfaceC23032.mo2875().getClass();
                                if (c14014.m34117() && !c14014.m34131().mo11413()) {
                                    if (interfaceC25186.mo13713()) {
                                        interfaceC25186.mo13721("Cannot reuse, signing enforced on connection " + c14014);
                                    }
                                }
                            }
                            if (!c14014.m34131().mo11401(interfaceC23032)) {
                                if (interfaceC25186.mo13713()) {
                                    interfaceC25186.mo13717("Cannot reuse, different config " + c14014);
                                }
                            } else {
                                if (interfaceC25186.mo13713()) {
                                    interfaceC25186.mo13717("Reusing transport connection " + c14014);
                                }
                                c14014.m1084();
                                return c14014;
                            }
                        }
                    }
                } catch (C20048 e) {
                    interfaceC25186.mo13711("Error while checking for reuse", e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4541 m26967(InterfaceC23032 interfaceC23032, String str, int i, boolean z, boolean z2) throws IOException {
        C13357[] c13357ArrM33883 = ((RunnableC13904) interfaceC23032.mo2872()).m33883(str, true);
        if (c13357ArrM33883.length == 0) {
            throw new UnknownHostException(str);
        }
        Arrays.sort(c13357ArrM33883, new C21695(this));
        synchronized (this.f33426) {
            for (C13357 c13357 : c13357ArrM33883) {
                interfaceC23032.mo2875().getClass();
                interfaceC23032.mo2875().getClass();
                C14014 c14014M26965 = m26965(interfaceC23032, c13357, i, str, z2, true);
                if (c14014M26965 != null) {
                    return c14014M26965;
                }
            }
            IOException e = null;
            for (C13357 c13358 : c13357ArrM33883) {
                InterfaceC25186 interfaceC25186 = f33425;
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13716(c13358, "Trying address {}");
                }
                try {
                    C14014 c14014M26968 = m26968(interfaceC23032, c13358, i, z, z2);
                    c14014M26968.m34120(C14014.class);
                    try {
                        try {
                            c14014M26968.m34136();
                            c14014M26968.m1084();
                            c14014M26968.m1095();
                            return c14014M26968;
                        } catch (IOException e2) {
                            m26969(c14014M26968);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        try {
                            c14014M26968.m1095();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    String strMo28041 = c13358.mo28041();
                    Integer num = (Integer) this.f33428.get(strMo28041);
                    if (num == null) {
                        this.f33428.put(strMo28041, 1);
                    } else {
                        this.f33428.put(strMo28041, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (e != null) {
                throw e;
            }
            throw new C7524("All connection attempts failed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26969(InterfaceC4541 interfaceC4541) {
        InterfaceC25186 interfaceC25186 = f33425;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Scheduling transport connection for removal " + interfaceC4541 + " (" + System.identityHashCode(interfaceC4541) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f33429.add((C14014) interfaceC4541);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26966() {
        synchronized (this.f33426) {
            while (true) {
                C14014 c14014 = (C14014) this.f33429.poll();
                if (c14014 != null) {
                    InterfaceC25186 interfaceC25186 = f33425;
                    if (interfaceC25186.mo13707()) {
                        interfaceC25186.mo13721("Removing transport connection " + c14014 + " (" + System.identityHashCode(c14014) + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    this.f33426.remove(c14014);
                    this.f33427.remove(c14014);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26970() {
        LinkedList linkedList;
        synchronized (this.f33426) {
            m26966();
            f33425.mo13721("Closing pool");
            linkedList = new LinkedList(this.f33426);
            linkedList.addAll(this.f33427);
            this.f33426.clear();
            this.f33427.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zM1089 = false;
        while (it.hasNext()) {
            try {
                zM1089 |= ((C14014) it.next()).m1089(false, false);
            } catch (IOException e) {
                f33425.mo13702("Failed to close connection", (Throwable) e);
            }
        }
        synchronized (this.f33426) {
            m26966();
        }
        return zM1089;
    }
}
