package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۟ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7172 implements InterfaceC9995 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f23959;

    @Override // l.InterfaceC9995
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo19102() {
        return this;
    }

    public C7172(String str) {
        this.f23959 = str;
    }

    @Override // l.InterfaceC9995
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19103(CharSequence charSequence, int i, int i2, C4432 c4432) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f23959)) {
            return true;
        }
        c4432.m12367();
        return false;
    }
}
