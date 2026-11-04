package l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: LB2O */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8139 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f26849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f26850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f26851;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6178 f26852;

    public RunnableC8139(AbstractC22044 abstractC22044, Bundle bundle, Object obj) {
        this.f26851 = abstractC22044;
        this.f26850 = bundle;
        this.f26852 = null;
        this.f26849 = obj;
    }

    public RunnableC8139(AbstractC22044 abstractC22044, C6178 c6178, Object obj) {
        this.f26851 = abstractC22044;
        this.f26850 = null;
        this.f26852 = c6178;
        this.f26849 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m22019();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22019() {
        synchronized (this.f26849) {
            if (this.f26850 == null && this.f26852 == null) {
                this.f26851.mo4296();
            } else {
                this.f26851.mo49834();
                Bundle bundle = this.f26850;
                if (bundle != null) {
                    if (bundle.isEmpty()) {
                        this.f26851.mo4296();
                    } else {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            this.f26850.writeToParcel(parcelObtain, 0);
                            this.f26851.m49849(parcelObtain.marshall());
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            throw th;
                        }
                    }
                } else {
                    this.f26851.m49844(this.f26852);
                }
            }
        }
    }
}
