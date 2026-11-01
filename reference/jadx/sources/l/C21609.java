package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R8WS */
/* JADX INFO: loaded from: classes4.dex */
public class C21609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70084;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f70085;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70086;

    public C21609(C17367 c17367) {
        this.f70085 = c17367.m40458();
        int iM40454 = c17367.m40454();
        this.f70084 = new ArrayList(iM40454);
        this.f70086 = new ArrayList(iM40454);
        for (int i = 0; i < iM40454; i++) {
            this.f70084.add(c17367.m40458());
            this.f70086.add(AbstractC15260.m36535(c17367));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m48319() {
        return this.f70085;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48317() {
        return this.f70086.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m48320(int i) {
        return (String) this.f70084.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15260 m48318(int i) {
        return (AbstractC15260) this.f70086.get(i);
    }
}
