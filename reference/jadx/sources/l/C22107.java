package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes.dex */
public final class C22107 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f71582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4647 f71583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71584;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f71584.get(i);
        C5380 c5380 = ((ViewOnTouchListenerC0939) abstractC12554).f3743;
        c5380.m14931().setText(interfaceC2557.mo7963());
        CharSequence charSequenceMo7973 = interfaceC2557.mo7973();
        if (charSequenceMo7973 != null) {
            c5380.m14938().setText(charSequenceMo7973);
        } else if (interfaceC2557.mo7982()) {
            c5380.m14938().setText(C1791.m5863(interfaceC2557.getSize()));
        } else {
            c5380.m14938().setText((CharSequence) null);
        }
        C22357 c22357M14940 = c5380.m14940();
        if (interfaceC2557.mo7986()) {
            c22357M14940.setVisibility(0);
            c22357M14940.setText("->");
        } else if (interfaceC2557.mo7987()) {
            c22357M14940.setVisibility(0);
            c22357M14940.setText("* ");
        } else {
            c22357M14940.setVisibility(4);
            c22357M14940.setText(" ");
        }
        CharSequence charSequenceMo7981 = interfaceC2557.mo7981();
        if (charSequenceMo7981 == null) {
            charSequenceMo7981 = C5319.m14742(interfaceC2557.getTime());
        }
        c5380.m14937().setText(charSequenceMo7981);
        C14600 icon = interfaceC2557.getIcon();
        if (icon != null) {
            c5380.m14936().setImageDrawable(icon.m35074());
        }
    }

    public C22107(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList, C4647 c4647) {
        this.f71582 = abstractActivityC12483;
        this.f71584 = arrayList;
        this.f71583 = c4647;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnTouchListenerC0939 viewOnTouchListenerC0939 = new ViewOnTouchListenerC0939(LayoutInflater.from(this.f71582).inflate(R.layout.MT_Protector, viewGroup, false));
        viewOnTouchListenerC0939.f3744 = this.f71583;
        ViewGroup viewGroup2 = (ViewGroup) viewOnTouchListenerC0939.itemView;
        C5380 c5380 = (C5380) viewGroup2.getChildAt(0);
        viewOnTouchListenerC0939.f3743 = c5380;
        c5380.m14933();
        c5380.m14931().setSingleLine(C0674.f2825 == 1);
        c5380.m14931().setMaxLines(C0674.f2825);
        int i2 = C0674.f2831;
        if (i2 == 1) {
            c5380.m14931().setTextSize(2, 13.0f);
            c5380.m14938().setTextSize(2, 10.0f);
            c5380.m14940().setTextSize(2, 10.0f);
            c5380.m14937().setTextSize(2, 10.0f);
        } else if (i2 == 2) {
            c5380.m14931().setTextSize(2, 15.0f);
            c5380.m14938().setTextSize(2, 11.0f);
            c5380.m14940().setTextSize(2, 11.0f);
            c5380.m14937().setTextSize(2, 11.0f);
        } else if (i2 == 3) {
            c5380.m14931().setTextSize(2, 17.0f);
            c5380.m14938().setTextSize(2, 12.0f);
            c5380.m14940().setTextSize(2, 12.0f);
            c5380.m14937().setTextSize(2, 12.0f);
        }
        View childAt = viewGroup2.getChildAt(1);
        childAt.setAlpha(0.75f);
        childAt.setOnTouchListener(viewOnTouchListenerC0939);
        childAt.setFocusable(true);
        childAt.setClickable(true);
        return viewOnTouchListenerC0939;
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f71584.size();
    }
}
