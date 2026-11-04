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

/* JADX INFO: renamed from: l.֡֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0083 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f991;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f992;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8614 f993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f994;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC0148 f995;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f997;

    public DialogInterfaceOnClickListenerC0083(final Main main, C8614 c8614) {
        RadioButton[] radioButtonArr = new RadioButton[4];
        this.f991 = radioButtonArr;
        this.f993 = c8614;
        int i = C14118.f44640;
        this.f997 = c8614.m23228("local") ? "local:" + c8614.m23204() : c8614.m23204();
        String strM34283 = C14118.m34283(c8614.m23213());
        this.f994 = strM34283;
        boolean zM23228 = c8614.m23228("local");
        if (c8614.m23228(b.k)) {
            this.f995 = ((C6728) c8614.m23213()).m18806();
        }
        boolean z = strM34283 != null || ((zM23228 || this.f995 != null) && !c8614.m23197());
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        radioButtonArr[0] = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        radioButtonArr[1] = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        radioButtonArr[3] = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(this);
        }
        this.f996 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f992 = checkBox;
        if (this.f994 != null) {
            checkBox.setText(R.string.MT_Protector);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C21576.m49088(R.string.MT_Protector));
        sb.append(" - ");
        sb.append(C21576.m49088(c8614.m23195() ? R.string.MT_Protector : R.string.MT_Protector));
        textView.setText(sb.toString());
        RunnableC3812 runnableC3812 = new RunnableC3812(this, z, zM23228, c8614);
        AbstractC8585 lifecycle = main.getLifecycle();
        final C17982 c17982 = new C17982(runnableC3812);
        lifecycle.mo23077(c17982);
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, this);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final C20168 c20168 = (C20168) lifecycle;
        c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.ܰ֨ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c20168.mo23078(c17982);
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        if (c8614.m23228(b.k) && this.f995 == null) {
            dialogInterfaceC8327M8016.m22440().setVisibility(8);
        } else {
            dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩶֨ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC17204 abstractActivityC17204 = main;
                    Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC12081.class);
                    AbstractC0148 abstractC0148 = this.f67054.f995;
                    if (abstractC0148 != null) {
                        intent.putExtra("NetworkConfigId", abstractC0148.f1127);
                    }
                    abstractActivityC17204.startActivity(intent);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        int i2 = 0;
        while (i2 < 4 && !this.f991[i2].isChecked()) {
            i2++;
        }
        CheckBox checkBox = this.f992;
        boolean zIsChecked = checkBox.isChecked();
        String str = this.f994;
        AbstractC0148 abstractC0148 = this.f995;
        C8614 c8614 = this.f993;
        CheckBox checkBox2 = this.f996;
        String str2 = this.f997;
        if (!zIsChecked) {
            if (checkBox.getVisibility() == 0) {
                if (str != null) {
                    C14118.m34286(str);
                } else if (abstractC0148 != null) {
                    HashMap map = abstractC0148.f1120;
                    if (map.containsKey(str2)) {
                        map.remove(str2);
                        C7606.m20793();
                    }
                } else {
                    c8614.m23174("local");
                    HashMap map2 = C17423.f56652;
                    if (map2.containsKey(str2)) {
                        map2.remove(str2);
                        z = true;
                    }
                }
            }
            if (c8614.m23195()) {
                C17423.f56648 = i2;
                C17423.f56653 = checkBox2.isChecked();
            } else {
                C17423.f56655 = i2;
                C17423.f56651 = checkBox2.isChecked();
            }
        } else if (str != null) {
            C14118.m34285(i2, str, checkBox2.isChecked());
        } else if (abstractC0148 != null) {
            abstractC0148.f1120.put(str2, Integer.valueOf(C14118.m34281(i2, checkBox2.isChecked())));
            C7606.m20793();
        } else {
            c8614.m23174("local");
            C17423.f56652.put(str2, Integer.valueOf(C14118.m34281(i2, checkBox2.isChecked())));
            z = true;
        }
        boolean zM23195 = c8614.m23195();
        int i3 = C17423.f56648;
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        if (z) {
            interfaceC18752Edit.putString("sort_only_in_path_list", C17423.m40910(C17423.f56652));
        }
        if (zM23195) {
            interfaceC18752Edit.mo3486(C17423.f56648, "file_cmp_sort_left");
            interfaceC18752Edit.putBoolean("file_cmp_reverse_left", C17423.f56653);
        } else {
            interfaceC18752Edit.mo3486(C17423.f56655, "file_cmp_sort_right");
            interfaceC18752Edit.putBoolean("file_cmp_reverse_right", C17423.f56651);
        }
        interfaceC18752Edit.apply();
        c8614.m23201();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f991;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
    }
}
