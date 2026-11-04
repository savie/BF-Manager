package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C9731 extends AbstractC18551 {
    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo25328(C8614 c8614) {
        return c8614.m23162();
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        String lowerCase = C21576.m49088(R.string.MT_Protector).toLowerCase();
        final List listM23208 = c8614.m23208();
        String strM49059 = listM23208.size() == 1 ? C21576.m49059(R.string.MT_Protector, lowerCase, ((InterfaceC2386) listM23208.get(0)).mo8100()) : C21576.m49059(R.string.MT_Protector, lowerCase, Integer.valueOf(listM23208.size()));
        StringBuilder sbM10405 = C3188.m10405(strM49059, "\n\n");
        sbM10405.append(C21576.m49088(R.string.MT_Protector));
        SpannableString spannableString = new SpannableString(sbM10405.toString());
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10741), strM49059.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.25f), strM49059.length(), strM49059.length() + 2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), strM49059.length() + 2, spannableString.length(), 17);
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(spannableString);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩻۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20174.m46407((List) C1170.stream(listM23208).map(new C4527(2)).collect(C2025.toList()));
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C5416.m16144(c2361BuildDialog.m8016());
    }
}
