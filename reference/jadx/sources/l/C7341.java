package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7341 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24161;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f24162 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14052 f24163;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f24164;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f24165;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f24166;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f24167;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f24168;

    public C7341(C14052 c14052, C8614 c8614, List list, Runnable runnable) {
        this.f24163 = c14052;
        this.f24167 = c8614;
        this.f24166 = list;
        this.f24168 = runnable;
        this.f24164 = c14052.f24222.m49876(C1112.m4125(c14052.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f24167.m23233());
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f24165 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        AbstractC22044 abstractC22044 = this.f24164;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        C14406 c14406 = null;
        for (C14406 c14407 : this.f24166) {
            if (c14406 == null && (c14407.m34841() instanceof C19274)) {
                c14406 = c14407;
            } else {
                c14407.m34838();
            }
        }
        if (c14406 == null) {
            return;
        }
        this.f24165.m27403(0);
        this.f24165.m27393(c14406.m34846());
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(c14406.m34842());
        C9577 c9577 = this.f24163.f44503;
        this.f24167.m23233();
        C23838 c23838Mo20832 = c9577.mo20832(c14406.m34841());
        try {
            c23838Mo20832.m53163().m11080(this.f24165.m27398());
            abstractC22044M49876.m49841(c23838Mo20832, 0L, new InterfaceC23711() { // from class: l.۠ᩴ۫
                @Override // l.InterfaceC23711
                /* JADX INFO: renamed from: ֫ۙ */
                public final /* synthetic */ void mo3465() {
                    throw null;
                }

                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f28890.f24165.m27399();
                }
            });
            c23838Mo20832.close();
            if (this.f24165.m27399()) {
                return;
            }
            c14406.m34839(abstractC22044M49876);
            this.f24162.add(new C21120(abstractC22044M49876, c14406.m34846(), c14406.m34846()));
        } catch (Throwable th) {
            try {
                c23838Mo20832.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f24165.m27399()) {
            this.f24164.mo4296();
        } else {
            this.f24161 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (!this.f24165.m27399()) {
            this.f24167.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        }
        this.f24164.mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f24165.m27405();
        C6331.m18055();
        if (this.f24161) {
            this.f24163.m20197(this.f24162);
            try {
                this.f24168.run();
            } catch (Throwable th) {
                this.f24167.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
