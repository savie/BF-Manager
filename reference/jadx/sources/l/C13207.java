package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13207 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f43940;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f43941;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10755 f43942;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f43943 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f43944;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f43945;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f43946;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20164 f43947;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23085 f43948;

    public C13207(C23085 c23085, C11545 c11545, List list, Runnable runnable) {
        this.f43948 = c23085;
        this.f43945 = c11545;
        this.f43946 = list;
        this.f43944 = runnable;
        this.f43940 = c23085.f38587.m46690(C16845.m39503(c23085.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20164 c20164 = new C20164(this.f43945.m28824());
        c20164.m45586(R.string.MT_Protector);
        c20164.m45588("...");
        c20164.mo5828((Runnable) null);
        c20164.m45600();
        this.f43947 = c20164;
        if (this.f43946.size() == 1) {
            this.f43947.m45598();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        AbstractC20745 abstractC20745 = this.f43940;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        C23085 c23085 = this.f43948;
        this.f43942 = C10755.m27052(C5553.m15313(c23085.m51086(), new String[0]));
        List<C10840> list = this.f43946;
        int i = 0;
        for (C10840 c10840 : list) {
            if (this.f43947.m5824()) {
                return;
            }
            i++;
            this.f43947.m45591(0);
            this.f43947.m45593(i, list.size());
            this.f43947.m45588(c10840.m27170());
            String strM27170 = c10840.m27170();
            String strM27174 = c10840.m27174();
            boolean zM27176 = c10840.m27176();
            C10049 entry = c23085.f75016.getEntry(strM27174.substring(1) + strM27170);
            if (entry == null) {
                entry = zM27176 ? c23085.f75016.getEntry(strM27170) : null;
            }
            if (entry == null) {
                c10840.m27172();
            } else {
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(c10840.m27169());
                C6296.m17380(this.f43942, entry, abstractC20745M46690, new C1211(this));
                c10840.m27173(abstractC20745M46690);
                this.f43943.add(new C23540(abstractC20745M46690, c10840.m27170(), entry.m25433()));
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f43947.m5824()) {
            this.f43940.mo24647();
        } else {
            this.f43941 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f43945.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f43940.mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C10755 c10755 = this.f43942;
        if (c10755 != null) {
            C19431.m44468(c10755);
        }
        this.f43947.m5825();
        C21094.m47530();
        if (this.f43941) {
            this.f43948.m28621(this.f43943);
            try {
                this.f43944.run();
            } catch (Throwable th) {
                this.f43945.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
