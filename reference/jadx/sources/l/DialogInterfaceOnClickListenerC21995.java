package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21995 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70951;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70953;

    public /* synthetic */ DialogInterfaceOnClickListenerC21995(Object obj, Object obj2, Object obj3, int i) {
        this.f70951 = i;
        this.f70953 = obj;
        this.f70952 = obj2;
        this.f70950 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f70951) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f70953;
                ArrayList arrayList2 = (ArrayList) this.f70952;
                Runnable runnable = (Runnable) this.f70950;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.set(i2, (InterfaceC2386) arrayList2.get(i2));
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                C23255 c23255 = (C23255) this.f70953;
                Spinner spinner = (Spinner) this.f70952;
                InterfaceC0818 interfaceC0818 = (InterfaceC0818) this.f70950;
                try {
                    int i3 = Integer.parseInt(c23255.m54021().toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(spinner.getSelectedItemPosition() == 0 ? "MB" : "KB");
                    interfaceC0818.accept(sb.toString());
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
        }
    }
}
