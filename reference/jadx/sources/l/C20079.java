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

/* JADX INFO: renamed from: l.᩶ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20079 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f65226;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f65227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f65228;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13729 f65229;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f65230;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6111 f65232;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f65233;

    public C20079(C6111 c6111, int i) {
        super(c6111, true);
        this.f65232 = c6111;
        this.f65230 = i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        if (!m45450()) {
            return null;
        }
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            return super.getTextBeforeCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        if (!m45450()) {
            return null;
        }
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            return super.getTextAfterCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (!m45450()) {
            return null;
        }
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            int iMin = Math.min(c6111.m16916(), c6111.m17020());
            int iMax = Math.max(c6111.m16916(), c6111.m17020());
            if (iMin < 0 || ((long) iMax) - ((long) iMin) <= 10000) {
                return super.getSelectedText(i);
            }
            int i2 = iMin + 10000;
            return (i & 1) != 0 ? interfaceC2916M17000.subSequence(iMin, i2) : TextUtils.substring(interfaceC2916M17000, iMin, i2);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        if (!m45450()) {
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Surrounding text lengths must be nonnegative");
        }
        C6111 c6111 = this.f65232;
        if (Math.abs(((long) c6111.m17020()) - ((long) c6111.m16916())) > 10000) {
            return null;
        }
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            return super.getSurroundingText(Math.min(i, 10000), Math.min(i2, 10000), i3);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        if (!m45450()) {
            return null;
        }
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            return super.takeSnapshot();
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return new C0094(this.f65232, this.f65230);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m45451()) {
            return false;
        }
        this.f65232.m17055();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        if (!m45450()) {
            return false;
        }
        this.f65232.m16817();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        C6111 c6111 = this.f65232;
        if (!m45451()) {
            return false;
        }
        try {
            C6111.f20699.clearMetaKeyState(c6111, getEditable(), i);
            c6111.m16835();
            c6111.invalidate();
            return true;
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        try {
            this.f65232.f20716.remove(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (!m45451()) {
                return false;
            }
            c6111.m17006(i);
            return !c6111.m17004();
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            ExtractedText extractedText = new ExtractedText();
            if (c6111.m16892(extractedTextRequest, extractedText)) {
                if (c6111.m16999()) {
                    InterfaceC2916 interfaceC2916M17001 = c6111.m17000();
                    this.f65229 = new C13729(extractedText.startOffset, extractedText.selectionStart, extractedText.selectionEnd, extractedText.text.length(), c6111.m16916(), c6111.m17020(), c6111.m16842(), interfaceC2916M17001, interfaceC2916M17001.mo2395());
                    this.f65233 = SystemClock.uptimeMillis();
                    return extractedText;
                }
                this.f65229 = null;
                return extractedText;
            }
            this.f65229 = null;
            return null;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (!m45451()) {
                return false;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f65227 = jUptimeMillis;
            if (charSequence.length() == 0 && i == 1 && c6111.m16916() != c6111.m17020()) {
                this.f65228 = jUptimeMillis;
            }
            C13729 c13729 = this.f65229;
            if (c13729 != null && c13729.f45260 > 0 && charSequence.length() == 2 && i == 1) {
                this.f65226 = jUptimeMillis;
                this.f65231 = c6111.m16916();
            }
            return super.commitText(charSequence, i);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return super.setComposingText(charSequence, i);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return super.replaceText(i, i2, charSequence, i3, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (!m45451()) {
                return false;
            }
            if (i == 1 && i2 == 0 && SystemClock.uptimeMillis() - this.f65228 < 100) {
                return false;
            }
            return super.deleteSurroundingText(i, i2);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return super.deleteSurroundingTextInCodePoints(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (!m45451()) {
                return false;
            }
            int iM45449 = m45449(i, i2);
            if (iM45449 != 0) {
                i += iM45449;
                i2 += iM45449;
            }
            return super.setComposingRegion(i, i2);
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!m45450()) {
            return false;
        }
        Editable editable = getEditable();
        C6111 c6111 = this.f65232;
        c6111.m17055();
        try {
            BaseInputConnection.removeComposingSpans(editable);
            return true;
        } finally {
            c6111.m16817();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        if (m45451()) {
            return super.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (m45451()) {
            return super.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        int iM16842 = i;
        int iM16843 = i2;
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (!m45451()) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (iM16842 == 1 && iM16843 == 1 && jUptimeMillis - this.f65226 < 100) {
                iM16842 = this.f65231 + 1;
                iM16843 = iM16842;
            } else {
                C13729 c13729 = this.f65229;
                if (c13729 != null && jUptimeMillis - this.f65233 < 100) {
                    int i3 = c13729.f45256;
                    int i4 = c13729.f45253;
                    int i5 = c13729.f45260;
                    int i6 = c13729.f45258;
                    if (i5 != 0 && (Math.abs(iM16842 - i3) < 10 || Math.abs(iM16842 - i4) < 10)) {
                        iM16842 += i5;
                    } else if (iM16842 == i5 + i6 || iM16842 == i6) {
                        iM16842 = c6111.m16842();
                    }
                    if (i5 != 0 && (Math.abs(iM16843 - i3) < 10 || Math.abs(iM16843 - i4) < 10)) {
                        iM16843 += i5;
                    } else if (iM16843 == i5 + i6 || iM16843 == i6) {
                        iM16843 = c6111.m16842();
                    }
                }
            }
            if (!super.setSelection(iM16842, iM16843)) {
                return false;
            }
            if (iM16842 == iM16843) {
                c6111.m16835();
            }
            c6111.m16890(iM16843, false);
            if (jUptimeMillis - this.f65227 >= 100) {
                return true;
            }
            c6111.m16827(false);
            return true;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        if (m45451()) {
            return super.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m45451()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        if (m45451()) {
            return super.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (m45451()) {
            return super.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if (!m45450() || i < 0 || i > 3) {
            return false;
        }
        this.f65232.m16812(i, 0);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (m45451()) {
            return super.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return super.setComposingText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2, TextAttribute textAttribute) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return setComposingRegion(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        try {
            if (m45451()) {
                return super.commitText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C18188 e) {
            if (c6111.m16894(interfaceC2916M17000, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performSpellCheck() {
        if (m45451()) {
            return super.performSpellCheck();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (m45451()) {
            super.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (m45451()) {
            return super.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i, int i2) {
        if (!m45450() || i < 0 || i > 3) {
            return false;
        }
        this.f65232.m16812(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void requestTextBoundsInfo(RectF rectF, Executor executor, Consumer consumer) {
        if (m45451()) {
            super.requestTextBoundsInfo(rectF, executor, consumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z) {
        if (m45451()) {
            return super.setImeConsumesInput(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m45449(int i, int i2) {
        C13729 c13729 = this.f65229;
        if (c13729 == null) {
            return 0;
        }
        C6111 c6111 = this.f65232;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        return c13729.m33429(i, i2, c6111.m16916(), c6111.m17020(), c6111.m16842(), interfaceC2916M17000, interfaceC2916M17000.mo2395());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m45451() {
        return this.f65232.m16908(this.f65230);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m45450() {
        return this.f65232.m16828(this.f65230);
    }
}
