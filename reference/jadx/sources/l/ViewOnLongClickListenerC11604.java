package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC11604 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = C16079.f52096;
        Context context = view.getContext();
        context.startActivity(new Intent(context, (Class<?>) ActivityC5440.class).addFlags(268435456).putExtra("pageIndex", ((Integer) view.getTag(R.id.tabLayout)).intValue()));
        return true;
    }
}
