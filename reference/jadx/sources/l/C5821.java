package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5821 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC1587 f19782;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5821(AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f19782 = abstractDialogInterfaceOnClickListenerC1587;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587 = this.f19782;
        String strM40352 = m40352();
        if (strM40352.length() == 0) {
            m40364();
            return;
        }
        AbstractC20745 abstractC20745M12969 = C4678.m12969(strM40352);
        if (abstractC20745M12969.mo33975()) {
            m40365(R.string.MT_Protector);
            return;
        }
        try {
            abstractC20745M12969.mo46720();
            if (!abstractC20745M12969.mo33978()) {
                throw new IOException("Can not create file: " + abstractC20745M12969.mo33986());
            }
            abstractDialogInterfaceOnClickListenerC1587.f6361 = C4678.m12968();
            if (!abstractDialogInterfaceOnClickListenerC1587.f6361.isEmpty()) {
                abstractDialogInterfaceOnClickListenerC1587.f6362.notifyDataSetChanged();
            } else {
                abstractDialogInterfaceOnClickListenerC1587.f6360.dismiss();
            }
            m40364();
        } catch (IOException e) {
            m40347(e.getMessage());
        }
    }
}
