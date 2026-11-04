package l;

import android.graphics.Point;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14T3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 f9223;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Point f9224;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC2805 mo9275(AbstractC2805 abstractC2805);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9277(StringBuilder sb, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo9278(ArrayList arrayList) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9279(C6178 c6178);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9280(C9516 c9516);

    public AbstractC2805(AbstractC2805 abstractC2805) {
        this.f9223 = abstractC2805;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2805 m9274(AbstractC2805 abstractC2805, C20348 c20348) {
        AbstractC2805 c16800;
        int iM46750 = c20348.m46750();
        switch (iM46750) {
            case 20224:
                c16800 = new C16800(c20348);
                break;
            case 20225:
                c16800 = new C13466(abstractC2805, c20348);
                break;
            case 20226:
                c16800 = new C6009(abstractC2805, c20348);
                break;
            case 20227:
                c16800 = new C22022(abstractC2805, c20348);
                break;
            case 20228:
                c16800 = new C14278(abstractC2805, c20348);
                break;
            case 20229:
                c16800 = new C22417(abstractC2805, c20348);
                break;
            case 20230:
                c16800 = new C15308(abstractC2805, c20348);
                break;
            case 20231:
                c16800 = new C19784(abstractC2805, c20348);
                break;
            default:
                c16800 = null;
                break;
        }
        if (c16800 != null) {
            return c16800;
        }
        throw new RuntimeException(C13645.m33382(iM46750, "Unknown syntax item type: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16800 mo9276() {
        return this.f9223.mo9276();
    }
}
