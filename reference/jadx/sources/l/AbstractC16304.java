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

/* JADX INFO: renamed from: l.ܽ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16304 extends AbstractC20537 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC8894 f52505;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC19126 f52506;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Handler f52507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC19126 f52508;

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo20668();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo20669(PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: ۬ */
    public abstract LayoutInflater mo20670();

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo20671(String str);

    /* JADX INFO: renamed from: ᩹ */
    public abstract ActivityC19126 mo20672();

    public AbstractC16304(ActivityC19126 activityC19126) {
        Handler handler = new Handler();
        this.f52505 = new C10305();
        this.f52506 = activityC19126;
        this.f52508 = activityC19126;
        this.f52507 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38451(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f52508.startActivity(intent, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38452(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        this.f52506.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Activity m38454() {
        return this.f52506;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context m38450() {
        return this.f52508;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Handler m38453() {
        return this.f52507;
    }
}
