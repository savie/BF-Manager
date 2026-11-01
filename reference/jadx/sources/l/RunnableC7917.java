package l;

/* JADX INFO: renamed from: l.۠ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7917 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25999;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26001;

    public /* synthetic */ RunnableC7917(int i, Object obj, Object obj2) {
        this.f26000 = i;
        this.f26001 = obj;
        this.f25999 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26000) {
            case 0:
                C23229 c23229 = (C23229) this.f26001;
                C6111 c6111 = (C6111) this.f25999;
                if (c23229.m51236()) {
                    c6111.m17057(false);
                }
                break;
            case 1:
                SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37283((SharedPreferencesOnSharedPreferenceChangeListenerC15618) this.f26001, (C17485) this.f25999);
                break;
            case 2:
                ((C19644) this.f26001).m44772((C6111) this.f25999);
                break;
            default:
                C23519.m51793((C11545) this.f26001, (InterfaceC2557) this.f25999);
                break;
        }
    }
}
