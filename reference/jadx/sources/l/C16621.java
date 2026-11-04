package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16621 extends AbstractC9843 {
    public C16621() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        c12915.m31970("local");
        final C8614 c8614M31974 = c12915.m31974();
        final boolean z = false;
        if (!c8614M31974.m23197() && c8614M31974.m23228("local")) {
            z = true;
        }
        View viewM40395 = c12915.m31979().m40395(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM40395.findViewById(R.id.radioButton3);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("duaw", false));
        checkBox2.setChecked(ApplicationC17729.f58258.getBoolean("duds", false));
        if (!z) {
            checkBox.setVisibility(8);
        }
        checkBox2.setText(C21576.m49055().getQuantityString(R.plurals.MT_Protector, c12915.m31981()));
        radioButton2.setOnCheckedChangeListener(new C9568(2, c23255));
        StringBuilder sb = new StringBuilder();
        String name = ((InterfaceC2386) c12915.m31982().get(0)).getName();
        C16912 c16912M41323 = C17658.m41323(name);
        if (c16912M41323 != null) {
            name = c16912M41323.m39897();
        }
        sb.append(name.substring(0, name.length() - AbstractC22044.m49832(name).length()));
        sb.append('/');
        c23255.mo52335((CharSequence) sb.toString());
        if (c12915.m31981() != 1) {
            radioButton3.setVisibility(0);
            radioButton3.setChecked(true);
        }
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.۠۫۫
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ApplicationC17729.f58258.edit().putBoolean("duaw", checkBox.isChecked()).putBoolean("duds", checkBox2.isChecked()).apply();
            }
        });
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ۫۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16621.m39322(this.f23631, z, checkBox, checkBox2, c8614M31974, c12915, radioButton, dialogInterfaceC8327M8016, radioButton3, c23255);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39322(C16621 c16621, boolean z, CheckBox checkBox, CheckBox checkBox2, C8614 c8614, C12915 c12915, RadioButton radioButton, DialogInterfaceC8327 dialogInterfaceC8327, RadioButton radioButton2, C23255 c23255) {
        boolean z2 = z && checkBox.isChecked();
        boolean zIsChecked = checkBox2.isChecked();
        String strM23204 = z2 ? c8614.m23204() : c12915.m31967();
        if (radioButton.isChecked()) {
            m39321(c12915, strM23204, strM23204.length(), false, z2, zIsChecked);
            dialogInterfaceC8327.dismiss();
            return;
        }
        if (radioButton2.isChecked()) {
            m39321(c12915, strM23204, strM23204.length(), true, z2, zIsChecked);
            dialogInterfaceC8327.dismiss();
            return;
        }
        String strTrim = c23255.m54021().toString().trim();
        if (strTrim.contains("\\") || strTrim.startsWith("/") || strTrim.contains("//")) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            dialogInterfaceC8327.dismiss();
            m39321(c12915, C11293.m28549(strM23204, strTrim), strM23204.length(), false, z2, zIsChecked);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39321(C12915 c12915, String str, int i, boolean z, boolean z2, boolean z3) {
        int i2 = C13678.f43415;
        C8458 c8458 = new C8458(C24827.class);
        c8458.m22723(c12915.m31982());
        c8458.m22719("extractDir", str);
        c8458.m22720("separateFolder", z);
        c8458.m22715(i, "relativeNameSubStart");
        c8458.m22720("extractToAnother", z2);
        c8458.m22720("deleteSources", z3);
        if (z2) {
            c8458.m22726(c12915);
        } else {
            c8458.m22728(c12915);
        }
        c8458.m22714();
    }
}
