package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18059 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57759;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57761;

    public /* synthetic */ ViewOnClickListenerC18059(int i, Object obj, Object obj2) {
        this.f57760 = i;
        this.f57761 = obj;
        this.f57759 = obj2;
    }

    public /* synthetic */ ViewOnClickListenerC18059(C14015 c14015, AbstractActivityC12483 abstractActivityC12483, List list) {
        this.f57760 = 2;
        this.f57761 = abstractActivityC12483;
        this.f57759 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f57760;
        Object obj = this.f57759;
        Object obj2 = this.f57761;
        switch (i) {
            case 0:
                InterfaceC13175 interfaceC13175 = (InterfaceC13175) obj2;
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) obj;
                if (!interfaceC13175.mo4317()) {
                    interfaceC13175.mo6720();
                    dialogInterfaceC19356.dismiss();
                    break;
                }
                break;
            case 1:
                ActivityC5677 activityC5677 = (ActivityC5677) obj2;
                int i2 = ActivityC5677.f19358;
                ActivityC21135.m47562(activityC5677, C18752.m43302((IOException) obj), activityC5677.getString(R.string.MT_Protector), null, null);
                break;
            default:
                C14015.m33894((AbstractActivityC12483) obj2, (List) obj);
                break;
        }
    }
}
