package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֨֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes2.dex */
public class C0774 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC0544 f3350;

    public C0774(InterfaceC0544 interfaceC0544) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f3350 = interfaceC0544;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(final C11545 c11545) {
        if (c11545.m28802()) {
            final List list = (List) C9030.stream(c11545.m28819()).filter(new C2185(0)).map(new C5008(0)).collect(C1890.toList());
            if (!list.isEmpty()) {
                CharSequence[] charSequenceArr = {C16737.m39288(R.string.MT_Protector), C16737.m39288(R.string.MT_Protector)};
                C8067 c8067BuildDialog = c11545.m28824().buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21266(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.᩹֡᩹
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0774.m3327(this.f71173, c11545, list, dialogInterface, i);
                    }
                });
                c8067BuildDialog.m21269();
                return;
            }
        }
        new C22418(c11545, this.f3350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3327(C0774 c0774, C11545 c11545, List list, DialogInterface dialogInterface, int i) {
        InterfaceC0544 interfaceC0544 = c0774.f3350;
        if (i == 0) {
            new C22418(c11545, interfaceC0544);
        } else {
            new C22418(c11545, interfaceC0544).m49734(list);
        }
        dialogInterface.dismiss();
    }
}
