package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: EDB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC22813 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector);
        if (l2 == null) {
            return true;
        }
        String strValueOf = String.valueOf(l2);
        C16737.m39275(strValueOf, C16737.m39288(R.string.MT_Protector) + ": " + strValueOf);
        return true;
    }
}
