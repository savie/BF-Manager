package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9395 implements InterfaceC13622 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Looper f30491;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC24755 f30493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20738 f30496;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f30492 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f30497 = new HashSet(1);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15617 f30495 = new C15617();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12994 f30494 = new C12994();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo16145();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16151(InterfaceC4639 interfaceC4639);

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void mo24727(C14902 c14902) {
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ boolean mo24731() {
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo16152() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo16153() {
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public /* synthetic */ AbstractC24755 mo24736() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24728(AbstractC24755 abstractC24755) {
        this.f30493 = abstractC24755;
        Iterator it = this.f30492.iterator();
        while (it.hasNext()) {
            ((InterfaceC6911) it.next()).mo19189(this, abstractC24755);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15617 m24734(C8402 c8402) {
        return this.f30495.m37360(0, c8402);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15617 m24733(int i, C8402 c8402) {
        return this.f30495.m37360(i, c8402);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24721(Handler handler, InterfaceC5537 interfaceC5537) {
        handler.getClass();
        this.f30494.m32409(handler, interfaceC5537);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24722(Handler handler, InterfaceC13380 interfaceC13380) {
        handler.getClass();
        this.f30495.m37361(handler, interfaceC13380);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12994 m24720(C8402 c8402) {
        return this.f30494.m32406(0, c8402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12994 m24719(int i, C8402 c8402) {
        return this.f30494.m32406(i, c8402);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m24729() {
        return !this.f30497.isEmpty();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20738 m24732() {
        C20738 c20738 = this.f30496;
        C20782.m47566(c20738);
        return c20738;
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24726(InterfaceC13380 interfaceC13380) {
        this.f30495.m37363(interfaceC13380);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24723(InterfaceC5537 interfaceC5537) {
        this.f30494.m32411(interfaceC5537);
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24725(InterfaceC6911 interfaceC6911, InterfaceC4639 interfaceC4639, C20738 c20738) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f30491;
        C20782.m47565(looper == null || looper == looperMyLooper);
        this.f30496 = c20738;
        AbstractC24755 abstractC24755 = this.f30493;
        this.f30492.add(interfaceC6911);
        if (this.f30491 == null) {
            this.f30491 = looperMyLooper;
            this.f30497.add(interfaceC6911);
            mo16151(interfaceC4639);
        } else if (abstractC24755 != null) {
            mo24724(interfaceC6911);
            interfaceC6911.mo19189(this, abstractC24755);
        }
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24724(InterfaceC6911 interfaceC6911) {
        this.f30491.getClass();
        HashSet hashSet = this.f30497;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC6911);
        if (zIsEmpty) {
            mo16152();
        }
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo24730(InterfaceC6911 interfaceC6911) {
        HashSet hashSet = this.f30497;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC6911);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo16153();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo24735(InterfaceC6911 interfaceC6911) {
        ArrayList arrayList = this.f30492;
        arrayList.remove(interfaceC6911);
        if (arrayList.isEmpty()) {
            this.f30491 = null;
            this.f30493 = null;
            this.f30496 = null;
            this.f30497.clear();
            mo16145();
            return;
        }
        mo24730(interfaceC6911);
    }
}
