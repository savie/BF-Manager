package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC24979 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 == null) {
            return true;
        }
        String strValueOf = String.valueOf(l2);
        C21576.m49070(strValueOf, C21576.m49088(R.string.MT_Protector) + ": " + strValueOf);
        return true;
    }
}
