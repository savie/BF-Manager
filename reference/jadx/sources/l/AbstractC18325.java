package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܿ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18325 extends AbstractC24293 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Handler f59779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC3409 f59780;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC3191 f59781;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC3409 f59782;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo42747(PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo42748();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract LayoutInflater mo42750();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract ActivityC3409 mo42751();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract boolean mo42753(String str);

    public AbstractC18325(ActivityC3409 activityC3409) {
        Handler handler = new Handler();
        this.f59781 = new C20345();
        this.f59780 = activityC3409;
        this.f59782 = activityC3409;
        this.f59779 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42745(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f59782.startActivity(intent, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42746(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        this.f59780.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Activity m42749() {
        return this.f59780;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context m42754() {
        return this.f59782;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler m42752() {
        return this.f59779;
    }
}
