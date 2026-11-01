package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1K8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22611 extends ComponentCallbacksC22654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f73687;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AtomicReference f73688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f73689;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC19083 mo19340() {
        return null;
    }

    /* JADX INFO: renamed from: ۘ */
    public abstract String mo3615();

    /* JADX INFO: renamed from: ۠ */
    public boolean mo29300() {
        return this instanceof C7236;
    }

    /* JADX INFO: renamed from: ۡ */
    public boolean mo3617() {
        return this instanceof C16324;
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract String mo3618();

    /* JADX INFO: renamed from: ܰ */
    public boolean mo3619() {
        return !(this instanceof C16324);
    }

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo3620();

    /* JADX INFO: renamed from: ᩴ */
    public void mo29302() {
    }

    /* JADX INFO: renamed from: ᩵ */
    public abstract boolean mo3621();

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo19351() {
        return false;
    }

    /* JADX INFO: renamed from: ᩹ */
    public abstract int mo3622();

    /* JADX INFO: renamed from: ᩺ */
    public C6111 mo19352() {
        return null;
    }

    public AbstractC22611() {
        this.f73689 = new Bundle();
    }

    public AbstractC22611(int i) {
        super(i);
        this.f73689 = new Bundle();
    }

    @Override // l.ComponentCallbacksC22654
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73688 = ((ActivityC5677) requireActivity()).f19361;
        if (bundle == null || !bundle.containsKey("stateDir")) {
            return;
        }
        try {
            m50123((C13626) bundle.getSerializable("stateDir"));
        } catch (IOException e) {
            ((ActivityC5677) requireActivity()).m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ComponentCallbacksC22654
    public void onResume() {
        super.onResume();
        this.f73688.set(getClass());
    }

    @Override // l.ComponentCallbacksC22654
    public void onHiddenChanged(boolean z) {
        if (z || !isResumed()) {
            return;
        }
        this.f73688.set(getClass());
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19342(ActivityC5677 activityC5677, boolean z, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m50131() {
        return !m50134() && mo3619();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Drawable m50127() {
        if (this.f73687 == null) {
            this.f73687 = C16737.m39263(mo3622()).mutate();
        }
        return this.f73687;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19344(C18377 c18377) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50133(String str) {
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

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m50129() {
        String string = requireArguments().getString("state");
        C13638.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50134() {
        Bundle bundleRequireArguments = requireArguments();
        C13638.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo28945(byte[] bArr) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13626 m50132(C13626 c13626) {
        return new C13626(c13626, m50129().concat(".dat"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13626 m50130(C13626 c13626) {
        return new C13626(c13626, m50129().concat(".tat"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13626 m50124(C13626 c13626) {
        return new C13626(c13626, m50129().concat(".lit"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50123(C13626 c13626) {
        C13626 c13626M50124 = m50124(c13626);
        if (c13626M50124.m33326()) {
            byte[] bArrM33327 = c13626M50124.m33327();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrM33327, 0, bArrM33327.length);
            parcelObtain.setDataPosition(0);
            this.f73689.readFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50128(C13626 c13626) {
        C13626 c13626M50124 = m50124(c13626);
        Bundle bundle = this.f73689;
        if (bundle.isEmpty()) {
            c13626M50124.m33323();
            return;
        }
        c13626M50124.m33324();
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        c13626M50124.m33322(bArrMarshall);
    }

    @Override // l.ComponentCallbacksC22654
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            C13626 c13626M15676 = ((ActivityC5677) requireActivity()).m15676();
            if (!this.f73689.isEmpty()) {
                bundle.putSerializable("stateDir", c13626M15676);
            }
            m50128(c13626M15676);
        } catch (IOException unused) {
        }
    }

    @Override // l.ComponentCallbacksC22654
    public void onPause() {
        super.onPause();
        try {
            m50128(((ActivityC5677) requireActivity()).m15676());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50125(Consumer consumer) {
        ActivityC19126 activity = getActivity();
        if (activity != null) {
            consumer.accept((ActivityC5677) activity);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo19350(ActivityC5677 activityC5677) {
        if (!mo3619()) {
            throw new RuntimeException();
        }
        m50126(activityC5677);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50126(ActivityC5677 activityC5677) {
        if (!mo3619()) {
            throw new RuntimeException();
        }
        activityC5677.m15661(this);
    }
}
