package l;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C20932 {

    /* JADX INFO: renamed from: ᩴ᩶ۛ, reason: not valid java name and contains not printable characters */
    public static int f66974;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Messenger f66975;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Bundle f66976;

    /* JADX INFO: renamed from: ۚ᩷ܰ, reason: not valid java name and contains not printable characters */
    public static void m47845(Object obj) {
        ((AbstractC2432) obj).m8196();
    }

    /* JADX INFO: renamed from: ۚ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static String m47846(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۜ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m47847(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۡ᩶ۜ, reason: not valid java name and contains not printable characters */
    public static int m47848() {
        return 0;
    }

    /* JADX INFO: renamed from: ۧ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public static void m47849(Object obj) {
        ((C15945) obj).m38061();
    }

    /* JADX INFO: renamed from: ܰ֡᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m47850(Object obj) {
        return ((AbstractC22044) obj).m49877();
    }

    /* JADX INFO: renamed from: ܳᩴۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m47851(Object obj) {
        return C18282.m42543((AbstractC22044) obj);
    }

    /* JADX INFO: renamed from: ܿۘ֡, reason: not valid java name and contains not printable characters */
    public static String m47852(Object obj) {
        return ((C11192) obj).m28214();
    }

    /* JADX INFO: renamed from: ᩳܿܰ, reason: not valid java name and contains not printable characters */
    public static String m47853(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩴۜ۫, reason: not valid java name and contains not printable characters */
    public static String m47854(Object obj) {
        return ((InterfaceC19775) obj).getType();
    }

    /* JADX INFO: renamed from: ᩴܶۗ, reason: not valid java name and contains not printable characters */
    public static EditText m47855(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ᩷ۙۛ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m47856(Object obj, Object obj2) {
        return C18282.m42549((C14069) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۖ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47857(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۘۡ, reason: not valid java name and contains not printable characters */
    public static boolean m47858(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩻ۤᩳ, reason: not valid java name and contains not printable characters */
    public static Iterator m47859(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩻ۤ᩺, reason: not valid java name and contains not printable characters */
    public static void m47860(Object obj, int i) {
        ((InterfaceC23332) obj).writeInt(i);
    }

    public C20932(IBinder iBinder, Bundle bundle) {
        this.f66975 = new Messenger(iBinder);
        this.f66976 = bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47861(Context context, Messenger messenger) {
        Bundle bundle = new Bundle();
        bundle.putString("data_package_name", context.getPackageName());
        bundle.putInt("data_calling_pid", Process.myPid());
        bundle.putBundle("data_root_hints", this.f66976);
        m47844(6, bundle, messenger);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47862(Messenger messenger) {
        m47844(7, null, messenger);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47844(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        this.f66975.send(messageObtain);
    }
}
