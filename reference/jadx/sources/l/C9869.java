package l;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9869 implements InterfaceC21436, InterfaceC10523 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31762;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31763;

    public /* synthetic */ C9869(Object obj, Object obj2) {
        this.f31762 = obj;
        this.f31763 = obj2;
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        String str = (String) this.f31762;
        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) this.f31763;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(10);
        ViewOnClickListenerC15284.m36687(textView, str);
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        InterfaceC16648 interfaceC16648 = (InterfaceC16648) this.f31762;
        C20312 c20312 = (C20312) this.f31763;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            ApplicationC17729.f58258.edit().putString("dsai", interfaceC16648.mo39358().flattenToString()).apply();
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return true;
        }
        c20312.m46657(interfaceC16648);
        return true;
    }
}
