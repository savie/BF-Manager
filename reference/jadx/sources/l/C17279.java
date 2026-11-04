package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17279 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f56278;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f56279 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5368 f56280;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f56281;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10043 f56282;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f56283;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f56284;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f56285;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3109 f56286;

    public C17279(C3109 c3109, C8614 c8614, List list, Runnable runnable) {
        this.f56286 = c3109;
        this.f56283 = c8614;
        this.f56285 = list;
        this.f56284 = runnable;
        this.f56281 = c3109.f24222.m49876(C1112.m4125(c3109.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10043 c10043 = new C10043(this.f56283.m23233());
        c10043.m25920(R.string.MT_Protector);
        c10043.m25929("...");
        c10043.mo25916((Runnable) null);
        c10043.m25932();
        this.f56282 = c10043;
        if (this.f56285.size() == 1) {
            this.f56282.m25924();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        AbstractC22044 abstractC22044 = this.f56281;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        C3109 c3109 = this.f56286;
        this.f56280 = c3109.f10075.m28596();
        List<C14406> list = this.f56285;
        int i = 0;
        for (C14406 c14406 : list) {
            if (this.f56282.m27399()) {
                return;
            }
            i++;
            this.f56282.m25925(0);
            this.f56282.m25919(i, list.size());
            this.f56282.m25929(c14406.m34846());
            String strM34846 = c14406.m34846();
            String strM34844 = c14406.m34844();
            boolean zM34840 = c14406.m34840();
            C7450 entry = c3109.f10075.getEntry(strM34844.substring(1) + strM34846);
            if (entry == null) {
                entry = zM34840 ? c3109.f10075.getEntry(strM34846) : null;
            }
            if (entry == null) {
                c14406.m34838();
            } else {
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(c14406.m34842());
                C10016.m25867(this.f56280, entry, abstractC22044M49876, new C16533(this));
                c14406.m34839(abstractC22044M49876);
                this.f56279.add(new C21120(abstractC22044M49876, c14406.m34846(), entry.m20456()));
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f56282.m27399()) {
            this.f56281.mo4296();
        } else {
            this.f56278 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f56283.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f56281.mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C5368 c5368 = this.f56280;
        if (c5368 != null) {
            C20244.m46520(c5368);
        }
        this.f56282.m27405();
        C6331.m18055();
        if (this.f56278) {
            this.f56286.m20197(this.f56279);
            try {
                this.f56284.run();
            } catch (Throwable th) {
                this.f56283.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
