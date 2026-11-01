package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13852 extends AbstractC10324 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean f45690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12274 f45691;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16465 f45692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0176 f45693;

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final String mo26141(String str, String str2) {
        return str;
    }

    public C13852(AbstractActivityC12483 abstractActivityC12483, C0176 c0176) {
        this.f45693 = c0176;
        C16465 c16465 = new C16465(abstractActivityC12483);
        this.f45692 = c16465;
        c16465.setText(R.string.MT_Protector);
        c16465.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C0176 m33691() {
        return this.f45693;
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۚ */
    public final String mo26146() {
        return "#" + this.f45693.m1373();
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۙ */
    public final void mo26143(C13550 c13550) {
        boolean z = f45690;
        C16465 c16465 = this.f45692;
        c16465.setChecked(z);
        c13550.addView(c16465);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ۬ */
    public final void mo26149() throws Throwable {
        C0176 c0176 = this.f45693;
        c0176.m1377();
        List<C12172> listM1378 = c0176.m1378();
        f45691 = new C12274(listM1378.size());
        for (C12172 c12172 : listM1378) {
            if (f45690) {
                f45691.put(c12172.f40737, c12172.f40738);
            } else {
                f45691.put(c12172.f40738, c12172.f40737);
            }
        }
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ܰ */
    public final String mo26150(String str, String str2) {
        return (String) f45691.getOrDefault(str, null);
    }

    @Override // l.AbstractC10324
    /* JADX INFO: renamed from: ᩹ */
    public final void mo26152() {
        f45691 = null;
        this.f45693.m1375();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        f45690 = z;
    }
}
