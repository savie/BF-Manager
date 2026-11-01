package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.ShortcutActivity;

/* JADX INFO: renamed from: l.᩺۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22999 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f74744;

    public /* synthetic */ ViewOnClickListenerC22999(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f74743 = i;
        this.f74744 = abstractActivityC12483;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74743) {
            case 0:
                AbstractActivityC12483 abstractActivityC12483 = this.f74744;
                Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC20293.class);
                intent.putExtra("fromDialog", true);
                abstractActivityC12483.startActivity(intent);
                break;
            case 1:
                boolean zM18176 = C6730.m18176();
                AbstractActivityC12483 abstractActivityC12484 = this.f74744;
                if (!zM18176) {
                    ActivityC14082.m34069((Context) abstractActivityC12484, C1355.m4788(), false);
                } else {
                    ActivityC14082.m34069((Context) abstractActivityC12484, C1355.m4771(), false);
                }
                break;
            default:
                ShortcutActivity.m138(this.f74744, true);
                break;
        }
    }
}
