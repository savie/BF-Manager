package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4749 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f16696;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16697 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16698;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16699;

    public /* synthetic */ ViewOnClickListenerC4749(C3246 c3246, EditText editText, EditText editText2) {
        this.f16699 = c3246;
        this.f16696 = editText;
        this.f16698 = editText2;
    }

    public /* synthetic */ ViewOnClickListenerC4749(C21422 c21422, C11545 c11545, EditText editText) {
        this.f16699 = c21422;
        this.f16698 = c11545;
        this.f16696 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16697;
        final EditText editText = this.f16696;
        Object obj = this.f16698;
        Object obj2 = this.f16699;
        switch (i) {
            case 0:
                C3246 c3246 = (C3246) obj2;
                c3246.m9718();
                C4388.m12238(c3246.f12072, c3246.f12075, editText, (EditText) obj);
                break;
            default:
                C21422 c21422 = (C21422) obj2;
                C11545 c11545 = (C11545) obj;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AbstractC20745 abstractC20745M15313 = C5553.m15313(c21422.m47959(), new String[0]);
                String name = abstractC20745M15313.getName();
                if (name.isEmpty()) {
                    name = C16737.m39288(R.string.MT_Protector);
                }
                if (c21422.m47965().m28762()) {
                    arrayList2.add(C16737.m39264(R.string.MT_Protector, name));
                } else {
                    arrayList2.add(C16737.m39264(R.string.MT_Protector, name));
                }
                arrayList.add(abstractC20745M15313);
                AbstractC20745 abstractC20745M15314 = C5553.m15313(c11545.m28798(), new String[0]);
                String name2 = abstractC20745M15314.getName();
                if (name2.isEmpty()) {
                    name2 = C16737.m39288(R.string.MT_Protector);
                }
                if (c11545.m28762()) {
                    arrayList2.add(0, C16737.m39264(R.string.MT_Protector, name2));
                    arrayList.add(0, abstractC20745M15314);
                } else {
                    arrayList2.add(C16737.m39264(R.string.MT_Protector, name2));
                    arrayList.add(abstractC20745M15314);
                }
                C8067 c8067BuildDialog = c21422.m47980().buildDialog();
                c8067BuildDialog.m21267((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: l.ܿۨ֨
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String strMo33986 = ((AbstractC20745) arrayList.get(i2)).mo33986();
                        EditText editText2 = editText;
                        editText2.setText(strMo33986);
                        editText2.setSelection(editText2.length());
                    }
                });
                c8067BuildDialog.m21269();
                break;
        }
    }
}
