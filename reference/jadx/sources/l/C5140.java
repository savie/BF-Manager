package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5140 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17869;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17870;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17871;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17872;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f17875;

    public C5140(C12562 c12562, C12562 c12563, C12562 c12564, C12562 c12565, C12562 c12566, C12562 c12567) {
        this.f17870 = c12562;
        this.f17869 = c12563;
        this.f17871 = c12564;
        this.f17874 = c12565;
        this.f17873 = c12566;
        this.f17875 = c12567;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f17872) {
            return;
        }
        this.f17872 = true;
        int id = compoundButton.getId();
        C12562 c12562 = this.f17873;
        C12562 c12563 = this.f17874;
        C12562 c12564 = this.f17871;
        C12562 c12565 = this.f17869;
        C12562 c12566 = this.f17870;
        if (id == R.id.MT_Protector) {
            c12566.setChecked(z);
            c12565.setChecked(z);
            c12564.setChecked(z);
            c12563.setChecked(z);
            c12562.setChecked(z);
        } else {
            boolean z2 = c12566.isChecked() && c12565.isChecked() && c12564.isChecked() && c12563.isChecked() && c12562.isChecked();
            C12562 c12567 = this.f17875;
            if (c12567.isChecked() != z2) {
                c12567.setChecked(z2);
            }
        }
        this.f17872 = false;
    }
}
