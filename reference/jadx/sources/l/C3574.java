package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3574 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f13141;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f13142;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4715 f13143;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f13144 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f13145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f13146;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f13147;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f13148;

    public C3574(C4715 c4715, C11545 c11545, List list, Runnable runnable) {
        this.f13143 = c4715;
        this.f13146 = c11545;
        this.f13145 = list;
        this.f13148 = runnable;
        this.f13141 = c4715.f38587.m46690(C16845.m39503(c4715.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f13146.m28824());
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f13147 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        AbstractC20745 abstractC20745 = this.f13141;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        C10840 c10840 = null;
        for (C10840 c10841 : this.f13145) {
            if (c10840 == null && (c10841.m27175() instanceof C6397)) {
                c10840 = c10841;
            } else {
                c10841.m27172();
            }
        }
        if (c10840 == null) {
            return;
        }
        this.f13147.m5840(0);
        this.f13147.m5832(c10840.m27170());
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(c10840.m27169());
        C14865 c14865 = this.f13143.f16631;
        this.f13146.m28824();
        C8141 c8141Mo24616 = c14865.mo24616(c10840.m27175());
        try {
            c8141Mo24616.m21449().m22243(this.f13147.m5835());
            abstractC20745M46690.m46695(c8141Mo24616, 0L, new InterfaceC8978() { // from class: l.ۢ᩻᩹
                @Override // l.InterfaceC8978
                /* JADX INFO: renamed from: ۘۙ */
                public final /* synthetic */ void mo2885() {
                    throw null;
                }

                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f33906.f13147.m5824();
                }
            });
            c8141Mo24616.close();
            if (this.f13147.m5824()) {
                return;
            }
            c10840.m27173(abstractC20745M46690);
            this.f13144.add(new C23540(abstractC20745M46690, c10840.m27170(), c10840.m27170()));
        } catch (Throwable th) {
            try {
                c8141Mo24616.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f13147.m5824()) {
            this.f13141.mo24647();
        } else {
            this.f13142 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (!this.f13147.m5824()) {
            this.f13146.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        }
        this.f13141.mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f13147.m5825();
        C21094.m47530();
        if (this.f13142) {
            this.f13143.m28621(this.f13144);
            try {
                this.f13148.run();
            } catch (Throwable th) {
                this.f13146.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
