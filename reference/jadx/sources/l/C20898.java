package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20898 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f66892;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f66893;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12765 f66894;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f66895;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f66896;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8585 f66897;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f66898;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f66899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f66891 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12919 f66890 = new C12919(0);

    public C20898(C6728 c6728, C8614 c8614, C20168 c20168, List list, Runnable runnable) {
        this.f66899 = c6728;
        this.f66898 = c8614;
        this.f66897 = c20168;
        this.f66895 = list;
        this.f66896 = runnable;
        this.f66893 = c6728.f24222.m49876(C1112.m4125(c6728.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C12765 c12765 = new C12765(this.f66898.m23233());
        c12765.m31643(C21576.m49075(R.string.MT_Protector));
        c12765.m31635((Runnable) null);
        c12765.m31640();
        this.f66894 = c12765;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47763() {
        return this.f66894.m31648() || this.f66897.mo23076() == EnumC2619.DESTROYED;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        AbstractC22044 abstractC22044 = this.f66893;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        ArrayList<C12693> arrayList = new ArrayList();
        AbstractC18881 abstractC18881Mo10174 = this.f66899.mo10174();
        long size = 0;
        for (C14406 c14406 : this.f66895) {
            InterfaceC2386 interfaceC2386Mo20831 = abstractC18881Mo10174.mo20831(c14406.m34843());
            if (interfaceC2386Mo20831 != null) {
                C13352 c13352 = (C13352) interfaceC2386Mo20831;
                if (c13352.mo8090()) {
                    size += c13352.getSize();
                    C12693 c12693 = new C12693(0);
                    c12693.f40656 = c14406;
                    c12693.f40657 = interfaceC2386Mo20831;
                    c12693.f40655 = abstractC22044.m49876(c14406.m34842());
                    arrayList.add(c12693);
                }
            }
            c14406.m34838();
        }
        C1858 c1858 = new C1858(arrayList.size(), size);
        C12765 c12765 = this.f66894;
        c12765.getClass();
        c12765.m31645(R.string.MT_Protector);
        C3965 c3965 = new C3965(abstractC18881Mo10174);
        C3744 c3744 = new C3744(this, c1858);
        C12919 c12919 = this.f66890;
        c12919.m31997();
        try {
            InterfaceC20670 interfaceC20670Distinct = C1170.stream(arrayList).map(new C23882()).distinct();
            C17359.requireNonNull(abstractC18881Mo10174);
            interfaceC20670Distinct.forEach(new C5331(1, abstractC18881Mo10174));
            for (C12693 c12694 : arrayList) {
                this.f66894.m31639(c12694.f40656.m34846());
                c3965.m12710(c12694.f40657.getPath(), c12694.f40655, c3744);
                if (!m47763()) {
                    c12694.f40656.m34839(c12694.f40655);
                    this.f66891.add(new C21120(c12694.f40655, c12694.f40655.getName(), c12694.f40657.getPath()));
                    c1858.m6376();
                } else {
                    c12919.m31996();
                    return;
                }
            }
            c12919.m31996();
        } catch (Throwable th) {
            c12919.m31996();
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (m47763()) {
            Iterator it = this.f66891.iterator();
            while (it.hasNext()) {
                ((C21120) it.next()).m48215().mo4287();
            }
            return;
        }
        this.f66892 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f66898.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        Iterator it = this.f66891.iterator();
        while (it.hasNext()) {
            ((C21120) it.next()).m48215().mo4287();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f66894.m31644();
        C6331.m18055();
        if (this.f66892) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = this.f66891;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C21120) it.next()).m48220().toLowerCase());
            }
            C6728 c6728 = this.f66899;
            int i = 0;
            for (C21120 c21120 : c6728.m20206()) {
                if (c21120.m48219() && hashSet.add(c21120.m48220().toLowerCase())) {
                    arrayList.add(i, c21120);
                    i++;
                }
            }
            c6728.m20197(arrayList);
            try {
                this.f66896.run();
            } catch (Throwable th) {
                this.f66898.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
