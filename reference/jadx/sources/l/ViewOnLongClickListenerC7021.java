package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC7021 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23593;

    public /* synthetic */ ViewOnLongClickListenerC7021(int i) {
        this.f23593 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f23593) {
            case 0:
                C16737.m39272((CharSequence) ((TextView) view).getText().toString());
                break;
            default:
                int i = C23895.f77406;
                Context context = view.getContext();
                context.startActivity(new Intent(context, (Class<?>) ActivityC19749.class).addFlags(268435456).putExtra("pageIndex", ((Integer) view.getTag(R.id.tabLayout)).intValue()));
                break;
        }
        return true;
    }
}
