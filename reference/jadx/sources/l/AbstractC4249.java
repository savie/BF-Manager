package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4249 extends AbstractC4955 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f15357 = C13488.m32998(AbstractC4249.class.getName());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f15358 = C17178.f54761;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f15359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC3066 f15360;

    /* JADX INFO: renamed from: ֨ */
    public abstract String mo4992();

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo4993();

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo4994();

    /* JADX INFO: renamed from: ۙ */
    public abstract C22034 mo4995(C0244 c0244, C22034 c22034);

    /* JADX INFO: renamed from: ۙ */
    public abstract C22034 mo4996(C22034 c22034);

    /* JADX INFO: renamed from: ۚ */
    public abstract C22034 mo4997();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo4998();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int m12011() {
        return f15358;
    }

    public AbstractC4249(C22823 c22823, int i) {
        super(c22823);
        this.f15360 = null;
        this.f15359 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m12017() {
        return this.f15359;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12013(EnumC3066 enumC3066) {
        synchronized (m13745()) {
            m13745().m50542(this, enumC3066);
        }
        Iterator it = ((ConcurrentMapC13783) m13745().m50563()).values().iterator();
        while (it.hasNext()) {
            ((C0244) ((AbstractC11015) it.next())).m1647(this, enumC3066);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m12014() {
        synchronized (m13745()) {
            m13745().m50541(this);
        }
        Iterator it = ((ConcurrentMapC13783) m13745().m50563()).values().iterator();
        while (it.hasNext()) {
            ((C0244) ((AbstractC11015) it.next())).m1646(this);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C22034 c22034Mo4997 = mo4997();
        try {
            if (!mo4993()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (m13745()) {
                if (m13745().m50559(this, this.f15360)) {
                    f15357.mo12139("{}.run() JmDNS {} {}", mo4999(), mo4992(), m13745().getName());
                    arrayList.add(m13745());
                    c22034Mo4997 = mo4996(c22034Mo4997);
                }
            }
            Iterator it = ((ConcurrentMapC13783) m13745().m50563()).values().iterator();
            while (it.hasNext()) {
                C0244 c0244 = (C0244) ((AbstractC11015) it.next());
                synchronized (c0244) {
                    if (c0244.m1667(this, this.f15360)) {
                        f15357.mo12139("{}.run() JmDNS {} {}", mo4999(), mo4992(), c0244.mo1670());
                        arrayList.add(c0244);
                        c22034Mo4997 = mo4995(c0244, c22034Mo4997);
                    }
                }
            }
            if (!c22034Mo4997.m6981()) {
                f15357.mo12139("{}.run() JmDNS {} #{}", mo4999(), mo4992(), this.f15360);
                m13745().m50547(c22034Mo4997);
                m12012(arrayList);
                mo4998();
                return;
            }
            m12012(arrayList);
            cancel();
        } catch (Throwable th) {
            f15357.mo12122(mo4999() + ".run() exception ", th);
            mo4994();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12012(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC12157 interfaceC12157 = (InterfaceC12157) it.next();
            synchronized (interfaceC12157) {
                interfaceC12157.mo1648(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC3066 m12015() {
        return this.f15360;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12016(EnumC3066 enumC3066) {
        this.f15360 = enumC3066;
    }
}
