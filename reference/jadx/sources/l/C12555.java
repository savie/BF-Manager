package l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12555 extends C6590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23744 f40322;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f40323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40324 = true;

    public C12555(TextView textView) {
        this.f40323 = textView;
        this.f40322 = new C23744(textView);
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final void mo18513(boolean z) {
        if (z) {
            TextView textView = this.f40323;
            textView.setTransformationMethod(mo18512(textView.getTransformationMethod()));
        }
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final InputFilter[] mo18515(InputFilter[] inputFilterArr) {
        if (this.f40324) {
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                C23744 c23744 = this.f40322;
                if (i < length) {
                    if (inputFilterArr[i] == c23744) {
                        return inputFilterArr;
                    }
                    i++;
                } else {
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                    inputFilterArr2[length] = c23744;
                    return inputFilterArr2;
                }
            }
        } else {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C23744) {
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

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final TransformationMethod mo18512(TransformationMethod transformationMethod) {
        if (this.f40324) {
            return ((transformationMethod instanceof C18522) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C18522(transformationMethod);
        }
        return transformationMethod instanceof C18522 ? ((C18522) transformationMethod).m43106() : transformationMethod;
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18516(boolean z) {
        this.f40324 = z;
        TextView textView = this.f40323;
        textView.setTransformationMethod(mo18512(textView.getTransformationMethod()));
        textView.setFilters(mo18515(textView.getFilters()));
    }

    @Override // l.C6590
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18514() {
        return this.f40324;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31231(boolean z) {
        this.f40324 = z;
    }
}
