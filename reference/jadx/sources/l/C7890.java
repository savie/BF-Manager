package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public final class C7890 extends AbstractC21832 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f26235;

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2091(View view) {
        return true;
    }

    public C7890(AbstractC22044 abstractC22044) {
        this.f26235 = abstractC22044;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final View mo2088(Main main) {
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        String[] strArr = {this.f26235.getName()};
        int i = C19077.f61782;
        textView.setText(C21576.m49059(R.string.MT_Protector, strArr));
        return viewM40395;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final void mo2090(DialogInterfaceC8327 dialogInterfaceC8327) {
        final Button buttonM22436 = dialogInterfaceC8327.m22436();
        buttonM22436.setEnabled(false);
        C21576.m49062(800L, new Runnable() { // from class: l.֡۫۫
            @Override // java.lang.Runnable
            public final void run() {
                buttonM22436.setEnabled(true);
            }
        });
    }
}
