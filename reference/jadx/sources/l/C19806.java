package l;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C19806 {

    /* JADX INFO: renamed from: ۚۤۘ, reason: not valid java name and contains not printable characters */
    public static boolean f63586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Messenger f63587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f63588;

    /* JADX INFO: renamed from: ֡֨᩶, reason: not valid java name and contains not printable characters */
    public static MenuItem m45013(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ۚۛ, reason: not valid java name and contains not printable characters */
    public static void m45014(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ֫۟֫, reason: not valid java name and contains not printable characters */
    public static boolean m45015(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۖܽ᩻, reason: not valid java name and contains not printable characters */
    public static Looper m45016() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ۘ᩶֡, reason: not valid java name and contains not printable characters */
    public static void m45017(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ۘ᩹᩵, reason: not valid java name and contains not printable characters */
    public static void m45018(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ᩷֨, reason: not valid java name and contains not printable characters */
    public static String m45020(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۜ۠ۛ, reason: not valid java name and contains not printable characters */
    public static String m45021(Object obj) {
        return C14952.m35814((AbstractC20745) obj);
    }

    /* JADX INFO: renamed from: ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m45022(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۧܰ۬, reason: not valid java name and contains not printable characters */
    public static StringBuilder m45023(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۨ֨ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m45024() {
        return false;
    }

    /* JADX INFO: renamed from: ᩴۗ۬, reason: not valid java name and contains not printable characters */
    public static String m45025(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩵ܶܶ, reason: not valid java name and contains not printable characters */
    public static C2519 m45026(Object obj, Object obj2) {
        return ((C2519) obj).m7852((C2519) obj2);
    }

    /* JADX INFO: renamed from: ᩶ᩳۨ, reason: not valid java name and contains not printable characters */
    public static void m45027(Object obj, Object obj2) {
        ((C14795) obj).m35466((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۢ֨, reason: not valid java name and contains not printable characters */
    public static void m45028(Object obj, boolean z) {
        ((C8067) obj).m21265(z);
    }

    /* JADX INFO: renamed from: ᩻֫ۘ, reason: not valid java name and contains not printable characters */
    public static int m45029(Object obj) {
        return obj.hashCode();
    }

    public C19806(IBinder iBinder, Bundle bundle) {
        this.f63587 = new Messenger(iBinder);
        this.f63588 = bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45030(Context context, Messenger messenger) {
        Bundle bundle = new Bundle();
        bundle.putString("data_package_name", context.getPackageName());
        bundle.putInt("data_calling_pid", Process.myPid());
        bundle.putBundle("data_root_hints", this.f63588);
        m45019(6, bundle, messenger);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45031(Messenger messenger) {
        m45019(7, null, messenger);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45019(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        this.f63587.send(messageObtain);
    }
}
