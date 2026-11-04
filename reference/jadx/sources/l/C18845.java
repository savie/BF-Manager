package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18845 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC2437 f61219;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18845(AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f61219 = abstractDialogInterfaceOnClickListenerC2437;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437 = this.f61219;
        String strM22914 = m22914();
        if (strM22914.length() == 0) {
            m22951();
            return;
        }
        AbstractC22044 abstractC22044M19191 = C6912.m19191(strM22914);
        if (abstractC22044M19191.mo2934()) {
            m22952(R.string.MT_Protector);
            return;
        }
        try {
            abstractC22044M19191.mo49834();
            if (!abstractC22044M19191.mo4283()) {
                throw new IOException("Can not create file: " + abstractC22044M19191.mo4294());
            }
            abstractDialogInterfaceOnClickListenerC2437.f7813 = C6912.m19190();
            if (!abstractDialogInterfaceOnClickListenerC2437.f7813.isEmpty()) {
                abstractDialogInterfaceOnClickListenerC2437.f7814.notifyDataSetChanged();
            } else {
                abstractDialogInterfaceOnClickListenerC2437.f7801.dismiss();
            }
            m22951();
        } catch (IOException e) {
            m22925(e.getMessage());
        }
    }
}
