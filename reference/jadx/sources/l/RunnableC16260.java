package l;

import bin.mt.plus.R;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.ܺ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16260 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52426;

    public /* synthetic */ RunnableC16260(int i, Object obj) {
        this.f52425 = i;
        this.f52426 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52425) {
            case 0:
                ((C6111) this.f52426).m16767();
                break;
            case 1:
                ((C3134) this.f52426).m9496(false);
                break;
            case 2:
                ((C9268) this.f52426).m23810();
                break;
            case 3:
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f52426;
                if (dialogInterfaceC19356.m44375()) {
                    dialogInterfaceC19356.dismiss();
                }
                break;
            case 4:
                DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, (AbstractActivityC12483) this.f52426, "def_sign_key_warn");
                break;
            default:
                ((SearchBar) this.f52426).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
