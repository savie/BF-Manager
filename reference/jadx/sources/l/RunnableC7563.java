package l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB2O */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7563 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f25079;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bundle f25080;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f25081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11018 f25082;

    public RunnableC7563(AbstractC20745 abstractC20745, Bundle bundle, Object obj) {
        this.f25079 = abstractC20745;
        this.f25080 = bundle;
        this.f25082 = null;
        this.f25081 = obj;
    }

    public RunnableC7563(AbstractC20745 abstractC20745, C11018 c11018, Object obj) {
        this.f25079 = abstractC20745;
        this.f25080 = null;
        this.f25082 = c11018;
        this.f25081 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m20083();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20083() {
        synchronized (this.f25081) {
            if (this.f25080 == null && this.f25082 == null) {
                this.f25079.mo24647();
            } else {
                this.f25079.mo46720();
                Bundle bundle = this.f25080;
                if (bundle != null) {
                    if (bundle.isEmpty()) {
                        this.f25079.mo24647();
                    } else {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            this.f25080.writeToParcel(parcelObtain, 0);
                            this.f25079.m46703(parcelObtain.marshall());
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            throw th;
                        }
                    }
                } else {
                    this.f25079.m46697(this.f25082);
                }
            }
        }
    }
}
