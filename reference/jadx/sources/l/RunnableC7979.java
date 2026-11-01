package l;

import android.media.metrics.PlaybackStateEvent;
import android.widget.TextView;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7979 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26196;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26198;

    public /* synthetic */ RunnableC7979(int i, Object obj, Object obj2) {
        this.f26197 = i;
        this.f26198 = obj;
        this.f26196 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26197) {
            case 0:
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f26198;
                DialogInterfaceC19356 dialogInterfaceC19357 = (DialogInterfaceC19356) this.f26196;
                dialogInterfaceC19356.dismiss();
                dialogInterfaceC19357.dismiss();
                break;
            case 1:
                ((C14663) this.f26198).f47952.reportPlaybackStateEvent((PlaybackStateEvent) this.f26196);
                break;
            case 2:
                TextView textView = (TextView) this.f26198;
                C20202 c20202 = (C20202) this.f26196;
                textView.setText(c20202.m45656().m2273());
                if (c20202.m45656() != EnumC0445.SUCCESS) {
                    textView.setTextColor(c20202.m45657() ? C20368.f65998 : C20368.f65966);
                }
                break;
            case 3:
                C3872.m11211((AbstractActivityC12483) this.f26198, (AbstractC20745) this.f26196, (List) null);
                break;
            case 4:
                C2599.m8074((C2599) this.f26198, (InputStream) this.f26196);
                break;
            default:
                ((C20414) this.f26198).m46163((C14770) this.f26196);
                break;
        }
    }
}
