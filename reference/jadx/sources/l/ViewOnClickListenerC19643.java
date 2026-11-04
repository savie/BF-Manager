package l;

import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩴۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC19643 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63274;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f63275;

    public /* synthetic */ ViewOnClickListenerC19643(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f63274 = i;
        this.f63275 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f63274) {
            case 0:
                ActivityC15913.m37904((ActivityC15913) this.f63275);
                break;
            default:
                Main main = (Main) this.f63275;
                Intent intent = new Intent(main, (Class<?>) ActivityC3786.class);
                intent.putExtra("fromDialog", true);
                main.startActivity(intent);
                break;
        }
    }
}
