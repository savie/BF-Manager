package l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20661 extends C15723 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8667 f67245;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f67246;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f67247 = true;

    public C20661(TextView textView) {
        this.f67246 = textView;
        this.f67245 = new C8667(textView);
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final void mo37446(boolean z) {
        if (z) {
            TextView textView = this.f67246;
            textView.setTransformationMethod(mo37445(textView.getTransformationMethod()));
        }
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final InputFilter[] mo37448(InputFilter[] inputFilterArr) {
        if (this.f67247) {
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                C8667 c8667 = this.f67245;
                if (i < length) {
                    if (inputFilterArr[i] == c8667) {
                        return inputFilterArr;
                    }
                    i++;
                } else {
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                    inputFilterArr2[length] = c8667;
                    return inputFilterArr2;
                }
            }
        } else {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C8667) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr3[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr3;
        }
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final TransformationMethod mo37445(TransformationMethod transformationMethod) {
        if (this.f67247) {
            return ((transformationMethod instanceof C17133) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C17133(transformationMethod);
        }
        return transformationMethod instanceof C17133 ? ((C17133) transformationMethod).m40039() : transformationMethod;
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ܰ */
    public final void mo37449(boolean z) {
        this.f67247 = z;
        TextView textView = this.f67246;
        textView.setTransformationMethod(mo37445(textView.getTransformationMethod()));
        textView.setFilters(mo37448(textView.getFilters()));
    }

    @Override // l.C15723
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37447() {
        return this.f67247;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46513(boolean z) {
        this.f67247 = z;
    }
}
