package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6JA */
/* JADX INFO: loaded from: classes.dex */
public final class C22764 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19780 f73867;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f73868;

    public C22764(C19780 c19780, String str) {
        this.f73867 = c19780;
        this.f73868 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f73866) {
            return;
        }
        this.f73866 = true;
        C19780 c19780 = this.f73867;
        HashMap map = c19780.f63631;
        String str = this.f73868;
        int iIntValue = ((Integer) map.get(str)).intValue();
        if (iIntValue == 1) {
            c19780.f63631.remove(str);
        } else {
            c19780.f63631.put(str, Integer.valueOf(iIntValue - 1));
        }
        c19780.m45542();
        c19780.m45539();
        C19780.m45544(c19780);
    }
}
