package l;

/* JADX INFO: renamed from: l.᩵ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19269 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62216;

    public /* synthetic */ RunnableC19269(int i, Object obj) {
        this.f62215 = i;
        this.f62216 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f62215;
        Object obj = this.f62216;
        switch (i) {
            case 0:
                int i2 = C3040.f11359;
                ((C3040) obj).m9119(false);
                break;
            default:
                SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37282((SharedPreferencesOnSharedPreferenceChangeListenerC15618) obj);
                break;
        }
    }
}
