package l;

import android.graphics.Typeface;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.editor.TextEditor;
import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩻֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes.dex */
public final class C24703 implements TextEditor {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f79918;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24132 f79919;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f79920;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10375 f79921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f79922;

    public C24703(C24132 c24132) {
        this.f79919 = c24132;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showCursor() {
        this.f79919.m53880();
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
        if (this.f79920) {
            C10375 c10375 = this.f79921;
            c10375.delete(i, i2);
            c10375.m26682(i, i3, i4, charSequence);
            return;
        }
        this.f79919.m54021().replace(i, i2, charSequence, i3, i4);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m55057(C24703 c24703) {
        if (!c24703.f79920 || c24703.f79921.m26684() == 0) {
            return;
        }
        c24703.f79921.m26683();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i, boolean z) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m53935(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i, boolean z) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m54074(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible(boolean z) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m54077(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter(boolean z) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m53984(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getAnotherBracketPosition() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        int iM53968 = c24132.m53968();
        if (iM53968 == c24132.m53882()) {
            return c24132.f78029.m40498(iM53968);
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getBracketPositions() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        int iM53968 = c24132.m53968();
        if (iM53968 == c24132.m53882()) {
            return c24132.f78029.m40511(iM53968);
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final BufferedText getBufferedText() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return new C11276(this);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean getLineColumnFromPosition(int i, int[] iArr) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m53936(i, iArr);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getLineColumnFromPosition(int i) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        int[] iArr = new int[2];
        if (this.f79919.m53936(i, iArr)) {
            return iArr;
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPositionFromLineColumn(int i, int i2) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m53977(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionEnd() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m53882();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionStart() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m53968();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSelectedText() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        int iM53968 = c24132.m53968();
        int iM53882 = c24132.m53882();
        if (iM53968 == iM53882) {
            return "";
        }
        if (iM53968 < iM53882) {
            return subText(iM53968, iM53882);
        }
        return subText(iM53882, iM53968);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionEnd() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        return Math.max(c24132.m53968(), c24132.m53882());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionStart() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        return Math.min(c24132.m53968(), c24132.m53882());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean hasTextSelected() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        C24132 c24132 = this.f79919;
        return c24132.m53968() != c24132.m53882();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int length() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m54099();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void pushSelectionToUndoBuffer() {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m54091(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.mo52339(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i, int i2) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.mo52316(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String subText(int i, int i2) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        return this.f79919.m54021().mo15351(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void switchToPage(int i, ResultCallback resultCallback) {
        if (this.f79920 && this.f79921.m26684() != 0) {
            this.f79921.m26683();
        }
        this.f79919.m54098().mo25791(i, resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void startLargeBatchEditingMode() {
        if (this.f79920) {
            throw new IllegalStateException();
        }
        this.f79920 = true;
        C24132 c24132 = this.f79919;
        this.f79918 = c24132.m54021();
        this.f79921 = new C1582(this, c24132.m54021());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void finishLargeBatchEditingMode() {
        C24132 c24132 = this.f79919;
        if (!this.f79920) {
            throw new IllegalStateException();
        }
        try {
            this.f79922 = true;
            this.f79921.m26683();
        } finally {
            this.f79922 = false;
            this.f79921 = null;
            this.f79920 = false;
            if (c24132.m54021() == this.f79918 && c24132.f78013) {
                c24132.m53987();
            }
            this.f79918 = null;
        }
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isPaginationMode() {
        return this.f79919.m54098().mo25792();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPageCount() {
        return this.f79919.m54098().mo25793();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getCurrentPageIndex() {
        return this.f79919.m54098().mo25790();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isReadOnly() {
        return this.f79919.m54083();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getTabSize() {
        return this.f79919.f78066.m16214();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isIndentWithTabs() {
        return this.f79919.m54049();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu() {
        this.f79919.m53956(-1);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu(int i) {
        if (i < -1) {
            i = -1;
        }
        this.f79919.m53956(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getHighlightColorAt(int i) {
        C24132 c24132 = this.f79919;
        int iM54099 = c24132.m54099();
        if (i < 0 || i >= iM54099) {
            throw new IndexOutOfBoundsException(C6934.m19217("Index: ", i, iM54099, ", Length: "));
        }
        return c24132.m53891(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSyntaxName() {
        return this.f79919.f78033.m4810();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final Typeface getTypeface() {
        return this.f79919.f78066.f18967.getTypeface();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFileName() {
        return this.f79919.m54098().mo4583();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFilePath() {
        return this.f79919.m54098().mo10079();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isChanged() {
        return this.f79919.m54098().mo4582();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void save(ResultCallback resultCallback) {
        this.f79919.m54098().mo4581(resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isFocused() {
        return this.f79919.isFocused();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocus() {
        return this.f79919.requestFocus();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocusAndShowIME() {
        C24132 c24132 = this.f79919;
        if (!c24132.isFocusable() || !c24132.isEnabled() || c24132.m54083() || c24132.getVisibility() != 0) {
            return false;
        }
        if (c24132.isAttachedToWindow() && c24132.isLaidOut()) {
            C21576.m49076(c24132);
            return true;
        }
        C21576.m49090(c24132);
        return true;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isEditTextView() {
        return this.f79919 instanceof C23255;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSyntaxStyleColor(String str) {
        C24132 c24132 = this.f79919;
        C1314 c1314 = c24132.f78033;
        C14540 c14540 = c24132.f78066;
        if (c14540.f45755 && c1314.m4816()) {
            return c1314.m4817().m39679(C17941.m41876(str)).m30045();
        }
        return c14540.m16212();
    }
}
