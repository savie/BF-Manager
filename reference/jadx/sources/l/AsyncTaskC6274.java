package l;

import android.os.AsyncTask;

/* JADX INFO: renamed from: l.ۛ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTaskC6274 extends AsyncTask {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13457 f21264;

    public AsyncTaskC6274(AbstractServiceC13457 abstractServiceC13457) {
        this.f21264 = abstractServiceC13457;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InterfaceC14742 interfaceC14742M24909;
        while (true) {
            AbstractServiceC13457 abstractServiceC13457 = this.f21264;
            JobServiceEngineC9803 jobServiceEngineC9803 = abstractServiceC13457.f44511;
            if (jobServiceEngineC9803 != null) {
                interfaceC14742M24909 = jobServiceEngineC9803.m24909();
            } else {
                synchronized (abstractServiceC13457.f44512) {
                    interfaceC14742M24909 = abstractServiceC13457.f44512.size() > 0 ? (InterfaceC14742) abstractServiceC13457.f44512.remove(0) : null;
                }
            }
            if (interfaceC14742M24909 == null) {
                return null;
            }
            this.f21264.mo32942(interfaceC14742M24909.getIntent());
            interfaceC14742M24909.mo6535();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f21264.m32941();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f21264.m32941();
    }
}
