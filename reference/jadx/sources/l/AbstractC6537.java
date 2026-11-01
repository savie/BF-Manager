package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6537 implements InterfaceC18095 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC16511 f22007;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Looper f22010;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9724 f22011;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22008 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f22012 = new HashSet(1);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7512 f22006 = new C7512();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21200 f22009 = new C21200();

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۖ */
    public /* synthetic */ AbstractC16511 mo5887() {
        return null;
    }

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo4104();

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo4109(C13689 c13689) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4110(InterfaceC19706 interfaceC19706);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo17763() {
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo5893() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo17769() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17759(AbstractC16511 abstractC16511) {
        this.f22007 = abstractC16511;
        Iterator it = this.f22008.iterator();
        while (it.hasNext()) {
            ((InterfaceC21623) it.next()).mo18265(this, abstractC16511);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7512 m17767(C15274 c15274) {
        return this.f22006.m20012(0, c15274);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7512 m17766(int i, C15274 c15274) {
        return this.f22006.m20012(i, c15274);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17756(Handler handler, InterfaceC16262 interfaceC16262) {
        handler.getClass();
        this.f22009.m47659(handler, interfaceC16262);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17757(Handler handler, InterfaceC20918 interfaceC20918) {
        handler.getClass();
        this.f22006.m20013(handler, interfaceC20918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21200 m17755(C15274 c15274) {
        return this.f22009.m47656(0, c15274);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21200 m17754(int i, C15274 c15274) {
        return this.f22009.m47656(i, c15274);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m17765() {
        return !this.f22012.isEmpty();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9724 m17753() {
        C9724 c9724 = this.f22011;
        C2023.m6508(c9724);
        return c9724;
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17760(InterfaceC20918 interfaceC20918) {
        this.f22006.m20018(interfaceC20918);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17758(InterfaceC16262 interfaceC16262) {
        this.f22009.m47661(interfaceC16262);
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17762(InterfaceC21623 interfaceC21623, InterfaceC19706 interfaceC19706, C9724 c9724) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f22010;
        C2023.m6507(looper == null || looper == looperMyLooper);
        this.f22011 = c9724;
        AbstractC16511 abstractC16511 = this.f22007;
        this.f22008.add(interfaceC21623);
        if (this.f22010 == null) {
            this.f22010 = looperMyLooper;
            this.f22012.add(interfaceC21623);
            mo4110(interfaceC19706);
        } else if (abstractC16511 != null) {
            mo17761(interfaceC21623);
            interfaceC21623.mo18265(this, abstractC16511);
        }
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17761(InterfaceC21623 interfaceC21623) {
        this.f22010.getClass();
        HashSet hashSet = this.f22012;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC21623);
        if (zIsEmpty) {
            mo17769();
        }
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo17764(InterfaceC21623 interfaceC21623) {
        HashSet hashSet = this.f22012;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC21623);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo17763();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo17768(InterfaceC21623 interfaceC21623) {
        ArrayList arrayList = this.f22008;
        arrayList.remove(interfaceC21623);
        if (arrayList.isEmpty()) {
            this.f22010 = null;
            this.f22007 = null;
            this.f22011 = null;
            this.f22012.clear();
            mo4104();
            return;
        }
        mo17764(interfaceC21623);
    }
}
