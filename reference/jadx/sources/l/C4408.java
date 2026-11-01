package l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۙۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4408 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f15699;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f15700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f15702;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C4408(boolean z) {
        this.f15702 = z;
        this.f15699 = z ? 19 : 16;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            this.f15700 = true;
            this.f15701 = i;
        } else {
            this.f15700 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        char cCharAt;
        boolean z = this.f15700;
        int i = this.f15699;
        if (z) {
            if (editable.length() >= this.f15701 + 2 && editable.length() > i) {
                char cCharAt2 = editable.charAt(this.f15701 + 1);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    int i2 = this.f15701;
                    editable.delete(i2, i2 + 1);
                    Selection.setSelection(editable, this.f15701 + 1);
                } else {
                    int i3 = this.f15701;
                    editable.delete(i3 + 1, i3 + 2);
                    int length = editable.length();
                    int i4 = this.f15701;
                    if (length >= i4 + 2 && ((cCharAt = editable.charAt(i4 + 1)) < '0' || cCharAt > '9')) {
                        Selection.setSelection(editable, this.f15701 + 2);
                    }
                }
            } else if ((this.f15701 == 3 && editable.length() == 4) || (this.f15701 == 6 && editable.length() == 7)) {
                editable.append('-');
            } else if (this.f15701 == 9 && editable.length() == 10) {
                editable.append(' ');
            } else if ((this.f15701 == 12 && editable.length() == 13) || (this.f15702 && this.f15701 == 15 && editable.length() == 16)) {
                editable.append(':');
            }
        }
        if (editable.length() > i) {
            editable.delete(i, editable.length());
        }
    }
}
