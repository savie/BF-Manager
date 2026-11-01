package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1996 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f7447;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7448;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f7449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21931 f7450;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f7451;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f7452;

    public /* synthetic */ ViewOnClickListenerC1996(EditText editText, AbstractActivityC12483 abstractActivityC12483, CharSequence[] charSequenceArr, C21931 c21931, ArrayList arrayList, TextInputLayout textInputLayout) {
        this.f7449 = editText;
        this.f7452 = abstractActivityC12483;
        this.f7447 = charSequenceArr;
        this.f7450 = c21931;
        this.f7448 = arrayList;
        this.f7451 = textInputLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final EditText editText = this.f7449;
        editText.requestFocus();
        C8067 c8067BuildDialog = this.f7452.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        final C21931 c21931 = this.f7450;
        int i = c21931.f71137;
        final ArrayList arrayList = this.f7448;
        final TextInputLayout textInputLayout = this.f7451;
        c8067BuildDialog.m21266(this.f7447, i, new DialogInterface.OnClickListener() { // from class: l.ۗᩳ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13465.m32966(dialogInterface, "dialog");
                c21931.f71137 = i2;
                ArrayList arrayList2 = arrayList;
                Object obj = arrayList2.get(i2);
                EditText editText2 = editText;
                editText2.setTag(obj);
                editText2.setText(((AbstractC12068) arrayList2.get(i2)).getName());
                textInputLayout.setErrorEnabled(false);
                dialogInterface.dismiss();
            }
        });
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }
}
