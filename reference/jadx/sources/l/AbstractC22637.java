package l;

import java.util.Random;

/* JADX INFO: renamed from: l.᩺֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: PAX3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22637 extends AbstractC7820 {
    /* JADX INFO: renamed from: ۖ */
    public abstract Random mo43909();

    @Override // l.AbstractC7820
    /* JADX INFO: renamed from: ۙ */
    public final int mo20623() {
        return mo43909().nextInt();
    }

    @Override // l.AbstractC7820
    /* JADX INFO: renamed from: ܰ */
    public final int mo20624() {
        return mo43909().nextInt(2147418112);
    }
}
