package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8WS */
/* JADX INFO: loaded from: classes.dex */
public class C22861 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74297;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f74298;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f74299;

    public C22861(C20348 c20348) {
        this.f74298 = c20348.m46758();
        int iM46741 = c20348.m46741();
        this.f74297 = new ArrayList(iM46741);
        this.f74299 = new ArrayList(iM46741);
        for (int i = 0; i < iM46741; i++) {
            this.f74297.add(c20348.m46758());
            this.f74299.add(AbstractC10926.m27728(c20348));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m51583() {
        return this.f74298;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51581() {
        return this.f74299.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m51584(int i) {
        return (String) this.f74297.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10926 m51582(int i) {
        return (AbstractC10926) this.f74299.get(i);
    }
}
