package l;

import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.᩹ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23484 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75946;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75947;

    public /* synthetic */ RunnableC23484(int i, Object obj) {
        this.f75946 = i;
        this.f75947 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75946) {
            case 0:
                C3346.m10997((C3346) this.f75947);
                break;
            case 1:
                try {
                    ((Runnable) this.f75947).run();
                } catch (RuntimeException unused) {
                    return;
                }
                break;
            case 2:
                C10745.m27385((C10745) this.f75947);
                break;
            case 3:
                C8351.m22468((C8351) this.f75947);
                break;
            case 4:
                C3651.m11829((C3651) this.f75947);
                break;
            case 5:
                C22403.m50504((C22403) this.f75947);
                break;
            default:
                ((SearchBar) this.f75947).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
