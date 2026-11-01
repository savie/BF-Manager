package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9872 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f33713;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f33714;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33715;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f33716;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f33717;

    public C9872(ViewOnClickListenerC3520 viewOnClickListenerC3520, AbstractActivityC12483 abstractActivityC12483, String str) {
        this.f33713 = viewOnClickListenerC3520;
        this.f33714 = abstractActivityC12483;
        this.f33715 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f33714, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987, IOException {
        String strM46730 = C5553.m15313(this.f33715, new String[0]).m46730();
        this.f33717 = strM46730;
        String strM48325 = AbstractC21616.m48325(strM46730);
        if (strM48325 == null) {
            throw new C4987(this.f33713.getString(R.string.MT_Protector));
        }
        this.f33716 = C20630.m46498(1, 1, strM48325);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        String strM50154 = C22627.m50154(this.f33716);
        String strM50150 = C22627.m50150(this.f33716);
        if (strM50154.length() > 130 || C14562.m35036(strM50154)) {
            strM50154 = "# TOO_LONG_NAME/";
        }
        if (strM50150.length() > 100) {
            strM50150 = strM50150.substring(0, 50) + "_too_long_" + Long.toHexString(((long) strM50150.hashCode()) & 4294967295L);
        }
        this.f33713.m10354(R.string.MT_Protector, strM50154, strM50150, true, new InterfaceC8400() { // from class: l.֫᩹ۜ
            @Override // l.InterfaceC8400
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3208(Object obj, Object obj2) {
                return this.f7763.f33717;
            }
        });
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f33714.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
