package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3266 extends AbstractC11026 {
    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo9747(C11545 c11545) {
        return c11545.m28802();
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        String lowerCase = C16737.m39288(R.string.MT_Protector).toLowerCase();
        final List listM28819 = c11545.m28819();
        String strM39264 = listM28819.size() == 1 ? C16737.m39264(R.string.MT_Protector, lowerCase, ((InterfaceC2557) listM28819.get(0)).mo7963()) : C16737.m39264(R.string.MT_Protector, lowerCase, Integer.valueOf(listM28819.size()));
        StringBuilder sbM8976 = C3012.m8976(strM39264, "\n\n");
        sbM8976.append(C16737.m39288(R.string.MT_Protector));
        SpannableString spannableString = new SpannableString(sbM8976.toString());
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65988), strM39264.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.25f), strM39264.length(), strM39264.length() + 2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), strM39264.length() + 2, spannableString.length(), 17);
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(spannableString);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܰ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5383.m14946((List) C9030.stream(listM28819).map(new C4686(1)).collect(C1890.toList()));
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C23250.m51309(c8067BuildDialog.m21269());
    }
}
