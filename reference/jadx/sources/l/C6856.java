package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۜܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6856 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23130;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23085 f23131;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6856(C23085 c23085) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f23131 = c23085;
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
        this.f23130 = 0;
        String strM15078 = this.f23131.f75016.m15078();
        if (strM15078 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM15078.equals(C22037.m48953(i3 - 1).name())) {
                    this.f23130 = i3;
                    break;
                }
            }
        }
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(strArr, this.f23130, new DialogInterface.OnClickListener() { // from class: l.ۘܺ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C6856 c6856 = this.f14908;
                C23085 c23085 = c6856.f23131;
                if (c6856.f23130 != i4) {
                    if (i4 == 0) {
                        c23085.f75016.m15072(null);
                        C23085.f75011.remove(c23085.m51086());
                    } else {
                        Charset charsetM48953 = C22037.m48953(i4 - 1);
                        c23085.f75016.m15072(charsetM48953.name());
                        C23085.f75011.put(c23085.m51086(), charsetM48953.name());
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
