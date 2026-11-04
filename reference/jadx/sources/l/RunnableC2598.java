package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۖۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2598 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8345;

    public /* synthetic */ RunnableC2598(Object obj, Object obj2, Object obj3, int i) {
        this.f8343 = i;
        this.f8345 = obj;
        this.f8344 = obj2;
        this.f8342 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8343) {
            case 0:
                TextView textView = (TextView) this.f8345;
                InterfaceC5344 interfaceC5344 = (InterfaceC5344) this.f8344;
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f8342;
                C16530.m39161(textView, interfaceC5344.mo4000());
                dialogInterfaceC8327.m22436().setEnabled(!interfaceC5344.mo4001());
                break;
            case 1:
                C8614 c8614 = (C8614) this.f8345;
                c8614.m23125((Integer) c8614.f28157.f24220.f28934.get((String) this.f8344), (String) this.f8342);
                break;
            default:
                final ViewOnClickListenerC19404 viewOnClickListenerC19404 = (ViewOnClickListenerC19404) this.f8345;
                final C20283 c20283 = (C20283) this.f8344;
                final byte[] bArr = (byte[]) this.f8342;
                final C19782 c19782M46623 = c20283.m46623();
                C21576.m49068(new Runnable() { // from class: l.᩷᩺ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC19404.m44883(viewOnClickListenerC19404, c19782M46623, bArr, c20283);
                    }
                });
                break;
        }
    }
}
