package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6584 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 != null) {
            String strM5863 = C1791.m5863(l2.longValue());
            C16737.m39275(strM5863, C16737.m39288(R.string.MT_Protector) + ": " + strM5863);
        }
    }
}
