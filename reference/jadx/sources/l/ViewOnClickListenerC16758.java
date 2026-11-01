package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ܽܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16758 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53645;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53646;

    public /* synthetic */ ViewOnClickListenerC16758(int i, Object obj) {
        this.f53645 = i;
        this.f53646 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f53645) {
            case 0:
                C23814.m52486((C23814) this.f53646);
                break;
            case 1:
                EditText editText = (EditText) this.f53646;
                String strM39296 = C16737.m39296();
                if (strM39296 != null) {
                    editText.setText(strM39296.trim());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                AbstractActivityC5788.m15930((AbstractActivityC5788) this.f53646);
                break;
        }
    }
}
