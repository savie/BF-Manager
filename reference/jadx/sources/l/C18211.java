package l;

import android.text.Spannable;
import android.text.SpannableString;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginEditText;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ᩳᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18211 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long f58169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58170 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f58171;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f58172;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f58169 = timeUnit.toNanos(1500L);
        f58172 = timeUnit.toNanos(50L);
        f58171 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42336(TextView textView, C1900 c1900, boolean z) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            if (z) {
                m42338(c1900, spannable);
            } else {
                m42333(spannable);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42338(C1900 c1900, Spannable spannable) {
        if (spannable.length() > 8192) {
            m42333(spannable);
            return;
        }
        C7027 c7027M42332 = m42332(c1900, spannable, f58169);
        if (c7027M42332 != null) {
            m42334(spannable, c7027M42332);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42333(Spannable spannable) {
        for (C21739 c21739 : (C21739[]) spannable.getSpans(0, spannable.length(), C21739.class)) {
            spannable.removeSpan(c21739);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7027 m42332(C1900 c1900, CharSequence charSequence, long j) {
        if (charSequence instanceof InterfaceC0507) {
            C3329 c3329Mo2399 = ((InterfaceC0507) charSequence).mo2399();
            try {
                C7027 c7027M42332 = m42332(c1900, c3329Mo2399, j);
                c3329Mo2399.close();
                return c7027M42332;
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C6922 c6922 = new C6922();
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C12237 c12237 = new C12237(c1900, charSequence, c6922);
        try {
            if (c12237.m30424(Integer.MAX_VALUE, j, (C1569) null) == EnumC16470.COMPLETED) {
                return c12237.m30420();
            }
        } catch (C7297 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7027 m42331(C1900 c1900, CharSequence charSequence, int i, long j) {
        if (charSequence instanceof InterfaceC0507) {
            C3329 c3329Mo2399 = ((InterfaceC0507) charSequence).mo2399();
            try {
                C7027 c7027M42331 = m42331(c1900, c3329Mo2399, i, j);
                c3329Mo2399.close();
                return c7027M42331;
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax highlight prefix length");
        }
        int iMin = Math.min(charSequence.length(), i);
        if (!c1900.m6196()) {
            return null;
        }
        C12237 c12237 = new C12237(c1900, charSequence, new C6922(), iMin);
        try {
            if (c12237.m30424(Integer.MAX_VALUE, j, (C1569) null) == EnumC16470.COMPLETED) {
                return c12237.m30420();
            }
        } catch (C7297 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42334(Spannable spannable, C7027 c7027) {
        if (c7027.m18860() != spannable.length()) {
            throw new IllegalArgumentException("Syntax store and text lengths differ");
        }
        m42333(spannable);
        C2793 c2793 = new C2793();
        c2793.m8488(c7027);
        while (c2793.m8490()) {
            C15682 c15682M8491 = c2793.m8491();
            spannable.setSpan(new C21739(c15682M8491.m37379(), c15682M8491.m37376()), c2793.m8492(), c2793.m8487(), 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m42330(String str) {
        C1900 c1900M6195;
        C7027 c7027M42331;
        int iMin = Math.min(str.length(), 200);
        ?? Substring = str.substring(0, iMin);
        if (str.length() <= 8192) {
            C20889 c20889M31894 = C12859.m31894("INTERNAL:ArscTranslationItem");
            C1900 c1900 = null;
            if (c20889M31894 != null) {
                try {
                    WeakHashMap weakHashMap = f58171;
                    synchronized (weakHashMap) {
                        WeakReference weakReference = (WeakReference) weakHashMap.get(c20889M31894);
                        c1900M6195 = weakReference == null ? null : (C1900) weakReference.get();
                        if (c1900M6195 == null || !c1900M6195.m6204()) {
                            c1900M6195 = C1900.m6195(c20889M31894);
                            weakHashMap.put(c20889M31894, new WeakReference(c1900M6195));
                        }
                    }
                    c1900 = c1900M6195;
                } catch (RuntimeException unused) {
                }
            }
            if (c1900 != null && c1900.m6196() && (c7027M42331 = m42331(c1900, str, iMin, f58172)) != null) {
                Substring = Substring instanceof Spannable ? (Spannable) Substring : new SpannableString(Substring);
                m42334((Spannable) Substring, c7027M42331);
            }
        }
        return Substring;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42335(final EditText editText, CheckBox checkBox) {
        C1900 c1900M6195;
        Spannable spannable;
        C20889 c20889M31894 = C12859.m31894(PluginEditText.SYNTAX_REGEX);
        final C1900 c1900 = null;
        if (c20889M31894 != null) {
            try {
                WeakHashMap weakHashMap = f58171;
                synchronized (weakHashMap) {
                    WeakReference weakReference = (WeakReference) weakHashMap.get(c20889M31894);
                    c1900M6195 = weakReference == null ? null : (C1900) weakReference.get();
                    if (c1900M6195 == null || !c1900M6195.m6204()) {
                        c1900M6195 = C1900.m6195(c20889M31894);
                        weakHashMap.put(c20889M31894, new WeakReference(c1900M6195));
                    }
                }
                c1900 = c1900M6195;
            } catch (RuntimeException unused) {
            }
        }
        if (c1900 == null) {
            return;
        }
        CharSequence text = editText.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            SpannableString spannableString = new SpannableString(text);
            editText.setText(spannableString);
            spannable = spannableString;
        }
        if (checkBox == null || checkBox.isChecked()) {
            m42338(c1900, spannable);
        }
        editText.addTextChangedListener(new C15390(checkBox, c1900));
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩺ᩳۚ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C18211.m42336(editText, c1900, z);
                }
            });
        }
    }
}
