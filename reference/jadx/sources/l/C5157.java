package l;

import android.graphics.Typeface;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.editor.TextEditor;
import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ۚۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5157 implements TextEditor {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f17901;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f17902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6111 f17903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16031 f17904;

    public C5157(C6111 c6111) {
        this.f17903 = c6111;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showCursor() {
        this.f17903.m16835();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i) {
        ensurePositionVisible(i, false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i) {
        ensurePositionVisibleInCenter(i, false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible() {
        ensureSelectionVisible(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter() {
        ensureSelectionVisibleInCenter(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f17901) {
            C16031 c16031 = this.f17904;
            c16031.delete(i, i2);
            c16031.m38022(i, i3, i4, charSequence);
            return;
        }
        this.f17903.m17000().replace(i, i2, charSequence, i3, i4);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void deleteText(int i, int i2) {
        replaceText(i, i2, "", 0, 0);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence) {
        replaceText(i, i2, charSequence, 0, charSequence.length());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void insertText(int i, CharSequence charSequence) {
        replaceText(i, i, charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m14304(C5157 c5157) {
        if (!c5157.f17901 || c5157.f17904.m38021() == 0) {
            return;
        }
        c5157.f17904.m38023();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i, boolean z) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m16890(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i, boolean z) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m16988(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible(boolean z) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m16992(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter(boolean z) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m16963(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getAnotherBracketPosition() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        int iM16916 = c6111.m16916();
        if (iM16916 == c6111.m17020()) {
            return c6111.f20710.m3661(iM16916);
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getBracketPositions() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        int iM16916 = c6111.m16916();
        if (iM16916 == c6111.m17020()) {
            return c6111.f20710.m3672(iM16916);
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final BufferedText getBufferedText() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return new C2334(this);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean getLineColumnFromPosition(int i, int[] iArr) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m16891(i, iArr);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getLineColumnFromPosition(int i) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        int[] iArr = new int[2];
        if (this.f17903.m16891(i, iArr)) {
            return iArr;
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPositionFromLineColumn(int i, int i2) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m16955(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionEnd() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m17020();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionStart() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m16916();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSelectedText() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        int iM16916 = c6111.m16916();
        int iM17020 = c6111.m17020();
        if (iM16916 == iM17020) {
            return "";
        }
        if (iM16916 < iM17020) {
            return subText(iM16916, iM17020);
        }
        return subText(iM17020, iM16916);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionEnd() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        return Math.max(c6111.m16916(), c6111.m17020());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionStart() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        return Math.min(c6111.m16916(), c6111.m17020());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean hasTextSelected() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        C6111 c6111 = this.f17903;
        return c6111.m16916() != c6111.m17020();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int length() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m16842();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void pushSelectionToUndoBuffer() {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m16827(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.mo17029(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i, int i2) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.mo16839(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String subText(int i, int i2) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        return this.f17903.m17000().mo2396(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void switchToPage(int i, ResultCallback resultCallback) {
        if (this.f17901 && this.f17904.m38021() != 0) {
            this.f17904.m38023();
        }
        this.f17903.m17008().mo15467(i, resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void startLargeBatchEditingMode() {
        if (this.f17901) {
            throw new IllegalStateException();
        }
        this.f17901 = true;
        C6111 c6111 = this.f17903;
        this.f17902 = c6111.m17000();
        this.f17904 = new C11508(this, c6111.m17000());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void finishLargeBatchEditingMode() {
        C6111 c6111 = this.f17903;
        if (!this.f17901) {
            throw new IllegalStateException();
        }
        try {
            this.f17904.m38023();
        } finally {
            this.f17904 = null;
            this.f17901 = false;
            if (c6111.m17000() == this.f17902 && c6111.f20787) {
                c6111.m16833();
            }
            this.f17902 = null;
        }
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isPaginationMode() {
        return this.f17903.m17008().mo15469();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPageCount() {
        return this.f17903.m17008().mo15465();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getCurrentPageIndex() {
        return this.f17903.m17008().mo15466();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isReadOnly() {
        return this.f17903.m17004();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getTabSize() {
        return this.f17903.f20794.m17881();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isIndentWithTabs() {
        return this.f17903.m17014();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu() {
        this.f17903.m16946(-1);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu(int i) {
        if (i < -1) {
            i = -1;
        }
        this.f17903.m16946(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getHighlightColorAt(int i) {
        C6111 c6111 = this.f17903;
        int iM16842 = c6111.m16842();
        if (i < 0 || i >= iM16842) {
            throw new IndexOutOfBoundsException(C2271.m6967("Index: ", i, iM16842, ", Length: "));
        }
        return c6111.m16844(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSyntaxName() {
        return this.f17903.f20770.m32648();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final Typeface getTypeface() {
        return this.f17903.f20794.f22196.getTypeface();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFileName() {
        return this.f17903.m17008().mo7025();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFilePath() {
        return this.f17903.m17008().mo15468();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isChanged() {
        return this.f17903.m17008().mo7024();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void save(ResultCallback resultCallback) {
        this.f17903.m17008().mo7023(resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isFocused() {
        return this.f17903.isFocused();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocus() {
        return this.f17903.requestFocus();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocusAndShowIME() {
        C6111 c6111 = this.f17903;
        if (!c6111.isFocusable() || !c6111.isEnabled() || c6111.m17004() || c6111.getVisibility() != 0) {
            return false;
        }
        if (c6111.isAttachedToWindow() && c6111.isLaidOut()) {
            C16737.m39284(c6111);
            return true;
        }
        C16737.m39290(c6111);
        return true;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isEditTextView() {
        return this.f17903 instanceof C10948;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSyntaxStyleColor(String str) {
        C6111 c6111 = this.f17903;
        C13190 c13190 = c6111.f20770;
        C1590 c1590 = c6111.f20794;
        if (c1590.f6398 && c13190.m32642()) {
            return c13190.m32616().m46955(C16387.m38582(str)).m37379();
        }
        return c1590.m17875();
    }
}
