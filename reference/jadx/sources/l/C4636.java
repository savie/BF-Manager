package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۙ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4636 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f16381;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f16382;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4636(C13810 c13810) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f16382 = c13810;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(final C11545 c11545) {
        int i = C22037.f71434 + 1;
        String[] strArr = new String[i];
        strArr[0] = C16737.m39288(R.string.MT_Protector);
        for (int i2 = 1; i2 < i; i2++) {
            strArr[i2] = C22037.m48955(i2 - 1);
        }
        this.f16381 = 0;
        String strM21726 = this.f16382.f45582.m21726();
        if (strM21726 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM21726.equals(C22037.m48953(i3 - 1).name())) {
                    this.f16381 = i3;
                    break;
                }
            }
        }
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(strArr, this.f16381, new DialogInterface.OnClickListener() { // from class: l.ۗܽ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C4636 c4636 = this.f12385;
                C13810 c13810 = c4636.f16382;
                if (c4636.f16381 != i4) {
                    if (i4 == 0) {
                        c13810.f45582.m21718((Charset) null);
                        C13810.f45580.remove(c13810.m33624());
                    } else {
                        Charset charsetM48953 = C22037.m48953(i4 - 1);
                        c13810.f45582.m21718(charsetM48953);
                        C13810.f45580.put(c13810.m33624(), charsetM48953.name());
                    }
                    c11545.m28765();
                }
                dialogInterface.dismiss();
            }
        });
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }
}
