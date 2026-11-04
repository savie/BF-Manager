package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes.dex */
public final class C22938 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        if (c12915.m31986("local") && !c12915.m31988()) {
            return c12915.m31977();
        }
        return false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        Main mainM31979 = c12915.m31979();
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        final C1626 c1627 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        C7893.m21433(c1626);
        C7893.m21433(c1627);
        c1626.m5762(new C8648(c1627));
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final C5038 c5038 = new C5038();
        c5038.m15261();
        checkBox.setText(mainM31979.getResources().getQuantityString(R.plurals.MT_Protector, c12915.m31981()));
        checkBox.setChecked(c5038.f17448);
        if (c5038.f17447) {
            C23255 c23255M5756 = c1626.m5756();
            C17359.requireNonNull(c23255M5756);
            c23255M5756.m52340(true);
            c1627.setVisibility(8);
        }
        C2361 c2361BuildDialog = mainM31979.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21576.m49090(c1626.m5756());
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.۬ܺ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1626 c1628 = c1626;
                C23255 c23255M5757 = c1628.m5756();
                C17359.requireNonNull(c23255M5757);
                C1626 c1629 = c1627;
                C23255 c23255M5758 = c1629.m5756();
                C17359.requireNonNull(c23255M5758);
                String string = c23255M5757.m54021().toString();
                if (string.isEmpty()) {
                    c1628.m5768(C21576.m49088(R.string.MT_Protector));
                    c23255M5757.requestFocus();
                    return;
                }
                boolean z = c1629.getVisibility() == 8;
                if (!z && !string.equals(c23255M5758.m54021().toString())) {
                    c1629.m5768(C21576.m49088(R.string.MT_Protector));
                    c23255M5758.m52289();
                    c23255M5758.requestFocus();
                    return;
                }
                dialogInterfaceC8327M8016.dismiss();
                C5038 c5039 = c5038;
                boolean z2 = c5039.f17448;
                CheckBox checkBox2 = checkBox;
                if (z2 != checkBox2.isChecked() || c5039.f17447 != z) {
                    c5039.f17448 = checkBox2.isChecked();
                    c5039.f17447 = z;
                    c5039.m15262();
                }
                int i = C13678.f43415;
                C8458 c8458 = new C8458(C11003.class);
                C12915 c12916 = c12915;
                c8458.m22728(c12916);
                c8458.m22723(c12916.m31982());
                c8458.m22719("password", string);
                c8458.m22720("removeSource", checkBox2.isChecked());
                c8458.m22714();
            }
        });
    }
}
