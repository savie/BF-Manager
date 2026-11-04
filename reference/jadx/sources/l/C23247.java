package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩹ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23247 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3109 f75325;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75326;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23247(C3109 c3109) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f75325 = c3109;
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
        this.f75326 = 0;
        String strM28590 = this.f75325.f10075.m28590();
        if (strM28590 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM28590.equals(C2448.m8272(i3 - 1).name())) {
                    this.f75326 = i3;
                    break;
                }
            }
        }
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(strArr, this.f75326, new DialogInterface.OnClickListener() { // from class: l.ܶۖ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C23247 c23247 = this.f51369;
                C3109 c3109 = c23247.f75325;
                if (c23247.f75326 != i4) {
                    if (i4 == 0) {
                        c3109.f10075.m28597(null);
                        C3109.f10069.remove(c3109.m10172());
                    } else {
                        Charset charsetM8272 = C2448.m8272(i4 - 1);
                        c3109.f10075.m28597(charsetM8272.name());
                        C3109.f10069.put(c3109.m10172(), charsetM8272.name());
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
