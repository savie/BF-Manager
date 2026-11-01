package l;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3022 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1403 f11326;

    public C3022(C1403 c1403) {
        this.f11326 = c1403;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        String strM39264;
        ViewOnClickListenerC22571 viewOnClickListenerC22571 = (ViewOnClickListenerC22571) abstractC12554;
        viewOnClickListenerC22571.f73569.setVisibility(0);
        C1403 c1403 = this.f11326;
        C21159 c21159 = (C21159) ((ArrayList) c1403.m4914()).get(i);
        viewOnClickListenerC22571.f73568.setText(c21159.m47614());
        TextView textView = viewOnClickListenerC22571.f73567;
        C13607 c13607 = c21159.f68906;
        C13607 c13608 = c21159.f68904;
        if (c13608 == null) {
            strM39264 = c13607.mo33252();
        } else {
            strM39264 = C16737.m39264(R.string.MT_Protector, c13607.mo33252(), c13608.mo33252());
        }
        textView.setText(strM39264);
        if (c1403.f5818.f63459) {
            viewOnClickListenerC22571.itemView.setBackgroundColor(c1403.f5819.get(i) ? C20368.f65992 : 0);
        } else if (viewOnClickListenerC22571.itemView.getBackground() instanceof ColorDrawable) {
            C0674.m3027(viewOnClickListenerC22571.itemView);
        }
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1403 c1403 = this.f11326;
        return new ViewOnClickListenerC22571(c1403, LayoutInflater.from(c1403.f5818).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return ((ArrayList) this.f11326.m4914()).size();
    }
}
