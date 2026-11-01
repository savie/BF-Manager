package l;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.۠֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7818 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f25731;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f25732;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19107 f25733;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25734;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f25735;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f25736;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f25737;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25738;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25739;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7818(C19107 c19107) {
        super(c19107, true);
        this.f25733 = c19107;
        this.f25735 = c19107.f61701;
        this.f25736 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m20615() {
        if (this.f25738) {
            return false;
        }
        int i = this.f25735;
        C19107 c19107 = this.f25733;
        if (i != c19107.f61701) {
            return false;
        }
        c19107.f61720 = this;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        C19107 c19107 = this.f25733;
        if (this.f25738) {
            return;
        }
        try {
            if (c19107.f61720 == this && this.f25735 == c19107.f61701) {
                finishComposingText();
            }
        } finally {
            this.f25738 = true;
            if (c19107.f61720 == this) {
                c19107.f61720 = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                super.closeConnection();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m20620() {
        if (this.f25736.length() == 0) {
            return;
        }
        getEditable().delete(0, this.f25736.length());
        this.f25736 = "";
        this.f25731 = false;
        if (this.f25734 == 0) {
            m20612();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20614(C7818 c7818, int i, int i2) {
        if (c7818.f25732) {
            return;
        }
        if (i == 67 && i2 == 0 && c7818.f25736.length() > 0) {
            int iOffsetByCodePoints = Character.offsetByCodePoints(c7818.getEditable(), c7818.f25736.length(), -1);
            c7818.getEditable().delete(iOffsetByCodePoints, c7818.f25736.length());
            c7818.f25736 = c7818.f25736.substring(0, iOffsetByCodePoints);
            if (c7818.f25734 == 0) {
                c7818.m20612();
                return;
            }
            return;
        }
        c7818.m20620();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20613(int i, String str) {
        int codePoint;
        boolean z;
        int i2;
        int i3;
        int i4;
        C19107 c19107 = this.f25733;
        if (c19107.f61720 != this) {
            return;
        }
        int iMin = Math.min(this.f25736.length(), str.length());
        int i5 = 0;
        while (i5 < iMin && this.f25736.charAt(i5) == str.charAt(i5)) {
            i5++;
        }
        if (i5 > 0 && Character.isHighSurrogate(this.f25736.charAt(i5 - 1))) {
            i5--;
        }
        String strSubstring = str.substring(i5);
        this.f25737 = true;
        this.f25739 = false;
        this.f25732 = true;
        try {
            String str2 = this.f25736;
            int iCodePointCount = str2.codePointCount(i5, str2.length()) + i;
            for (int i6 = 0; i6 < iCodePointCount; i6++) {
                c19107.m43906(67, 0);
            }
            int length = strSubstring.length();
            int i7 = 0;
            while (i7 < length && c19107.f61720 == this) {
                char cCharAt = strSubstring.charAt(i7);
                if (Character.isHighSurrogate(cCharAt)) {
                    i7++;
                    if (i7 < length) {
                        codePoint = cCharAt;
                        codePoint = Character.toCodePoint(cCharAt, strSubstring.charAt(i7));
                    } else {
                        codePoint = cCharAt;
                        codePoint = 65533;
                    }
                }
                codePoint = cCharAt;
                if (codePoint > 31 || codePoint == 27) {
                    z = false;
                    i2 = codePoint;
                } else {
                    if (codePoint == 10) {
                        i3 = codePoint;
                        i3 = 13;
                    }
                    switch (i3) {
                        case 28:
                            i4 = 92;
                            break;
                        case 29:
                            i4 = 93;
                            break;
                        case 30:
                            i4 = 94;
                            break;
                        case 31:
                            i4 = 95;
                            break;
                        default:
                            i4 = i3 + 96;
                            break;
                    }
                    z = true;
                    i2 = i4;
                }
                c19107.m43878(i2, z, false);
                i7++;
            }
            this.f25737 = false;
            this.f25732 = false;
            if (c19107.f61720 != this) {
                return;
            }
            this.f25736 = str;
            if (this.f25739) {
                m20620();
                return;
            }
            for (int i8 = 0; i8 < strSubstring.length(); i8++) {
                if (strSubstring.charAt(i8) < ' ' || strSubstring.charAt(i8) == 127) {
                    m20620();
                    return;
                }
            }
            int length2 = this.f25736.length();
            int i9 = length2 - 2048;
            if (i9 <= 0 || BaseInputConnection.getComposingSpanStart(getEditable()) >= 0) {
                return;
            }
            if (Character.isLowSurrogate(getEditable().charAt(i9))) {
                i9 = length2 - 2047;
            }
            getEditable().delete(0, i9);
            this.f25736 = this.f25736.substring(i9);
        } catch (Throwable th) {
            this.f25737 = false;
            this.f25732 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m20612() {
        C19107 c19107 = this.f25733;
        if (c19107.f61720 != this) {
            return;
        }
        Editable editable = getEditable();
        InputMethodManager inputMethodManager = (InputMethodManager) c19107.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.updateSelection(c19107, Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable), BaseInputConnection.getComposingSpanStart(editable), BaseInputConnection.getComposingSpanEnd(editable));
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            boolean composingText = super.setComposingText(charSequence, i);
            if (this.f25731) {
                m20613(0, getEditable().toString());
            }
            if (BaseInputConnection.getComposingSpanStart(getEditable()) < 0) {
                this.f25731 = false;
            }
            return composingText;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = false;
        if (!m20615()) {
            return false;
        }
        boolean composingRegion = super.setComposingRegion(i, i2);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        if (composingSpanStart >= 0 && composingSpanStart < this.f25736.length()) {
            z = true;
        }
        this.f25731 = z;
        return composingRegion;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m20618() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        return composingSpanStart < 0 ? this.f25736.length() : Math.min(composingSpanStart, this.f25736.length());
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            return super.setSelection(Math.max(i, m20618()), Math.max(i2, m20618()));
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m20615()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m20615()) {
            return false;
        }
        this.f25734++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i;
        if (this.f25738) {
            return false;
        }
        if (this.f25735 != this.f25733.f61701 || (i = this.f25734) == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f25734 = i2;
        if (i2 == 0) {
            Editable editable = getEditable();
            int iM20618 = m20618();
            if (Selection.getSelectionStart(editable) < iM20618 || Selection.getSelectionEnd(editable) < iM20618) {
                Selection.setSelection(editable, iM20618);
            }
            m20612();
        }
        return this.f25734 > 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m20616(i, i2, true);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.finishComposingText();
            this.f25731 = false;
            m20613(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.commitText(charSequence, i);
            this.f25731 = false;
            if (this.f25733.f61714 == null) {
                return true;
            }
            m20613(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return m20616(i, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:15:0x0045, B:17:0x004b, B:19:0x0054, B:18:0x0050), top: B:26:0x0045 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m20616(int i, int i2, boolean z) {
        boolean zDeleteSurroundingTextInCodePoints;
        if (i < 0 || i2 < 0 || !beginBatchEdit()) {
            return false;
        }
        Editable editable = getEditable();
        Object obj = new Object();
        editable.setSpan(obj, this.f25736.length(), this.f25736.length(), 17);
        int iMin = Math.min(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable));
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        if (composingSpanStart >= 0) {
            iMin = Math.min(iMin, composingSpanStart);
        }
        if (z) {
            iMin = Character.codePointCount(editable, 0, iMin);
        }
        if (z) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    zDeleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
                } else {
                    zDeleteSurroundingTextInCodePoints = super.deleteSurroundingText(i, i2);
                }
            } finally {
                editable.removeSpan(obj);
                endBatchEdit();
            }
        } else {
            zDeleteSurroundingTextInCodePoints = super.deleteSurroundingText(i, i2);
        }
        m20613(Math.max(0, i - iMin), editable.subSequence(0, editable.getSpanStart(obj)).toString());
        return zDeleteSurroundingTextInCodePoints;
    }
}
