package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC22993 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74642 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f74643;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f74644 = C1036.m3941();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C13713 f74645;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "MyFavoritesRecordActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC12025(this, 4));
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C13713 c13713 = new C13713(this);
        this.f74645 = c13713;
        c13713.registerAdapterDataObserver(new C2527(this, textView));
        textView.setVisibility(this.f74644.isEmpty() ? 0 : 8);
        c25227.setAdapter(this.f74645);
        C11999 c11999 = new C11999(new C8493(this));
        this.f74643 = c11999;
        c11999.m30173(c25227);
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
        m51878(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m51878(final int i) {
        View viewM40395 = m40395(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        }
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c23256.m53899(new C7002(c23255));
        final C9984 c9984 = i == -1 ? new C9984(null, "") : (C9984) this.f74644.get(i);
        c23255.mo52335((CharSequence) c9984.m25831());
        c23256.mo52335((CharSequence) c9984.m25830());
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ۟᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC22993.m51876(this.f30082, c23256, c9984, c23255, i, dialogInterfaceC8327M34866);
            }
        });
        C21576.m49090(c23256);
        c23256.mo52339(c23256.m54099());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51876(ActivityC22993 activityC22993, C23255 c23255, C9984 c9984, C23255 c23256, int i, DialogInterfaceC8327 dialogInterfaceC8327) {
        ArrayList arrayList = activityC22993.f74644;
        if (c23255.m54099() == 0) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        c9984.m25829(c23256.m54021().toString());
        c9984.m25832(c23255.m54021().toString());
        if (i == -1) {
            arrayList.add(c9984);
            activityC22993.f74645.notifyItemInserted(arrayList.size() - 1);
        } else {
            activityC22993.f74645.notifyItemChanged(i);
        }
        int i2 = C1036.f3749;
        C5261.m15836(new RunnableC18935(0), C1036.class, 500L);
        dialogInterfaceC8327.dismiss();
    }
}
