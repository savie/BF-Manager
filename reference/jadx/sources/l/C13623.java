package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P4VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13623 extends AbstractC12635 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C9086 f43269;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f43270;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19023 f43271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18099 f43272;

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final String mo31402(String str, String str2) {
        return str;
    }

    public C13623(AbstractActivityC17204 abstractActivityC17204, C18099 c18099) {
        this.f43272 = c18099;
        C19023 c19023 = new C19023(abstractActivityC17204);
        this.f43271 = c19023;
        c19023.setText(R.string.MT_Protector);
        c19023.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18099 m33373() {
        return this.f43272;
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩴ */
    public final String mo31412() {
        return "#" + this.f43272.m42221();
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۙ */
    public final void mo31404(C4925 c4925) {
        boolean z = f43270;
        C19023 c19023 = this.f43271;
        c19023.setChecked(z);
        c4925.addView(c19023);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ۚ */
    public final void mo31407() throws Throwable {
        C18099 c18099 = this.f43272;
        c18099.m42218();
        List<C7658> listM42216 = c18099.m42216();
        f43269 = new C9086(listM42216.size());
        for (C7658 c7658 : listM42216) {
            if (f43270) {
                f43269.put(c7658.f25230, c7658.f25231);
            } else {
                f43269.put(c7658.f25231, c7658.f25230);
            }
        }
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ᩷ */
    public final String mo31413(String str, String str2) {
        return (String) f43269.get(str);
    }

    @Override // l.AbstractC12635
    /* JADX INFO: renamed from: ܳ */
    public final void mo31411() {
        f43269 = null;
        this.f43272.m42214();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        f43270 = z;
    }
}
