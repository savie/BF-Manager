package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C0345 extends AbstractC21832 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10039 f1838;

    public C0345(C10039 c10039) {
        this.f1838 = c10039;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo2088(Main main) {
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText((CharSequence) null);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        viewM40395.setTag(c23255);
        C21576.m49090(c23255);
        return viewM40395;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2091(View view) {
        String string = ((C23255) view.getTag()).m54021().toString();
        if (string.isEmpty()) {
            C22673.m51158(R.string.MT_Protector, 0).m51163();
            return false;
        }
        this.f1838.f32174.mo11476(string);
        return true;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2089(C2361 c2361) {
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2090(DialogInterfaceC8327 dialogInterfaceC8327) {
        dialogInterfaceC8327.m22440().setOnClickListener(new ViewOnClickListenerC18244());
    }
}
