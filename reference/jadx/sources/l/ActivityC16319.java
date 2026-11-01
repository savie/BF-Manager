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

/* JADX INFO: renamed from: l.ܽ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16319 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52550 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C19141 f52551;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8558 f52552;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f52553;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "CustomSortingMethodActivity";
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
        this.f41645.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܶ֨᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC16319.f52550;
                this.f48686.finish();
            }
        });
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        int intExtra = getIntent().getIntExtra("NetworkConfigId", -1);
        if (intExtra == -1) {
            this.f52552 = new C7146();
        } else {
            AbstractC12068 abstractC12068M15770 = C5717.m15770(intExtra);
            if (abstractC12068M15770 == null) {
                C15829.m37613((CharSequence) ("Network config not found: id-" + intExtra));
                finish();
                return;
            }
            this.f52552 = new C20552(abstractC12068M15770);
        }
        ArrayList arrayListMo19051 = this.f52552.mo19051();
        this.f52553 = arrayListMo19051;
        C23846.sort(arrayListMo19051, C7618.comparing(new C21257()));
        C19141 c19141 = new C19141(this);
        this.f52551 = c19141;
        c19141.registerAdapterDataObserver(new C7852(this, textView));
        textView.setVisibility(this.f52553.isEmpty() ? 0 : 8);
        c17492.setAdapter(this.f52551);
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
        m38483(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m38483(final int i) {
        View viewM30995 = m30995(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector)};
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ᩳ֨᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC16319.f52550;
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    RadioButton radioButton = radioButtonArr2[i3];
                    radioButton.setChecked(radioButton == view);
                }
            }
        };
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(onClickListener);
        }
        if (i == -1) {
            radioButtonArr[0].setChecked(true);
        } else {
            C9969 c9969 = (C9969) this.f52553.get(i);
            int iM10039 = C3386.m10039(c9969.m25237());
            boolean zM10049 = C3386.m10049(c9969.m25237());
            c10948.mo16989((CharSequence) c9969.f34074);
            if (iM10039 >= 0 && iM10039 < 4) {
                radioButtonArr[iM10039].setChecked(true);
            } else {
                radioButtonArr[0].setChecked(true);
            }
            checkBox.setChecked(zM10049);
        }
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ֨᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC16319.m38486(this.f58753, c10948, radioButtonArr, checkBox, i, dialogInterfaceC19356M21269);
            }
        });
        if (i == -1) {
            C16737.m39290(c10948);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38486(ActivityC16319 activityC16319, C10948 c10948, RadioButton[] radioButtonArr, CheckBox checkBox, int i, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (c10948.m16842() == 0) {
            c10948.requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        int i2 = 0;
        while (i2 < 4 && !radioButtonArr[i2].isChecked()) {
            i2++;
        }
        C9969 c9969 = new C9969(AbstractC11462.m28608(c10948.m17000().toString()), C3386.m10040(i2, checkBox.isChecked()));
        if (i == -1) {
            activityC16319.f52553.add(c9969);
            activityC16319.f52551.notifyItemInserted(activityC16319.f52553.size() - 1);
        } else {
            activityC16319.f52553.set(i, c9969);
            activityC16319.f52551.notifyItemChanged(i);
        }
        activityC16319.f52552.mo19052(c9969);
        dialogInterfaceC19356.dismiss();
    }
}
