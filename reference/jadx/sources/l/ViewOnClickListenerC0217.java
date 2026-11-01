package l;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: l.֡ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0217 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1394;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1396;

    public /* synthetic */ ViewOnClickListenerC0217(int i, Object obj, Object obj2) {
        this.f1395 = i;
        this.f1396 = obj;
        this.f1394 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.f1395;
        Object obj = this.f1394;
        Object obj2 = this.f1396;
        switch (i) {
            case 0:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj;
                if (((C22959) obj2).m50802()) {
                    ActivityC14082.m34069((Context) abstractActivityC12483, C1355.m4782(), true);
                }
                break;
            default:
                ClipboardManager clipboardManager = (ClipboardManager) obj2;
                C22485 c22485 = (C22485) obj;
                int i2 = ViewOnClickListenerC8374.f29048;
                if (clipboardManager.hasPrimaryClip()) {
                    CharSequence text = clipboardManager.getText();
                    if (text == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    c22485.m40346((CharSequence) string);
                    c22485.m40371();
                }
                break;
        }
    }
}
