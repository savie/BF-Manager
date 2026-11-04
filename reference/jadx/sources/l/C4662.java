package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4662 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16462;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f16463 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f16464;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f16465;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10043 f16466;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22941 f16467;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f16468;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f16469;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f16470;

    public C4662(C15102 c15102, C8614 c8614, List list, Runnable runnable) {
        this.f16464 = c15102;
        this.f16469 = c8614;
        this.f16468 = list;
        this.f16470 = runnable;
        this.f16465 = c15102.f24222.m49876(C1112.m4125(c15102.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10043 c10043 = new C10043(this.f16469.m23233());
        c10043.m25920(R.string.MT_Protector);
        c10043.m25929("...");
        c10043.mo25916((Runnable) null);
        c10043.m25932();
        this.f16466 = c10043;
        if (this.f16468.size() == 1) {
            this.f16466.m25924();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        AbstractC22044 abstractC22044 = this.f16465;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        C15102 c15102 = this.f16464;
        C22941 c22941M51705 = C22941.m51705(C14584.m35193(c15102.m36371(), new String[0]), c15102.m36370());
        this.f16467 = c22941M51705;
        c22941M51705.m51730(c15102.m36372());
        List<C14406> list = this.f16468;
        int i = 0;
        for (C14406 c14406 : list) {
            if (this.f16466.m27399()) {
                return;
            }
            i++;
            this.f16466.m25925(0);
            this.f16466.m25919(i, list.size());
            this.f16466.m25929(c14406.m34846());
            String strM34846 = c14406.m34846();
            String strM34844 = c14406.m34844();
            boolean zM34840 = c14406.m34840();
            C8002 entry = c15102.f49290.getEntry(strM34844.substring(1) + strM34846);
            if (entry == null) {
                entry = zM34840 ? c15102.f49290.getEntry(strM34846) : null;
            }
            if (entry == null) {
                c14406.m34838();
            } else {
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(c14406.m34842());
                C18902.m43876(c15102.m36371(), this.f16467, entry, abstractC22044M49876, true, new C13876(this, entry));
                c14406.m34839(abstractC22044M49876);
                this.f16463.add(new C21120(abstractC22044M49876, c14406.m34846(), entry.getName()));
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f16466.m27399()) {
            this.f16465.mo4296();
        } else {
            this.f16462 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f16469.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f16465.mo4296();
        if (exc instanceof C16227) {
            C22941 c22941 = this.f16467;
            if (c22941 != null) {
                c22941.m51730((String) null);
            }
            this.f16464.f49290.m54374(null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C22941 c22941 = this.f16467;
        C15102 c15102 = this.f16464;
        if (c22941 != null) {
            c15102.f49290.m54374(this.f16467.m51725());
            C20244.m46520(this.f16467);
        }
        this.f16466.m27405();
        C6331.m18055();
        if (this.f16462) {
            c15102.m20197(this.f16463);
            try {
                this.f16470.run();
            } catch (Throwable th) {
                this.f16469.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
