package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.۟ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7716 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25425;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25426;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25427;

    public /* synthetic */ DialogInterfaceOnClickListenerC7716(int i, Object obj, Object obj2) {
        this.f25425 = i;
        this.f25427 = obj;
        this.f25426 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f25425) {
            case 0:
                C22829 c22829 = (C22829) this.f25427;
                BaseAdapter baseAdapter = (BaseAdapter) this.f25426;
                synchronized (c22829) {
                    c22829.f73990.clear();
                    break;
                }
                baseAdapter.notifyDataSetChanged();
                return;
            default:
                C23255 c23255 = (C23255) this.f25427;
                CheckBox checkBox = (CheckBox) this.f25426;
                String string = c23255.m54021().toString();
                if (string.isEmpty()) {
                    string = "[TIME] [CLASS]\n->[METHOD]([LOCATION])\n[RESULT]\n--------------------\n";
                } else if (!string.endsWith("\n")) {
                    string = string.concat("\n");
                }
                ApplicationC17729.f58258.edit().putString("inject_log_format", string).apply();
                checkBox.setChecked(true);
                return;
        }
    }
}
