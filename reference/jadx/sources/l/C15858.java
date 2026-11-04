package l;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.TextSnapshot;
import java.io.UncheckedIOException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15858 extends BaseInputConnection {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f51562;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f51563;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51564;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f51565;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f51566;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1207 f51567;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24132 f51568;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f51569;

    public C15858(C24132 c24132, int i) {
        super(c24132, true);
        this.f51568 = c24132;
        this.f51564 = i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        if (!m37818()) {
            return null;
        }
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            return super.getTextBeforeCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        if (!m37818()) {
            return null;
        }
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            return super.getTextAfterCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (!m37818()) {
            return null;
        }
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            int iMin = Math.min(c24132.m53968(), c24132.m53882());
            int iMax = Math.max(c24132.m53968(), c24132.m53882());
            if (iMin < 0 || ((long) iMax) - ((long) iMin) <= 10000) {
                return super.getSelectedText(i);
            }
            int i2 = iMin + 10000;
            return (i & 1) != 0 ? interfaceC19106M54021.subSequence(iMin, i2) : TextUtils.substring(interfaceC19106M54021, iMin, i2);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        if (!m37818()) {
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Surrounding text lengths must be nonnegative");
        }
        C24132 c24132 = this.f51568;
        if (Math.abs(((long) c24132.m53882()) - ((long) c24132.m53968())) > 10000) {
            return null;
        }
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            return super.getSurroundingText(Math.min(i, 10000), Math.min(i2, 10000), i3);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        if (!m37818()) {
            return null;
        }
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            return super.takeSnapshot();
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return new C12393(this.f51568, this.f51564);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m37819()) {
            return false;
        }
        this.f51568.m54015();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        if (!m37818()) {
            return false;
        }
        this.f51568.m54008();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        C24132 c24132 = this.f51568;
        if (!m37819()) {
            return false;
        }
        try {
            C24132.f77977.clearMetaKeyState(c24132, getEditable(), i);
            c24132.m53880();
            c24132.invalidate();
            return true;
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        try {
            this.f51568.f78118.remove(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            c24132.mo52324(i);
            return !c24132.m54083();
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            ExtractedText extractedText = new ExtractedText();
            if (c24132.m53937(extractedTextRequest, extractedText)) {
                if (c24132.m53953()) {
                    InterfaceC19106 interfaceC19106M54022 = c24132.m54021();
                    this.f51567 = new C1207(extractedText.startOffset, extractedText.selectionStart, extractedText.selectionEnd, extractedText.text.length(), c24132.m53968(), c24132.m53882(), c24132.m54099(), interfaceC19106M54022, interfaceC19106M54022.mo15344());
                    this.f51566 = SystemClock.uptimeMillis();
                    return extractedText;
                }
                this.f51567 = null;
                return extractedText;
            }
            this.f51567 = null;
            return null;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f51569 = jUptimeMillis;
            if (charSequence.length() == 0 && i == 1 && c24132.m53968() != c24132.m53882()) {
                this.f51562 = jUptimeMillis;
            }
            C1207 c1207 = this.f51567;
            if (c1207 != null && c1207.f4381 > 0 && charSequence.length() == 2 && i == 1) {
                this.f51565 = jUptimeMillis;
                this.f51563 = c24132.m53968();
            }
            c24132.mo52319();
            try {
                return super.commitText(charSequence, i);
            } finally {
                c24132.mo52306();
            }
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            c24132.mo52319();
            try {
                return super.setComposingText(charSequence, i);
            } finally {
                c24132.mo52306();
            }
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (m37819()) {
                return super.replaceText(i, i2, charSequence, i3, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            if (i == 1 && i2 == 0 && SystemClock.uptimeMillis() - this.f51562 < 100) {
                return false;
            }
            return super.deleteSurroundingText(i, i2);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (m37819()) {
                return super.deleteSurroundingTextInCodePoints(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            int iM37817 = m37817(i, i2);
            if (iM37817 != 0) {
                i += iM37817;
                i2 += iM37817;
            }
            return super.setComposingRegion(i, i2);
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!m37818()) {
            return false;
        }
        Editable editable = getEditable();
        C24132 c24132 = this.f51568;
        c24132.m54015();
        try {
            BaseInputConnection.removeComposingSpans(editable);
            return true;
        } finally {
            c24132.m54008();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        if (m37819()) {
            return super.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (m37819()) {
            return super.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        int iM54099 = i;
        int iM540910 = i2;
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (!m37819()) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (iM54099 == 1 && iM540910 == 1 && jUptimeMillis - this.f51565 < 100) {
                iM54099 = this.f51563 + 1;
                iM540910 = iM54099;
            } else {
                C1207 c1207 = this.f51567;
                if (c1207 != null && jUptimeMillis - this.f51566 < 100) {
                    int i3 = c1207.f4382;
                    int i4 = c1207.f4384;
                    int i5 = c1207.f4381;
                    int i6 = c1207.f4378;
                    if (i5 != 0 && (Math.abs(iM54099 - i3) < 10 || Math.abs(iM54099 - i4) < 10)) {
                        iM54099 += i5;
                    } else if (iM54099 == i5 + i6 || iM54099 == i6) {
                        iM54099 = c24132.m54099();
                    }
                    if (i5 != 0 && (Math.abs(iM540910 - i3) < 10 || Math.abs(iM540910 - i4) < 10)) {
                        iM540910 += i5;
                    } else if (iM540910 == i5 + i6 || iM540910 == i6) {
                        iM540910 = c24132.m54099();
                    }
                }
            }
            if (!super.setSelection(iM54099, iM540910)) {
                return false;
            }
            if (iM54099 == iM540910) {
                c24132.m53880();
            }
            c24132.m53935(iM540910, false);
            if (jUptimeMillis - this.f51569 >= 100) {
                return true;
            }
            c24132.m54091(false);
            return true;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        if (m37819()) {
            return super.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m37819()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        if (m37819()) {
            return super.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (m37819()) {
            return super.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if (!m37818() || i < 0 || i > 3) {
            return false;
        }
        this.f51568.m53950(i, 0);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (m37819()) {
            return super.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (m37819()) {
                return super.setComposingText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2, TextAttribute textAttribute) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (m37819()) {
                return setComposingRegion(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        try {
            if (m37819()) {
                return super.commitText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C24219 e) {
            if (c24132.m53943(interfaceC19106M54021, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performSpellCheck() {
        if (m37819()) {
            return super.performSpellCheck();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (m37819()) {
            super.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (m37819()) {
            return super.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i, int i2) {
        if (!m37818() || i < 0 || i > 3) {
            return false;
        }
        this.f51568.m53950(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void requestTextBoundsInfo(RectF rectF, Executor executor, Consumer consumer) {
        if (m37819()) {
            super.requestTextBoundsInfo(rectF, executor, consumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z) {
        if (m37819()) {
            return super.setImeConsumesInput(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m37817(int i, int i2) {
        C1207 c1207 = this.f51567;
        if (c1207 == null) {
            return 0;
        }
        C24132 c24132 = this.f51568;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        return c1207.m4422(i, i2, c24132.m53968(), c24132.m53882(), c24132.m54099(), interfaceC19106M54021, interfaceC19106M54021.mo15344());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m37819() {
        return this.f51568.m54053(this.f51564);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37818() {
        return this.f51568.m54092(this.f51564);
    }
}
