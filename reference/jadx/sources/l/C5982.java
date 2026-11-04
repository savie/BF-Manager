package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5982 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20492;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f20493;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20494;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f20495;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2648 f20496;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f20497;

    public C5982(C6728 c6728, C8614 c8614, String str, boolean z, String str2) {
        this.f20495 = c6728;
        this.f20497 = c8614;
        this.f20494 = str;
        this.f20493 = z;
        this.f20492 = str2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f20496 = this.f20497.m23237();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException, C13464 {
        C6728 c6728 = this.f20495;
        AbstractC18881 abstractC18881Mo10174 = c6728.mo10174();
        String str = this.f20494;
        if (abstractC18881Mo10174.mo35586(str)) {
            throw new C13464(R.string.MT_Protector);
        }
        if (this.f20493) {
            c6728.mo10174().mo35582(str);
        } else {
            c6728.mo10174().mo35584(0L, str).close();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f20497.m23230(this.f20492);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f20497.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f20496.m8777();
        C6331.m18054(this.f20495.mo10174().mo35579());
    }
}
