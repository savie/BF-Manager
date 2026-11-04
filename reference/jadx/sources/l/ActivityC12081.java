package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12081 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38896 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f38897;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24762 f38898;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C11335 f38899;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "CustomSortingMethodActivity";
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
        this.f56046.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܳۗܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC12081.f38896;
                this.f49192.finish();
            }
        });
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        int intExtra = getIntent().getIntExtra("NetworkConfigId", -1);
        if (intExtra == -1) {
            this.f38898 = new C17302();
        } else {
            AbstractC0148 abstractC0148M20792 = C7606.m20792(intExtra);
            if (abstractC0148M20792 == null) {
                C22673.m51154((CharSequence) ("Network config not found: id-" + intExtra));
                finish();
                return;
            }
            this.f38898 = new C15810(abstractC0148M20792);
        }
        ArrayList arrayListMo37733 = this.f38898.mo37733();
        this.f38897 = arrayListMo37733;
        C12884.sort(arrayListMo37733, C2661.comparing(new C12827()));
        C11335 c11335 = new C11335(this);
        this.f38899 = c11335;
        c11335.registerAdapterDataObserver(new C1641(this, textView));
        textView.setVisibility(this.f38897.isEmpty() ? 0 : 8);
        c25227.setAdapter(this.f38899);
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
        m30255(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m30255(final int i) {
        View viewM40395 = m40395(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        }
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector)};
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC15677 viewOnClickListenerC15677 = new ViewOnClickListenerC15677(2, radioButtonArr);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(viewOnClickListenerC15677);
        }
        if (i == -1) {
            radioButtonArr[0].setChecked(true);
        } else {
            C16556 c16556 = (C16556) this.f38897.get(i);
            int iM34280 = C14118.m34280(c16556.m39199());
            boolean zM34290 = C14118.m34290(c16556.m39199());
            c23255.mo52335((CharSequence) c16556.f53575);
            if (iM34280 >= 0 && iM34280 < 4) {
                radioButtonArr[iM34280].setChecked(true);
            } else {
                radioButtonArr[0].setChecked(true);
            }
            checkBox.setChecked(zM34290);
        }
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۚۗܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC12081.m30253(this.f18829, c23255, radioButtonArr, checkBox, i, dialogInterfaceC8327M8016);
            }
        });
        if (i == -1) {
            C21576.m49090(c23255);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30253(ActivityC12081 activityC12081, C23255 c23255, RadioButton[] radioButtonArr, CheckBox checkBox, int i, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (c23255.m54099() == 0) {
            c23255.requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        int i2 = 0;
        while (i2 < 4 && !radioButtonArr[i2].isChecked()) {
            i2++;
        }
        C16556 c16556 = new C16556(AbstractC7364.m20187(c23255.m54021().toString()), C14118.m34281(i2, checkBox.isChecked()));
        if (i == -1) {
            activityC12081.f38897.add(c16556);
            activityC12081.f38899.notifyItemInserted(activityC12081.f38897.size() - 1);
        } else {
            activityC12081.f38897.set(i, c16556);
            activityC12081.f38899.notifyItemChanged(i);
        }
        activityC12081.f38898.mo37734(c16556);
        dialogInterfaceC8327.dismiss();
    }
}
