package l;

import android.text.Spannable;
import android.text.SpannableString;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2981 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9685 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f9686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f9687;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.toNanos(1500L);
        f9687 = timeUnit.toNanos(50L);
        f9686 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1270 m9702(C20661 c20661, CharSequence charSequence, int i, long j) {
        if (!(charSequence instanceof InterfaceC9629)) {
            if (i < 0) {
                throw new IllegalArgumentException("Negative syntax highlight prefix length");
            }
            int iMin = Math.min(charSequence.length(), i);
            if (c20661.m47283()) {
                C16207 c16207 = new C16207(c20661, charSequence, new C1490(), iMin);
                try {
                    if (c16207.m38504(Integer.MAX_VALUE, j, (C24655) null) == EnumC17699.COMPLETED) {
                        return c16207.m38511();
                    }
                } catch (C5767 unused) {
                }
            }
            return null;
        }
        C15508 c15508Mo15350 = ((InterfaceC9629) charSequence).mo15350();
        try {
            C1270 c1270M9702 = m9702(c20661, c15508Mo15350, i, j);
            c15508Mo15350.close();
            return c1270M9702;
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9701(String str) {
        C20661 c20661M47275;
        int iMin = Math.min(str.length(), 200);
        ?? Substring = str.substring(0, iMin);
        if (str.length() <= 8192) {
            C16800 c16800M24619 = C9341.m24619("INTERNAL:ArscTranslationItem");
            C20661 c20661 = null;
            if (c16800M24619 != null) {
                try {
                    WeakHashMap weakHashMap = f9686;
                    synchronized (weakHashMap) {
                        WeakReference weakReference = (WeakReference) weakHashMap.get(c16800M24619);
                        c20661M47275 = weakReference == null ? null : (C20661) weakReference.get();
                        if (c20661M47275 == null || !c20661M47275.m47282()) {
                            c20661M47275 = C20661.m47275(c16800M24619);
                            weakHashMap.put(c16800M24619, new WeakReference(c20661M47275));
                        }
                    }
                    c20661 = c20661M47275;
                } catch (RuntimeException unused) {
                }
            }
            if (c20661 != null && c20661.m47283()) {
                C1270 c1270M9702 = m9702(c20661, str, iMin, f9687);
                if (c1270M9702 != null) {
                    Substring = Substring instanceof Spannable ? (Spannable) Substring : new SpannableString(Substring);
                    if (c1270M9702.m4628() == Substring.length()) {
                        for (C9692 c9692 : (C9692[]) Substring.getSpans(0, Substring.length(), C9692.class)) {
                            Substring.removeSpan(c9692);
                        }
                        C21407 c21407 = new C21407();
                        c21407.m48710(c1270M9702);
                        while (c21407.m48714()) {
                            C11974 c11974M48712 = c21407.m48712();
                            Substring.setSpan(new C9692(c11974M48712.m30045(), c11974M48712.m30040()), c21407.m48715(), c21407.m48709(), 17);
                        }
                    } else {
                        throw new IllegalArgumentException("Syntax store and text lengths differ");
                    }
                }
                return Substring;
            }
        }
        return Substring;
    }
}
