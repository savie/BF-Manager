package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes5.dex */
public class C16665 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC0454 f53832;

    public C16665(InterfaceC0454 interfaceC0454) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f53832 = interfaceC0454;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(final C8614 c8614) {
        if (c8614.m23162()) {
            final List list = (List) C1170.stream(c8614.m23208()).filter(new C11444(0)).map(new C19705(2)).collect(C2025.toList());
            if (!list.isEmpty()) {
                CharSequence[] charSequenceArr = {C21576.m49088(R.string.MT_Protector), C21576.m49088(R.string.MT_Protector)};
                C2361 c2361BuildDialog = c8614.m23233().buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8013(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.᩻ۜܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C16665.m39373(this.f80487, c8614, list, dialogInterface, i);
                    }
                });
                c2361BuildDialog.m8016();
                return;
            }
        }
        new C13132(c8614, this.f53832);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39373(C16665 c16665, C8614 c8614, List list, DialogInterface dialogInterface, int i) {
        InterfaceC0454 interfaceC0454 = c16665.f53832;
        if (i == 0) {
            new C13132(c8614, interfaceC0454);
        } else {
            new C13132(c8614, interfaceC0454).m32648(list);
        }
        dialogInterface.dismiss();
    }
}
