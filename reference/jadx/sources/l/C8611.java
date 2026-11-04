package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8611 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28120;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28121;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28123;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28124;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28125;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f28126;

    public C8611(C1255 c1255, C1255 c1256, C1255 c1257, C1255 c1258, C1255 c1259, C1255 c12510) {
        this.f28122 = c1255;
        this.f28124 = c1256;
        this.f28121 = c1257;
        this.f28125 = c1258;
        this.f28120 = c1259;
        this.f28126 = c12510;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f28123) {
            return;
        }
        this.f28123 = true;
        int id = compoundButton.getId();
        C1255 c1255 = this.f28120;
        C1255 c1256 = this.f28125;
        C1255 c1257 = this.f28121;
        C1255 c1258 = this.f28124;
        C1255 c1259 = this.f28122;
        if (id == R.id.MT_Protector) {
            c1259.setChecked(z);
            c1258.setChecked(z);
            c1257.setChecked(z);
            c1256.setChecked(z);
            c1255.setChecked(z);
        } else {
            boolean z2 = c1259.isChecked() && c1258.isChecked() && c1257.isChecked() && c1256.isChecked() && c1255.isChecked();
            C1255 c12510 = this.f28126;
            if (c12510.isChecked() != z2) {
                c12510.setChecked(z2);
            }
        }
        this.f28123 = false;
    }
}
