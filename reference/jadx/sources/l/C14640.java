package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14640 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f47871;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f47872;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f47873;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f47874 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f47875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2455 f47876;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f47877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20164 f47878;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f47879;

    public C14640(C13810 c13810, C11545 c11545, List list, Runnable runnable) {
        this.f47873 = c13810;
        this.f47877 = c11545;
        this.f47875 = list;
        this.f47879 = runnable;
        this.f47871 = c13810.f38587.m46690(C16845.m39503(c13810.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20164 c20164 = new C20164(this.f47877.m28824());
        c20164.m45586(R.string.MT_Protector);
        c20164.m45588("...");
        c20164.mo5828((Runnable) null);
        c20164.m45600();
        this.f47878 = c20164;
        if (this.f47875.size() == 1) {
            this.f47878.m45598();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        AbstractC20745 abstractC20745 = this.f47871;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        C13810 c13810 = this.f47873;
        C2455 c2455M7448 = C2455.m7448(C5553.m15313(c13810.m33624(), new String[0]), c13810.m33620());
        this.f47876 = c2455M7448;
        c2455M7448.m7474(c13810.m33622());
        List<C10840> list = this.f47875;
        int i = 0;
        for (C10840 c10840 : list) {
            if (this.f47878.m5824()) {
                return;
            }
            i++;
            this.f47878.m45591(0);
            this.f47878.m45593(i, list.size());
            this.f47878.m45588(c10840.m27170());
            String strM27170 = c10840.m27170();
            String strM27174 = c10840.m27174();
            boolean zM27176 = c10840.m27176();
            C12107 entry = c13810.f45582.getEntry(strM27174.substring(1) + strM27170);
            if (entry == null) {
                entry = zM27176 ? c13810.f45582.getEntry(strM27170) : null;
            }
            if (entry == null) {
                c10840.m27172();
            } else {
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(c10840.m27169());
                C19808.m45038(c13810.m33624(), this.f47876, entry, abstractC20745M46690, true, new C23812(this, entry));
                c10840.m27173(abstractC20745M46690);
                this.f47874.add(new C23540(abstractC20745M46690, c10840.m27170(), entry.getName()));
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f47878.m5824()) {
            this.f47871.mo24647();
        } else {
            this.f47872 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f47877.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f47871.mo24647();
        if (exc instanceof C17978) {
            C2455 c2455 = this.f47876;
            if (c2455 != null) {
                c2455.m7474((String) null);
            }
            this.f47873.f45582.m21713(null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C2455 c2455 = this.f47876;
        C13810 c13810 = this.f47873;
        if (c2455 != null) {
            c13810.f45582.m21713(this.f47876.m7477());
            C19431.m44468(this.f47876);
        }
        this.f47878.m5825();
        C21094.m47530();
        if (this.f47872) {
            c13810.m28621(this.f47874);
            try {
                this.f47879.run();
            } catch (Throwable th) {
                this.f47877.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
