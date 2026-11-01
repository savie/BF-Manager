package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC7042 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23658 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C22565 f23659;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f23660 = C4925.m13713();

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C4647 f23661;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "MyFavoritesRecordActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC17873(3, this));
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C22565 c22565 = new C22565(this);
        this.f23659 = c22565;
        c22565.registerAdapterDataObserver(new C11982(this, textView));
        textView.setVisibility(this.f23660.isEmpty() ? 0 : 8);
        c17492.setAdapter(this.f23659);
        C4647 c4647 = new C4647(new C2808(this));
        this.f23661 = c4647;
        c4647.m12825(c17492);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        m18887(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m18887(final int i) {
        View viewM30995 = m30995(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10949 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        c10949.m16853(new C5631(c10948));
        final C3326 c3326 = i == -1 ? new C3326(null, "") : (C3326) this.f23660.get(i);
        c10948.mo16989((CharSequence) c3326.m9861());
        c10949.mo16989((CharSequence) c3326.m9860());
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ܰ᩸᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7042.m18890(this.f46330, c10949, c3326, c10948, i, dialogInterfaceC19356M10334);
            }
        });
        C16737.m39290(c10949);
        c10949.mo17029(c10949.m16842());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18890(ActivityC7042 activityC7042, C10948 c10948, C3326 c3326, C10948 c10949, int i, DialogInterfaceC19356 dialogInterfaceC19356) {
        ArrayList arrayList = activityC7042.f23660;
        if (c10948.m16842() == 0) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        c3326.m9859(c10949.m17000().toString());
        c3326.m9862(c10948.m17000().toString());
        int i2 = 1;
        if (i == -1) {
            arrayList.add(c3326);
            activityC7042.f23659.notifyItemInserted(arrayList.size() - 1);
        } else {
            activityC7042.f23659.notifyItemChanged(i);
        }
        int i3 = C4925.f17255;
        C4716.m13051(new RunnableC18999(i2), C4925.class, 500L);
        dialogInterfaceC19356.dismiss();
    }
}
