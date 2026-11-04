package l;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ۖۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2614 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8580 f8387;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8388;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f8389;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f8390;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f8391;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f8392;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f8393;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f8394;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f8395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2614(C8580 c8580) {
        super(c8580, true);
        this.f8387 = c8580;
        this.f8393 = c8580.f28031;
        this.f8390 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8742() {
        if (this.f8394) {
            return false;
        }
        int i = this.f8393;
        C8580 c8580 = this.f8387;
        if (i != c8580.f28031) {
            return false;
        }
        c8580.f28022 = this;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        C8580 c8580 = this.f8387;
        if (this.f8394) {
            return;
        }
        try {
            if (c8580.f28022 == this && this.f8393 == c8580.f28031) {
                finishComposingText();
            }
        } finally {
            this.f8394 = true;
            if (c8580.f28022 == this) {
                c8580.f28022 = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                super.closeConnection();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m8747() {
        if (this.f8390.length() == 0) {
            return;
        }
        getEditable().delete(0, this.f8390.length());
        this.f8390 = "";
        this.f8391 = false;
        if (this.f8388 == 0) {
            m8749();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8741(C2614 c2614, int i, int i2) {
        if (c2614.f8395) {
            return;
        }
        if (i == 67 && i2 == 0 && c2614.f8390.length() > 0) {
            int iOffsetByCodePoints = Character.offsetByCodePoints(c2614.getEditable(), c2614.f8390.length(), -1);
            c2614.getEditable().delete(iOffsetByCodePoints, c2614.f8390.length());
            c2614.f8390 = c2614.f8390.substring(0, iOffsetByCodePoints);
            if (c2614.f8388 == 0) {
                c2614.m8749();
                return;
            }
            return;
        }
        c2614.m8747();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8740(int i, String str) {
        int codePoint;
        boolean z;
        int i2;
        int i3;
        int i4;
        C8580 c8580 = this.f8387;
        if (c8580.f28022 != this) {
            return;
        }
        int iMin = Math.min(this.f8390.length(), str.length());
        int i5 = 0;
        while (i5 < iMin && this.f8390.charAt(i5) == str.charAt(i5)) {
            i5++;
        }
        if (i5 > 0 && Character.isHighSurrogate(this.f8390.charAt(i5 - 1))) {
            i5--;
        }
        String strSubstring = str.substring(i5);
        this.f8389 = true;
        this.f8392 = false;
        this.f8395 = true;
        try {
            String str2 = this.f8390;
            int iCodePointCount = str2.codePointCount(i5, str2.length()) + i;
            for (int i6 = 0; i6 < iCodePointCount; i6++) {
                c8580.m23064(67, 0);
            }
            int length = strSubstring.length();
            int i7 = 0;
            while (i7 < length && c8580.f28022 == this) {
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
                c8580.m23036(i2, z, false);
                i7++;
            }
            this.f8389 = false;
            this.f8395 = false;
            if (c8580.f28022 != this) {
                return;
            }
            this.f8390 = str;
            if (this.f8392) {
                m8747();
                return;
            }
            for (int i8 = 0; i8 < strSubstring.length(); i8++) {
                if (strSubstring.charAt(i8) < ' ' || strSubstring.charAt(i8) == 127) {
                    m8747();
                    return;
                }
            }
            int length2 = this.f8390.length();
            int i9 = length2 - 2048;
            if (i9 <= 0 || BaseInputConnection.getComposingSpanStart(getEditable()) >= 0) {
                return;
            }
            if (Character.isLowSurrogate(getEditable().charAt(i9))) {
                i9 = length2 - 2047;
            }
            getEditable().delete(0, i9);
            this.f8390 = this.f8390.substring(i9);
        } catch (Throwable th) {
            this.f8389 = false;
            this.f8395 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m8749() {
        C8580 c8580 = this.f8387;
        if (c8580.f28022 != this) {
            return;
        }
        Editable editable = getEditable();
        InputMethodManager inputMethodManager = (InputMethodManager) c8580.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.updateSelection(c8580, Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable), BaseInputConnection.getComposingSpanStart(editable), BaseInputConnection.getComposingSpanEnd(editable));
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            boolean composingText = super.setComposingText(charSequence, i);
            if (this.f8391) {
                m8740(0, getEditable().toString());
            }
            if (BaseInputConnection.getComposingSpanStart(getEditable()) < 0) {
                this.f8391 = false;
            }
            return composingText;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = false;
        if (!m8742()) {
            return false;
        }
        boolean composingRegion = super.setComposingRegion(i, i2);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        if (composingSpanStart >= 0 && composingSpanStart < this.f8390.length()) {
            z = true;
        }
        this.f8391 = z;
        return composingRegion;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m8745() {
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(getEditable());
        return composingSpanStart < 0 ? this.f8390.length() : Math.min(composingSpanStart, this.f8390.length());
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            return super.setSelection(Math.max(i, m8745()), Math.max(i2, m8745()));
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m8742()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m8742()) {
            return false;
        }
        this.f8388++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i;
        if (this.f8394) {
            return false;
        }
        if (this.f8393 != this.f8387.f28031 || (i = this.f8388) == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f8388 = i2;
        if (i2 == 0) {
            Editable editable = getEditable();
            int iM8745 = m8745();
            if (Selection.getSelectionStart(editable) < iM8745 || Selection.getSelectionEnd(editable) < iM8745) {
                Selection.setSelection(editable, iM8745);
            }
            m8749();
        }
        return this.f8388 > 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m8743(i, i2, true);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!beginBatchEdit()) {
            return false;
        }
        try {
            super.finishComposingText();
            this.f8391 = false;
            m8740(0, getEditable().toString());
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
            this.f8391 = false;
            if (this.f8387.f28020 == null) {
                return true;
            }
            m8740(0, getEditable().toString());
            return true;
        } finally {
            endBatchEdit();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return m8743(i, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:15:0x0045, B:17:0x004b, B:19:0x0054, B:18:0x0050), top: B:26:0x0045 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8743(int i, int i2, boolean z) {
        boolean zDeleteSurroundingTextInCodePoints;
        if (i < 0 || i2 < 0 || !beginBatchEdit()) {
            return false;
        }
        Editable editable = getEditable();
        Object obj = new Object();
        editable.setSpan(obj, this.f8390.length(), this.f8390.length(), 17);
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
        m8740(Math.max(0, i - iMin), editable.subSequence(0, editable.getSpanStart(obj)).toString());
        return zDeleteSurroundingTextInCodePoints;
    }
}
