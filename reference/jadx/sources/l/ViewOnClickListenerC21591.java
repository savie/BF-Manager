package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21591 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70052;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70053;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70054;

    public /* synthetic */ ViewOnClickListenerC21591(int i, Object obj, Object obj2) {
        this.f70053 = i;
        this.f70054 = obj;
        this.f70052 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f70053) {
            case 0:
                boolean[] zArr = (boolean[]) this.f70054;
                BaseAdapter baseAdapter = (BaseAdapter) this.f70052;
                for (int i = 0; i < zArr.length; i++) {
                    zArr[i] = !zArr[i];
                }
                baseAdapter.notifyDataSetChanged();
                break;
            default:
                Main main = (Main) this.f70054;
                final EditText editText = (EditText) this.f70052;
                ArrayList arrayList = new ArrayList(C22037.f71434 + 1);
                arrayList.add(main.getString(R.string.MT_Protector));
                int size = editText.length() == 0 ? 0 : -1;
                String string = editText.getText().toString();
                for (int i2 = 0; i2 < C22037.f71434; i2++) {
                    String strM48955 = C22037.m48955(i2);
                    if (strM48955.equalsIgnoreCase(string)) {
                        size = arrayList.size();
                    }
                    arrayList.add(strM48955);
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C8067 c8067BuildDialog = main.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21266(strArr, size, new DialogInterface.OnClickListener() { // from class: l.۟ۖ֨
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        editText.setText(i3 == 0 ? "" : strArr[i3]);
                        dialogInterface.dismiss();
                    }
                });
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21269();
                break;
        }
    }
}
