package l;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes.dex */
public final class C3577 {

    /* JADX INFO: renamed from: ܰ֡ܽ, reason: not valid java name and contains not printable characters */
    public static int f13150;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Context f13151;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PendingIntent f13152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f13155;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16775 f13156;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f13157;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f13159;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Bundle f13160;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f13161;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public ArrayList f13162;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13163;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC22629 f13165;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f13167;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Notification f13168;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f13154 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f13166 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f13153 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f13164 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f13158 = 0;

    /* JADX INFO: renamed from: ֡ۨ᩹, reason: not valid java name and contains not printable characters */
    public static StringBuilder m10562(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ֫᩺ܶ, reason: not valid java name and contains not printable characters */
    public static Iterator m10563(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۗܽۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10564(Object obj) {
        return ((InterfaceC5614) obj).mo2357();
    }

    /* JADX INFO: renamed from: ۡۧܿ, reason: not valid java name and contains not printable characters */
    public static boolean m10565() {
        return true;
    }

    /* JADX INFO: renamed from: ۤ֨ۙ, reason: not valid java name and contains not printable characters */
    public static View m10566(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ۤ֨᩶, reason: not valid java name and contains not printable characters */
    public static String m10567(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10568(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ۨ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m10569(Object obj) {
        return ((AbstractC20745) obj).mo33971();
    }

    /* JADX INFO: renamed from: ۫ۜۗ, reason: not valid java name and contains not printable characters */
    public static void m10570(Object obj, Object obj2, Object obj3) {
        ((C5013) obj).m13907((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۫ۡ۫, reason: not valid java name and contains not printable characters */
    public static String m10571(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫᩺ۢ, reason: not valid java name and contains not printable characters */
    public static int m10572(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ᩷ۚᩳ, reason: not valid java name and contains not printable characters */
    public static void m10574(Object obj) {
        ((AbstractC20745) obj).m46739();
    }

    /* JADX INFO: renamed from: ᩷᩻ۚ, reason: not valid java name and contains not printable characters */
    public static Long m10575(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ᩹ܿۤ, reason: not valid java name and contains not printable characters */
    public static Editable m10576(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ᩻ۜۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m10577() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ᩻۟۬, reason: not valid java name and contains not printable characters */
    public static boolean m10578(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    public C3577(Context context, String str) {
        Notification notification = new Notification();
        this.f13168 = notification;
        this.f13151 = context;
        this.f13159 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f13163 = 0;
        this.f13162 = new ArrayList();
        this.f13161 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10588(boolean z) {
        this.f13164 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m10592() {
        this.f13168.icon = R.drawable.MT_Protector;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10589() {
        this.f13157 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10586(String str) {
        this.f13167 = m10573(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10585(CharSequence charSequence) {
        this.f13155 = m10573(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10583(PendingIntent pendingIntent) {
        this.f13152 = pendingIntent;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10590() {
        this.f13168.flags |= 2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10591() {
        this.f13168.flags |= 16;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10580() {
        this.f13163 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10582(int i, String str, PendingIntent pendingIntent) {
        this.f13154.add(new C0755(i == 0 ? null : C16775.m39334((Resources) null, "", i), str, pendingIntent, new Bundle(), null, null, true, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10587(AbstractC22629 abstractC22629) {
        if (this.f13165 != abstractC22629) {
            this.f13165 = abstractC22629;
            if (abstractC22629 == null || abstractC22629.f73730 == this) {
                return;
            }
            abstractC22629.f73730 = this;
            m10587(abstractC22629);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m10579() {
        this.f13158 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification m10581() {
        return new C7106(this).m18996();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static CharSequence m10573(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10584(Bitmap bitmap) {
        C16775 c16775M39337;
        if (bitmap == null) {
            c16775M39337 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f13151.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            c16775M39337 = C16775.m39337(bitmap);
        }
        this.f13156 = c16775M39337;
    }
}
