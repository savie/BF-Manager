package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7253 extends AbstractC9843 {
    public C7253() {
        super(R.string.MT_Protector, -1);
    }

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
        final Main mainM31979 = c12915.m31979();
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        C7893.m21433(c1626);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final C5038 c5038 = new C5038();
        c5038.m15261();
        checkBox.setText(mainM31979.getResources().getQuantityString(R.plurals.MT_Protector, c12915.m31981()));
        checkBox.setChecked(c5038.f17446);
        C2361 c2361BuildDialog = mainM31979.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        C21576.m49090(c1626.m5756());
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener(this) { // from class: l.ۢܺ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1626 c1627 = c1626;
                C23255 c23255M5756 = c1627.m5756();
                C17359.requireNonNull(c23255M5756);
                String string = c23255M5756.m54021().toString();
                if (string.isEmpty()) {
                    c1627.m5768(C21576.m49088(R.string.MT_Protector));
                    c23255M5756.requestFocus();
                } else {
                    view.setEnabled(false);
                    new C9489(mainM31979, c12915, string, dialogInterfaceC8327M34866, c5038, checkBox, view, c1627, c23255M5756).m8197();
                }
            }
        });
    }
}
