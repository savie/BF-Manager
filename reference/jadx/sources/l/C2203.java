package l;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.֫᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB30 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2203 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f7232 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile C2203 f7233;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5186 f7234;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13783 f7235;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18037 f7236;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15626 f7237;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f7238;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f7239;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8563 f7240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f7241;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7525(AbstractC22340 abstractC22340) {
        Handler handlerM21289 = C7818.m21289();
        C17359.requireNonNull(handlerM21289);
        ExecutorC21243 executorC21243 = new ExecutorC21243(handlerM21289);
        C11293.m28552(abstractC22340, "initCallback cannot be null");
        C20102 c20102 = new C20102();
        c20102.f64593 = abstractC22340;
        c20102.f64592 = executorC21243;
        this.f7241.writeLock().lock();
        try {
            if (this.f7239 != 1) {
                if (this.f7239 != 2) {
                    this.f7236.add(c20102);
                } else {
                    executorC21243.execute(new RunnableC23086(c20102, new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.")));
                }
            } else {
                executorC21243.execute(new RunnableC11151(c20102));
            }
        } finally {
            this.f7241.writeLock().unlock();
        }
    }

    public C2203(AbstractC7072 abstractC7072) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7241 = reentrantReadWriteLock;
        this.f7239 = 3;
        this.f7237 = abstractC7072.f23294;
        int i = abstractC7072.f23295;
        this.f7238 = i;
        this.f7234 = abstractC7072.f23293;
        this.f7236 = new C18037(0);
        this.f7235 = new C13783();
        C8563 c8563 = new C8563(this);
        this.f7240 = c8563;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f7239 = 0;
            } catch (Throwable th) {
                this.f7241.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m7521() == 0) {
            c8563.m22976();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7517(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
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
                AbstractC21594[] abstractC21594Arr = (AbstractC21594[]) editable.getSpans(selectionStart, iMin, AbstractC21594.class);
                if (abstractC21594Arr != null && abstractC21594Arr.length > 0) {
                    for (AbstractC21594 abstractC21594 : abstractC21594Arr) {
                        int spanStart = editable.getSpanStart(abstractC21594);
                        int spanEnd = editable.getSpanEnd(abstractC21594);
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
    public static void m7515(AbstractC7072 abstractC7072) {
        if (f7233 == null) {
            synchronized (f7232) {
                if (f7233 == null) {
                    f7233 = new C2203(abstractC7072);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m7518() {
        return f7233 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C2203 m7520() {
        C2203 c2203;
        synchronized (f7232) {
            c2203 = f7233;
            if (!(c2203 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c2203;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7527() {
        if (!(this.f7238 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m7521() == 1) {
            return;
        }
        this.f7241.writeLock().lock();
        try {
            if (this.f7239 != 0) {
                this.f7239 = 0;
                this.f7241.writeLock().unlock();
                this.f7240.m22976();
                return;
            }
            this.f7241.writeLock().unlock();
        } catch (Throwable th) {
            this.f7241.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m7526() {
        C18037 c18037 = this.f7236;
        ArrayList arrayList = new ArrayList(c18037.size());
        this.f7241.writeLock().lock();
        try {
            this.f7239 = 1;
            arrayList.addAll(c18037);
            c18037.clear();
            this.f7241.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                C20102 c20102 = (C20102) arrayList.get(i);
                c20102.f64592.execute(new RunnableC11151(c20102));
            }
        } catch (Throwable th) {
            this.f7241.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7524(Throwable th) {
        C18037 c18037 = this.f7236;
        ArrayList arrayList = new ArrayList(c18037.size());
        this.f7241.writeLock().lock();
        try {
            this.f7239 = 2;
            arrayList.addAll(c18037);
            c18037.clear();
            this.f7241.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                C20102 c20102 = (C20102) arrayList.get(i);
                c20102.f64592.execute(new RunnableC23086(c20102, th));
            }
        } catch (Throwable th2) {
            this.f7241.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7528(AbstractC22340 abstractC22340) {
        C18037 c18037 = this.f7236;
        C11293.m28552(abstractC22340, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f7241;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = c18037.iterator();
            while (true) {
                AbstractC7596 abstractC7596 = (AbstractC7596) it;
                if (!abstractC7596.hasNext()) {
                    break;
                }
                C20102 c20102 = (C20102) abstractC7596.next();
                if (c20102.f64593 == abstractC22340) {
                    arrayList.add(c20102);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c18037.remove((C20102) it2.next());
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7521() {
        this.f7241.readLock().lock();
        try {
            return this.f7239;
        } finally {
            this.f7241.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m7522(int i, int i2, CharSequence charSequence) {
        if (!(m7521() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C11293.m28553("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        C11293.m28553("start should be < than charSequence length", i <= charSequence.length());
        C11293.m28553("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.f7240.m22975(charSequence, i, i2, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7523(EditorInfo editorInfo) {
        if (m7521() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f7240.m22977(editorInfo);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7516(Editable editable, int i, KeyEvent keyEvent) {
        return C14880.m35823(editable, i, keyEvent);
    }
}
