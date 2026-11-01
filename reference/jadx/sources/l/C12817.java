package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.۬ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12817 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Object f42673 = new Object();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile C12817 f42674;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f42675;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f42676;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4349 f42677;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13523 f42678;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile int f42679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18623 f42680;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC5055 f42681;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1796 f42682;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f42683;

    public C12817(AbstractC3207 abstractC3207) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f42676 = reentrantReadWriteLock;
        this.f42679 = 3;
        InterfaceC5055 interfaceC5055 = abstractC3207.f11994;
        this.f42681 = interfaceC5055;
        int i = abstractC3207.f11995;
        this.f42675 = i;
        this.f42678 = abstractC3207.f11993;
        this.f42683 = new Handler(Looper.getMainLooper());
        this.f42680 = new C18623();
        this.f42677 = new C4349();
        C1796 c1796 = new C1796(this);
        this.f42682 = c1796;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f42679 = 0;
            } catch (Throwable th) {
                this.f42676.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m31814() == 0) {
            try {
                interfaceC5055.mo14095(new C14498(c1796));
            } catch (Throwable th2) {
                m31817(th2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31811(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                AbstractC19873[] abstractC19873Arr = (AbstractC19873[]) editable.getSpans(selectionStart, iMin, AbstractC19873.class);
                if (abstractC19873Arr != null && abstractC19873Arr.length > 0) {
                    for (AbstractC19873 abstractC19873 : abstractC19873Arr) {
                        int spanStart = editable.getSpanStart(abstractC19873);
                        int spanEnd = editable.getSpanEnd(abstractC19873);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31809(AbstractC3207 abstractC3207) {
        if (f42674 == null) {
            synchronized (f42673) {
                if (f42674 == null) {
                    f42674 = new C12817(abstractC3207);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m31812() {
        return f42674 != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C12817 m31807() {
        C12817 c12817;
        synchronized (f42673) {
            c12817 = f42674;
            if (!(c12817 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c12817;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31820() {
        if (!(this.f42675 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m31814() == 1) {
            return;
        }
        this.f42676.writeLock().lock();
        try {
            if (this.f42679 != 0) {
                this.f42679 = 0;
                this.f42676.writeLock().unlock();
                C1796 c1796 = this.f42682;
                C12817 c12817 = c1796.f32265;
                try {
                    c12817.f42681.mo14095(new C14498(c1796));
                    return;
                } catch (Throwable th) {
                    c12817.m31817(th);
                    return;
                }
            }
            this.f42676.writeLock().unlock();
        } catch (Throwable th2) {
            this.f42676.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31819() {
        ArrayList arrayList = new ArrayList();
        this.f42676.writeLock().lock();
        try {
            this.f42679 = 1;
            arrayList.addAll(this.f42680);
            this.f42680.clear();
            this.f42676.writeLock().unlock();
            this.f42683.post(new RunnableC2232(arrayList, this.f42679, null));
        } catch (Throwable th) {
            this.f42676.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31817(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f42676.writeLock().lock();
        try {
            this.f42679 = 2;
            arrayList.addAll(this.f42680);
            this.f42680.clear();
            this.f42676.writeLock().unlock();
            this.f42683.post(new RunnableC2232(arrayList, this.f42679, th));
        } catch (Throwable th2) {
            this.f42676.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31818(AbstractC11406 abstractC11406) {
        C9535.m24383(abstractC11406, "initCallback cannot be null");
        this.f42676.writeLock().lock();
        try {
            if (this.f42679 == 1 || this.f42679 == 2) {
                this.f42683.post(new RunnableC2232(Arrays.asList(abstractC11406), this.f42679, null));
            } else {
                this.f42680.add(abstractC11406);
            }
        } finally {
            this.f42676.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31821(AbstractC11406 abstractC11406) {
        C9535.m24383(abstractC11406, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f42676;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f42680.remove(abstractC11406);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31814() {
        this.f42676.readLock().lock();
        try {
            return this.f42679;
        } finally {
            this.f42676.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m31815(int i, int i2, CharSequence charSequence) {
        if (!(m31814() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C9535.m24384("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        C9535.m24384("start should be < than charSequence length", i <= charSequence.length());
        C9535.m24384("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.f42682.m5876(charSequence, i, i2, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31816(EditorInfo editorInfo) {
        if (m31814() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f42682.m5877(editorInfo);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31810(Editable editable, int i, KeyEvent keyEvent) {
        return C15640.m37316(editable, i, keyEvent);
    }
}
