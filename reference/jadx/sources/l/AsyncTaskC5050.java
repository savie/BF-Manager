package l;

import android.os.AsyncTask;

/* JADX INFO: renamed from: l.ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTaskC5050 extends AsyncTask {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC2067 f17473;

    public AsyncTaskC5050(AbstractServiceC2067 abstractServiceC2067) {
        this.f17473 = abstractServiceC2067;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InterfaceC22950 interfaceC22950M37056;
        while (true) {
            AbstractServiceC2067 abstractServiceC2067 = this.f17473;
            JobServiceEngineC15490 jobServiceEngineC15490 = abstractServiceC2067.f6880;
            if (jobServiceEngineC15490 != null) {
                interfaceC22950M37056 = jobServiceEngineC15490.m37056();
            } else {
                synchronized (abstractServiceC2067.f6881) {
                    interfaceC22950M37056 = abstractServiceC2067.f6881.size() > 0 ? (InterfaceC22950) abstractServiceC2067.f6881.remove(0) : null;
                }
            }
            if (interfaceC22950M37056 == null) {
                return null;
            }
            this.f17473.mo7142(interfaceC22950M37056.getIntent());
            interfaceC22950M37056.mo27881();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f17473.m7141();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f17473.m7141();
    }
}
