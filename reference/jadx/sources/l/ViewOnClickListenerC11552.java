package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11552 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 != null) {
            String strM22390 = C8311.m22390(l2.longValue());
            C21576.m49070(strM22390, C21576.m49088(R.string.MT_Protector) + ": " + strM22390);
        }
    }
}
