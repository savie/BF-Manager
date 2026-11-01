package l;

import android.view.View;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6378 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21679;

    public /* synthetic */ ViewOnClickListenerC6378(int i, Object obj) {
        this.f21678 = i;
        this.f21679 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21678) {
            case 0:
                C24018.m52852((C24018) this.f21679);
                break;
            case 1:
                ((C5359) this.f21679).m14864();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                break;
            case 2:
                C7236 c7236 = (C7236) this.f21679;
                C16195 c16195 = new C16195(c7236.requireContext(), view, 0);
                C12418 c12418M38298 = c16195.m38298();
                String strM32189 = C13012.m32189(30, C6730.m18175(c7236.m19346()) + ".xml");
                String strM321810 = C13012.m32189(30, c7236.m19346().concat(".xml"));
                c12418M38298.add(R.string.MT_Protector, 0, 0, strM32189);
                c12418M38298.add(R.string.MT_Protector, 1, 0, strM321810);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16195.m38296(new C15952(c7236));
                c16195.m38297();
                break;
            default:
                ActivityC3541.m10446((ActivityC3541) this.f21679);
                break;
        }
    }
}
