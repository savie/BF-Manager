package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11804 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC25231 f38123;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ۚᩳ᩻] */
    public C11804(ViewOnClickListenerC25231 viewOnClickListenerC25231, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f38123 = viewOnClickListenerC25231;
        m22958(C21576.m49059(R.string.MT_Protector, 10));
        m22930();
        m22915(C3296.f10741);
        final TextView textViewM22938 = m22938();
        textViewM22938.setVisibility(8);
        m22923(new C2110(new Runnable() { // from class: l.ۚᩳ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C11804 c11804 = this.f20061;
                int iM41607 = c11804.f38123.f81491.m41607();
                TextView textView = textViewM22938;
                if (iM41607 > 0) {
                    try {
                        if (Integer.parseInt(c11804.m22914()) <= 10) {
                            textView.setVisibility(0);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                textView.setVisibility(8);
            }
        }));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C17771 c17771 = this.f38123.f81491;
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            m22951();
            return;
        }
        try {
            int i = Integer.parseInt(strM22914);
            if (i < 0) {
                throw new NumberFormatException();
            }
            while (c17771.f58348.m38619() > i) {
                c17771.f58348.m38617();
            }
            c17771.f58348.m38623();
            C17771.m41579(c17771);
            c17771.m41604();
            m22951();
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
