package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11513 implements Consumer, TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36228 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23255 f36229;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        C23255 c23255 = this.f36229;
        InterfaceC19106 interfaceC19106M54021 = c23255.m54021();
        int iMax = Math.max(0, c23255.m53968());
        int iMax2 = Math.max(0, c23255.m53882());
        int i = this.f36228;
        if (i >= 0 && iMax == i && iMax2 == i + 1) {
            iMax = i + 2;
            iMax2 = iMax;
        }
        this.f36228 = -1;
        int iMin = Math.min(iMax, iMax2);
        c23255.requestFocus();
        boolean z = str.equals("{N}") || str.equals("{zN}");
        interfaceC19106M54021.replace(iMin, Math.max(iMax, iMax2), z ? str.replace('N', '1') : str);
        if (z) {
            int iIndexOf = str.indexOf(78) + iMin;
            c23255.mo52316(iIndexOf, iIndexOf + 1);
            this.f36228 = iIndexOf;
            return;
        }
        c23255.mo52339(str.length() + iMin);
    }

    public C11513(C23255 c23255) {
        this.f36229 = c23255;
        c23255.m53899(this);
        c23255.m53913(new InterfaceC11886() { // from class: l.֫ۡᩴ
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i, int i2) {
                C11513.m28968(this.f6170, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28968(C11513 c11513, int i, int i2) {
        int i3 = c11513.f36228;
        if (i == i3 && i2 == i3 + 1) {
            return;
        }
        c11513.f36228 = -1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f36228 = -1;
    }
}
