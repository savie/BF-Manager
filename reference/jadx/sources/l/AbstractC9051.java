package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9051 extends ComponentCallbacksC11612 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AtomicReference f29439;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f29440;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f29441;

    /* JADX INFO: renamed from: ۗ */
    public boolean mo1433() {
        return this instanceof C25350;
    }

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo1440();

    /* JADX INFO: renamed from: ۧ */
    public C24132 mo1442() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo24168() {
        return this instanceof C24406;
    }

    /* JADX INFO: renamed from: ۫ */
    public abstract String mo1443();

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo1444();

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo1445();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo24170() {
        return false;
    }

    /* JADX INFO: renamed from: ᩵ */
    public abstract boolean mo1446();

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo9150() {
        return !(this instanceof C24406);
    }

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC19777 mo1447() {
        return null;
    }

    /* JADX INFO: renamed from: ᩹ */
    public void mo1448() {
    }

    public AbstractC9051() {
        this.f29441 = new Bundle();
    }

    public AbstractC9051(int i) {
        super(i);
        this.f29441 = new Bundle();
    }

    @Override // l.ComponentCallbacksC11612
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29439 = ((ActivityC0848) requireActivity()).f3192;
        if (bundle == null || !bundle.containsKey("stateDir")) {
            return;
        }
        try {
            m24176((C9378) bundle.getSerializable("stateDir"));
        } catch (IOException e) {
            ((ActivityC0848) requireActivity()).m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ComponentCallbacksC11612
    public void onResume() {
        super.onResume();
        this.f29439.set(getClass());
    }

    @Override // l.ComponentCallbacksC11612
    public void onHiddenChanged(boolean z) {
        if (z || !isResumed()) {
            return;
        }
        this.f29439.set(getClass());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24165(ActivityC0848 activityC0848, boolean z, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24167() {
        return !m24169() && mo9150();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Drawable m24171() {
        if (this.f29440 == null) {
            this.f29440 = C21576.m49058(mo1444()).mutate();
        }
        return this.f29440;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1436(C22761 c22761) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24174(String str) {
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", str);
        setArguments(arguments);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24161() {
        String string = requireArguments().getString("state");
        C17359.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m24169() {
        Bundle bundleRequireArguments = requireArguments();
        C17359.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo9149(byte[] bArr) {
        if (getArguments() != null) {
            throw new RuntimeException("Arguments is not null.");
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(parcelObtain);
        setArguments(bundle);
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9378 m24173(C9378 c9378) {
        return new C9378(c9378, m24161().concat(".dat"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9378 m24166(C9378 c9378) {
        return new C9378(c9378, m24161().concat(".tat"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9378 m24162(C9378 c9378) {
        return new C9378(c9378, m24161().concat(".lit"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24176(C9378 c9378) {
        C9378 c9378M24162 = m24162(c9378);
        if (c9378M24162.m24702()) {
            byte[] bArrM24700 = c9378M24162.m24700();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrM24700, 0, bArrM24700.length);
            parcelObtain.setDataPosition(0);
            this.f29441.readFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24172(C9378 c9378) {
        C9378 c9378M24162 = m24162(c9378);
        Bundle bundle = this.f29441;
        if (bundle.isEmpty()) {
            c9378M24162.m24697();
            return;
        }
        c9378M24162.m24701();
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        c9378M24162.m24696(bArrMarshall);
    }

    @Override // l.ComponentCallbacksC11612
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            C9378 c9378M3442 = ((ActivityC0848) requireActivity()).m3442();
            if (!this.f29441.isEmpty()) {
                bundle.putSerializable("stateDir", c9378M3442);
            }
            m24172(c9378M3442);
        } catch (IOException unused) {
        }
    }

    @Override // l.ComponentCallbacksC11612
    public void onPause() {
        super.onPause();
        try {
            m24172(((ActivityC0848) requireActivity()).m3442());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24163(Consumer consumer) {
        ActivityC3409 activity = getActivity();
        if (activity != null) {
            consumer.accept((ActivityC0848) activity);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo24175(ActivityC0848 activityC0848) {
        if (!mo9150()) {
            throw new RuntimeException();
        }
        m24164(activityC0848);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24164(ActivityC0848 activityC0848) {
        if (!mo9150()) {
            throw new RuntimeException();
        }
        activityC0848.m3432(this);
    }
}
