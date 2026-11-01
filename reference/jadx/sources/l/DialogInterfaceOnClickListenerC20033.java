package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC20033 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC12068 f64145;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C11545 f64146;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f64147;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f64148;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f64149;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f64150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f64151;

    public DialogInterfaceOnClickListenerC20033(final Main main, C11545 c11545) {
        RadioButton[] radioButtonArr = new RadioButton[4];
        this.f64149 = radioButtonArr;
        this.f64146 = c11545;
        int i = C3386.f12507;
        this.f64151 = c11545.m28814("local") ? "local:" + c11545.m28799() : c11545.m28799();
        String strM10042 = C3386.m10042(c11545.m28817());
        this.f64148 = strM10042;
        boolean zM28814 = c11545.m28814("local");
        if (c11545.m28814(b.k)) {
            this.f64145 = ((C9183) c11545.m28817()).m23630();
        }
        boolean z = strM10042 != null || ((zM28814 || this.f64145 != null) && !c11545.m28794());
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        radioButtonArr[0] = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        radioButtonArr[1] = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        radioButtonArr[3] = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(this);
        }
        this.f64150 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f64147 = checkBox;
        if (this.f64148 != null) {
            checkBox.setText(R.string.MT_Protector);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C16737.m39288(R.string.MT_Protector));
        sb.append(" - ");
        sb.append(C16737.m39288(c11545.m28762() ? R.string.MT_Protector : R.string.MT_Protector));
        textView.setText(sb.toString());
        RunnableC10155 runnableC10155 = new RunnableC10155(this, z, zM28814, c11545);
        AbstractC3062 lifecycle = main.getLifecycle();
        final C15800 c15800 = new C15800(runnableC10155);
        lifecycle.mo9171(c15800);
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, this);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final C4245 c4245 = (C4245) lifecycle;
        c8067BuildDialog.m21257(new DialogInterface.OnDismissListener() { // from class: l.۟۟᩹
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c4245.mo9172(c15800);
            }
        });
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        if (c11545.m28814(b.k) && this.f64145 == null) {
            dialogInterfaceC19356M21269.m44361().setVisibility(8);
        } else {
            dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.᩷۟᩹
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC12483 abstractActivityC12483 = main;
                    Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC16319.class);
                    AbstractC12068 abstractC12068 = this.f67482.f64145;
                    if (abstractC12068 != null) {
                        intent.putExtra("NetworkConfigId", abstractC12068.f40385);
                    }
                    abstractActivityC12483.startActivity(intent);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        int i2 = 0;
        while (i2 < 4 && !this.f64149[i2].isChecked()) {
            i2++;
        }
        CheckBox checkBox = this.f64147;
        boolean zIsChecked = checkBox.isChecked();
        String str = this.f64148;
        AbstractC12068 abstractC12068 = this.f64145;
        C11545 c11545 = this.f64146;
        CheckBox checkBox2 = this.f64150;
        String str2 = this.f64151;
        if (!zIsChecked) {
            if (checkBox.getVisibility() == 0) {
                if (str != null) {
                    C3386.m10045(str);
                } else if (abstractC12068 != null) {
                    HashMap map = abstractC12068.f40389;
                    if (map.containsKey(str2)) {
                        map.remove(str2);
                        C5717.m15755();
                    }
                } else {
                    c11545.m28775("local");
                    HashMap map2 = C0674.f2833;
                    if (map2.containsKey(str2)) {
                        map2.remove(str2);
                        z = true;
                    }
                }
            }
            if (c11545.m28762()) {
                C0674.f2830 = i2;
                C0674.f2827 = checkBox2.isChecked();
            } else {
                C0674.f2824 = i2;
                C0674.f2834 = checkBox2.isChecked();
            }
        } else if (str != null) {
            C3386.m10044(i2, str, checkBox2.isChecked());
        } else if (abstractC12068 != null) {
            abstractC12068.f40389.put(str2, Integer.valueOf(C3386.m10040(i2, checkBox2.isChecked())));
            C5717.m15755();
        } else {
            c11545.m28775("local");
            C0674.f2833.put(str2, Integer.valueOf(C3386.m10040(i2, checkBox2.isChecked())));
            z = true;
        }
        boolean zM28762 = c11545.m28762();
        int i3 = C0674.f2830;
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        if (z) {
            interfaceC17314Edit.putString("sort_only_in_path_list", C0674.m3026(C0674.f2833));
        }
        if (zM28762) {
            interfaceC17314Edit.mo4065(C0674.f2830, "file_cmp_sort_left");
            interfaceC17314Edit.putBoolean("file_cmp_reverse_left", C0674.f2827);
        } else {
            interfaceC17314Edit.mo4065(C0674.f2824, "file_cmp_sort_right");
            interfaceC17314Edit.putBoolean("file_cmp_reverse_right", C0674.f2834);
        }
        interfaceC17314Edit.apply();
        c11545.m28806();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f64149;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
    }
}
