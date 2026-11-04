package l;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C0437 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8640 f2003;

    public C0437(C8640 c8640) {
        this.f2003 = c8640;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        String strM49059;
        ViewOnClickListenerC2674 viewOnClickListenerC2674 = (ViewOnClickListenerC2674) abstractC11800;
        viewOnClickListenerC2674.f8498.setVisibility(0);
        C8640 c8640 = this.f2003;
        C16626 c16626 = (C16626) ((ArrayList) c8640.m23286()).get(i);
        viewOnClickListenerC2674.f8497.setText(c16626.m39346());
        TextView textView = viewOnClickListenerC2674.f8499;
        C19147 c19147 = c16626.f53761;
        C19147 c19148 = c16626.f53759;
        if (c19148 == null) {
            strM49059 = c19147.mo35300();
        } else {
            strM49059 = C21576.m49059(R.string.MT_Protector, c19147.mo35300(), c19148.mo35300());
        }
        textView.setText(strM49059);
        if (c8640.f28230.f19006) {
            viewOnClickListenerC2674.itemView.setBackgroundColor(c8640.f28229.get(i) ? C3296.f10761 : 0);
        } else if (viewOnClickListenerC2674.itemView.getBackground() instanceof ColorDrawable) {
            C17423.m40911(viewOnClickListenerC2674.itemView);
        }
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8640 c8640 = this.f2003;
        return new ViewOnClickListenerC2674(c8640, LayoutInflater.from(c8640.f28230).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return ((ArrayList) this.f2003.m23286()).size();
    }
}
