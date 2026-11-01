package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13358 extends AbstractC12554 implements InterfaceC10597, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f44278;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC17902 f44279;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f44280;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f44281;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f44282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11072 f44283;

    public ViewOnClickListenerC13358(Main main, ViewGroup viewGroup) {
        super(LayoutInflater.from(main).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f44280 = main;
        this.f44282 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f44278 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f44283 = (C11072) this.itemView.findViewById(R.id.icon);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.MT_Protector);
        this.f44281 = progressBar;
        C11089 c11089 = new C11089(main);
        c11089.m27980(true);
        progressBar.setIndeterminateDrawable(c11089);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC17902 abstractC17902 = this.f44279;
        if (abstractC17902 == null) {
            return;
        }
        boolean zM41588 = abstractC17902.m41588();
        AbstractActivityC12483 abstractActivityC12483 = this.f44280;
        if (zM41588) {
            C5202 c5202M41592 = this.f44279.m41592();
            if (c5202M41592.m14383()) {
                c5202M41592.m14382(abstractActivityC12483);
                return;
            }
            return;
        }
        this.f44279.m41572(abstractActivityC12483);
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1473(AbstractC17902 abstractC17902) {
        boolean z;
        AbstractC17902 abstractC17903 = this.f44279;
        if (abstractC17903 != abstractC17902) {
            if (abstractC17903 != null) {
                abstractC17903.m41568().m44963((InterfaceC10597) this);
            }
            if (abstractC17902 != null) {
                abstractC17902.m41568().m44959(this.f44280, this);
            }
            this.f44279 = abstractC17902;
        }
        if (abstractC17902 == null) {
            return;
        }
        this.f44283.m27921(abstractC17902.mo3078());
        if (!abstractC17902.m41588()) {
            z = false;
        } else if (!abstractC17902.m41592().m14383()) {
            return;
        } else {
            z = true;
        }
        CharSequence charSequenceM41586 = abstractC17902.m41586();
        CharSequence charSequenceM41576 = abstractC17902.m41576();
        int iM41564 = abstractC17902.m41564();
        TextView textView = this.f44282;
        if (charSequenceM41586 != null) {
            textView.setText(abstractC17902.m41586());
        } else {
            textView.setText("...");
        }
        TextView textView2 = this.f44278;
        if (charSequenceM41576 == null) {
            if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2.getVisibility() != 0) {
                textView2.setVisibility(0);
            }
            if (charSequenceM41576.length() > 50) {
                textView2.setText(C13012.m32189(50, charSequenceM41576.toString()));
            } else {
                textView2.setText(charSequenceM41576);
            }
        }
        ProgressBar progressBar = this.f44281;
        if (z) {
            if (progressBar.getVisibility() != 8) {
                progressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
        }
        if (iM41564 != -1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(iM41564);
        } else {
            progressBar.setIndeterminate(true);
        }
    }
}
