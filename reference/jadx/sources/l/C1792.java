package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1792 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f6120;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10681 f6121;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f6122;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3374 f6123;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f6124;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f6125;

    public C1792(Main main, long j, boolean z) {
        this.f6120 = main;
        this.f6125 = j;
        this.f6122 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f6120);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f6124 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C10745 c10745 = this.f6124;
        C17359.requireNonNull(c10745);
        this.f6121 = C19632.m45275(this.f6125, this.f6122, new C12978(c10745), new C5521(this));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C10681 c10681 = this.f6121;
        if (c10681 == null || c10681.m27229() || this.f6124.m27399()) {
            return;
        }
        if (this.f6121.m27230() > 0) {
            C22673.m51154((CharSequence) C21576.m49059(R.string.MT_Protector, Integer.valueOf(this.f6121.m27230())));
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f6120.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f6124.m27405();
        C6331.m18055();
    }
}
