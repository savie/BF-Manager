package l;

import android.content.DialogInterface;
import android.util.Pair;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes3.dex */
public final class C3612 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f12374;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f12375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f12376;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f12377;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f12378;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f12379;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20766 f12380;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f12373 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f12372 = new HashSet();

    public C3612(C20766 c20766, C8614 c8614, List list, Runnable runnable) {
        this.f12380 = c20766;
        this.f12377 = c8614;
        this.f12379 = list;
        this.f12378 = runnable;
        this.f12375 = c20766.f24222.m49876(C1112.m4125(c20766.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f12377.m23233());
        c10745.mo25916((Runnable) null);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25931();
        this.f12376 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        C20766 c20766;
        AbstractC22044 abstractC22044 = this.f12375;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        List<C14406> list = this.f12379;
        C22311 c22311 = new C22311(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c20766 = this.f12380;
            if (!zHasNext) {
                break;
            }
            C14406 c14406 = (C14406) it.next();
            String strM34846 = c14406.m34846();
            String strM34844 = c14406.m34844();
            boolean zM34840 = c14406.m34840();
            C1997 entry = c20766.f66522.getEntry(strM34844.substring(1) + strM34846);
            if (entry == null) {
                entry = zM34840 ? c20766.f66522.getEntry(strM34846) : null;
            }
            if (entry == null) {
                c14406.m34838();
            } else {
                c22311.mo13466(entry.m6835(), Pair.create(c14406, entry));
            }
        }
        C22069.m49901(c22311.keySet(), new C23750(this, c20766, this.f12376, c22311));
        if (this.f12376.m27399()) {
            return;
        }
        for (C14406 c14407 : list) {
            if (c14407.m34837() && c14407.m34845() == null) {
                throw new IOException("Extract file failed: " + c14407.m34846());
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f12376.m27399()) {
            this.f12375.mo4296();
        } else {
            this.f12374 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f12375.mo4296();
        this.f12377.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f12376.m27405();
        C6331.m18055();
        if (!this.f12374) {
            return;
        }
        C20766 c20766 = this.f12380;
        Iterator it = c20766.m20206().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f12373;
            if (zHasNext) {
                C21120 c21120 = (C21120) it.next();
                if (!this.f12372.contains(c21120.m48220())) {
                    arrayList.add(c21120);
                }
            } else {
                c20766.m20198((List) arrayList);
                try {
                    this.f12378.run();
                    return;
                } catch (Throwable th) {
                    this.f12377.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
        }
    }
}
