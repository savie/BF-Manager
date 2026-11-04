package l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.ۡ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48SH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9615 implements InterfaceC6908 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31097;

    public /* synthetic */ C9615(int i, Object obj) {
        this.f31096 = i;
        this.f31097 = obj;
    }

    @Override // l.InterfaceC6908
    public final Object get() {
        int i = this.f31096;
        Object obj = this.f31097;
        switch (i) {
            case 0:
                return C3619.m11741((ContextWrapper) obj);
            default:
                int i2 = C8744.f28446;
                return new C16227(((AbstractC22044) obj).getName());
        }
    }
}
