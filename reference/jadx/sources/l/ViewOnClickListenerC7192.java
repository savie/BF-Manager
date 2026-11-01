package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7192 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8500 f23997;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23421 f23998;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f24000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9206 f24001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC7192(C23421 c23421, View view) {
        super(view);
        this.f23998 = c23421;
        this.f24000 = (TextView) view.findViewById(R.id.textView);
        C0674.m3031(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23421 c23421 = this.f23998;
        if ((c23421.f75837 == null || c23421.f75837.m21609(this.f24001.f31292)) && !C9886.f33734.m50803()) {
            ((ActivityC5677) c23421.requireActivity()).m15674(this.f24001.f31292, this.f23997);
            c23421.f75837.m21575(this.f24001.f31292);
            if (((C10617) c23421.f75831.peek()).f36281.add(this.f24001.f31292 + " " + this.f23999)) {
                C16737.m39274(new Runnable() { // from class: l.ۤۗۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC7192 viewOnClickListenerC7192 = this.f34191;
                        C23421 c23422 = viewOnClickListenerC7192.f23998;
                        c23422.f75834.notifyItemChanged(viewOnClickListenerC7192.getAdapterPosition());
                        c23422.m51574();
                    }
                }, 200L);
            }
        }
    }
}
