package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21334 extends AbstractC11800 implements InterfaceC16438, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ProgressBar f67976;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC18900 f67977;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f67978;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f67979;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f67980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3034 f67981;

    public ViewOnClickListenerC21334(Main main, ViewGroup viewGroup) {
        super(LayoutInflater.from(main).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f67978 = main;
        this.f67980 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f67979 = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f67981 = (C3034) this.itemView.findViewById(R.id.icon);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.MT_Protector);
        this.f67976 = progressBar;
        C14459 c14459 = new C14459(main);
        c14459.m34928(true);
        progressBar.setIndeterminateDrawable(c14459);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC18900 abstractC18900 = this.f67977;
        if (abstractC18900 == null) {
            return;
        }
        boolean zM43861 = abstractC18900.m43861();
        AbstractActivityC17204 abstractActivityC17204 = this.f67978;
        if (zM43861) {
            C12187 c12187M43869 = this.f67977.m43869();
            if (c12187M43869.m30472()) {
                c12187M43869.m30471(abstractActivityC17204);
                return;
            }
            return;
        }
        this.f67977.m43846(abstractActivityC17204);
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1486(AbstractC18900 abstractC18900) {
        boolean z;
        AbstractC18900 abstractC18901 = this.f67977;
        if (abstractC18901 != abstractC18900) {
            if (abstractC18901 != null) {
                abstractC18901.m43851().m40354((InterfaceC16438) this);
            }
            if (abstractC18900 != null) {
                abstractC18900.m43851().m40350(this.f67978, this);
            }
            this.f67977 = abstractC18900;
        }
        if (abstractC18900 == null) {
            return;
        }
        this.f67981.m9864(abstractC18900.mo2534());
        if (!abstractC18900.m43861()) {
            z = false;
        } else if (!abstractC18900.m43869().m30472()) {
            return;
        } else {
            z = true;
        }
        CharSequence charSequenceM43866 = abstractC18900.m43866();
        CharSequence charSequenceM43839 = abstractC18900.m43839();
        int iM43849 = abstractC18900.m43849();
        TextView textView = this.f67980;
        if (charSequenceM43866 != null) {
            textView.setText(abstractC18900.m43866());
        } else {
            textView.setText("...");
        }
        TextView textView2 = this.f67979;
        if (charSequenceM43839 == null) {
            if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2.getVisibility() != 0) {
                textView2.setVisibility(0);
            }
            if (charSequenceM43839.length() > 50) {
                textView2.setText(C18969.m44060(50, charSequenceM43839.toString()));
            } else {
                textView2.setText(charSequenceM43839);
            }
        }
        ProgressBar progressBar = this.f67976;
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
        if (iM43849 != -1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(iM43849);
        } else {
            progressBar.setIndeterminate(true);
        }
    }
}
