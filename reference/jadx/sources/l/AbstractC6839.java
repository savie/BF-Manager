package l;

import android.graphics.Point;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14T3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6839 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 f23037;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Point f23038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC6839 mo18441(AbstractC6839 abstractC6839);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo18443(StringBuilder sb, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo18444(ArrayList arrayList) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo18445(C4016 c4016);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo18446(C11018 c11018);

    public AbstractC6839(AbstractC6839 abstractC6839) {
        this.f23037 = abstractC6839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6839 m18440(AbstractC6839 abstractC6839, C17367 c17367) {
        AbstractC6839 c20889;
        int iM40444 = c17367.m40444();
        switch (iM40444) {
            case 20224:
                c20889 = new C20889(c17367);
                break;
            case 20225:
                c20889 = new C10037(abstractC6839, c17367);
                break;
            case 20226:
                c20889 = new C7214(abstractC6839, c17367);
                break;
            case 20227:
                c20889 = new C21594(abstractC6839, c17367);
                break;
            case 20228:
                c20889 = new C14189(abstractC6839, c17367);
                break;
            case 20229:
                c20889 = new C17797(abstractC6839, c17367);
                break;
            case 20230:
                c20889 = new C19478(abstractC6839, c17367);
                break;
            case 20231:
                c20889 = new C8189(abstractC6839, c17367);
                break;
            default:
                c20889 = null;
                break;
        }
        if (c20889 != null) {
            return c20889;
        }
        throw new RuntimeException(C8479.m22141(iM40444, "Unknown syntax item type: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20889 mo18442() {
        return this.f23037.mo18442();
    }
}
