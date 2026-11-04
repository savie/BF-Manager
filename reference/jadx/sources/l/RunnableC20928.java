package l;

import android.app.Application;
import android.content.ServiceConnection;
import android.widget.TextView;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩵᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20928 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66962;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66963;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66964;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66966;

    public /* synthetic */ RunnableC20928(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f66964 = i;
        this.f66966 = obj;
        this.f66965 = obj2;
        this.f66962 = obj3;
        this.f66963 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66964) {
            case 0:
                C14960.m36004((C14960) this.f66966, (AtomicBoolean) this.f66965, (Application) this.f66962, (ServiceConnection) this.f66963);
                break;
            default:
                List list = (List) this.f66966;
                final TextView textView = (TextView) this.f66965;
                final TextView textView2 = (TextView) this.f66962;
                AbstractC7629 abstractC7629 = (AbstractC7629) this.f66963;
                C24720 c24720M55194 = C24720.m55194(300);
                LinkedList linkedList = new LinkedList(list);
                final int i = 0;
                final int i2 = 0;
                int i3 = 0;
                while (!linkedList.isEmpty()) {
                    i3++;
                    if ((i3 & 255) == 0 && c24720M55194.m55199()) {
                        C21576.m49068(new Runnable() { // from class: l.ۜۡ۫
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView.setText(String.valueOf(i));
                                textView2.setText(String.valueOf(i2));
                            }
                        });
                    }
                    InterfaceC2386 interfaceC2386 = (InterfaceC2386) linkedList.removeFirst();
                    if (interfaceC2386.mo8090()) {
                        i++;
                    } else {
                        i2++;
                        try {
                            linkedList.addAll(abstractC7629.mo20830(interfaceC2386.getPath(), true));
                        } catch (IOException unused) {
                        }
                    }
                }
                C21576.m49068(new Runnable() { // from class: l.۬ۡ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        textView.setText(String.valueOf(i));
                        textView2.setText(String.valueOf(i2));
                    }
                });
                break;
        }
    }
}
