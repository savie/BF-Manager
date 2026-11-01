package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12106 extends AbstractC7713 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f40488;

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2077(View view) {
        return true;
    }

    public C12106(AbstractC20745 abstractC20745) {
        this.f40488 = abstractC20745;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final View mo2074(Main main) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        String[] strArr = {this.f40488.getName()};
        int i = C17044.f54427;
        textView.setText(C16737.m39264(R.string.MT_Protector, strArr));
        return viewM30995;
    }

    @Override // l.AbstractC7713
    /* JADX INFO: renamed from: ۙ */
    public final void mo2076(DialogInterfaceC19356 dialogInterfaceC19356) {
        Button buttonM44373 = dialogInterfaceC19356.m44373();
        buttonM44373.setEnabled(false);
        C16737.m39267(800L, new RunnableC13043(3, buttonM44373));
    }
}
