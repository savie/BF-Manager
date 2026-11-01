package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17749 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18455 f56311;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17749(Main main, String str, InterfaceC18455 interfaceC18455) {
        super(main, -1);
        this.f56312 = str;
        this.f56311 = interfaceC18455;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.contains("\\") || strM40352.contains("/")) {
            m40365(R.string.MT_Protector);
        } else if (C5553.m15313(C6730.m18162(this.f56312, strM40352), new String[0]).mo33975()) {
            m40365(R.string.MT_Protector);
        } else {
            m40364();
            this.f56311.mo42803(strM40352);
        }
    }
}
