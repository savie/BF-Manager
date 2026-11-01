package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AWR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11348 implements InterfaceC3459, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f38287;

    public AbstractC11348(int i) {
        this.f38287 = i;
    }

    @Override // l.InterfaceC3459
    /* JADX INFO: renamed from: ᩹ */
    public final int mo10168() {
        return this.f38287;
    }

    public final String toString() {
        String strM31708 = C12759.m31708(this);
        C13465.m32967(strM31708, "renderLambdaToString(...)");
        return strM31708;
    }
}
