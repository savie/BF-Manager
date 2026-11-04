package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25045 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16839 f81018;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81019;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25045(Main main, String str, InterfaceC16839 interfaceC16839) {
        super(main, -1);
        this.f81019 = str;
        this.f81018 = interfaceC16839;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.contains("\\") || strM22914.contains("/")) {
            m22952(R.string.MT_Protector);
        } else if (C14584.m35193(C11293.m28549(this.f81019, strM22914), new String[0]).mo2934()) {
            m22952(R.string.MT_Protector);
        } else {
            m22951();
            this.f81018.mo29188(strM22914);
        }
    }
}
