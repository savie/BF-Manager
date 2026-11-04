package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩴۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19578 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f63133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63134;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19578(C15102 c15102) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f63133 = c15102;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(final C8614 c8614) {
        int i = C2448.f7865 + 1;
        String[] strArr = new String[i];
        strArr[0] = C21576.m49088(R.string.MT_Protector);
        for (int i2 = 1; i2 < i; i2++) {
            strArr[i2] = C2448.m8274(i2 - 1);
        }
        this.f63134 = 0;
        String strM54368 = this.f63133.f49290.m54368();
        if (strM54368 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM54368.equals(C2448.m8272(i3 - 1).name())) {
                    this.f63134 = i3;
                    break;
                }
            }
        }
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(strArr, this.f63134, new DialogInterface.OnClickListener() { // from class: l.᩸ۙۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C19578 c19578 = this.f72915;
                C15102 c15102 = c19578.f63133;
                if (c19578.f63134 != i4) {
                    if (i4 == 0) {
                        c15102.f49290.m54373((Charset) null);
                        C15102.f49285.remove(c15102.m36371());
                    } else {
                        Charset charsetM8272 = C2448.m8272(i4 - 1);
                        c15102.f49290.m54373(charsetM8272);
                        C15102.f49285.put(c15102.m36371(), charsetM8272.name());
                    }
                    c8614.m23232();
                }
                dialogInterface.dismiss();
            }
        });
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }
}
